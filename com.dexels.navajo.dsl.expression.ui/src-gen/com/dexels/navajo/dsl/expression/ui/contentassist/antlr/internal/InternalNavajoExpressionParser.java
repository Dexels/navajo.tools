package com.dexels.navajo.dsl.expression.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.dexels.navajo.dsl.expression.services.NavajoExpressionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNavajoExpressionParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOT", "RULE_PARENT", "RULE_TML_SEPARATOR", "RULE_SQBRACKET_OPEN", "RULE_SQBRACKET_CLOSE", "RULE_TML_EXISTS", "RULE_BRACKET_OPEN", "RULE_BRACKET_CLOSE", "RULE_COMMA", "RULE_PLUS", "RULE_MINUS", "RULE_NOT", "RULE_NUMBER", "RULE_HASH", "RULE_CURLYCLOSE", "RULE_AT", "RULE_DOLLAR", "RULE_OR", "RULE_AND", "RULE_EQUALSEQUALS", "RULE_NEQUALS", "RULE_XML_LT", "RULE_XML_GT", "RULE_XML_LTEQ", "RULE_XML_GTEQ", "RULE_MULTIPLY", "RULE_LITERALSTRING", "RULE_FORALL", "RULE_CURLYOPEN", "RULE_NULL", "RULE_TODAY", "RULE_TRUE", "RULE_FALSE", "RULE_BADNUMBER", "RULE_WS", "RULE_COLON", "RULE_XMLESCAPED"
    };
    public static final int RULE_ID=4;
    public static final int RULE_PARENT=6;
    public static final int RULE_SQBRACKET_OPEN=8;
    public static final int RULE_XML_LT=26;
    public static final int RULE_CURLYOPEN=33;
    public static final int RULE_PLUS=14;
    public static final int RULE_OR=22;
    public static final int RULE_COMMA=13;
    public static final int RULE_HASH=18;
    public static final int RULE_LITERALSTRING=31;
    public static final int RULE_AND=23;
    public static final int RULE_BRACKET_CLOSE=12;
    public static final int RULE_XML_GTEQ=29;
    public static final int RULE_TML_SEPARATOR=7;
    public static final int RULE_CURLYCLOSE=19;
    public static final int EOF=-1;
    public static final int RULE_NOT=16;
    public static final int RULE_NULL=34;
    public static final int RULE_TRUE=36;
    public static final int RULE_NEQUALS=25;
    public static final int RULE_BRACKET_OPEN=11;
    public static final int RULE_FORALL=32;
    public static final int RULE_DOLLAR=21;
    public static final int RULE_COLON=40;
    public static final int RULE_MINUS=15;
    public static final int RULE_FALSE=37;
    public static final int RULE_TML_EXISTS=10;
    public static final int RULE_DOT=5;
    public static final int RULE_NUMBER=17;
    public static final int RULE_TODAY=35;
    public static final int RULE_SQBRACKET_CLOSE=9;
    public static final int RULE_XMLESCAPED=41;
    public static final int RULE_MULTIPLY=30;
    public static final int RULE_XML_LTEQ=28;
    public static final int RULE_BADNUMBER=38;
    public static final int RULE_WS=39;
    public static final int RULE_XML_GT=27;
    public static final int RULE_EQUALSEQUALS=24;
    public static final int RULE_AT=20;

    // delegates
    // delegators


        public InternalNavajoExpressionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalNavajoExpressionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalNavajoExpressionParser.tokenNames; }
    public String getGrammarFileName() { return "../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g"; }


     
     	private NavajoExpressionGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(NavajoExpressionGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleTopLevel"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:60:1: entryRuleTopLevel : ruleTopLevel EOF ;
    public final void entryRuleTopLevel() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:61:1: ( ruleTopLevel EOF )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:62:1: ruleTopLevel EOF
            {
             before(grammarAccess.getTopLevelRule()); 
            pushFollow(FOLLOW_ruleTopLevel_in_entryRuleTopLevel61);
            ruleTopLevel();

            state._fsp--;

             after(grammarAccess.getTopLevelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopLevel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTopLevel"


    // $ANTLR start "ruleTopLevel"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:69:1: ruleTopLevel : ( ( rule__TopLevel__ToplevelExpressionAssignment ) ) ;
    public final void ruleTopLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:73:2: ( ( ( rule__TopLevel__ToplevelExpressionAssignment ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:74:1: ( ( rule__TopLevel__ToplevelExpressionAssignment ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:74:1: ( ( rule__TopLevel__ToplevelExpressionAssignment ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:75:1: ( rule__TopLevel__ToplevelExpressionAssignment )
            {
             before(grammarAccess.getTopLevelAccess().getToplevelExpressionAssignment()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:76:1: ( rule__TopLevel__ToplevelExpressionAssignment )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:76:2: rule__TopLevel__ToplevelExpressionAssignment
            {
            pushFollow(FOLLOW_rule__TopLevel__ToplevelExpressionAssignment_in_ruleTopLevel94);
            rule__TopLevel__ToplevelExpressionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTopLevelAccess().getToplevelExpressionAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTopLevel"


    // $ANTLR start "entryRulePathElement"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:90:1: entryRulePathElement : rulePathElement EOF ;
    public final void entryRulePathElement() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:91:1: ( rulePathElement EOF )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:92:1: rulePathElement EOF
            {
             before(grammarAccess.getPathElementRule()); 
            pushFollow(FOLLOW_rulePathElement_in_entryRulePathElement123);
            rulePathElement();

            state._fsp--;

             after(grammarAccess.getPathElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathElement130); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePathElement"


    // $ANTLR start "rulePathElement"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:99:1: rulePathElement : ( ( rule__PathElement__Alternatives ) ) ;
    public final void rulePathElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:103:2: ( ( ( rule__PathElement__Alternatives ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:104:1: ( ( rule__PathElement__Alternatives ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:104:1: ( ( rule__PathElement__Alternatives ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:105:1: ( rule__PathElement__Alternatives )
            {
             before(grammarAccess.getPathElementAccess().getAlternatives()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:106:1: ( rule__PathElement__Alternatives )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:106:2: rule__PathElement__Alternatives
            {
            pushFollow(FOLLOW_rule__PathElement__Alternatives_in_rulePathElement156);
            rule__PathElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPathElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePathElement"


    // $ANTLR start "entryRuleTmlExpression"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:118:1: entryRuleTmlExpression : ruleTmlExpression EOF ;
    public final void entryRuleTmlExpression() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:119:1: ( ruleTmlExpression EOF )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:120:1: ruleTmlExpression EOF
            {
             before(grammarAccess.getTmlExpressionRule()); 
            pushFollow(FOLLOW_ruleTmlExpression_in_entryRuleTmlExpression183);
            ruleTmlExpression();

            state._fsp--;

             after(grammarAccess.getTmlExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTmlExpression190); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTmlExpression"


    // $ANTLR start "ruleTmlExpression"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:127:1: ruleTmlExpression : ( ( rule__TmlExpression__Group__0 ) ) ;
    public final void ruleTmlExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:131:2: ( ( ( rule__TmlExpression__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:132:1: ( ( rule__TmlExpression__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:132:1: ( ( rule__TmlExpression__Group__0 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:133:1: ( rule__TmlExpression__Group__0 )
            {
             before(grammarAccess.getTmlExpressionAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:134:1: ( rule__TmlExpression__Group__0 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:134:2: rule__TmlExpression__Group__0
            {
            pushFollow(FOLLOW_rule__TmlExpression__Group__0_in_ruleTmlExpression216);
            rule__TmlExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTmlExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTmlExpression"


    // $ANTLR start "entryRuleExistsTmlExpression"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:146:1: entryRuleExistsTmlExpression : ruleExistsTmlExpression EOF ;
    public final void entryRuleExistsTmlExpression() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:147:1: ( ruleExistsTmlExpression EOF )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:148:1: ruleExistsTmlExpression EOF
            {
             before(grammarAccess.getExistsTmlExpressionRule()); 
            pushFollow(FOLLOW_ruleExistsTmlExpression_in_entryRuleExistsTmlExpression243);
            ruleExistsTmlExpression();

            state._fsp--;

             after(grammarAccess.getExistsTmlExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExistsTmlExpression250); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExistsTmlExpression"


    // $ANTLR start "ruleExistsTmlExpression"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:155:1: ruleExistsTmlExpression : ( ( rule__ExistsTmlExpression__Group__0 ) ) ;
    public final void ruleExistsTmlExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:159:2: ( ( ( rule__ExistsTmlExpression__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:160:1: ( ( rule__ExistsTmlExpression__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:160:1: ( ( rule__ExistsTmlExpression__Group__0 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:161:1: ( rule__ExistsTmlExpression__Group__0 )
            {
             before(grammarAccess.getExistsTmlExpressionAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:162:1: ( rule__ExistsTmlExpression__Group__0 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:162:2: rule__ExistsTmlExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ExistsTmlExpression__Group__0_in_ruleExistsTmlExpression276);
            rule__ExistsTmlExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExistsTmlExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExistsTmlExpression"


    // $ANTLR start "entryRuleMapReferenceParams"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:174:1: entryRuleMapReferenceParams : ruleMapReferenceParams EOF ;
    public final void entryRuleMapReferenceParams() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:175:1: ( ruleMapReferenceParams EOF )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:176:1: ruleMapReferenceParams EOF
            {
             before(grammarAccess.getMapReferenceParamsRule()); 
            pushFollow(FOLLOW_ruleMapReferenceParams_in_entryRuleMapReferenceParams303);
            ruleMapReferenceParams();

            state._fsp--;

             after(grammarAccess.getMapReferenceParamsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapReferenceParams310); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMapReferenceParams"


    // $ANTLR start "ruleMapReferenceParams"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:183:1: ruleMapReferenceParams : ( ( rule__MapReferenceParams__Group__0 ) ) ;
    public final void ruleMapReferenceParams() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:187:2: ( ( ( rule__MapReferenceParams__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:188:1: ( ( rule__MapReferenceParams__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:188:1: ( ( rule__MapReferenceParams__Group__0 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:189:1: ( rule__MapReferenceParams__Group__0 )
            {
             before(grammarAccess.getMapReferenceParamsAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:190:1: ( rule__MapReferenceParams__Group__0 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:190:2: rule__MapReferenceParams__Group__0
            {
            pushFollow(FOLLOW_rule__MapReferenceParams__Group__0_in_ruleMapReferenceParams336);
            rule__MapReferenceParams__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMapReferenceParamsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapReferenceParams"


    // $ANTLR start "entryRuleMapGetReference"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:202:1: entryRuleMapGetReference : ruleMapGetReference EOF ;
    public final void entryRuleMapGetReference() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:203:1: ( ruleMapGetReference EOF )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:204:1: ruleMapGetReference EOF
            {
             before(grammarAccess.getMapGetReferenceRule()); 
            pushFollow(FOLLOW_ruleMapGetReference_in_entryRuleMapGetReference363);
            ruleMapGetReference();

            state._fsp--;

             after(grammarAccess.getMapGetReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapGetReference370); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMapGetReference"


    // $ANTLR start "ruleMapGetReference"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:211:1: ruleMapGetReference : ( ( rule__MapGetReference__Group__0 ) ) ;
    public final void ruleMapGetReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:215:2: ( ( ( rule__MapGetReference__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:216:1: ( ( rule__MapGetReference__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:216:1: ( ( rule__MapGetReference__Group__0 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:217:1: ( rule__MapGetReference__Group__0 )
            {
             before(grammarAccess.getMapGetReferenceAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:218:1: ( rule__MapGetReference__Group__0 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:218:2: rule__MapGetReference__Group__0
            {
            pushFollow(FOLLOW_rule__MapGetReference__Group__0_in_ruleMapGetReference396);
            rule__MapGetReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMapGetReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapGetReference"


    // $ANTLR start "entryRuleOrExpression"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:230:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:231:1: ( ruleOrExpression EOF )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:232:1: ruleOrExpression EOF
            {
             before(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression423);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression430); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:239:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:243:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:244:1: ( ( rule__OrExpression__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:244:1: ( ( rule__OrExpression__Group__0 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:245:1: ( rule__OrExpression__Group__0 )
            {
             before(grammarAccess.getOrExpressionAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:246:1: ( rule__OrExpression__Group__0 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:246:2: rule__OrExpression__Group__0
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression456);
            rule__OrExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:258:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:259:1: ( ruleAndExpression EOF )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:260:1: ruleAndExpression EOF
            {
             before(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression483);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression490); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:267:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:271:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:272:1: ( ( rule__AndExpression__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:272:1: ( ( rule__AndExpression__Group__0 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:273:1: ( rule__AndExpression__Group__0 )
            {
             before(grammarAccess.getAndExpressionAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:274:1: ( rule__AndExpression__Group__0 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:274:2: rule__AndExpression__Group__0
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression516);
            rule__AndExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleEqualityExpression"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:286:1: entryRuleEqualityExpression : ruleEqualityExpression EOF ;
    public final void entryRuleEqualityExpression() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:287:1: ( ruleEqualityExpression EOF )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:288:1: ruleEqualityExpression EOF
            {
             before(grammarAccess.getEqualityExpressionRule()); 
            pushFollow(FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression543);
            ruleEqualityExpression();

            state._fsp--;

             after(grammarAccess.getEqualityExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualityExpression550); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEqualityExpression"


    // $ANTLR start "ruleEqualityExpression"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:295:1: ruleEqualityExpression : ( ( rule__EqualityExpression__Group__0 ) ) ;
    public final void ruleEqualityExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:299:2: ( ( ( rule__EqualityExpression__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:300:1: ( ( rule__EqualityExpression__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:300:1: ( ( rule__EqualityExpression__Group__0 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:301:1: ( rule__EqualityExpression__Group__0 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:302:1: ( rule__EqualityExpression__Group__0 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:302:2: rule__EqualityExpression__Group__0
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group__0_in_ruleEqualityExpression576);
            rule__EqualityExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleRelationalExpression"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:314:1: entryRuleRelationalExpression : ruleRelationalExpression EOF ;
    public final void entryRuleRelationalExpression() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:315:1: ( ruleRelationalExpression EOF )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:316:1: ruleRelationalExpression EOF
            {
             before(grammarAccess.getRelationalExpressionRule()); 
            pushFollow(FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression603);
            ruleRelationalExpression();

            state._fsp--;

             after(grammarAccess.getRelationalExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpression610); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelationalExpression"


    // $ANTLR start "ruleRelationalExpression"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:323:1: ruleRelationalExpression : ( ( rule__RelationalExpression__Group__0 ) ) ;
    public final void ruleRelationalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:327:2: ( ( ( rule__RelationalExpression__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:328:1: ( ( rule__RelationalExpression__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:328:1: ( ( rule__RelationalExpression__Group__0 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:329:1: ( rule__RelationalExpression__Group__0 )
            {
             before(grammarAccess.getRelationalExpressionAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:330:1: ( rule__RelationalExpression__Group__0 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:330:2: rule__RelationalExpression__Group__0
            {
            pushFollow(FOLLOW_rule__RelationalExpression__Group__0_in_ruleRelationalExpression636);
            rule__RelationalExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelationalExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:342:1: entryRuleAdditiveExpression : ruleAdditiveExpression EOF ;
    public final void entryRuleAdditiveExpression() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:343:1: ( ruleAdditiveExpression EOF )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:344:1: ruleAdditiveExpression EOF
            {
             before(grammarAccess.getAdditiveExpressionRule()); 
            pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression663);
            ruleAdditiveExpression();

            state._fsp--;

             after(grammarAccess.getAdditiveExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpression670); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:351:1: ruleAdditiveExpression : ( ( rule__AdditiveExpression__Group__0 ) ) ;
    public final void ruleAdditiveExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:355:2: ( ( ( rule__AdditiveExpression__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:356:1: ( ( rule__AdditiveExpression__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:356:1: ( ( rule__AdditiveExpression__Group__0 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:357:1: ( rule__AdditiveExpression__Group__0 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:358:1: ( rule__AdditiveExpression__Group__0 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:358:2: rule__AdditiveExpression__Group__0
            {
            pushFollow(FOLLOW_rule__AdditiveExpression__Group__0_in_ruleAdditiveExpression696);
            rule__AdditiveExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:370:1: entryRuleMultiplicativeExpression : ruleMultiplicativeExpression EOF ;
    public final void entryRuleMultiplicativeExpression() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:371:1: ( ruleMultiplicativeExpression EOF )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:372:1: ruleMultiplicativeExpression EOF
            {
             before(grammarAccess.getMultiplicativeExpressionRule()); 
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression723);
            ruleMultiplicativeExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeExpression730); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:379:1: ruleMultiplicativeExpression : ( ( rule__MultiplicativeExpression__Group__0 ) ) ;
    public final void ruleMultiplicativeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:383:2: ( ( ( rule__MultiplicativeExpression__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:384:1: ( ( rule__MultiplicativeExpression__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:384:1: ( ( rule__MultiplicativeExpression__Group__0 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:385:1: ( rule__MultiplicativeExpression__Group__0 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:386:1: ( rule__MultiplicativeExpression__Group__0 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:386:2: rule__MultiplicativeExpression__Group__0
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group__0_in_ruleMultiplicativeExpression756);
            rule__MultiplicativeExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:398:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:399:1: ( ruleUnaryExpression EOF )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:400:1: ruleUnaryExpression EOF
            {
             before(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression783);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpression790); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:407:1: ruleUnaryExpression : ( ( rule__UnaryExpression__Alternatives ) ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:411:2: ( ( ( rule__UnaryExpression__Alternatives ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:412:1: ( ( rule__UnaryExpression__Alternatives ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:412:1: ( ( rule__UnaryExpression__Alternatives ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:413:1: ( rule__UnaryExpression__Alternatives )
            {
             before(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:414:1: ( rule__UnaryExpression__Alternatives )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:414:2: rule__UnaryExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Alternatives_in_ruleUnaryExpression816);
            rule__UnaryExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:426:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:427:1: ( rulePrimaryExpression EOF )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:428:1: rulePrimaryExpression EOF
            {
             before(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression843);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression850); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:435:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:439:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:440:1: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:440:1: ( ( rule__PrimaryExpression__Alternatives ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:441:1: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:442:1: ( rule__PrimaryExpression__Alternatives )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:442:2: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression876);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleFunctionName"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:454:1: entryRuleFunctionName : ruleFunctionName EOF ;
    public final void entryRuleFunctionName() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:455:1: ( ruleFunctionName EOF )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:456:1: ruleFunctionName EOF
            {
             before(grammarAccess.getFunctionNameRule()); 
            pushFollow(FOLLOW_ruleFunctionName_in_entryRuleFunctionName903);
            ruleFunctionName();

            state._fsp--;

             after(grammarAccess.getFunctionNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionName910); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctionName"


    // $ANTLR start "ruleFunctionName"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:463:1: ruleFunctionName : ( RULE_ID ) ;
    public final void ruleFunctionName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:467:2: ( ( RULE_ID ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:468:1: ( RULE_ID )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:468:1: ( RULE_ID )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:469:1: RULE_ID
            {
             before(grammarAccess.getFunctionNameAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionName936); 
             after(grammarAccess.getFunctionNameAccess().getIDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionName"


    // $ANTLR start "entryRuleFunctionCall"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:482:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:483:1: ( ruleFunctionCall EOF )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:484:1: ruleFunctionCall EOF
            {
             before(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall962);
            ruleFunctionCall();

            state._fsp--;

             after(grammarAccess.getFunctionCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCall969); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:491:1: ruleFunctionCall : ( ( rule__FunctionCall__Group__0 ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:495:2: ( ( ( rule__FunctionCall__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:496:1: ( ( rule__FunctionCall__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:496:1: ( ( rule__FunctionCall__Group__0 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:497:1: ( rule__FunctionCall__Group__0 )
            {
             before(grammarAccess.getFunctionCallAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:498:1: ( rule__FunctionCall__Group__0 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:498:2: rule__FunctionCall__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__0_in_ruleFunctionCall995);
            rule__FunctionCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleDateLiteral"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:510:1: entryRuleDateLiteral : ruleDateLiteral EOF ;
    public final void entryRuleDateLiteral() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:511:1: ( ruleDateLiteral EOF )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:512:1: ruleDateLiteral EOF
            {
             before(grammarAccess.getDateLiteralRule()); 
            pushFollow(FOLLOW_ruleDateLiteral_in_entryRuleDateLiteral1022);
            ruleDateLiteral();

            state._fsp--;

             after(grammarAccess.getDateLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateLiteral1029); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDateLiteral"


    // $ANTLR start "ruleDateLiteral"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:519:1: ruleDateLiteral : ( ( rule__DateLiteral__Group__0 ) ) ;
    public final void ruleDateLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:523:2: ( ( ( rule__DateLiteral__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:524:1: ( ( rule__DateLiteral__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:524:1: ( ( rule__DateLiteral__Group__0 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:525:1: ( rule__DateLiteral__Group__0 )
            {
             before(grammarAccess.getDateLiteralAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:526:1: ( rule__DateLiteral__Group__0 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:526:2: rule__DateLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__DateLiteral__Group__0_in_ruleDateLiteral1055);
            rule__DateLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDateLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDateLiteral"


    // $ANTLR start "entryRuleLiteral"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:538:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:539:1: ( ruleLiteral EOF )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:540:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral1082);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral1089); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:547:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:551:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:552:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:552:1: ( ( rule__Literal__Alternatives ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:553:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:554:1: ( rule__Literal__Alternatives )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:554:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1115);
            rule__Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "rule__PathElement__Alternatives"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:567:1: rule__PathElement__Alternatives : ( ( RULE_ID ) | ( RULE_DOT ) | ( RULE_PARENT ) | ( RULE_TML_SEPARATOR ) );
    public final void rule__PathElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:571:1: ( ( RULE_ID ) | ( RULE_DOT ) | ( RULE_PARENT ) | ( RULE_TML_SEPARATOR ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt1=1;
                }
                break;
            case RULE_DOT:
                {
                alt1=2;
                }
                break;
            case RULE_PARENT:
                {
                alt1=3;
                }
                break;
            case RULE_TML_SEPARATOR:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:572:1: ( RULE_ID )
                    {
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:572:1: ( RULE_ID )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:573:1: RULE_ID
                    {
                     before(grammarAccess.getPathElementAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PathElement__Alternatives1152); 
                     after(grammarAccess.getPathElementAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:578:6: ( RULE_DOT )
                    {
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:578:6: ( RULE_DOT )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:579:1: RULE_DOT
                    {
                     before(grammarAccess.getPathElementAccess().getDOTTerminalRuleCall_1()); 
                    match(input,RULE_DOT,FOLLOW_RULE_DOT_in_rule__PathElement__Alternatives1169); 
                     after(grammarAccess.getPathElementAccess().getDOTTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:584:6: ( RULE_PARENT )
                    {
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:584:6: ( RULE_PARENT )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:585:1: RULE_PARENT
                    {
                     before(grammarAccess.getPathElementAccess().getPARENTTerminalRuleCall_2()); 
                    match(input,RULE_PARENT,FOLLOW_RULE_PARENT_in_rule__PathElement__Alternatives1186); 
                     after(grammarAccess.getPathElementAccess().getPARENTTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:590:6: ( RULE_TML_SEPARATOR )
                    {
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:590:6: ( RULE_TML_SEPARATOR )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:591:1: RULE_TML_SEPARATOR
                    {
                     before(grammarAccess.getPathElementAccess().getTML_SEPARATORTerminalRuleCall_3()); 
                    match(input,RULE_TML_SEPARATOR,FOLLOW_RULE_TML_SEPARATOR_in_rule__PathElement__Alternatives1203); 
                     after(grammarAccess.getPathElementAccess().getTML_SEPARATORTerminalRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathElement__Alternatives"


    // $ANTLR start "rule__EqualityExpression__Alternatives_1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:601:1: rule__EqualityExpression__Alternatives_1 : ( ( ( rule__EqualityExpression__Group_1_0__0 ) ) | ( ( rule__EqualityExpression__Group_1_1__0 ) ) );
    public final void rule__EqualityExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:605:1: ( ( ( rule__EqualityExpression__Group_1_0__0 ) ) | ( ( rule__EqualityExpression__Group_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_EQUALSEQUALS) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_NEQUALS) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:606:1: ( ( rule__EqualityExpression__Group_1_0__0 ) )
                    {
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:606:1: ( ( rule__EqualityExpression__Group_1_0__0 ) )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:607:1: ( rule__EqualityExpression__Group_1_0__0 )
                    {
                     before(grammarAccess.getEqualityExpressionAccess().getGroup_1_0()); 
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:608:1: ( rule__EqualityExpression__Group_1_0__0 )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:608:2: rule__EqualityExpression__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__EqualityExpression__Group_1_0__0_in_rule__EqualityExpression__Alternatives_11235);
                    rule__EqualityExpression__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEqualityExpressionAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:612:6: ( ( rule__EqualityExpression__Group_1_1__0 ) )
                    {
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:612:6: ( ( rule__EqualityExpression__Group_1_1__0 ) )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:613:1: ( rule__EqualityExpression__Group_1_1__0 )
                    {
                     before(grammarAccess.getEqualityExpressionAccess().getGroup_1_1()); 
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:614:1: ( rule__EqualityExpression__Group_1_1__0 )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:614:2: rule__EqualityExpression__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__EqualityExpression__Group_1_1__0_in_rule__EqualityExpression__Alternatives_11253);
                    rule__EqualityExpression__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEqualityExpressionAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Alternatives_1"


    // $ANTLR start "rule__RelationalExpression__Alternatives_2"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:623:1: rule__RelationalExpression__Alternatives_2 : ( ( ( rule__RelationalExpression__Group_2_0__0 ) ) | ( ( rule__RelationalExpression__Group_2_1__0 ) ) | ( ( rule__RelationalExpression__Group_2_2__0 ) ) | ( ( rule__RelationalExpression__Group_2_3__0 ) ) );
    public final void rule__RelationalExpression__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:627:1: ( ( ( rule__RelationalExpression__Group_2_0__0 ) ) | ( ( rule__RelationalExpression__Group_2_1__0 ) ) | ( ( rule__RelationalExpression__Group_2_2__0 ) ) | ( ( rule__RelationalExpression__Group_2_3__0 ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_XML_LT:
                {
                alt3=1;
                }
                break;
            case RULE_XML_GT:
                {
                alt3=2;
                }
                break;
            case RULE_XML_LTEQ:
                {
                alt3=3;
                }
                break;
            case RULE_XML_GTEQ:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:628:1: ( ( rule__RelationalExpression__Group_2_0__0 ) )
                    {
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:628:1: ( ( rule__RelationalExpression__Group_2_0__0 ) )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:629:1: ( rule__RelationalExpression__Group_2_0__0 )
                    {
                     before(grammarAccess.getRelationalExpressionAccess().getGroup_2_0()); 
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:630:1: ( rule__RelationalExpression__Group_2_0__0 )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:630:2: rule__RelationalExpression__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__RelationalExpression__Group_2_0__0_in_rule__RelationalExpression__Alternatives_21286);
                    rule__RelationalExpression__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationalExpressionAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:634:6: ( ( rule__RelationalExpression__Group_2_1__0 ) )
                    {
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:634:6: ( ( rule__RelationalExpression__Group_2_1__0 ) )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:635:1: ( rule__RelationalExpression__Group_2_1__0 )
                    {
                     before(grammarAccess.getRelationalExpressionAccess().getGroup_2_1()); 
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:636:1: ( rule__RelationalExpression__Group_2_1__0 )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:636:2: rule__RelationalExpression__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__RelationalExpression__Group_2_1__0_in_rule__RelationalExpression__Alternatives_21304);
                    rule__RelationalExpression__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationalExpressionAccess().getGroup_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:640:6: ( ( rule__RelationalExpression__Group_2_2__0 ) )
                    {
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:640:6: ( ( rule__RelationalExpression__Group_2_2__0 ) )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:641:1: ( rule__RelationalExpression__Group_2_2__0 )
                    {
                     before(grammarAccess.getRelationalExpressionAccess().getGroup_2_2()); 
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:642:1: ( rule__RelationalExpression__Group_2_2__0 )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:642:2: rule__RelationalExpression__Group_2_2__0
                    {
                    pushFollow(FOLLOW_rule__RelationalExpression__Group_2_2__0_in_rule__RelationalExpression__Alternatives_21322);
                    rule__RelationalExpression__Group_2_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationalExpressionAccess().getGroup_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:646:6: ( ( rule__RelationalExpression__Group_2_3__0 ) )
                    {
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:646:6: ( ( rule__RelationalExpression__Group_2_3__0 ) )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:647:1: ( rule__RelationalExpression__Group_2_3__0 )
                    {
                     before(grammarAccess.getRelationalExpressionAccess().getGroup_2_3()); 
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:648:1: ( rule__RelationalExpression__Group_2_3__0 )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:648:2: rule__RelationalExpression__Group_2_3__0
                    {
                    pushFollow(FOLLOW_rule__RelationalExpression__Group_2_3__0_in_rule__RelationalExpression__Alternatives_21340);
                    rule__RelationalExpression__Group_2_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationalExpressionAccess().getGroup_2_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Alternatives_2"


    // $ANTLR start "rule__AdditiveExpression__Alternatives_1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:657:1: rule__AdditiveExpression__Alternatives_1 : ( ( ( rule__AdditiveExpression__Group_1_0__0 ) ) | ( ( rule__AdditiveExpression__Group_1_1__0 ) ) );
    public final void rule__AdditiveExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:661:1: ( ( ( rule__AdditiveExpression__Group_1_0__0 ) ) | ( ( rule__AdditiveExpression__Group_1_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_PLUS) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_MINUS) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:662:1: ( ( rule__AdditiveExpression__Group_1_0__0 ) )
                    {
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:662:1: ( ( rule__AdditiveExpression__Group_1_0__0 ) )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:663:1: ( rule__AdditiveExpression__Group_1_0__0 )
                    {
                     before(grammarAccess.getAdditiveExpressionAccess().getGroup_1_0()); 
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:664:1: ( rule__AdditiveExpression__Group_1_0__0 )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:664:2: rule__AdditiveExpression__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__AdditiveExpression__Group_1_0__0_in_rule__AdditiveExpression__Alternatives_11373);
                    rule__AdditiveExpression__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAdditiveExpressionAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:668:6: ( ( rule__AdditiveExpression__Group_1_1__0 ) )
                    {
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:668:6: ( ( rule__AdditiveExpression__Group_1_1__0 ) )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:669:1: ( rule__AdditiveExpression__Group_1_1__0 )
                    {
                     before(grammarAccess.getAdditiveExpressionAccess().getGroup_1_1()); 
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:670:1: ( rule__AdditiveExpression__Group_1_1__0 )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:670:2: rule__AdditiveExpression__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__AdditiveExpression__Group_1_1__0_in_rule__AdditiveExpression__Alternatives_11391);
                    rule__AdditiveExpression__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAdditiveExpressionAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Alternatives_1"


    // $ANTLR start "rule__MultiplicativeExpression__Alternatives_1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:679:1: rule__MultiplicativeExpression__Alternatives_1 : ( ( ( rule__MultiplicativeExpression__Group_1_0__0 ) ) | ( ( rule__MultiplicativeExpression__Group_1_1__0 ) ) );
    public final void rule__MultiplicativeExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:683:1: ( ( ( rule__MultiplicativeExpression__Group_1_0__0 ) ) | ( ( rule__MultiplicativeExpression__Group_1_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_MULTIPLY) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_TML_SEPARATOR) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:684:1: ( ( rule__MultiplicativeExpression__Group_1_0__0 ) )
                    {
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:684:1: ( ( rule__MultiplicativeExpression__Group_1_0__0 ) )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:685:1: ( rule__MultiplicativeExpression__Group_1_0__0 )
                    {
                     before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0()); 
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:686:1: ( rule__MultiplicativeExpression__Group_1_0__0 )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:686:2: rule__MultiplicativeExpression__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__MultiplicativeExpression__Group_1_0__0_in_rule__MultiplicativeExpression__Alternatives_11424);
                    rule__MultiplicativeExpression__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:690:6: ( ( rule__MultiplicativeExpression__Group_1_1__0 ) )
                    {
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:690:6: ( ( rule__MultiplicativeExpression__Group_1_1__0 ) )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:691:1: ( rule__MultiplicativeExpression__Group_1_1__0 )
                    {
                     before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_1()); 
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:692:1: ( rule__MultiplicativeExpression__Group_1_1__0 )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:692:2: rule__MultiplicativeExpression__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__MultiplicativeExpression__Group_1_1__0_in_rule__MultiplicativeExpression__Alternatives_11442);
                    rule__MultiplicativeExpression__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Alternatives_1"


    // $ANTLR start "rule__UnaryExpression__Alternatives"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:701:1: rule__UnaryExpression__Alternatives : ( ( ( rule__UnaryExpression__Alternatives_0 ) ) | ( rulePrimaryExpression ) );
    public final void rule__UnaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:705:1: ( ( ( rule__UnaryExpression__Alternatives_0 ) ) | ( rulePrimaryExpression ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_MINUS && LA6_0<=RULE_NOT)) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID||LA6_0==RULE_SQBRACKET_OPEN||(LA6_0>=RULE_TML_EXISTS && LA6_0<=RULE_BRACKET_OPEN)||LA6_0==RULE_NUMBER||LA6_0==RULE_DOLLAR||(LA6_0>=RULE_LITERALSTRING && LA6_0<=RULE_FALSE)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:706:1: ( ( rule__UnaryExpression__Alternatives_0 ) )
                    {
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:706:1: ( ( rule__UnaryExpression__Alternatives_0 ) )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:707:1: ( rule__UnaryExpression__Alternatives_0 )
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getAlternatives_0()); 
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:708:1: ( rule__UnaryExpression__Alternatives_0 )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:708:2: rule__UnaryExpression__Alternatives_0
                    {
                    pushFollow(FOLLOW_rule__UnaryExpression__Alternatives_0_in_rule__UnaryExpression__Alternatives1475);
                    rule__UnaryExpression__Alternatives_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnaryExpressionAccess().getAlternatives_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:712:6: ( rulePrimaryExpression )
                    {
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:712:6: ( rulePrimaryExpression )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:713:1: rulePrimaryExpression
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePrimaryExpression_in_rule__UnaryExpression__Alternatives1493);
                    rulePrimaryExpression();

                    state._fsp--;

                     after(grammarAccess.getUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Alternatives"


    // $ANTLR start "rule__UnaryExpression__Alternatives_0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:723:1: rule__UnaryExpression__Alternatives_0 : ( ( ( rule__UnaryExpression__Group_0_0__0 ) ) | ( ( rule__UnaryExpression__Group_0_1__0 ) ) );
    public final void rule__UnaryExpression__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:727:1: ( ( ( rule__UnaryExpression__Group_0_0__0 ) ) | ( ( rule__UnaryExpression__Group_0_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_NOT) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_MINUS) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:728:1: ( ( rule__UnaryExpression__Group_0_0__0 ) )
                    {
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:728:1: ( ( rule__UnaryExpression__Group_0_0__0 ) )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:729:1: ( rule__UnaryExpression__Group_0_0__0 )
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getGroup_0_0()); 
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:730:1: ( rule__UnaryExpression__Group_0_0__0 )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:730:2: rule__UnaryExpression__Group_0_0__0
                    {
                    pushFollow(FOLLOW_rule__UnaryExpression__Group_0_0__0_in_rule__UnaryExpression__Alternatives_01525);
                    rule__UnaryExpression__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnaryExpressionAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:734:6: ( ( rule__UnaryExpression__Group_0_1__0 ) )
                    {
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:734:6: ( ( rule__UnaryExpression__Group_0_1__0 ) )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:735:1: ( rule__UnaryExpression__Group_0_1__0 )
                    {
                     before(grammarAccess.getUnaryExpressionAccess().getGroup_0_1()); 
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:736:1: ( rule__UnaryExpression__Group_0_1__0 )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:736:2: rule__UnaryExpression__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__UnaryExpression__Group_0_1__0_in_rule__UnaryExpression__Alternatives_01543);
                    rule__UnaryExpression__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnaryExpressionAccess().getGroup_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Alternatives_0"


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:745:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__ParametersAssignment_0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:749:1: ( ( ( rule__PrimaryExpression__ParametersAssignment_0 ) ) | ( ( rule__PrimaryExpression__Group_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID||LA8_0==RULE_SQBRACKET_OPEN||LA8_0==RULE_TML_EXISTS||LA8_0==RULE_NUMBER||LA8_0==RULE_DOLLAR||(LA8_0>=RULE_LITERALSTRING && LA8_0<=RULE_FALSE)) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_BRACKET_OPEN) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:750:1: ( ( rule__PrimaryExpression__ParametersAssignment_0 ) )
                    {
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:750:1: ( ( rule__PrimaryExpression__ParametersAssignment_0 ) )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:751:1: ( rule__PrimaryExpression__ParametersAssignment_0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getParametersAssignment_0()); 
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:752:1: ( rule__PrimaryExpression__ParametersAssignment_0 )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:752:2: rule__PrimaryExpression__ParametersAssignment_0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__ParametersAssignment_0_in_rule__PrimaryExpression__Alternatives1576);
                    rule__PrimaryExpression__ParametersAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getParametersAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:756:6: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    {
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:756:6: ( ( rule__PrimaryExpression__Group_1__0 ) )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:757:1: ( rule__PrimaryExpression__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:758:1: ( rule__PrimaryExpression__Group_1__0 )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:758:2: rule__PrimaryExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__0_in_rule__PrimaryExpression__Alternatives1594);
                    rule__PrimaryExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:767:1: rule__Literal__Alternatives : ( ( ( rule__Literal__Group_0__0 ) ) | ( ( rule__Literal__ValueStringAssignment_1 ) ) | ( ( rule__Literal__Group_2__0 ) ) | ( ( rule__Literal__ParametersAssignment_3 ) ) | ( ( rule__Literal__Group_4__0 ) ) | ( ( rule__Literal__ElementsAssignment_5 ) ) | ( ( rule__Literal__ElementsAssignment_6 ) ) | ( ( rule__Literal__ElementsAssignment_7 ) ) | ( ( rule__Literal__ElementsAssignment_8 ) ) | ( ( rule__Literal__ParametersAssignment_9 ) ) | ( ( rule__Literal__ParametersAssignment_10 ) ) | ( ( rule__Literal__ParametersAssignment_11 ) ) | ( ( rule__Literal__ParametersAssignment_12 ) ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:771:1: ( ( ( rule__Literal__Group_0__0 ) ) | ( ( rule__Literal__ValueStringAssignment_1 ) ) | ( ( rule__Literal__Group_2__0 ) ) | ( ( rule__Literal__ParametersAssignment_3 ) ) | ( ( rule__Literal__Group_4__0 ) ) | ( ( rule__Literal__ElementsAssignment_5 ) ) | ( ( rule__Literal__ElementsAssignment_6 ) ) | ( ( rule__Literal__ElementsAssignment_7 ) ) | ( ( rule__Literal__ElementsAssignment_8 ) ) | ( ( rule__Literal__ParametersAssignment_9 ) ) | ( ( rule__Literal__ParametersAssignment_10 ) ) | ( ( rule__Literal__ParametersAssignment_11 ) ) | ( ( rule__Literal__ParametersAssignment_12 ) ) )
            int alt9=13;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:772:1: ( ( rule__Literal__Group_0__0 ) )
                    {
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:772:1: ( ( rule__Literal__Group_0__0 ) )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:773:1: ( rule__Literal__Group_0__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_0()); 
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:774:1: ( rule__Literal__Group_0__0 )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:774:2: rule__Literal__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_0__0_in_rule__Literal__Alternatives1627);
                    rule__Literal__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:778:6: ( ( rule__Literal__ValueStringAssignment_1 ) )
                    {
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:778:6: ( ( rule__Literal__ValueStringAssignment_1 ) )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:779:1: ( rule__Literal__ValueStringAssignment_1 )
                    {
                     before(grammarAccess.getLiteralAccess().getValueStringAssignment_1()); 
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:780:1: ( rule__Literal__ValueStringAssignment_1 )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:780:2: rule__Literal__ValueStringAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Literal__ValueStringAssignment_1_in_rule__Literal__Alternatives1645);
                    rule__Literal__ValueStringAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getValueStringAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:784:6: ( ( rule__Literal__Group_2__0 ) )
                    {
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:784:6: ( ( rule__Literal__Group_2__0 ) )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:785:1: ( rule__Literal__Group_2__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_2()); 
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:786:1: ( rule__Literal__Group_2__0 )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:786:2: rule__Literal__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_2__0_in_rule__Literal__Alternatives1663);
                    rule__Literal__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:790:6: ( ( rule__Literal__ParametersAssignment_3 ) )
                    {
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:790:6: ( ( rule__Literal__ParametersAssignment_3 ) )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:791:1: ( rule__Literal__ParametersAssignment_3 )
                    {
                     before(grammarAccess.getLiteralAccess().getParametersAssignment_3()); 
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:792:1: ( rule__Literal__ParametersAssignment_3 )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:792:2: rule__Literal__ParametersAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Literal__ParametersAssignment_3_in_rule__Literal__Alternatives1681);
                    rule__Literal__ParametersAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getParametersAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:796:6: ( ( rule__Literal__Group_4__0 ) )
                    {
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:796:6: ( ( rule__Literal__Group_4__0 ) )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:797:1: ( rule__Literal__Group_4__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_4()); 
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:798:1: ( rule__Literal__Group_4__0 )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:798:2: rule__Literal__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_4__0_in_rule__Literal__Alternatives1699);
                    rule__Literal__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:802:6: ( ( rule__Literal__ElementsAssignment_5 ) )
                    {
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:802:6: ( ( rule__Literal__ElementsAssignment_5 ) )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:803:1: ( rule__Literal__ElementsAssignment_5 )
                    {
                     before(grammarAccess.getLiteralAccess().getElementsAssignment_5()); 
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:804:1: ( rule__Literal__ElementsAssignment_5 )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:804:2: rule__Literal__ElementsAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Literal__ElementsAssignment_5_in_rule__Literal__Alternatives1717);
                    rule__Literal__ElementsAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getElementsAssignment_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:808:6: ( ( rule__Literal__ElementsAssignment_6 ) )
                    {
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:808:6: ( ( rule__Literal__ElementsAssignment_6 ) )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:809:1: ( rule__Literal__ElementsAssignment_6 )
                    {
                     before(grammarAccess.getLiteralAccess().getElementsAssignment_6()); 
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:810:1: ( rule__Literal__ElementsAssignment_6 )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:810:2: rule__Literal__ElementsAssignment_6
                    {
                    pushFollow(FOLLOW_rule__Literal__ElementsAssignment_6_in_rule__Literal__Alternatives1735);
                    rule__Literal__ElementsAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getElementsAssignment_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:814:6: ( ( rule__Literal__ElementsAssignment_7 ) )
                    {
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:814:6: ( ( rule__Literal__ElementsAssignment_7 ) )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:815:1: ( rule__Literal__ElementsAssignment_7 )
                    {
                     before(grammarAccess.getLiteralAccess().getElementsAssignment_7()); 
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:816:1: ( rule__Literal__ElementsAssignment_7 )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:816:2: rule__Literal__ElementsAssignment_7
                    {
                    pushFollow(FOLLOW_rule__Literal__ElementsAssignment_7_in_rule__Literal__Alternatives1753);
                    rule__Literal__ElementsAssignment_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getElementsAssignment_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:820:6: ( ( rule__Literal__ElementsAssignment_8 ) )
                    {
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:820:6: ( ( rule__Literal__ElementsAssignment_8 ) )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:821:1: ( rule__Literal__ElementsAssignment_8 )
                    {
                     before(grammarAccess.getLiteralAccess().getElementsAssignment_8()); 
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:822:1: ( rule__Literal__ElementsAssignment_8 )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:822:2: rule__Literal__ElementsAssignment_8
                    {
                    pushFollow(FOLLOW_rule__Literal__ElementsAssignment_8_in_rule__Literal__Alternatives1771);
                    rule__Literal__ElementsAssignment_8();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getElementsAssignment_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:826:6: ( ( rule__Literal__ParametersAssignment_9 ) )
                    {
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:826:6: ( ( rule__Literal__ParametersAssignment_9 ) )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:827:1: ( rule__Literal__ParametersAssignment_9 )
                    {
                     before(grammarAccess.getLiteralAccess().getParametersAssignment_9()); 
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:828:1: ( rule__Literal__ParametersAssignment_9 )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:828:2: rule__Literal__ParametersAssignment_9
                    {
                    pushFollow(FOLLOW_rule__Literal__ParametersAssignment_9_in_rule__Literal__Alternatives1789);
                    rule__Literal__ParametersAssignment_9();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getParametersAssignment_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:832:6: ( ( rule__Literal__ParametersAssignment_10 ) )
                    {
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:832:6: ( ( rule__Literal__ParametersAssignment_10 ) )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:833:1: ( rule__Literal__ParametersAssignment_10 )
                    {
                     before(grammarAccess.getLiteralAccess().getParametersAssignment_10()); 
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:834:1: ( rule__Literal__ParametersAssignment_10 )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:834:2: rule__Literal__ParametersAssignment_10
                    {
                    pushFollow(FOLLOW_rule__Literal__ParametersAssignment_10_in_rule__Literal__Alternatives1807);
                    rule__Literal__ParametersAssignment_10();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getParametersAssignment_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:838:6: ( ( rule__Literal__ParametersAssignment_11 ) )
                    {
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:838:6: ( ( rule__Literal__ParametersAssignment_11 ) )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:839:1: ( rule__Literal__ParametersAssignment_11 )
                    {
                     before(grammarAccess.getLiteralAccess().getParametersAssignment_11()); 
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:840:1: ( rule__Literal__ParametersAssignment_11 )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:840:2: rule__Literal__ParametersAssignment_11
                    {
                    pushFollow(FOLLOW_rule__Literal__ParametersAssignment_11_in_rule__Literal__Alternatives1825);
                    rule__Literal__ParametersAssignment_11();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getParametersAssignment_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:844:6: ( ( rule__Literal__ParametersAssignment_12 ) )
                    {
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:844:6: ( ( rule__Literal__ParametersAssignment_12 ) )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:845:1: ( rule__Literal__ParametersAssignment_12 )
                    {
                     before(grammarAccess.getLiteralAccess().getParametersAssignment_12()); 
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:846:1: ( rule__Literal__ParametersAssignment_12 )
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:846:2: rule__Literal__ParametersAssignment_12
                    {
                    pushFollow(FOLLOW_rule__Literal__ParametersAssignment_12_in_rule__Literal__Alternatives1843);
                    rule__Literal__ParametersAssignment_12();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getParametersAssignment_12()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__TmlExpression__Group__0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:857:1: rule__TmlExpression__Group__0 : rule__TmlExpression__Group__0__Impl rule__TmlExpression__Group__1 ;
    public final void rule__TmlExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:861:1: ( rule__TmlExpression__Group__0__Impl rule__TmlExpression__Group__1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:862:2: rule__TmlExpression__Group__0__Impl rule__TmlExpression__Group__1
            {
            pushFollow(FOLLOW_rule__TmlExpression__Group__0__Impl_in_rule__TmlExpression__Group__01874);
            rule__TmlExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TmlExpression__Group__1_in_rule__TmlExpression__Group__01877);
            rule__TmlExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TmlExpression__Group__0"


    // $ANTLR start "rule__TmlExpression__Group__0__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:869:1: rule__TmlExpression__Group__0__Impl : ( RULE_SQBRACKET_OPEN ) ;
    public final void rule__TmlExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:873:1: ( ( RULE_SQBRACKET_OPEN ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:874:1: ( RULE_SQBRACKET_OPEN )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:874:1: ( RULE_SQBRACKET_OPEN )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:875:1: RULE_SQBRACKET_OPEN
            {
             before(grammarAccess.getTmlExpressionAccess().getSQBRACKET_OPENTerminalRuleCall_0()); 
            match(input,RULE_SQBRACKET_OPEN,FOLLOW_RULE_SQBRACKET_OPEN_in_rule__TmlExpression__Group__0__Impl1904); 
             after(grammarAccess.getTmlExpressionAccess().getSQBRACKET_OPENTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TmlExpression__Group__0__Impl"


    // $ANTLR start "rule__TmlExpression__Group__1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:886:1: rule__TmlExpression__Group__1 : rule__TmlExpression__Group__1__Impl rule__TmlExpression__Group__2 ;
    public final void rule__TmlExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:890:1: ( rule__TmlExpression__Group__1__Impl rule__TmlExpression__Group__2 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:891:2: rule__TmlExpression__Group__1__Impl rule__TmlExpression__Group__2
            {
            pushFollow(FOLLOW_rule__TmlExpression__Group__1__Impl_in_rule__TmlExpression__Group__11933);
            rule__TmlExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TmlExpression__Group__2_in_rule__TmlExpression__Group__11936);
            rule__TmlExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TmlExpression__Group__1"


    // $ANTLR start "rule__TmlExpression__Group__1__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:898:1: rule__TmlExpression__Group__1__Impl : ( ( rule__TmlExpression__AbsoluteAssignment_1 )? ) ;
    public final void rule__TmlExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:902:1: ( ( ( rule__TmlExpression__AbsoluteAssignment_1 )? ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:903:1: ( ( rule__TmlExpression__AbsoluteAssignment_1 )? )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:903:1: ( ( rule__TmlExpression__AbsoluteAssignment_1 )? )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:904:1: ( rule__TmlExpression__AbsoluteAssignment_1 )?
            {
             before(grammarAccess.getTmlExpressionAccess().getAbsoluteAssignment_1()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:905:1: ( rule__TmlExpression__AbsoluteAssignment_1 )?
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:905:2: rule__TmlExpression__AbsoluteAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TmlExpression__AbsoluteAssignment_1_in_rule__TmlExpression__Group__1__Impl1963);
                    rule__TmlExpression__AbsoluteAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTmlExpressionAccess().getAbsoluteAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TmlExpression__Group__1__Impl"


    // $ANTLR start "rule__TmlExpression__Group__2"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:915:1: rule__TmlExpression__Group__2 : rule__TmlExpression__Group__2__Impl rule__TmlExpression__Group__3 ;
    public final void rule__TmlExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:919:1: ( rule__TmlExpression__Group__2__Impl rule__TmlExpression__Group__3 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:920:2: rule__TmlExpression__Group__2__Impl rule__TmlExpression__Group__3
            {
            pushFollow(FOLLOW_rule__TmlExpression__Group__2__Impl_in_rule__TmlExpression__Group__21994);
            rule__TmlExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TmlExpression__Group__3_in_rule__TmlExpression__Group__21997);
            rule__TmlExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TmlExpression__Group__2"


    // $ANTLR start "rule__TmlExpression__Group__2__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:927:1: rule__TmlExpression__Group__2__Impl : ( ( rule__TmlExpression__ParamAssignment_2 )? ) ;
    public final void rule__TmlExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:931:1: ( ( ( rule__TmlExpression__ParamAssignment_2 )? ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:932:1: ( ( rule__TmlExpression__ParamAssignment_2 )? )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:932:1: ( ( rule__TmlExpression__ParamAssignment_2 )? )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:933:1: ( rule__TmlExpression__ParamAssignment_2 )?
            {
             before(grammarAccess.getTmlExpressionAccess().getParamAssignment_2()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:934:1: ( rule__TmlExpression__ParamAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_AT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:934:2: rule__TmlExpression__ParamAssignment_2
                    {
                    pushFollow(FOLLOW_rule__TmlExpression__ParamAssignment_2_in_rule__TmlExpression__Group__2__Impl2024);
                    rule__TmlExpression__ParamAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTmlExpressionAccess().getParamAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TmlExpression__Group__2__Impl"


    // $ANTLR start "rule__TmlExpression__Group__3"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:944:1: rule__TmlExpression__Group__3 : rule__TmlExpression__Group__3__Impl rule__TmlExpression__Group__4 ;
    public final void rule__TmlExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:948:1: ( rule__TmlExpression__Group__3__Impl rule__TmlExpression__Group__4 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:949:2: rule__TmlExpression__Group__3__Impl rule__TmlExpression__Group__4
            {
            pushFollow(FOLLOW_rule__TmlExpression__Group__3__Impl_in_rule__TmlExpression__Group__32055);
            rule__TmlExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TmlExpression__Group__4_in_rule__TmlExpression__Group__32058);
            rule__TmlExpression__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TmlExpression__Group__3"


    // $ANTLR start "rule__TmlExpression__Group__3__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:956:1: rule__TmlExpression__Group__3__Impl : ( ( rule__TmlExpression__ElementsAssignment_3 ) ) ;
    public final void rule__TmlExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:960:1: ( ( ( rule__TmlExpression__ElementsAssignment_3 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:961:1: ( ( rule__TmlExpression__ElementsAssignment_3 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:961:1: ( ( rule__TmlExpression__ElementsAssignment_3 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:962:1: ( rule__TmlExpression__ElementsAssignment_3 )
            {
             before(grammarAccess.getTmlExpressionAccess().getElementsAssignment_3()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:963:1: ( rule__TmlExpression__ElementsAssignment_3 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:963:2: rule__TmlExpression__ElementsAssignment_3
            {
            pushFollow(FOLLOW_rule__TmlExpression__ElementsAssignment_3_in_rule__TmlExpression__Group__3__Impl2085);
            rule__TmlExpression__ElementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTmlExpressionAccess().getElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TmlExpression__Group__3__Impl"


    // $ANTLR start "rule__TmlExpression__Group__4"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:973:1: rule__TmlExpression__Group__4 : rule__TmlExpression__Group__4__Impl rule__TmlExpression__Group__5 ;
    public final void rule__TmlExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:977:1: ( rule__TmlExpression__Group__4__Impl rule__TmlExpression__Group__5 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:978:2: rule__TmlExpression__Group__4__Impl rule__TmlExpression__Group__5
            {
            pushFollow(FOLLOW_rule__TmlExpression__Group__4__Impl_in_rule__TmlExpression__Group__42115);
            rule__TmlExpression__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TmlExpression__Group__5_in_rule__TmlExpression__Group__42118);
            rule__TmlExpression__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TmlExpression__Group__4"


    // $ANTLR start "rule__TmlExpression__Group__4__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:985:1: rule__TmlExpression__Group__4__Impl : ( ( rule__TmlExpression__Group_4__0 )* ) ;
    public final void rule__TmlExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:989:1: ( ( ( rule__TmlExpression__Group_4__0 )* ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:990:1: ( ( rule__TmlExpression__Group_4__0 )* )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:990:1: ( ( rule__TmlExpression__Group_4__0 )* )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:991:1: ( rule__TmlExpression__Group_4__0 )*
            {
             before(grammarAccess.getTmlExpressionAccess().getGroup_4()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:992:1: ( rule__TmlExpression__Group_4__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_TML_SEPARATOR) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:992:2: rule__TmlExpression__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__TmlExpression__Group_4__0_in_rule__TmlExpression__Group__4__Impl2145);
            	    rule__TmlExpression__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getTmlExpressionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TmlExpression__Group__4__Impl"


    // $ANTLR start "rule__TmlExpression__Group__5"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1002:1: rule__TmlExpression__Group__5 : rule__TmlExpression__Group__5__Impl ;
    public final void rule__TmlExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1006:1: ( rule__TmlExpression__Group__5__Impl )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1007:2: rule__TmlExpression__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__TmlExpression__Group__5__Impl_in_rule__TmlExpression__Group__52176);
            rule__TmlExpression__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TmlExpression__Group__5"


    // $ANTLR start "rule__TmlExpression__Group__5__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1013:1: rule__TmlExpression__Group__5__Impl : ( RULE_SQBRACKET_CLOSE ) ;
    public final void rule__TmlExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1017:1: ( ( RULE_SQBRACKET_CLOSE ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1018:1: ( RULE_SQBRACKET_CLOSE )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1018:1: ( RULE_SQBRACKET_CLOSE )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1019:1: RULE_SQBRACKET_CLOSE
            {
             before(grammarAccess.getTmlExpressionAccess().getSQBRACKET_CLOSETerminalRuleCall_5()); 
            match(input,RULE_SQBRACKET_CLOSE,FOLLOW_RULE_SQBRACKET_CLOSE_in_rule__TmlExpression__Group__5__Impl2203); 
             after(grammarAccess.getTmlExpressionAccess().getSQBRACKET_CLOSETerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TmlExpression__Group__5__Impl"


    // $ANTLR start "rule__TmlExpression__Group_4__0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1042:1: rule__TmlExpression__Group_4__0 : rule__TmlExpression__Group_4__0__Impl rule__TmlExpression__Group_4__1 ;
    public final void rule__TmlExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1046:1: ( rule__TmlExpression__Group_4__0__Impl rule__TmlExpression__Group_4__1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1047:2: rule__TmlExpression__Group_4__0__Impl rule__TmlExpression__Group_4__1
            {
            pushFollow(FOLLOW_rule__TmlExpression__Group_4__0__Impl_in_rule__TmlExpression__Group_4__02244);
            rule__TmlExpression__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TmlExpression__Group_4__1_in_rule__TmlExpression__Group_4__02247);
            rule__TmlExpression__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TmlExpression__Group_4__0"


    // $ANTLR start "rule__TmlExpression__Group_4__0__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1054:1: rule__TmlExpression__Group_4__0__Impl : ( RULE_TML_SEPARATOR ) ;
    public final void rule__TmlExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1058:1: ( ( RULE_TML_SEPARATOR ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1059:1: ( RULE_TML_SEPARATOR )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1059:1: ( RULE_TML_SEPARATOR )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1060:1: RULE_TML_SEPARATOR
            {
             before(grammarAccess.getTmlExpressionAccess().getTML_SEPARATORTerminalRuleCall_4_0()); 
            match(input,RULE_TML_SEPARATOR,FOLLOW_RULE_TML_SEPARATOR_in_rule__TmlExpression__Group_4__0__Impl2274); 
             after(grammarAccess.getTmlExpressionAccess().getTML_SEPARATORTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TmlExpression__Group_4__0__Impl"


    // $ANTLR start "rule__TmlExpression__Group_4__1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1071:1: rule__TmlExpression__Group_4__1 : rule__TmlExpression__Group_4__1__Impl ;
    public final void rule__TmlExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1075:1: ( rule__TmlExpression__Group_4__1__Impl )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1076:2: rule__TmlExpression__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__TmlExpression__Group_4__1__Impl_in_rule__TmlExpression__Group_4__12303);
            rule__TmlExpression__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TmlExpression__Group_4__1"


    // $ANTLR start "rule__TmlExpression__Group_4__1__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1082:1: rule__TmlExpression__Group_4__1__Impl : ( ( rule__TmlExpression__ElementsAssignment_4_1 ) ) ;
    public final void rule__TmlExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1086:1: ( ( ( rule__TmlExpression__ElementsAssignment_4_1 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1087:1: ( ( rule__TmlExpression__ElementsAssignment_4_1 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1087:1: ( ( rule__TmlExpression__ElementsAssignment_4_1 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1088:1: ( rule__TmlExpression__ElementsAssignment_4_1 )
            {
             before(grammarAccess.getTmlExpressionAccess().getElementsAssignment_4_1()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1089:1: ( rule__TmlExpression__ElementsAssignment_4_1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1089:2: rule__TmlExpression__ElementsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__TmlExpression__ElementsAssignment_4_1_in_rule__TmlExpression__Group_4__1__Impl2330);
            rule__TmlExpression__ElementsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTmlExpressionAccess().getElementsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TmlExpression__Group_4__1__Impl"


    // $ANTLR start "rule__ExistsTmlExpression__Group__0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1103:1: rule__ExistsTmlExpression__Group__0 : rule__ExistsTmlExpression__Group__0__Impl rule__ExistsTmlExpression__Group__1 ;
    public final void rule__ExistsTmlExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1107:1: ( rule__ExistsTmlExpression__Group__0__Impl rule__ExistsTmlExpression__Group__1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1108:2: rule__ExistsTmlExpression__Group__0__Impl rule__ExistsTmlExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ExistsTmlExpression__Group__0__Impl_in_rule__ExistsTmlExpression__Group__02364);
            rule__ExistsTmlExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExistsTmlExpression__Group__1_in_rule__ExistsTmlExpression__Group__02367);
            rule__ExistsTmlExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistsTmlExpression__Group__0"


    // $ANTLR start "rule__ExistsTmlExpression__Group__0__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1115:1: rule__ExistsTmlExpression__Group__0__Impl : ( RULE_TML_EXISTS ) ;
    public final void rule__ExistsTmlExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1119:1: ( ( RULE_TML_EXISTS ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1120:1: ( RULE_TML_EXISTS )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1120:1: ( RULE_TML_EXISTS )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1121:1: RULE_TML_EXISTS
            {
             before(grammarAccess.getExistsTmlExpressionAccess().getTML_EXISTSTerminalRuleCall_0()); 
            match(input,RULE_TML_EXISTS,FOLLOW_RULE_TML_EXISTS_in_rule__ExistsTmlExpression__Group__0__Impl2394); 
             after(grammarAccess.getExistsTmlExpressionAccess().getTML_EXISTSTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistsTmlExpression__Group__0__Impl"


    // $ANTLR start "rule__ExistsTmlExpression__Group__1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1132:1: rule__ExistsTmlExpression__Group__1 : rule__ExistsTmlExpression__Group__1__Impl rule__ExistsTmlExpression__Group__2 ;
    public final void rule__ExistsTmlExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1136:1: ( rule__ExistsTmlExpression__Group__1__Impl rule__ExistsTmlExpression__Group__2 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1137:2: rule__ExistsTmlExpression__Group__1__Impl rule__ExistsTmlExpression__Group__2
            {
            pushFollow(FOLLOW_rule__ExistsTmlExpression__Group__1__Impl_in_rule__ExistsTmlExpression__Group__12423);
            rule__ExistsTmlExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExistsTmlExpression__Group__2_in_rule__ExistsTmlExpression__Group__12426);
            rule__ExistsTmlExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistsTmlExpression__Group__1"


    // $ANTLR start "rule__ExistsTmlExpression__Group__1__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1144:1: rule__ExistsTmlExpression__Group__1__Impl : ( RULE_SQBRACKET_OPEN ) ;
    public final void rule__ExistsTmlExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1148:1: ( ( RULE_SQBRACKET_OPEN ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1149:1: ( RULE_SQBRACKET_OPEN )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1149:1: ( RULE_SQBRACKET_OPEN )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1150:1: RULE_SQBRACKET_OPEN
            {
             before(grammarAccess.getExistsTmlExpressionAccess().getSQBRACKET_OPENTerminalRuleCall_1()); 
            match(input,RULE_SQBRACKET_OPEN,FOLLOW_RULE_SQBRACKET_OPEN_in_rule__ExistsTmlExpression__Group__1__Impl2453); 
             after(grammarAccess.getExistsTmlExpressionAccess().getSQBRACKET_OPENTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistsTmlExpression__Group__1__Impl"


    // $ANTLR start "rule__ExistsTmlExpression__Group__2"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1161:1: rule__ExistsTmlExpression__Group__2 : rule__ExistsTmlExpression__Group__2__Impl rule__ExistsTmlExpression__Group__3 ;
    public final void rule__ExistsTmlExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1165:1: ( rule__ExistsTmlExpression__Group__2__Impl rule__ExistsTmlExpression__Group__3 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1166:2: rule__ExistsTmlExpression__Group__2__Impl rule__ExistsTmlExpression__Group__3
            {
            pushFollow(FOLLOW_rule__ExistsTmlExpression__Group__2__Impl_in_rule__ExistsTmlExpression__Group__22482);
            rule__ExistsTmlExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExistsTmlExpression__Group__3_in_rule__ExistsTmlExpression__Group__22485);
            rule__ExistsTmlExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistsTmlExpression__Group__2"


    // $ANTLR start "rule__ExistsTmlExpression__Group__2__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1173:1: rule__ExistsTmlExpression__Group__2__Impl : ( ( rule__ExistsTmlExpression__AbsoluteAssignment_2 )? ) ;
    public final void rule__ExistsTmlExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1177:1: ( ( ( rule__ExistsTmlExpression__AbsoluteAssignment_2 )? ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1178:1: ( ( rule__ExistsTmlExpression__AbsoluteAssignment_2 )? )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1178:1: ( ( rule__ExistsTmlExpression__AbsoluteAssignment_2 )? )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1179:1: ( rule__ExistsTmlExpression__AbsoluteAssignment_2 )?
            {
             before(grammarAccess.getExistsTmlExpressionAccess().getAbsoluteAssignment_2()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1180:1: ( rule__ExistsTmlExpression__AbsoluteAssignment_2 )?
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1180:2: rule__ExistsTmlExpression__AbsoluteAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ExistsTmlExpression__AbsoluteAssignment_2_in_rule__ExistsTmlExpression__Group__2__Impl2512);
                    rule__ExistsTmlExpression__AbsoluteAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExistsTmlExpressionAccess().getAbsoluteAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistsTmlExpression__Group__2__Impl"


    // $ANTLR start "rule__ExistsTmlExpression__Group__3"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1190:1: rule__ExistsTmlExpression__Group__3 : rule__ExistsTmlExpression__Group__3__Impl rule__ExistsTmlExpression__Group__4 ;
    public final void rule__ExistsTmlExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1194:1: ( rule__ExistsTmlExpression__Group__3__Impl rule__ExistsTmlExpression__Group__4 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1195:2: rule__ExistsTmlExpression__Group__3__Impl rule__ExistsTmlExpression__Group__4
            {
            pushFollow(FOLLOW_rule__ExistsTmlExpression__Group__3__Impl_in_rule__ExistsTmlExpression__Group__32543);
            rule__ExistsTmlExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExistsTmlExpression__Group__4_in_rule__ExistsTmlExpression__Group__32546);
            rule__ExistsTmlExpression__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistsTmlExpression__Group__3"


    // $ANTLR start "rule__ExistsTmlExpression__Group__3__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1202:1: rule__ExistsTmlExpression__Group__3__Impl : ( ( rule__ExistsTmlExpression__ParamAssignment_3 )? ) ;
    public final void rule__ExistsTmlExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1206:1: ( ( ( rule__ExistsTmlExpression__ParamAssignment_3 )? ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1207:1: ( ( rule__ExistsTmlExpression__ParamAssignment_3 )? )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1207:1: ( ( rule__ExistsTmlExpression__ParamAssignment_3 )? )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1208:1: ( rule__ExistsTmlExpression__ParamAssignment_3 )?
            {
             before(grammarAccess.getExistsTmlExpressionAccess().getParamAssignment_3()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1209:1: ( rule__ExistsTmlExpression__ParamAssignment_3 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_AT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1209:2: rule__ExistsTmlExpression__ParamAssignment_3
                    {
                    pushFollow(FOLLOW_rule__ExistsTmlExpression__ParamAssignment_3_in_rule__ExistsTmlExpression__Group__3__Impl2573);
                    rule__ExistsTmlExpression__ParamAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExistsTmlExpressionAccess().getParamAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistsTmlExpression__Group__3__Impl"


    // $ANTLR start "rule__ExistsTmlExpression__Group__4"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1219:1: rule__ExistsTmlExpression__Group__4 : rule__ExistsTmlExpression__Group__4__Impl rule__ExistsTmlExpression__Group__5 ;
    public final void rule__ExistsTmlExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1223:1: ( rule__ExistsTmlExpression__Group__4__Impl rule__ExistsTmlExpression__Group__5 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1224:2: rule__ExistsTmlExpression__Group__4__Impl rule__ExistsTmlExpression__Group__5
            {
            pushFollow(FOLLOW_rule__ExistsTmlExpression__Group__4__Impl_in_rule__ExistsTmlExpression__Group__42604);
            rule__ExistsTmlExpression__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExistsTmlExpression__Group__5_in_rule__ExistsTmlExpression__Group__42607);
            rule__ExistsTmlExpression__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistsTmlExpression__Group__4"


    // $ANTLR start "rule__ExistsTmlExpression__Group__4__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1231:1: rule__ExistsTmlExpression__Group__4__Impl : ( ( rule__ExistsTmlExpression__ElementsAssignment_4 ) ) ;
    public final void rule__ExistsTmlExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1235:1: ( ( ( rule__ExistsTmlExpression__ElementsAssignment_4 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1236:1: ( ( rule__ExistsTmlExpression__ElementsAssignment_4 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1236:1: ( ( rule__ExistsTmlExpression__ElementsAssignment_4 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1237:1: ( rule__ExistsTmlExpression__ElementsAssignment_4 )
            {
             before(grammarAccess.getExistsTmlExpressionAccess().getElementsAssignment_4()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1238:1: ( rule__ExistsTmlExpression__ElementsAssignment_4 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1238:2: rule__ExistsTmlExpression__ElementsAssignment_4
            {
            pushFollow(FOLLOW_rule__ExistsTmlExpression__ElementsAssignment_4_in_rule__ExistsTmlExpression__Group__4__Impl2634);
            rule__ExistsTmlExpression__ElementsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getExistsTmlExpressionAccess().getElementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistsTmlExpression__Group__4__Impl"


    // $ANTLR start "rule__ExistsTmlExpression__Group__5"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1248:1: rule__ExistsTmlExpression__Group__5 : rule__ExistsTmlExpression__Group__5__Impl rule__ExistsTmlExpression__Group__6 ;
    public final void rule__ExistsTmlExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1252:1: ( rule__ExistsTmlExpression__Group__5__Impl rule__ExistsTmlExpression__Group__6 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1253:2: rule__ExistsTmlExpression__Group__5__Impl rule__ExistsTmlExpression__Group__6
            {
            pushFollow(FOLLOW_rule__ExistsTmlExpression__Group__5__Impl_in_rule__ExistsTmlExpression__Group__52664);
            rule__ExistsTmlExpression__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExistsTmlExpression__Group__6_in_rule__ExistsTmlExpression__Group__52667);
            rule__ExistsTmlExpression__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistsTmlExpression__Group__5"


    // $ANTLR start "rule__ExistsTmlExpression__Group__5__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1260:1: rule__ExistsTmlExpression__Group__5__Impl : ( ( rule__ExistsTmlExpression__Group_5__0 )* ) ;
    public final void rule__ExistsTmlExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1264:1: ( ( ( rule__ExistsTmlExpression__Group_5__0 )* ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1265:1: ( ( rule__ExistsTmlExpression__Group_5__0 )* )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1265:1: ( ( rule__ExistsTmlExpression__Group_5__0 )* )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1266:1: ( rule__ExistsTmlExpression__Group_5__0 )*
            {
             before(grammarAccess.getExistsTmlExpressionAccess().getGroup_5()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1267:1: ( rule__ExistsTmlExpression__Group_5__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_TML_SEPARATOR) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1267:2: rule__ExistsTmlExpression__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__ExistsTmlExpression__Group_5__0_in_rule__ExistsTmlExpression__Group__5__Impl2694);
            	    rule__ExistsTmlExpression__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getExistsTmlExpressionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistsTmlExpression__Group__5__Impl"


    // $ANTLR start "rule__ExistsTmlExpression__Group__6"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1277:1: rule__ExistsTmlExpression__Group__6 : rule__ExistsTmlExpression__Group__6__Impl ;
    public final void rule__ExistsTmlExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1281:1: ( rule__ExistsTmlExpression__Group__6__Impl )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1282:2: rule__ExistsTmlExpression__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ExistsTmlExpression__Group__6__Impl_in_rule__ExistsTmlExpression__Group__62725);
            rule__ExistsTmlExpression__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistsTmlExpression__Group__6"


    // $ANTLR start "rule__ExistsTmlExpression__Group__6__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1288:1: rule__ExistsTmlExpression__Group__6__Impl : ( RULE_SQBRACKET_CLOSE ) ;
    public final void rule__ExistsTmlExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1292:1: ( ( RULE_SQBRACKET_CLOSE ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1293:1: ( RULE_SQBRACKET_CLOSE )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1293:1: ( RULE_SQBRACKET_CLOSE )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1294:1: RULE_SQBRACKET_CLOSE
            {
             before(grammarAccess.getExistsTmlExpressionAccess().getSQBRACKET_CLOSETerminalRuleCall_6()); 
            match(input,RULE_SQBRACKET_CLOSE,FOLLOW_RULE_SQBRACKET_CLOSE_in_rule__ExistsTmlExpression__Group__6__Impl2752); 
             after(grammarAccess.getExistsTmlExpressionAccess().getSQBRACKET_CLOSETerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistsTmlExpression__Group__6__Impl"


    // $ANTLR start "rule__ExistsTmlExpression__Group_5__0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1319:1: rule__ExistsTmlExpression__Group_5__0 : rule__ExistsTmlExpression__Group_5__0__Impl rule__ExistsTmlExpression__Group_5__1 ;
    public final void rule__ExistsTmlExpression__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1323:1: ( rule__ExistsTmlExpression__Group_5__0__Impl rule__ExistsTmlExpression__Group_5__1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1324:2: rule__ExistsTmlExpression__Group_5__0__Impl rule__ExistsTmlExpression__Group_5__1
            {
            pushFollow(FOLLOW_rule__ExistsTmlExpression__Group_5__0__Impl_in_rule__ExistsTmlExpression__Group_5__02795);
            rule__ExistsTmlExpression__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExistsTmlExpression__Group_5__1_in_rule__ExistsTmlExpression__Group_5__02798);
            rule__ExistsTmlExpression__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistsTmlExpression__Group_5__0"


    // $ANTLR start "rule__ExistsTmlExpression__Group_5__0__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1331:1: rule__ExistsTmlExpression__Group_5__0__Impl : ( RULE_TML_SEPARATOR ) ;
    public final void rule__ExistsTmlExpression__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1335:1: ( ( RULE_TML_SEPARATOR ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1336:1: ( RULE_TML_SEPARATOR )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1336:1: ( RULE_TML_SEPARATOR )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1337:1: RULE_TML_SEPARATOR
            {
             before(grammarAccess.getExistsTmlExpressionAccess().getTML_SEPARATORTerminalRuleCall_5_0()); 
            match(input,RULE_TML_SEPARATOR,FOLLOW_RULE_TML_SEPARATOR_in_rule__ExistsTmlExpression__Group_5__0__Impl2825); 
             after(grammarAccess.getExistsTmlExpressionAccess().getTML_SEPARATORTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistsTmlExpression__Group_5__0__Impl"


    // $ANTLR start "rule__ExistsTmlExpression__Group_5__1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1348:1: rule__ExistsTmlExpression__Group_5__1 : rule__ExistsTmlExpression__Group_5__1__Impl ;
    public final void rule__ExistsTmlExpression__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1352:1: ( rule__ExistsTmlExpression__Group_5__1__Impl )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1353:2: rule__ExistsTmlExpression__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__ExistsTmlExpression__Group_5__1__Impl_in_rule__ExistsTmlExpression__Group_5__12854);
            rule__ExistsTmlExpression__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistsTmlExpression__Group_5__1"


    // $ANTLR start "rule__ExistsTmlExpression__Group_5__1__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1359:1: rule__ExistsTmlExpression__Group_5__1__Impl : ( ( rule__ExistsTmlExpression__ElementsAssignment_5_1 ) ) ;
    public final void rule__ExistsTmlExpression__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1363:1: ( ( ( rule__ExistsTmlExpression__ElementsAssignment_5_1 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1364:1: ( ( rule__ExistsTmlExpression__ElementsAssignment_5_1 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1364:1: ( ( rule__ExistsTmlExpression__ElementsAssignment_5_1 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1365:1: ( rule__ExistsTmlExpression__ElementsAssignment_5_1 )
            {
             before(grammarAccess.getExistsTmlExpressionAccess().getElementsAssignment_5_1()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1366:1: ( rule__ExistsTmlExpression__ElementsAssignment_5_1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1366:2: rule__ExistsTmlExpression__ElementsAssignment_5_1
            {
            pushFollow(FOLLOW_rule__ExistsTmlExpression__ElementsAssignment_5_1_in_rule__ExistsTmlExpression__Group_5__1__Impl2881);
            rule__ExistsTmlExpression__ElementsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getExistsTmlExpressionAccess().getElementsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistsTmlExpression__Group_5__1__Impl"


    // $ANTLR start "rule__MapReferenceParams__Group__0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1380:1: rule__MapReferenceParams__Group__0 : rule__MapReferenceParams__Group__0__Impl rule__MapReferenceParams__Group__1 ;
    public final void rule__MapReferenceParams__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1384:1: ( rule__MapReferenceParams__Group__0__Impl rule__MapReferenceParams__Group__1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1385:2: rule__MapReferenceParams__Group__0__Impl rule__MapReferenceParams__Group__1
            {
            pushFollow(FOLLOW_rule__MapReferenceParams__Group__0__Impl_in_rule__MapReferenceParams__Group__02915);
            rule__MapReferenceParams__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapReferenceParams__Group__1_in_rule__MapReferenceParams__Group__02918);
            rule__MapReferenceParams__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapReferenceParams__Group__0"


    // $ANTLR start "rule__MapReferenceParams__Group__0__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1392:1: rule__MapReferenceParams__Group__0__Impl : ( RULE_BRACKET_OPEN ) ;
    public final void rule__MapReferenceParams__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1396:1: ( ( RULE_BRACKET_OPEN ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1397:1: ( RULE_BRACKET_OPEN )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1397:1: ( RULE_BRACKET_OPEN )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1398:1: RULE_BRACKET_OPEN
            {
             before(grammarAccess.getMapReferenceParamsAccess().getBRACKET_OPENTerminalRuleCall_0()); 
            match(input,RULE_BRACKET_OPEN,FOLLOW_RULE_BRACKET_OPEN_in_rule__MapReferenceParams__Group__0__Impl2945); 
             after(grammarAccess.getMapReferenceParamsAccess().getBRACKET_OPENTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapReferenceParams__Group__0__Impl"


    // $ANTLR start "rule__MapReferenceParams__Group__1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1409:1: rule__MapReferenceParams__Group__1 : rule__MapReferenceParams__Group__1__Impl rule__MapReferenceParams__Group__2 ;
    public final void rule__MapReferenceParams__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1413:1: ( rule__MapReferenceParams__Group__1__Impl rule__MapReferenceParams__Group__2 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1414:2: rule__MapReferenceParams__Group__1__Impl rule__MapReferenceParams__Group__2
            {
            pushFollow(FOLLOW_rule__MapReferenceParams__Group__1__Impl_in_rule__MapReferenceParams__Group__12974);
            rule__MapReferenceParams__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapReferenceParams__Group__2_in_rule__MapReferenceParams__Group__12977);
            rule__MapReferenceParams__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapReferenceParams__Group__1"


    // $ANTLR start "rule__MapReferenceParams__Group__1__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1421:1: rule__MapReferenceParams__Group__1__Impl : ( ( rule__MapReferenceParams__GetterParamsAssignment_1 ) ) ;
    public final void rule__MapReferenceParams__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1425:1: ( ( ( rule__MapReferenceParams__GetterParamsAssignment_1 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1426:1: ( ( rule__MapReferenceParams__GetterParamsAssignment_1 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1426:1: ( ( rule__MapReferenceParams__GetterParamsAssignment_1 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1427:1: ( rule__MapReferenceParams__GetterParamsAssignment_1 )
            {
             before(grammarAccess.getMapReferenceParamsAccess().getGetterParamsAssignment_1()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1428:1: ( rule__MapReferenceParams__GetterParamsAssignment_1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1428:2: rule__MapReferenceParams__GetterParamsAssignment_1
            {
            pushFollow(FOLLOW_rule__MapReferenceParams__GetterParamsAssignment_1_in_rule__MapReferenceParams__Group__1__Impl3004);
            rule__MapReferenceParams__GetterParamsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMapReferenceParamsAccess().getGetterParamsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapReferenceParams__Group__1__Impl"


    // $ANTLR start "rule__MapReferenceParams__Group__2"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1438:1: rule__MapReferenceParams__Group__2 : rule__MapReferenceParams__Group__2__Impl rule__MapReferenceParams__Group__3 ;
    public final void rule__MapReferenceParams__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1442:1: ( rule__MapReferenceParams__Group__2__Impl rule__MapReferenceParams__Group__3 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1443:2: rule__MapReferenceParams__Group__2__Impl rule__MapReferenceParams__Group__3
            {
            pushFollow(FOLLOW_rule__MapReferenceParams__Group__2__Impl_in_rule__MapReferenceParams__Group__23034);
            rule__MapReferenceParams__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapReferenceParams__Group__3_in_rule__MapReferenceParams__Group__23037);
            rule__MapReferenceParams__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapReferenceParams__Group__2"


    // $ANTLR start "rule__MapReferenceParams__Group__2__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1450:1: rule__MapReferenceParams__Group__2__Impl : ( ( rule__MapReferenceParams__Group_2__0 )* ) ;
    public final void rule__MapReferenceParams__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1454:1: ( ( ( rule__MapReferenceParams__Group_2__0 )* ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1455:1: ( ( rule__MapReferenceParams__Group_2__0 )* )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1455:1: ( ( rule__MapReferenceParams__Group_2__0 )* )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1456:1: ( rule__MapReferenceParams__Group_2__0 )*
            {
             before(grammarAccess.getMapReferenceParamsAccess().getGroup_2()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1457:1: ( rule__MapReferenceParams__Group_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_COMMA) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1457:2: rule__MapReferenceParams__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__MapReferenceParams__Group_2__0_in_rule__MapReferenceParams__Group__2__Impl3064);
            	    rule__MapReferenceParams__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getMapReferenceParamsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapReferenceParams__Group__2__Impl"


    // $ANTLR start "rule__MapReferenceParams__Group__3"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1467:1: rule__MapReferenceParams__Group__3 : rule__MapReferenceParams__Group__3__Impl ;
    public final void rule__MapReferenceParams__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1471:1: ( rule__MapReferenceParams__Group__3__Impl )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1472:2: rule__MapReferenceParams__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MapReferenceParams__Group__3__Impl_in_rule__MapReferenceParams__Group__33095);
            rule__MapReferenceParams__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapReferenceParams__Group__3"


    // $ANTLR start "rule__MapReferenceParams__Group__3__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1478:1: rule__MapReferenceParams__Group__3__Impl : ( RULE_BRACKET_CLOSE ) ;
    public final void rule__MapReferenceParams__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1482:1: ( ( RULE_BRACKET_CLOSE ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1483:1: ( RULE_BRACKET_CLOSE )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1483:1: ( RULE_BRACKET_CLOSE )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1484:1: RULE_BRACKET_CLOSE
            {
             before(grammarAccess.getMapReferenceParamsAccess().getBRACKET_CLOSETerminalRuleCall_3()); 
            match(input,RULE_BRACKET_CLOSE,FOLLOW_RULE_BRACKET_CLOSE_in_rule__MapReferenceParams__Group__3__Impl3122); 
             after(grammarAccess.getMapReferenceParamsAccess().getBRACKET_CLOSETerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapReferenceParams__Group__3__Impl"


    // $ANTLR start "rule__MapReferenceParams__Group_2__0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1503:1: rule__MapReferenceParams__Group_2__0 : rule__MapReferenceParams__Group_2__0__Impl rule__MapReferenceParams__Group_2__1 ;
    public final void rule__MapReferenceParams__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1507:1: ( rule__MapReferenceParams__Group_2__0__Impl rule__MapReferenceParams__Group_2__1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1508:2: rule__MapReferenceParams__Group_2__0__Impl rule__MapReferenceParams__Group_2__1
            {
            pushFollow(FOLLOW_rule__MapReferenceParams__Group_2__0__Impl_in_rule__MapReferenceParams__Group_2__03159);
            rule__MapReferenceParams__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapReferenceParams__Group_2__1_in_rule__MapReferenceParams__Group_2__03162);
            rule__MapReferenceParams__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapReferenceParams__Group_2__0"


    // $ANTLR start "rule__MapReferenceParams__Group_2__0__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1515:1: rule__MapReferenceParams__Group_2__0__Impl : ( RULE_COMMA ) ;
    public final void rule__MapReferenceParams__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1519:1: ( ( RULE_COMMA ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1520:1: ( RULE_COMMA )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1520:1: ( RULE_COMMA )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1521:1: RULE_COMMA
            {
             before(grammarAccess.getMapReferenceParamsAccess().getCOMMATerminalRuleCall_2_0()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__MapReferenceParams__Group_2__0__Impl3189); 
             after(grammarAccess.getMapReferenceParamsAccess().getCOMMATerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapReferenceParams__Group_2__0__Impl"


    // $ANTLR start "rule__MapReferenceParams__Group_2__1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1532:1: rule__MapReferenceParams__Group_2__1 : rule__MapReferenceParams__Group_2__1__Impl ;
    public final void rule__MapReferenceParams__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1536:1: ( rule__MapReferenceParams__Group_2__1__Impl )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1537:2: rule__MapReferenceParams__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__MapReferenceParams__Group_2__1__Impl_in_rule__MapReferenceParams__Group_2__13218);
            rule__MapReferenceParams__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapReferenceParams__Group_2__1"


    // $ANTLR start "rule__MapReferenceParams__Group_2__1__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1543:1: rule__MapReferenceParams__Group_2__1__Impl : ( ( rule__MapReferenceParams__GetterParamsAssignment_2_1 ) ) ;
    public final void rule__MapReferenceParams__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1547:1: ( ( ( rule__MapReferenceParams__GetterParamsAssignment_2_1 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1548:1: ( ( rule__MapReferenceParams__GetterParamsAssignment_2_1 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1548:1: ( ( rule__MapReferenceParams__GetterParamsAssignment_2_1 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1549:1: ( rule__MapReferenceParams__GetterParamsAssignment_2_1 )
            {
             before(grammarAccess.getMapReferenceParamsAccess().getGetterParamsAssignment_2_1()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1550:1: ( rule__MapReferenceParams__GetterParamsAssignment_2_1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1550:2: rule__MapReferenceParams__GetterParamsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__MapReferenceParams__GetterParamsAssignment_2_1_in_rule__MapReferenceParams__Group_2__1__Impl3245);
            rule__MapReferenceParams__GetterParamsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMapReferenceParamsAccess().getGetterParamsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapReferenceParams__Group_2__1__Impl"


    // $ANTLR start "rule__MapGetReference__Group__0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1564:1: rule__MapGetReference__Group__0 : rule__MapGetReference__Group__0__Impl rule__MapGetReference__Group__1 ;
    public final void rule__MapGetReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1568:1: ( rule__MapGetReference__Group__0__Impl rule__MapGetReference__Group__1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1569:2: rule__MapGetReference__Group__0__Impl rule__MapGetReference__Group__1
            {
            pushFollow(FOLLOW_rule__MapGetReference__Group__0__Impl_in_rule__MapGetReference__Group__03279);
            rule__MapGetReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapGetReference__Group__1_in_rule__MapGetReference__Group__03282);
            rule__MapGetReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapGetReference__Group__0"


    // $ANTLR start "rule__MapGetReference__Group__0__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1576:1: rule__MapGetReference__Group__0__Impl : ( ( rule__MapGetReference__OperationsAssignment_0 ) ) ;
    public final void rule__MapGetReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1580:1: ( ( ( rule__MapGetReference__OperationsAssignment_0 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1581:1: ( ( rule__MapGetReference__OperationsAssignment_0 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1581:1: ( ( rule__MapGetReference__OperationsAssignment_0 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1582:1: ( rule__MapGetReference__OperationsAssignment_0 )
            {
             before(grammarAccess.getMapGetReferenceAccess().getOperationsAssignment_0()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1583:1: ( rule__MapGetReference__OperationsAssignment_0 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1583:2: rule__MapGetReference__OperationsAssignment_0
            {
            pushFollow(FOLLOW_rule__MapGetReference__OperationsAssignment_0_in_rule__MapGetReference__Group__0__Impl3309);
            rule__MapGetReference__OperationsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMapGetReferenceAccess().getOperationsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapGetReference__Group__0__Impl"


    // $ANTLR start "rule__MapGetReference__Group__1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1593:1: rule__MapGetReference__Group__1 : rule__MapGetReference__Group__1__Impl rule__MapGetReference__Group__2 ;
    public final void rule__MapGetReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1597:1: ( rule__MapGetReference__Group__1__Impl rule__MapGetReference__Group__2 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1598:2: rule__MapGetReference__Group__1__Impl rule__MapGetReference__Group__2
            {
            pushFollow(FOLLOW_rule__MapGetReference__Group__1__Impl_in_rule__MapGetReference__Group__13339);
            rule__MapGetReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapGetReference__Group__2_in_rule__MapGetReference__Group__13342);
            rule__MapGetReference__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapGetReference__Group__1"


    // $ANTLR start "rule__MapGetReference__Group__1__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1605:1: rule__MapGetReference__Group__1__Impl : ( ( rule__MapGetReference__Group_1__0 )* ) ;
    public final void rule__MapGetReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1609:1: ( ( ( rule__MapGetReference__Group_1__0 )* ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1610:1: ( ( rule__MapGetReference__Group_1__0 )* )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1610:1: ( ( rule__MapGetReference__Group_1__0 )* )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1611:1: ( rule__MapGetReference__Group_1__0 )*
            {
             before(grammarAccess.getMapGetReferenceAccess().getGroup_1()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1612:1: ( rule__MapGetReference__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_PARENT) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1612:2: rule__MapGetReference__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MapGetReference__Group_1__0_in_rule__MapGetReference__Group__1__Impl3369);
            	    rule__MapGetReference__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getMapGetReferenceAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapGetReference__Group__1__Impl"


    // $ANTLR start "rule__MapGetReference__Group__2"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1622:1: rule__MapGetReference__Group__2 : rule__MapGetReference__Group__2__Impl rule__MapGetReference__Group__3 ;
    public final void rule__MapGetReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1626:1: ( rule__MapGetReference__Group__2__Impl rule__MapGetReference__Group__3 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1627:2: rule__MapGetReference__Group__2__Impl rule__MapGetReference__Group__3
            {
            pushFollow(FOLLOW_rule__MapGetReference__Group__2__Impl_in_rule__MapGetReference__Group__23400);
            rule__MapGetReference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapGetReference__Group__3_in_rule__MapGetReference__Group__23403);
            rule__MapGetReference__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapGetReference__Group__2"


    // $ANTLR start "rule__MapGetReference__Group__2__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1634:1: rule__MapGetReference__Group__2__Impl : ( ( rule__MapGetReference__ElementsAssignment_2 ) ) ;
    public final void rule__MapGetReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1638:1: ( ( ( rule__MapGetReference__ElementsAssignment_2 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1639:1: ( ( rule__MapGetReference__ElementsAssignment_2 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1639:1: ( ( rule__MapGetReference__ElementsAssignment_2 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1640:1: ( rule__MapGetReference__ElementsAssignment_2 )
            {
             before(grammarAccess.getMapGetReferenceAccess().getElementsAssignment_2()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1641:1: ( rule__MapGetReference__ElementsAssignment_2 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1641:2: rule__MapGetReference__ElementsAssignment_2
            {
            pushFollow(FOLLOW_rule__MapGetReference__ElementsAssignment_2_in_rule__MapGetReference__Group__2__Impl3430);
            rule__MapGetReference__ElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMapGetReferenceAccess().getElementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapGetReference__Group__2__Impl"


    // $ANTLR start "rule__MapGetReference__Group__3"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1651:1: rule__MapGetReference__Group__3 : rule__MapGetReference__Group__3__Impl ;
    public final void rule__MapGetReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1655:1: ( rule__MapGetReference__Group__3__Impl )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1656:2: rule__MapGetReference__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__MapGetReference__Group__3__Impl_in_rule__MapGetReference__Group__33460);
            rule__MapGetReference__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapGetReference__Group__3"


    // $ANTLR start "rule__MapGetReference__Group__3__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1662:1: rule__MapGetReference__Group__3__Impl : ( ( rule__MapGetReference__ReferenceParamsAssignment_3 )? ) ;
    public final void rule__MapGetReference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1666:1: ( ( ( rule__MapGetReference__ReferenceParamsAssignment_3 )? ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1667:1: ( ( rule__MapGetReference__ReferenceParamsAssignment_3 )? )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1667:1: ( ( rule__MapGetReference__ReferenceParamsAssignment_3 )? )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1668:1: ( rule__MapGetReference__ReferenceParamsAssignment_3 )?
            {
             before(grammarAccess.getMapGetReferenceAccess().getReferenceParamsAssignment_3()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1669:1: ( rule__MapGetReference__ReferenceParamsAssignment_3 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_BRACKET_OPEN) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1669:2: rule__MapGetReference__ReferenceParamsAssignment_3
                    {
                    pushFollow(FOLLOW_rule__MapGetReference__ReferenceParamsAssignment_3_in_rule__MapGetReference__Group__3__Impl3487);
                    rule__MapGetReference__ReferenceParamsAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMapGetReferenceAccess().getReferenceParamsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapGetReference__Group__3__Impl"


    // $ANTLR start "rule__MapGetReference__Group_1__0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1687:1: rule__MapGetReference__Group_1__0 : rule__MapGetReference__Group_1__0__Impl rule__MapGetReference__Group_1__1 ;
    public final void rule__MapGetReference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1691:1: ( rule__MapGetReference__Group_1__0__Impl rule__MapGetReference__Group_1__1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1692:2: rule__MapGetReference__Group_1__0__Impl rule__MapGetReference__Group_1__1
            {
            pushFollow(FOLLOW_rule__MapGetReference__Group_1__0__Impl_in_rule__MapGetReference__Group_1__03526);
            rule__MapGetReference__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MapGetReference__Group_1__1_in_rule__MapGetReference__Group_1__03529);
            rule__MapGetReference__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapGetReference__Group_1__0"


    // $ANTLR start "rule__MapGetReference__Group_1__0__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1699:1: rule__MapGetReference__Group_1__0__Impl : ( ( rule__MapGetReference__ElementsAssignment_1_0 ) ) ;
    public final void rule__MapGetReference__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1703:1: ( ( ( rule__MapGetReference__ElementsAssignment_1_0 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1704:1: ( ( rule__MapGetReference__ElementsAssignment_1_0 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1704:1: ( ( rule__MapGetReference__ElementsAssignment_1_0 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1705:1: ( rule__MapGetReference__ElementsAssignment_1_0 )
            {
             before(grammarAccess.getMapGetReferenceAccess().getElementsAssignment_1_0()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1706:1: ( rule__MapGetReference__ElementsAssignment_1_0 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1706:2: rule__MapGetReference__ElementsAssignment_1_0
            {
            pushFollow(FOLLOW_rule__MapGetReference__ElementsAssignment_1_0_in_rule__MapGetReference__Group_1__0__Impl3556);
            rule__MapGetReference__ElementsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMapGetReferenceAccess().getElementsAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapGetReference__Group_1__0__Impl"


    // $ANTLR start "rule__MapGetReference__Group_1__1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1716:1: rule__MapGetReference__Group_1__1 : rule__MapGetReference__Group_1__1__Impl ;
    public final void rule__MapGetReference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1720:1: ( rule__MapGetReference__Group_1__1__Impl )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1721:2: rule__MapGetReference__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__MapGetReference__Group_1__1__Impl_in_rule__MapGetReference__Group_1__13586);
            rule__MapGetReference__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapGetReference__Group_1__1"


    // $ANTLR start "rule__MapGetReference__Group_1__1__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1727:1: rule__MapGetReference__Group_1__1__Impl : ( RULE_TML_SEPARATOR ) ;
    public final void rule__MapGetReference__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1731:1: ( ( RULE_TML_SEPARATOR ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1732:1: ( RULE_TML_SEPARATOR )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1732:1: ( RULE_TML_SEPARATOR )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1733:1: RULE_TML_SEPARATOR
            {
             before(grammarAccess.getMapGetReferenceAccess().getTML_SEPARATORTerminalRuleCall_1_1()); 
            match(input,RULE_TML_SEPARATOR,FOLLOW_RULE_TML_SEPARATOR_in_rule__MapGetReference__Group_1__1__Impl3613); 
             after(grammarAccess.getMapGetReferenceAccess().getTML_SEPARATORTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapGetReference__Group_1__1__Impl"


    // $ANTLR start "rule__OrExpression__Group__0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1748:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1752:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1753:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__03646);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__03649);
            rule__OrExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__0"


    // $ANTLR start "rule__OrExpression__Group__0__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1760:1: rule__OrExpression__Group__0__Impl : ( ( rule__OrExpression__ParametersAssignment_0 ) ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1764:1: ( ( ( rule__OrExpression__ParametersAssignment_0 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1765:1: ( ( rule__OrExpression__ParametersAssignment_0 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1765:1: ( ( rule__OrExpression__ParametersAssignment_0 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1766:1: ( rule__OrExpression__ParametersAssignment_0 )
            {
             before(grammarAccess.getOrExpressionAccess().getParametersAssignment_0()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1767:1: ( rule__OrExpression__ParametersAssignment_0 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1767:2: rule__OrExpression__ParametersAssignment_0
            {
            pushFollow(FOLLOW_rule__OrExpression__ParametersAssignment_0_in_rule__OrExpression__Group__0__Impl3676);
            rule__OrExpression__ParametersAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getParametersAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__0__Impl"


    // $ANTLR start "rule__OrExpression__Group__1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1777:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1781:1: ( rule__OrExpression__Group__1__Impl )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1782:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__13706);
            rule__OrExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__1"


    // $ANTLR start "rule__OrExpression__Group__1__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1788:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1792:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1793:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1793:1: ( ( rule__OrExpression__Group_1__0 )* )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1794:1: ( rule__OrExpression__Group_1__0 )*
            {
             before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1795:1: ( rule__OrExpression__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_OR) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1795:2: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl3733);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getOrExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1809:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1813:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1814:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__03768);
            rule__OrExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__03771);
            rule__OrExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0"


    // $ANTLR start "rule__OrExpression__Group_1__0__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1821:1: rule__OrExpression__Group_1__0__Impl : ( ( rule__OrExpression__OperationsAssignment_1_0 ) ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1825:1: ( ( ( rule__OrExpression__OperationsAssignment_1_0 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1826:1: ( ( rule__OrExpression__OperationsAssignment_1_0 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1826:1: ( ( rule__OrExpression__OperationsAssignment_1_0 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1827:1: ( rule__OrExpression__OperationsAssignment_1_0 )
            {
             before(grammarAccess.getOrExpressionAccess().getOperationsAssignment_1_0()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1828:1: ( rule__OrExpression__OperationsAssignment_1_0 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1828:2: rule__OrExpression__OperationsAssignment_1_0
            {
            pushFollow(FOLLOW_rule__OrExpression__OperationsAssignment_1_0_in_rule__OrExpression__Group_1__0__Impl3798);
            rule__OrExpression__OperationsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getOperationsAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1838:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1842:1: ( rule__OrExpression__Group_1__1__Impl )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1843:2: rule__OrExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__13828);
            rule__OrExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__1"


    // $ANTLR start "rule__OrExpression__Group_1__1__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1849:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__ParametersAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1853:1: ( ( ( rule__OrExpression__ParametersAssignment_1_1 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1854:1: ( ( rule__OrExpression__ParametersAssignment_1_1 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1854:1: ( ( rule__OrExpression__ParametersAssignment_1_1 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1855:1: ( rule__OrExpression__ParametersAssignment_1_1 )
            {
             before(grammarAccess.getOrExpressionAccess().getParametersAssignment_1_1()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1856:1: ( rule__OrExpression__ParametersAssignment_1_1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1856:2: rule__OrExpression__ParametersAssignment_1_1
            {
            pushFollow(FOLLOW_rule__OrExpression__ParametersAssignment_1_1_in_rule__OrExpression__Group_1__1__Impl3855);
            rule__OrExpression__ParametersAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getParametersAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AndExpression__Group__0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1870:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1874:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1875:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__03889);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__03892);
            rule__AndExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0"


    // $ANTLR start "rule__AndExpression__Group__0__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1882:1: rule__AndExpression__Group__0__Impl : ( ( rule__AndExpression__ParametersAssignment_0 ) ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1886:1: ( ( ( rule__AndExpression__ParametersAssignment_0 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1887:1: ( ( rule__AndExpression__ParametersAssignment_0 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1887:1: ( ( rule__AndExpression__ParametersAssignment_0 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1888:1: ( rule__AndExpression__ParametersAssignment_0 )
            {
             before(grammarAccess.getAndExpressionAccess().getParametersAssignment_0()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1889:1: ( rule__AndExpression__ParametersAssignment_0 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1889:2: rule__AndExpression__ParametersAssignment_0
            {
            pushFollow(FOLLOW_rule__AndExpression__ParametersAssignment_0_in_rule__AndExpression__Group__0__Impl3919);
            rule__AndExpression__ParametersAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getParametersAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0__Impl"


    // $ANTLR start "rule__AndExpression__Group__1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1899:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1903:1: ( rule__AndExpression__Group__1__Impl )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1904:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__13949);
            rule__AndExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1"


    // $ANTLR start "rule__AndExpression__Group__1__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1910:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1914:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1915:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1915:1: ( ( rule__AndExpression__Group_1__0 )* )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1916:1: ( rule__AndExpression__Group_1__0 )*
            {
             before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1917:1: ( rule__AndExpression__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_AND) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1917:2: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl3976);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getAndExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1931:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1935:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1936:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__04011);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__04014);
            rule__AndExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0"


    // $ANTLR start "rule__AndExpression__Group_1__0__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1943:1: rule__AndExpression__Group_1__0__Impl : ( ( rule__AndExpression__OperationsAssignment_1_0 ) ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1947:1: ( ( ( rule__AndExpression__OperationsAssignment_1_0 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1948:1: ( ( rule__AndExpression__OperationsAssignment_1_0 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1948:1: ( ( rule__AndExpression__OperationsAssignment_1_0 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1949:1: ( rule__AndExpression__OperationsAssignment_1_0 )
            {
             before(grammarAccess.getAndExpressionAccess().getOperationsAssignment_1_0()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1950:1: ( rule__AndExpression__OperationsAssignment_1_0 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1950:2: rule__AndExpression__OperationsAssignment_1_0
            {
            pushFollow(FOLLOW_rule__AndExpression__OperationsAssignment_1_0_in_rule__AndExpression__Group_1__0__Impl4041);
            rule__AndExpression__OperationsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getOperationsAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1960:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1964:1: ( rule__AndExpression__Group_1__1__Impl )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1965:2: rule__AndExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__14071);
            rule__AndExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__1"


    // $ANTLR start "rule__AndExpression__Group_1__1__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1971:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__ParametersAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1975:1: ( ( ( rule__AndExpression__ParametersAssignment_1_1 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1976:1: ( ( rule__AndExpression__ParametersAssignment_1_1 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1976:1: ( ( rule__AndExpression__ParametersAssignment_1_1 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1977:1: ( rule__AndExpression__ParametersAssignment_1_1 )
            {
             before(grammarAccess.getAndExpressionAccess().getParametersAssignment_1_1()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1978:1: ( rule__AndExpression__ParametersAssignment_1_1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1978:2: rule__AndExpression__ParametersAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AndExpression__ParametersAssignment_1_1_in_rule__AndExpression__Group_1__1__Impl4098);
            rule__AndExpression__ParametersAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getParametersAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__EqualityExpression__Group__0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1992:1: rule__EqualityExpression__Group__0 : rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 ;
    public final void rule__EqualityExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1996:1: ( rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:1997:2: rule__EqualityExpression__Group__0__Impl rule__EqualityExpression__Group__1
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group__0__Impl_in_rule__EqualityExpression__Group__04132);
            rule__EqualityExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqualityExpression__Group__1_in_rule__EqualityExpression__Group__04135);
            rule__EqualityExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group__0"


    // $ANTLR start "rule__EqualityExpression__Group__0__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2004:1: rule__EqualityExpression__Group__0__Impl : ( ( rule__EqualityExpression__ParametersAssignment_0 ) ) ;
    public final void rule__EqualityExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2008:1: ( ( ( rule__EqualityExpression__ParametersAssignment_0 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2009:1: ( ( rule__EqualityExpression__ParametersAssignment_0 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2009:1: ( ( rule__EqualityExpression__ParametersAssignment_0 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2010:1: ( rule__EqualityExpression__ParametersAssignment_0 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getParametersAssignment_0()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2011:1: ( rule__EqualityExpression__ParametersAssignment_0 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2011:2: rule__EqualityExpression__ParametersAssignment_0
            {
            pushFollow(FOLLOW_rule__EqualityExpression__ParametersAssignment_0_in_rule__EqualityExpression__Group__0__Impl4162);
            rule__EqualityExpression__ParametersAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityExpressionAccess().getParametersAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group__0__Impl"


    // $ANTLR start "rule__EqualityExpression__Group__1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2021:1: rule__EqualityExpression__Group__1 : rule__EqualityExpression__Group__1__Impl ;
    public final void rule__EqualityExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2025:1: ( rule__EqualityExpression__Group__1__Impl )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2026:2: rule__EqualityExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group__1__Impl_in_rule__EqualityExpression__Group__14192);
            rule__EqualityExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group__1"


    // $ANTLR start "rule__EqualityExpression__Group__1__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2032:1: rule__EqualityExpression__Group__1__Impl : ( ( rule__EqualityExpression__Alternatives_1 )? ) ;
    public final void rule__EqualityExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2036:1: ( ( ( rule__EqualityExpression__Alternatives_1 )? ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2037:1: ( ( rule__EqualityExpression__Alternatives_1 )? )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2037:1: ( ( rule__EqualityExpression__Alternatives_1 )? )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2038:1: ( rule__EqualityExpression__Alternatives_1 )?
            {
             before(grammarAccess.getEqualityExpressionAccess().getAlternatives_1()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2039:1: ( rule__EqualityExpression__Alternatives_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_EQUALSEQUALS && LA21_0<=RULE_NEQUALS)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2039:2: rule__EqualityExpression__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__EqualityExpression__Alternatives_1_in_rule__EqualityExpression__Group__1__Impl4219);
                    rule__EqualityExpression__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEqualityExpressionAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group__1__Impl"


    // $ANTLR start "rule__EqualityExpression__Group_1_0__0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2053:1: rule__EqualityExpression__Group_1_0__0 : rule__EqualityExpression__Group_1_0__0__Impl rule__EqualityExpression__Group_1_0__1 ;
    public final void rule__EqualityExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2057:1: ( rule__EqualityExpression__Group_1_0__0__Impl rule__EqualityExpression__Group_1_0__1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2058:2: rule__EqualityExpression__Group_1_0__0__Impl rule__EqualityExpression__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group_1_0__0__Impl_in_rule__EqualityExpression__Group_1_0__04254);
            rule__EqualityExpression__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqualityExpression__Group_1_0__1_in_rule__EqualityExpression__Group_1_0__04257);
            rule__EqualityExpression__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group_1_0__0"


    // $ANTLR start "rule__EqualityExpression__Group_1_0__0__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2065:1: rule__EqualityExpression__Group_1_0__0__Impl : ( ( rule__EqualityExpression__OperationsAssignment_1_0_0 ) ) ;
    public final void rule__EqualityExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2069:1: ( ( ( rule__EqualityExpression__OperationsAssignment_1_0_0 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2070:1: ( ( rule__EqualityExpression__OperationsAssignment_1_0_0 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2070:1: ( ( rule__EqualityExpression__OperationsAssignment_1_0_0 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2071:1: ( rule__EqualityExpression__OperationsAssignment_1_0_0 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getOperationsAssignment_1_0_0()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2072:1: ( rule__EqualityExpression__OperationsAssignment_1_0_0 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2072:2: rule__EqualityExpression__OperationsAssignment_1_0_0
            {
            pushFollow(FOLLOW_rule__EqualityExpression__OperationsAssignment_1_0_0_in_rule__EqualityExpression__Group_1_0__0__Impl4284);
            rule__EqualityExpression__OperationsAssignment_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityExpressionAccess().getOperationsAssignment_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__EqualityExpression__Group_1_0__1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2082:1: rule__EqualityExpression__Group_1_0__1 : rule__EqualityExpression__Group_1_0__1__Impl ;
    public final void rule__EqualityExpression__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2086:1: ( rule__EqualityExpression__Group_1_0__1__Impl )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2087:2: rule__EqualityExpression__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group_1_0__1__Impl_in_rule__EqualityExpression__Group_1_0__14314);
            rule__EqualityExpression__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group_1_0__1"


    // $ANTLR start "rule__EqualityExpression__Group_1_0__1__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2093:1: rule__EqualityExpression__Group_1_0__1__Impl : ( ( rule__EqualityExpression__ParametersAssignment_1_0_1 ) ) ;
    public final void rule__EqualityExpression__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2097:1: ( ( ( rule__EqualityExpression__ParametersAssignment_1_0_1 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2098:1: ( ( rule__EqualityExpression__ParametersAssignment_1_0_1 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2098:1: ( ( rule__EqualityExpression__ParametersAssignment_1_0_1 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2099:1: ( rule__EqualityExpression__ParametersAssignment_1_0_1 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getParametersAssignment_1_0_1()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2100:1: ( rule__EqualityExpression__ParametersAssignment_1_0_1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2100:2: rule__EqualityExpression__ParametersAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__EqualityExpression__ParametersAssignment_1_0_1_in_rule__EqualityExpression__Group_1_0__1__Impl4341);
            rule__EqualityExpression__ParametersAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getEqualityExpressionAccess().getParametersAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group_1_0__1__Impl"


    // $ANTLR start "rule__EqualityExpression__Group_1_1__0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2114:1: rule__EqualityExpression__Group_1_1__0 : rule__EqualityExpression__Group_1_1__0__Impl rule__EqualityExpression__Group_1_1__1 ;
    public final void rule__EqualityExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2118:1: ( rule__EqualityExpression__Group_1_1__0__Impl rule__EqualityExpression__Group_1_1__1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2119:2: rule__EqualityExpression__Group_1_1__0__Impl rule__EqualityExpression__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group_1_1__0__Impl_in_rule__EqualityExpression__Group_1_1__04375);
            rule__EqualityExpression__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EqualityExpression__Group_1_1__1_in_rule__EqualityExpression__Group_1_1__04378);
            rule__EqualityExpression__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group_1_1__0"


    // $ANTLR start "rule__EqualityExpression__Group_1_1__0__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2126:1: rule__EqualityExpression__Group_1_1__0__Impl : ( ( rule__EqualityExpression__OperationsAssignment_1_1_0 ) ) ;
    public final void rule__EqualityExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2130:1: ( ( ( rule__EqualityExpression__OperationsAssignment_1_1_0 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2131:1: ( ( rule__EqualityExpression__OperationsAssignment_1_1_0 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2131:1: ( ( rule__EqualityExpression__OperationsAssignment_1_1_0 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2132:1: ( rule__EqualityExpression__OperationsAssignment_1_1_0 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getOperationsAssignment_1_1_0()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2133:1: ( rule__EqualityExpression__OperationsAssignment_1_1_0 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2133:2: rule__EqualityExpression__OperationsAssignment_1_1_0
            {
            pushFollow(FOLLOW_rule__EqualityExpression__OperationsAssignment_1_1_0_in_rule__EqualityExpression__Group_1_1__0__Impl4405);
            rule__EqualityExpression__OperationsAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityExpressionAccess().getOperationsAssignment_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group_1_1__0__Impl"


    // $ANTLR start "rule__EqualityExpression__Group_1_1__1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2143:1: rule__EqualityExpression__Group_1_1__1 : rule__EqualityExpression__Group_1_1__1__Impl ;
    public final void rule__EqualityExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2147:1: ( rule__EqualityExpression__Group_1_1__1__Impl )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2148:2: rule__EqualityExpression__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group_1_1__1__Impl_in_rule__EqualityExpression__Group_1_1__14435);
            rule__EqualityExpression__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group_1_1__1"


    // $ANTLR start "rule__EqualityExpression__Group_1_1__1__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2154:1: rule__EqualityExpression__Group_1_1__1__Impl : ( ( rule__EqualityExpression__ParametersAssignment_1_1_1 ) ) ;
    public final void rule__EqualityExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2158:1: ( ( ( rule__EqualityExpression__ParametersAssignment_1_1_1 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2159:1: ( ( rule__EqualityExpression__ParametersAssignment_1_1_1 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2159:1: ( ( rule__EqualityExpression__ParametersAssignment_1_1_1 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2160:1: ( rule__EqualityExpression__ParametersAssignment_1_1_1 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getParametersAssignment_1_1_1()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2161:1: ( rule__EqualityExpression__ParametersAssignment_1_1_1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2161:2: rule__EqualityExpression__ParametersAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__EqualityExpression__ParametersAssignment_1_1_1_in_rule__EqualityExpression__Group_1_1__1__Impl4462);
            rule__EqualityExpression__ParametersAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEqualityExpressionAccess().getParametersAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__Group_1_1__1__Impl"


    // $ANTLR start "rule__RelationalExpression__Group__0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2175:1: rule__RelationalExpression__Group__0 : rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1 ;
    public final void rule__RelationalExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2179:1: ( rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2180:2: rule__RelationalExpression__Group__0__Impl rule__RelationalExpression__Group__1
            {
            pushFollow(FOLLOW_rule__RelationalExpression__Group__0__Impl_in_rule__RelationalExpression__Group__04496);
            rule__RelationalExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationalExpression__Group__1_in_rule__RelationalExpression__Group__04499);
            rule__RelationalExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group__0"


    // $ANTLR start "rule__RelationalExpression__Group__0__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2187:1: rule__RelationalExpression__Group__0__Impl : ( () ) ;
    public final void rule__RelationalExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2191:1: ( ( () ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2192:1: ( () )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2192:1: ( () )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2193:1: ()
            {
             before(grammarAccess.getRelationalExpressionAccess().getExpressionAction_0()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2194:1: ()
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2196:1: 
            {
            }

             after(grammarAccess.getRelationalExpressionAccess().getExpressionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group__0__Impl"


    // $ANTLR start "rule__RelationalExpression__Group__1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2206:1: rule__RelationalExpression__Group__1 : rule__RelationalExpression__Group__1__Impl rule__RelationalExpression__Group__2 ;
    public final void rule__RelationalExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2210:1: ( rule__RelationalExpression__Group__1__Impl rule__RelationalExpression__Group__2 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2211:2: rule__RelationalExpression__Group__1__Impl rule__RelationalExpression__Group__2
            {
            pushFollow(FOLLOW_rule__RelationalExpression__Group__1__Impl_in_rule__RelationalExpression__Group__14557);
            rule__RelationalExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationalExpression__Group__2_in_rule__RelationalExpression__Group__14560);
            rule__RelationalExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group__1"


    // $ANTLR start "rule__RelationalExpression__Group__1__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2218:1: rule__RelationalExpression__Group__1__Impl : ( ( rule__RelationalExpression__ParametersAssignment_1 ) ) ;
    public final void rule__RelationalExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2222:1: ( ( ( rule__RelationalExpression__ParametersAssignment_1 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2223:1: ( ( rule__RelationalExpression__ParametersAssignment_1 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2223:1: ( ( rule__RelationalExpression__ParametersAssignment_1 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2224:1: ( rule__RelationalExpression__ParametersAssignment_1 )
            {
             before(grammarAccess.getRelationalExpressionAccess().getParametersAssignment_1()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2225:1: ( rule__RelationalExpression__ParametersAssignment_1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2225:2: rule__RelationalExpression__ParametersAssignment_1
            {
            pushFollow(FOLLOW_rule__RelationalExpression__ParametersAssignment_1_in_rule__RelationalExpression__Group__1__Impl4587);
            rule__RelationalExpression__ParametersAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationalExpressionAccess().getParametersAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group__1__Impl"


    // $ANTLR start "rule__RelationalExpression__Group__2"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2235:1: rule__RelationalExpression__Group__2 : rule__RelationalExpression__Group__2__Impl ;
    public final void rule__RelationalExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2239:1: ( rule__RelationalExpression__Group__2__Impl )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2240:2: rule__RelationalExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RelationalExpression__Group__2__Impl_in_rule__RelationalExpression__Group__24617);
            rule__RelationalExpression__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group__2"


    // $ANTLR start "rule__RelationalExpression__Group__2__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2246:1: rule__RelationalExpression__Group__2__Impl : ( ( rule__RelationalExpression__Alternatives_2 )? ) ;
    public final void rule__RelationalExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2250:1: ( ( ( rule__RelationalExpression__Alternatives_2 )? ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2251:1: ( ( rule__RelationalExpression__Alternatives_2 )? )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2251:1: ( ( rule__RelationalExpression__Alternatives_2 )? )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2252:1: ( rule__RelationalExpression__Alternatives_2 )?
            {
             before(grammarAccess.getRelationalExpressionAccess().getAlternatives_2()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2253:1: ( rule__RelationalExpression__Alternatives_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_XML_LT && LA22_0<=RULE_XML_GTEQ)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2253:2: rule__RelationalExpression__Alternatives_2
                    {
                    pushFollow(FOLLOW_rule__RelationalExpression__Alternatives_2_in_rule__RelationalExpression__Group__2__Impl4644);
                    rule__RelationalExpression__Alternatives_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationalExpressionAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group__2__Impl"


    // $ANTLR start "rule__RelationalExpression__Group_2_0__0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2269:1: rule__RelationalExpression__Group_2_0__0 : rule__RelationalExpression__Group_2_0__0__Impl rule__RelationalExpression__Group_2_0__1 ;
    public final void rule__RelationalExpression__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2273:1: ( rule__RelationalExpression__Group_2_0__0__Impl rule__RelationalExpression__Group_2_0__1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2274:2: rule__RelationalExpression__Group_2_0__0__Impl rule__RelationalExpression__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__RelationalExpression__Group_2_0__0__Impl_in_rule__RelationalExpression__Group_2_0__04681);
            rule__RelationalExpression__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationalExpression__Group_2_0__1_in_rule__RelationalExpression__Group_2_0__04684);
            rule__RelationalExpression__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group_2_0__0"


    // $ANTLR start "rule__RelationalExpression__Group_2_0__0__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2281:1: rule__RelationalExpression__Group_2_0__0__Impl : ( ( rule__RelationalExpression__OperationsAssignment_2_0_0 ) ) ;
    public final void rule__RelationalExpression__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2285:1: ( ( ( rule__RelationalExpression__OperationsAssignment_2_0_0 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2286:1: ( ( rule__RelationalExpression__OperationsAssignment_2_0_0 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2286:1: ( ( rule__RelationalExpression__OperationsAssignment_2_0_0 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2287:1: ( rule__RelationalExpression__OperationsAssignment_2_0_0 )
            {
             before(grammarAccess.getRelationalExpressionAccess().getOperationsAssignment_2_0_0()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2288:1: ( rule__RelationalExpression__OperationsAssignment_2_0_0 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2288:2: rule__RelationalExpression__OperationsAssignment_2_0_0
            {
            pushFollow(FOLLOW_rule__RelationalExpression__OperationsAssignment_2_0_0_in_rule__RelationalExpression__Group_2_0__0__Impl4711);
            rule__RelationalExpression__OperationsAssignment_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getRelationalExpressionAccess().getOperationsAssignment_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group_2_0__0__Impl"


    // $ANTLR start "rule__RelationalExpression__Group_2_0__1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2298:1: rule__RelationalExpression__Group_2_0__1 : rule__RelationalExpression__Group_2_0__1__Impl ;
    public final void rule__RelationalExpression__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2302:1: ( rule__RelationalExpression__Group_2_0__1__Impl )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2303:2: rule__RelationalExpression__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__RelationalExpression__Group_2_0__1__Impl_in_rule__RelationalExpression__Group_2_0__14741);
            rule__RelationalExpression__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group_2_0__1"


    // $ANTLR start "rule__RelationalExpression__Group_2_0__1__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2309:1: rule__RelationalExpression__Group_2_0__1__Impl : ( ( rule__RelationalExpression__ParametersAssignment_2_0_1 ) ) ;
    public final void rule__RelationalExpression__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2313:1: ( ( ( rule__RelationalExpression__ParametersAssignment_2_0_1 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2314:1: ( ( rule__RelationalExpression__ParametersAssignment_2_0_1 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2314:1: ( ( rule__RelationalExpression__ParametersAssignment_2_0_1 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2315:1: ( rule__RelationalExpression__ParametersAssignment_2_0_1 )
            {
             before(grammarAccess.getRelationalExpressionAccess().getParametersAssignment_2_0_1()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2316:1: ( rule__RelationalExpression__ParametersAssignment_2_0_1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2316:2: rule__RelationalExpression__ParametersAssignment_2_0_1
            {
            pushFollow(FOLLOW_rule__RelationalExpression__ParametersAssignment_2_0_1_in_rule__RelationalExpression__Group_2_0__1__Impl4768);
            rule__RelationalExpression__ParametersAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationalExpressionAccess().getParametersAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group_2_0__1__Impl"


    // $ANTLR start "rule__RelationalExpression__Group_2_1__0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2330:1: rule__RelationalExpression__Group_2_1__0 : rule__RelationalExpression__Group_2_1__0__Impl rule__RelationalExpression__Group_2_1__1 ;
    public final void rule__RelationalExpression__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2334:1: ( rule__RelationalExpression__Group_2_1__0__Impl rule__RelationalExpression__Group_2_1__1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2335:2: rule__RelationalExpression__Group_2_1__0__Impl rule__RelationalExpression__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__RelationalExpression__Group_2_1__0__Impl_in_rule__RelationalExpression__Group_2_1__04802);
            rule__RelationalExpression__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationalExpression__Group_2_1__1_in_rule__RelationalExpression__Group_2_1__04805);
            rule__RelationalExpression__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group_2_1__0"


    // $ANTLR start "rule__RelationalExpression__Group_2_1__0__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2342:1: rule__RelationalExpression__Group_2_1__0__Impl : ( ( rule__RelationalExpression__OperationsAssignment_2_1_0 ) ) ;
    public final void rule__RelationalExpression__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2346:1: ( ( ( rule__RelationalExpression__OperationsAssignment_2_1_0 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2347:1: ( ( rule__RelationalExpression__OperationsAssignment_2_1_0 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2347:1: ( ( rule__RelationalExpression__OperationsAssignment_2_1_0 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2348:1: ( rule__RelationalExpression__OperationsAssignment_2_1_0 )
            {
             before(grammarAccess.getRelationalExpressionAccess().getOperationsAssignment_2_1_0()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2349:1: ( rule__RelationalExpression__OperationsAssignment_2_1_0 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2349:2: rule__RelationalExpression__OperationsAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__RelationalExpression__OperationsAssignment_2_1_0_in_rule__RelationalExpression__Group_2_1__0__Impl4832);
            rule__RelationalExpression__OperationsAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getRelationalExpressionAccess().getOperationsAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group_2_1__0__Impl"


    // $ANTLR start "rule__RelationalExpression__Group_2_1__1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2359:1: rule__RelationalExpression__Group_2_1__1 : rule__RelationalExpression__Group_2_1__1__Impl ;
    public final void rule__RelationalExpression__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2363:1: ( rule__RelationalExpression__Group_2_1__1__Impl )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2364:2: rule__RelationalExpression__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__RelationalExpression__Group_2_1__1__Impl_in_rule__RelationalExpression__Group_2_1__14862);
            rule__RelationalExpression__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group_2_1__1"


    // $ANTLR start "rule__RelationalExpression__Group_2_1__1__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2370:1: rule__RelationalExpression__Group_2_1__1__Impl : ( ( rule__RelationalExpression__ParametersAssignment_2_1_1 ) ) ;
    public final void rule__RelationalExpression__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2374:1: ( ( ( rule__RelationalExpression__ParametersAssignment_2_1_1 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2375:1: ( ( rule__RelationalExpression__ParametersAssignment_2_1_1 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2375:1: ( ( rule__RelationalExpression__ParametersAssignment_2_1_1 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2376:1: ( rule__RelationalExpression__ParametersAssignment_2_1_1 )
            {
             before(grammarAccess.getRelationalExpressionAccess().getParametersAssignment_2_1_1()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2377:1: ( rule__RelationalExpression__ParametersAssignment_2_1_1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2377:2: rule__RelationalExpression__ParametersAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__RelationalExpression__ParametersAssignment_2_1_1_in_rule__RelationalExpression__Group_2_1__1__Impl4889);
            rule__RelationalExpression__ParametersAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationalExpressionAccess().getParametersAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group_2_1__1__Impl"


    // $ANTLR start "rule__RelationalExpression__Group_2_2__0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2391:1: rule__RelationalExpression__Group_2_2__0 : rule__RelationalExpression__Group_2_2__0__Impl rule__RelationalExpression__Group_2_2__1 ;
    public final void rule__RelationalExpression__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2395:1: ( rule__RelationalExpression__Group_2_2__0__Impl rule__RelationalExpression__Group_2_2__1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2396:2: rule__RelationalExpression__Group_2_2__0__Impl rule__RelationalExpression__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__RelationalExpression__Group_2_2__0__Impl_in_rule__RelationalExpression__Group_2_2__04923);
            rule__RelationalExpression__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationalExpression__Group_2_2__1_in_rule__RelationalExpression__Group_2_2__04926);
            rule__RelationalExpression__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group_2_2__0"


    // $ANTLR start "rule__RelationalExpression__Group_2_2__0__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2403:1: rule__RelationalExpression__Group_2_2__0__Impl : ( ( rule__RelationalExpression__OperationsAssignment_2_2_0 ) ) ;
    public final void rule__RelationalExpression__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2407:1: ( ( ( rule__RelationalExpression__OperationsAssignment_2_2_0 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2408:1: ( ( rule__RelationalExpression__OperationsAssignment_2_2_0 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2408:1: ( ( rule__RelationalExpression__OperationsAssignment_2_2_0 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2409:1: ( rule__RelationalExpression__OperationsAssignment_2_2_0 )
            {
             before(grammarAccess.getRelationalExpressionAccess().getOperationsAssignment_2_2_0()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2410:1: ( rule__RelationalExpression__OperationsAssignment_2_2_0 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2410:2: rule__RelationalExpression__OperationsAssignment_2_2_0
            {
            pushFollow(FOLLOW_rule__RelationalExpression__OperationsAssignment_2_2_0_in_rule__RelationalExpression__Group_2_2__0__Impl4953);
            rule__RelationalExpression__OperationsAssignment_2_2_0();

            state._fsp--;


            }

             after(grammarAccess.getRelationalExpressionAccess().getOperationsAssignment_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group_2_2__0__Impl"


    // $ANTLR start "rule__RelationalExpression__Group_2_2__1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2420:1: rule__RelationalExpression__Group_2_2__1 : rule__RelationalExpression__Group_2_2__1__Impl ;
    public final void rule__RelationalExpression__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2424:1: ( rule__RelationalExpression__Group_2_2__1__Impl )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2425:2: rule__RelationalExpression__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__RelationalExpression__Group_2_2__1__Impl_in_rule__RelationalExpression__Group_2_2__14983);
            rule__RelationalExpression__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group_2_2__1"


    // $ANTLR start "rule__RelationalExpression__Group_2_2__1__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2431:1: rule__RelationalExpression__Group_2_2__1__Impl : ( ( rule__RelationalExpression__ParametersAssignment_2_2_1 ) ) ;
    public final void rule__RelationalExpression__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2435:1: ( ( ( rule__RelationalExpression__ParametersAssignment_2_2_1 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2436:1: ( ( rule__RelationalExpression__ParametersAssignment_2_2_1 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2436:1: ( ( rule__RelationalExpression__ParametersAssignment_2_2_1 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2437:1: ( rule__RelationalExpression__ParametersAssignment_2_2_1 )
            {
             before(grammarAccess.getRelationalExpressionAccess().getParametersAssignment_2_2_1()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2438:1: ( rule__RelationalExpression__ParametersAssignment_2_2_1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2438:2: rule__RelationalExpression__ParametersAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__RelationalExpression__ParametersAssignment_2_2_1_in_rule__RelationalExpression__Group_2_2__1__Impl5010);
            rule__RelationalExpression__ParametersAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationalExpressionAccess().getParametersAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group_2_2__1__Impl"


    // $ANTLR start "rule__RelationalExpression__Group_2_3__0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2452:1: rule__RelationalExpression__Group_2_3__0 : rule__RelationalExpression__Group_2_3__0__Impl rule__RelationalExpression__Group_2_3__1 ;
    public final void rule__RelationalExpression__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2456:1: ( rule__RelationalExpression__Group_2_3__0__Impl rule__RelationalExpression__Group_2_3__1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2457:2: rule__RelationalExpression__Group_2_3__0__Impl rule__RelationalExpression__Group_2_3__1
            {
            pushFollow(FOLLOW_rule__RelationalExpression__Group_2_3__0__Impl_in_rule__RelationalExpression__Group_2_3__05044);
            rule__RelationalExpression__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RelationalExpression__Group_2_3__1_in_rule__RelationalExpression__Group_2_3__05047);
            rule__RelationalExpression__Group_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group_2_3__0"


    // $ANTLR start "rule__RelationalExpression__Group_2_3__0__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2464:1: rule__RelationalExpression__Group_2_3__0__Impl : ( ( rule__RelationalExpression__OperationsAssignment_2_3_0 ) ) ;
    public final void rule__RelationalExpression__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2468:1: ( ( ( rule__RelationalExpression__OperationsAssignment_2_3_0 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2469:1: ( ( rule__RelationalExpression__OperationsAssignment_2_3_0 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2469:1: ( ( rule__RelationalExpression__OperationsAssignment_2_3_0 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2470:1: ( rule__RelationalExpression__OperationsAssignment_2_3_0 )
            {
             before(grammarAccess.getRelationalExpressionAccess().getOperationsAssignment_2_3_0()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2471:1: ( rule__RelationalExpression__OperationsAssignment_2_3_0 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2471:2: rule__RelationalExpression__OperationsAssignment_2_3_0
            {
            pushFollow(FOLLOW_rule__RelationalExpression__OperationsAssignment_2_3_0_in_rule__RelationalExpression__Group_2_3__0__Impl5074);
            rule__RelationalExpression__OperationsAssignment_2_3_0();

            state._fsp--;


            }

             after(grammarAccess.getRelationalExpressionAccess().getOperationsAssignment_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group_2_3__0__Impl"


    // $ANTLR start "rule__RelationalExpression__Group_2_3__1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2481:1: rule__RelationalExpression__Group_2_3__1 : rule__RelationalExpression__Group_2_3__1__Impl ;
    public final void rule__RelationalExpression__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2485:1: ( rule__RelationalExpression__Group_2_3__1__Impl )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2486:2: rule__RelationalExpression__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_rule__RelationalExpression__Group_2_3__1__Impl_in_rule__RelationalExpression__Group_2_3__15104);
            rule__RelationalExpression__Group_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group_2_3__1"


    // $ANTLR start "rule__RelationalExpression__Group_2_3__1__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2492:1: rule__RelationalExpression__Group_2_3__1__Impl : ( ( rule__RelationalExpression__ParametersAssignment_2_3_1 ) ) ;
    public final void rule__RelationalExpression__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2496:1: ( ( ( rule__RelationalExpression__ParametersAssignment_2_3_1 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2497:1: ( ( rule__RelationalExpression__ParametersAssignment_2_3_1 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2497:1: ( ( rule__RelationalExpression__ParametersAssignment_2_3_1 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2498:1: ( rule__RelationalExpression__ParametersAssignment_2_3_1 )
            {
             before(grammarAccess.getRelationalExpressionAccess().getParametersAssignment_2_3_1()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2499:1: ( rule__RelationalExpression__ParametersAssignment_2_3_1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2499:2: rule__RelationalExpression__ParametersAssignment_2_3_1
            {
            pushFollow(FOLLOW_rule__RelationalExpression__ParametersAssignment_2_3_1_in_rule__RelationalExpression__Group_2_3__1__Impl5131);
            rule__RelationalExpression__ParametersAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationalExpressionAccess().getParametersAssignment_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__Group_2_3__1__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group__0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2513:1: rule__AdditiveExpression__Group__0 : rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 ;
    public final void rule__AdditiveExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2517:1: ( rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2518:2: rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1
            {
            pushFollow(FOLLOW_rule__AdditiveExpression__Group__0__Impl_in_rule__AdditiveExpression__Group__05165);
            rule__AdditiveExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AdditiveExpression__Group__1_in_rule__AdditiveExpression__Group__05168);
            rule__AdditiveExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group__0"


    // $ANTLR start "rule__AdditiveExpression__Group__0__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2525:1: rule__AdditiveExpression__Group__0__Impl : ( ( rule__AdditiveExpression__ParametersAssignment_0 ) ) ;
    public final void rule__AdditiveExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2529:1: ( ( ( rule__AdditiveExpression__ParametersAssignment_0 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2530:1: ( ( rule__AdditiveExpression__ParametersAssignment_0 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2530:1: ( ( rule__AdditiveExpression__ParametersAssignment_0 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2531:1: ( rule__AdditiveExpression__ParametersAssignment_0 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getParametersAssignment_0()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2532:1: ( rule__AdditiveExpression__ParametersAssignment_0 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2532:2: rule__AdditiveExpression__ParametersAssignment_0
            {
            pushFollow(FOLLOW_rule__AdditiveExpression__ParametersAssignment_0_in_rule__AdditiveExpression__Group__0__Impl5195);
            rule__AdditiveExpression__ParametersAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveExpressionAccess().getParametersAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group__0__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group__1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2542:1: rule__AdditiveExpression__Group__1 : rule__AdditiveExpression__Group__1__Impl ;
    public final void rule__AdditiveExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2546:1: ( rule__AdditiveExpression__Group__1__Impl )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2547:2: rule__AdditiveExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AdditiveExpression__Group__1__Impl_in_rule__AdditiveExpression__Group__15225);
            rule__AdditiveExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group__1"


    // $ANTLR start "rule__AdditiveExpression__Group__1__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2553:1: rule__AdditiveExpression__Group__1__Impl : ( ( rule__AdditiveExpression__Alternatives_1 )* ) ;
    public final void rule__AdditiveExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2557:1: ( ( ( rule__AdditiveExpression__Alternatives_1 )* ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2558:1: ( ( rule__AdditiveExpression__Alternatives_1 )* )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2558:1: ( ( rule__AdditiveExpression__Alternatives_1 )* )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2559:1: ( rule__AdditiveExpression__Alternatives_1 )*
            {
             before(grammarAccess.getAdditiveExpressionAccess().getAlternatives_1()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2560:1: ( rule__AdditiveExpression__Alternatives_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_PLUS && LA23_0<=RULE_MINUS)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2560:2: rule__AdditiveExpression__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__AdditiveExpression__Alternatives_1_in_rule__AdditiveExpression__Group__1__Impl5252);
            	    rule__AdditiveExpression__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getAdditiveExpressionAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group__1__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group_1_0__0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2574:1: rule__AdditiveExpression__Group_1_0__0 : rule__AdditiveExpression__Group_1_0__0__Impl rule__AdditiveExpression__Group_1_0__1 ;
    public final void rule__AdditiveExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2578:1: ( rule__AdditiveExpression__Group_1_0__0__Impl rule__AdditiveExpression__Group_1_0__1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2579:2: rule__AdditiveExpression__Group_1_0__0__Impl rule__AdditiveExpression__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__AdditiveExpression__Group_1_0__0__Impl_in_rule__AdditiveExpression__Group_1_0__05287);
            rule__AdditiveExpression__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AdditiveExpression__Group_1_0__1_in_rule__AdditiveExpression__Group_1_0__05290);
            rule__AdditiveExpression__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1_0__0"


    // $ANTLR start "rule__AdditiveExpression__Group_1_0__0__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2586:1: rule__AdditiveExpression__Group_1_0__0__Impl : ( RULE_PLUS ) ;
    public final void rule__AdditiveExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2590:1: ( ( RULE_PLUS ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2591:1: ( RULE_PLUS )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2591:1: ( RULE_PLUS )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2592:1: RULE_PLUS
            {
             before(grammarAccess.getAdditiveExpressionAccess().getPLUSTerminalRuleCall_1_0_0()); 
            match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_rule__AdditiveExpression__Group_1_0__0__Impl5317); 
             after(grammarAccess.getAdditiveExpressionAccess().getPLUSTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group_1_0__1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2603:1: rule__AdditiveExpression__Group_1_0__1 : rule__AdditiveExpression__Group_1_0__1__Impl ;
    public final void rule__AdditiveExpression__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2607:1: ( rule__AdditiveExpression__Group_1_0__1__Impl )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2608:2: rule__AdditiveExpression__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__AdditiveExpression__Group_1_0__1__Impl_in_rule__AdditiveExpression__Group_1_0__15346);
            rule__AdditiveExpression__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1_0__1"


    // $ANTLR start "rule__AdditiveExpression__Group_1_0__1__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2614:1: rule__AdditiveExpression__Group_1_0__1__Impl : ( ( rule__AdditiveExpression__ParametersAssignment_1_0_1 ) ) ;
    public final void rule__AdditiveExpression__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2618:1: ( ( ( rule__AdditiveExpression__ParametersAssignment_1_0_1 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2619:1: ( ( rule__AdditiveExpression__ParametersAssignment_1_0_1 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2619:1: ( ( rule__AdditiveExpression__ParametersAssignment_1_0_1 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2620:1: ( rule__AdditiveExpression__ParametersAssignment_1_0_1 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getParametersAssignment_1_0_1()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2621:1: ( rule__AdditiveExpression__ParametersAssignment_1_0_1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2621:2: rule__AdditiveExpression__ParametersAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__AdditiveExpression__ParametersAssignment_1_0_1_in_rule__AdditiveExpression__Group_1_0__1__Impl5373);
            rule__AdditiveExpression__ParametersAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveExpressionAccess().getParametersAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1_0__1__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group_1_1__0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2635:1: rule__AdditiveExpression__Group_1_1__0 : rule__AdditiveExpression__Group_1_1__0__Impl rule__AdditiveExpression__Group_1_1__1 ;
    public final void rule__AdditiveExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2639:1: ( rule__AdditiveExpression__Group_1_1__0__Impl rule__AdditiveExpression__Group_1_1__1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2640:2: rule__AdditiveExpression__Group_1_1__0__Impl rule__AdditiveExpression__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__AdditiveExpression__Group_1_1__0__Impl_in_rule__AdditiveExpression__Group_1_1__05407);
            rule__AdditiveExpression__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AdditiveExpression__Group_1_1__1_in_rule__AdditiveExpression__Group_1_1__05410);
            rule__AdditiveExpression__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1_1__0"


    // $ANTLR start "rule__AdditiveExpression__Group_1_1__0__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2647:1: rule__AdditiveExpression__Group_1_1__0__Impl : ( RULE_MINUS ) ;
    public final void rule__AdditiveExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2651:1: ( ( RULE_MINUS ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2652:1: ( RULE_MINUS )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2652:1: ( RULE_MINUS )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2653:1: RULE_MINUS
            {
             before(grammarAccess.getAdditiveExpressionAccess().getMINUSTerminalRuleCall_1_1_0()); 
            match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_rule__AdditiveExpression__Group_1_1__0__Impl5437); 
             after(grammarAccess.getAdditiveExpressionAccess().getMINUSTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1_1__0__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group_1_1__1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2664:1: rule__AdditiveExpression__Group_1_1__1 : rule__AdditiveExpression__Group_1_1__1__Impl ;
    public final void rule__AdditiveExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2668:1: ( rule__AdditiveExpression__Group_1_1__1__Impl )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2669:2: rule__AdditiveExpression__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AdditiveExpression__Group_1_1__1__Impl_in_rule__AdditiveExpression__Group_1_1__15466);
            rule__AdditiveExpression__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1_1__1"


    // $ANTLR start "rule__AdditiveExpression__Group_1_1__1__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2675:1: rule__AdditiveExpression__Group_1_1__1__Impl : ( ( rule__AdditiveExpression__ParametersAssignment_1_1_1 ) ) ;
    public final void rule__AdditiveExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2679:1: ( ( ( rule__AdditiveExpression__ParametersAssignment_1_1_1 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2680:1: ( ( rule__AdditiveExpression__ParametersAssignment_1_1_1 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2680:1: ( ( rule__AdditiveExpression__ParametersAssignment_1_1_1 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2681:1: ( rule__AdditiveExpression__ParametersAssignment_1_1_1 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getParametersAssignment_1_1_1()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2682:1: ( rule__AdditiveExpression__ParametersAssignment_1_1_1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2682:2: rule__AdditiveExpression__ParametersAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__AdditiveExpression__ParametersAssignment_1_1_1_in_rule__AdditiveExpression__Group_1_1__1__Impl5493);
            rule__AdditiveExpression__ParametersAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveExpressionAccess().getParametersAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1_1__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group__0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2696:1: rule__MultiplicativeExpression__Group__0 : rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 ;
    public final void rule__MultiplicativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2700:1: ( rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2701:2: rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group__0__Impl_in_rule__MultiplicativeExpression__Group__05527);
            rule__MultiplicativeExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group__1_in_rule__MultiplicativeExpression__Group__05530);
            rule__MultiplicativeExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__0"


    // $ANTLR start "rule__MultiplicativeExpression__Group__0__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2708:1: rule__MultiplicativeExpression__Group__0__Impl : ( ( rule__MultiplicativeExpression__ParametersAssignment_0 ) ) ;
    public final void rule__MultiplicativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2712:1: ( ( ( rule__MultiplicativeExpression__ParametersAssignment_0 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2713:1: ( ( rule__MultiplicativeExpression__ParametersAssignment_0 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2713:1: ( ( rule__MultiplicativeExpression__ParametersAssignment_0 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2714:1: ( rule__MultiplicativeExpression__ParametersAssignment_0 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getParametersAssignment_0()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2715:1: ( rule__MultiplicativeExpression__ParametersAssignment_0 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2715:2: rule__MultiplicativeExpression__ParametersAssignment_0
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__ParametersAssignment_0_in_rule__MultiplicativeExpression__Group__0__Impl5557);
            rule__MultiplicativeExpression__ParametersAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getParametersAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group__1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2725:1: rule__MultiplicativeExpression__Group__1 : rule__MultiplicativeExpression__Group__1__Impl ;
    public final void rule__MultiplicativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2729:1: ( rule__MultiplicativeExpression__Group__1__Impl )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2730:2: rule__MultiplicativeExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group__1__Impl_in_rule__MultiplicativeExpression__Group__15587);
            rule__MultiplicativeExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__1"


    // $ANTLR start "rule__MultiplicativeExpression__Group__1__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2736:1: rule__MultiplicativeExpression__Group__1__Impl : ( ( rule__MultiplicativeExpression__Alternatives_1 )* ) ;
    public final void rule__MultiplicativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2740:1: ( ( ( rule__MultiplicativeExpression__Alternatives_1 )* ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2741:1: ( ( rule__MultiplicativeExpression__Alternatives_1 )* )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2741:1: ( ( rule__MultiplicativeExpression__Alternatives_1 )* )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2742:1: ( rule__MultiplicativeExpression__Alternatives_1 )*
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getAlternatives_1()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2743:1: ( rule__MultiplicativeExpression__Alternatives_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_TML_SEPARATOR||LA24_0==RULE_MULTIPLY) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2743:2: rule__MultiplicativeExpression__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__MultiplicativeExpression__Alternatives_1_in_rule__MultiplicativeExpression__Group__1__Impl5614);
            	    rule__MultiplicativeExpression__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getMultiplicativeExpressionAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1_0__0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2757:1: rule__MultiplicativeExpression__Group_1_0__0 : rule__MultiplicativeExpression__Group_1_0__0__Impl rule__MultiplicativeExpression__Group_1_0__1 ;
    public final void rule__MultiplicativeExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2761:1: ( rule__MultiplicativeExpression__Group_1_0__0__Impl rule__MultiplicativeExpression__Group_1_0__1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2762:2: rule__MultiplicativeExpression__Group_1_0__0__Impl rule__MultiplicativeExpression__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group_1_0__0__Impl_in_rule__MultiplicativeExpression__Group_1_0__05649);
            rule__MultiplicativeExpression__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group_1_0__1_in_rule__MultiplicativeExpression__Group_1_0__05652);
            rule__MultiplicativeExpression__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1_0__0"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1_0__0__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2769:1: rule__MultiplicativeExpression__Group_1_0__0__Impl : ( ( rule__MultiplicativeExpression__OperationsAssignment_1_0_0 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2773:1: ( ( ( rule__MultiplicativeExpression__OperationsAssignment_1_0_0 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2774:1: ( ( rule__MultiplicativeExpression__OperationsAssignment_1_0_0 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2774:1: ( ( rule__MultiplicativeExpression__OperationsAssignment_1_0_0 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2775:1: ( rule__MultiplicativeExpression__OperationsAssignment_1_0_0 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getOperationsAssignment_1_0_0()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2776:1: ( rule__MultiplicativeExpression__OperationsAssignment_1_0_0 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2776:2: rule__MultiplicativeExpression__OperationsAssignment_1_0_0
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__OperationsAssignment_1_0_0_in_rule__MultiplicativeExpression__Group_1_0__0__Impl5679);
            rule__MultiplicativeExpression__OperationsAssignment_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getOperationsAssignment_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1_0__1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2786:1: rule__MultiplicativeExpression__Group_1_0__1 : rule__MultiplicativeExpression__Group_1_0__1__Impl ;
    public final void rule__MultiplicativeExpression__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2790:1: ( rule__MultiplicativeExpression__Group_1_0__1__Impl )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2791:2: rule__MultiplicativeExpression__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group_1_0__1__Impl_in_rule__MultiplicativeExpression__Group_1_0__15709);
            rule__MultiplicativeExpression__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1_0__1"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1_0__1__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2797:1: rule__MultiplicativeExpression__Group_1_0__1__Impl : ( ( rule__MultiplicativeExpression__ParametersAssignment_1_0_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2801:1: ( ( ( rule__MultiplicativeExpression__ParametersAssignment_1_0_1 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2802:1: ( ( rule__MultiplicativeExpression__ParametersAssignment_1_0_1 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2802:1: ( ( rule__MultiplicativeExpression__ParametersAssignment_1_0_1 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2803:1: ( rule__MultiplicativeExpression__ParametersAssignment_1_0_1 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getParametersAssignment_1_0_1()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2804:1: ( rule__MultiplicativeExpression__ParametersAssignment_1_0_1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2804:2: rule__MultiplicativeExpression__ParametersAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__ParametersAssignment_1_0_1_in_rule__MultiplicativeExpression__Group_1_0__1__Impl5736);
            rule__MultiplicativeExpression__ParametersAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getParametersAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1_0__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1_1__0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2818:1: rule__MultiplicativeExpression__Group_1_1__0 : rule__MultiplicativeExpression__Group_1_1__0__Impl rule__MultiplicativeExpression__Group_1_1__1 ;
    public final void rule__MultiplicativeExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2822:1: ( rule__MultiplicativeExpression__Group_1_1__0__Impl rule__MultiplicativeExpression__Group_1_1__1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2823:2: rule__MultiplicativeExpression__Group_1_1__0__Impl rule__MultiplicativeExpression__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group_1_1__0__Impl_in_rule__MultiplicativeExpression__Group_1_1__05770);
            rule__MultiplicativeExpression__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group_1_1__1_in_rule__MultiplicativeExpression__Group_1_1__05773);
            rule__MultiplicativeExpression__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1_1__0"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1_1__0__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2830:1: rule__MultiplicativeExpression__Group_1_1__0__Impl : ( ( rule__MultiplicativeExpression__OperationsAssignment_1_1_0 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2834:1: ( ( ( rule__MultiplicativeExpression__OperationsAssignment_1_1_0 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2835:1: ( ( rule__MultiplicativeExpression__OperationsAssignment_1_1_0 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2835:1: ( ( rule__MultiplicativeExpression__OperationsAssignment_1_1_0 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2836:1: ( rule__MultiplicativeExpression__OperationsAssignment_1_1_0 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getOperationsAssignment_1_1_0()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2837:1: ( rule__MultiplicativeExpression__OperationsAssignment_1_1_0 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2837:2: rule__MultiplicativeExpression__OperationsAssignment_1_1_0
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__OperationsAssignment_1_1_0_in_rule__MultiplicativeExpression__Group_1_1__0__Impl5800);
            rule__MultiplicativeExpression__OperationsAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getOperationsAssignment_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1_1__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1_1__1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2847:1: rule__MultiplicativeExpression__Group_1_1__1 : rule__MultiplicativeExpression__Group_1_1__1__Impl ;
    public final void rule__MultiplicativeExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2851:1: ( rule__MultiplicativeExpression__Group_1_1__1__Impl )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2852:2: rule__MultiplicativeExpression__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group_1_1__1__Impl_in_rule__MultiplicativeExpression__Group_1_1__15830);
            rule__MultiplicativeExpression__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1_1__1"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1_1__1__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2858:1: rule__MultiplicativeExpression__Group_1_1__1__Impl : ( ( rule__MultiplicativeExpression__ParametersAssignment_1_1_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2862:1: ( ( ( rule__MultiplicativeExpression__ParametersAssignment_1_1_1 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2863:1: ( ( rule__MultiplicativeExpression__ParametersAssignment_1_1_1 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2863:1: ( ( rule__MultiplicativeExpression__ParametersAssignment_1_1_1 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2864:1: ( rule__MultiplicativeExpression__ParametersAssignment_1_1_1 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getParametersAssignment_1_1_1()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2865:1: ( rule__MultiplicativeExpression__ParametersAssignment_1_1_1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2865:2: rule__MultiplicativeExpression__ParametersAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__ParametersAssignment_1_1_1_in_rule__MultiplicativeExpression__Group_1_1__1__Impl5857);
            rule__MultiplicativeExpression__ParametersAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getParametersAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1_1__1__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_0_0__0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2879:1: rule__UnaryExpression__Group_0_0__0 : rule__UnaryExpression__Group_0_0__0__Impl rule__UnaryExpression__Group_0_0__1 ;
    public final void rule__UnaryExpression__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2883:1: ( rule__UnaryExpression__Group_0_0__0__Impl rule__UnaryExpression__Group_0_0__1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2884:2: rule__UnaryExpression__Group_0_0__0__Impl rule__UnaryExpression__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Group_0_0__0__Impl_in_rule__UnaryExpression__Group_0_0__05891);
            rule__UnaryExpression__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnaryExpression__Group_0_0__1_in_rule__UnaryExpression__Group_0_0__05894);
            rule__UnaryExpression__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_0_0__0"


    // $ANTLR start "rule__UnaryExpression__Group_0_0__0__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2891:1: rule__UnaryExpression__Group_0_0__0__Impl : ( RULE_NOT ) ;
    public final void rule__UnaryExpression__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2895:1: ( ( RULE_NOT ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2896:1: ( RULE_NOT )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2896:1: ( RULE_NOT )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2897:1: RULE_NOT
            {
             before(grammarAccess.getUnaryExpressionAccess().getNOTTerminalRuleCall_0_0_0()); 
            match(input,RULE_NOT,FOLLOW_RULE_NOT_in_rule__UnaryExpression__Group_0_0__0__Impl5921); 
             after(grammarAccess.getUnaryExpressionAccess().getNOTTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_0_0__0__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_0_0__1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2908:1: rule__UnaryExpression__Group_0_0__1 : rule__UnaryExpression__Group_0_0__1__Impl ;
    public final void rule__UnaryExpression__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2912:1: ( rule__UnaryExpression__Group_0_0__1__Impl )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2913:2: rule__UnaryExpression__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Group_0_0__1__Impl_in_rule__UnaryExpression__Group_0_0__15950);
            rule__UnaryExpression__Group_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_0_0__1"


    // $ANTLR start "rule__UnaryExpression__Group_0_0__1__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2919:1: rule__UnaryExpression__Group_0_0__1__Impl : ( ( rule__UnaryExpression__ParametersAssignment_0_0_1 ) ) ;
    public final void rule__UnaryExpression__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2923:1: ( ( ( rule__UnaryExpression__ParametersAssignment_0_0_1 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2924:1: ( ( rule__UnaryExpression__ParametersAssignment_0_0_1 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2924:1: ( ( rule__UnaryExpression__ParametersAssignment_0_0_1 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2925:1: ( rule__UnaryExpression__ParametersAssignment_0_0_1 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getParametersAssignment_0_0_1()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2926:1: ( rule__UnaryExpression__ParametersAssignment_0_0_1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2926:2: rule__UnaryExpression__ParametersAssignment_0_0_1
            {
            pushFollow(FOLLOW_rule__UnaryExpression__ParametersAssignment_0_0_1_in_rule__UnaryExpression__Group_0_0__1__Impl5977);
            rule__UnaryExpression__ParametersAssignment_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getParametersAssignment_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_0_0__1__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_0_1__0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2940:1: rule__UnaryExpression__Group_0_1__0 : rule__UnaryExpression__Group_0_1__0__Impl rule__UnaryExpression__Group_0_1__1 ;
    public final void rule__UnaryExpression__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2944:1: ( rule__UnaryExpression__Group_0_1__0__Impl rule__UnaryExpression__Group_0_1__1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2945:2: rule__UnaryExpression__Group_0_1__0__Impl rule__UnaryExpression__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Group_0_1__0__Impl_in_rule__UnaryExpression__Group_0_1__06011);
            rule__UnaryExpression__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UnaryExpression__Group_0_1__1_in_rule__UnaryExpression__Group_0_1__06014);
            rule__UnaryExpression__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_0_1__0"


    // $ANTLR start "rule__UnaryExpression__Group_0_1__0__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2952:1: rule__UnaryExpression__Group_0_1__0__Impl : ( RULE_MINUS ) ;
    public final void rule__UnaryExpression__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2956:1: ( ( RULE_MINUS ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2957:1: ( RULE_MINUS )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2957:1: ( RULE_MINUS )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2958:1: RULE_MINUS
            {
             before(grammarAccess.getUnaryExpressionAccess().getMINUSTerminalRuleCall_0_1_0()); 
            match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_rule__UnaryExpression__Group_0_1__0__Impl6041); 
             after(grammarAccess.getUnaryExpressionAccess().getMINUSTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_0_1__0__Impl"


    // $ANTLR start "rule__UnaryExpression__Group_0_1__1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2969:1: rule__UnaryExpression__Group_0_1__1 : rule__UnaryExpression__Group_0_1__1__Impl ;
    public final void rule__UnaryExpression__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2973:1: ( rule__UnaryExpression__Group_0_1__1__Impl )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2974:2: rule__UnaryExpression__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Group_0_1__1__Impl_in_rule__UnaryExpression__Group_0_1__16070);
            rule__UnaryExpression__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_0_1__1"


    // $ANTLR start "rule__UnaryExpression__Group_0_1__1__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2980:1: rule__UnaryExpression__Group_0_1__1__Impl : ( ( rule__UnaryExpression__ParametersAssignment_0_1_1 ) ) ;
    public final void rule__UnaryExpression__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2984:1: ( ( ( rule__UnaryExpression__ParametersAssignment_0_1_1 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2985:1: ( ( rule__UnaryExpression__ParametersAssignment_0_1_1 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2985:1: ( ( rule__UnaryExpression__ParametersAssignment_0_1_1 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2986:1: ( rule__UnaryExpression__ParametersAssignment_0_1_1 )
            {
             before(grammarAccess.getUnaryExpressionAccess().getParametersAssignment_0_1_1()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2987:1: ( rule__UnaryExpression__ParametersAssignment_0_1_1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:2987:2: rule__UnaryExpression__ParametersAssignment_0_1_1
            {
            pushFollow(FOLLOW_rule__UnaryExpression__ParametersAssignment_0_1_1_in_rule__UnaryExpression__Group_0_1__1__Impl6097);
            rule__UnaryExpression__ParametersAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getUnaryExpressionAccess().getParametersAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__Group_0_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3001:1: rule__PrimaryExpression__Group_1__0 : rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 ;
    public final void rule__PrimaryExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3005:1: ( rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3006:2: rule__PrimaryExpression__Group_1__0__Impl rule__PrimaryExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__0__Impl_in_rule__PrimaryExpression__Group_1__06131);
            rule__PrimaryExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__1_in_rule__PrimaryExpression__Group_1__06134);
            rule__PrimaryExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__0"


    // $ANTLR start "rule__PrimaryExpression__Group_1__0__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3013:1: rule__PrimaryExpression__Group_1__0__Impl : ( RULE_BRACKET_OPEN ) ;
    public final void rule__PrimaryExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3017:1: ( ( RULE_BRACKET_OPEN ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3018:1: ( RULE_BRACKET_OPEN )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3018:1: ( RULE_BRACKET_OPEN )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3019:1: RULE_BRACKET_OPEN
            {
             before(grammarAccess.getPrimaryExpressionAccess().getBRACKET_OPENTerminalRuleCall_1_0()); 
            match(input,RULE_BRACKET_OPEN,FOLLOW_RULE_BRACKET_OPEN_in_rule__PrimaryExpression__Group_1__0__Impl6161); 
             after(grammarAccess.getPrimaryExpressionAccess().getBRACKET_OPENTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3030:1: rule__PrimaryExpression__Group_1__1 : rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2 ;
    public final void rule__PrimaryExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3034:1: ( rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3035:2: rule__PrimaryExpression__Group_1__1__Impl rule__PrimaryExpression__Group_1__2
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__1__Impl_in_rule__PrimaryExpression__Group_1__16190);
            rule__PrimaryExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__2_in_rule__PrimaryExpression__Group_1__16193);
            rule__PrimaryExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__1"


    // $ANTLR start "rule__PrimaryExpression__Group_1__1__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3042:1: rule__PrimaryExpression__Group_1__1__Impl : ( ( rule__PrimaryExpression__ParametersAssignment_1_1 ) ) ;
    public final void rule__PrimaryExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3046:1: ( ( ( rule__PrimaryExpression__ParametersAssignment_1_1 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3047:1: ( ( rule__PrimaryExpression__ParametersAssignment_1_1 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3047:1: ( ( rule__PrimaryExpression__ParametersAssignment_1_1 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3048:1: ( rule__PrimaryExpression__ParametersAssignment_1_1 )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getParametersAssignment_1_1()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3049:1: ( rule__PrimaryExpression__ParametersAssignment_1_1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3049:2: rule__PrimaryExpression__ParametersAssignment_1_1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__ParametersAssignment_1_1_in_rule__PrimaryExpression__Group_1__1__Impl6220);
            rule__PrimaryExpression__ParametersAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getParametersAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_1__2"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3059:1: rule__PrimaryExpression__Group_1__2 : rule__PrimaryExpression__Group_1__2__Impl ;
    public final void rule__PrimaryExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3063:1: ( rule__PrimaryExpression__Group_1__2__Impl )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3064:2: rule__PrimaryExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_1__2__Impl_in_rule__PrimaryExpression__Group_1__26250);
            rule__PrimaryExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__2"


    // $ANTLR start "rule__PrimaryExpression__Group_1__2__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3070:1: rule__PrimaryExpression__Group_1__2__Impl : ( RULE_BRACKET_CLOSE ) ;
    public final void rule__PrimaryExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3074:1: ( ( RULE_BRACKET_CLOSE ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3075:1: ( RULE_BRACKET_CLOSE )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3075:1: ( RULE_BRACKET_CLOSE )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3076:1: RULE_BRACKET_CLOSE
            {
             before(grammarAccess.getPrimaryExpressionAccess().getBRACKET_CLOSETerminalRuleCall_1_2()); 
            match(input,RULE_BRACKET_CLOSE,FOLLOW_RULE_BRACKET_CLOSE_in_rule__PrimaryExpression__Group_1__2__Impl6277); 
             after(grammarAccess.getPrimaryExpressionAccess().getBRACKET_CLOSETerminalRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_1__2__Impl"


    // $ANTLR start "rule__FunctionCall__Group__0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3093:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3097:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3098:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__0__Impl_in_rule__FunctionCall__Group__06312);
            rule__FunctionCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionCall__Group__1_in_rule__FunctionCall__Group__06315);
            rule__FunctionCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__0"


    // $ANTLR start "rule__FunctionCall__Group__0__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3105:1: rule__FunctionCall__Group__0__Impl : ( ( rule__FunctionCall__NameAssignment_0 ) ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3109:1: ( ( ( rule__FunctionCall__NameAssignment_0 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3110:1: ( ( rule__FunctionCall__NameAssignment_0 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3110:1: ( ( rule__FunctionCall__NameAssignment_0 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3111:1: ( rule__FunctionCall__NameAssignment_0 )
            {
             before(grammarAccess.getFunctionCallAccess().getNameAssignment_0()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3112:1: ( rule__FunctionCall__NameAssignment_0 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3112:2: rule__FunctionCall__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__FunctionCall__NameAssignment_0_in_rule__FunctionCall__Group__0__Impl6342);
            rule__FunctionCall__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group__1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3122:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3126:1: ( rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3127:2: rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__1__Impl_in_rule__FunctionCall__Group__16372);
            rule__FunctionCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionCall__Group__2_in_rule__FunctionCall__Group__16375);
            rule__FunctionCall__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__1"


    // $ANTLR start "rule__FunctionCall__Group__1__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3134:1: rule__FunctionCall__Group__1__Impl : ( RULE_BRACKET_OPEN ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3138:1: ( ( RULE_BRACKET_OPEN ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3139:1: ( RULE_BRACKET_OPEN )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3139:1: ( RULE_BRACKET_OPEN )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3140:1: RULE_BRACKET_OPEN
            {
             before(grammarAccess.getFunctionCallAccess().getBRACKET_OPENTerminalRuleCall_1()); 
            match(input,RULE_BRACKET_OPEN,FOLLOW_RULE_BRACKET_OPEN_in_rule__FunctionCall__Group__1__Impl6402); 
             after(grammarAccess.getFunctionCallAccess().getBRACKET_OPENTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__1__Impl"


    // $ANTLR start "rule__FunctionCall__Group__2"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3151:1: rule__FunctionCall__Group__2 : rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 ;
    public final void rule__FunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3155:1: ( rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3156:2: rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__2__Impl_in_rule__FunctionCall__Group__26431);
            rule__FunctionCall__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionCall__Group__3_in_rule__FunctionCall__Group__26434);
            rule__FunctionCall__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__2"


    // $ANTLR start "rule__FunctionCall__Group__2__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3163:1: rule__FunctionCall__Group__2__Impl : ( ( rule__FunctionCall__ParametersAssignment_2 )? ) ;
    public final void rule__FunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3167:1: ( ( ( rule__FunctionCall__ParametersAssignment_2 )? ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3168:1: ( ( rule__FunctionCall__ParametersAssignment_2 )? )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3168:1: ( ( rule__FunctionCall__ParametersAssignment_2 )? )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3169:1: ( rule__FunctionCall__ParametersAssignment_2 )?
            {
             before(grammarAccess.getFunctionCallAccess().getParametersAssignment_2()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3170:1: ( rule__FunctionCall__ParametersAssignment_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID||LA25_0==RULE_SQBRACKET_OPEN||(LA25_0>=RULE_TML_EXISTS && LA25_0<=RULE_BRACKET_OPEN)||(LA25_0>=RULE_MINUS && LA25_0<=RULE_NUMBER)||LA25_0==RULE_DOLLAR||(LA25_0>=RULE_LITERALSTRING && LA25_0<=RULE_FALSE)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3170:2: rule__FunctionCall__ParametersAssignment_2
                    {
                    pushFollow(FOLLOW_rule__FunctionCall__ParametersAssignment_2_in_rule__FunctionCall__Group__2__Impl6461);
                    rule__FunctionCall__ParametersAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionCallAccess().getParametersAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__2__Impl"


    // $ANTLR start "rule__FunctionCall__Group__3"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3180:1: rule__FunctionCall__Group__3 : rule__FunctionCall__Group__3__Impl rule__FunctionCall__Group__4 ;
    public final void rule__FunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3184:1: ( rule__FunctionCall__Group__3__Impl rule__FunctionCall__Group__4 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3185:2: rule__FunctionCall__Group__3__Impl rule__FunctionCall__Group__4
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__3__Impl_in_rule__FunctionCall__Group__36492);
            rule__FunctionCall__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionCall__Group__4_in_rule__FunctionCall__Group__36495);
            rule__FunctionCall__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__3"


    // $ANTLR start "rule__FunctionCall__Group__3__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3192:1: rule__FunctionCall__Group__3__Impl : ( ( rule__FunctionCall__Group_3__0 )* ) ;
    public final void rule__FunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3196:1: ( ( ( rule__FunctionCall__Group_3__0 )* ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3197:1: ( ( rule__FunctionCall__Group_3__0 )* )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3197:1: ( ( rule__FunctionCall__Group_3__0 )* )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3198:1: ( rule__FunctionCall__Group_3__0 )*
            {
             before(grammarAccess.getFunctionCallAccess().getGroup_3()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3199:1: ( rule__FunctionCall__Group_3__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_COMMA) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3199:2: rule__FunctionCall__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__FunctionCall__Group_3__0_in_rule__FunctionCall__Group__3__Impl6522);
            	    rule__FunctionCall__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getFunctionCallAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__3__Impl"


    // $ANTLR start "rule__FunctionCall__Group__4"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3209:1: rule__FunctionCall__Group__4 : rule__FunctionCall__Group__4__Impl ;
    public final void rule__FunctionCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3213:1: ( rule__FunctionCall__Group__4__Impl )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3214:2: rule__FunctionCall__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__4__Impl_in_rule__FunctionCall__Group__46553);
            rule__FunctionCall__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__4"


    // $ANTLR start "rule__FunctionCall__Group__4__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3220:1: rule__FunctionCall__Group__4__Impl : ( RULE_BRACKET_CLOSE ) ;
    public final void rule__FunctionCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3224:1: ( ( RULE_BRACKET_CLOSE ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3225:1: ( RULE_BRACKET_CLOSE )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3225:1: ( RULE_BRACKET_CLOSE )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3226:1: RULE_BRACKET_CLOSE
            {
             before(grammarAccess.getFunctionCallAccess().getBRACKET_CLOSETerminalRuleCall_4()); 
            match(input,RULE_BRACKET_CLOSE,FOLLOW_RULE_BRACKET_CLOSE_in_rule__FunctionCall__Group__4__Impl6580); 
             after(grammarAccess.getFunctionCallAccess().getBRACKET_CLOSETerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group__4__Impl"


    // $ANTLR start "rule__FunctionCall__Group_3__0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3247:1: rule__FunctionCall__Group_3__0 : rule__FunctionCall__Group_3__0__Impl rule__FunctionCall__Group_3__1 ;
    public final void rule__FunctionCall__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3251:1: ( rule__FunctionCall__Group_3__0__Impl rule__FunctionCall__Group_3__1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3252:2: rule__FunctionCall__Group_3__0__Impl rule__FunctionCall__Group_3__1
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group_3__0__Impl_in_rule__FunctionCall__Group_3__06619);
            rule__FunctionCall__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionCall__Group_3__1_in_rule__FunctionCall__Group_3__06622);
            rule__FunctionCall__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_3__0"


    // $ANTLR start "rule__FunctionCall__Group_3__0__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3259:1: rule__FunctionCall__Group_3__0__Impl : ( RULE_COMMA ) ;
    public final void rule__FunctionCall__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3263:1: ( ( RULE_COMMA ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3264:1: ( RULE_COMMA )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3264:1: ( RULE_COMMA )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3265:1: RULE_COMMA
            {
             before(grammarAccess.getFunctionCallAccess().getCOMMATerminalRuleCall_3_0()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__FunctionCall__Group_3__0__Impl6649); 
             after(grammarAccess.getFunctionCallAccess().getCOMMATerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_3__0__Impl"


    // $ANTLR start "rule__FunctionCall__Group_3__1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3276:1: rule__FunctionCall__Group_3__1 : rule__FunctionCall__Group_3__1__Impl ;
    public final void rule__FunctionCall__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3280:1: ( rule__FunctionCall__Group_3__1__Impl )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3281:2: rule__FunctionCall__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group_3__1__Impl_in_rule__FunctionCall__Group_3__16678);
            rule__FunctionCall__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_3__1"


    // $ANTLR start "rule__FunctionCall__Group_3__1__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3287:1: rule__FunctionCall__Group_3__1__Impl : ( ( rule__FunctionCall__ParametersAssignment_3_1 ) ) ;
    public final void rule__FunctionCall__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3291:1: ( ( ( rule__FunctionCall__ParametersAssignment_3_1 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3292:1: ( ( rule__FunctionCall__ParametersAssignment_3_1 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3292:1: ( ( rule__FunctionCall__ParametersAssignment_3_1 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3293:1: ( rule__FunctionCall__ParametersAssignment_3_1 )
            {
             before(grammarAccess.getFunctionCallAccess().getParametersAssignment_3_1()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3294:1: ( rule__FunctionCall__ParametersAssignment_3_1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3294:2: rule__FunctionCall__ParametersAssignment_3_1
            {
            pushFollow(FOLLOW_rule__FunctionCall__ParametersAssignment_3_1_in_rule__FunctionCall__Group_3__1__Impl6705);
            rule__FunctionCall__ParametersAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionCallAccess().getParametersAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__Group_3__1__Impl"


    // $ANTLR start "rule__DateLiteral__Group__0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3308:1: rule__DateLiteral__Group__0 : rule__DateLiteral__Group__0__Impl rule__DateLiteral__Group__1 ;
    public final void rule__DateLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3312:1: ( rule__DateLiteral__Group__0__Impl rule__DateLiteral__Group__1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3313:2: rule__DateLiteral__Group__0__Impl rule__DateLiteral__Group__1
            {
            pushFollow(FOLLOW_rule__DateLiteral__Group__0__Impl_in_rule__DateLiteral__Group__06739);
            rule__DateLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DateLiteral__Group__1_in_rule__DateLiteral__Group__06742);
            rule__DateLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateLiteral__Group__0"


    // $ANTLR start "rule__DateLiteral__Group__0__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3320:1: rule__DateLiteral__Group__0__Impl : ( () ) ;
    public final void rule__DateLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3324:1: ( ( () ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3325:1: ( () )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3325:1: ( () )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3326:1: ()
            {
             before(grammarAccess.getDateLiteralAccess().getExpressionAction_0()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3327:1: ()
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3329:1: 
            {
            }

             after(grammarAccess.getDateLiteralAccess().getExpressionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateLiteral__Group__0__Impl"


    // $ANTLR start "rule__DateLiteral__Group__1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3339:1: rule__DateLiteral__Group__1 : rule__DateLiteral__Group__1__Impl rule__DateLiteral__Group__2 ;
    public final void rule__DateLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3343:1: ( rule__DateLiteral__Group__1__Impl rule__DateLiteral__Group__2 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3344:2: rule__DateLiteral__Group__1__Impl rule__DateLiteral__Group__2
            {
            pushFollow(FOLLOW_rule__DateLiteral__Group__1__Impl_in_rule__DateLiteral__Group__16800);
            rule__DateLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DateLiteral__Group__2_in_rule__DateLiteral__Group__16803);
            rule__DateLiteral__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateLiteral__Group__1"


    // $ANTLR start "rule__DateLiteral__Group__1__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3351:1: rule__DateLiteral__Group__1__Impl : ( RULE_NUMBER ) ;
    public final void rule__DateLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3355:1: ( ( RULE_NUMBER ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3356:1: ( RULE_NUMBER )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3356:1: ( RULE_NUMBER )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3357:1: RULE_NUMBER
            {
             before(grammarAccess.getDateLiteralAccess().getNUMBERTerminalRuleCall_1()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__DateLiteral__Group__1__Impl6830); 
             after(grammarAccess.getDateLiteralAccess().getNUMBERTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateLiteral__Group__1__Impl"


    // $ANTLR start "rule__DateLiteral__Group__2"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3368:1: rule__DateLiteral__Group__2 : rule__DateLiteral__Group__2__Impl rule__DateLiteral__Group__3 ;
    public final void rule__DateLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3372:1: ( rule__DateLiteral__Group__2__Impl rule__DateLiteral__Group__3 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3373:2: rule__DateLiteral__Group__2__Impl rule__DateLiteral__Group__3
            {
            pushFollow(FOLLOW_rule__DateLiteral__Group__2__Impl_in_rule__DateLiteral__Group__26859);
            rule__DateLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DateLiteral__Group__3_in_rule__DateLiteral__Group__26862);
            rule__DateLiteral__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateLiteral__Group__2"


    // $ANTLR start "rule__DateLiteral__Group__2__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3380:1: rule__DateLiteral__Group__2__Impl : ( RULE_HASH ) ;
    public final void rule__DateLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3384:1: ( ( RULE_HASH ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3385:1: ( RULE_HASH )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3385:1: ( RULE_HASH )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3386:1: RULE_HASH
            {
             before(grammarAccess.getDateLiteralAccess().getHASHTerminalRuleCall_2()); 
            match(input,RULE_HASH,FOLLOW_RULE_HASH_in_rule__DateLiteral__Group__2__Impl6889); 
             after(grammarAccess.getDateLiteralAccess().getHASHTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateLiteral__Group__2__Impl"


    // $ANTLR start "rule__DateLiteral__Group__3"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3397:1: rule__DateLiteral__Group__3 : rule__DateLiteral__Group__3__Impl rule__DateLiteral__Group__4 ;
    public final void rule__DateLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3401:1: ( rule__DateLiteral__Group__3__Impl rule__DateLiteral__Group__4 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3402:2: rule__DateLiteral__Group__3__Impl rule__DateLiteral__Group__4
            {
            pushFollow(FOLLOW_rule__DateLiteral__Group__3__Impl_in_rule__DateLiteral__Group__36918);
            rule__DateLiteral__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DateLiteral__Group__4_in_rule__DateLiteral__Group__36921);
            rule__DateLiteral__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateLiteral__Group__3"


    // $ANTLR start "rule__DateLiteral__Group__3__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3409:1: rule__DateLiteral__Group__3__Impl : ( RULE_NUMBER ) ;
    public final void rule__DateLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3413:1: ( ( RULE_NUMBER ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3414:1: ( RULE_NUMBER )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3414:1: ( RULE_NUMBER )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3415:1: RULE_NUMBER
            {
             before(grammarAccess.getDateLiteralAccess().getNUMBERTerminalRuleCall_3()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__DateLiteral__Group__3__Impl6948); 
             after(grammarAccess.getDateLiteralAccess().getNUMBERTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateLiteral__Group__3__Impl"


    // $ANTLR start "rule__DateLiteral__Group__4"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3426:1: rule__DateLiteral__Group__4 : rule__DateLiteral__Group__4__Impl rule__DateLiteral__Group__5 ;
    public final void rule__DateLiteral__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3430:1: ( rule__DateLiteral__Group__4__Impl rule__DateLiteral__Group__5 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3431:2: rule__DateLiteral__Group__4__Impl rule__DateLiteral__Group__5
            {
            pushFollow(FOLLOW_rule__DateLiteral__Group__4__Impl_in_rule__DateLiteral__Group__46977);
            rule__DateLiteral__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DateLiteral__Group__5_in_rule__DateLiteral__Group__46980);
            rule__DateLiteral__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateLiteral__Group__4"


    // $ANTLR start "rule__DateLiteral__Group__4__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3438:1: rule__DateLiteral__Group__4__Impl : ( RULE_HASH ) ;
    public final void rule__DateLiteral__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3442:1: ( ( RULE_HASH ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3443:1: ( RULE_HASH )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3443:1: ( RULE_HASH )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3444:1: RULE_HASH
            {
             before(grammarAccess.getDateLiteralAccess().getHASHTerminalRuleCall_4()); 
            match(input,RULE_HASH,FOLLOW_RULE_HASH_in_rule__DateLiteral__Group__4__Impl7007); 
             after(grammarAccess.getDateLiteralAccess().getHASHTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateLiteral__Group__4__Impl"


    // $ANTLR start "rule__DateLiteral__Group__5"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3455:1: rule__DateLiteral__Group__5 : rule__DateLiteral__Group__5__Impl rule__DateLiteral__Group__6 ;
    public final void rule__DateLiteral__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3459:1: ( rule__DateLiteral__Group__5__Impl rule__DateLiteral__Group__6 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3460:2: rule__DateLiteral__Group__5__Impl rule__DateLiteral__Group__6
            {
            pushFollow(FOLLOW_rule__DateLiteral__Group__5__Impl_in_rule__DateLiteral__Group__57036);
            rule__DateLiteral__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DateLiteral__Group__6_in_rule__DateLiteral__Group__57039);
            rule__DateLiteral__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateLiteral__Group__5"


    // $ANTLR start "rule__DateLiteral__Group__5__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3467:1: rule__DateLiteral__Group__5__Impl : ( RULE_NUMBER ) ;
    public final void rule__DateLiteral__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3471:1: ( ( RULE_NUMBER ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3472:1: ( RULE_NUMBER )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3472:1: ( RULE_NUMBER )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3473:1: RULE_NUMBER
            {
             before(grammarAccess.getDateLiteralAccess().getNUMBERTerminalRuleCall_5()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__DateLiteral__Group__5__Impl7066); 
             after(grammarAccess.getDateLiteralAccess().getNUMBERTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateLiteral__Group__5__Impl"


    // $ANTLR start "rule__DateLiteral__Group__6"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3484:1: rule__DateLiteral__Group__6 : rule__DateLiteral__Group__6__Impl rule__DateLiteral__Group__7 ;
    public final void rule__DateLiteral__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3488:1: ( rule__DateLiteral__Group__6__Impl rule__DateLiteral__Group__7 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3489:2: rule__DateLiteral__Group__6__Impl rule__DateLiteral__Group__7
            {
            pushFollow(FOLLOW_rule__DateLiteral__Group__6__Impl_in_rule__DateLiteral__Group__67095);
            rule__DateLiteral__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DateLiteral__Group__7_in_rule__DateLiteral__Group__67098);
            rule__DateLiteral__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateLiteral__Group__6"


    // $ANTLR start "rule__DateLiteral__Group__6__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3496:1: rule__DateLiteral__Group__6__Impl : ( RULE_HASH ) ;
    public final void rule__DateLiteral__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3500:1: ( ( RULE_HASH ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3501:1: ( RULE_HASH )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3501:1: ( RULE_HASH )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3502:1: RULE_HASH
            {
             before(grammarAccess.getDateLiteralAccess().getHASHTerminalRuleCall_6()); 
            match(input,RULE_HASH,FOLLOW_RULE_HASH_in_rule__DateLiteral__Group__6__Impl7125); 
             after(grammarAccess.getDateLiteralAccess().getHASHTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateLiteral__Group__6__Impl"


    // $ANTLR start "rule__DateLiteral__Group__7"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3513:1: rule__DateLiteral__Group__7 : rule__DateLiteral__Group__7__Impl rule__DateLiteral__Group__8 ;
    public final void rule__DateLiteral__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3517:1: ( rule__DateLiteral__Group__7__Impl rule__DateLiteral__Group__8 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3518:2: rule__DateLiteral__Group__7__Impl rule__DateLiteral__Group__8
            {
            pushFollow(FOLLOW_rule__DateLiteral__Group__7__Impl_in_rule__DateLiteral__Group__77154);
            rule__DateLiteral__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DateLiteral__Group__8_in_rule__DateLiteral__Group__77157);
            rule__DateLiteral__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateLiteral__Group__7"


    // $ANTLR start "rule__DateLiteral__Group__7__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3525:1: rule__DateLiteral__Group__7__Impl : ( RULE_NUMBER ) ;
    public final void rule__DateLiteral__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3529:1: ( ( RULE_NUMBER ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3530:1: ( RULE_NUMBER )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3530:1: ( RULE_NUMBER )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3531:1: RULE_NUMBER
            {
             before(grammarAccess.getDateLiteralAccess().getNUMBERTerminalRuleCall_7()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__DateLiteral__Group__7__Impl7184); 
             after(grammarAccess.getDateLiteralAccess().getNUMBERTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateLiteral__Group__7__Impl"


    // $ANTLR start "rule__DateLiteral__Group__8"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3542:1: rule__DateLiteral__Group__8 : rule__DateLiteral__Group__8__Impl rule__DateLiteral__Group__9 ;
    public final void rule__DateLiteral__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3546:1: ( rule__DateLiteral__Group__8__Impl rule__DateLiteral__Group__9 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3547:2: rule__DateLiteral__Group__8__Impl rule__DateLiteral__Group__9
            {
            pushFollow(FOLLOW_rule__DateLiteral__Group__8__Impl_in_rule__DateLiteral__Group__87213);
            rule__DateLiteral__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DateLiteral__Group__9_in_rule__DateLiteral__Group__87216);
            rule__DateLiteral__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateLiteral__Group__8"


    // $ANTLR start "rule__DateLiteral__Group__8__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3554:1: rule__DateLiteral__Group__8__Impl : ( RULE_HASH ) ;
    public final void rule__DateLiteral__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3558:1: ( ( RULE_HASH ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3559:1: ( RULE_HASH )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3559:1: ( RULE_HASH )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3560:1: RULE_HASH
            {
             before(grammarAccess.getDateLiteralAccess().getHASHTerminalRuleCall_8()); 
            match(input,RULE_HASH,FOLLOW_RULE_HASH_in_rule__DateLiteral__Group__8__Impl7243); 
             after(grammarAccess.getDateLiteralAccess().getHASHTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateLiteral__Group__8__Impl"


    // $ANTLR start "rule__DateLiteral__Group__9"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3571:1: rule__DateLiteral__Group__9 : rule__DateLiteral__Group__9__Impl rule__DateLiteral__Group__10 ;
    public final void rule__DateLiteral__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3575:1: ( rule__DateLiteral__Group__9__Impl rule__DateLiteral__Group__10 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3576:2: rule__DateLiteral__Group__9__Impl rule__DateLiteral__Group__10
            {
            pushFollow(FOLLOW_rule__DateLiteral__Group__9__Impl_in_rule__DateLiteral__Group__97272);
            rule__DateLiteral__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DateLiteral__Group__10_in_rule__DateLiteral__Group__97275);
            rule__DateLiteral__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateLiteral__Group__9"


    // $ANTLR start "rule__DateLiteral__Group__9__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3583:1: rule__DateLiteral__Group__9__Impl : ( RULE_NUMBER ) ;
    public final void rule__DateLiteral__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3587:1: ( ( RULE_NUMBER ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3588:1: ( RULE_NUMBER )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3588:1: ( RULE_NUMBER )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3589:1: RULE_NUMBER
            {
             before(grammarAccess.getDateLiteralAccess().getNUMBERTerminalRuleCall_9()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__DateLiteral__Group__9__Impl7302); 
             after(grammarAccess.getDateLiteralAccess().getNUMBERTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateLiteral__Group__9__Impl"


    // $ANTLR start "rule__DateLiteral__Group__10"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3600:1: rule__DateLiteral__Group__10 : rule__DateLiteral__Group__10__Impl rule__DateLiteral__Group__11 ;
    public final void rule__DateLiteral__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3604:1: ( rule__DateLiteral__Group__10__Impl rule__DateLiteral__Group__11 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3605:2: rule__DateLiteral__Group__10__Impl rule__DateLiteral__Group__11
            {
            pushFollow(FOLLOW_rule__DateLiteral__Group__10__Impl_in_rule__DateLiteral__Group__107331);
            rule__DateLiteral__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DateLiteral__Group__11_in_rule__DateLiteral__Group__107334);
            rule__DateLiteral__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateLiteral__Group__10"


    // $ANTLR start "rule__DateLiteral__Group__10__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3612:1: rule__DateLiteral__Group__10__Impl : ( RULE_HASH ) ;
    public final void rule__DateLiteral__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3616:1: ( ( RULE_HASH ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3617:1: ( RULE_HASH )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3617:1: ( RULE_HASH )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3618:1: RULE_HASH
            {
             before(grammarAccess.getDateLiteralAccess().getHASHTerminalRuleCall_10()); 
            match(input,RULE_HASH,FOLLOW_RULE_HASH_in_rule__DateLiteral__Group__10__Impl7361); 
             after(grammarAccess.getDateLiteralAccess().getHASHTerminalRuleCall_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateLiteral__Group__10__Impl"


    // $ANTLR start "rule__DateLiteral__Group__11"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3629:1: rule__DateLiteral__Group__11 : rule__DateLiteral__Group__11__Impl ;
    public final void rule__DateLiteral__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3633:1: ( rule__DateLiteral__Group__11__Impl )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3634:2: rule__DateLiteral__Group__11__Impl
            {
            pushFollow(FOLLOW_rule__DateLiteral__Group__11__Impl_in_rule__DateLiteral__Group__117390);
            rule__DateLiteral__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateLiteral__Group__11"


    // $ANTLR start "rule__DateLiteral__Group__11__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3640:1: rule__DateLiteral__Group__11__Impl : ( RULE_NUMBER ) ;
    public final void rule__DateLiteral__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3644:1: ( ( RULE_NUMBER ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3645:1: ( RULE_NUMBER )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3645:1: ( RULE_NUMBER )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3646:1: RULE_NUMBER
            {
             before(grammarAccess.getDateLiteralAccess().getNUMBERTerminalRuleCall_11()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__DateLiteral__Group__11__Impl7417); 
             after(grammarAccess.getDateLiteralAccess().getNUMBERTerminalRuleCall_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateLiteral__Group__11__Impl"


    // $ANTLR start "rule__Literal__Group_0__0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3681:1: rule__Literal__Group_0__0 : rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 ;
    public final void rule__Literal__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3685:1: ( rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3686:2: rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_0__0__Impl_in_rule__Literal__Group_0__07470);
            rule__Literal__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_0__1_in_rule__Literal__Group_0__07473);
            rule__Literal__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_0__0"


    // $ANTLR start "rule__Literal__Group_0__0__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3693:1: rule__Literal__Group_0__0__Impl : ( () ) ;
    public final void rule__Literal__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3697:1: ( ( () ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3698:1: ( () )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3698:1: ( () )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3699:1: ()
            {
             before(grammarAccess.getLiteralAccess().getExpressionAction_0_0()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3700:1: ()
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3702:1: 
            {
            }

             after(grammarAccess.getLiteralAccess().getExpressionAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_0__0__Impl"


    // $ANTLR start "rule__Literal__Group_0__1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3712:1: rule__Literal__Group_0__1 : rule__Literal__Group_0__1__Impl ;
    public final void rule__Literal__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3716:1: ( rule__Literal__Group_0__1__Impl )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3717:2: rule__Literal__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_0__1__Impl_in_rule__Literal__Group_0__17531);
            rule__Literal__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_0__1"


    // $ANTLR start "rule__Literal__Group_0__1__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3723:1: rule__Literal__Group_0__1__Impl : ( RULE_NUMBER ) ;
    public final void rule__Literal__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3727:1: ( ( RULE_NUMBER ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3728:1: ( RULE_NUMBER )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3728:1: ( RULE_NUMBER )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3729:1: RULE_NUMBER
            {
             before(grammarAccess.getLiteralAccess().getNUMBERTerminalRuleCall_0_1()); 
            match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__Literal__Group_0__1__Impl7558); 
             after(grammarAccess.getLiteralAccess().getNUMBERTerminalRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_0__1__Impl"


    // $ANTLR start "rule__Literal__Group_2__0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3744:1: rule__Literal__Group_2__0 : rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1 ;
    public final void rule__Literal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3748:1: ( rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3749:2: rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_2__0__Impl_in_rule__Literal__Group_2__07591);
            rule__Literal__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_2__1_in_rule__Literal__Group_2__07594);
            rule__Literal__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_2__0"


    // $ANTLR start "rule__Literal__Group_2__0__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3756:1: rule__Literal__Group_2__0__Impl : ( ( rule__Literal__OperationsAssignment_2_0 ) ) ;
    public final void rule__Literal__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3760:1: ( ( ( rule__Literal__OperationsAssignment_2_0 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3761:1: ( ( rule__Literal__OperationsAssignment_2_0 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3761:1: ( ( rule__Literal__OperationsAssignment_2_0 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3762:1: ( rule__Literal__OperationsAssignment_2_0 )
            {
             before(grammarAccess.getLiteralAccess().getOperationsAssignment_2_0()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3763:1: ( rule__Literal__OperationsAssignment_2_0 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3763:2: rule__Literal__OperationsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Literal__OperationsAssignment_2_0_in_rule__Literal__Group_2__0__Impl7621);
            rule__Literal__OperationsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getOperationsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_2__0__Impl"


    // $ANTLR start "rule__Literal__Group_2__1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3773:1: rule__Literal__Group_2__1 : rule__Literal__Group_2__1__Impl rule__Literal__Group_2__2 ;
    public final void rule__Literal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3777:1: ( rule__Literal__Group_2__1__Impl rule__Literal__Group_2__2 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3778:2: rule__Literal__Group_2__1__Impl rule__Literal__Group_2__2
            {
            pushFollow(FOLLOW_rule__Literal__Group_2__1__Impl_in_rule__Literal__Group_2__17651);
            rule__Literal__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_2__2_in_rule__Literal__Group_2__17654);
            rule__Literal__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_2__1"


    // $ANTLR start "rule__Literal__Group_2__1__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3785:1: rule__Literal__Group_2__1__Impl : ( RULE_BRACKET_OPEN ) ;
    public final void rule__Literal__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3789:1: ( ( RULE_BRACKET_OPEN ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3790:1: ( RULE_BRACKET_OPEN )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3790:1: ( RULE_BRACKET_OPEN )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3791:1: RULE_BRACKET_OPEN
            {
             before(grammarAccess.getLiteralAccess().getBRACKET_OPENTerminalRuleCall_2_1()); 
            match(input,RULE_BRACKET_OPEN,FOLLOW_RULE_BRACKET_OPEN_in_rule__Literal__Group_2__1__Impl7681); 
             after(grammarAccess.getLiteralAccess().getBRACKET_OPENTerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_2__1__Impl"


    // $ANTLR start "rule__Literal__Group_2__2"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3802:1: rule__Literal__Group_2__2 : rule__Literal__Group_2__2__Impl rule__Literal__Group_2__3 ;
    public final void rule__Literal__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3806:1: ( rule__Literal__Group_2__2__Impl rule__Literal__Group_2__3 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3807:2: rule__Literal__Group_2__2__Impl rule__Literal__Group_2__3
            {
            pushFollow(FOLLOW_rule__Literal__Group_2__2__Impl_in_rule__Literal__Group_2__27710);
            rule__Literal__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_2__3_in_rule__Literal__Group_2__27713);
            rule__Literal__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_2__2"


    // $ANTLR start "rule__Literal__Group_2__2__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3814:1: rule__Literal__Group_2__2__Impl : ( ( rule__Literal__ValueStringAssignment_2_2 ) ) ;
    public final void rule__Literal__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3818:1: ( ( ( rule__Literal__ValueStringAssignment_2_2 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3819:1: ( ( rule__Literal__ValueStringAssignment_2_2 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3819:1: ( ( rule__Literal__ValueStringAssignment_2_2 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3820:1: ( rule__Literal__ValueStringAssignment_2_2 )
            {
             before(grammarAccess.getLiteralAccess().getValueStringAssignment_2_2()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3821:1: ( rule__Literal__ValueStringAssignment_2_2 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3821:2: rule__Literal__ValueStringAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Literal__ValueStringAssignment_2_2_in_rule__Literal__Group_2__2__Impl7740);
            rule__Literal__ValueStringAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getValueStringAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_2__2__Impl"


    // $ANTLR start "rule__Literal__Group_2__3"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3831:1: rule__Literal__Group_2__3 : rule__Literal__Group_2__3__Impl rule__Literal__Group_2__4 ;
    public final void rule__Literal__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3835:1: ( rule__Literal__Group_2__3__Impl rule__Literal__Group_2__4 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3836:2: rule__Literal__Group_2__3__Impl rule__Literal__Group_2__4
            {
            pushFollow(FOLLOW_rule__Literal__Group_2__3__Impl_in_rule__Literal__Group_2__37770);
            rule__Literal__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_2__4_in_rule__Literal__Group_2__37773);
            rule__Literal__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_2__3"


    // $ANTLR start "rule__Literal__Group_2__3__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3843:1: rule__Literal__Group_2__3__Impl : ( RULE_COMMA ) ;
    public final void rule__Literal__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3847:1: ( ( RULE_COMMA ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3848:1: ( RULE_COMMA )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3848:1: ( RULE_COMMA )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3849:1: RULE_COMMA
            {
             before(grammarAccess.getLiteralAccess().getCOMMATerminalRuleCall_2_3()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__Literal__Group_2__3__Impl7800); 
             after(grammarAccess.getLiteralAccess().getCOMMATerminalRuleCall_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_2__3__Impl"


    // $ANTLR start "rule__Literal__Group_2__4"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3860:1: rule__Literal__Group_2__4 : rule__Literal__Group_2__4__Impl rule__Literal__Group_2__5 ;
    public final void rule__Literal__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3864:1: ( rule__Literal__Group_2__4__Impl rule__Literal__Group_2__5 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3865:2: rule__Literal__Group_2__4__Impl rule__Literal__Group_2__5
            {
            pushFollow(FOLLOW_rule__Literal__Group_2__4__Impl_in_rule__Literal__Group_2__47829);
            rule__Literal__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_2__5_in_rule__Literal__Group_2__47832);
            rule__Literal__Group_2__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_2__4"


    // $ANTLR start "rule__Literal__Group_2__4__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3872:1: rule__Literal__Group_2__4__Impl : ( ( rule__Literal__ParametersAssignment_2_4 ) ) ;
    public final void rule__Literal__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3876:1: ( ( ( rule__Literal__ParametersAssignment_2_4 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3877:1: ( ( rule__Literal__ParametersAssignment_2_4 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3877:1: ( ( rule__Literal__ParametersAssignment_2_4 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3878:1: ( rule__Literal__ParametersAssignment_2_4 )
            {
             before(grammarAccess.getLiteralAccess().getParametersAssignment_2_4()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3879:1: ( rule__Literal__ParametersAssignment_2_4 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3879:2: rule__Literal__ParametersAssignment_2_4
            {
            pushFollow(FOLLOW_rule__Literal__ParametersAssignment_2_4_in_rule__Literal__Group_2__4__Impl7859);
            rule__Literal__ParametersAssignment_2_4();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getParametersAssignment_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_2__4__Impl"


    // $ANTLR start "rule__Literal__Group_2__5"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3889:1: rule__Literal__Group_2__5 : rule__Literal__Group_2__5__Impl ;
    public final void rule__Literal__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3893:1: ( rule__Literal__Group_2__5__Impl )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3894:2: rule__Literal__Group_2__5__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_2__5__Impl_in_rule__Literal__Group_2__57889);
            rule__Literal__Group_2__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_2__5"


    // $ANTLR start "rule__Literal__Group_2__5__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3900:1: rule__Literal__Group_2__5__Impl : ( RULE_BRACKET_CLOSE ) ;
    public final void rule__Literal__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3904:1: ( ( RULE_BRACKET_CLOSE ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3905:1: ( RULE_BRACKET_CLOSE )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3905:1: ( RULE_BRACKET_CLOSE )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3906:1: RULE_BRACKET_CLOSE
            {
             before(grammarAccess.getLiteralAccess().getBRACKET_CLOSETerminalRuleCall_2_5()); 
            match(input,RULE_BRACKET_CLOSE,FOLLOW_RULE_BRACKET_CLOSE_in_rule__Literal__Group_2__5__Impl7916); 
             after(grammarAccess.getLiteralAccess().getBRACKET_CLOSETerminalRuleCall_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_2__5__Impl"


    // $ANTLR start "rule__Literal__Group_4__0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3929:1: rule__Literal__Group_4__0 : rule__Literal__Group_4__0__Impl rule__Literal__Group_4__1 ;
    public final void rule__Literal__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3933:1: ( rule__Literal__Group_4__0__Impl rule__Literal__Group_4__1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3934:2: rule__Literal__Group_4__0__Impl rule__Literal__Group_4__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_4__0__Impl_in_rule__Literal__Group_4__07957);
            rule__Literal__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_4__1_in_rule__Literal__Group_4__07960);
            rule__Literal__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_4__0"


    // $ANTLR start "rule__Literal__Group_4__0__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3941:1: rule__Literal__Group_4__0__Impl : ( ( rule__Literal__ExpressionTypeAssignment_4_0 ) ) ;
    public final void rule__Literal__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3945:1: ( ( ( rule__Literal__ExpressionTypeAssignment_4_0 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3946:1: ( ( rule__Literal__ExpressionTypeAssignment_4_0 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3946:1: ( ( rule__Literal__ExpressionTypeAssignment_4_0 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3947:1: ( rule__Literal__ExpressionTypeAssignment_4_0 )
            {
             before(grammarAccess.getLiteralAccess().getExpressionTypeAssignment_4_0()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3948:1: ( rule__Literal__ExpressionTypeAssignment_4_0 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3948:2: rule__Literal__ExpressionTypeAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Literal__ExpressionTypeAssignment_4_0_in_rule__Literal__Group_4__0__Impl7987);
            rule__Literal__ExpressionTypeAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getExpressionTypeAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_4__0__Impl"


    // $ANTLR start "rule__Literal__Group_4__1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3958:1: rule__Literal__Group_4__1 : rule__Literal__Group_4__1__Impl rule__Literal__Group_4__2 ;
    public final void rule__Literal__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3962:1: ( rule__Literal__Group_4__1__Impl rule__Literal__Group_4__2 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3963:2: rule__Literal__Group_4__1__Impl rule__Literal__Group_4__2
            {
            pushFollow(FOLLOW_rule__Literal__Group_4__1__Impl_in_rule__Literal__Group_4__18017);
            rule__Literal__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_4__2_in_rule__Literal__Group_4__18020);
            rule__Literal__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_4__1"


    // $ANTLR start "rule__Literal__Group_4__1__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3970:1: rule__Literal__Group_4__1__Impl : ( ( rule__Literal__ParametersAssignment_4_1 )? ) ;
    public final void rule__Literal__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3974:1: ( ( ( rule__Literal__ParametersAssignment_4_1 )? ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3975:1: ( ( rule__Literal__ParametersAssignment_4_1 )? )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3975:1: ( ( rule__Literal__ParametersAssignment_4_1 )? )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3976:1: ( rule__Literal__ParametersAssignment_4_1 )?
            {
             before(grammarAccess.getLiteralAccess().getParametersAssignment_4_1()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3977:1: ( rule__Literal__ParametersAssignment_4_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID||LA27_0==RULE_SQBRACKET_OPEN||(LA27_0>=RULE_TML_EXISTS && LA27_0<=RULE_BRACKET_OPEN)||(LA27_0>=RULE_MINUS && LA27_0<=RULE_NUMBER)||LA27_0==RULE_DOLLAR||(LA27_0>=RULE_LITERALSTRING && LA27_0<=RULE_FALSE)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3977:2: rule__Literal__ParametersAssignment_4_1
                    {
                    pushFollow(FOLLOW_rule__Literal__ParametersAssignment_4_1_in_rule__Literal__Group_4__1__Impl8047);
                    rule__Literal__ParametersAssignment_4_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLiteralAccess().getParametersAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_4__1__Impl"


    // $ANTLR start "rule__Literal__Group_4__2"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3987:1: rule__Literal__Group_4__2 : rule__Literal__Group_4__2__Impl rule__Literal__Group_4__3 ;
    public final void rule__Literal__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3991:1: ( rule__Literal__Group_4__2__Impl rule__Literal__Group_4__3 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3992:2: rule__Literal__Group_4__2__Impl rule__Literal__Group_4__3
            {
            pushFollow(FOLLOW_rule__Literal__Group_4__2__Impl_in_rule__Literal__Group_4__28078);
            rule__Literal__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_4__3_in_rule__Literal__Group_4__28081);
            rule__Literal__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_4__2"


    // $ANTLR start "rule__Literal__Group_4__2__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:3999:1: rule__Literal__Group_4__2__Impl : ( ( rule__Literal__Group_4_2__0 )* ) ;
    public final void rule__Literal__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4003:1: ( ( ( rule__Literal__Group_4_2__0 )* ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4004:1: ( ( rule__Literal__Group_4_2__0 )* )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4004:1: ( ( rule__Literal__Group_4_2__0 )* )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4005:1: ( rule__Literal__Group_4_2__0 )*
            {
             before(grammarAccess.getLiteralAccess().getGroup_4_2()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4006:1: ( rule__Literal__Group_4_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_COMMA) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4006:2: rule__Literal__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Literal__Group_4_2__0_in_rule__Literal__Group_4__2__Impl8108);
            	    rule__Literal__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getLiteralAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_4__2__Impl"


    // $ANTLR start "rule__Literal__Group_4__3"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4016:1: rule__Literal__Group_4__3 : rule__Literal__Group_4__3__Impl ;
    public final void rule__Literal__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4020:1: ( rule__Literal__Group_4__3__Impl )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4021:2: rule__Literal__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_4__3__Impl_in_rule__Literal__Group_4__38139);
            rule__Literal__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_4__3"


    // $ANTLR start "rule__Literal__Group_4__3__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4027:1: rule__Literal__Group_4__3__Impl : ( RULE_CURLYCLOSE ) ;
    public final void rule__Literal__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4031:1: ( ( RULE_CURLYCLOSE ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4032:1: ( RULE_CURLYCLOSE )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4032:1: ( RULE_CURLYCLOSE )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4033:1: RULE_CURLYCLOSE
            {
             before(grammarAccess.getLiteralAccess().getCURLYCLOSETerminalRuleCall_4_3()); 
            match(input,RULE_CURLYCLOSE,FOLLOW_RULE_CURLYCLOSE_in_rule__Literal__Group_4__3__Impl8166); 
             after(grammarAccess.getLiteralAccess().getCURLYCLOSETerminalRuleCall_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_4__3__Impl"


    // $ANTLR start "rule__Literal__Group_4_2__0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4052:1: rule__Literal__Group_4_2__0 : rule__Literal__Group_4_2__0__Impl rule__Literal__Group_4_2__1 ;
    public final void rule__Literal__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4056:1: ( rule__Literal__Group_4_2__0__Impl rule__Literal__Group_4_2__1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4057:2: rule__Literal__Group_4_2__0__Impl rule__Literal__Group_4_2__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_4_2__0__Impl_in_rule__Literal__Group_4_2__08203);
            rule__Literal__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_4_2__1_in_rule__Literal__Group_4_2__08206);
            rule__Literal__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_4_2__0"


    // $ANTLR start "rule__Literal__Group_4_2__0__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4064:1: rule__Literal__Group_4_2__0__Impl : ( RULE_COMMA ) ;
    public final void rule__Literal__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4068:1: ( ( RULE_COMMA ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4069:1: ( RULE_COMMA )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4069:1: ( RULE_COMMA )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4070:1: RULE_COMMA
            {
             before(grammarAccess.getLiteralAccess().getCOMMATerminalRuleCall_4_2_0()); 
            match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__Literal__Group_4_2__0__Impl8233); 
             after(grammarAccess.getLiteralAccess().getCOMMATerminalRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_4_2__0__Impl"


    // $ANTLR start "rule__Literal__Group_4_2__1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4081:1: rule__Literal__Group_4_2__1 : rule__Literal__Group_4_2__1__Impl ;
    public final void rule__Literal__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4085:1: ( rule__Literal__Group_4_2__1__Impl )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4086:2: rule__Literal__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_4_2__1__Impl_in_rule__Literal__Group_4_2__18262);
            rule__Literal__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_4_2__1"


    // $ANTLR start "rule__Literal__Group_4_2__1__Impl"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4092:1: rule__Literal__Group_4_2__1__Impl : ( ( rule__Literal__ParametersAssignment_4_2_1 ) ) ;
    public final void rule__Literal__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4096:1: ( ( ( rule__Literal__ParametersAssignment_4_2_1 ) ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4097:1: ( ( rule__Literal__ParametersAssignment_4_2_1 ) )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4097:1: ( ( rule__Literal__ParametersAssignment_4_2_1 ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4098:1: ( rule__Literal__ParametersAssignment_4_2_1 )
            {
             before(grammarAccess.getLiteralAccess().getParametersAssignment_4_2_1()); 
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4099:1: ( rule__Literal__ParametersAssignment_4_2_1 )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4099:2: rule__Literal__ParametersAssignment_4_2_1
            {
            pushFollow(FOLLOW_rule__Literal__ParametersAssignment_4_2_1_in_rule__Literal__Group_4_2__1__Impl8289);
            rule__Literal__ParametersAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getParametersAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_4_2__1__Impl"


    // $ANTLR start "rule__TopLevel__ToplevelExpressionAssignment"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4114:1: rule__TopLevel__ToplevelExpressionAssignment : ( ruleOrExpression ) ;
    public final void rule__TopLevel__ToplevelExpressionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4118:1: ( ( ruleOrExpression ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4119:1: ( ruleOrExpression )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4119:1: ( ruleOrExpression )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4120:1: ruleOrExpression
            {
             before(grammarAccess.getTopLevelAccess().getToplevelExpressionOrExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleOrExpression_in_rule__TopLevel__ToplevelExpressionAssignment8328);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getTopLevelAccess().getToplevelExpressionOrExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopLevel__ToplevelExpressionAssignment"


    // $ANTLR start "rule__TmlExpression__AbsoluteAssignment_1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4129:1: rule__TmlExpression__AbsoluteAssignment_1 : ( RULE_TML_SEPARATOR ) ;
    public final void rule__TmlExpression__AbsoluteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4133:1: ( ( RULE_TML_SEPARATOR ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4134:1: ( RULE_TML_SEPARATOR )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4134:1: ( RULE_TML_SEPARATOR )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4135:1: RULE_TML_SEPARATOR
            {
             before(grammarAccess.getTmlExpressionAccess().getAbsoluteTML_SEPARATORTerminalRuleCall_1_0()); 
            match(input,RULE_TML_SEPARATOR,FOLLOW_RULE_TML_SEPARATOR_in_rule__TmlExpression__AbsoluteAssignment_18359); 
             after(grammarAccess.getTmlExpressionAccess().getAbsoluteTML_SEPARATORTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TmlExpression__AbsoluteAssignment_1"


    // $ANTLR start "rule__TmlExpression__ParamAssignment_2"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4144:1: rule__TmlExpression__ParamAssignment_2 : ( RULE_AT ) ;
    public final void rule__TmlExpression__ParamAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4148:1: ( ( RULE_AT ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4149:1: ( RULE_AT )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4149:1: ( RULE_AT )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4150:1: RULE_AT
            {
             before(grammarAccess.getTmlExpressionAccess().getParamATTerminalRuleCall_2_0()); 
            match(input,RULE_AT,FOLLOW_RULE_AT_in_rule__TmlExpression__ParamAssignment_28390); 
             after(grammarAccess.getTmlExpressionAccess().getParamATTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TmlExpression__ParamAssignment_2"


    // $ANTLR start "rule__TmlExpression__ElementsAssignment_3"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4159:1: rule__TmlExpression__ElementsAssignment_3 : ( rulePathElement ) ;
    public final void rule__TmlExpression__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4163:1: ( ( rulePathElement ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4164:1: ( rulePathElement )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4164:1: ( rulePathElement )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4165:1: rulePathElement
            {
             before(grammarAccess.getTmlExpressionAccess().getElementsPathElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulePathElement_in_rule__TmlExpression__ElementsAssignment_38421);
            rulePathElement();

            state._fsp--;

             after(grammarAccess.getTmlExpressionAccess().getElementsPathElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TmlExpression__ElementsAssignment_3"


    // $ANTLR start "rule__TmlExpression__ElementsAssignment_4_1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4174:1: rule__TmlExpression__ElementsAssignment_4_1 : ( rulePathElement ) ;
    public final void rule__TmlExpression__ElementsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4178:1: ( ( rulePathElement ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4179:1: ( rulePathElement )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4179:1: ( rulePathElement )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4180:1: rulePathElement
            {
             before(grammarAccess.getTmlExpressionAccess().getElementsPathElementParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_rulePathElement_in_rule__TmlExpression__ElementsAssignment_4_18452);
            rulePathElement();

            state._fsp--;

             after(grammarAccess.getTmlExpressionAccess().getElementsPathElementParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TmlExpression__ElementsAssignment_4_1"


    // $ANTLR start "rule__ExistsTmlExpression__AbsoluteAssignment_2"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4189:1: rule__ExistsTmlExpression__AbsoluteAssignment_2 : ( RULE_TML_SEPARATOR ) ;
    public final void rule__ExistsTmlExpression__AbsoluteAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4193:1: ( ( RULE_TML_SEPARATOR ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4194:1: ( RULE_TML_SEPARATOR )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4194:1: ( RULE_TML_SEPARATOR )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4195:1: RULE_TML_SEPARATOR
            {
             before(grammarAccess.getExistsTmlExpressionAccess().getAbsoluteTML_SEPARATORTerminalRuleCall_2_0()); 
            match(input,RULE_TML_SEPARATOR,FOLLOW_RULE_TML_SEPARATOR_in_rule__ExistsTmlExpression__AbsoluteAssignment_28483); 
             after(grammarAccess.getExistsTmlExpressionAccess().getAbsoluteTML_SEPARATORTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistsTmlExpression__AbsoluteAssignment_2"


    // $ANTLR start "rule__ExistsTmlExpression__ParamAssignment_3"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4204:1: rule__ExistsTmlExpression__ParamAssignment_3 : ( RULE_AT ) ;
    public final void rule__ExistsTmlExpression__ParamAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4208:1: ( ( RULE_AT ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4209:1: ( RULE_AT )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4209:1: ( RULE_AT )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4210:1: RULE_AT
            {
             before(grammarAccess.getExistsTmlExpressionAccess().getParamATTerminalRuleCall_3_0()); 
            match(input,RULE_AT,FOLLOW_RULE_AT_in_rule__ExistsTmlExpression__ParamAssignment_38514); 
             after(grammarAccess.getExistsTmlExpressionAccess().getParamATTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistsTmlExpression__ParamAssignment_3"


    // $ANTLR start "rule__ExistsTmlExpression__ElementsAssignment_4"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4219:1: rule__ExistsTmlExpression__ElementsAssignment_4 : ( rulePathElement ) ;
    public final void rule__ExistsTmlExpression__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4223:1: ( ( rulePathElement ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4224:1: ( rulePathElement )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4224:1: ( rulePathElement )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4225:1: rulePathElement
            {
             before(grammarAccess.getExistsTmlExpressionAccess().getElementsPathElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_rulePathElement_in_rule__ExistsTmlExpression__ElementsAssignment_48545);
            rulePathElement();

            state._fsp--;

             after(grammarAccess.getExistsTmlExpressionAccess().getElementsPathElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistsTmlExpression__ElementsAssignment_4"


    // $ANTLR start "rule__ExistsTmlExpression__ElementsAssignment_5_1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4234:1: rule__ExistsTmlExpression__ElementsAssignment_5_1 : ( rulePathElement ) ;
    public final void rule__ExistsTmlExpression__ElementsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4238:1: ( ( rulePathElement ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4239:1: ( rulePathElement )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4239:1: ( rulePathElement )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4240:1: rulePathElement
            {
             before(grammarAccess.getExistsTmlExpressionAccess().getElementsPathElementParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_rulePathElement_in_rule__ExistsTmlExpression__ElementsAssignment_5_18576);
            rulePathElement();

            state._fsp--;

             after(grammarAccess.getExistsTmlExpressionAccess().getElementsPathElementParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExistsTmlExpression__ElementsAssignment_5_1"


    // $ANTLR start "rule__MapReferenceParams__GetterParamsAssignment_1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4249:1: rule__MapReferenceParams__GetterParamsAssignment_1 : ( ruleLiteral ) ;
    public final void rule__MapReferenceParams__GetterParamsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4253:1: ( ( ruleLiteral ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4254:1: ( ruleLiteral )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4254:1: ( ruleLiteral )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4255:1: ruleLiteral
            {
             before(grammarAccess.getMapReferenceParamsAccess().getGetterParamsLiteralParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__MapReferenceParams__GetterParamsAssignment_18607);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getMapReferenceParamsAccess().getGetterParamsLiteralParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapReferenceParams__GetterParamsAssignment_1"


    // $ANTLR start "rule__MapReferenceParams__GetterParamsAssignment_2_1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4264:1: rule__MapReferenceParams__GetterParamsAssignment_2_1 : ( ruleLiteral ) ;
    public final void rule__MapReferenceParams__GetterParamsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4268:1: ( ( ruleLiteral ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4269:1: ( ruleLiteral )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4269:1: ( ruleLiteral )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4270:1: ruleLiteral
            {
             before(grammarAccess.getMapReferenceParamsAccess().getGetterParamsLiteralParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__MapReferenceParams__GetterParamsAssignment_2_18638);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getMapReferenceParamsAccess().getGetterParamsLiteralParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapReferenceParams__GetterParamsAssignment_2_1"


    // $ANTLR start "rule__MapGetReference__OperationsAssignment_0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4279:1: rule__MapGetReference__OperationsAssignment_0 : ( RULE_DOLLAR ) ;
    public final void rule__MapGetReference__OperationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4283:1: ( ( RULE_DOLLAR ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4284:1: ( RULE_DOLLAR )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4284:1: ( RULE_DOLLAR )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4285:1: RULE_DOLLAR
            {
             before(grammarAccess.getMapGetReferenceAccess().getOperationsDOLLARTerminalRuleCall_0_0()); 
            match(input,RULE_DOLLAR,FOLLOW_RULE_DOLLAR_in_rule__MapGetReference__OperationsAssignment_08669); 
             after(grammarAccess.getMapGetReferenceAccess().getOperationsDOLLARTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapGetReference__OperationsAssignment_0"


    // $ANTLR start "rule__MapGetReference__ElementsAssignment_1_0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4294:1: rule__MapGetReference__ElementsAssignment_1_0 : ( RULE_PARENT ) ;
    public final void rule__MapGetReference__ElementsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4298:1: ( ( RULE_PARENT ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4299:1: ( RULE_PARENT )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4299:1: ( RULE_PARENT )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4300:1: RULE_PARENT
            {
             before(grammarAccess.getMapGetReferenceAccess().getElementsPARENTTerminalRuleCall_1_0_0()); 
            match(input,RULE_PARENT,FOLLOW_RULE_PARENT_in_rule__MapGetReference__ElementsAssignment_1_08700); 
             after(grammarAccess.getMapGetReferenceAccess().getElementsPARENTTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapGetReference__ElementsAssignment_1_0"


    // $ANTLR start "rule__MapGetReference__ElementsAssignment_2"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4309:1: rule__MapGetReference__ElementsAssignment_2 : ( RULE_ID ) ;
    public final void rule__MapGetReference__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4313:1: ( ( RULE_ID ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4314:1: ( RULE_ID )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4314:1: ( RULE_ID )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4315:1: RULE_ID
            {
             before(grammarAccess.getMapGetReferenceAccess().getElementsIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MapGetReference__ElementsAssignment_28731); 
             after(grammarAccess.getMapGetReferenceAccess().getElementsIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapGetReference__ElementsAssignment_2"


    // $ANTLR start "rule__MapGetReference__ReferenceParamsAssignment_3"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4324:1: rule__MapGetReference__ReferenceParamsAssignment_3 : ( ruleMapReferenceParams ) ;
    public final void rule__MapGetReference__ReferenceParamsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4328:1: ( ( ruleMapReferenceParams ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4329:1: ( ruleMapReferenceParams )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4329:1: ( ruleMapReferenceParams )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4330:1: ruleMapReferenceParams
            {
             before(grammarAccess.getMapGetReferenceAccess().getReferenceParamsMapReferenceParamsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMapReferenceParams_in_rule__MapGetReference__ReferenceParamsAssignment_38762);
            ruleMapReferenceParams();

            state._fsp--;

             after(grammarAccess.getMapGetReferenceAccess().getReferenceParamsMapReferenceParamsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MapGetReference__ReferenceParamsAssignment_3"


    // $ANTLR start "rule__OrExpression__ParametersAssignment_0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4339:1: rule__OrExpression__ParametersAssignment_0 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__ParametersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4343:1: ( ( ruleAndExpression ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4344:1: ( ruleAndExpression )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4344:1: ( ruleAndExpression )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4345:1: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getParametersAndExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAndExpression_in_rule__OrExpression__ParametersAssignment_08793);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getParametersAndExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__ParametersAssignment_0"


    // $ANTLR start "rule__OrExpression__OperationsAssignment_1_0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4354:1: rule__OrExpression__OperationsAssignment_1_0 : ( RULE_OR ) ;
    public final void rule__OrExpression__OperationsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4358:1: ( ( RULE_OR ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4359:1: ( RULE_OR )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4359:1: ( RULE_OR )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4360:1: RULE_OR
            {
             before(grammarAccess.getOrExpressionAccess().getOperationsORTerminalRuleCall_1_0_0()); 
            match(input,RULE_OR,FOLLOW_RULE_OR_in_rule__OrExpression__OperationsAssignment_1_08824); 
             after(grammarAccess.getOrExpressionAccess().getOperationsORTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__OperationsAssignment_1_0"


    // $ANTLR start "rule__OrExpression__ParametersAssignment_1_1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4369:1: rule__OrExpression__ParametersAssignment_1_1 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__ParametersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4373:1: ( ( ruleAndExpression ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4374:1: ( ruleAndExpression )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4374:1: ( ruleAndExpression )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4375:1: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getParametersAndExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAndExpression_in_rule__OrExpression__ParametersAssignment_1_18855);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getParametersAndExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__ParametersAssignment_1_1"


    // $ANTLR start "rule__AndExpression__ParametersAssignment_0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4384:1: rule__AndExpression__ParametersAssignment_0 : ( ruleEqualityExpression ) ;
    public final void rule__AndExpression__ParametersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4388:1: ( ( ruleEqualityExpression ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4389:1: ( ruleEqualityExpression )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4389:1: ( ruleEqualityExpression )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4390:1: ruleEqualityExpression
            {
             before(grammarAccess.getAndExpressionAccess().getParametersEqualityExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEqualityExpression_in_rule__AndExpression__ParametersAssignment_08886);
            ruleEqualityExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getParametersEqualityExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__ParametersAssignment_0"


    // $ANTLR start "rule__AndExpression__OperationsAssignment_1_0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4399:1: rule__AndExpression__OperationsAssignment_1_0 : ( RULE_AND ) ;
    public final void rule__AndExpression__OperationsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4403:1: ( ( RULE_AND ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4404:1: ( RULE_AND )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4404:1: ( RULE_AND )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4405:1: RULE_AND
            {
             before(grammarAccess.getAndExpressionAccess().getOperationsANDTerminalRuleCall_1_0_0()); 
            match(input,RULE_AND,FOLLOW_RULE_AND_in_rule__AndExpression__OperationsAssignment_1_08917); 
             after(grammarAccess.getAndExpressionAccess().getOperationsANDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__OperationsAssignment_1_0"


    // $ANTLR start "rule__AndExpression__ParametersAssignment_1_1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4414:1: rule__AndExpression__ParametersAssignment_1_1 : ( ruleEqualityExpression ) ;
    public final void rule__AndExpression__ParametersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4418:1: ( ( ruleEqualityExpression ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4419:1: ( ruleEqualityExpression )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4419:1: ( ruleEqualityExpression )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4420:1: ruleEqualityExpression
            {
             before(grammarAccess.getAndExpressionAccess().getParametersEqualityExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleEqualityExpression_in_rule__AndExpression__ParametersAssignment_1_18948);
            ruleEqualityExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getParametersEqualityExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__ParametersAssignment_1_1"


    // $ANTLR start "rule__EqualityExpression__ParametersAssignment_0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4429:1: rule__EqualityExpression__ParametersAssignment_0 : ( ruleRelationalExpression ) ;
    public final void rule__EqualityExpression__ParametersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4433:1: ( ( ruleRelationalExpression ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4434:1: ( ruleRelationalExpression )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4434:1: ( ruleRelationalExpression )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4435:1: ruleRelationalExpression
            {
             before(grammarAccess.getEqualityExpressionAccess().getParametersRelationalExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleRelationalExpression_in_rule__EqualityExpression__ParametersAssignment_08979);
            ruleRelationalExpression();

            state._fsp--;

             after(grammarAccess.getEqualityExpressionAccess().getParametersRelationalExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__ParametersAssignment_0"


    // $ANTLR start "rule__EqualityExpression__OperationsAssignment_1_0_0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4444:1: rule__EqualityExpression__OperationsAssignment_1_0_0 : ( RULE_EQUALSEQUALS ) ;
    public final void rule__EqualityExpression__OperationsAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4448:1: ( ( RULE_EQUALSEQUALS ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4449:1: ( RULE_EQUALSEQUALS )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4449:1: ( RULE_EQUALSEQUALS )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4450:1: RULE_EQUALSEQUALS
            {
             before(grammarAccess.getEqualityExpressionAccess().getOperationsEQUALSEQUALSTerminalRuleCall_1_0_0_0()); 
            match(input,RULE_EQUALSEQUALS,FOLLOW_RULE_EQUALSEQUALS_in_rule__EqualityExpression__OperationsAssignment_1_0_09010); 
             after(grammarAccess.getEqualityExpressionAccess().getOperationsEQUALSEQUALSTerminalRuleCall_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__OperationsAssignment_1_0_0"


    // $ANTLR start "rule__EqualityExpression__ParametersAssignment_1_0_1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4459:1: rule__EqualityExpression__ParametersAssignment_1_0_1 : ( ruleRelationalExpression ) ;
    public final void rule__EqualityExpression__ParametersAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4463:1: ( ( ruleRelationalExpression ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4464:1: ( ruleRelationalExpression )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4464:1: ( ruleRelationalExpression )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4465:1: ruleRelationalExpression
            {
             before(grammarAccess.getEqualityExpressionAccess().getParametersRelationalExpressionParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_ruleRelationalExpression_in_rule__EqualityExpression__ParametersAssignment_1_0_19041);
            ruleRelationalExpression();

            state._fsp--;

             after(grammarAccess.getEqualityExpressionAccess().getParametersRelationalExpressionParserRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__ParametersAssignment_1_0_1"


    // $ANTLR start "rule__EqualityExpression__OperationsAssignment_1_1_0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4474:1: rule__EqualityExpression__OperationsAssignment_1_1_0 : ( RULE_NEQUALS ) ;
    public final void rule__EqualityExpression__OperationsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4478:1: ( ( RULE_NEQUALS ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4479:1: ( RULE_NEQUALS )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4479:1: ( RULE_NEQUALS )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4480:1: RULE_NEQUALS
            {
             before(grammarAccess.getEqualityExpressionAccess().getOperationsNEQUALSTerminalRuleCall_1_1_0_0()); 
            match(input,RULE_NEQUALS,FOLLOW_RULE_NEQUALS_in_rule__EqualityExpression__OperationsAssignment_1_1_09072); 
             after(grammarAccess.getEqualityExpressionAccess().getOperationsNEQUALSTerminalRuleCall_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__OperationsAssignment_1_1_0"


    // $ANTLR start "rule__EqualityExpression__ParametersAssignment_1_1_1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4489:1: rule__EqualityExpression__ParametersAssignment_1_1_1 : ( ruleRelationalExpression ) ;
    public final void rule__EqualityExpression__ParametersAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4493:1: ( ( ruleRelationalExpression ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4494:1: ( ruleRelationalExpression )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4494:1: ( ruleRelationalExpression )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4495:1: ruleRelationalExpression
            {
             before(grammarAccess.getEqualityExpressionAccess().getParametersRelationalExpressionParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleRelationalExpression_in_rule__EqualityExpression__ParametersAssignment_1_1_19103);
            ruleRelationalExpression();

            state._fsp--;

             after(grammarAccess.getEqualityExpressionAccess().getParametersRelationalExpressionParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EqualityExpression__ParametersAssignment_1_1_1"


    // $ANTLR start "rule__RelationalExpression__ParametersAssignment_1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4504:1: rule__RelationalExpression__ParametersAssignment_1 : ( ruleAdditiveExpression ) ;
    public final void rule__RelationalExpression__ParametersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4508:1: ( ( ruleAdditiveExpression ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4509:1: ( ruleAdditiveExpression )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4509:1: ( ruleAdditiveExpression )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4510:1: ruleAdditiveExpression
            {
             before(grammarAccess.getRelationalExpressionAccess().getParametersAdditiveExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAdditiveExpression_in_rule__RelationalExpression__ParametersAssignment_19134);
            ruleAdditiveExpression();

            state._fsp--;

             after(grammarAccess.getRelationalExpressionAccess().getParametersAdditiveExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__ParametersAssignment_1"


    // $ANTLR start "rule__RelationalExpression__OperationsAssignment_2_0_0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4519:1: rule__RelationalExpression__OperationsAssignment_2_0_0 : ( RULE_XML_LT ) ;
    public final void rule__RelationalExpression__OperationsAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4523:1: ( ( RULE_XML_LT ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4524:1: ( RULE_XML_LT )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4524:1: ( RULE_XML_LT )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4525:1: RULE_XML_LT
            {
             before(grammarAccess.getRelationalExpressionAccess().getOperationsXML_LTTerminalRuleCall_2_0_0_0()); 
            match(input,RULE_XML_LT,FOLLOW_RULE_XML_LT_in_rule__RelationalExpression__OperationsAssignment_2_0_09165); 
             after(grammarAccess.getRelationalExpressionAccess().getOperationsXML_LTTerminalRuleCall_2_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__OperationsAssignment_2_0_0"


    // $ANTLR start "rule__RelationalExpression__ParametersAssignment_2_0_1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4534:1: rule__RelationalExpression__ParametersAssignment_2_0_1 : ( ruleAdditiveExpression ) ;
    public final void rule__RelationalExpression__ParametersAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4538:1: ( ( ruleAdditiveExpression ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4539:1: ( ruleAdditiveExpression )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4539:1: ( ruleAdditiveExpression )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4540:1: ruleAdditiveExpression
            {
             before(grammarAccess.getRelationalExpressionAccess().getParametersAdditiveExpressionParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_ruleAdditiveExpression_in_rule__RelationalExpression__ParametersAssignment_2_0_19196);
            ruleAdditiveExpression();

            state._fsp--;

             after(grammarAccess.getRelationalExpressionAccess().getParametersAdditiveExpressionParserRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__ParametersAssignment_2_0_1"


    // $ANTLR start "rule__RelationalExpression__OperationsAssignment_2_1_0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4549:1: rule__RelationalExpression__OperationsAssignment_2_1_0 : ( RULE_XML_GT ) ;
    public final void rule__RelationalExpression__OperationsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4553:1: ( ( RULE_XML_GT ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4554:1: ( RULE_XML_GT )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4554:1: ( RULE_XML_GT )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4555:1: RULE_XML_GT
            {
             before(grammarAccess.getRelationalExpressionAccess().getOperationsXML_GTTerminalRuleCall_2_1_0_0()); 
            match(input,RULE_XML_GT,FOLLOW_RULE_XML_GT_in_rule__RelationalExpression__OperationsAssignment_2_1_09227); 
             after(grammarAccess.getRelationalExpressionAccess().getOperationsXML_GTTerminalRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__OperationsAssignment_2_1_0"


    // $ANTLR start "rule__RelationalExpression__ParametersAssignment_2_1_1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4564:1: rule__RelationalExpression__ParametersAssignment_2_1_1 : ( ruleAdditiveExpression ) ;
    public final void rule__RelationalExpression__ParametersAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4568:1: ( ( ruleAdditiveExpression ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4569:1: ( ruleAdditiveExpression )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4569:1: ( ruleAdditiveExpression )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4570:1: ruleAdditiveExpression
            {
             before(grammarAccess.getRelationalExpressionAccess().getParametersAdditiveExpressionParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleAdditiveExpression_in_rule__RelationalExpression__ParametersAssignment_2_1_19258);
            ruleAdditiveExpression();

            state._fsp--;

             after(grammarAccess.getRelationalExpressionAccess().getParametersAdditiveExpressionParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__ParametersAssignment_2_1_1"


    // $ANTLR start "rule__RelationalExpression__OperationsAssignment_2_2_0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4579:1: rule__RelationalExpression__OperationsAssignment_2_2_0 : ( RULE_XML_LTEQ ) ;
    public final void rule__RelationalExpression__OperationsAssignment_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4583:1: ( ( RULE_XML_LTEQ ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4584:1: ( RULE_XML_LTEQ )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4584:1: ( RULE_XML_LTEQ )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4585:1: RULE_XML_LTEQ
            {
             before(grammarAccess.getRelationalExpressionAccess().getOperationsXML_LTEQTerminalRuleCall_2_2_0_0()); 
            match(input,RULE_XML_LTEQ,FOLLOW_RULE_XML_LTEQ_in_rule__RelationalExpression__OperationsAssignment_2_2_09289); 
             after(grammarAccess.getRelationalExpressionAccess().getOperationsXML_LTEQTerminalRuleCall_2_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__OperationsAssignment_2_2_0"


    // $ANTLR start "rule__RelationalExpression__ParametersAssignment_2_2_1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4594:1: rule__RelationalExpression__ParametersAssignment_2_2_1 : ( ruleAdditiveExpression ) ;
    public final void rule__RelationalExpression__ParametersAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4598:1: ( ( ruleAdditiveExpression ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4599:1: ( ruleAdditiveExpression )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4599:1: ( ruleAdditiveExpression )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4600:1: ruleAdditiveExpression
            {
             before(grammarAccess.getRelationalExpressionAccess().getParametersAdditiveExpressionParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleAdditiveExpression_in_rule__RelationalExpression__ParametersAssignment_2_2_19320);
            ruleAdditiveExpression();

            state._fsp--;

             after(grammarAccess.getRelationalExpressionAccess().getParametersAdditiveExpressionParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__ParametersAssignment_2_2_1"


    // $ANTLR start "rule__RelationalExpression__OperationsAssignment_2_3_0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4609:1: rule__RelationalExpression__OperationsAssignment_2_3_0 : ( RULE_XML_GTEQ ) ;
    public final void rule__RelationalExpression__OperationsAssignment_2_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4613:1: ( ( RULE_XML_GTEQ ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4614:1: ( RULE_XML_GTEQ )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4614:1: ( RULE_XML_GTEQ )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4615:1: RULE_XML_GTEQ
            {
             before(grammarAccess.getRelationalExpressionAccess().getOperationsXML_GTEQTerminalRuleCall_2_3_0_0()); 
            match(input,RULE_XML_GTEQ,FOLLOW_RULE_XML_GTEQ_in_rule__RelationalExpression__OperationsAssignment_2_3_09351); 
             after(grammarAccess.getRelationalExpressionAccess().getOperationsXML_GTEQTerminalRuleCall_2_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__OperationsAssignment_2_3_0"


    // $ANTLR start "rule__RelationalExpression__ParametersAssignment_2_3_1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4624:1: rule__RelationalExpression__ParametersAssignment_2_3_1 : ( ruleAdditiveExpression ) ;
    public final void rule__RelationalExpression__ParametersAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4628:1: ( ( ruleAdditiveExpression ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4629:1: ( ruleAdditiveExpression )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4629:1: ( ruleAdditiveExpression )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4630:1: ruleAdditiveExpression
            {
             before(grammarAccess.getRelationalExpressionAccess().getParametersAdditiveExpressionParserRuleCall_2_3_1_0()); 
            pushFollow(FOLLOW_ruleAdditiveExpression_in_rule__RelationalExpression__ParametersAssignment_2_3_19382);
            ruleAdditiveExpression();

            state._fsp--;

             after(grammarAccess.getRelationalExpressionAccess().getParametersAdditiveExpressionParserRuleCall_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationalExpression__ParametersAssignment_2_3_1"


    // $ANTLR start "rule__AdditiveExpression__ParametersAssignment_0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4639:1: rule__AdditiveExpression__ParametersAssignment_0 : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__ParametersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4643:1: ( ( ruleMultiplicativeExpression ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4644:1: ( ruleMultiplicativeExpression )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4644:1: ( ruleMultiplicativeExpression )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4645:1: ruleMultiplicativeExpression
            {
             before(grammarAccess.getAdditiveExpressionAccess().getParametersMultiplicativeExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_rule__AdditiveExpression__ParametersAssignment_09413);
            ruleMultiplicativeExpression();

            state._fsp--;

             after(grammarAccess.getAdditiveExpressionAccess().getParametersMultiplicativeExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__ParametersAssignment_0"


    // $ANTLR start "rule__AdditiveExpression__ParametersAssignment_1_0_1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4654:1: rule__AdditiveExpression__ParametersAssignment_1_0_1 : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__ParametersAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4658:1: ( ( ruleMultiplicativeExpression ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4659:1: ( ruleMultiplicativeExpression )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4659:1: ( ruleMultiplicativeExpression )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4660:1: ruleMultiplicativeExpression
            {
             before(grammarAccess.getAdditiveExpressionAccess().getParametersMultiplicativeExpressionParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_rule__AdditiveExpression__ParametersAssignment_1_0_19444);
            ruleMultiplicativeExpression();

            state._fsp--;

             after(grammarAccess.getAdditiveExpressionAccess().getParametersMultiplicativeExpressionParserRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__ParametersAssignment_1_0_1"


    // $ANTLR start "rule__AdditiveExpression__ParametersAssignment_1_1_1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4669:1: rule__AdditiveExpression__ParametersAssignment_1_1_1 : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__ParametersAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4673:1: ( ( ruleMultiplicativeExpression ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4674:1: ( ruleMultiplicativeExpression )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4674:1: ( ruleMultiplicativeExpression )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4675:1: ruleMultiplicativeExpression
            {
             before(grammarAccess.getAdditiveExpressionAccess().getParametersMultiplicativeExpressionParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_rule__AdditiveExpression__ParametersAssignment_1_1_19475);
            ruleMultiplicativeExpression();

            state._fsp--;

             after(grammarAccess.getAdditiveExpressionAccess().getParametersMultiplicativeExpressionParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__ParametersAssignment_1_1_1"


    // $ANTLR start "rule__MultiplicativeExpression__ParametersAssignment_0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4684:1: rule__MultiplicativeExpression__ParametersAssignment_0 : ( ruleUnaryExpression ) ;
    public final void rule__MultiplicativeExpression__ParametersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4688:1: ( ( ruleUnaryExpression ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4689:1: ( ruleUnaryExpression )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4689:1: ( ruleUnaryExpression )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4690:1: ruleUnaryExpression
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getParametersUnaryExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleUnaryExpression_in_rule__MultiplicativeExpression__ParametersAssignment_09506);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionAccess().getParametersUnaryExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__ParametersAssignment_0"


    // $ANTLR start "rule__MultiplicativeExpression__OperationsAssignment_1_0_0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4699:1: rule__MultiplicativeExpression__OperationsAssignment_1_0_0 : ( RULE_MULTIPLY ) ;
    public final void rule__MultiplicativeExpression__OperationsAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4703:1: ( ( RULE_MULTIPLY ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4704:1: ( RULE_MULTIPLY )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4704:1: ( RULE_MULTIPLY )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4705:1: RULE_MULTIPLY
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getOperationsMULTIPLYTerminalRuleCall_1_0_0_0()); 
            match(input,RULE_MULTIPLY,FOLLOW_RULE_MULTIPLY_in_rule__MultiplicativeExpression__OperationsAssignment_1_0_09537); 
             after(grammarAccess.getMultiplicativeExpressionAccess().getOperationsMULTIPLYTerminalRuleCall_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__OperationsAssignment_1_0_0"


    // $ANTLR start "rule__MultiplicativeExpression__ParametersAssignment_1_0_1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4714:1: rule__MultiplicativeExpression__ParametersAssignment_1_0_1 : ( ruleUnaryExpression ) ;
    public final void rule__MultiplicativeExpression__ParametersAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4718:1: ( ( ruleUnaryExpression ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4719:1: ( ruleUnaryExpression )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4719:1: ( ruleUnaryExpression )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4720:1: ruleUnaryExpression
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getParametersUnaryExpressionParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_ruleUnaryExpression_in_rule__MultiplicativeExpression__ParametersAssignment_1_0_19568);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionAccess().getParametersUnaryExpressionParserRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__ParametersAssignment_1_0_1"


    // $ANTLR start "rule__MultiplicativeExpression__OperationsAssignment_1_1_0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4729:1: rule__MultiplicativeExpression__OperationsAssignment_1_1_0 : ( RULE_TML_SEPARATOR ) ;
    public final void rule__MultiplicativeExpression__OperationsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4733:1: ( ( RULE_TML_SEPARATOR ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4734:1: ( RULE_TML_SEPARATOR )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4734:1: ( RULE_TML_SEPARATOR )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4735:1: RULE_TML_SEPARATOR
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getOperationsTML_SEPARATORTerminalRuleCall_1_1_0_0()); 
            match(input,RULE_TML_SEPARATOR,FOLLOW_RULE_TML_SEPARATOR_in_rule__MultiplicativeExpression__OperationsAssignment_1_1_09599); 
             after(grammarAccess.getMultiplicativeExpressionAccess().getOperationsTML_SEPARATORTerminalRuleCall_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__OperationsAssignment_1_1_0"


    // $ANTLR start "rule__MultiplicativeExpression__ParametersAssignment_1_1_1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4744:1: rule__MultiplicativeExpression__ParametersAssignment_1_1_1 : ( ruleUnaryExpression ) ;
    public final void rule__MultiplicativeExpression__ParametersAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4748:1: ( ( ruleUnaryExpression ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4749:1: ( ruleUnaryExpression )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4749:1: ( ruleUnaryExpression )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4750:1: ruleUnaryExpression
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getParametersUnaryExpressionParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleUnaryExpression_in_rule__MultiplicativeExpression__ParametersAssignment_1_1_19630);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionAccess().getParametersUnaryExpressionParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__ParametersAssignment_1_1_1"


    // $ANTLR start "rule__UnaryExpression__ParametersAssignment_0_0_1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4759:1: rule__UnaryExpression__ParametersAssignment_0_0_1 : ( rulePrimaryExpression ) ;
    public final void rule__UnaryExpression__ParametersAssignment_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4763:1: ( ( rulePrimaryExpression ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4764:1: ( rulePrimaryExpression )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4764:1: ( rulePrimaryExpression )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4765:1: rulePrimaryExpression
            {
             before(grammarAccess.getUnaryExpressionAccess().getParametersPrimaryExpressionParserRuleCall_0_0_1_0()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__UnaryExpression__ParametersAssignment_0_0_19661);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionAccess().getParametersPrimaryExpressionParserRuleCall_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__ParametersAssignment_0_0_1"


    // $ANTLR start "rule__UnaryExpression__ParametersAssignment_0_1_1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4774:1: rule__UnaryExpression__ParametersAssignment_0_1_1 : ( rulePrimaryExpression ) ;
    public final void rule__UnaryExpression__ParametersAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4778:1: ( ( rulePrimaryExpression ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4779:1: ( rulePrimaryExpression )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4779:1: ( rulePrimaryExpression )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4780:1: rulePrimaryExpression
            {
             before(grammarAccess.getUnaryExpressionAccess().getParametersPrimaryExpressionParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__UnaryExpression__ParametersAssignment_0_1_19692);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionAccess().getParametersPrimaryExpressionParserRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpression__ParametersAssignment_0_1_1"


    // $ANTLR start "rule__PrimaryExpression__ParametersAssignment_0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4789:1: rule__PrimaryExpression__ParametersAssignment_0 : ( ruleLiteral ) ;
    public final void rule__PrimaryExpression__ParametersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4793:1: ( ( ruleLiteral ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4794:1: ( ruleLiteral )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4794:1: ( ruleLiteral )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4795:1: ruleLiteral
            {
             before(grammarAccess.getPrimaryExpressionAccess().getParametersLiteralParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__PrimaryExpression__ParametersAssignment_09723);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getParametersLiteralParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__ParametersAssignment_0"


    // $ANTLR start "rule__PrimaryExpression__ParametersAssignment_1_1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4804:1: rule__PrimaryExpression__ParametersAssignment_1_1 : ( ruleOrExpression ) ;
    public final void rule__PrimaryExpression__ParametersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4808:1: ( ( ruleOrExpression ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4809:1: ( ruleOrExpression )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4809:1: ( ruleOrExpression )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4810:1: ruleOrExpression
            {
             before(grammarAccess.getPrimaryExpressionAccess().getParametersOrExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleOrExpression_in_rule__PrimaryExpression__ParametersAssignment_1_19754);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getParametersOrExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__ParametersAssignment_1_1"


    // $ANTLR start "rule__FunctionCall__NameAssignment_0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4819:1: rule__FunctionCall__NameAssignment_0 : ( ruleFunctionName ) ;
    public final void rule__FunctionCall__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4823:1: ( ( ruleFunctionName ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4824:1: ( ruleFunctionName )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4824:1: ( ruleFunctionName )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4825:1: ruleFunctionName
            {
             before(grammarAccess.getFunctionCallAccess().getNameFunctionNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleFunctionName_in_rule__FunctionCall__NameAssignment_09785);
            ruleFunctionName();

            state._fsp--;

             after(grammarAccess.getFunctionCallAccess().getNameFunctionNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__NameAssignment_0"


    // $ANTLR start "rule__FunctionCall__ParametersAssignment_2"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4834:1: rule__FunctionCall__ParametersAssignment_2 : ( ruleOrExpression ) ;
    public final void rule__FunctionCall__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4838:1: ( ( ruleOrExpression ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4839:1: ( ruleOrExpression )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4839:1: ( ruleOrExpression )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4840:1: ruleOrExpression
            {
             before(grammarAccess.getFunctionCallAccess().getParametersOrExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleOrExpression_in_rule__FunctionCall__ParametersAssignment_29816);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getFunctionCallAccess().getParametersOrExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__ParametersAssignment_2"


    // $ANTLR start "rule__FunctionCall__ParametersAssignment_3_1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4849:1: rule__FunctionCall__ParametersAssignment_3_1 : ( ruleOrExpression ) ;
    public final void rule__FunctionCall__ParametersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4853:1: ( ( ruleOrExpression ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4854:1: ( ruleOrExpression )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4854:1: ( ruleOrExpression )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4855:1: ruleOrExpression
            {
             before(grammarAccess.getFunctionCallAccess().getParametersOrExpressionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleOrExpression_in_rule__FunctionCall__ParametersAssignment_3_19847);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getFunctionCallAccess().getParametersOrExpressionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionCall__ParametersAssignment_3_1"


    // $ANTLR start "rule__Literal__ValueStringAssignment_1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4864:1: rule__Literal__ValueStringAssignment_1 : ( RULE_LITERALSTRING ) ;
    public final void rule__Literal__ValueStringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4868:1: ( ( RULE_LITERALSTRING ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4869:1: ( RULE_LITERALSTRING )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4869:1: ( RULE_LITERALSTRING )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4870:1: RULE_LITERALSTRING
            {
             before(grammarAccess.getLiteralAccess().getValueStringLITERALSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_LITERALSTRING,FOLLOW_RULE_LITERALSTRING_in_rule__Literal__ValueStringAssignment_19878); 
             after(grammarAccess.getLiteralAccess().getValueStringLITERALSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__ValueStringAssignment_1"


    // $ANTLR start "rule__Literal__OperationsAssignment_2_0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4879:1: rule__Literal__OperationsAssignment_2_0 : ( RULE_FORALL ) ;
    public final void rule__Literal__OperationsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4883:1: ( ( RULE_FORALL ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4884:1: ( RULE_FORALL )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4884:1: ( RULE_FORALL )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4885:1: RULE_FORALL
            {
             before(grammarAccess.getLiteralAccess().getOperationsFORALLTerminalRuleCall_2_0_0()); 
            match(input,RULE_FORALL,FOLLOW_RULE_FORALL_in_rule__Literal__OperationsAssignment_2_09909); 
             after(grammarAccess.getLiteralAccess().getOperationsFORALLTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__OperationsAssignment_2_0"


    // $ANTLR start "rule__Literal__ValueStringAssignment_2_2"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4894:1: rule__Literal__ValueStringAssignment_2_2 : ( RULE_LITERALSTRING ) ;
    public final void rule__Literal__ValueStringAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4898:1: ( ( RULE_LITERALSTRING ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4899:1: ( RULE_LITERALSTRING )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4899:1: ( RULE_LITERALSTRING )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4900:1: RULE_LITERALSTRING
            {
             before(grammarAccess.getLiteralAccess().getValueStringLITERALSTRINGTerminalRuleCall_2_2_0()); 
            match(input,RULE_LITERALSTRING,FOLLOW_RULE_LITERALSTRING_in_rule__Literal__ValueStringAssignment_2_29940); 
             after(grammarAccess.getLiteralAccess().getValueStringLITERALSTRINGTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__ValueStringAssignment_2_2"


    // $ANTLR start "rule__Literal__ParametersAssignment_2_4"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4909:1: rule__Literal__ParametersAssignment_2_4 : ( ruleOrExpression ) ;
    public final void rule__Literal__ParametersAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4913:1: ( ( ruleOrExpression ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4914:1: ( ruleOrExpression )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4914:1: ( ruleOrExpression )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4915:1: ruleOrExpression
            {
             before(grammarAccess.getLiteralAccess().getParametersOrExpressionParserRuleCall_2_4_0()); 
            pushFollow(FOLLOW_ruleOrExpression_in_rule__Literal__ParametersAssignment_2_49971);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getLiteralAccess().getParametersOrExpressionParserRuleCall_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__ParametersAssignment_2_4"


    // $ANTLR start "rule__Literal__ParametersAssignment_3"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4924:1: rule__Literal__ParametersAssignment_3 : ( ruleFunctionCall ) ;
    public final void rule__Literal__ParametersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4928:1: ( ( ruleFunctionCall ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4929:1: ( ruleFunctionCall )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4929:1: ( ruleFunctionCall )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4930:1: ruleFunctionCall
            {
             before(grammarAccess.getLiteralAccess().getParametersFunctionCallParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleFunctionCall_in_rule__Literal__ParametersAssignment_310002);
            ruleFunctionCall();

            state._fsp--;

             after(grammarAccess.getLiteralAccess().getParametersFunctionCallParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__ParametersAssignment_3"


    // $ANTLR start "rule__Literal__ExpressionTypeAssignment_4_0"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4939:1: rule__Literal__ExpressionTypeAssignment_4_0 : ( RULE_CURLYOPEN ) ;
    public final void rule__Literal__ExpressionTypeAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4943:1: ( ( RULE_CURLYOPEN ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4944:1: ( RULE_CURLYOPEN )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4944:1: ( RULE_CURLYOPEN )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4945:1: RULE_CURLYOPEN
            {
             before(grammarAccess.getLiteralAccess().getExpressionTypeCURLYOPENTerminalRuleCall_4_0_0()); 
            match(input,RULE_CURLYOPEN,FOLLOW_RULE_CURLYOPEN_in_rule__Literal__ExpressionTypeAssignment_4_010033); 
             after(grammarAccess.getLiteralAccess().getExpressionTypeCURLYOPENTerminalRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__ExpressionTypeAssignment_4_0"


    // $ANTLR start "rule__Literal__ParametersAssignment_4_1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4954:1: rule__Literal__ParametersAssignment_4_1 : ( ruleOrExpression ) ;
    public final void rule__Literal__ParametersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4958:1: ( ( ruleOrExpression ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4959:1: ( ruleOrExpression )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4959:1: ( ruleOrExpression )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4960:1: ruleOrExpression
            {
             before(grammarAccess.getLiteralAccess().getParametersOrExpressionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleOrExpression_in_rule__Literal__ParametersAssignment_4_110064);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getLiteralAccess().getParametersOrExpressionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__ParametersAssignment_4_1"


    // $ANTLR start "rule__Literal__ParametersAssignment_4_2_1"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4969:1: rule__Literal__ParametersAssignment_4_2_1 : ( ruleOrExpression ) ;
    public final void rule__Literal__ParametersAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4973:1: ( ( ruleOrExpression ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4974:1: ( ruleOrExpression )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4974:1: ( ruleOrExpression )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4975:1: ruleOrExpression
            {
             before(grammarAccess.getLiteralAccess().getParametersOrExpressionParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_ruleOrExpression_in_rule__Literal__ParametersAssignment_4_2_110095);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getLiteralAccess().getParametersOrExpressionParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__ParametersAssignment_4_2_1"


    // $ANTLR start "rule__Literal__ElementsAssignment_5"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4984:1: rule__Literal__ElementsAssignment_5 : ( RULE_NULL ) ;
    public final void rule__Literal__ElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4988:1: ( ( RULE_NULL ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4989:1: ( RULE_NULL )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4989:1: ( RULE_NULL )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4990:1: RULE_NULL
            {
             before(grammarAccess.getLiteralAccess().getElementsNULLTerminalRuleCall_5_0()); 
            match(input,RULE_NULL,FOLLOW_RULE_NULL_in_rule__Literal__ElementsAssignment_510126); 
             after(grammarAccess.getLiteralAccess().getElementsNULLTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__ElementsAssignment_5"


    // $ANTLR start "rule__Literal__ElementsAssignment_6"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:4999:1: rule__Literal__ElementsAssignment_6 : ( RULE_TODAY ) ;
    public final void rule__Literal__ElementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:5003:1: ( ( RULE_TODAY ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:5004:1: ( RULE_TODAY )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:5004:1: ( RULE_TODAY )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:5005:1: RULE_TODAY
            {
             before(grammarAccess.getLiteralAccess().getElementsTODAYTerminalRuleCall_6_0()); 
            match(input,RULE_TODAY,FOLLOW_RULE_TODAY_in_rule__Literal__ElementsAssignment_610157); 
             after(grammarAccess.getLiteralAccess().getElementsTODAYTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__ElementsAssignment_6"


    // $ANTLR start "rule__Literal__ElementsAssignment_7"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:5014:1: rule__Literal__ElementsAssignment_7 : ( RULE_TRUE ) ;
    public final void rule__Literal__ElementsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:5018:1: ( ( RULE_TRUE ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:5019:1: ( RULE_TRUE )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:5019:1: ( RULE_TRUE )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:5020:1: RULE_TRUE
            {
             before(grammarAccess.getLiteralAccess().getElementsTRUETerminalRuleCall_7_0()); 
            match(input,RULE_TRUE,FOLLOW_RULE_TRUE_in_rule__Literal__ElementsAssignment_710188); 
             after(grammarAccess.getLiteralAccess().getElementsTRUETerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__ElementsAssignment_7"


    // $ANTLR start "rule__Literal__ElementsAssignment_8"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:5029:1: rule__Literal__ElementsAssignment_8 : ( RULE_FALSE ) ;
    public final void rule__Literal__ElementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:5033:1: ( ( RULE_FALSE ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:5034:1: ( RULE_FALSE )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:5034:1: ( RULE_FALSE )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:5035:1: RULE_FALSE
            {
             before(grammarAccess.getLiteralAccess().getElementsFALSETerminalRuleCall_8_0()); 
            match(input,RULE_FALSE,FOLLOW_RULE_FALSE_in_rule__Literal__ElementsAssignment_810219); 
             after(grammarAccess.getLiteralAccess().getElementsFALSETerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__ElementsAssignment_8"


    // $ANTLR start "rule__Literal__ParametersAssignment_9"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:5044:1: rule__Literal__ParametersAssignment_9 : ( ruleTmlExpression ) ;
    public final void rule__Literal__ParametersAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:5048:1: ( ( ruleTmlExpression ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:5049:1: ( ruleTmlExpression )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:5049:1: ( ruleTmlExpression )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:5050:1: ruleTmlExpression
            {
             before(grammarAccess.getLiteralAccess().getParametersTmlExpressionParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleTmlExpression_in_rule__Literal__ParametersAssignment_910250);
            ruleTmlExpression();

            state._fsp--;

             after(grammarAccess.getLiteralAccess().getParametersTmlExpressionParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__ParametersAssignment_9"


    // $ANTLR start "rule__Literal__ParametersAssignment_10"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:5059:1: rule__Literal__ParametersAssignment_10 : ( ruleExistsTmlExpression ) ;
    public final void rule__Literal__ParametersAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:5063:1: ( ( ruleExistsTmlExpression ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:5064:1: ( ruleExistsTmlExpression )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:5064:1: ( ruleExistsTmlExpression )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:5065:1: ruleExistsTmlExpression
            {
             before(grammarAccess.getLiteralAccess().getParametersExistsTmlExpressionParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleExistsTmlExpression_in_rule__Literal__ParametersAssignment_1010281);
            ruleExistsTmlExpression();

            state._fsp--;

             after(grammarAccess.getLiteralAccess().getParametersExistsTmlExpressionParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__ParametersAssignment_10"


    // $ANTLR start "rule__Literal__ParametersAssignment_11"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:5074:1: rule__Literal__ParametersAssignment_11 : ( ruleMapGetReference ) ;
    public final void rule__Literal__ParametersAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:5078:1: ( ( ruleMapGetReference ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:5079:1: ( ruleMapGetReference )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:5079:1: ( ruleMapGetReference )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:5080:1: ruleMapGetReference
            {
             before(grammarAccess.getLiteralAccess().getParametersMapGetReferenceParserRuleCall_11_0()); 
            pushFollow(FOLLOW_ruleMapGetReference_in_rule__Literal__ParametersAssignment_1110312);
            ruleMapGetReference();

            state._fsp--;

             after(grammarAccess.getLiteralAccess().getParametersMapGetReferenceParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__ParametersAssignment_11"


    // $ANTLR start "rule__Literal__ParametersAssignment_12"
    // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:5089:1: rule__Literal__ParametersAssignment_12 : ( ruleDateLiteral ) ;
    public final void rule__Literal__ParametersAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:5093:1: ( ( ruleDateLiteral ) )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:5094:1: ( ruleDateLiteral )
            {
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:5094:1: ( ruleDateLiteral )
            // ../com.dexels.navajo.dsl.expression.ui/src-gen/com/dexels/navajo/dsl/expression/ui/contentassist/antlr/internal/InternalNavajoExpression.g:5095:1: ruleDateLiteral
            {
             before(grammarAccess.getLiteralAccess().getParametersDateLiteralParserRuleCall_12_0()); 
            pushFollow(FOLLOW_ruleDateLiteral_in_rule__Literal__ParametersAssignment_1210343);
            ruleDateLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralAccess().getParametersDateLiteralParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__ParametersAssignment_12"

    // Delegated rules


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA9_eotS =
        "\17\uffff";
    static final String DFA9_eofS =
        "\1\uffff\1\15\15\uffff";
    static final String DFA9_minS =
        "\1\4\1\7\15\uffff";
    static final String DFA9_maxS =
        "\1\45\1\36\15\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\1\1"+
        "\15";
    static final String DFA9_specialS =
        "\17\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\4\3\uffff\1\12\1\uffff\1\13\6\uffff\1\1\3\uffff\1\14\11\uffff"+
            "\1\2\1\3\1\5\1\6\1\7\1\10\1\11",
            "\1\15\4\uffff\4\15\2\uffff\1\16\1\15\2\uffff\11\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "767:1: rule__Literal__Alternatives : ( ( ( rule__Literal__Group_0__0 ) ) | ( ( rule__Literal__ValueStringAssignment_1 ) ) | ( ( rule__Literal__Group_2__0 ) ) | ( ( rule__Literal__ParametersAssignment_3 ) ) | ( ( rule__Literal__Group_4__0 ) ) | ( ( rule__Literal__ElementsAssignment_5 ) ) | ( ( rule__Literal__ElementsAssignment_6 ) ) | ( ( rule__Literal__ElementsAssignment_7 ) ) | ( ( rule__Literal__ElementsAssignment_8 ) ) | ( ( rule__Literal__ParametersAssignment_9 ) ) | ( ( rule__Literal__ParametersAssignment_10 ) ) | ( ( rule__Literal__ParametersAssignment_11 ) ) | ( ( rule__Literal__ParametersAssignment_12 ) ) );";
        }
    }
    static final String DFA10_eotS =
        "\7\uffff";
    static final String DFA10_eofS =
        "\7\uffff";
    static final String DFA10_minS =
        "\2\4\2\uffff\3\4";
    static final String DFA10_maxS =
        "\2\24\2\uffff\3\11";
    static final String DFA10_acceptS =
        "\2\uffff\1\2\1\1\3\uffff";
    static final String DFA10_specialS =
        "\7\uffff}>";
    static final String[] DFA10_transitionS = {
            "\3\2\1\1\14\uffff\1\2",
            "\3\3\1\4\1\uffff\1\2\12\uffff\1\3",
            "",
            "",
            "\3\2\1\5\1\uffff\1\3",
            "\3\3\1\6\1\uffff\1\2",
            "\3\2\1\5\1\uffff\1\3"
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "905:1: ( rule__TmlExpression__AbsoluteAssignment_1 )?";
        }
    }
    static final String DFA13_eotS =
        "\7\uffff";
    static final String DFA13_eofS =
        "\7\uffff";
    static final String DFA13_minS =
        "\2\4\1\uffff\1\4\1\uffff\2\4";
    static final String DFA13_maxS =
        "\2\24\1\uffff\1\11\1\uffff\2\11";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\2\uffff";
    static final String DFA13_specialS =
        "\7\uffff}>";
    static final String[] DFA13_transitionS = {
            "\3\2\1\1\14\uffff\1\2",
            "\3\4\1\3\1\uffff\1\2\12\uffff\1\4",
            "",
            "\3\2\1\5\1\uffff\1\4",
            "",
            "\3\4\1\6\1\uffff\1\2",
            "\3\2\1\5\1\uffff\1\4"
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1180:1: ( rule__ExistsTmlExpression__AbsoluteAssignment_2 )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleTopLevel_in_entryRuleTopLevel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopLevel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopLevel__ToplevelExpressionAssignment_in_ruleTopLevel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathElement_in_entryRulePathElement123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathElement130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathElement__Alternatives_in_rulePathElement156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTmlExpression_in_entryRuleTmlExpression183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTmlExpression190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TmlExpression__Group__0_in_ruleTmlExpression216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExistsTmlExpression_in_entryRuleExistsTmlExpression243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExistsTmlExpression250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExistsTmlExpression__Group__0_in_ruleExistsTmlExpression276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapReferenceParams_in_entryRuleMapReferenceParams303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapReferenceParams310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapReferenceParams__Group__0_in_ruleMapReferenceParams336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapGetReference_in_entryRuleMapGetReference363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapGetReference370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapGetReference__Group__0_in_ruleMapGetReference396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualityExpression550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group__0_in_ruleEqualityExpression576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpression610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group__0_in_ruleRelationalExpression636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__Group__0_in_ruleAdditiveExpression696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpression730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group__0_in_ruleMultiplicativeExpression756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Alternatives_in_ruleUnaryExpression816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionName_in_entryRuleFunctionName903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionName910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionName936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__0_in_ruleFunctionCall995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateLiteral_in_entryRuleDateLiteral1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateLiteral1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateLiteral__Group__0_in_ruleDateLiteral1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PathElement__Alternatives1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_rule__PathElement__Alternatives1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARENT_in_rule__PathElement__Alternatives1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TML_SEPARATOR_in_rule__PathElement__Alternatives1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group_1_0__0_in_rule__EqualityExpression__Alternatives_11235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group_1_1__0_in_rule__EqualityExpression__Alternatives_11253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group_2_0__0_in_rule__RelationalExpression__Alternatives_21286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group_2_1__0_in_rule__RelationalExpression__Alternatives_21304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group_2_2__0_in_rule__RelationalExpression__Alternatives_21322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group_2_3__0_in_rule__RelationalExpression__Alternatives_21340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__Group_1_0__0_in_rule__AdditiveExpression__Alternatives_11373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__Group_1_1__0_in_rule__AdditiveExpression__Alternatives_11391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group_1_0__0_in_rule__MultiplicativeExpression__Alternatives_11424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group_1_1__0_in_rule__MultiplicativeExpression__Alternatives_11442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Alternatives_0_in_rule__UnaryExpression__Alternatives1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__UnaryExpression__Alternatives1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_0_0__0_in_rule__UnaryExpression__Alternatives_01525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_0_1__0_in_rule__UnaryExpression__Alternatives_01543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__ParametersAssignment_0_in_rule__PrimaryExpression__Alternatives1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__0_in_rule__PrimaryExpression__Alternatives1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__0_in_rule__Literal__Alternatives1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__ValueStringAssignment_1_in_rule__Literal__Alternatives1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__0_in_rule__Literal__Alternatives1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__ParametersAssignment_3_in_rule__Literal__Alternatives1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__0_in_rule__Literal__Alternatives1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__ElementsAssignment_5_in_rule__Literal__Alternatives1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__ElementsAssignment_6_in_rule__Literal__Alternatives1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__ElementsAssignment_7_in_rule__Literal__Alternatives1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__ElementsAssignment_8_in_rule__Literal__Alternatives1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__ParametersAssignment_9_in_rule__Literal__Alternatives1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__ParametersAssignment_10_in_rule__Literal__Alternatives1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__ParametersAssignment_11_in_rule__Literal__Alternatives1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__ParametersAssignment_12_in_rule__Literal__Alternatives1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TmlExpression__Group__0__Impl_in_rule__TmlExpression__Group__01874 = new BitSet(new long[]{0x00000000001000F0L});
    public static final BitSet FOLLOW_rule__TmlExpression__Group__1_in_rule__TmlExpression__Group__01877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SQBRACKET_OPEN_in_rule__TmlExpression__Group__0__Impl1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TmlExpression__Group__1__Impl_in_rule__TmlExpression__Group__11933 = new BitSet(new long[]{0x00000000001000F0L});
    public static final BitSet FOLLOW_rule__TmlExpression__Group__2_in_rule__TmlExpression__Group__11936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TmlExpression__AbsoluteAssignment_1_in_rule__TmlExpression__Group__1__Impl1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TmlExpression__Group__2__Impl_in_rule__TmlExpression__Group__21994 = new BitSet(new long[]{0x00000000001000F0L});
    public static final BitSet FOLLOW_rule__TmlExpression__Group__3_in_rule__TmlExpression__Group__21997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TmlExpression__ParamAssignment_2_in_rule__TmlExpression__Group__2__Impl2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TmlExpression__Group__3__Impl_in_rule__TmlExpression__Group__32055 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_rule__TmlExpression__Group__4_in_rule__TmlExpression__Group__32058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TmlExpression__ElementsAssignment_3_in_rule__TmlExpression__Group__3__Impl2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TmlExpression__Group__4__Impl_in_rule__TmlExpression__Group__42115 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_rule__TmlExpression__Group__5_in_rule__TmlExpression__Group__42118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TmlExpression__Group_4__0_in_rule__TmlExpression__Group__4__Impl2145 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__TmlExpression__Group__5__Impl_in_rule__TmlExpression__Group__52176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SQBRACKET_CLOSE_in_rule__TmlExpression__Group__5__Impl2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TmlExpression__Group_4__0__Impl_in_rule__TmlExpression__Group_4__02244 = new BitSet(new long[]{0x00000000001000F0L});
    public static final BitSet FOLLOW_rule__TmlExpression__Group_4__1_in_rule__TmlExpression__Group_4__02247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TML_SEPARATOR_in_rule__TmlExpression__Group_4__0__Impl2274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TmlExpression__Group_4__1__Impl_in_rule__TmlExpression__Group_4__12303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TmlExpression__ElementsAssignment_4_1_in_rule__TmlExpression__Group_4__1__Impl2330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExistsTmlExpression__Group__0__Impl_in_rule__ExistsTmlExpression__Group__02364 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__ExistsTmlExpression__Group__1_in_rule__ExistsTmlExpression__Group__02367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TML_EXISTS_in_rule__ExistsTmlExpression__Group__0__Impl2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExistsTmlExpression__Group__1__Impl_in_rule__ExistsTmlExpression__Group__12423 = new BitSet(new long[]{0x00000000001000F0L});
    public static final BitSet FOLLOW_rule__ExistsTmlExpression__Group__2_in_rule__ExistsTmlExpression__Group__12426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SQBRACKET_OPEN_in_rule__ExistsTmlExpression__Group__1__Impl2453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExistsTmlExpression__Group__2__Impl_in_rule__ExistsTmlExpression__Group__22482 = new BitSet(new long[]{0x00000000001000F0L});
    public static final BitSet FOLLOW_rule__ExistsTmlExpression__Group__3_in_rule__ExistsTmlExpression__Group__22485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExistsTmlExpression__AbsoluteAssignment_2_in_rule__ExistsTmlExpression__Group__2__Impl2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExistsTmlExpression__Group__3__Impl_in_rule__ExistsTmlExpression__Group__32543 = new BitSet(new long[]{0x00000000001000F0L});
    public static final BitSet FOLLOW_rule__ExistsTmlExpression__Group__4_in_rule__ExistsTmlExpression__Group__32546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExistsTmlExpression__ParamAssignment_3_in_rule__ExistsTmlExpression__Group__3__Impl2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExistsTmlExpression__Group__4__Impl_in_rule__ExistsTmlExpression__Group__42604 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_rule__ExistsTmlExpression__Group__5_in_rule__ExistsTmlExpression__Group__42607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExistsTmlExpression__ElementsAssignment_4_in_rule__ExistsTmlExpression__Group__4__Impl2634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExistsTmlExpression__Group__5__Impl_in_rule__ExistsTmlExpression__Group__52664 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_rule__ExistsTmlExpression__Group__6_in_rule__ExistsTmlExpression__Group__52667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExistsTmlExpression__Group_5__0_in_rule__ExistsTmlExpression__Group__5__Impl2694 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__ExistsTmlExpression__Group__6__Impl_in_rule__ExistsTmlExpression__Group__62725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SQBRACKET_CLOSE_in_rule__ExistsTmlExpression__Group__6__Impl2752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExistsTmlExpression__Group_5__0__Impl_in_rule__ExistsTmlExpression__Group_5__02795 = new BitSet(new long[]{0x00000000001000F0L});
    public static final BitSet FOLLOW_rule__ExistsTmlExpression__Group_5__1_in_rule__ExistsTmlExpression__Group_5__02798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TML_SEPARATOR_in_rule__ExistsTmlExpression__Group_5__0__Impl2825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExistsTmlExpression__Group_5__1__Impl_in_rule__ExistsTmlExpression__Group_5__12854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExistsTmlExpression__ElementsAssignment_5_1_in_rule__ExistsTmlExpression__Group_5__1__Impl2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapReferenceParams__Group__0__Impl_in_rule__MapReferenceParams__Group__02915 = new BitSet(new long[]{0x0000003F80220510L});
    public static final BitSet FOLLOW_rule__MapReferenceParams__Group__1_in_rule__MapReferenceParams__Group__02918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACKET_OPEN_in_rule__MapReferenceParams__Group__0__Impl2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapReferenceParams__Group__1__Impl_in_rule__MapReferenceParams__Group__12974 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__MapReferenceParams__Group__2_in_rule__MapReferenceParams__Group__12977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapReferenceParams__GetterParamsAssignment_1_in_rule__MapReferenceParams__Group__1__Impl3004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapReferenceParams__Group__2__Impl_in_rule__MapReferenceParams__Group__23034 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__MapReferenceParams__Group__3_in_rule__MapReferenceParams__Group__23037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapReferenceParams__Group_2__0_in_rule__MapReferenceParams__Group__2__Impl3064 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__MapReferenceParams__Group__3__Impl_in_rule__MapReferenceParams__Group__33095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACKET_CLOSE_in_rule__MapReferenceParams__Group__3__Impl3122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapReferenceParams__Group_2__0__Impl_in_rule__MapReferenceParams__Group_2__03159 = new BitSet(new long[]{0x0000003F80220510L});
    public static final BitSet FOLLOW_rule__MapReferenceParams__Group_2__1_in_rule__MapReferenceParams__Group_2__03162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__MapReferenceParams__Group_2__0__Impl3189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapReferenceParams__Group_2__1__Impl_in_rule__MapReferenceParams__Group_2__13218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapReferenceParams__GetterParamsAssignment_2_1_in_rule__MapReferenceParams__Group_2__1__Impl3245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapGetReference__Group__0__Impl_in_rule__MapGetReference__Group__03279 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__MapGetReference__Group__1_in_rule__MapGetReference__Group__03282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapGetReference__OperationsAssignment_0_in_rule__MapGetReference__Group__0__Impl3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapGetReference__Group__1__Impl_in_rule__MapGetReference__Group__13339 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__MapGetReference__Group__2_in_rule__MapGetReference__Group__13342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapGetReference__Group_1__0_in_rule__MapGetReference__Group__1__Impl3369 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__MapGetReference__Group__2__Impl_in_rule__MapGetReference__Group__23400 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__MapGetReference__Group__3_in_rule__MapGetReference__Group__23403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapGetReference__ElementsAssignment_2_in_rule__MapGetReference__Group__2__Impl3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapGetReference__Group__3__Impl_in_rule__MapGetReference__Group__33460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapGetReference__ReferenceParamsAssignment_3_in_rule__MapGetReference__Group__3__Impl3487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapGetReference__Group_1__0__Impl_in_rule__MapGetReference__Group_1__03526 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__MapGetReference__Group_1__1_in_rule__MapGetReference__Group_1__03529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapGetReference__ElementsAssignment_1_0_in_rule__MapGetReference__Group_1__0__Impl3556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MapGetReference__Group_1__1__Impl_in_rule__MapGetReference__Group_1__13586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TML_SEPARATOR_in_rule__MapGetReference__Group_1__1__Impl3613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__0__Impl_in_rule__OrExpression__Group__03646 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__1_in_rule__OrExpression__Group__03649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__ParametersAssignment_0_in_rule__OrExpression__Group__0__Impl3676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group__1__Impl_in_rule__OrExpression__Group__13706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__0_in_rule__OrExpression__Group__1__Impl3733 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__0__Impl_in_rule__OrExpression__Group_1__03768 = new BitSet(new long[]{0x0000003F80238D10L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__1_in_rule__OrExpression__Group_1__03771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__OperationsAssignment_1_0_in_rule__OrExpression__Group_1__0__Impl3798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__Group_1__1__Impl_in_rule__OrExpression__Group_1__13828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExpression__ParametersAssignment_1_1_in_rule__OrExpression__Group_1__1__Impl3855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__0__Impl_in_rule__AndExpression__Group__03889 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__1_in_rule__AndExpression__Group__03892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__ParametersAssignment_0_in_rule__AndExpression__Group__0__Impl3919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group__1__Impl_in_rule__AndExpression__Group__13949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__0_in_rule__AndExpression__Group__1__Impl3976 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__0__Impl_in_rule__AndExpression__Group_1__04011 = new BitSet(new long[]{0x0000003F80238D10L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__1_in_rule__AndExpression__Group_1__04014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__OperationsAssignment_1_0_in_rule__AndExpression__Group_1__0__Impl4041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__Group_1__1__Impl_in_rule__AndExpression__Group_1__14071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpression__ParametersAssignment_1_1_in_rule__AndExpression__Group_1__1__Impl4098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group__0__Impl_in_rule__EqualityExpression__Group__04132 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group__1_in_rule__EqualityExpression__Group__04135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__ParametersAssignment_0_in_rule__EqualityExpression__Group__0__Impl4162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group__1__Impl_in_rule__EqualityExpression__Group__14192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Alternatives_1_in_rule__EqualityExpression__Group__1__Impl4219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group_1_0__0__Impl_in_rule__EqualityExpression__Group_1_0__04254 = new BitSet(new long[]{0x0000003F80238D10L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group_1_0__1_in_rule__EqualityExpression__Group_1_0__04257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__OperationsAssignment_1_0_0_in_rule__EqualityExpression__Group_1_0__0__Impl4284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group_1_0__1__Impl_in_rule__EqualityExpression__Group_1_0__14314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__ParametersAssignment_1_0_1_in_rule__EqualityExpression__Group_1_0__1__Impl4341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group_1_1__0__Impl_in_rule__EqualityExpression__Group_1_1__04375 = new BitSet(new long[]{0x0000003F80238D10L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group_1_1__1_in_rule__EqualityExpression__Group_1_1__04378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__OperationsAssignment_1_1_0_in_rule__EqualityExpression__Group_1_1__0__Impl4405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__Group_1_1__1__Impl_in_rule__EqualityExpression__Group_1_1__14435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqualityExpression__ParametersAssignment_1_1_1_in_rule__EqualityExpression__Group_1_1__1__Impl4462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group__0__Impl_in_rule__RelationalExpression__Group__04496 = new BitSet(new long[]{0x0000003F80238D10L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group__1_in_rule__RelationalExpression__Group__04499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group__1__Impl_in_rule__RelationalExpression__Group__14557 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group__2_in_rule__RelationalExpression__Group__14560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__ParametersAssignment_1_in_rule__RelationalExpression__Group__1__Impl4587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group__2__Impl_in_rule__RelationalExpression__Group__24617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Alternatives_2_in_rule__RelationalExpression__Group__2__Impl4644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group_2_0__0__Impl_in_rule__RelationalExpression__Group_2_0__04681 = new BitSet(new long[]{0x0000003F80238D10L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group_2_0__1_in_rule__RelationalExpression__Group_2_0__04684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__OperationsAssignment_2_0_0_in_rule__RelationalExpression__Group_2_0__0__Impl4711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group_2_0__1__Impl_in_rule__RelationalExpression__Group_2_0__14741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__ParametersAssignment_2_0_1_in_rule__RelationalExpression__Group_2_0__1__Impl4768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group_2_1__0__Impl_in_rule__RelationalExpression__Group_2_1__04802 = new BitSet(new long[]{0x0000003F80238D10L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group_2_1__1_in_rule__RelationalExpression__Group_2_1__04805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__OperationsAssignment_2_1_0_in_rule__RelationalExpression__Group_2_1__0__Impl4832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group_2_1__1__Impl_in_rule__RelationalExpression__Group_2_1__14862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__ParametersAssignment_2_1_1_in_rule__RelationalExpression__Group_2_1__1__Impl4889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group_2_2__0__Impl_in_rule__RelationalExpression__Group_2_2__04923 = new BitSet(new long[]{0x0000003F80238D10L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group_2_2__1_in_rule__RelationalExpression__Group_2_2__04926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__OperationsAssignment_2_2_0_in_rule__RelationalExpression__Group_2_2__0__Impl4953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group_2_2__1__Impl_in_rule__RelationalExpression__Group_2_2__14983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__ParametersAssignment_2_2_1_in_rule__RelationalExpression__Group_2_2__1__Impl5010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group_2_3__0__Impl_in_rule__RelationalExpression__Group_2_3__05044 = new BitSet(new long[]{0x0000003F80238D10L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group_2_3__1_in_rule__RelationalExpression__Group_2_3__05047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__OperationsAssignment_2_3_0_in_rule__RelationalExpression__Group_2_3__0__Impl5074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__Group_2_3__1__Impl_in_rule__RelationalExpression__Group_2_3__15104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationalExpression__ParametersAssignment_2_3_1_in_rule__RelationalExpression__Group_2_3__1__Impl5131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__Group__0__Impl_in_rule__AdditiveExpression__Group__05165 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__Group__1_in_rule__AdditiveExpression__Group__05168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__ParametersAssignment_0_in_rule__AdditiveExpression__Group__0__Impl5195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__Group__1__Impl_in_rule__AdditiveExpression__Group__15225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__Alternatives_1_in_rule__AdditiveExpression__Group__1__Impl5252 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__Group_1_0__0__Impl_in_rule__AdditiveExpression__Group_1_0__05287 = new BitSet(new long[]{0x0000003F80238D10L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__Group_1_0__1_in_rule__AdditiveExpression__Group_1_0__05290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_rule__AdditiveExpression__Group_1_0__0__Impl5317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__Group_1_0__1__Impl_in_rule__AdditiveExpression__Group_1_0__15346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__ParametersAssignment_1_0_1_in_rule__AdditiveExpression__Group_1_0__1__Impl5373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__Group_1_1__0__Impl_in_rule__AdditiveExpression__Group_1_1__05407 = new BitSet(new long[]{0x0000003F80238D10L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__Group_1_1__1_in_rule__AdditiveExpression__Group_1_1__05410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MINUS_in_rule__AdditiveExpression__Group_1_1__0__Impl5437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__Group_1_1__1__Impl_in_rule__AdditiveExpression__Group_1_1__15466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AdditiveExpression__ParametersAssignment_1_1_1_in_rule__AdditiveExpression__Group_1_1__1__Impl5493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group__0__Impl_in_rule__MultiplicativeExpression__Group__05527 = new BitSet(new long[]{0x0000000040000080L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group__1_in_rule__MultiplicativeExpression__Group__05530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__ParametersAssignment_0_in_rule__MultiplicativeExpression__Group__0__Impl5557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group__1__Impl_in_rule__MultiplicativeExpression__Group__15587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Alternatives_1_in_rule__MultiplicativeExpression__Group__1__Impl5614 = new BitSet(new long[]{0x0000000040000082L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group_1_0__0__Impl_in_rule__MultiplicativeExpression__Group_1_0__05649 = new BitSet(new long[]{0x0000003F80238D10L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group_1_0__1_in_rule__MultiplicativeExpression__Group_1_0__05652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__OperationsAssignment_1_0_0_in_rule__MultiplicativeExpression__Group_1_0__0__Impl5679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group_1_0__1__Impl_in_rule__MultiplicativeExpression__Group_1_0__15709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__ParametersAssignment_1_0_1_in_rule__MultiplicativeExpression__Group_1_0__1__Impl5736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group_1_1__0__Impl_in_rule__MultiplicativeExpression__Group_1_1__05770 = new BitSet(new long[]{0x0000003F80238D10L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group_1_1__1_in_rule__MultiplicativeExpression__Group_1_1__05773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__OperationsAssignment_1_1_0_in_rule__MultiplicativeExpression__Group_1_1__0__Impl5800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__Group_1_1__1__Impl_in_rule__MultiplicativeExpression__Group_1_1__15830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiplicativeExpression__ParametersAssignment_1_1_1_in_rule__MultiplicativeExpression__Group_1_1__1__Impl5857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_0_0__0__Impl_in_rule__UnaryExpression__Group_0_0__05891 = new BitSet(new long[]{0x0000003F80238D10L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_0_0__1_in_rule__UnaryExpression__Group_0_0__05894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_in_rule__UnaryExpression__Group_0_0__0__Impl5921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_0_0__1__Impl_in_rule__UnaryExpression__Group_0_0__15950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__ParametersAssignment_0_0_1_in_rule__UnaryExpression__Group_0_0__1__Impl5977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_0_1__0__Impl_in_rule__UnaryExpression__Group_0_1__06011 = new BitSet(new long[]{0x0000003F80238D10L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_0_1__1_in_rule__UnaryExpression__Group_0_1__06014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MINUS_in_rule__UnaryExpression__Group_0_1__0__Impl6041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__Group_0_1__1__Impl_in_rule__UnaryExpression__Group_0_1__16070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpression__ParametersAssignment_0_1_1_in_rule__UnaryExpression__Group_0_1__1__Impl6097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__0__Impl_in_rule__PrimaryExpression__Group_1__06131 = new BitSet(new long[]{0x0000003F80238D10L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__1_in_rule__PrimaryExpression__Group_1__06134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACKET_OPEN_in_rule__PrimaryExpression__Group_1__0__Impl6161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__1__Impl_in_rule__PrimaryExpression__Group_1__16190 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__2_in_rule__PrimaryExpression__Group_1__16193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__ParametersAssignment_1_1_in_rule__PrimaryExpression__Group_1__1__Impl6220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_1__2__Impl_in_rule__PrimaryExpression__Group_1__26250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACKET_CLOSE_in_rule__PrimaryExpression__Group_1__2__Impl6277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__0__Impl_in_rule__FunctionCall__Group__06312 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__1_in_rule__FunctionCall__Group__06315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__NameAssignment_0_in_rule__FunctionCall__Group__0__Impl6342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__1__Impl_in_rule__FunctionCall__Group__16372 = new BitSet(new long[]{0x0000003F8023BD10L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__2_in_rule__FunctionCall__Group__16375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACKET_OPEN_in_rule__FunctionCall__Group__1__Impl6402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__2__Impl_in_rule__FunctionCall__Group__26431 = new BitSet(new long[]{0x0000003F8023BD10L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__3_in_rule__FunctionCall__Group__26434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__ParametersAssignment_2_in_rule__FunctionCall__Group__2__Impl6461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__3__Impl_in_rule__FunctionCall__Group__36492 = new BitSet(new long[]{0x0000003F8023BD10L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__4_in_rule__FunctionCall__Group__36495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_3__0_in_rule__FunctionCall__Group__3__Impl6522 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__4__Impl_in_rule__FunctionCall__Group__46553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACKET_CLOSE_in_rule__FunctionCall__Group__4__Impl6580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_3__0__Impl_in_rule__FunctionCall__Group_3__06619 = new BitSet(new long[]{0x0000003F80238D10L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_3__1_in_rule__FunctionCall__Group_3__06622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__FunctionCall__Group_3__0__Impl6649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_3__1__Impl_in_rule__FunctionCall__Group_3__16678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__ParametersAssignment_3_1_in_rule__FunctionCall__Group_3__1__Impl6705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateLiteral__Group__0__Impl_in_rule__DateLiteral__Group__06739 = new BitSet(new long[]{0x0000003F80220510L});
    public static final BitSet FOLLOW_rule__DateLiteral__Group__1_in_rule__DateLiteral__Group__06742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateLiteral__Group__1__Impl_in_rule__DateLiteral__Group__16800 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__DateLiteral__Group__2_in_rule__DateLiteral__Group__16803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__DateLiteral__Group__1__Impl6830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateLiteral__Group__2__Impl_in_rule__DateLiteral__Group__26859 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__DateLiteral__Group__3_in_rule__DateLiteral__Group__26862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASH_in_rule__DateLiteral__Group__2__Impl6889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateLiteral__Group__3__Impl_in_rule__DateLiteral__Group__36918 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__DateLiteral__Group__4_in_rule__DateLiteral__Group__36921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__DateLiteral__Group__3__Impl6948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateLiteral__Group__4__Impl_in_rule__DateLiteral__Group__46977 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__DateLiteral__Group__5_in_rule__DateLiteral__Group__46980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASH_in_rule__DateLiteral__Group__4__Impl7007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateLiteral__Group__5__Impl_in_rule__DateLiteral__Group__57036 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__DateLiteral__Group__6_in_rule__DateLiteral__Group__57039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__DateLiteral__Group__5__Impl7066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateLiteral__Group__6__Impl_in_rule__DateLiteral__Group__67095 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__DateLiteral__Group__7_in_rule__DateLiteral__Group__67098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASH_in_rule__DateLiteral__Group__6__Impl7125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateLiteral__Group__7__Impl_in_rule__DateLiteral__Group__77154 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__DateLiteral__Group__8_in_rule__DateLiteral__Group__77157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__DateLiteral__Group__7__Impl7184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateLiteral__Group__8__Impl_in_rule__DateLiteral__Group__87213 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__DateLiteral__Group__9_in_rule__DateLiteral__Group__87216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASH_in_rule__DateLiteral__Group__8__Impl7243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateLiteral__Group__9__Impl_in_rule__DateLiteral__Group__97272 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__DateLiteral__Group__10_in_rule__DateLiteral__Group__97275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__DateLiteral__Group__9__Impl7302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateLiteral__Group__10__Impl_in_rule__DateLiteral__Group__107331 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__DateLiteral__Group__11_in_rule__DateLiteral__Group__107334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HASH_in_rule__DateLiteral__Group__10__Impl7361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateLiteral__Group__11__Impl_in_rule__DateLiteral__Group__117390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__DateLiteral__Group__11__Impl7417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__0__Impl_in_rule__Literal__Group_0__07470 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__1_in_rule__Literal__Group_0__07473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_0__1__Impl_in_rule__Literal__Group_0__17531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_rule__Literal__Group_0__1__Impl7558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__0__Impl_in_rule__Literal__Group_2__07591 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__1_in_rule__Literal__Group_2__07594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__OperationsAssignment_2_0_in_rule__Literal__Group_2__0__Impl7621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__1__Impl_in_rule__Literal__Group_2__17651 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__2_in_rule__Literal__Group_2__17654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACKET_OPEN_in_rule__Literal__Group_2__1__Impl7681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__2__Impl_in_rule__Literal__Group_2__27710 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__3_in_rule__Literal__Group_2__27713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__ValueStringAssignment_2_2_in_rule__Literal__Group_2__2__Impl7740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__3__Impl_in_rule__Literal__Group_2__37770 = new BitSet(new long[]{0x0000003F80238D10L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__4_in_rule__Literal__Group_2__37773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__Literal__Group_2__3__Impl7800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__4__Impl_in_rule__Literal__Group_2__47829 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__5_in_rule__Literal__Group_2__47832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__ParametersAssignment_2_4_in_rule__Literal__Group_2__4__Impl7859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_2__5__Impl_in_rule__Literal__Group_2__57889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACKET_CLOSE_in_rule__Literal__Group_2__5__Impl7916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__0__Impl_in_rule__Literal__Group_4__07957 = new BitSet(new long[]{0x0000003F802BAD10L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__1_in_rule__Literal__Group_4__07960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__ExpressionTypeAssignment_4_0_in_rule__Literal__Group_4__0__Impl7987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__1__Impl_in_rule__Literal__Group_4__18017 = new BitSet(new long[]{0x0000003F802BAD10L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__2_in_rule__Literal__Group_4__18020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__ParametersAssignment_4_1_in_rule__Literal__Group_4__1__Impl8047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__2__Impl_in_rule__Literal__Group_4__28078 = new BitSet(new long[]{0x0000003F802BAD10L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__3_in_rule__Literal__Group_4__28081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4_2__0_in_rule__Literal__Group_4__2__Impl8108 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__3__Impl_in_rule__Literal__Group_4__38139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CURLYCLOSE_in_rule__Literal__Group_4__3__Impl8166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4_2__0__Impl_in_rule__Literal__Group_4_2__08203 = new BitSet(new long[]{0x0000003F80238D10L});
    public static final BitSet FOLLOW_rule__Literal__Group_4_2__1_in_rule__Literal__Group_4_2__08206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_rule__Literal__Group_4_2__0__Impl8233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4_2__1__Impl_in_rule__Literal__Group_4_2__18262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__ParametersAssignment_4_2_1_in_rule__Literal__Group_4_2__1__Impl8289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_rule__TopLevel__ToplevelExpressionAssignment8328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TML_SEPARATOR_in_rule__TmlExpression__AbsoluteAssignment_18359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AT_in_rule__TmlExpression__ParamAssignment_28390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathElement_in_rule__TmlExpression__ElementsAssignment_38421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathElement_in_rule__TmlExpression__ElementsAssignment_4_18452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TML_SEPARATOR_in_rule__ExistsTmlExpression__AbsoluteAssignment_28483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AT_in_rule__ExistsTmlExpression__ParamAssignment_38514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathElement_in_rule__ExistsTmlExpression__ElementsAssignment_48545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathElement_in_rule__ExistsTmlExpression__ElementsAssignment_5_18576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__MapReferenceParams__GetterParamsAssignment_18607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__MapReferenceParams__GetterParamsAssignment_2_18638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOLLAR_in_rule__MapGetReference__OperationsAssignment_08669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARENT_in_rule__MapGetReference__ElementsAssignment_1_08700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MapGetReference__ElementsAssignment_28731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapReferenceParams_in_rule__MapGetReference__ReferenceParamsAssignment_38762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__ParametersAssignment_08793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OR_in_rule__OrExpression__OperationsAssignment_1_08824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_rule__OrExpression__ParametersAssignment_1_18855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_rule__AndExpression__ParametersAssignment_08886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AND_in_rule__AndExpression__OperationsAssignment_1_08917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_rule__AndExpression__ParametersAssignment_1_18948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_rule__EqualityExpression__ParametersAssignment_08979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EQUALSEQUALS_in_rule__EqualityExpression__OperationsAssignment_1_0_09010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_rule__EqualityExpression__ParametersAssignment_1_0_19041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEQUALS_in_rule__EqualityExpression__OperationsAssignment_1_1_09072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_rule__EqualityExpression__ParametersAssignment_1_1_19103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_rule__RelationalExpression__ParametersAssignment_19134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XML_LT_in_rule__RelationalExpression__OperationsAssignment_2_0_09165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_rule__RelationalExpression__ParametersAssignment_2_0_19196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XML_GT_in_rule__RelationalExpression__OperationsAssignment_2_1_09227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_rule__RelationalExpression__ParametersAssignment_2_1_19258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XML_LTEQ_in_rule__RelationalExpression__OperationsAssignment_2_2_09289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_rule__RelationalExpression__ParametersAssignment_2_2_19320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XML_GTEQ_in_rule__RelationalExpression__OperationsAssignment_2_3_09351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_rule__RelationalExpression__ParametersAssignment_2_3_19382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_rule__AdditiveExpression__ParametersAssignment_09413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_rule__AdditiveExpression__ParametersAssignment_1_0_19444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_rule__AdditiveExpression__ParametersAssignment_1_1_19475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_rule__MultiplicativeExpression__ParametersAssignment_09506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MULTIPLY_in_rule__MultiplicativeExpression__OperationsAssignment_1_0_09537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_rule__MultiplicativeExpression__ParametersAssignment_1_0_19568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TML_SEPARATOR_in_rule__MultiplicativeExpression__OperationsAssignment_1_1_09599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_rule__MultiplicativeExpression__ParametersAssignment_1_1_19630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__UnaryExpression__ParametersAssignment_0_0_19661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__UnaryExpression__ParametersAssignment_0_1_19692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__PrimaryExpression__ParametersAssignment_09723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_rule__PrimaryExpression__ParametersAssignment_1_19754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionName_in_rule__FunctionCall__NameAssignment_09785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_rule__FunctionCall__ParametersAssignment_29816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_rule__FunctionCall__ParametersAssignment_3_19847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LITERALSTRING_in_rule__Literal__ValueStringAssignment_19878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FORALL_in_rule__Literal__OperationsAssignment_2_09909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LITERALSTRING_in_rule__Literal__ValueStringAssignment_2_29940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_rule__Literal__ParametersAssignment_2_49971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_rule__Literal__ParametersAssignment_310002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CURLYOPEN_in_rule__Literal__ExpressionTypeAssignment_4_010033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_rule__Literal__ParametersAssignment_4_110064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_rule__Literal__ParametersAssignment_4_2_110095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_rule__Literal__ElementsAssignment_510126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TODAY_in_rule__Literal__ElementsAssignment_610157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TRUE_in_rule__Literal__ElementsAssignment_710188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FALSE_in_rule__Literal__ElementsAssignment_810219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTmlExpression_in_rule__Literal__ParametersAssignment_910250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExistsTmlExpression_in_rule__Literal__ParametersAssignment_1010281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapGetReference_in_rule__Literal__ParametersAssignment_1110312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateLiteral_in_rule__Literal__ParametersAssignment_1210343 = new BitSet(new long[]{0x0000000000000002L});

}