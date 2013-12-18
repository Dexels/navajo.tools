
package com.dexels.navajo.dsl.tsl;

import java.io.StringReader;

import javax.inject.Inject;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;

import com.dexels.navajo.dsl.tsl.formatting.TslFormatter;
import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class TslStandaloneSetup extends TslStandaloneSetupGenerated{
	@Inject
    private IParser parser;
 
	public static TslStandaloneSetup doSetup() {
		TslStandaloneSetup tslStandaloneSetup = new TslStandaloneSetup();
		Injector ij = tslStandaloneSetup.createInjectorAndDoEMFRegistration();
//		InjectionTest i = ij.getInstance(InjectionTest.class);
//		i.doSomething();
		//		ij.getInstance(Class<? extends IFormatter>)
		ij.getInstance(TslFormatter.class);
		ij.injectMembers(tslStandaloneSetup);
		return tslStandaloneSetup;
	}

	public static void main(String[] args) {
		TslStandaloneSetup s = doSetup();
		String input = "<tsl><map.monkey aap=\"1\"/> </tsl>";
		StringReader sr = new StringReader(input);
		IParseResult ipr =  s.parser.parse(sr);
		for(INode i : ipr.getSyntaxErrors()) {
			System.err.println("> "+i.getSyntaxErrorMessage().getMessage());
		}
		
		System.err.println("ste? "+ipr.hasSyntaxErrors());
		
		String name = "Gorilla";
		
	}
	
}

