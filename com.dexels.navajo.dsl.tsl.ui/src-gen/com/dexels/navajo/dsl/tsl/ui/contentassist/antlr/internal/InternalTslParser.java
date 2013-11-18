package com.dexels.navajo.dsl.tsl.ui.contentassist.antlr.internal; 

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
import com.dexels.navajo.dsl.tsl.services.TslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalTslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_TSLTAG", "RULE_NAVASCRIPTTAG", "RULE_XML_TAG_SINGLEEND", "RULE_DOT", "RULE_PARENT", "RULE_DOLLAR", "RULE_TML_SEPARATOR", "RULE_NUMBER", "RULE_COMMA", "RULE_SQBRACKET_OPEN", "RULE_SQBRACKET_CLOSE", "RULE_AT", "RULE_COLON", "RULE_BRACKET_OPEN", "RULE_BRACKET_CLOSE", "RULE_TML_EXISTS", "RULE_EQUALS", "RULE_NEQUALS", "RULE_PLUS", "RULE_MINUS", "RULE_MULTIPLY", "RULE_SEMICOLON", "RULE_XMLHEAD", "RULE_LT", "RULE_NOTES", "RULE_QUOTE", "RULE_REPOSITORY", "RULE_IDTAG", "RULE_AUTHOR", "RULE_XMLNS", "RULE_SCHEMALOCATION", "RULE_NONAMESPACESCHEMALOCATION", "RULE_GT", "RULE_NAVASCRIPT_END", "RULE_METHODSTAG", "RULE_METHODTAG", "RULE_VALIDATIONSTAG", "RULE_CHECKTAG", "RULE_COMMENT", "RULE_BREAKTAG", "RULE_INCLUDETAG", "RULE_SCRIPT", "RULE_MESSAGETAG", "RULE_COUNT", "RULE_MODE", "RULE_NAME", "RULE_TYPE", "RULE_CONDITION", "RULE_XML_START_ENDTAG", "RULE_MAPTAG", "RULE_REF", "RULE_OBJECT", "RULE_FILTER", "RULE_REQUIREDTAG", "RULE_PROPERTYTAG", "RULE_DESCRIPTION", "RULE_LENGTH", "RULE_CARDINALITY", "RULE_DIRECTION", "RULE_SUBTYPES", "RULE_PARAMTAG", "RULE_FIELDTAG", "RULE_DEBUG_TAG", "RULE_VALUE", "RULE_EXPRESSION_TAG", "RULE_OPTIONTAG", "RULE_XMLSPACE", "RULE_PRESERVE", "RULE_NOT", "RULE_HASH", "RULE_CURLYCLOSE", "RULE_EXPRESSION_END_TAG", "RULE_OR", "RULE_AND", "RULE_EQUALSEQUALS", "RULE_XML_LT", "RULE_XML_GT", "RULE_XML_LTEQ", "RULE_XML_GTEQ", "RULE_LITERALSTRING", "RULE_FORALL", "RULE_CURLYOPEN", "RULE_NULL", "RULE_TODAY", "RULE_TRUE", "RULE_FALSE", "RULE_XMLCOMMENT", "RULE_BADNUMBER", "RULE_WS"
    };
    public static final int RULE_NOTES=29;
    public static final int RULE_VALUE=68;
    public static final int RULE_ID=4;
    public static final int RULE_REQUIREDTAG=58;
    public static final int RULE_PARENT=9;
    public static final int RULE_AUTHOR=33;
    public static final int RULE_EXPRESSION_END_TAG=76;
    public static final int RULE_XMLHEAD=27;
    public static final int RULE_OR=77;
    public static final int RULE_EXPRESSION_TAG=69;
    public static final int RULE_NONAMESPACESCHEMALOCATION=36;
    public static final int RULE_BRACKET_CLOSE=19;
    public static final int RULE_AND=78;
    public static final int RULE_CURLYCLOSE=75;
    public static final int EOF=-1;
    public static final int RULE_SCRIPT=46;
    public static final int RULE_COUNT=48;
    public static final int RULE_CONDITION=52;
    public static final int RULE_BREAKTAG=44;
    public static final int RULE_FORALL=85;
    public static final int RULE_GT=37;
    public static final int RULE_XML_LTEQ=82;
    public static final int RULE_SCHEMALOCATION=35;
    public static final int RULE_METHODSTAG=39;
    public static final int RULE_DESCRIPTION=60;
    public static final int RULE_COMMA=13;
    public static final int RULE_HASH=74;
    public static final int RULE_COMMENT=43;
    public static final int RULE_NAVASCRIPTTAG=6;
    public static final int RULE_NEQUALS=22;
    public static final int RULE_INCLUDETAG=45;
    public static final int RULE_MINUS=24;
    public static final int RULE_TML_EXISTS=20;
    public static final int RULE_TYPE=51;
    public static final int RULE_OPTIONTAG=70;
    public static final int RULE_SQBRACKET_CLOSE=15;
    public static final int RULE_MULTIPLY=25;
    public static final int RULE_FIELDTAG=66;
    public static final int RULE_XML_GT=81;
    public static final int RULE_AT=16;
    public static final int RULE_EQUALSEQUALS=79;
    public static final int RULE_NAVASCRIPT_END=38;
    public static final int RULE_XMLCOMMENT=91;
    public static final int RULE_QUOTE=30;
    public static final int RULE_SQBRACKET_OPEN=14;
    public static final int RULE_METHODTAG=40;
    public static final int RULE_SEMICOLON=26;
    public static final int RULE_LITERALSTRING=84;
    public static final int RULE_NOT=73;
    public static final int RULE_MAPTAG=54;
    public static final int RULE_LT=28;
    public static final int RULE_MODE=49;
    public static final int RULE_FALSE=90;
    public static final int RULE_DOT=8;
    public static final int RULE_NUMBER=12;
    public static final int RULE_TSLTAG=5;
    public static final int RULE_TODAY=88;
    public static final int RULE_CHECKTAG=42;
    public static final int RULE_OBJECT=56;
    public static final int RULE_PARAMTAG=65;
    public static final int RULE_REPOSITORY=31;
    public static final int RULE_BADNUMBER=92;
    public static final int RULE_DIRECTION=63;
    public static final int RULE_XMLSPACE=71;
    public static final int RULE_XML_TAG_SINGLEEND=7;
    public static final int RULE_LENGTH=61;
    public static final int RULE_MESSAGETAG=47;
    public static final int RULE_DEBUG_TAG=67;
    public static final int RULE_SUBTYPES=64;
    public static final int RULE_PRESERVE=72;
    public static final int RULE_XML_LT=80;
    public static final int RULE_VALIDATIONSTAG=41;
    public static final int RULE_PLUS=23;
    public static final int RULE_CURLYOPEN=86;
    public static final int RULE_XML_GTEQ=83;
    public static final int RULE_TML_SEPARATOR=11;
    public static final int RULE_REF=55;
    public static final int RULE_NULL=87;
    public static final int RULE_BRACKET_OPEN=18;
    public static final int RULE_TRUE=89;
    public static final int RULE_PROPERTYTAG=59;
    public static final int RULE_XMLNS=34;
    public static final int RULE_DOLLAR=10;
    public static final int RULE_COLON=17;
    public static final int RULE_CARDINALITY=62;
    public static final int RULE_FILTER=57;
    public static final int RULE_XML_START_ENDTAG=53;
    public static final int RULE_EQUALS=21;
    public static final int RULE_NAME=50;
    public static final int RULE_WS=93;
    public static final int RULE_IDTAG=32;

    // delegates
    // delegators


        public InternalTslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTslParser.tokenNames; }
    public String getGrammarFileName() { return "../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g"; }


     
     	private TslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(TslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleTml"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:60:1: entryRuleTml : ruleTml EOF ;
    public final void entryRuleTml() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:61:1: ( ruleTml EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:62:1: ruleTml EOF
            {
             before(grammarAccess.getTmlRule()); 
            pushFollow(FOLLOW_ruleTml_in_entryRuleTml61);
            ruleTml();

            state._fsp--;

             after(grammarAccess.getTmlRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTml68); 

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
    // $ANTLR end "entryRuleTml"


    // $ANTLR start "ruleTml"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:69:1: ruleTml : ( ( rule__Tml__Group__0 ) ) ;
    public final void ruleTml() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:73:2: ( ( ( rule__Tml__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:74:1: ( ( rule__Tml__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:74:1: ( ( rule__Tml__Group__0 ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:75:1: ( rule__Tml__Group__0 )
            {
             before(grammarAccess.getTmlAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:76:1: ( rule__Tml__Group__0 )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:76:2: rule__Tml__Group__0
            {
            pushFollow(FOLLOW_rule__Tml__Group__0_in_ruleTml94);
            rule__Tml__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTmlAccess().getGroup()); 

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
    // $ANTLR end "ruleTml"


    // $ANTLR start "entryRuleGarbage"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:88:1: entryRuleGarbage : ruleGarbage EOF ;
    public final void entryRuleGarbage() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:89:1: ( ruleGarbage EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:90:1: ruleGarbage EOF
            {
             before(grammarAccess.getGarbageRule()); 
            pushFollow(FOLLOW_ruleGarbage_in_entryRuleGarbage121);
            ruleGarbage();

            state._fsp--;

             after(grammarAccess.getGarbageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGarbage128); 

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
    // $ANTLR end "entryRuleGarbage"


    // $ANTLR start "ruleGarbage"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:97:1: ruleGarbage : ( ( rule__Garbage__Alternatives )* ) ;
    public final void ruleGarbage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:101:2: ( ( ( rule__Garbage__Alternatives )* ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:102:1: ( ( rule__Garbage__Alternatives )* )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:102:1: ( ( rule__Garbage__Alternatives )* )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:103:1: ( rule__Garbage__Alternatives )*
            {
             before(grammarAccess.getGarbageAccess().getAlternatives()); 
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:104:1: ( rule__Garbage__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_NAVASCRIPTTAG)||(LA1_0>=RULE_DOT && LA1_0<=RULE_SEMICOLON)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:104:2: rule__Garbage__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__Garbage__Alternatives_in_ruleGarbage154);
            	    rule__Garbage__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getGarbageAccess().getAlternatives()); 

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
    // $ANTLR end "ruleGarbage"


    // $ANTLR start "entryRuleAttributeName"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:116:1: entryRuleAttributeName : ruleAttributeName EOF ;
    public final void entryRuleAttributeName() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:117:1: ( ruleAttributeName EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:118:1: ruleAttributeName EOF
            {
             before(grammarAccess.getAttributeNameRule()); 
            pushFollow(FOLLOW_ruleAttributeName_in_entryRuleAttributeName182);
            ruleAttributeName();

            state._fsp--;

             after(grammarAccess.getAttributeNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeName189); 

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
    // $ANTLR end "entryRuleAttributeName"


    // $ANTLR start "ruleAttributeName"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:125:1: ruleAttributeName : ( RULE_ID ) ;
    public final void ruleAttributeName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:129:2: ( ( RULE_ID ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:130:1: ( RULE_ID )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:130:1: ( RULE_ID )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:131:1: RULE_ID
            {
             before(grammarAccess.getAttributeNameAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeName215); 
             after(grammarAccess.getAttributeNameAccess().getIDTerminalRuleCall()); 

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
    // $ANTLR end "ruleAttributeName"


    // $ANTLR start "entryRuleExpression"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:144:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:145:1: ( ruleExpression EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:146:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression241);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression248); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:153:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:157:2: ( ( ( rule__Expression__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:158:1: ( ( rule__Expression__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:158:1: ( ( rule__Expression__Group__0 ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:159:1: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:160:1: ( rule__Expression__Group__0 )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:160:2: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_rule__Expression__Group__0_in_ruleExpression274);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleNonExpression"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:172:1: entryRuleNonExpression : ruleNonExpression EOF ;
    public final void entryRuleNonExpression() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:173:1: ( ruleNonExpression EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:174:1: ruleNonExpression EOF
            {
             before(grammarAccess.getNonExpressionRule()); 
            pushFollow(FOLLOW_ruleNonExpression_in_entryRuleNonExpression301);
            ruleNonExpression();

            state._fsp--;

             after(grammarAccess.getNonExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNonExpression308); 

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
    // $ANTLR end "entryRuleNonExpression"


    // $ANTLR start "ruleNonExpression"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:181:1: ruleNonExpression : ( ( rule__NonExpression__Group__0 ) ) ;
    public final void ruleNonExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:185:2: ( ( ( rule__NonExpression__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:186:1: ( ( rule__NonExpression__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:186:1: ( ( rule__NonExpression__Group__0 ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:187:1: ( rule__NonExpression__Group__0 )
            {
             before(grammarAccess.getNonExpressionAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:188:1: ( rule__NonExpression__Group__0 )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:188:2: rule__NonExpression__Group__0
            {
            pushFollow(FOLLOW_rule__NonExpression__Group__0_in_ruleNonExpression334);
            rule__NonExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNonExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleNonExpression"


    // $ANTLR start "entryRuleMethods"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:200:1: entryRuleMethods : ruleMethods EOF ;
    public final void entryRuleMethods() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:201:1: ( ruleMethods EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:202:1: ruleMethods EOF
            {
             before(grammarAccess.getMethodsRule()); 
            pushFollow(FOLLOW_ruleMethods_in_entryRuleMethods361);
            ruleMethods();

            state._fsp--;

             after(grammarAccess.getMethodsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethods368); 

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
    // $ANTLR end "entryRuleMethods"


    // $ANTLR start "ruleMethods"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:209:1: ruleMethods : ( ( rule__Methods__Group__0 ) ) ;
    public final void ruleMethods() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:213:2: ( ( ( rule__Methods__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:214:1: ( ( rule__Methods__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:214:1: ( ( rule__Methods__Group__0 ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:215:1: ( rule__Methods__Group__0 )
            {
             before(grammarAccess.getMethodsAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:216:1: ( rule__Methods__Group__0 )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:216:2: rule__Methods__Group__0
            {
            pushFollow(FOLLOW_rule__Methods__Group__0_in_ruleMethods394);
            rule__Methods__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodsAccess().getGroup()); 

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
    // $ANTLR end "ruleMethods"


    // $ANTLR start "entryRuleMethod"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:228:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:229:1: ( ruleMethod EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:230:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod421);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod428); 

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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:237:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:241:2: ( ( ( rule__Method__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:242:1: ( ( rule__Method__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:242:1: ( ( rule__Method__Group__0 ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:243:1: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:244:1: ( rule__Method__Group__0 )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:244:2: rule__Method__Group__0
            {
            pushFollow(FOLLOW_rule__Method__Group__0_in_ruleMethod454);
            rule__Method__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getGroup()); 

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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleValidations"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:256:1: entryRuleValidations : ruleValidations EOF ;
    public final void entryRuleValidations() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:257:1: ( ruleValidations EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:258:1: ruleValidations EOF
            {
             before(grammarAccess.getValidationsRule()); 
            pushFollow(FOLLOW_ruleValidations_in_entryRuleValidations481);
            ruleValidations();

            state._fsp--;

             after(grammarAccess.getValidationsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidations488); 

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
    // $ANTLR end "entryRuleValidations"


    // $ANTLR start "ruleValidations"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:265:1: ruleValidations : ( ( rule__Validations__Group__0 ) ) ;
    public final void ruleValidations() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:269:2: ( ( ( rule__Validations__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:270:1: ( ( rule__Validations__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:270:1: ( ( rule__Validations__Group__0 ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:271:1: ( rule__Validations__Group__0 )
            {
             before(grammarAccess.getValidationsAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:272:1: ( rule__Validations__Group__0 )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:272:2: rule__Validations__Group__0
            {
            pushFollow(FOLLOW_rule__Validations__Group__0_in_ruleValidations514);
            rule__Validations__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValidationsAccess().getGroup()); 

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
    // $ANTLR end "ruleValidations"


    // $ANTLR start "entryRuleCheck"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:284:1: entryRuleCheck : ruleCheck EOF ;
    public final void entryRuleCheck() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:285:1: ( ruleCheck EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:286:1: ruleCheck EOF
            {
             before(grammarAccess.getCheckRule()); 
            pushFollow(FOLLOW_ruleCheck_in_entryRuleCheck541);
            ruleCheck();

            state._fsp--;

             after(grammarAccess.getCheckRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheck548); 

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
    // $ANTLR end "entryRuleCheck"


    // $ANTLR start "ruleCheck"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:293:1: ruleCheck : ( ( rule__Check__Group__0 ) ) ;
    public final void ruleCheck() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:297:2: ( ( ( rule__Check__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:298:1: ( ( rule__Check__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:298:1: ( ( rule__Check__Group__0 ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:299:1: ( rule__Check__Group__0 )
            {
             before(grammarAccess.getCheckAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:300:1: ( rule__Check__Group__0 )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:300:2: rule__Check__Group__0
            {
            pushFollow(FOLLOW_rule__Check__Group__0_in_ruleCheck574);
            rule__Check__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheckAccess().getGroup()); 

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
    // $ANTLR end "ruleCheck"


    // $ANTLR start "entryRuleCommentClause"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:312:1: entryRuleCommentClause : ruleCommentClause EOF ;
    public final void entryRuleCommentClause() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:313:1: ( ruleCommentClause EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:314:1: ruleCommentClause EOF
            {
             before(grammarAccess.getCommentClauseRule()); 
            pushFollow(FOLLOW_ruleCommentClause_in_entryRuleCommentClause601);
            ruleCommentClause();

            state._fsp--;

             after(grammarAccess.getCommentClauseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommentClause608); 

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
    // $ANTLR end "entryRuleCommentClause"


    // $ANTLR start "ruleCommentClause"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:321:1: ruleCommentClause : ( ( rule__CommentClause__Group__0 ) ) ;
    public final void ruleCommentClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:325:2: ( ( ( rule__CommentClause__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:326:1: ( ( rule__CommentClause__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:326:1: ( ( rule__CommentClause__Group__0 ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:327:1: ( rule__CommentClause__Group__0 )
            {
             before(grammarAccess.getCommentClauseAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:328:1: ( rule__CommentClause__Group__0 )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:328:2: rule__CommentClause__Group__0
            {
            pushFollow(FOLLOW_rule__CommentClause__Group__0_in_ruleCommentClause634);
            rule__CommentClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommentClauseAccess().getGroup()); 

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
    // $ANTLR end "ruleCommentClause"


    // $ANTLR start "entryRuleBreak"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:340:1: entryRuleBreak : ruleBreak EOF ;
    public final void entryRuleBreak() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:341:1: ( ruleBreak EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:342:1: ruleBreak EOF
            {
             before(grammarAccess.getBreakRule()); 
            pushFollow(FOLLOW_ruleBreak_in_entryRuleBreak661);
            ruleBreak();

            state._fsp--;

             after(grammarAccess.getBreakRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBreak668); 

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
    // $ANTLR end "entryRuleBreak"


    // $ANTLR start "ruleBreak"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:349:1: ruleBreak : ( ( rule__Break__Group__0 ) ) ;
    public final void ruleBreak() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:353:2: ( ( ( rule__Break__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:354:1: ( ( rule__Break__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:354:1: ( ( rule__Break__Group__0 ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:355:1: ( rule__Break__Group__0 )
            {
             before(grammarAccess.getBreakAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:356:1: ( rule__Break__Group__0 )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:356:2: rule__Break__Group__0
            {
            pushFollow(FOLLOW_rule__Break__Group__0_in_ruleBreak694);
            rule__Break__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBreakAccess().getGroup()); 

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
    // $ANTLR end "ruleBreak"


    // $ANTLR start "entryRuleInclude"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:370:1: entryRuleInclude : ruleInclude EOF ;
    public final void entryRuleInclude() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:371:1: ( ruleInclude EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:372:1: ruleInclude EOF
            {
             before(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude723);
            ruleInclude();

            state._fsp--;

             after(grammarAccess.getIncludeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude730); 

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
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:379:1: ruleInclude : ( ( rule__Include__Group__0 ) ) ;
    public final void ruleInclude() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:383:2: ( ( ( rule__Include__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:384:1: ( ( rule__Include__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:384:1: ( ( rule__Include__Group__0 ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:385:1: ( rule__Include__Group__0 )
            {
             before(grammarAccess.getIncludeAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:386:1: ( rule__Include__Group__0 )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:386:2: rule__Include__Group__0
            {
            pushFollow(FOLLOW_rule__Include__Group__0_in_ruleInclude756);
            rule__Include__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIncludeAccess().getGroup()); 

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
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRuleMessage"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:398:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:399:1: ( ruleMessage EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:400:1: ruleMessage EOF
            {
             before(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage783);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getMessageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage790); 

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
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:407:1: ruleMessage : ( ( rule__Message__Group__0 ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:411:2: ( ( ( rule__Message__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:412:1: ( ( rule__Message__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:412:1: ( ( rule__Message__Group__0 ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:413:1: ( rule__Message__Group__0 )
            {
             before(grammarAccess.getMessageAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:414:1: ( rule__Message__Group__0 )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:414:2: rule__Message__Group__0
            {
            pushFollow(FOLLOW_rule__Message__Group__0_in_ruleMessage816);
            rule__Message__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getGroup()); 

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
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleMap"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:426:1: entryRuleMap : ruleMap EOF ;
    public final void entryRuleMap() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:427:1: ( ruleMap EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:428:1: ruleMap EOF
            {
             before(grammarAccess.getMapRule()); 
            pushFollow(FOLLOW_ruleMap_in_entryRuleMap843);
            ruleMap();

            state._fsp--;

             after(grammarAccess.getMapRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMap850); 

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
    // $ANTLR end "entryRuleMap"


    // $ANTLR start "ruleMap"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:435:1: ruleMap : ( ( rule__Map__Group__0 ) ) ;
    public final void ruleMap() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:439:2: ( ( ( rule__Map__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:440:1: ( ( rule__Map__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:440:1: ( ( rule__Map__Group__0 ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:441:1: ( rule__Map__Group__0 )
            {
             before(grammarAccess.getMapAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:442:1: ( rule__Map__Group__0 )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:442:2: rule__Map__Group__0
            {
            pushFollow(FOLLOW_rule__Map__Group__0_in_ruleMap876);
            rule__Map__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMapAccess().getGroup()); 

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
    // $ANTLR end "ruleMap"


    // $ANTLR start "entryRuleMapId"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:454:1: entryRuleMapId : ruleMapId EOF ;
    public final void entryRuleMapId() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:455:1: ( ruleMapId EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:456:1: ruleMapId EOF
            {
             before(grammarAccess.getMapIdRule()); 
            pushFollow(FOLLOW_ruleMapId_in_entryRuleMapId903);
            ruleMapId();

            state._fsp--;

             after(grammarAccess.getMapIdRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapId910); 

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
    // $ANTLR end "entryRuleMapId"


    // $ANTLR start "ruleMapId"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:463:1: ruleMapId : ( RULE_ID ) ;
    public final void ruleMapId() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:467:2: ( ( RULE_ID ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:468:1: ( RULE_ID )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:468:1: ( RULE_ID )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:469:1: RULE_ID
            {
             before(grammarAccess.getMapIdAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapId936); 
             after(grammarAccess.getMapIdAccess().getIDTerminalRuleCall()); 

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
    // $ANTLR end "ruleMapId"


    // $ANTLR start "entryRuleRequired"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:482:1: entryRuleRequired : ruleRequired EOF ;
    public final void entryRuleRequired() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:483:1: ( ruleRequired EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:484:1: ruleRequired EOF
            {
             before(grammarAccess.getRequiredRule()); 
            pushFollow(FOLLOW_ruleRequired_in_entryRuleRequired962);
            ruleRequired();

            state._fsp--;

             after(grammarAccess.getRequiredRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequired969); 

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
    // $ANTLR end "entryRuleRequired"


    // $ANTLR start "ruleRequired"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:491:1: ruleRequired : ( ( rule__Required__Group__0 ) ) ;
    public final void ruleRequired() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:495:2: ( ( ( rule__Required__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:496:1: ( ( rule__Required__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:496:1: ( ( rule__Required__Group__0 ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:497:1: ( rule__Required__Group__0 )
            {
             before(grammarAccess.getRequiredAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:498:1: ( rule__Required__Group__0 )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:498:2: rule__Required__Group__0
            {
            pushFollow(FOLLOW_rule__Required__Group__0_in_ruleRequired995);
            rule__Required__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequiredAccess().getGroup()); 

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
    // $ANTLR end "ruleRequired"


    // $ANTLR start "entryRuleProperty"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:510:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:511:1: ( ruleProperty EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:512:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty1022);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty1029); 

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:519:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:523:2: ( ( ( rule__Property__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:524:1: ( ( rule__Property__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:524:1: ( ( rule__Property__Group__0 ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:525:1: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:526:1: ( rule__Property__Group__0 )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:526:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_rule__Property__Group__0_in_ruleProperty1055);
            rule__Property__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup()); 

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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleParam"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:538:1: entryRuleParam : ruleParam EOF ;
    public final void entryRuleParam() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:539:1: ( ruleParam EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:540:1: ruleParam EOF
            {
             before(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_ruleParam_in_entryRuleParam1082);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getParamRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParam1089); 

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
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:547:1: ruleParam : ( ( rule__Param__Group__0 ) ) ;
    public final void ruleParam() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:551:2: ( ( ( rule__Param__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:552:1: ( ( rule__Param__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:552:1: ( ( rule__Param__Group__0 ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:553:1: ( rule__Param__Group__0 )
            {
             before(grammarAccess.getParamAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:554:1: ( rule__Param__Group__0 )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:554:2: rule__Param__Group__0
            {
            pushFollow(FOLLOW_rule__Param__Group__0_in_ruleParam1115);
            rule__Param__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getGroup()); 

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
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleMapMethod"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:566:1: entryRuleMapMethod : ruleMapMethod EOF ;
    public final void entryRuleMapMethod() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:567:1: ( ruleMapMethod EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:568:1: ruleMapMethod EOF
            {
             before(grammarAccess.getMapMethodRule()); 
            pushFollow(FOLLOW_ruleMapMethod_in_entryRuleMapMethod1142);
            ruleMapMethod();

            state._fsp--;

             after(grammarAccess.getMapMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapMethod1149); 

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
    // $ANTLR end "entryRuleMapMethod"


    // $ANTLR start "ruleMapMethod"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:575:1: ruleMapMethod : ( ( rule__MapMethod__Group__0 ) ) ;
    public final void ruleMapMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:579:2: ( ( ( rule__MapMethod__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:580:1: ( ( rule__MapMethod__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:580:1: ( ( rule__MapMethod__Group__0 ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:581:1: ( rule__MapMethod__Group__0 )
            {
             before(grammarAccess.getMapMethodAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:582:1: ( rule__MapMethod__Group__0 )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:582:2: rule__MapMethod__Group__0
            {
            pushFollow(FOLLOW_rule__MapMethod__Group__0_in_ruleMapMethod1175);
            rule__MapMethod__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMapMethodAccess().getGroup()); 

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
    // $ANTLR end "ruleMapMethod"


    // $ANTLR start "entryRuleField"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:594:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:595:1: ( ruleField EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:596:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField1202);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField1209); 

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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:603:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:607:2: ( ( ( rule__Field__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:608:1: ( ( rule__Field__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:608:1: ( ( rule__Field__Group__0 ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:609:1: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:610:1: ( rule__Field__Group__0 )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:610:2: rule__Field__Group__0
            {
            pushFollow(FOLLOW_rule__Field__Group__0_in_ruleField1235);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleDebugTag"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:622:1: entryRuleDebugTag : ruleDebugTag EOF ;
    public final void entryRuleDebugTag() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:623:1: ( ruleDebugTag EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:624:1: ruleDebugTag EOF
            {
             before(grammarAccess.getDebugTagRule()); 
            pushFollow(FOLLOW_ruleDebugTag_in_entryRuleDebugTag1262);
            ruleDebugTag();

            state._fsp--;

             after(grammarAccess.getDebugTagRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDebugTag1269); 

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
    // $ANTLR end "entryRuleDebugTag"


    // $ANTLR start "ruleDebugTag"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:631:1: ruleDebugTag : ( ( rule__DebugTag__Group__0 ) ) ;
    public final void ruleDebugTag() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:635:2: ( ( ( rule__DebugTag__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:636:1: ( ( rule__DebugTag__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:636:1: ( ( rule__DebugTag__Group__0 ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:637:1: ( rule__DebugTag__Group__0 )
            {
             before(grammarAccess.getDebugTagAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:638:1: ( rule__DebugTag__Group__0 )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:638:2: rule__DebugTag__Group__0
            {
            pushFollow(FOLLOW_rule__DebugTag__Group__0_in_ruleDebugTag1295);
            rule__DebugTag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDebugTagAccess().getGroup()); 

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
    // $ANTLR end "ruleDebugTag"


    // $ANTLR start "entryRuleExpressionOrOption"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:650:1: entryRuleExpressionOrOption : ruleExpressionOrOption EOF ;
    public final void entryRuleExpressionOrOption() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:651:1: ( ruleExpressionOrOption EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:652:1: ruleExpressionOrOption EOF
            {
             before(grammarAccess.getExpressionOrOptionRule()); 
            pushFollow(FOLLOW_ruleExpressionOrOption_in_entryRuleExpressionOrOption1322);
            ruleExpressionOrOption();

            state._fsp--;

             after(grammarAccess.getExpressionOrOptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionOrOption1329); 

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
    // $ANTLR end "entryRuleExpressionOrOption"


    // $ANTLR start "ruleExpressionOrOption"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:659:1: ruleExpressionOrOption : ( ( rule__ExpressionOrOption__Alternatives ) ) ;
    public final void ruleExpressionOrOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:663:2: ( ( ( rule__ExpressionOrOption__Alternatives ) ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:664:1: ( ( rule__ExpressionOrOption__Alternatives ) )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:664:1: ( ( rule__ExpressionOrOption__Alternatives ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:665:1: ( rule__ExpressionOrOption__Alternatives )
            {
             before(grammarAccess.getExpressionOrOptionAccess().getAlternatives()); 
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:666:1: ( rule__ExpressionOrOption__Alternatives )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:666:2: rule__ExpressionOrOption__Alternatives
            {
            pushFollow(FOLLOW_rule__ExpressionOrOption__Alternatives_in_ruleExpressionOrOption1355);
            rule__ExpressionOrOption__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionOrOptionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleExpressionOrOption"


    // $ANTLR start "entryRuleExpressionTag"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:678:1: entryRuleExpressionTag : ruleExpressionTag EOF ;
    public final void entryRuleExpressionTag() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:679:1: ( ruleExpressionTag EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:680:1: ruleExpressionTag EOF
            {
             before(grammarAccess.getExpressionTagRule()); 
            pushFollow(FOLLOW_ruleExpressionTag_in_entryRuleExpressionTag1382);
            ruleExpressionTag();

            state._fsp--;

             after(grammarAccess.getExpressionTagRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionTag1389); 

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
    // $ANTLR end "entryRuleExpressionTag"


    // $ANTLR start "ruleExpressionTag"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:687:1: ruleExpressionTag : ( ( rule__ExpressionTag__Group__0 ) ) ;
    public final void ruleExpressionTag() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:691:2: ( ( ( rule__ExpressionTag__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:692:1: ( ( rule__ExpressionTag__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:692:1: ( ( rule__ExpressionTag__Group__0 ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:693:1: ( rule__ExpressionTag__Group__0 )
            {
             before(grammarAccess.getExpressionTagAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:694:1: ( rule__ExpressionTag__Group__0 )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:694:2: rule__ExpressionTag__Group__0
            {
            pushFollow(FOLLOW_rule__ExpressionTag__Group__0_in_ruleExpressionTag1415);
            rule__ExpressionTag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionTagAccess().getGroup()); 

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
    // $ANTLR end "ruleExpressionTag"


    // $ANTLR start "entryRuleOption"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:706:1: entryRuleOption : ruleOption EOF ;
    public final void entryRuleOption() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:707:1: ( ruleOption EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:708:1: ruleOption EOF
            {
             before(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_ruleOption_in_entryRuleOption1442);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getOptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOption1449); 

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
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:715:1: ruleOption : ( ( rule__Option__Group__0 ) ) ;
    public final void ruleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:719:2: ( ( ( rule__Option__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:720:1: ( ( rule__Option__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:720:1: ( ( rule__Option__Group__0 ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:721:1: ( rule__Option__Group__0 )
            {
             before(grammarAccess.getOptionAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:722:1: ( rule__Option__Group__0 )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:722:2: rule__Option__Group__0
            {
            pushFollow(FOLLOW_rule__Option__Group__0_in_ruleOption1475);
            rule__Option__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getGroup()); 

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
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleTopLevel"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:734:1: entryRuleTopLevel : ruleTopLevel EOF ;
    public final void entryRuleTopLevel() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:735:1: ( ruleTopLevel EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:736:1: ruleTopLevel EOF
            {
             before(grammarAccess.getTopLevelRule()); 
            pushFollow(FOLLOW_ruleTopLevel_in_entryRuleTopLevel1502);
            ruleTopLevel();

            state._fsp--;

             after(grammarAccess.getTopLevelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopLevel1509); 

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
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:743:1: ruleTopLevel : ( ( rule__TopLevel__ToplevelExpressionAssignment ) ) ;
    public final void ruleTopLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:747:2: ( ( ( rule__TopLevel__ToplevelExpressionAssignment ) ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:748:1: ( ( rule__TopLevel__ToplevelExpressionAssignment ) )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:748:1: ( ( rule__TopLevel__ToplevelExpressionAssignment ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:749:1: ( rule__TopLevel__ToplevelExpressionAssignment )
            {
             before(grammarAccess.getTopLevelAccess().getToplevelExpressionAssignment()); 
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:750:1: ( rule__TopLevel__ToplevelExpressionAssignment )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:750:2: rule__TopLevel__ToplevelExpressionAssignment
            {
            pushFollow(FOLLOW_rule__TopLevel__ToplevelExpressionAssignment_in_ruleTopLevel1535);
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
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:764:1: entryRulePathElement : rulePathElement EOF ;
    public final void entryRulePathElement() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:765:1: ( rulePathElement EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:766:1: rulePathElement EOF
            {
             before(grammarAccess.getPathElementRule()); 
            pushFollow(FOLLOW_rulePathElement_in_entryRulePathElement1564);
            rulePathElement();

            state._fsp--;

             after(grammarAccess.getPathElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathElement1571); 

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
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:773:1: rulePathElement : ( ( rule__PathElement__Alternatives ) ) ;
    public final void rulePathElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:777:2: ( ( ( rule__PathElement__Alternatives ) ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:778:1: ( ( rule__PathElement__Alternatives ) )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:778:1: ( ( rule__PathElement__Alternatives ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:779:1: ( rule__PathElement__Alternatives )
            {
             before(grammarAccess.getPathElementAccess().getAlternatives()); 
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:780:1: ( rule__PathElement__Alternatives )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:780:2: rule__PathElement__Alternatives
            {
            pushFollow(FOLLOW_rule__PathElement__Alternatives_in_rulePathElement1597);
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
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:792:1: entryRuleTmlExpression : ruleTmlExpression EOF ;
    public final void entryRuleTmlExpression() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:793:1: ( ruleTmlExpression EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:794:1: ruleTmlExpression EOF
            {
             before(grammarAccess.getTmlExpressionRule()); 
            pushFollow(FOLLOW_ruleTmlExpression_in_entryRuleTmlExpression1624);
            ruleTmlExpression();

            state._fsp--;

             after(grammarAccess.getTmlExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTmlExpression1631); 

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
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:801:1: ruleTmlExpression : ( ( rule__TmlExpression__Group__0 ) ) ;
    public final void ruleTmlExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:805:2: ( ( ( rule__TmlExpression__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:806:1: ( ( rule__TmlExpression__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:806:1: ( ( rule__TmlExpression__Group__0 ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:807:1: ( rule__TmlExpression__Group__0 )
            {
             before(grammarAccess.getTmlExpressionAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:808:1: ( rule__TmlExpression__Group__0 )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:808:2: rule__TmlExpression__Group__0
            {
            pushFollow(FOLLOW_rule__TmlExpression__Group__0_in_ruleTmlExpression1657);
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
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:820:1: entryRuleExistsTmlExpression : ruleExistsTmlExpression EOF ;
    public final void entryRuleExistsTmlExpression() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:821:1: ( ruleExistsTmlExpression EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:822:1: ruleExistsTmlExpression EOF
            {
             before(grammarAccess.getExistsTmlExpressionRule()); 
            pushFollow(FOLLOW_ruleExistsTmlExpression_in_entryRuleExistsTmlExpression1684);
            ruleExistsTmlExpression();

            state._fsp--;

             after(grammarAccess.getExistsTmlExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExistsTmlExpression1691); 

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
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:829:1: ruleExistsTmlExpression : ( ( rule__ExistsTmlExpression__Group__0 ) ) ;
    public final void ruleExistsTmlExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:833:2: ( ( ( rule__ExistsTmlExpression__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:834:1: ( ( rule__ExistsTmlExpression__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:834:1: ( ( rule__ExistsTmlExpression__Group__0 ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:835:1: ( rule__ExistsTmlExpression__Group__0 )
            {
             before(grammarAccess.getExistsTmlExpressionAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:836:1: ( rule__ExistsTmlExpression__Group__0 )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:836:2: rule__ExistsTmlExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ExistsTmlExpression__Group__0_in_ruleExistsTmlExpression1717);
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
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:848:1: entryRuleMapReferenceParams : ruleMapReferenceParams EOF ;
    public final void entryRuleMapReferenceParams() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:849:1: ( ruleMapReferenceParams EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:850:1: ruleMapReferenceParams EOF
            {
             before(grammarAccess.getMapReferenceParamsRule()); 
            pushFollow(FOLLOW_ruleMapReferenceParams_in_entryRuleMapReferenceParams1744);
            ruleMapReferenceParams();

            state._fsp--;

             after(grammarAccess.getMapReferenceParamsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapReferenceParams1751); 

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
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:857:1: ruleMapReferenceParams : ( ( rule__MapReferenceParams__Group__0 ) ) ;
    public final void ruleMapReferenceParams() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:861:2: ( ( ( rule__MapReferenceParams__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:862:1: ( ( rule__MapReferenceParams__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:862:1: ( ( rule__MapReferenceParams__Group__0 ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:863:1: ( rule__MapReferenceParams__Group__0 )
            {
             before(grammarAccess.getMapReferenceParamsAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:864:1: ( rule__MapReferenceParams__Group__0 )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:864:2: rule__MapReferenceParams__Group__0
            {
            pushFollow(FOLLOW_rule__MapReferenceParams__Group__0_in_ruleMapReferenceParams1777);
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
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:876:1: entryRuleMapGetReference : ruleMapGetReference EOF ;
    public final void entryRuleMapGetReference() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:877:1: ( ruleMapGetReference EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:878:1: ruleMapGetReference EOF
            {
             before(grammarAccess.getMapGetReferenceRule()); 
            pushFollow(FOLLOW_ruleMapGetReference_in_entryRuleMapGetReference1804);
            ruleMapGetReference();

            state._fsp--;

             after(grammarAccess.getMapGetReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapGetReference1811); 

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
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:885:1: ruleMapGetReference : ( ( rule__MapGetReference__Group__0 ) ) ;
    public final void ruleMapGetReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:889:2: ( ( ( rule__MapGetReference__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:890:1: ( ( rule__MapGetReference__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:890:1: ( ( rule__MapGetReference__Group__0 ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:891:1: ( rule__MapGetReference__Group__0 )
            {
             before(grammarAccess.getMapGetReferenceAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:892:1: ( rule__MapGetReference__Group__0 )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:892:2: rule__MapGetReference__Group__0
            {
            pushFollow(FOLLOW_rule__MapGetReference__Group__0_in_ruleMapGetReference1837);
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
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:904:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:905:1: ( ruleOrExpression EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:906:1: ruleOrExpression EOF
            {
             before(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression1864);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression1871); 

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
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:913:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:917:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:918:1: ( ( rule__OrExpression__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:918:1: ( ( rule__OrExpression__Group__0 ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:919:1: ( rule__OrExpression__Group__0 )
            {
             before(grammarAccess.getOrExpressionAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:920:1: ( rule__OrExpression__Group__0 )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:920:2: rule__OrExpression__Group__0
            {
            pushFollow(FOLLOW_rule__OrExpression__Group__0_in_ruleOrExpression1897);
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
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:932:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:933:1: ( ruleAndExpression EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:934:1: ruleAndExpression EOF
            {
             before(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression1924);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression1931); 

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
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:941:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:945:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:946:1: ( ( rule__AndExpression__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:946:1: ( ( rule__AndExpression__Group__0 ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:947:1: ( rule__AndExpression__Group__0 )
            {
             before(grammarAccess.getAndExpressionAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:948:1: ( rule__AndExpression__Group__0 )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:948:2: rule__AndExpression__Group__0
            {
            pushFollow(FOLLOW_rule__AndExpression__Group__0_in_ruleAndExpression1957);
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
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:960:1: entryRuleEqualityExpression : ruleEqualityExpression EOF ;
    public final void entryRuleEqualityExpression() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:961:1: ( ruleEqualityExpression EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:962:1: ruleEqualityExpression EOF
            {
             before(grammarAccess.getEqualityExpressionRule()); 
            pushFollow(FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression1984);
            ruleEqualityExpression();

            state._fsp--;

             after(grammarAccess.getEqualityExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualityExpression1991); 

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
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:969:1: ruleEqualityExpression : ( ( rule__EqualityExpression__Group__0 ) ) ;
    public final void ruleEqualityExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:973:2: ( ( ( rule__EqualityExpression__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:974:1: ( ( rule__EqualityExpression__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:974:1: ( ( rule__EqualityExpression__Group__0 ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:975:1: ( rule__EqualityExpression__Group__0 )
            {
             before(grammarAccess.getEqualityExpressionAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:976:1: ( rule__EqualityExpression__Group__0 )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:976:2: rule__EqualityExpression__Group__0
            {
            pushFollow(FOLLOW_rule__EqualityExpression__Group__0_in_ruleEqualityExpression2017);
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
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:988:1: entryRuleRelationalExpression : ruleRelationalExpression EOF ;
    public final void entryRuleRelationalExpression() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:989:1: ( ruleRelationalExpression EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:990:1: ruleRelationalExpression EOF
            {
             before(grammarAccess.getRelationalExpressionRule()); 
            pushFollow(FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression2044);
            ruleRelationalExpression();

            state._fsp--;

             after(grammarAccess.getRelationalExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpression2051); 

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
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:997:1: ruleRelationalExpression : ( ( rule__RelationalExpression__Group__0 ) ) ;
    public final void ruleRelationalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1001:2: ( ( ( rule__RelationalExpression__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1002:1: ( ( rule__RelationalExpression__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1002:1: ( ( rule__RelationalExpression__Group__0 ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1003:1: ( rule__RelationalExpression__Group__0 )
            {
             before(grammarAccess.getRelationalExpressionAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1004:1: ( rule__RelationalExpression__Group__0 )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1004:2: rule__RelationalExpression__Group__0
            {
            pushFollow(FOLLOW_rule__RelationalExpression__Group__0_in_ruleRelationalExpression2077);
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
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1016:1: entryRuleAdditiveExpression : ruleAdditiveExpression EOF ;
    public final void entryRuleAdditiveExpression() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1017:1: ( ruleAdditiveExpression EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1018:1: ruleAdditiveExpression EOF
            {
             before(grammarAccess.getAdditiveExpressionRule()); 
            pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression2104);
            ruleAdditiveExpression();

            state._fsp--;

             after(grammarAccess.getAdditiveExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpression2111); 

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
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1025:1: ruleAdditiveExpression : ( ( rule__AdditiveExpression__Group__0 ) ) ;
    public final void ruleAdditiveExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1029:2: ( ( ( rule__AdditiveExpression__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1030:1: ( ( rule__AdditiveExpression__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1030:1: ( ( rule__AdditiveExpression__Group__0 ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1031:1: ( rule__AdditiveExpression__Group__0 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1032:1: ( rule__AdditiveExpression__Group__0 )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1032:2: rule__AdditiveExpression__Group__0
            {
            pushFollow(FOLLOW_rule__AdditiveExpression__Group__0_in_ruleAdditiveExpression2137);
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
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1044:1: entryRuleMultiplicativeExpression : ruleMultiplicativeExpression EOF ;
    public final void entryRuleMultiplicativeExpression() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1045:1: ( ruleMultiplicativeExpression EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1046:1: ruleMultiplicativeExpression EOF
            {
             before(grammarAccess.getMultiplicativeExpressionRule()); 
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression2164);
            ruleMultiplicativeExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeExpression2171); 

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
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1053:1: ruleMultiplicativeExpression : ( ( rule__MultiplicativeExpression__Group__0 ) ) ;
    public final void ruleMultiplicativeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1057:2: ( ( ( rule__MultiplicativeExpression__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1058:1: ( ( rule__MultiplicativeExpression__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1058:1: ( ( rule__MultiplicativeExpression__Group__0 ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1059:1: ( rule__MultiplicativeExpression__Group__0 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1060:1: ( rule__MultiplicativeExpression__Group__0 )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1060:2: rule__MultiplicativeExpression__Group__0
            {
            pushFollow(FOLLOW_rule__MultiplicativeExpression__Group__0_in_ruleMultiplicativeExpression2197);
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
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1072:1: entryRuleUnaryExpression : ruleUnaryExpression EOF ;
    public final void entryRuleUnaryExpression() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1073:1: ( ruleUnaryExpression EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1074:1: ruleUnaryExpression EOF
            {
             before(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression2224);
            ruleUnaryExpression();

            state._fsp--;

             after(grammarAccess.getUnaryExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpression2231); 

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
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1081:1: ruleUnaryExpression : ( ( rule__UnaryExpression__Alternatives ) ) ;
    public final void ruleUnaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1085:2: ( ( ( rule__UnaryExpression__Alternatives ) ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1086:1: ( ( rule__UnaryExpression__Alternatives ) )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1086:1: ( ( rule__UnaryExpression__Alternatives ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1087:1: ( rule__UnaryExpression__Alternatives )
            {
             before(grammarAccess.getUnaryExpressionAccess().getAlternatives()); 
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1088:1: ( rule__UnaryExpression__Alternatives )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1088:2: rule__UnaryExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__UnaryExpression__Alternatives_in_ruleUnaryExpression2257);
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
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1100:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1101:1: ( rulePrimaryExpression EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1102:1: rulePrimaryExpression EOF
            {
             before(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2284);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression2291); 

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
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1109:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1113:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1114:1: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1114:1: ( ( rule__PrimaryExpression__Alternatives ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1115:1: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1116:1: ( rule__PrimaryExpression__Alternatives )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1116:2: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression2317);
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
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1128:1: entryRuleFunctionName : ruleFunctionName EOF ;
    public final void entryRuleFunctionName() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1129:1: ( ruleFunctionName EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1130:1: ruleFunctionName EOF
            {
             before(grammarAccess.getFunctionNameRule()); 
            pushFollow(FOLLOW_ruleFunctionName_in_entryRuleFunctionName2344);
            ruleFunctionName();

            state._fsp--;

             after(grammarAccess.getFunctionNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionName2351); 

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
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1137:1: ruleFunctionName : ( RULE_ID ) ;
    public final void ruleFunctionName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1141:2: ( ( RULE_ID ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1142:1: ( RULE_ID )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1142:1: ( RULE_ID )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1143:1: RULE_ID
            {
             before(grammarAccess.getFunctionNameAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionName2377); 
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
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1156:1: entryRuleFunctionCall : ruleFunctionCall EOF ;
    public final void entryRuleFunctionCall() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1157:1: ( ruleFunctionCall EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1158:1: ruleFunctionCall EOF
            {
             before(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall2403);
            ruleFunctionCall();

            state._fsp--;

             after(grammarAccess.getFunctionCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCall2410); 

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
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1165:1: ruleFunctionCall : ( ( rule__FunctionCall__Group__0 ) ) ;
    public final void ruleFunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1169:2: ( ( ( rule__FunctionCall__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1170:1: ( ( rule__FunctionCall__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1170:1: ( ( rule__FunctionCall__Group__0 ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1171:1: ( rule__FunctionCall__Group__0 )
            {
             before(grammarAccess.getFunctionCallAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1172:1: ( rule__FunctionCall__Group__0 )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1172:2: rule__FunctionCall__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__0_in_ruleFunctionCall2436);
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
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1184:1: entryRuleDateLiteral : ruleDateLiteral EOF ;
    public final void entryRuleDateLiteral() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1185:1: ( ruleDateLiteral EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1186:1: ruleDateLiteral EOF
            {
             before(grammarAccess.getDateLiteralRule()); 
            pushFollow(FOLLOW_ruleDateLiteral_in_entryRuleDateLiteral2463);
            ruleDateLiteral();

            state._fsp--;

             after(grammarAccess.getDateLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateLiteral2470); 

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
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1193:1: ruleDateLiteral : ( ( rule__DateLiteral__Group__0 ) ) ;
    public final void ruleDateLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1197:2: ( ( ( rule__DateLiteral__Group__0 ) ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1198:1: ( ( rule__DateLiteral__Group__0 ) )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1198:1: ( ( rule__DateLiteral__Group__0 ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1199:1: ( rule__DateLiteral__Group__0 )
            {
             before(grammarAccess.getDateLiteralAccess().getGroup()); 
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1200:1: ( rule__DateLiteral__Group__0 )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1200:2: rule__DateLiteral__Group__0
            {
            pushFollow(FOLLOW_rule__DateLiteral__Group__0_in_ruleDateLiteral2496);
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
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1212:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1213:1: ( ruleLiteral EOF )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1214:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral2523);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral2530); 

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
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1221:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1225:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1226:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1226:1: ( ( rule__Literal__Alternatives ) )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1227:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1228:1: ( rule__Literal__Alternatives )
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1228:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral2556);
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


    // $ANTLR start "rule__Tml__Alternatives_3"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1240:1: rule__Tml__Alternatives_3 : ( ( RULE_TSLTAG ) | ( RULE_NAVASCRIPTTAG ) );
    public final void rule__Tml__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1244:1: ( ( RULE_TSLTAG ) | ( RULE_NAVASCRIPTTAG ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_TSLTAG) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_NAVASCRIPTTAG) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1245:1: ( RULE_TSLTAG )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1245:1: ( RULE_TSLTAG )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1246:1: RULE_TSLTAG
                    {
                     before(grammarAccess.getTmlAccess().getTSLTAGTerminalRuleCall_3_0()); 
                    match(input,RULE_TSLTAG,FOLLOW_RULE_TSLTAG_in_rule__Tml__Alternatives_32592); 
                     after(grammarAccess.getTmlAccess().getTSLTAGTerminalRuleCall_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1251:6: ( RULE_NAVASCRIPTTAG )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1251:6: ( RULE_NAVASCRIPTTAG )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1252:1: RULE_NAVASCRIPTTAG
                    {
                     before(grammarAccess.getTmlAccess().getNAVASCRIPTTAGTerminalRuleCall_3_1()); 
                    match(input,RULE_NAVASCRIPTTAG,FOLLOW_RULE_NAVASCRIPTTAG_in_rule__Tml__Alternatives_32609); 
                     after(grammarAccess.getTmlAccess().getNAVASCRIPTTAGTerminalRuleCall_3_1()); 

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
    // $ANTLR end "rule__Tml__Alternatives_3"


    // $ANTLR start "rule__Tml__Alternatives_5"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1262:1: rule__Tml__Alternatives_5 : ( ( ( rule__Tml__Group_5_0__0 ) ) | ( RULE_XML_TAG_SINGLEEND ) );
    public final void rule__Tml__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1266:1: ( ( ( rule__Tml__Group_5_0__0 ) ) | ( RULE_XML_TAG_SINGLEEND ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_GT) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_XML_TAG_SINGLEEND) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1267:1: ( ( rule__Tml__Group_5_0__0 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1267:1: ( ( rule__Tml__Group_5_0__0 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1268:1: ( rule__Tml__Group_5_0__0 )
                    {
                     before(grammarAccess.getTmlAccess().getGroup_5_0()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1269:1: ( rule__Tml__Group_5_0__0 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1269:2: rule__Tml__Group_5_0__0
                    {
                    pushFollow(FOLLOW_rule__Tml__Group_5_0__0_in_rule__Tml__Alternatives_52641);
                    rule__Tml__Group_5_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTmlAccess().getGroup_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1273:6: ( RULE_XML_TAG_SINGLEEND )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1273:6: ( RULE_XML_TAG_SINGLEEND )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1274:1: RULE_XML_TAG_SINGLEEND
                    {
                     before(grammarAccess.getTmlAccess().getXML_TAG_SINGLEENDTerminalRuleCall_5_1()); 
                    match(input,RULE_XML_TAG_SINGLEEND,FOLLOW_RULE_XML_TAG_SINGLEEND_in_rule__Tml__Alternatives_52659); 
                     after(grammarAccess.getTmlAccess().getXML_TAG_SINGLEENDTerminalRuleCall_5_1()); 

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
    // $ANTLR end "rule__Tml__Alternatives_5"


    // $ANTLR start "rule__Tml__Alternatives_5_0_1"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1284:1: rule__Tml__Alternatives_5_0_1 : ( ( ( rule__Tml__ChildrenAssignment_5_0_1_0 ) ) | ( ( rule__Tml__ChildrenAssignment_5_0_1_1 ) ) | ( ( rule__Tml__ChildrenAssignment_5_0_1_2 ) ) | ( ( rule__Tml__MethodsAssignment_5_0_1_3 ) ) | ( ( rule__Tml__ChildrenAssignment_5_0_1_4 ) ) | ( ( rule__Tml__ChildrenAssignment_5_0_1_5 ) ) | ( ( rule__Tml__ChildrenAssignment_5_0_1_6 ) ) | ( ( rule__Tml__ChildrenAssignment_5_0_1_7 ) ) );
    public final void rule__Tml__Alternatives_5_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1288:1: ( ( ( rule__Tml__ChildrenAssignment_5_0_1_0 ) ) | ( ( rule__Tml__ChildrenAssignment_5_0_1_1 ) ) | ( ( rule__Tml__ChildrenAssignment_5_0_1_2 ) ) | ( ( rule__Tml__MethodsAssignment_5_0_1_3 ) ) | ( ( rule__Tml__ChildrenAssignment_5_0_1_4 ) ) | ( ( rule__Tml__ChildrenAssignment_5_0_1_5 ) ) | ( ( rule__Tml__ChildrenAssignment_5_0_1_6 ) ) | ( ( rule__Tml__ChildrenAssignment_5_0_1_7 ) ) )
            int alt4=8;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1289:1: ( ( rule__Tml__ChildrenAssignment_5_0_1_0 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1289:1: ( ( rule__Tml__ChildrenAssignment_5_0_1_0 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1290:1: ( rule__Tml__ChildrenAssignment_5_0_1_0 )
                    {
                     before(grammarAccess.getTmlAccess().getChildrenAssignment_5_0_1_0()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1291:1: ( rule__Tml__ChildrenAssignment_5_0_1_0 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1291:2: rule__Tml__ChildrenAssignment_5_0_1_0
                    {
                    pushFollow(FOLLOW_rule__Tml__ChildrenAssignment_5_0_1_0_in_rule__Tml__Alternatives_5_0_12691);
                    rule__Tml__ChildrenAssignment_5_0_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTmlAccess().getChildrenAssignment_5_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1295:6: ( ( rule__Tml__ChildrenAssignment_5_0_1_1 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1295:6: ( ( rule__Tml__ChildrenAssignment_5_0_1_1 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1296:1: ( rule__Tml__ChildrenAssignment_5_0_1_1 )
                    {
                     before(grammarAccess.getTmlAccess().getChildrenAssignment_5_0_1_1()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1297:1: ( rule__Tml__ChildrenAssignment_5_0_1_1 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1297:2: rule__Tml__ChildrenAssignment_5_0_1_1
                    {
                    pushFollow(FOLLOW_rule__Tml__ChildrenAssignment_5_0_1_1_in_rule__Tml__Alternatives_5_0_12709);
                    rule__Tml__ChildrenAssignment_5_0_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTmlAccess().getChildrenAssignment_5_0_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1301:6: ( ( rule__Tml__ChildrenAssignment_5_0_1_2 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1301:6: ( ( rule__Tml__ChildrenAssignment_5_0_1_2 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1302:1: ( rule__Tml__ChildrenAssignment_5_0_1_2 )
                    {
                     before(grammarAccess.getTmlAccess().getChildrenAssignment_5_0_1_2()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1303:1: ( rule__Tml__ChildrenAssignment_5_0_1_2 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1303:2: rule__Tml__ChildrenAssignment_5_0_1_2
                    {
                    pushFollow(FOLLOW_rule__Tml__ChildrenAssignment_5_0_1_2_in_rule__Tml__Alternatives_5_0_12727);
                    rule__Tml__ChildrenAssignment_5_0_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTmlAccess().getChildrenAssignment_5_0_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1307:6: ( ( rule__Tml__MethodsAssignment_5_0_1_3 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1307:6: ( ( rule__Tml__MethodsAssignment_5_0_1_3 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1308:1: ( rule__Tml__MethodsAssignment_5_0_1_3 )
                    {
                     before(grammarAccess.getTmlAccess().getMethodsAssignment_5_0_1_3()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1309:1: ( rule__Tml__MethodsAssignment_5_0_1_3 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1309:2: rule__Tml__MethodsAssignment_5_0_1_3
                    {
                    pushFollow(FOLLOW_rule__Tml__MethodsAssignment_5_0_1_3_in_rule__Tml__Alternatives_5_0_12745);
                    rule__Tml__MethodsAssignment_5_0_1_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getTmlAccess().getMethodsAssignment_5_0_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1313:6: ( ( rule__Tml__ChildrenAssignment_5_0_1_4 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1313:6: ( ( rule__Tml__ChildrenAssignment_5_0_1_4 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1314:1: ( rule__Tml__ChildrenAssignment_5_0_1_4 )
                    {
                     before(grammarAccess.getTmlAccess().getChildrenAssignment_5_0_1_4()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1315:1: ( rule__Tml__ChildrenAssignment_5_0_1_4 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1315:2: rule__Tml__ChildrenAssignment_5_0_1_4
                    {
                    pushFollow(FOLLOW_rule__Tml__ChildrenAssignment_5_0_1_4_in_rule__Tml__Alternatives_5_0_12763);
                    rule__Tml__ChildrenAssignment_5_0_1_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getTmlAccess().getChildrenAssignment_5_0_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1319:6: ( ( rule__Tml__ChildrenAssignment_5_0_1_5 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1319:6: ( ( rule__Tml__ChildrenAssignment_5_0_1_5 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1320:1: ( rule__Tml__ChildrenAssignment_5_0_1_5 )
                    {
                     before(grammarAccess.getTmlAccess().getChildrenAssignment_5_0_1_5()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1321:1: ( rule__Tml__ChildrenAssignment_5_0_1_5 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1321:2: rule__Tml__ChildrenAssignment_5_0_1_5
                    {
                    pushFollow(FOLLOW_rule__Tml__ChildrenAssignment_5_0_1_5_in_rule__Tml__Alternatives_5_0_12781);
                    rule__Tml__ChildrenAssignment_5_0_1_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getTmlAccess().getChildrenAssignment_5_0_1_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1325:6: ( ( rule__Tml__ChildrenAssignment_5_0_1_6 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1325:6: ( ( rule__Tml__ChildrenAssignment_5_0_1_6 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1326:1: ( rule__Tml__ChildrenAssignment_5_0_1_6 )
                    {
                     before(grammarAccess.getTmlAccess().getChildrenAssignment_5_0_1_6()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1327:1: ( rule__Tml__ChildrenAssignment_5_0_1_6 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1327:2: rule__Tml__ChildrenAssignment_5_0_1_6
                    {
                    pushFollow(FOLLOW_rule__Tml__ChildrenAssignment_5_0_1_6_in_rule__Tml__Alternatives_5_0_12799);
                    rule__Tml__ChildrenAssignment_5_0_1_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getTmlAccess().getChildrenAssignment_5_0_1_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1331:6: ( ( rule__Tml__ChildrenAssignment_5_0_1_7 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1331:6: ( ( rule__Tml__ChildrenAssignment_5_0_1_7 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1332:1: ( rule__Tml__ChildrenAssignment_5_0_1_7 )
                    {
                     before(grammarAccess.getTmlAccess().getChildrenAssignment_5_0_1_7()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1333:1: ( rule__Tml__ChildrenAssignment_5_0_1_7 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1333:2: rule__Tml__ChildrenAssignment_5_0_1_7
                    {
                    pushFollow(FOLLOW_rule__Tml__ChildrenAssignment_5_0_1_7_in_rule__Tml__Alternatives_5_0_12817);
                    rule__Tml__ChildrenAssignment_5_0_1_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getTmlAccess().getChildrenAssignment_5_0_1_7()); 

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
    // $ANTLR end "rule__Tml__Alternatives_5_0_1"


    // $ANTLR start "rule__Garbage__Alternatives"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1342:1: rule__Garbage__Alternatives : ( ( RULE_ID ) | ( RULE_DOT ) | ( RULE_PARENT ) | ( RULE_DOLLAR ) | ( RULE_TML_SEPARATOR ) | ( RULE_NUMBER ) | ( RULE_COMMA ) | ( RULE_SQBRACKET_OPEN ) | ( RULE_SQBRACKET_CLOSE ) | ( RULE_AT ) | ( RULE_COLON ) | ( RULE_BRACKET_OPEN ) | ( RULE_BRACKET_CLOSE ) | ( RULE_TML_EXISTS ) | ( RULE_EQUALS ) | ( RULE_NEQUALS ) | ( RULE_PLUS ) | ( RULE_MINUS ) | ( RULE_MULTIPLY ) | ( RULE_SEMICOLON ) | ( RULE_TSLTAG ) | ( RULE_NAVASCRIPTTAG ) );
    public final void rule__Garbage__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1346:1: ( ( RULE_ID ) | ( RULE_DOT ) | ( RULE_PARENT ) | ( RULE_DOLLAR ) | ( RULE_TML_SEPARATOR ) | ( RULE_NUMBER ) | ( RULE_COMMA ) | ( RULE_SQBRACKET_OPEN ) | ( RULE_SQBRACKET_CLOSE ) | ( RULE_AT ) | ( RULE_COLON ) | ( RULE_BRACKET_OPEN ) | ( RULE_BRACKET_CLOSE ) | ( RULE_TML_EXISTS ) | ( RULE_EQUALS ) | ( RULE_NEQUALS ) | ( RULE_PLUS ) | ( RULE_MINUS ) | ( RULE_MULTIPLY ) | ( RULE_SEMICOLON ) | ( RULE_TSLTAG ) | ( RULE_NAVASCRIPTTAG ) )
            int alt5=22;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt5=1;
                }
                break;
            case RULE_DOT:
                {
                alt5=2;
                }
                break;
            case RULE_PARENT:
                {
                alt5=3;
                }
                break;
            case RULE_DOLLAR:
                {
                alt5=4;
                }
                break;
            case RULE_TML_SEPARATOR:
                {
                alt5=5;
                }
                break;
            case RULE_NUMBER:
                {
                alt5=6;
                }
                break;
            case RULE_COMMA:
                {
                alt5=7;
                }
                break;
            case RULE_SQBRACKET_OPEN:
                {
                alt5=8;
                }
                break;
            case RULE_SQBRACKET_CLOSE:
                {
                alt5=9;
                }
                break;
            case RULE_AT:
                {
                alt5=10;
                }
                break;
            case RULE_COLON:
                {
                alt5=11;
                }
                break;
            case RULE_BRACKET_OPEN:
                {
                alt5=12;
                }
                break;
            case RULE_BRACKET_CLOSE:
                {
                alt5=13;
                }
                break;
            case RULE_TML_EXISTS:
                {
                alt5=14;
                }
                break;
            case RULE_EQUALS:
                {
                alt5=15;
                }
                break;
            case RULE_NEQUALS:
                {
                alt5=16;
                }
                break;
            case RULE_PLUS:
                {
                alt5=17;
                }
                break;
            case RULE_MINUS:
                {
                alt5=18;
                }
                break;
            case RULE_MULTIPLY:
                {
                alt5=19;
                }
                break;
            case RULE_SEMICOLON:
                {
                alt5=20;
                }
                break;
            case RULE_TSLTAG:
                {
                alt5=21;
                }
                break;
            case RULE_NAVASCRIPTTAG:
                {
                alt5=22;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1347:1: ( RULE_ID )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1347:1: ( RULE_ID )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1348:1: RULE_ID
                    {
                     before(grammarAccess.getGarbageAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Garbage__Alternatives2850); 
                     after(grammarAccess.getGarbageAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1353:6: ( RULE_DOT )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1353:6: ( RULE_DOT )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1354:1: RULE_DOT
                    {
                     before(grammarAccess.getGarbageAccess().getDOTTerminalRuleCall_1()); 
                    match(input,RULE_DOT,FOLLOW_RULE_DOT_in_rule__Garbage__Alternatives2867); 
                     after(grammarAccess.getGarbageAccess().getDOTTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1359:6: ( RULE_PARENT )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1359:6: ( RULE_PARENT )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1360:1: RULE_PARENT
                    {
                     before(grammarAccess.getGarbageAccess().getPARENTTerminalRuleCall_2()); 
                    match(input,RULE_PARENT,FOLLOW_RULE_PARENT_in_rule__Garbage__Alternatives2884); 
                     after(grammarAccess.getGarbageAccess().getPARENTTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1365:6: ( RULE_DOLLAR )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1365:6: ( RULE_DOLLAR )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1366:1: RULE_DOLLAR
                    {
                     before(grammarAccess.getGarbageAccess().getDOLLARTerminalRuleCall_3()); 
                    match(input,RULE_DOLLAR,FOLLOW_RULE_DOLLAR_in_rule__Garbage__Alternatives2901); 
                     after(grammarAccess.getGarbageAccess().getDOLLARTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1371:6: ( RULE_TML_SEPARATOR )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1371:6: ( RULE_TML_SEPARATOR )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1372:1: RULE_TML_SEPARATOR
                    {
                     before(grammarAccess.getGarbageAccess().getTML_SEPARATORTerminalRuleCall_4()); 
                    match(input,RULE_TML_SEPARATOR,FOLLOW_RULE_TML_SEPARATOR_in_rule__Garbage__Alternatives2918); 
                     after(grammarAccess.getGarbageAccess().getTML_SEPARATORTerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1377:6: ( RULE_NUMBER )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1377:6: ( RULE_NUMBER )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1378:1: RULE_NUMBER
                    {
                     before(grammarAccess.getGarbageAccess().getNUMBERTerminalRuleCall_5()); 
                    match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_rule__Garbage__Alternatives2935); 
                     after(grammarAccess.getGarbageAccess().getNUMBERTerminalRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1383:6: ( RULE_COMMA )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1383:6: ( RULE_COMMA )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1384:1: RULE_COMMA
                    {
                     before(grammarAccess.getGarbageAccess().getCOMMATerminalRuleCall_6()); 
                    match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_rule__Garbage__Alternatives2952); 
                     after(grammarAccess.getGarbageAccess().getCOMMATerminalRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1389:6: ( RULE_SQBRACKET_OPEN )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1389:6: ( RULE_SQBRACKET_OPEN )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1390:1: RULE_SQBRACKET_OPEN
                    {
                     before(grammarAccess.getGarbageAccess().getSQBRACKET_OPENTerminalRuleCall_7()); 
                    match(input,RULE_SQBRACKET_OPEN,FOLLOW_RULE_SQBRACKET_OPEN_in_rule__Garbage__Alternatives2969); 
                     after(grammarAccess.getGarbageAccess().getSQBRACKET_OPENTerminalRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1395:6: ( RULE_SQBRACKET_CLOSE )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1395:6: ( RULE_SQBRACKET_CLOSE )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1396:1: RULE_SQBRACKET_CLOSE
                    {
                     before(grammarAccess.getGarbageAccess().getSQBRACKET_CLOSETerminalRuleCall_8()); 
                    match(input,RULE_SQBRACKET_CLOSE,FOLLOW_RULE_SQBRACKET_CLOSE_in_rule__Garbage__Alternatives2986); 
                     after(grammarAccess.getGarbageAccess().getSQBRACKET_CLOSETerminalRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1401:6: ( RULE_AT )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1401:6: ( RULE_AT )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1402:1: RULE_AT
                    {
                     before(grammarAccess.getGarbageAccess().getATTerminalRuleCall_9()); 
                    match(input,RULE_AT,FOLLOW_RULE_AT_in_rule__Garbage__Alternatives3003); 
                     after(grammarAccess.getGarbageAccess().getATTerminalRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1407:6: ( RULE_COLON )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1407:6: ( RULE_COLON )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1408:1: RULE_COLON
                    {
                     before(grammarAccess.getGarbageAccess().getCOLONTerminalRuleCall_10()); 
                    match(input,RULE_COLON,FOLLOW_RULE_COLON_in_rule__Garbage__Alternatives3020); 
                     after(grammarAccess.getGarbageAccess().getCOLONTerminalRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1413:6: ( RULE_BRACKET_OPEN )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1413:6: ( RULE_BRACKET_OPEN )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1414:1: RULE_BRACKET_OPEN
                    {
                     before(grammarAccess.getGarbageAccess().getBRACKET_OPENTerminalRuleCall_11()); 
                    match(input,RULE_BRACKET_OPEN,FOLLOW_RULE_BRACKET_OPEN_in_rule__Garbage__Alternatives3037); 
                     after(grammarAccess.getGarbageAccess().getBRACKET_OPENTerminalRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1419:6: ( RULE_BRACKET_CLOSE )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1419:6: ( RULE_BRACKET_CLOSE )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1420:1: RULE_BRACKET_CLOSE
                    {
                     before(grammarAccess.getGarbageAccess().getBRACKET_CLOSETerminalRuleCall_12()); 
                    match(input,RULE_BRACKET_CLOSE,FOLLOW_RULE_BRACKET_CLOSE_in_rule__Garbage__Alternatives3054); 
                     after(grammarAccess.getGarbageAccess().getBRACKET_CLOSETerminalRuleCall_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1425:6: ( RULE_TML_EXISTS )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1425:6: ( RULE_TML_EXISTS )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1426:1: RULE_TML_EXISTS
                    {
                     before(grammarAccess.getGarbageAccess().getTML_EXISTSTerminalRuleCall_13()); 
                    match(input,RULE_TML_EXISTS,FOLLOW_RULE_TML_EXISTS_in_rule__Garbage__Alternatives3071); 
                     after(grammarAccess.getGarbageAccess().getTML_EXISTSTerminalRuleCall_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1431:6: ( RULE_EQUALS )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1431:6: ( RULE_EQUALS )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1432:1: RULE_EQUALS
                    {
                     before(grammarAccess.getGarbageAccess().getEQUALSTerminalRuleCall_14()); 
                    match(input,RULE_EQUALS,FOLLOW_RULE_EQUALS_in_rule__Garbage__Alternatives3088); 
                     after(grammarAccess.getGarbageAccess().getEQUALSTerminalRuleCall_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1437:6: ( RULE_NEQUALS )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1437:6: ( RULE_NEQUALS )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1438:1: RULE_NEQUALS
                    {
                     before(grammarAccess.getGarbageAccess().getNEQUALSTerminalRuleCall_15()); 
                    match(input,RULE_NEQUALS,FOLLOW_RULE_NEQUALS_in_rule__Garbage__Alternatives3105); 
                     after(grammarAccess.getGarbageAccess().getNEQUALSTerminalRuleCall_15()); 

                    }


                    }
                    break;
                case 17 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1443:6: ( RULE_PLUS )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1443:6: ( RULE_PLUS )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1444:1: RULE_PLUS
                    {
                     before(grammarAccess.getGarbageAccess().getPLUSTerminalRuleCall_16()); 
                    match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_rule__Garbage__Alternatives3122); 
                     after(grammarAccess.getGarbageAccess().getPLUSTerminalRuleCall_16()); 

                    }


                    }
                    break;
                case 18 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1449:6: ( RULE_MINUS )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1449:6: ( RULE_MINUS )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1450:1: RULE_MINUS
                    {
                     before(grammarAccess.getGarbageAccess().getMINUSTerminalRuleCall_17()); 
                    match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_rule__Garbage__Alternatives3139); 
                     after(grammarAccess.getGarbageAccess().getMINUSTerminalRuleCall_17()); 

                    }


                    }
                    break;
                case 19 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1455:6: ( RULE_MULTIPLY )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1455:6: ( RULE_MULTIPLY )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1456:1: RULE_MULTIPLY
                    {
                     before(grammarAccess.getGarbageAccess().getMULTIPLYTerminalRuleCall_18()); 
                    match(input,RULE_MULTIPLY,FOLLOW_RULE_MULTIPLY_in_rule__Garbage__Alternatives3156); 
                     after(grammarAccess.getGarbageAccess().getMULTIPLYTerminalRuleCall_18()); 

                    }


                    }
                    break;
                case 20 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1461:6: ( RULE_SEMICOLON )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1461:6: ( RULE_SEMICOLON )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1462:1: RULE_SEMICOLON
                    {
                     before(grammarAccess.getGarbageAccess().getSEMICOLONTerminalRuleCall_19()); 
                    match(input,RULE_SEMICOLON,FOLLOW_RULE_SEMICOLON_in_rule__Garbage__Alternatives3173); 
                     after(grammarAccess.getGarbageAccess().getSEMICOLONTerminalRuleCall_19()); 

                    }


                    }
                    break;
                case 21 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1467:6: ( RULE_TSLTAG )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1467:6: ( RULE_TSLTAG )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1468:1: RULE_TSLTAG
                    {
                     before(grammarAccess.getGarbageAccess().getTSLTAGTerminalRuleCall_20()); 
                    match(input,RULE_TSLTAG,FOLLOW_RULE_TSLTAG_in_rule__Garbage__Alternatives3190); 
                     after(grammarAccess.getGarbageAccess().getTSLTAGTerminalRuleCall_20()); 

                    }


                    }
                    break;
                case 22 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1473:6: ( RULE_NAVASCRIPTTAG )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1473:6: ( RULE_NAVASCRIPTTAG )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1474:1: RULE_NAVASCRIPTTAG
                    {
                     before(grammarAccess.getGarbageAccess().getNAVASCRIPTTAGTerminalRuleCall_21()); 
                    match(input,RULE_NAVASCRIPTTAG,FOLLOW_RULE_NAVASCRIPTTAG_in_rule__Garbage__Alternatives3207); 
                     after(grammarAccess.getGarbageAccess().getNAVASCRIPTTAGTerminalRuleCall_21()); 

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
    // $ANTLR end "rule__Garbage__Alternatives"


    // $ANTLR start "rule__Methods__Alternatives_3"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1484:1: rule__Methods__Alternatives_3 : ( ( ( rule__Methods__Group_3_0__0 ) ) | ( RULE_XML_TAG_SINGLEEND ) );
    public final void rule__Methods__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1488:1: ( ( ( rule__Methods__Group_3_0__0 ) ) | ( RULE_XML_TAG_SINGLEEND ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_GT) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_XML_TAG_SINGLEEND) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1489:1: ( ( rule__Methods__Group_3_0__0 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1489:1: ( ( rule__Methods__Group_3_0__0 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1490:1: ( rule__Methods__Group_3_0__0 )
                    {
                     before(grammarAccess.getMethodsAccess().getGroup_3_0()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1491:1: ( rule__Methods__Group_3_0__0 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1491:2: rule__Methods__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__Methods__Group_3_0__0_in_rule__Methods__Alternatives_33239);
                    rule__Methods__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMethodsAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1495:6: ( RULE_XML_TAG_SINGLEEND )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1495:6: ( RULE_XML_TAG_SINGLEEND )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1496:1: RULE_XML_TAG_SINGLEEND
                    {
                     before(grammarAccess.getMethodsAccess().getXML_TAG_SINGLEENDTerminalRuleCall_3_1()); 
                    match(input,RULE_XML_TAG_SINGLEEND,FOLLOW_RULE_XML_TAG_SINGLEEND_in_rule__Methods__Alternatives_33257); 
                     after(grammarAccess.getMethodsAccess().getXML_TAG_SINGLEENDTerminalRuleCall_3_1()); 

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
    // $ANTLR end "rule__Methods__Alternatives_3"


    // $ANTLR start "rule__Method__Alternatives_4"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1506:1: rule__Method__Alternatives_4 : ( ( ( rule__Method__Group_4_0__0 ) ) | ( RULE_XML_TAG_SINGLEEND ) );
    public final void rule__Method__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1510:1: ( ( ( rule__Method__Group_4_0__0 ) ) | ( RULE_XML_TAG_SINGLEEND ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_GT) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_XML_TAG_SINGLEEND) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1511:1: ( ( rule__Method__Group_4_0__0 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1511:1: ( ( rule__Method__Group_4_0__0 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1512:1: ( rule__Method__Group_4_0__0 )
                    {
                     before(grammarAccess.getMethodAccess().getGroup_4_0()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1513:1: ( rule__Method__Group_4_0__0 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1513:2: rule__Method__Group_4_0__0
                    {
                    pushFollow(FOLLOW_rule__Method__Group_4_0__0_in_rule__Method__Alternatives_43289);
                    rule__Method__Group_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMethodAccess().getGroup_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1517:6: ( RULE_XML_TAG_SINGLEEND )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1517:6: ( RULE_XML_TAG_SINGLEEND )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1518:1: RULE_XML_TAG_SINGLEEND
                    {
                     before(grammarAccess.getMethodAccess().getXML_TAG_SINGLEENDTerminalRuleCall_4_1()); 
                    match(input,RULE_XML_TAG_SINGLEEND,FOLLOW_RULE_XML_TAG_SINGLEEND_in_rule__Method__Alternatives_43307); 
                     after(grammarAccess.getMethodAccess().getXML_TAG_SINGLEENDTerminalRuleCall_4_1()); 

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
    // $ANTLR end "rule__Method__Alternatives_4"


    // $ANTLR start "rule__Validations__Alternatives_3"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1528:1: rule__Validations__Alternatives_3 : ( ( ( rule__Validations__Group_3_0__0 ) ) | ( RULE_XML_TAG_SINGLEEND ) );
    public final void rule__Validations__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1532:1: ( ( ( rule__Validations__Group_3_0__0 ) ) | ( RULE_XML_TAG_SINGLEEND ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_GT) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_XML_TAG_SINGLEEND) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1533:1: ( ( rule__Validations__Group_3_0__0 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1533:1: ( ( rule__Validations__Group_3_0__0 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1534:1: ( rule__Validations__Group_3_0__0 )
                    {
                     before(grammarAccess.getValidationsAccess().getGroup_3_0()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1535:1: ( rule__Validations__Group_3_0__0 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1535:2: rule__Validations__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__Validations__Group_3_0__0_in_rule__Validations__Alternatives_33339);
                    rule__Validations__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValidationsAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1539:6: ( RULE_XML_TAG_SINGLEEND )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1539:6: ( RULE_XML_TAG_SINGLEEND )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1540:1: RULE_XML_TAG_SINGLEEND
                    {
                     before(grammarAccess.getValidationsAccess().getXML_TAG_SINGLEENDTerminalRuleCall_3_1()); 
                    match(input,RULE_XML_TAG_SINGLEEND,FOLLOW_RULE_XML_TAG_SINGLEEND_in_rule__Validations__Alternatives_33357); 
                     after(grammarAccess.getValidationsAccess().getXML_TAG_SINGLEENDTerminalRuleCall_3_1()); 

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
    // $ANTLR end "rule__Validations__Alternatives_3"


    // $ANTLR start "rule__Check__Alternatives_4"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1550:1: rule__Check__Alternatives_4 : ( ( ( rule__Check__Group_4_0__0 ) ) | ( RULE_XML_TAG_SINGLEEND ) );
    public final void rule__Check__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1554:1: ( ( ( rule__Check__Group_4_0__0 ) ) | ( RULE_XML_TAG_SINGLEEND ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_GT) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_XML_TAG_SINGLEEND) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1555:1: ( ( rule__Check__Group_4_0__0 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1555:1: ( ( rule__Check__Group_4_0__0 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1556:1: ( rule__Check__Group_4_0__0 )
                    {
                     before(grammarAccess.getCheckAccess().getGroup_4_0()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1557:1: ( rule__Check__Group_4_0__0 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1557:2: rule__Check__Group_4_0__0
                    {
                    pushFollow(FOLLOW_rule__Check__Group_4_0__0_in_rule__Check__Alternatives_43389);
                    rule__Check__Group_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCheckAccess().getGroup_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1561:6: ( RULE_XML_TAG_SINGLEEND )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1561:6: ( RULE_XML_TAG_SINGLEEND )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1562:1: RULE_XML_TAG_SINGLEEND
                    {
                     before(grammarAccess.getCheckAccess().getXML_TAG_SINGLEENDTerminalRuleCall_4_1()); 
                    match(input,RULE_XML_TAG_SINGLEEND,FOLLOW_RULE_XML_TAG_SINGLEEND_in_rule__Check__Alternatives_43407); 
                     after(grammarAccess.getCheckAccess().getXML_TAG_SINGLEENDTerminalRuleCall_4_1()); 

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
    // $ANTLR end "rule__Check__Alternatives_4"


    // $ANTLR start "rule__CommentClause__Alternatives_4"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1572:1: rule__CommentClause__Alternatives_4 : ( ( ( rule__CommentClause__Group_4_0__0 ) ) | ( RULE_XML_TAG_SINGLEEND ) );
    public final void rule__CommentClause__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1576:1: ( ( ( rule__CommentClause__Group_4_0__0 ) ) | ( RULE_XML_TAG_SINGLEEND ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_GT) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_XML_TAG_SINGLEEND) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1577:1: ( ( rule__CommentClause__Group_4_0__0 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1577:1: ( ( rule__CommentClause__Group_4_0__0 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1578:1: ( rule__CommentClause__Group_4_0__0 )
                    {
                     before(grammarAccess.getCommentClauseAccess().getGroup_4_0()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1579:1: ( rule__CommentClause__Group_4_0__0 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1579:2: rule__CommentClause__Group_4_0__0
                    {
                    pushFollow(FOLLOW_rule__CommentClause__Group_4_0__0_in_rule__CommentClause__Alternatives_43439);
                    rule__CommentClause__Group_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCommentClauseAccess().getGroup_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1583:6: ( RULE_XML_TAG_SINGLEEND )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1583:6: ( RULE_XML_TAG_SINGLEEND )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1584:1: RULE_XML_TAG_SINGLEEND
                    {
                     before(grammarAccess.getCommentClauseAccess().getXML_TAG_SINGLEENDTerminalRuleCall_4_1()); 
                    match(input,RULE_XML_TAG_SINGLEEND,FOLLOW_RULE_XML_TAG_SINGLEEND_in_rule__CommentClause__Alternatives_43457); 
                     after(grammarAccess.getCommentClauseAccess().getXML_TAG_SINGLEENDTerminalRuleCall_4_1()); 

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
    // $ANTLR end "rule__CommentClause__Alternatives_4"


    // $ANTLR start "rule__Break__Alternatives_4"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1594:1: rule__Break__Alternatives_4 : ( ( ( rule__Break__Group_4_0__0 ) ) | ( RULE_XML_TAG_SINGLEEND ) );
    public final void rule__Break__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1598:1: ( ( ( rule__Break__Group_4_0__0 ) ) | ( RULE_XML_TAG_SINGLEEND ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_GT) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_XML_TAG_SINGLEEND) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1599:1: ( ( rule__Break__Group_4_0__0 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1599:1: ( ( rule__Break__Group_4_0__0 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1600:1: ( rule__Break__Group_4_0__0 )
                    {
                     before(grammarAccess.getBreakAccess().getGroup_4_0()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1601:1: ( rule__Break__Group_4_0__0 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1601:2: rule__Break__Group_4_0__0
                    {
                    pushFollow(FOLLOW_rule__Break__Group_4_0__0_in_rule__Break__Alternatives_43489);
                    rule__Break__Group_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBreakAccess().getGroup_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1605:6: ( RULE_XML_TAG_SINGLEEND )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1605:6: ( RULE_XML_TAG_SINGLEEND )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1606:1: RULE_XML_TAG_SINGLEEND
                    {
                     before(grammarAccess.getBreakAccess().getXML_TAG_SINGLEENDTerminalRuleCall_4_1()); 
                    match(input,RULE_XML_TAG_SINGLEEND,FOLLOW_RULE_XML_TAG_SINGLEEND_in_rule__Break__Alternatives_43507); 
                     after(grammarAccess.getBreakAccess().getXML_TAG_SINGLEENDTerminalRuleCall_4_1()); 

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
    // $ANTLR end "rule__Break__Alternatives_4"


    // $ANTLR start "rule__Include__Alternatives_4"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1617:1: rule__Include__Alternatives_4 : ( ( ( rule__Include__Group_4_0__0 ) ) | ( RULE_XML_TAG_SINGLEEND ) );
    public final void rule__Include__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1621:1: ( ( ( rule__Include__Group_4_0__0 ) ) | ( RULE_XML_TAG_SINGLEEND ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_GT) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_XML_TAG_SINGLEEND) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1622:1: ( ( rule__Include__Group_4_0__0 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1622:1: ( ( rule__Include__Group_4_0__0 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1623:1: ( rule__Include__Group_4_0__0 )
                    {
                     before(grammarAccess.getIncludeAccess().getGroup_4_0()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1624:1: ( rule__Include__Group_4_0__0 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1624:2: rule__Include__Group_4_0__0
                    {
                    pushFollow(FOLLOW_rule__Include__Group_4_0__0_in_rule__Include__Alternatives_43540);
                    rule__Include__Group_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIncludeAccess().getGroup_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1628:6: ( RULE_XML_TAG_SINGLEEND )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1628:6: ( RULE_XML_TAG_SINGLEEND )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1629:1: RULE_XML_TAG_SINGLEEND
                    {
                     before(grammarAccess.getIncludeAccess().getXML_TAG_SINGLEENDTerminalRuleCall_4_1()); 
                    match(input,RULE_XML_TAG_SINGLEEND,FOLLOW_RULE_XML_TAG_SINGLEEND_in_rule__Include__Alternatives_43558); 
                     after(grammarAccess.getIncludeAccess().getXML_TAG_SINGLEENDTerminalRuleCall_4_1()); 

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
    // $ANTLR end "rule__Include__Alternatives_4"


    // $ANTLR start "rule__Message__Alternatives_4"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1639:1: rule__Message__Alternatives_4 : ( ( ( rule__Message__Group_4_0__0 ) ) | ( RULE_XML_TAG_SINGLEEND ) );
    public final void rule__Message__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1643:1: ( ( ( rule__Message__Group_4_0__0 ) ) | ( RULE_XML_TAG_SINGLEEND ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_GT) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_XML_TAG_SINGLEEND) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1644:1: ( ( rule__Message__Group_4_0__0 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1644:1: ( ( rule__Message__Group_4_0__0 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1645:1: ( rule__Message__Group_4_0__0 )
                    {
                     before(grammarAccess.getMessageAccess().getGroup_4_0()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1646:1: ( rule__Message__Group_4_0__0 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1646:2: rule__Message__Group_4_0__0
                    {
                    pushFollow(FOLLOW_rule__Message__Group_4_0__0_in_rule__Message__Alternatives_43590);
                    rule__Message__Group_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMessageAccess().getGroup_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1650:6: ( RULE_XML_TAG_SINGLEEND )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1650:6: ( RULE_XML_TAG_SINGLEEND )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1651:1: RULE_XML_TAG_SINGLEEND
                    {
                     before(grammarAccess.getMessageAccess().getXML_TAG_SINGLEENDTerminalRuleCall_4_1()); 
                    match(input,RULE_XML_TAG_SINGLEEND,FOLLOW_RULE_XML_TAG_SINGLEEND_in_rule__Message__Alternatives_43608); 
                     after(grammarAccess.getMessageAccess().getXML_TAG_SINGLEENDTerminalRuleCall_4_1()); 

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
    // $ANTLR end "rule__Message__Alternatives_4"


    // $ANTLR start "rule__Message__Alternatives_4_0_1"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1661:1: rule__Message__Alternatives_4_0_1 : ( ( ( rule__Message__ChildrenAssignment_4_0_1_0 ) ) | ( ( rule__Message__ChildrenAssignment_4_0_1_1 ) ) | ( ( rule__Message__ChildrenAssignment_4_0_1_2 ) ) | ( ( rule__Message__ChildrenAssignment_4_0_1_3 ) ) | ( ( rule__Message__ChildrenAssignment_4_0_1_4 ) ) | ( ( rule__Message__ChildrenAssignment_4_0_1_5 ) ) | ( ( rule__Message__ChildrenAssignment_4_0_1_6 ) ) | ( ( rule__Message__ChildrenAssignment_4_0_1_7 ) ) | ( ( rule__Message__ChildrenAssignment_4_0_1_8 ) ) );
    public final void rule__Message__Alternatives_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1665:1: ( ( ( rule__Message__ChildrenAssignment_4_0_1_0 ) ) | ( ( rule__Message__ChildrenAssignment_4_0_1_1 ) ) | ( ( rule__Message__ChildrenAssignment_4_0_1_2 ) ) | ( ( rule__Message__ChildrenAssignment_4_0_1_3 ) ) | ( ( rule__Message__ChildrenAssignment_4_0_1_4 ) ) | ( ( rule__Message__ChildrenAssignment_4_0_1_5 ) ) | ( ( rule__Message__ChildrenAssignment_4_0_1_6 ) ) | ( ( rule__Message__ChildrenAssignment_4_0_1_7 ) ) | ( ( rule__Message__ChildrenAssignment_4_0_1_8 ) ) )
            int alt14=9;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1666:1: ( ( rule__Message__ChildrenAssignment_4_0_1_0 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1666:1: ( ( rule__Message__ChildrenAssignment_4_0_1_0 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1667:1: ( rule__Message__ChildrenAssignment_4_0_1_0 )
                    {
                     before(grammarAccess.getMessageAccess().getChildrenAssignment_4_0_1_0()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1668:1: ( rule__Message__ChildrenAssignment_4_0_1_0 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1668:2: rule__Message__ChildrenAssignment_4_0_1_0
                    {
                    pushFollow(FOLLOW_rule__Message__ChildrenAssignment_4_0_1_0_in_rule__Message__Alternatives_4_0_13640);
                    rule__Message__ChildrenAssignment_4_0_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMessageAccess().getChildrenAssignment_4_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1672:6: ( ( rule__Message__ChildrenAssignment_4_0_1_1 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1672:6: ( ( rule__Message__ChildrenAssignment_4_0_1_1 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1673:1: ( rule__Message__ChildrenAssignment_4_0_1_1 )
                    {
                     before(grammarAccess.getMessageAccess().getChildrenAssignment_4_0_1_1()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1674:1: ( rule__Message__ChildrenAssignment_4_0_1_1 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1674:2: rule__Message__ChildrenAssignment_4_0_1_1
                    {
                    pushFollow(FOLLOW_rule__Message__ChildrenAssignment_4_0_1_1_in_rule__Message__Alternatives_4_0_13658);
                    rule__Message__ChildrenAssignment_4_0_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMessageAccess().getChildrenAssignment_4_0_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1678:6: ( ( rule__Message__ChildrenAssignment_4_0_1_2 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1678:6: ( ( rule__Message__ChildrenAssignment_4_0_1_2 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1679:1: ( rule__Message__ChildrenAssignment_4_0_1_2 )
                    {
                     before(grammarAccess.getMessageAccess().getChildrenAssignment_4_0_1_2()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1680:1: ( rule__Message__ChildrenAssignment_4_0_1_2 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1680:2: rule__Message__ChildrenAssignment_4_0_1_2
                    {
                    pushFollow(FOLLOW_rule__Message__ChildrenAssignment_4_0_1_2_in_rule__Message__Alternatives_4_0_13676);
                    rule__Message__ChildrenAssignment_4_0_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getMessageAccess().getChildrenAssignment_4_0_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1684:6: ( ( rule__Message__ChildrenAssignment_4_0_1_3 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1684:6: ( ( rule__Message__ChildrenAssignment_4_0_1_3 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1685:1: ( rule__Message__ChildrenAssignment_4_0_1_3 )
                    {
                     before(grammarAccess.getMessageAccess().getChildrenAssignment_4_0_1_3()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1686:1: ( rule__Message__ChildrenAssignment_4_0_1_3 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1686:2: rule__Message__ChildrenAssignment_4_0_1_3
                    {
                    pushFollow(FOLLOW_rule__Message__ChildrenAssignment_4_0_1_3_in_rule__Message__Alternatives_4_0_13694);
                    rule__Message__ChildrenAssignment_4_0_1_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getMessageAccess().getChildrenAssignment_4_0_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1690:6: ( ( rule__Message__ChildrenAssignment_4_0_1_4 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1690:6: ( ( rule__Message__ChildrenAssignment_4_0_1_4 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1691:1: ( rule__Message__ChildrenAssignment_4_0_1_4 )
                    {
                     before(grammarAccess.getMessageAccess().getChildrenAssignment_4_0_1_4()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1692:1: ( rule__Message__ChildrenAssignment_4_0_1_4 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1692:2: rule__Message__ChildrenAssignment_4_0_1_4
                    {
                    pushFollow(FOLLOW_rule__Message__ChildrenAssignment_4_0_1_4_in_rule__Message__Alternatives_4_0_13712);
                    rule__Message__ChildrenAssignment_4_0_1_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getMessageAccess().getChildrenAssignment_4_0_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1696:6: ( ( rule__Message__ChildrenAssignment_4_0_1_5 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1696:6: ( ( rule__Message__ChildrenAssignment_4_0_1_5 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1697:1: ( rule__Message__ChildrenAssignment_4_0_1_5 )
                    {
                     before(grammarAccess.getMessageAccess().getChildrenAssignment_4_0_1_5()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1698:1: ( rule__Message__ChildrenAssignment_4_0_1_5 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1698:2: rule__Message__ChildrenAssignment_4_0_1_5
                    {
                    pushFollow(FOLLOW_rule__Message__ChildrenAssignment_4_0_1_5_in_rule__Message__Alternatives_4_0_13730);
                    rule__Message__ChildrenAssignment_4_0_1_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getMessageAccess().getChildrenAssignment_4_0_1_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1702:6: ( ( rule__Message__ChildrenAssignment_4_0_1_6 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1702:6: ( ( rule__Message__ChildrenAssignment_4_0_1_6 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1703:1: ( rule__Message__ChildrenAssignment_4_0_1_6 )
                    {
                     before(grammarAccess.getMessageAccess().getChildrenAssignment_4_0_1_6()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1704:1: ( rule__Message__ChildrenAssignment_4_0_1_6 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1704:2: rule__Message__ChildrenAssignment_4_0_1_6
                    {
                    pushFollow(FOLLOW_rule__Message__ChildrenAssignment_4_0_1_6_in_rule__Message__Alternatives_4_0_13748);
                    rule__Message__ChildrenAssignment_4_0_1_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getMessageAccess().getChildrenAssignment_4_0_1_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1708:6: ( ( rule__Message__ChildrenAssignment_4_0_1_7 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1708:6: ( ( rule__Message__ChildrenAssignment_4_0_1_7 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1709:1: ( rule__Message__ChildrenAssignment_4_0_1_7 )
                    {
                     before(grammarAccess.getMessageAccess().getChildrenAssignment_4_0_1_7()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1710:1: ( rule__Message__ChildrenAssignment_4_0_1_7 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1710:2: rule__Message__ChildrenAssignment_4_0_1_7
                    {
                    pushFollow(FOLLOW_rule__Message__ChildrenAssignment_4_0_1_7_in_rule__Message__Alternatives_4_0_13766);
                    rule__Message__ChildrenAssignment_4_0_1_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getMessageAccess().getChildrenAssignment_4_0_1_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1714:6: ( ( rule__Message__ChildrenAssignment_4_0_1_8 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1714:6: ( ( rule__Message__ChildrenAssignment_4_0_1_8 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1715:1: ( rule__Message__ChildrenAssignment_4_0_1_8 )
                    {
                     before(grammarAccess.getMessageAccess().getChildrenAssignment_4_0_1_8()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1716:1: ( rule__Message__ChildrenAssignment_4_0_1_8 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1716:2: rule__Message__ChildrenAssignment_4_0_1_8
                    {
                    pushFollow(FOLLOW_rule__Message__ChildrenAssignment_4_0_1_8_in_rule__Message__Alternatives_4_0_13784);
                    rule__Message__ChildrenAssignment_4_0_1_8();

                    state._fsp--;


                    }

                     after(grammarAccess.getMessageAccess().getChildrenAssignment_4_0_1_8()); 

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
    // $ANTLR end "rule__Message__Alternatives_4_0_1"


    // $ANTLR start "rule__Map__Alternatives_5"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1725:1: rule__Map__Alternatives_5 : ( ( RULE_XML_TAG_SINGLEEND ) | ( ( rule__Map__Group_5_1__0 ) ) );
    public final void rule__Map__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1729:1: ( ( RULE_XML_TAG_SINGLEEND ) | ( ( rule__Map__Group_5_1__0 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_XML_TAG_SINGLEEND) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_GT) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1730:1: ( RULE_XML_TAG_SINGLEEND )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1730:1: ( RULE_XML_TAG_SINGLEEND )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1731:1: RULE_XML_TAG_SINGLEEND
                    {
                     before(grammarAccess.getMapAccess().getXML_TAG_SINGLEENDTerminalRuleCall_5_0()); 
                    match(input,RULE_XML_TAG_SINGLEEND,FOLLOW_RULE_XML_TAG_SINGLEEND_in_rule__Map__Alternatives_53817); 
                     after(grammarAccess.getMapAccess().getXML_TAG_SINGLEENDTerminalRuleCall_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1736:6: ( ( rule__Map__Group_5_1__0 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1736:6: ( ( rule__Map__Group_5_1__0 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1737:1: ( rule__Map__Group_5_1__0 )
                    {
                     before(grammarAccess.getMapAccess().getGroup_5_1()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1738:1: ( rule__Map__Group_5_1__0 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1738:2: rule__Map__Group_5_1__0
                    {
                    pushFollow(FOLLOW_rule__Map__Group_5_1__0_in_rule__Map__Alternatives_53834);
                    rule__Map__Group_5_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapAccess().getGroup_5_1()); 

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
    // $ANTLR end "rule__Map__Alternatives_5"


    // $ANTLR start "rule__Map__Alternatives_5_1_1"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1747:1: rule__Map__Alternatives_5_1_1 : ( ( ( rule__Map__ChildrenAssignment_5_1_1_0 ) ) | ( ( rule__Map__ChildrenAssignment_5_1_1_1 ) ) | ( ( rule__Map__ChildrenAssignment_5_1_1_2 ) ) | ( ( rule__Map__ChildrenAssignment_5_1_1_3 ) ) | ( ( rule__Map__ChildrenAssignment_5_1_1_4 ) ) | ( ( rule__Map__ChildrenAssignment_5_1_1_5 ) ) | ( ( rule__Map__ChildrenAssignment_5_1_1_6 ) ) | ( ( rule__Map__ChildrenAssignment_5_1_1_7 ) ) | ( ( rule__Map__ChildrenAssignment_5_1_1_8 ) ) );
    public final void rule__Map__Alternatives_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1751:1: ( ( ( rule__Map__ChildrenAssignment_5_1_1_0 ) ) | ( ( rule__Map__ChildrenAssignment_5_1_1_1 ) ) | ( ( rule__Map__ChildrenAssignment_5_1_1_2 ) ) | ( ( rule__Map__ChildrenAssignment_5_1_1_3 ) ) | ( ( rule__Map__ChildrenAssignment_5_1_1_4 ) ) | ( ( rule__Map__ChildrenAssignment_5_1_1_5 ) ) | ( ( rule__Map__ChildrenAssignment_5_1_1_6 ) ) | ( ( rule__Map__ChildrenAssignment_5_1_1_7 ) ) | ( ( rule__Map__ChildrenAssignment_5_1_1_8 ) ) )
            int alt16=9;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1752:1: ( ( rule__Map__ChildrenAssignment_5_1_1_0 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1752:1: ( ( rule__Map__ChildrenAssignment_5_1_1_0 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1753:1: ( rule__Map__ChildrenAssignment_5_1_1_0 )
                    {
                     before(grammarAccess.getMapAccess().getChildrenAssignment_5_1_1_0()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1754:1: ( rule__Map__ChildrenAssignment_5_1_1_0 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1754:2: rule__Map__ChildrenAssignment_5_1_1_0
                    {
                    pushFollow(FOLLOW_rule__Map__ChildrenAssignment_5_1_1_0_in_rule__Map__Alternatives_5_1_13867);
                    rule__Map__ChildrenAssignment_5_1_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapAccess().getChildrenAssignment_5_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1758:6: ( ( rule__Map__ChildrenAssignment_5_1_1_1 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1758:6: ( ( rule__Map__ChildrenAssignment_5_1_1_1 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1759:1: ( rule__Map__ChildrenAssignment_5_1_1_1 )
                    {
                     before(grammarAccess.getMapAccess().getChildrenAssignment_5_1_1_1()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1760:1: ( rule__Map__ChildrenAssignment_5_1_1_1 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1760:2: rule__Map__ChildrenAssignment_5_1_1_1
                    {
                    pushFollow(FOLLOW_rule__Map__ChildrenAssignment_5_1_1_1_in_rule__Map__Alternatives_5_1_13885);
                    rule__Map__ChildrenAssignment_5_1_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapAccess().getChildrenAssignment_5_1_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1764:6: ( ( rule__Map__ChildrenAssignment_5_1_1_2 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1764:6: ( ( rule__Map__ChildrenAssignment_5_1_1_2 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1765:1: ( rule__Map__ChildrenAssignment_5_1_1_2 )
                    {
                     before(grammarAccess.getMapAccess().getChildrenAssignment_5_1_1_2()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1766:1: ( rule__Map__ChildrenAssignment_5_1_1_2 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1766:2: rule__Map__ChildrenAssignment_5_1_1_2
                    {
                    pushFollow(FOLLOW_rule__Map__ChildrenAssignment_5_1_1_2_in_rule__Map__Alternatives_5_1_13903);
                    rule__Map__ChildrenAssignment_5_1_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapAccess().getChildrenAssignment_5_1_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1770:6: ( ( rule__Map__ChildrenAssignment_5_1_1_3 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1770:6: ( ( rule__Map__ChildrenAssignment_5_1_1_3 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1771:1: ( rule__Map__ChildrenAssignment_5_1_1_3 )
                    {
                     before(grammarAccess.getMapAccess().getChildrenAssignment_5_1_1_3()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1772:1: ( rule__Map__ChildrenAssignment_5_1_1_3 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1772:2: rule__Map__ChildrenAssignment_5_1_1_3
                    {
                    pushFollow(FOLLOW_rule__Map__ChildrenAssignment_5_1_1_3_in_rule__Map__Alternatives_5_1_13921);
                    rule__Map__ChildrenAssignment_5_1_1_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapAccess().getChildrenAssignment_5_1_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1776:6: ( ( rule__Map__ChildrenAssignment_5_1_1_4 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1776:6: ( ( rule__Map__ChildrenAssignment_5_1_1_4 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1777:1: ( rule__Map__ChildrenAssignment_5_1_1_4 )
                    {
                     before(grammarAccess.getMapAccess().getChildrenAssignment_5_1_1_4()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1778:1: ( rule__Map__ChildrenAssignment_5_1_1_4 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1778:2: rule__Map__ChildrenAssignment_5_1_1_4
                    {
                    pushFollow(FOLLOW_rule__Map__ChildrenAssignment_5_1_1_4_in_rule__Map__Alternatives_5_1_13939);
                    rule__Map__ChildrenAssignment_5_1_1_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapAccess().getChildrenAssignment_5_1_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1782:6: ( ( rule__Map__ChildrenAssignment_5_1_1_5 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1782:6: ( ( rule__Map__ChildrenAssignment_5_1_1_5 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1783:1: ( rule__Map__ChildrenAssignment_5_1_1_5 )
                    {
                     before(grammarAccess.getMapAccess().getChildrenAssignment_5_1_1_5()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1784:1: ( rule__Map__ChildrenAssignment_5_1_1_5 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1784:2: rule__Map__ChildrenAssignment_5_1_1_5
                    {
                    pushFollow(FOLLOW_rule__Map__ChildrenAssignment_5_1_1_5_in_rule__Map__Alternatives_5_1_13957);
                    rule__Map__ChildrenAssignment_5_1_1_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapAccess().getChildrenAssignment_5_1_1_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1788:6: ( ( rule__Map__ChildrenAssignment_5_1_1_6 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1788:6: ( ( rule__Map__ChildrenAssignment_5_1_1_6 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1789:1: ( rule__Map__ChildrenAssignment_5_1_1_6 )
                    {
                     before(grammarAccess.getMapAccess().getChildrenAssignment_5_1_1_6()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1790:1: ( rule__Map__ChildrenAssignment_5_1_1_6 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1790:2: rule__Map__ChildrenAssignment_5_1_1_6
                    {
                    pushFollow(FOLLOW_rule__Map__ChildrenAssignment_5_1_1_6_in_rule__Map__Alternatives_5_1_13975);
                    rule__Map__ChildrenAssignment_5_1_1_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapAccess().getChildrenAssignment_5_1_1_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1794:6: ( ( rule__Map__ChildrenAssignment_5_1_1_7 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1794:6: ( ( rule__Map__ChildrenAssignment_5_1_1_7 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1795:1: ( rule__Map__ChildrenAssignment_5_1_1_7 )
                    {
                     before(grammarAccess.getMapAccess().getChildrenAssignment_5_1_1_7()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1796:1: ( rule__Map__ChildrenAssignment_5_1_1_7 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1796:2: rule__Map__ChildrenAssignment_5_1_1_7
                    {
                    pushFollow(FOLLOW_rule__Map__ChildrenAssignment_5_1_1_7_in_rule__Map__Alternatives_5_1_13993);
                    rule__Map__ChildrenAssignment_5_1_1_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapAccess().getChildrenAssignment_5_1_1_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1800:6: ( ( rule__Map__ChildrenAssignment_5_1_1_8 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1800:6: ( ( rule__Map__ChildrenAssignment_5_1_1_8 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1801:1: ( rule__Map__ChildrenAssignment_5_1_1_8 )
                    {
                     before(grammarAccess.getMapAccess().getChildrenAssignment_5_1_1_8()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1802:1: ( rule__Map__ChildrenAssignment_5_1_1_8 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1802:2: rule__Map__ChildrenAssignment_5_1_1_8
                    {
                    pushFollow(FOLLOW_rule__Map__ChildrenAssignment_5_1_1_8_in_rule__Map__Alternatives_5_1_14011);
                    rule__Map__ChildrenAssignment_5_1_1_8();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapAccess().getChildrenAssignment_5_1_1_8()); 

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
    // $ANTLR end "rule__Map__Alternatives_5_1_1"


    // $ANTLR start "rule__Required__Alternatives_4"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1811:1: rule__Required__Alternatives_4 : ( ( RULE_XML_TAG_SINGLEEND ) | ( ( rule__Required__Group_4_1__0 ) ) );
    public final void rule__Required__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1815:1: ( ( RULE_XML_TAG_SINGLEEND ) | ( ( rule__Required__Group_4_1__0 ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_XML_TAG_SINGLEEND) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_GT) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1816:1: ( RULE_XML_TAG_SINGLEEND )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1816:1: ( RULE_XML_TAG_SINGLEEND )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1817:1: RULE_XML_TAG_SINGLEEND
                    {
                     before(grammarAccess.getRequiredAccess().getXML_TAG_SINGLEENDTerminalRuleCall_4_0()); 
                    match(input,RULE_XML_TAG_SINGLEEND,FOLLOW_RULE_XML_TAG_SINGLEEND_in_rule__Required__Alternatives_44044); 
                     after(grammarAccess.getRequiredAccess().getXML_TAG_SINGLEENDTerminalRuleCall_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1822:6: ( ( rule__Required__Group_4_1__0 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1822:6: ( ( rule__Required__Group_4_1__0 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1823:1: ( rule__Required__Group_4_1__0 )
                    {
                     before(grammarAccess.getRequiredAccess().getGroup_4_1()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1824:1: ( rule__Required__Group_4_1__0 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1824:2: rule__Required__Group_4_1__0
                    {
                    pushFollow(FOLLOW_rule__Required__Group_4_1__0_in_rule__Required__Alternatives_44061);
                    rule__Required__Group_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRequiredAccess().getGroup_4_1()); 

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
    // $ANTLR end "rule__Required__Alternatives_4"


    // $ANTLR start "rule__Property__Alternatives_4"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1833:1: rule__Property__Alternatives_4 : ( ( RULE_XML_TAG_SINGLEEND ) | ( ( rule__Property__Group_4_1__0 ) ) );
    public final void rule__Property__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1837:1: ( ( RULE_XML_TAG_SINGLEEND ) | ( ( rule__Property__Group_4_1__0 ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_XML_TAG_SINGLEEND) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_GT) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1838:1: ( RULE_XML_TAG_SINGLEEND )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1838:1: ( RULE_XML_TAG_SINGLEEND )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1839:1: RULE_XML_TAG_SINGLEEND
                    {
                     before(grammarAccess.getPropertyAccess().getXML_TAG_SINGLEENDTerminalRuleCall_4_0()); 
                    match(input,RULE_XML_TAG_SINGLEEND,FOLLOW_RULE_XML_TAG_SINGLEEND_in_rule__Property__Alternatives_44094); 
                     after(grammarAccess.getPropertyAccess().getXML_TAG_SINGLEENDTerminalRuleCall_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1844:6: ( ( rule__Property__Group_4_1__0 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1844:6: ( ( rule__Property__Group_4_1__0 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1845:1: ( rule__Property__Group_4_1__0 )
                    {
                     before(grammarAccess.getPropertyAccess().getGroup_4_1()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1846:1: ( rule__Property__Group_4_1__0 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1846:2: rule__Property__Group_4_1__0
                    {
                    pushFollow(FOLLOW_rule__Property__Group_4_1__0_in_rule__Property__Alternatives_44111);
                    rule__Property__Group_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyAccess().getGroup_4_1()); 

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
    // $ANTLR end "rule__Property__Alternatives_4"


    // $ANTLR start "rule__Property__Alternatives_4_1_1"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1855:1: rule__Property__Alternatives_4_1_1 : ( ( ( rule__Property__ChildrenAssignment_4_1_1_0 ) ) | ( ( rule__Property__ChildrenAssignment_4_1_1_1 ) ) );
    public final void rule__Property__Alternatives_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1859:1: ( ( ( rule__Property__ChildrenAssignment_4_1_1_0 ) ) | ( ( rule__Property__ChildrenAssignment_4_1_1_1 ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_LT) ) {
                int LA19_1 = input.LA(2);

                if ( ((LA19_1>=RULE_EXPRESSION_TAG && LA19_1<=RULE_OPTIONTAG)) ) {
                    alt19=1;
                }
                else if ( (LA19_1==RULE_MAPTAG) ) {
                    alt19=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1860:1: ( ( rule__Property__ChildrenAssignment_4_1_1_0 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1860:1: ( ( rule__Property__ChildrenAssignment_4_1_1_0 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1861:1: ( rule__Property__ChildrenAssignment_4_1_1_0 )
                    {
                     before(grammarAccess.getPropertyAccess().getChildrenAssignment_4_1_1_0()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1862:1: ( rule__Property__ChildrenAssignment_4_1_1_0 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1862:2: rule__Property__ChildrenAssignment_4_1_1_0
                    {
                    pushFollow(FOLLOW_rule__Property__ChildrenAssignment_4_1_1_0_in_rule__Property__Alternatives_4_1_14144);
                    rule__Property__ChildrenAssignment_4_1_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyAccess().getChildrenAssignment_4_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1866:6: ( ( rule__Property__ChildrenAssignment_4_1_1_1 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1866:6: ( ( rule__Property__ChildrenAssignment_4_1_1_1 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1867:1: ( rule__Property__ChildrenAssignment_4_1_1_1 )
                    {
                     before(grammarAccess.getPropertyAccess().getChildrenAssignment_4_1_1_1()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1868:1: ( rule__Property__ChildrenAssignment_4_1_1_1 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1868:2: rule__Property__ChildrenAssignment_4_1_1_1
                    {
                    pushFollow(FOLLOW_rule__Property__ChildrenAssignment_4_1_1_1_in_rule__Property__Alternatives_4_1_14162);
                    rule__Property__ChildrenAssignment_4_1_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPropertyAccess().getChildrenAssignment_4_1_1_1()); 

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
    // $ANTLR end "rule__Property__Alternatives_4_1_1"


    // $ANTLR start "rule__Param__Alternatives_4"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1877:1: rule__Param__Alternatives_4 : ( ( RULE_XML_TAG_SINGLEEND ) | ( ( rule__Param__Group_4_1__0 ) ) );
    public final void rule__Param__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1881:1: ( ( RULE_XML_TAG_SINGLEEND ) | ( ( rule__Param__Group_4_1__0 ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_XML_TAG_SINGLEEND) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_GT) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1882:1: ( RULE_XML_TAG_SINGLEEND )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1882:1: ( RULE_XML_TAG_SINGLEEND )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1883:1: RULE_XML_TAG_SINGLEEND
                    {
                     before(grammarAccess.getParamAccess().getXML_TAG_SINGLEENDTerminalRuleCall_4_0()); 
                    match(input,RULE_XML_TAG_SINGLEEND,FOLLOW_RULE_XML_TAG_SINGLEEND_in_rule__Param__Alternatives_44195); 
                     after(grammarAccess.getParamAccess().getXML_TAG_SINGLEENDTerminalRuleCall_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1888:6: ( ( rule__Param__Group_4_1__0 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1888:6: ( ( rule__Param__Group_4_1__0 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1889:1: ( rule__Param__Group_4_1__0 )
                    {
                     before(grammarAccess.getParamAccess().getGroup_4_1()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1890:1: ( rule__Param__Group_4_1__0 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1890:2: rule__Param__Group_4_1__0
                    {
                    pushFollow(FOLLOW_rule__Param__Group_4_1__0_in_rule__Param__Alternatives_44212);
                    rule__Param__Group_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParamAccess().getGroup_4_1()); 

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
    // $ANTLR end "rule__Param__Alternatives_4"


    // $ANTLR start "rule__Param__Alternatives_4_1_1"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1899:1: rule__Param__Alternatives_4_1_1 : ( ( ( rule__Param__ChildrenAssignment_4_1_1_0 ) ) | ( ( rule__Param__ChildrenAssignment_4_1_1_1 ) ) );
    public final void rule__Param__Alternatives_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1903:1: ( ( ( rule__Param__ChildrenAssignment_4_1_1_0 ) ) | ( ( rule__Param__ChildrenAssignment_4_1_1_1 ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_LT) ) {
                int LA21_1 = input.LA(2);

                if ( ((LA21_1>=RULE_EXPRESSION_TAG && LA21_1<=RULE_OPTIONTAG)) ) {
                    alt21=1;
                }
                else if ( (LA21_1==RULE_MAPTAG) ) {
                    alt21=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1904:1: ( ( rule__Param__ChildrenAssignment_4_1_1_0 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1904:1: ( ( rule__Param__ChildrenAssignment_4_1_1_0 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1905:1: ( rule__Param__ChildrenAssignment_4_1_1_0 )
                    {
                     before(grammarAccess.getParamAccess().getChildrenAssignment_4_1_1_0()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1906:1: ( rule__Param__ChildrenAssignment_4_1_1_0 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1906:2: rule__Param__ChildrenAssignment_4_1_1_0
                    {
                    pushFollow(FOLLOW_rule__Param__ChildrenAssignment_4_1_1_0_in_rule__Param__Alternatives_4_1_14245);
                    rule__Param__ChildrenAssignment_4_1_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParamAccess().getChildrenAssignment_4_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1910:6: ( ( rule__Param__ChildrenAssignment_4_1_1_1 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1910:6: ( ( rule__Param__ChildrenAssignment_4_1_1_1 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1911:1: ( rule__Param__ChildrenAssignment_4_1_1_1 )
                    {
                     before(grammarAccess.getParamAccess().getChildrenAssignment_4_1_1_1()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1912:1: ( rule__Param__ChildrenAssignment_4_1_1_1 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1912:2: rule__Param__ChildrenAssignment_4_1_1_1
                    {
                    pushFollow(FOLLOW_rule__Param__ChildrenAssignment_4_1_1_1_in_rule__Param__Alternatives_4_1_14263);
                    rule__Param__ChildrenAssignment_4_1_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getParamAccess().getChildrenAssignment_4_1_1_1()); 

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
    // $ANTLR end "rule__Param__Alternatives_4_1_1"


    // $ANTLR start "rule__MapMethod__Alternatives_5"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1921:1: rule__MapMethod__Alternatives_5 : ( ( RULE_XML_TAG_SINGLEEND ) | ( ( rule__MapMethod__Group_5_1__0 ) ) );
    public final void rule__MapMethod__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1925:1: ( ( RULE_XML_TAG_SINGLEEND ) | ( ( rule__MapMethod__Group_5_1__0 ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_XML_TAG_SINGLEEND) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_GT) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1926:1: ( RULE_XML_TAG_SINGLEEND )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1926:1: ( RULE_XML_TAG_SINGLEEND )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1927:1: RULE_XML_TAG_SINGLEEND
                    {
                     before(grammarAccess.getMapMethodAccess().getXML_TAG_SINGLEENDTerminalRuleCall_5_0()); 
                    match(input,RULE_XML_TAG_SINGLEEND,FOLLOW_RULE_XML_TAG_SINGLEEND_in_rule__MapMethod__Alternatives_54296); 
                     after(grammarAccess.getMapMethodAccess().getXML_TAG_SINGLEENDTerminalRuleCall_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1932:6: ( ( rule__MapMethod__Group_5_1__0 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1932:6: ( ( rule__MapMethod__Group_5_1__0 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1933:1: ( rule__MapMethod__Group_5_1__0 )
                    {
                     before(grammarAccess.getMapMethodAccess().getGroup_5_1()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1934:1: ( rule__MapMethod__Group_5_1__0 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1934:2: rule__MapMethod__Group_5_1__0
                    {
                    pushFollow(FOLLOW_rule__MapMethod__Group_5_1__0_in_rule__MapMethod__Alternatives_54313);
                    rule__MapMethod__Group_5_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapMethodAccess().getGroup_5_1()); 

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
    // $ANTLR end "rule__MapMethod__Alternatives_5"


    // $ANTLR start "rule__MapMethod__Alternatives_5_1_1"
    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1943:1: rule__MapMethod__Alternatives_5_1_1 : ( ( ( rule__MapMethod__ChildrenAssignment_5_1_1_0 ) ) | ( ( rule__MapMethod__ChildrenAssignment_5_1_1_1 ) ) | ( ( rule__MapMethod__ChildrenAssignment_5_1_1_2 ) ) | ( ( rule__MapMethod__ChildrenAssignment_5_1_1_3 ) ) | ( ( rule__MapMethod__ChildrenAssignment_5_1_1_4 ) ) | ( ( rule__MapMethod__ChildrenAssignment_5_1_1_5 ) ) | ( ( rule__MapMethod__ChildrenAssignment_5_1_1_6 ) ) | ( ( rule__MapMethod__ChildrenAssignment_5_1_1_7 ) ) | ( ( rule__MapMethod__ChildrenAssignment_5_1_1_8 ) ) | ( ( rule__MapMethod__ChildrenAssignment_5_1_1_9 ) ) );
    public final void rule__MapMethod__Alternatives_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1947:1: ( ( ( rule__MapMethod__ChildrenAssignment_5_1_1_0 ) ) | ( ( rule__MapMethod__ChildrenAssignment_5_1_1_1 ) ) | ( ( rule__MapMethod__ChildrenAssignment_5_1_1_2 ) ) | ( ( rule__MapMethod__ChildrenAssignment_5_1_1_3 ) ) | ( ( rule__MapMethod__ChildrenAssignment_5_1_1_4 ) ) | ( ( rule__MapMethod__ChildrenAssignment_5_1_1_5 ) ) | ( ( rule__MapMethod__ChildrenAssignment_5_1_1_6 ) ) | ( ( rule__MapMethod__ChildrenAssignment_5_1_1_7 ) ) | ( ( rule__MapMethod__ChildrenAssignment_5_1_1_8 ) ) | ( ( rule__MapMethod__ChildrenAssignment_5_1_1_9 ) ) )
            int alt23=10;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1948:1: ( ( rule__MapMethod__ChildrenAssignment_5_1_1_0 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1948:1: ( ( rule__MapMethod__ChildrenAssignment_5_1_1_0 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1949:1: ( rule__MapMethod__ChildrenAssignment_5_1_1_0 )
                    {
                     before(grammarAccess.getMapMethodAccess().getChildrenAssignment_5_1_1_0()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1950:1: ( rule__MapMethod__ChildrenAssignment_5_1_1_0 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1950:2: rule__MapMethod__ChildrenAssignment_5_1_1_0
                    {
                    pushFollow(FOLLOW_rule__MapMethod__ChildrenAssignment_5_1_1_0_in_rule__MapMethod__Alternatives_5_1_14346);
                    rule__MapMethod__ChildrenAssignment_5_1_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapMethodAccess().getChildrenAssignment_5_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1954:6: ( ( rule__MapMethod__ChildrenAssignment_5_1_1_1 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1954:6: ( ( rule__MapMethod__ChildrenAssignment_5_1_1_1 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1955:1: ( rule__MapMethod__ChildrenAssignment_5_1_1_1 )
                    {
                     before(grammarAccess.getMapMethodAccess().getChildrenAssignment_5_1_1_1()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1956:1: ( rule__MapMethod__ChildrenAssignment_5_1_1_1 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1956:2: rule__MapMethod__ChildrenAssignment_5_1_1_1
                    {
                    pushFollow(FOLLOW_rule__MapMethod__ChildrenAssignment_5_1_1_1_in_rule__MapMethod__Alternatives_5_1_14364);
                    rule__MapMethod__ChildrenAssignment_5_1_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapMethodAccess().getChildrenAssignment_5_1_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1960:6: ( ( rule__MapMethod__ChildrenAssignment_5_1_1_2 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1960:6: ( ( rule__MapMethod__ChildrenAssignment_5_1_1_2 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1961:1: ( rule__MapMethod__ChildrenAssignment_5_1_1_2 )
                    {
                     before(grammarAccess.getMapMethodAccess().getChildrenAssignment_5_1_1_2()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1962:1: ( rule__MapMethod__ChildrenAssignment_5_1_1_2 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1962:2: rule__MapMethod__ChildrenAssignment_5_1_1_2
                    {
                    pushFollow(FOLLOW_rule__MapMethod__ChildrenAssignment_5_1_1_2_in_rule__MapMethod__Alternatives_5_1_14382);
                    rule__MapMethod__ChildrenAssignment_5_1_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapMethodAccess().getChildrenAssignment_5_1_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1966:6: ( ( rule__MapMethod__ChildrenAssignment_5_1_1_3 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1966:6: ( ( rule__MapMethod__ChildrenAssignment_5_1_1_3 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1967:1: ( rule__MapMethod__ChildrenAssignment_5_1_1_3 )
                    {
                     before(grammarAccess.getMapMethodAccess().getChildrenAssignment_5_1_1_3()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1968:1: ( rule__MapMethod__ChildrenAssignment_5_1_1_3 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1968:2: rule__MapMethod__ChildrenAssignment_5_1_1_3
                    {
                    pushFollow(FOLLOW_rule__MapMethod__ChildrenAssignment_5_1_1_3_in_rule__MapMethod__Alternatives_5_1_14400);
                    rule__MapMethod__ChildrenAssignment_5_1_1_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapMethodAccess().getChildrenAssignment_5_1_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1972:6: ( ( rule__MapMethod__ChildrenAssignment_5_1_1_4 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1972:6: ( ( rule__MapMethod__ChildrenAssignment_5_1_1_4 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1973:1: ( rule__MapMethod__ChildrenAssignment_5_1_1_4 )
                    {
                     before(grammarAccess.getMapMethodAccess().getChildrenAssignment_5_1_1_4()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1974:1: ( rule__MapMethod__ChildrenAssignment_5_1_1_4 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1974:2: rule__MapMethod__ChildrenAssignment_5_1_1_4
                    {
                    pushFollow(FOLLOW_rule__MapMethod__ChildrenAssignment_5_1_1_4_in_rule__MapMethod__Alternatives_5_1_14418);
                    rule__MapMethod__ChildrenAssignment_5_1_1_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getMapMethodAccess().getChildrenAssignment_5_1_1_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1978:6: ( ( rule__MapMethod__ChildrenAssignment_5_1_1_5 ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1978:6: ( ( rule__MapMethod__ChildrenAssignment_5_1_1_5 ) )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1979:1: ( rule__MapMethod__ChildrenAssignment_5_1_1_5 )
                    {
                     before(grammarAccess.getMapMethodAccess().getChildrenAssignment_5_1_1_5()); 
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/InternalTsl.g:1980:1: ( rule__MapMethod__ChildrenAssignment_5_1_1_5 )
                    // ../com.dexels.navajo.dsl.tsl.ui/src-gen/com/dexels/navajo/dsl/tsl/ui/contentassist/antlr/internal/Intern