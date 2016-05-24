package com.dexels.navajo.metrics;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.bson.Document;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.LogCommand;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.NoHeadException;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;

import com.dexels.navajo.dependency.Dependency;
import com.dexels.navajo.metrics.dependency.DependencyAnalyzer;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

public class WebservicesMetrics {
    private static final List<String> SUPPORTED_EXTENSIONS = Arrays.asList(".xml", ".scala");
    private MongoDatabase db;
    private DependencyAnalyzer depanaylzer;
    private Git git;
    private Date lastCommitThreshold;
    
    public WebservicesMetrics() {
        List<String> unused = new ArrayList<>();
        
        depanaylzer = new DependencyAnalyzer();
        depanaylzer.activate();
        
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, -4);
        lastCommitThreshold = cal.getTime();
        
        MongoClient mc = new MongoClient("mongostorage2.sportlink-infra.net:27018");
        db = mc.getDatabase("metrics");
        
        File sportlink = new File("/home/chris/git/sportlink");
        File sportlinkScripts = new File(sportlink, "scripts");
        
        // Set up git
        git = new Git(getRepository(sportlink));
        
        Set<String> tenants = getTenants();
        Map<String, Date> scriptsMetrics = getScriptsMetrics(tenants);

        List<File> files = getScripts(sportlinkScripts);
        
        // First add dependencies
        for (File f : files) {
            String path = f.getAbsolutePath();
            String  script = path.split("scripts")[1];
            script =  script.substring(1, script.lastIndexOf(FilenameUtils.getExtension(path)) -1);
            script = script.replace("\\", "/");
            depanaylzer.addDependencies(script);
        }
       
        for (File f : files) {
            String path = f.getAbsolutePath();
            String  script = path.split("scripts")[1];
            script =  script.substring(1, script.lastIndexOf(FilenameUtils.getExtension(path)) -1);
            script = script.replace("\\", "/");
            String tenantlessScript = script;

            if (script.indexOf('_') > 0) {
                int slashIndex = script.lastIndexOf("/");
                
                if (slashIndex != -1) {
                    // Check if the last '_' is after the / part, since a _ might occur in a directory name
                    String bareScript = script.substring(slashIndex + 1);
                    if (bareScript.indexOf('_') != -1) {
                        tenantlessScript = script.substring(0, script.lastIndexOf('_'));
                    }
                } else {
                    tenantlessScript = script.substring(0, script.lastIndexOf('_'));
                }
            }
            
            if (tenantlessScript.contains("Init")) {
                // skip Init scripts
                continue;
            }
            
            // Get last commit
            Long lastCommit = getLastCommitTimestamp(f.getAbsolutePath());
            Date lastCommitDate = new Date(lastCommit);
            if (lastCommitDate.after(lastCommitThreshold)) {
                // Skip due to recent commit
            }
            
            if (!scriptsMetrics.containsKey(tenantlessScript)) {
                // if any thing depends on us, we cannot be removed
                List<Dependency> deps = depanaylzer.getReverseDependencies(tenantlessScript);
                boolean hasIncludes = false;
                for (Dependency dep : deps) {
                    if (dep.getType() == Dependency.INCLUDE_DEPENDENCY || dep.getType() == Dependency.WORKFLOW_DEPENDENCY) {
                        hasIncludes = true;
                    }
                }
                if (hasIncludes) {
                    continue;
                } 
                unused.add(script);
            }
            
        }
        Collections.sort(unused);
        for (String script: unused) {
            System.out.println(script);
        }
        mc.close();
    }

    
    
    private Repository getRepository(File basePath) {
        FileRepositoryBuilder builder = new FileRepositoryBuilder();
        Repository repository = null;
        try {
            repository = builder.setGitDir(new File(basePath, ".git")).readEnvironment().findGitDir().build();
        } catch (IOException e) {

            e.printStackTrace();
        }
        return repository;
    }
    

    /**
     * Returns the last commit timestamp in ms since epoch
     */
    private Long getLastCommitTimestamp(String file) {
        RevCommit lastFileCommit = null;
        try {
            lastFileCommit = getLastCommit(file);
        } catch (NoHeadException e) {
            return (long) 0;
        } catch (GitAPIException e) {
            return (long) 0;
        }
        if (lastFileCommit == null) {
            return new Long(0);
        }
        return new Long(lastFileCommit.getCommitTime()) * 1000;
    }
    

    private RevCommit getLastCommit(String file) throws NoHeadException, GitAPIException {
        LogCommand log = git.log().addPath(file);
        return log.call().iterator().next();
    }
    
    private Map<String, Date> getScriptsMetrics(Set<String> tenants) {
        Map<String, Date> result = new HashMap<>();
        for (String tenant : tenants) {
            MongoCollection<Document> coll = db.getCollection("metrics." + tenant);

            List<Document> pipeline =  new ArrayList<>();
            
            DBObject group = new BasicDBObject();
            group.put("_id",  "$service");
            group.put("lastCall",  new BasicDBObject("$last", "$date"));
            pipeline.add(new Document("$group", group));;
            AggregateIterable<Document> out =coll.aggregate(pipeline);
            
            for (Document doc : out) {
                String script = doc.getString("_id");
                Date lastDate = doc.getDate("lastCall");
                if (!result.containsKey(script) || lastDate.after(result.get(script))) {
                    result.put(script,  lastDate);
                }
            }
        }
        return result;
    }




    private List<File> getScripts(File folder) {
        List<File> result = new ArrayList<>();
        Collection<File> files = FileUtils.listFiles(folder, null, false);

        for (File f : files) {

            if (f.isFile()) {
                String filename = f.getAbsolutePath();
                int dotIdx = filename.lastIndexOf('.');
                if (dotIdx > 0 && SUPPORTED_EXTENSIONS.contains(filename.substring(dotIdx, filename.length()))) {
                    result.add(f);
                }

            }
        }

        String[] directories = folder.list(DirectoryFileFilter.INSTANCE);
        for (int i = 0; i < directories.length; i++) {
            File subdir = new File(folder, directories[i]);
            result.addAll(getScripts(subdir));
        }
        return result;
    }
    
    
    
    private Set<String> getTenants() {
        Set<String> tenants = new HashSet<>();
        
        MongoIterable<String> collectionNames = db.listCollectionNames();
        for (String coll : collectionNames) {
            if (coll.startsWith("metrics")) {
                int lastDot = coll.lastIndexOf('.');
                if (lastDot < 1) {
                    continue;
                }
                tenants.add(coll.substring(lastDot + 1, coll.length()));
            }
        }
        return tenants;
    }
    
    public static void main(String[] args) {
        new WebservicesMetrics();
    }
}
