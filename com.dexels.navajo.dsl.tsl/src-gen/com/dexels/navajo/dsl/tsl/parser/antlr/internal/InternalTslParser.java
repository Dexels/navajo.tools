package com.dexels.navajo.dsl.tsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.dexels.navajo.dsl.tsl.services.TslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_XMLHEAD", "RULE_NAVASCRIPT_START", "RULE_XML_TAG_END", "RULE_NAVASCRIPT_END", "RULE_XML_TAG_SINGLEEND", "RULE_ID", "RULE_DOT", "RULE_PARENT", "RULE_DOLLAR", "RULE_TML_SEPARATOR", "RULE_NUMBER", "RULE_SQBRACKET_OPEN", "RULE_SQBRACKET_CLOSE", "RULE_AT", "RULE_COLON", "RULE_TML_EXISTS", "RULE_QUOTE", "RULE_METHODS_START_TAG", "RULE_METHODS_END_TAG", "RULE_METHOD_START_TAG", "RULE_METHOD_END_TAG", "RULE_VALIDATIONS_START_TAG", "RULE_VALIDATIONS_END_TAG", "RULE_CHECK_START_TAG", "RULE_CHECK_END_TAG", "RULE_COMMENT_START_TAG", "RULE_COMMENT_END_TAG", "RULE_BREAK_START_TAG", "RULE_BREAK_END_TAG", "RULE_INCLUDE_START_TAG", "RULE_INCLUDE_END_TAG", "RULE_MESSAGE_START_TAG", "RULE_MESSAGE_END_TAG", "RULE_MAPSTARTKEYWORD", "RULE_MAPENDKEYWORD", "RULE_REQUIRED_START_TAG", "RULE_REQUIRED_END_TAG", "RULE_PROPERTY_START_TAG", "RULE_PROPERTY_END_TAG", "RULE_PARAM_START_TAG", "RULE_PARAM_END_TAG", "RULE_MAP_METHOD_STARTTAG_START", "RULE_MAP_METHOD_ENDTAG_START", "RULE_FIELD_START_TAG", "RULE_FIELD_END_TAG", "RULE_DEBUG_START_TAG", "RULE_DEBUG_END_TAG", "RULE_EXPRESSION_START_TAG", "RULE_OPTION_START_TAG", "RULE_EXPRESSION_END_TAG", "RULE_OPTION_END_TAG", "RULE_XML_LT", "RULE_XML_GT", "RULE_XML_LTEQ", "RULE_XML_GTEQ", "RULE_LITERALSTRING", "RULE_FORALL", "RULE_NULL", "RULE_TODAY", "RULE_TRUE", "RULE_FALSE", "RULE_XMLCOMMENT", "RULE_XML_START_ENDTAG", "RULE_WS", "','", "'('", "')'", "'='", "'script'", "'count'", "'mode'", "'name'", "'type'", "'condition'", "'ref'", "'object'", "'filter'", "'length'", "'cardinality'", "'direction'", "'subtypes'", "'comment'", "'value'", "'xml:space'", "'preserve'", "'OR'", "'AND'", "'=='", "'!='", "'+'", "'-'", "'*'", "'!'", "'#'", "'{'", "'}'"
    };
    public static final int RULE_OPTION_END_TAG=54;
    public static final int RULE_ID=9;
    public static final int RULE_COMMENT_END_TAG=30;
    public static final int RULE_PARENT=11;
    public static final int RULE_EXPRESSION_END_TAG=53;
    public static final int RULE_XMLHEAD=4;
    public static final int RULE_REQUIRED_START_TAG=39;
    public static final int RULE_METHODS_END_TAG=22;
    public static final int EOF=-1;
    public static final int RULE_BREAK_END_TAG=32;
    public static final int T__93=93;
    public static final int RULE_FORALL=60;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int RULE_OPTION_START_TAG=52;
    public static final int RULE_FIELD_START_TAG=47;
    public static final int RULE_XML_LTEQ=57;
    public static final int RULE_METHOD_END_TAG=24;
    public static final int RULE_INCLUDE_START_TAG=33;
    public static final int RULE_REQUIRED_END_TAG=40;
    public static final int RULE_MAPENDKEYWORD=38;
    public static final int RULE_FIELD_END_TAG=48;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int RULE_PROPERTY_START_TAG=41;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_MESSAGE_END_TAG=36;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_TML_EXISTS=19;
    public static final int T__71=71;
    public static final int RULE_VALIDATIONS_START_TAG=25;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int RULE_BREAK_START_TAG=31;
    public static final int RULE_NAVASCRIPT_START=5;
    public static final int RULE_SQBRACKET_CLOSE=16;
    public static final int RULE_DEBUG_END_TAG=50;
    public static final int RULE_MAPSTARTKEYWORD=37;
    public static final int RULE_VALIDATIONS_END_TAG=26;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int RULE_XML_GT=56;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int RULE_PARAM_END_TAG=44;
    public static final int T__78=78;
    public static final int RULE_AT=17;
    public static final int RULE_PARAM_START_TAG=43;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int RULE_NAVASCRIPT_END=7;
    public static final int T__69=69;
    public static final int RULE_CHECK_START_TAG=27;
    public static final int RULE_XMLCOMMENT=65;
    public static final int RULE_QUOTE=20;
    public static final int RULE_SQBRACKET_OPEN=15;
    public static final int RULE_COMMENT_START_TAG=29;
    public static final int RULE_LITERALSTRING=59;
    public static final int RULE_FALSE=64;
    public static final int RULE_DOT=10;
    public static final int RULE_NUMBER=14;
    public static final int RULE_TODAY=62;
    public static final int RULE_METHOD_START_TAG=23;
    public static final int RULE_CHECK_END_TAG=28;
    public static final int RULE_INCLUDE_END_TAG=34;
    public static final int RULE_DEBUG_START_TAG=49;
    public static final int RULE_XML_TAG_SINGLEEND=8;
    public static final int RULE_XML_TAG_END=6;
    public static final int RULE_MESSAGE_START_TAG=35;
    public static final int RULE_XML_LT=55;
    public static final int RULE_MAP_METHOD_STARTTAG_START=45;
    public static final int RULE_XML_GTEQ=58;
    public static final int RULE_TML_SEPARATOR=13;
    public static final int RULE_NULL=61;
    public static final int RULE_TRUE=63;
    public static final int RULE_PROPERTY_END_TAG=42;
    public static final int RULE_DOLLAR=12;
    public static final int RULE_EXPRESSION_START_TAG=51;
    public static final int RULE_COLON=18;
    public static final int RULE_METHODS_START_TAG=21;
    public static final int RULE_XML_START_ENDTAG=66;
    public static final int RULE_WS=67;
    public static final int RULE_MAP_METHOD_ENDTAG_START=46;

    // delegates
    // delegators


        public InternalTslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTslParser.tokenNames; }
    public String getGrammarFileName() { return "../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g"; }



     	private TslGrammarAccess grammarAccess;
     	
        public InternalTslParser(TokenStream input, TslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Tml";	
       	}
       	
       	@Override
       	protected TslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleTml"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:67:1: entryRuleTml returns [EObject current=null] : iv_ruleTml= ruleTml EOF ;
    public final EObject entryRuleTml() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTml = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:68:2: (iv_ruleTml= ruleTml EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:69:2: iv_ruleTml= ruleTml EOF
            {
             newCompositeNode(grammarAccess.getTmlRule()); 
            pushFollow(FOLLOW_ruleTml_in_entryRuleTml75);
            iv_ruleTml=ruleTml();

            state._fsp--;

             current =iv_ruleTml; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTml85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTml"


    // $ANTLR start "ruleTml"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:76:1: ruleTml returns [EObject current=null] : ( () (this_XMLHEAD_1= RULE_XMLHEAD )? this_NAVASCRIPT_START_2= RULE_NAVASCRIPT_START ( (lv_attributes_3_0= ruleNonExpression ) )* ( (this_XML_TAG_END_4= RULE_XML_TAG_END ( ( (lv_children_5_0= ruleMessage ) ) | ( (lv_children_6_0= ruleMap ) ) | ( (lv_children_7_0= ruleParam ) ) | ( (lv_methods_8_0= ruleMethods ) ) | ( (lv_children_9_0= ruleDebugTag ) ) | ( (lv_children_10_0= ruleInclude ) ) | ( (lv_children_11_0= ruleValidations ) ) | ( (lv_children_12_0= ruleComment ) ) )* this_NAVASCRIPT_END_13= RULE_NAVASCRIPT_END ) | this_XML_TAG_SINGLEEND_14= RULE_XML_TAG_SINGLEEND ) ) ;
    public final EObject ruleTml() throws RecognitionException {
        EObject current = null;

        Token this_XMLHEAD_1=null;
        Token this_NAVASCRIPT_START_2=null;
        Token this_XML_TAG_END_4=null;
        Token this_NAVASCRIPT_END_13=null;
        Token this_XML_TAG_SINGLEEND_14=null;
        EObject lv_attributes_3_0 = null;

        EObject lv_children_5_0 = null;

        EObject lv_children_6_0 = null;

        EObject lv_children_7_0 = null;

        EObject lv_methods_8_0 = null;

        EObject lv_children_9_0 = null;

        EObject lv_children_10_0 = null;

        EObject lv_children_11_0 = null;

        EObject lv_children_12_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:79:28: ( ( () (this_XMLHEAD_1= RULE_XMLHEAD )? this_NAVASCRIPT_START_2= RULE_NAVASCRIPT_START ( (lv_attributes_3_0= ruleNonExpression ) )* ( (this_XML_TAG_END_4= RULE_XML_TAG_END ( ( (lv_children_5_0= ruleMessage ) ) | ( (lv_children_6_0= ruleMap ) ) | ( (lv_children_7_0= ruleParam ) ) | ( (lv_methods_8_0= ruleMethods ) ) | ( (lv_children_9_0= ruleDebugTag ) ) | ( (lv_children_10_0= ruleInclude ) ) | ( (lv_children_11_0= ruleValidations ) ) | ( (lv_children_12_0= ruleComment ) ) )* this_NAVASCRIPT_END_13= RULE_NAVASCRIPT_END ) | this_XML_TAG_SINGLEEND_14= RULE_XML_TAG_SINGLEEND ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:80:1: ( () (this_XMLHEAD_1= RULE_XMLHEAD )? this_NAVASCRIPT_START_2= RULE_NAVASCRIPT_START ( (lv_attributes_3_0= ruleNonExpression ) )* ( (this_XML_TAG_END_4= RULE_XML_TAG_END ( ( (lv_children_5_0= ruleMessage ) ) | ( (lv_children_6_0= ruleMap ) ) | ( (lv_children_7_0= ruleParam ) ) | ( (lv_methods_8_0= ruleMethods ) ) | ( (lv_children_9_0= ruleDebugTag ) ) | ( (lv_children_10_0= ruleInclude ) ) | ( (lv_children_11_0= ruleValidations ) ) | ( (lv_children_12_0= ruleComment ) ) )* this_NAVASCRIPT_END_13= RULE_NAVASCRIPT_END ) | this_XML_TAG_SINGLEEND_14= RULE_XML_TAG_SINGLEEND ) )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:80:1: ( () (this_XMLHEAD_1= RULE_XMLHEAD )? this_NAVASCRIPT_START_2= RULE_NAVASCRIPT_START ( (lv_attributes_3_0= ruleNonExpression ) )* ( (this_XML_TAG_END_4= RULE_XML_TAG_END ( ( (lv_children_5_0= ruleMessage ) ) | ( (lv_children_6_0= ruleMap ) ) | ( (lv_children_7_0= ruleParam ) ) | ( (lv_methods_8_0= ruleMethods ) ) | ( (lv_children_9_0= ruleDebugTag ) ) | ( (lv_children_10_0= ruleInclude ) ) | ( (lv_children_11_0= ruleValidations ) ) | ( (lv_children_12_0= ruleComment ) ) )* this_NAVASCRIPT_END_13= RULE_NAVASCRIPT_END ) | this_XML_TAG_SINGLEEND_14= RULE_XML_TAG_SINGLEEND ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:80:2: () (this_XMLHEAD_1= RULE_XMLHEAD )? this_NAVASCRIPT_START_2= RULE_NAVASCRIPT_START ( (lv_attributes_3_0= ruleNonExpression ) )* ( (this_XML_TAG_END_4= RULE_XML_TAG_END ( ( (lv_children_5_0= ruleMessage ) ) | ( (lv_children_6_0= ruleMap ) ) | ( (lv_children_7_0= ruleParam ) ) | ( (lv_methods_8_0= ruleMethods ) ) | ( (lv_children_9_0= ruleDebugTag ) ) | ( (lv_children_10_0= ruleInclude ) ) | ( (lv_children_11_0= ruleValidations ) ) | ( (lv_children_12_0= ruleComment ) ) )* this_NAVASCRIPT_END_13= RULE_NAVASCRIPT_END ) | this_XML_TAG_SINGLEEND_14= RULE_XML_TAG_SINGLEEND )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:80:2: ()
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTmlAccess().getTmlAction_0(),
                        current);
                

            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:86:2: (this_XMLHEAD_1= RULE_XMLHEAD )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_XMLHEAD) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:86:3: this_XMLHEAD_1= RULE_XMLHEAD
                    {
                    this_XMLHEAD_1=(Token)match(input,RULE_XMLHEAD,FOLLOW_RULE_XMLHEAD_in_ruleTml131); 
                     
                        newLeafNode(this_XMLHEAD_1, grammarAccess.getTmlAccess().getXMLHEADTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            this_NAVASCRIPT_START_2=(Token)match(input,RULE_NAVASCRIPT_START,FOLLOW_RULE_NAVASCRIPT_START_in_ruleTml143); 
             
                newLeafNode(this_NAVASCRIPT_START_2, grammarAccess.getTmlAccess().getNAVASCRIPT_STARTTerminalRuleCall_2()); 
                
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:94:1: ( (lv_attributes_3_0= ruleNonExpression ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:95:1: (lv_attributes_3_0= ruleNonExpression )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:95:1: (lv_attributes_3_0= ruleNonExpression )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:96:3: lv_attributes_3_0= ruleNonExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTmlAccess().getAttributesNonExpressionParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNonExpression_in_ruleTml163);
            	    lv_attributes_3_0=ruleNonExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTmlRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_3_0, 
            	            		"NonExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:112:3: ( (this_XML_TAG_END_4= RULE_XML_TAG_END ( ( (lv_children_5_0= ruleMessage ) ) | ( (lv_children_6_0= ruleMap ) ) | ( (lv_children_7_0= ruleParam ) ) | ( (lv_methods_8_0= ruleMethods ) ) | ( (lv_children_9_0= ruleDebugTag ) ) | ( (lv_children_10_0= ruleInclude ) ) | ( (lv_children_11_0= ruleValidations ) ) | ( (lv_children_12_0= ruleComment ) ) )* this_NAVASCRIPT_END_13= RULE_NAVASCRIPT_END ) | this_XML_TAG_SINGLEEND_14= RULE_XML_TAG_SINGLEEND )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_XML_TAG_END) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_XML_TAG_SINGLEEND) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:112:4: (this_XML_TAG_END_4= RULE_XML_TAG_END ( ( (lv_children_5_0= ruleMessage ) ) | ( (lv_children_6_0= ruleMap ) ) | ( (lv_children_7_0= ruleParam ) ) | ( (lv_methods_8_0= ruleMethods ) ) | ( (lv_children_9_0= ruleDebugTag ) ) | ( (lv_children_10_0= ruleInclude ) ) | ( (lv_children_11_0= ruleValidations ) ) | ( (lv_children_12_0= ruleComment ) ) )* this_NAVASCRIPT_END_13= RULE_NAVASCRIPT_END )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:112:4: (this_XML_TAG_END_4= RULE_XML_TAG_END ( ( (lv_children_5_0= ruleMessage ) ) | ( (lv_children_6_0= ruleMap ) ) | ( (lv_children_7_0= ruleParam ) ) | ( (lv_methods_8_0= ruleMethods ) ) | ( (lv_children_9_0= ruleDebugTag ) ) | ( (lv_children_10_0= ruleInclude ) ) | ( (lv_children_11_0= ruleValidations ) ) | ( (lv_children_12_0= ruleComment ) ) )* this_NAVASCRIPT_END_13= RULE_NAVASCRIPT_END )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:112:5: this_XML_TAG_END_4= RULE_XML_TAG_END ( ( (lv_children_5_0= ruleMessage ) ) | ( (lv_children_6_0= ruleMap ) ) | ( (lv_children_7_0= ruleParam ) ) | ( (lv_methods_8_0= ruleMethods ) ) | ( (lv_children_9_0= ruleDebugTag ) ) | ( (lv_children_10_0= ruleInclude ) ) | ( (lv_children_11_0= ruleValidations ) ) | ( (lv_children_12_0= ruleComment ) ) )* this_NAVASCRIPT_END_13= RULE_NAVASCRIPT_END
                    {
                    this_XML_TAG_END_4=(Token)match(input,RULE_XML_TAG_END,FOLLOW_RULE_XML_TAG_END_in_ruleTml177); 
                     
                        newLeafNode(this_XML_TAG_END_4, grammarAccess.getTmlAccess().getXML_TAG_ENDTerminalRuleCall_4_0_0()); 
                        
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:116:1: ( ( (lv_children_5_0= ruleMessage ) ) | ( (lv_children_6_0= ruleMap ) ) | ( (lv_children_7_0= ruleParam ) ) | ( (lv_methods_8_0= ruleMethods ) ) | ( (lv_children_9_0= ruleDebugTag ) ) | ( (lv_children_10_0= ruleInclude ) ) | ( (lv_children_11_0= ruleValidations ) ) | ( (lv_children_12_0= ruleComment ) ) )*
                    loop3:
                    do {
                        int alt3=9;
                        switch ( input.LA(1) ) {
                        case RULE_MESSAGE_START_TAG:
                            {
                            alt3=1;
                            }
                            break;
                        case RULE_MAPSTARTKEYWORD:
                            {
                            alt3=2;
                            }
                            break;
                        case RULE_PARAM_START_TAG:
                            {
                            alt3=3;
                            }
                            break;
                        case RULE_METHODS_START_TAG:
                            {
                            alt3=4;
                            }
                            break;
                        case RULE_DEBUG_START_TAG:
                            {
                            alt3=5;
                            }
                            break;
                        case RULE_INCLUDE_START_TAG:
                            {
                            alt3=6;
                            }
                            break;
                        case RULE_VALIDATIONS_START_TAG:
                            {
                            alt3=7;
                            }
                            break;
                        case RULE_COMMENT_START_TAG:
                            {
                            alt3=8;
                            }
                            break;

                        }

                        switch (alt3) {
                    	case 1 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:116:2: ( (lv_children_5_0= ruleMessage ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:116:2: ( (lv_children_5_0= ruleMessage ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:117:1: (lv_children_5_0= ruleMessage )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:117:1: (lv_children_5_0= ruleMessage )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:118:3: lv_children_5_0= ruleMessage
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTmlAccess().getChildrenMessageParserRuleCall_4_0_1_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMessage_in_ruleTml198);
                    	    lv_children_5_0=ruleMessage();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTmlRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_5_0, 
                    	            		"Message");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:135:6: ( (lv_children_6_0= ruleMap ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:135:6: ( (lv_children_6_0= ruleMap ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:136:1: (lv_children_6_0= ruleMap )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:136:1: (lv_children_6_0= ruleMap )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:137:3: lv_children_6_0= ruleMap
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTmlAccess().getChildrenMapParserRuleCall_4_0_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMap_in_ruleTml225);
                    	    lv_children_6_0=ruleMap();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTmlRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_6_0, 
                    	            		"Map");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:154:6: ( (lv_children_7_0= ruleParam ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:154:6: ( (lv_children_7_0= ruleParam ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:155:1: (lv_children_7_0= ruleParam )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:155:1: (lv_children_7_0= ruleParam )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:156:3: lv_children_7_0= ruleParam
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTmlAccess().getChildrenParamParserRuleCall_4_0_1_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParam_in_ruleTml252);
                    	    lv_children_7_0=ruleParam();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTmlRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_7_0, 
                    	            		"Param");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:173:6: ( (lv_methods_8_0= ruleMethods ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:173:6: ( (lv_methods_8_0= ruleMethods ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:174:1: (lv_methods_8_0= ruleMethods )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:174:1: (lv_methods_8_0= ruleMethods )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:175:3: lv_methods_8_0= ruleMethods
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTmlAccess().getMethodsMethodsParserRuleCall_4_0_1_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMethods_in_ruleTml279);
                    	    lv_methods_8_0=ruleMethods();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTmlRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"methods",
                    	            		lv_methods_8_0, 
                    	            		"Methods");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:192:6: ( (lv_children_9_0= ruleDebugTag ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:192:6: ( (lv_children_9_0= ruleDebugTag ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:193:1: (lv_children_9_0= ruleDebugTag )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:193:1: (lv_children_9_0= ruleDebugTag )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:194:3: lv_children_9_0= ruleDebugTag
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTmlAccess().getChildrenDebugTagParserRuleCall_4_0_1_4_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDebugTag_in_ruleTml306);
                    	    lv_children_9_0=ruleDebugTag();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTmlRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_9_0, 
                    	            		"DebugTag");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:211:6: ( (lv_children_10_0= ruleInclude ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:211:6: ( (lv_children_10_0= ruleInclude ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:212:1: (lv_children_10_0= ruleInclude )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:212:1: (lv_children_10_0= ruleInclude )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:213:3: lv_children_10_0= ruleInclude
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTmlAccess().getChildrenIncludeParserRuleCall_4_0_1_5_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleInclude_in_ruleTml333);
                    	    lv_children_10_0=ruleInclude();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTmlRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_10_0, 
                    	            		"Include");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 7 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:230:6: ( (lv_children_11_0= ruleValidations ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:230:6: ( (lv_children_11_0= ruleValidations ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:231:1: (lv_children_11_0= ruleValidations )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:231:1: (lv_children_11_0= ruleValidations )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:232:3: lv_children_11_0= ruleValidations
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTmlAccess().getChildrenValidationsParserRuleCall_4_0_1_6_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleValidations_in_ruleTml360);
                    	    lv_children_11_0=ruleValidations();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTmlRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_11_0, 
                    	            		"Validations");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 8 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:249:6: ( (lv_children_12_0= ruleComment ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:249:6: ( (lv_children_12_0= ruleComment ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:250:1: (lv_children_12_0= ruleComment )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:250:1: (lv_children_12_0= ruleComment )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:251:3: lv_children_12_0= ruleComment
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTmlAccess().getChildrenCommentParserRuleCall_4_0_1_7_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleComment_in_ruleTml387);
                    	    lv_children_12_0=ruleComment();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTmlRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_12_0, 
                    	            		"Comment");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    this_NAVASCRIPT_END_13=(Token)match(input,RULE_NAVASCRIPT_END,FOLLOW_RULE_NAVASCRIPT_END_in_ruleTml400); 
                     
                        newLeafNode(this_NAVASCRIPT_END_13, grammarAccess.getTmlAccess().getNAVASCRIPT_ENDTerminalRuleCall_4_0_2()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:272:6: this_XML_TAG_SINGLEEND_14= RULE_XML_TAG_SINGLEEND
                    {
                    this_XML_TAG_SINGLEEND_14=(Token)match(input,RULE_XML_TAG_SINGLEEND,FOLLOW_RULE_XML_TAG_SINGLEEND_in_ruleTml417); 
                     
                        newLeafNode(this_XML_TAG_SINGLEEND_14, grammarAccess.getTmlAccess().getXML_TAG_SINGLEENDTerminalRuleCall_4_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTml"


    // $ANTLR start "entryRuleGarbage"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:284:1: entryRuleGarbage returns [String current=null] : iv_ruleGarbage= ruleGarbage EOF ;
    public final String entryRuleGarbage() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGarbage = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:285:2: (iv_ruleGarbage= ruleGarbage EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:286:2: iv_ruleGarbage= ruleGarbage EOF
            {
             newCompositeNode(grammarAccess.getGarbageRule()); 
            pushFollow(FOLLOW_ruleGarbage_in_entryRuleGarbage454);
            iv_ruleGarbage=ruleGarbage();

            state._fsp--;

             current =iv_ruleGarbage.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGarbage465); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGarbage"


    // $ANTLR start "ruleGarbage"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:293:1: ruleGarbage returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_DOT_1= RULE_DOT | this_PARENT_2= RULE_PARENT | this_DOLLAR_3= RULE_DOLLAR | this_TML_SEPARATOR_4= RULE_TML_SEPARATOR | this_NUMBER_5= RULE_NUMBER | kw= ',' | this_SQBRACKET_OPEN_7= RULE_SQBRACKET_OPEN | this_SQBRACKET_CLOSE_8= RULE_SQBRACKET_CLOSE | this_AT_9= RULE_AT | this_COLON_10= RULE_COLON | kw= '(' | kw= ')' | this_TML_EXISTS_13= RULE_TML_EXISTS )* ;
    public final AntlrDatatypeRuleToken ruleGarbage() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_DOT_1=null;
        Token this_PARENT_2=null;
        Token this_DOLLAR_3=null;
        Token this_TML_SEPARATOR_4=null;
        Token this_NUMBER_5=null;
        Token kw=null;
        Token this_SQBRACKET_OPEN_7=null;
        Token this_SQBRACKET_CLOSE_8=null;
        Token this_AT_9=null;
        Token this_COLON_10=null;
        Token this_TML_EXISTS_13=null;

         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:296:28: ( (this_ID_0= RULE_ID | this_DOT_1= RULE_DOT | this_PARENT_2= RULE_PARENT | this_DOLLAR_3= RULE_DOLLAR | this_TML_SEPARATOR_4= RULE_TML_SEPARATOR | this_NUMBER_5= RULE_NUMBER | kw= ',' | this_SQBRACKET_OPEN_7= RULE_SQBRACKET_OPEN | this_SQBRACKET_CLOSE_8= RULE_SQBRACKET_CLOSE | this_AT_9= RULE_AT | this_COLON_10= RULE_COLON | kw= '(' | kw= ')' | this_TML_EXISTS_13= RULE_TML_EXISTS )* )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:297:1: (this_ID_0= RULE_ID | this_DOT_1= RULE_DOT | this_PARENT_2= RULE_PARENT | this_DOLLAR_3= RULE_DOLLAR | this_TML_SEPARATOR_4= RULE_TML_SEPARATOR | this_NUMBER_5= RULE_NUMBER | kw= ',' | this_SQBRACKET_OPEN_7= RULE_SQBRACKET_OPEN | this_SQBRACKET_CLOSE_8= RULE_SQBRACKET_CLOSE | this_AT_9= RULE_AT | this_COLON_10= RULE_COLON | kw= '(' | kw= ')' | this_TML_EXISTS_13= RULE_TML_EXISTS )*
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:297:1: (this_ID_0= RULE_ID | this_DOT_1= RULE_DOT | this_PARENT_2= RULE_PARENT | this_DOLLAR_3= RULE_DOLLAR | this_TML_SEPARATOR_4= RULE_TML_SEPARATOR | this_NUMBER_5= RULE_NUMBER | kw= ',' | this_SQBRACKET_OPEN_7= RULE_SQBRACKET_OPEN | this_SQBRACKET_CLOSE_8= RULE_SQBRACKET_CLOSE | this_AT_9= RULE_AT | this_COLON_10= RULE_COLON | kw= '(' | kw= ')' | this_TML_EXISTS_13= RULE_TML_EXISTS )*
            loop5:
            do {
                int alt5=15;
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
                case 68:
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
                case 69:
                    {
                    alt5=12;
                    }
                    break;
                case 70:
                    {
                    alt5=13;
                    }
                    break;
                case RULE_TML_EXISTS:
                    {
                    alt5=14;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:297:6: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGarbage505); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getGarbageAccess().getIDTerminalRuleCall_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:305:10: this_DOT_1= RULE_DOT
            	    {
            	    this_DOT_1=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleGarbage531); 

            	    		current.merge(this_DOT_1);
            	        
            	     
            	        newLeafNode(this_DOT_1, grammarAccess.getGarbageAccess().getDOTTerminalRuleCall_1()); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:313:10: this_PARENT_2= RULE_PARENT
            	    {
            	    this_PARENT_2=(Token)match(input,RULE_PARENT,FOLLOW_RULE_PARENT_in_ruleGarbage557); 

            	    		current.merge(this_PARENT_2);
            	        
            	     
            	        newLeafNode(this_PARENT_2, grammarAccess.getGarbageAccess().getPARENTTerminalRuleCall_2()); 
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:321:10: this_DOLLAR_3= RULE_DOLLAR
            	    {
            	    this_DOLLAR_3=(Token)match(input,RULE_DOLLAR,FOLLOW_RULE_DOLLAR_in_ruleGarbage583); 

            	    		current.merge(this_DOLLAR_3);
            	        
            	     
            	        newLeafNode(this_DOLLAR_3, grammarAccess.getGarbageAccess().getDOLLARTerminalRuleCall_3()); 
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:329:10: this_TML_SEPARATOR_4= RULE_TML_SEPARATOR
            	    {
            	    this_TML_SEPARATOR_4=(Token)match(input,RULE_TML_SEPARATOR,FOLLOW_RULE_TML_SEPARATOR_in_ruleGarbage609); 

            	    		current.merge(this_TML_SEPARATOR_4);
            	        
            	     
            	        newLeafNode(this_TML_SEPARATOR_4, grammarAccess.getGarbageAccess().getTML_SEPARATORTerminalRuleCall_4()); 
            	        

            	    }
            	    break;
            	case 6 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:337:10: this_NUMBER_5= RULE_NUMBER
            	    {
            	    this_NUMBER_5=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleGarbage635); 

            	    		current.merge(this_NUMBER_5);
            	        
            	     
            	        newLeafNode(this_NUMBER_5, grammarAccess.getGarbageAccess().getNUMBERTerminalRuleCall_5()); 
            	        

            	    }
            	    break;
            	case 7 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:346:2: kw= ','
            	    {
            	    kw=(Token)match(input,68,FOLLOW_68_in_ruleGarbage659); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getGarbageAccess().getCommaKeyword_6()); 
            	        

            	    }
            	    break;
            	case 8 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:352:10: this_SQBRACKET_OPEN_7= RULE_SQBRACKET_OPEN
            	    {
            	    this_SQBRACKET_OPEN_7=(Token)match(input,RULE_SQBRACKET_OPEN,FOLLOW_RULE_SQBRACKET_OPEN_in_ruleGarbage680); 

            	    		current.merge(this_SQBRACKET_OPEN_7);
            	        
            	     
            	        newLeafNode(this_SQBRACKET_OPEN_7, grammarAccess.getGarbageAccess().getSQBRACKET_OPENTerminalRuleCall_7()); 
            	        

            	    }
            	    break;
            	case 9 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:360:10: this_SQBRACKET_CLOSE_8= RULE_SQBRACKET_CLOSE
            	    {
            	    this_SQBRACKET_CLOSE_8=(Token)match(input,RULE_SQBRACKET_CLOSE,FOLLOW_RULE_SQBRACKET_CLOSE_in_ruleGarbage706); 

            	    		current.merge(this_SQBRACKET_CLOSE_8);
            	        
            	     
            	        newLeafNode(this_SQBRACKET_CLOSE_8, grammarAccess.getGarbageAccess().getSQBRACKET_CLOSETerminalRuleCall_8()); 
            	        

            	    }
            	    break;
            	case 10 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:368:10: this_AT_9= RULE_AT
            	    {
            	    this_AT_9=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_ruleGarbage732); 

            	    		current.merge(this_AT_9);
            	        
            	     
            	        newLeafNode(this_AT_9, grammarAccess.getGarbageAccess().getATTerminalRuleCall_9()); 
            	        

            	    }
            	    break;
            	case 11 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:376:10: this_COLON_10= RULE_COLON
            	    {
            	    this_COLON_10=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleGarbage758); 

            	    		current.merge(this_COLON_10);
            	        
            	     
            	        newLeafNode(this_COLON_10, grammarAccess.getGarbageAccess().getCOLONTerminalRuleCall_10()); 
            	        

            	    }
            	    break;
            	case 12 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:385:2: kw= '('
            	    {
            	    kw=(Token)match(input,69,FOLLOW_69_in_ruleGarbage782); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getGarbageAccess().getLeftParenthesisKeyword_11()); 
            	        

            	    }
            	    break;
            	case 13 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:392:2: kw= ')'
            	    {
            	    kw=(Token)match(input,70,FOLLOW_70_in_ruleGarbage801); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getGarbageAccess().getRightParenthesisKeyword_12()); 
            	        

            	    }
            	    break;
            	case 14 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:398:10: this_TML_EXISTS_13= RULE_TML_EXISTS
            	    {
            	    this_TML_EXISTS_13=(Token)match(input,RULE_TML_EXISTS,FOLLOW_RULE_TML_EXISTS_in_ruleGarbage822); 

            	    		current.merge(this_TML_EXISTS_13);
            	        
            	     
            	        newLeafNode(this_TML_EXISTS_13, grammarAccess.getGarbageAccess().getTML_EXISTSTerminalRuleCall_13()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGarbage"


    // $ANTLR start "entryRuleAttributeName"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:413:1: entryRuleAttributeName returns [String current=null] : iv_ruleAttributeName= ruleAttributeName EOF ;
    public final String entryRuleAttributeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeName = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:414:2: (iv_ruleAttributeName= ruleAttributeName EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:415:2: iv_ruleAttributeName= ruleAttributeName EOF
            {
             newCompositeNode(grammarAccess.getAttributeNameRule()); 
            pushFollow(FOLLOW_ruleAttributeName_in_entryRuleAttributeName869);
            iv_ruleAttributeName=ruleAttributeName();

            state._fsp--;

             current =iv_ruleAttributeName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeName880); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeName"


    // $ANTLR start "ruleAttributeName"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:422:1: ruleAttributeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (this_COLON_1= RULE_COLON this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleAttributeName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_COLON_1=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:425:28: ( (this_ID_0= RULE_ID (this_COLON_1= RULE_COLON this_ID_2= RULE_ID )? ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:426:1: (this_ID_0= RULE_ID (this_COLON_1= RULE_COLON this_ID_2= RULE_ID )? )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:426:1: (this_ID_0= RULE_ID (this_COLON_1= RULE_COLON this_ID_2= RULE_ID )? )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:426:6: this_ID_0= RULE_ID (this_COLON_1= RULE_COLON this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeName920); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getAttributeNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:433:1: (this_COLON_1= RULE_COLON this_ID_2= RULE_ID )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_COLON) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:433:6: this_COLON_1= RULE_COLON this_ID_2= RULE_ID
                    {
                    this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleAttributeName941); 

                    		current.merge(this_COLON_1);
                        
                     
                        newLeafNode(this_COLON_1, grammarAccess.getAttributeNameAccess().getCOLONTerminalRuleCall_1_0()); 
                        
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeName961); 

                    		current.merge(this_ID_2);
                        
                     
                        newLeafNode(this_ID_2, grammarAccess.getAttributeNameAccess().getIDTerminalRuleCall_1_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeName"


    // $ANTLR start "entryRuleExpression"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:455:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:456:2: (iv_ruleExpression= ruleExpression EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:457:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1008);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1018); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:464:1: ruleExpression returns [EObject current=null] : ( ( ( (lv_namespace_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON )? ( (lv_key_2_0= ruleAttributeName ) ) otherlv_3= '=' (this_QUOTE_4= RULE_QUOTE ( (lv_expressionValue_5_0= ruleTopLevel ) ) ( (lv_endToken_6_0= RULE_QUOTE ) ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_namespace_0_0=null;
        Token this_COLON_1=null;
        Token otherlv_3=null;
        Token this_QUOTE_4=null;
        Token lv_endToken_6_0=null;
        AntlrDatatypeRuleToken lv_key_2_0 = null;

        EObject lv_expressionValue_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:467:28: ( ( ( ( (lv_namespace_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON )? ( (lv_key_2_0= ruleAttributeName ) ) otherlv_3= '=' (this_QUOTE_4= RULE_QUOTE ( (lv_expressionValue_5_0= ruleTopLevel ) ) ( (lv_endToken_6_0= RULE_QUOTE ) ) ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:468:1: ( ( ( (lv_namespace_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON )? ( (lv_key_2_0= ruleAttributeName ) ) otherlv_3= '=' (this_QUOTE_4= RULE_QUOTE ( (lv_expressionValue_5_0= ruleTopLevel ) ) ( (lv_endToken_6_0= RULE_QUOTE ) ) ) )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:468:1: ( ( ( (lv_namespace_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON )? ( (lv_key_2_0= ruleAttributeName ) ) otherlv_3= '=' (this_QUOTE_4= RULE_QUOTE ( (lv_expressionValue_5_0= ruleTopLevel ) ) ( (lv_endToken_6_0= RULE_QUOTE ) ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:468:2: ( ( (lv_namespace_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON )? ( (lv_key_2_0= ruleAttributeName ) ) otherlv_3= '=' (this_QUOTE_4= RULE_QUOTE ( (lv_expressionValue_5_0= ruleTopLevel ) ) ( (lv_endToken_6_0= RULE_QUOTE ) ) )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:468:2: ( ( (lv_namespace_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_COLON) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==RULE_ID) ) {
                        alt7=1;
                    }
                }
            }
            switch (alt7) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:468:3: ( (lv_namespace_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:468:3: ( (lv_namespace_0_0= RULE_ID ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:469:1: (lv_namespace_0_0= RULE_ID )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:469:1: (lv_namespace_0_0= RULE_ID )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:470:3: lv_namespace_0_0= RULE_ID
                    {
                    lv_namespace_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpression1061); 

                    			newLeafNode(lv_namespace_0_0, grammarAccess.getExpressionAccess().getNamespaceIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"namespace",
                            		lv_namespace_0_0, 
                            		"ID");
                    	    

                    }


                    }

                    this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleExpression1077); 
                     
                        newLeafNode(this_COLON_1, grammarAccess.getExpressionAccess().getCOLONTerminalRuleCall_0_1()); 
                        

                    }
                    break;

            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:490:3: ( (lv_key_2_0= ruleAttributeName ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:491:1: (lv_key_2_0= ruleAttributeName )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:491:1: (lv_key_2_0= ruleAttributeName )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:492:3: lv_key_2_0= ruleAttributeName
            {
             
            	        newCompositeNode(grammarAccess.getExpressionAccess().getKeyAttributeNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributeName_in_ruleExpression1099);
            lv_key_2_0=ruleAttributeName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"key",
                    		lv_key_2_0, 
                    		"AttributeName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,71,FOLLOW_71_in_ruleExpression1111); 

                	newLeafNode(otherlv_3, grammarAccess.getExpressionAccess().getEqualsSignKeyword_2());
                
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:512:1: (this_QUOTE_4= RULE_QUOTE ( (lv_expressionValue_5_0= ruleTopLevel ) ) ( (lv_endToken_6_0= RULE_QUOTE ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:512:2: this_QUOTE_4= RULE_QUOTE ( (lv_expressionValue_5_0= ruleTopLevel ) ) ( (lv_endToken_6_0= RULE_QUOTE ) )
            {
            this_QUOTE_4=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleExpression1123); 
             
                newLeafNode(this_QUOTE_4, grammarAccess.getExpressionAccess().getQUOTETerminalRuleCall_3_0()); 
                
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:516:1: ( (lv_expressionValue_5_0= ruleTopLevel ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:517:1: (lv_expressionValue_5_0= ruleTopLevel )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:517:1: (lv_expressionValue_5_0= ruleTopLevel )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:518:3: lv_expressionValue_5_0= ruleTopLevel
            {
             
            	        newCompositeNode(grammarAccess.getExpressionAccess().getExpressionValueTopLevelParserRuleCall_3_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTopLevel_in_ruleExpression1143);
            lv_expressionValue_5_0=ruleTopLevel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"expressionValue",
                    		lv_expressionValue_5_0, 
                    		"TopLevel");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:534:2: ( (lv_endToken_6_0= RULE_QUOTE ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:535:1: (lv_endToken_6_0= RULE_QUOTE )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:535:1: (lv_endToken_6_0= RULE_QUOTE )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:536:3: lv_endToken_6_0= RULE_QUOTE
            {
            lv_endToken_6_0=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleExpression1160); 

            			newLeafNode(lv_endToken_6_0, grammarAccess.getExpressionAccess().getEndTokenQUOTETerminalRuleCall_3_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExpressionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"endToken",
                    		lv_endToken_6_0, 
                    		"QUOTE");
            	    

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleNonExpression"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:560:1: entryRuleNonExpression returns [EObject current=null] : iv_ruleNonExpression= ruleNonExpression EOF ;
    public final EObject entryRuleNonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonExpression = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:561:2: (iv_ruleNonExpression= ruleNonExpression EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:562:2: iv_ruleNonExpression= ruleNonExpression EOF
            {
             newCompositeNode(grammarAccess.getNonExpressionRule()); 
            pushFollow(FOLLOW_ruleNonExpression_in_entryRuleNonExpression1202);
            iv_ruleNonExpression=ruleNonExpression();

            state._fsp--;

             current =iv_ruleNonExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNonExpression1212); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNonExpression"


    // $ANTLR start "ruleNonExpression"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:569:1: ruleNonExpression returns [EObject current=null] : ( ( ( (lv_namespace_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON )? ( (lv_key_2_0= ruleAttributeName ) ) otherlv_3= '=' (this_QUOTE_4= RULE_QUOTE ( (lv_value_5_0= ruleGarbage ) ) this_QUOTE_6= RULE_QUOTE ) ) ;
    public final EObject ruleNonExpression() throws RecognitionException {
        EObject current = null;

        Token lv_namespace_0_0=null;
        Token this_COLON_1=null;
        Token otherlv_3=null;
        Token this_QUOTE_4=null;
        Token this_QUOTE_6=null;
        AntlrDatatypeRuleToken lv_key_2_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:572:28: ( ( ( ( (lv_namespace_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON )? ( (lv_key_2_0= ruleAttributeName ) ) otherlv_3= '=' (this_QUOTE_4= RULE_QUOTE ( (lv_value_5_0= ruleGarbage ) ) this_QUOTE_6= RULE_QUOTE ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:573:1: ( ( ( (lv_namespace_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON )? ( (lv_key_2_0= ruleAttributeName ) ) otherlv_3= '=' (this_QUOTE_4= RULE_QUOTE ( (lv_value_5_0= ruleGarbage ) ) this_QUOTE_6= RULE_QUOTE ) )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:573:1: ( ( ( (lv_namespace_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON )? ( (lv_key_2_0= ruleAttributeName ) ) otherlv_3= '=' (this_QUOTE_4= RULE_QUOTE ( (lv_value_5_0= ruleGarbage ) ) this_QUOTE_6= RULE_QUOTE ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:573:2: ( ( (lv_namespace_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON )? ( (lv_key_2_0= ruleAttributeName ) ) otherlv_3= '=' (this_QUOTE_4= RULE_QUOTE ( (lv_value_5_0= ruleGarbage ) ) this_QUOTE_6= RULE_QUOTE )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:573:2: ( ( (lv_namespace_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_COLON) ) {
                    int LA8_2 = input.LA(3);

                    if ( (LA8_2==RULE_ID) ) {
                        alt8=1;
                    }
                }
            }
            switch (alt8) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:573:3: ( (lv_namespace_0_0= RULE_ID ) ) this_COLON_1= RULE_COLON
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:573:3: ( (lv_namespace_0_0= RULE_ID ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:574:1: (lv_namespace_0_0= RULE_ID )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:574:1: (lv_namespace_0_0= RULE_ID )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:575:3: lv_namespace_0_0= RULE_ID
                    {
                    lv_namespace_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNonExpression1255); 

                    			newLeafNode(lv_namespace_0_0, grammarAccess.getNonExpressionAccess().getNamespaceIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNonExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"namespace",
                            		lv_namespace_0_0, 
                            		"ID");
                    	    

                    }


                    }

                    this_COLON_1=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleNonExpression1271); 
                     
                        newLeafNode(this_COLON_1, grammarAccess.getNonExpressionAccess().getCOLONTerminalRuleCall_0_1()); 
                        

                    }
                    break;

            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:595:3: ( (lv_key_2_0= ruleAttributeName ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:596:1: (lv_key_2_0= ruleAttributeName )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:596:1: (lv_key_2_0= ruleAttributeName )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:597:3: lv_key_2_0= ruleAttributeName
            {
             
            	        newCompositeNode(grammarAccess.getNonExpressionAccess().getKeyAttributeNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributeName_in_ruleNonExpression1293);
            lv_key_2_0=ruleAttributeName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNonExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"key",
                    		lv_key_2_0, 
                    		"AttributeName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,71,FOLLOW_71_in_ruleNonExpression1305); 

                	newLeafNode(otherlv_3, grammarAccess.getNonExpressionAccess().getEqualsSignKeyword_2());
                
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:617:1: (this_QUOTE_4= RULE_QUOTE ( (lv_value_5_0= ruleGarbage ) ) this_QUOTE_6= RULE_QUOTE )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:617:2: this_QUOTE_4= RULE_QUOTE ( (lv_value_5_0= ruleGarbage ) ) this_QUOTE_6= RULE_QUOTE
            {
            this_QUOTE_4=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleNonExpression1317); 
             
                newLeafNode(this_QUOTE_4, grammarAccess.getNonExpressionAccess().getQUOTETerminalRuleCall_3_0()); 
                
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:621:1: ( (lv_value_5_0= ruleGarbage ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:622:1: (lv_value_5_0= ruleGarbage )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:622:1: (lv_value_5_0= ruleGarbage )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:623:3: lv_value_5_0= ruleGarbage
            {
             
            	        newCompositeNode(grammarAccess.getNonExpressionAccess().getValueGarbageParserRuleCall_3_1_0()); 
            	    
            pushFollow(FOLLOW_ruleGarbage_in_ruleNonExpression1337);
            lv_value_5_0=ruleGarbage();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNonExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_5_0, 
                    		"Garbage");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_QUOTE_6=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleNonExpression1348); 
             
                newLeafNode(this_QUOTE_6, grammarAccess.getNonExpressionAccess().getQUOTETerminalRuleCall_3_2()); 
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNonExpression"


    // $ANTLR start "entryRuleMethods"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:651:1: entryRuleMethods returns [EObject current=null] : iv_ruleMethods= ruleMethods EOF ;
    public final EObject entryRuleMethods() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethods = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:652:2: (iv_ruleMethods= ruleMethods EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:653:2: iv_ruleMethods= ruleMethods EOF
            {
             newCompositeNode(grammarAccess.getMethodsRule()); 
            pushFollow(FOLLOW_ruleMethods_in_entryRuleMethods1384);
            iv_ruleMethods=ruleMethods();

            state._fsp--;

             current =iv_ruleMethods; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethods1394); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethods"


    // $ANTLR start "ruleMethods"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:660:1: ruleMethods returns [EObject current=null] : (this_METHODS_START_TAG_0= RULE_METHODS_START_TAG () ( ( ( (lv_splitTag_2_0= RULE_XML_TAG_END ) ) ( (lv_method_3_0= ruleMethod ) )* ( (lv_closedTag_4_0= RULE_METHODS_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_5= RULE_XML_TAG_SINGLEEND ) ) ;
    public final EObject ruleMethods() throws RecognitionException {
        EObject current = null;

        Token this_METHODS_START_TAG_0=null;
        Token lv_splitTag_2_0=null;
        Token lv_closedTag_4_0=null;
        Token this_XML_TAG_SINGLEEND_5=null;
        EObject lv_method_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:663:28: ( (this_METHODS_START_TAG_0= RULE_METHODS_START_TAG () ( ( ( (lv_splitTag_2_0= RULE_XML_TAG_END ) ) ( (lv_method_3_0= ruleMethod ) )* ( (lv_closedTag_4_0= RULE_METHODS_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_5= RULE_XML_TAG_SINGLEEND ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:664:1: (this_METHODS_START_TAG_0= RULE_METHODS_START_TAG () ( ( ( (lv_splitTag_2_0= RULE_XML_TAG_END ) ) ( (lv_method_3_0= ruleMethod ) )* ( (lv_closedTag_4_0= RULE_METHODS_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_5= RULE_XML_TAG_SINGLEEND ) )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:664:1: (this_METHODS_START_TAG_0= RULE_METHODS_START_TAG () ( ( ( (lv_splitTag_2_0= RULE_XML_TAG_END ) ) ( (lv_method_3_0= ruleMethod ) )* ( (lv_closedTag_4_0= RULE_METHODS_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_5= RULE_XML_TAG_SINGLEEND ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:664:2: this_METHODS_START_TAG_0= RULE_METHODS_START_TAG () ( ( ( (lv_splitTag_2_0= RULE_XML_TAG_END ) ) ( (lv_method_3_0= ruleMethod ) )* ( (lv_closedTag_4_0= RULE_METHODS_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_5= RULE_XML_TAG_SINGLEEND )
            {
            this_METHODS_START_TAG_0=(Token)match(input,RULE_METHODS_START_TAG,FOLLOW_RULE_METHODS_START_TAG_in_ruleMethods1430); 
             
                newLeafNode(this_METHODS_START_TAG_0, grammarAccess.getMethodsAccess().getMETHODS_START_TAGTerminalRuleCall_0()); 
                
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:668:1: ()
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:669:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMethodsAccess().getMethodsAction_1(),
                        current);
                

            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:674:2: ( ( ( (lv_splitTag_2_0= RULE_XML_TAG_END ) ) ( (lv_method_3_0= ruleMethod ) )* ( (lv_closedTag_4_0= RULE_METHODS_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_5= RULE_XML_TAG_SINGLEEND )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_XML_TAG_END) ) {
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
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:674:3: ( ( (lv_splitTag_2_0= RULE_XML_TAG_END ) ) ( (lv_method_3_0= ruleMethod ) )* ( (lv_closedTag_4_0= RULE_METHODS_END_TAG ) ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:674:3: ( ( (lv_splitTag_2_0= RULE_XML_TAG_END ) ) ( (lv_method_3_0= ruleMethod ) )* ( (lv_closedTag_4_0= RULE_METHODS_END_TAG ) ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:674:4: ( (lv_splitTag_2_0= RULE_XML_TAG_END ) ) ( (lv_method_3_0= ruleMethod ) )* ( (lv_closedTag_4_0= RULE_METHODS_END_TAG ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:674:4: ( (lv_splitTag_2_0= RULE_XML_TAG_END ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:675:1: (lv_splitTag_2_0= RULE_XML_TAG_END )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:675:1: (lv_splitTag_2_0= RULE_XML_TAG_END )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:676:3: lv_splitTag_2_0= RULE_XML_TAG_END
                    {
                    lv_splitTag_2_0=(Token)match(input,RULE_XML_TAG_END,FOLLOW_RULE_XML_TAG_END_in_ruleMethods1457); 

                    			newLeafNode(lv_splitTag_2_0, grammarAccess.getMethodsAccess().getSplitTagXML_TAG_ENDTerminalRuleCall_2_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodsRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"splitTag",
                            		true, 
                            		"XML_TAG_END");
                    	    

                    }


                    }

                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:692:2: ( (lv_method_3_0= ruleMethod ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_METHOD_START_TAG) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:693:1: (lv_method_3_0= ruleMethod )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:693:1: (lv_method_3_0= ruleMethod )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:694:3: lv_method_3_0= ruleMethod
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMethodsAccess().getMethodMethodParserRuleCall_2_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMethod_in_ruleMethods1483);
                    	    lv_method_3_0=ruleMethod();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMethodsRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"method",
                    	            		lv_method_3_0, 
                    	            		"Method");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:710:3: ( (lv_closedTag_4_0= RULE_METHODS_END_TAG ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:711:1: (lv_closedTag_4_0= RULE_METHODS_END_TAG )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:711:1: (lv_closedTag_4_0= RULE_METHODS_END_TAG )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:712:3: lv_closedTag_4_0= RULE_METHODS_END_TAG
                    {
                    lv_closedTag_4_0=(Token)match(input,RULE_METHODS_END_TAG,FOLLOW_RULE_METHODS_END_TAG_in_ruleMethods1501); 

                    			newLeafNode(lv_closedTag_4_0, grammarAccess.getMethodsAccess().getClosedTagMETHODS_END_TAGTerminalRuleCall_2_0_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodsRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"closedTag",
                            		true, 
                            		"METHODS_END_TAG");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:729:6: this_XML_TAG_SINGLEEND_5= RULE_XML_TAG_SINGLEEND
                    {
                    this_XML_TAG_SINGLEEND_5=(Token)match(input,RULE_XML_TAG_SINGLEEND,FOLLOW_RULE_XML_TAG_SINGLEEND_in_ruleMethods1524); 
                     
                        newLeafNode(this_XML_TAG_SINGLEEND_5, grammarAccess.getMethodsAccess().getXML_TAG_SINGLEENDTerminalRuleCall_2_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethods"


    // $ANTLR start "entryRuleMethod"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:741:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:742:2: (iv_ruleMethod= ruleMethod EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:743:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod1560);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod1570); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:750:1: ruleMethod returns [EObject current=null] : (this_METHOD_START_TAG_0= RULE_METHOD_START_TAG () ( (lv_attributes_2_0= ruleNonExpression ) )* ( ( ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_children_4_0= ruleRequired ) )* ( (lv_closedTag_5_0= RULE_METHOD_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_6= RULE_XML_TAG_SINGLEEND ) ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token this_METHOD_START_TAG_0=null;
        Token lv_splitTag_3_0=null;
        Token lv_closedTag_5_0=null;
        Token this_XML_TAG_SINGLEEND_6=null;
        EObject lv_attributes_2_0 = null;

        EObject lv_children_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:753:28: ( (this_METHOD_START_TAG_0= RULE_METHOD_START_TAG () ( (lv_attributes_2_0= ruleNonExpression ) )* ( ( ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_children_4_0= ruleRequired ) )* ( (lv_closedTag_5_0= RULE_METHOD_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_6= RULE_XML_TAG_SINGLEEND ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:754:1: (this_METHOD_START_TAG_0= RULE_METHOD_START_TAG () ( (lv_attributes_2_0= ruleNonExpression ) )* ( ( ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_children_4_0= ruleRequired ) )* ( (lv_closedTag_5_0= RULE_METHOD_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_6= RULE_XML_TAG_SINGLEEND ) )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:754:1: (this_METHOD_START_TAG_0= RULE_METHOD_START_TAG () ( (lv_attributes_2_0= ruleNonExpression ) )* ( ( ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_children_4_0= ruleRequired ) )* ( (lv_closedTag_5_0= RULE_METHOD_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_6= RULE_XML_TAG_SINGLEEND ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:754:2: this_METHOD_START_TAG_0= RULE_METHOD_START_TAG () ( (lv_attributes_2_0= ruleNonExpression ) )* ( ( ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_children_4_0= ruleRequired ) )* ( (lv_closedTag_5_0= RULE_METHOD_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_6= RULE_XML_TAG_SINGLEEND )
            {
            this_METHOD_START_TAG_0=(Token)match(input,RULE_METHOD_START_TAG,FOLLOW_RULE_METHOD_START_TAG_in_ruleMethod1606); 
             
                newLeafNode(this_METHOD_START_TAG_0, grammarAccess.getMethodAccess().getMETHOD_START_TAGTerminalRuleCall_0()); 
                
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:758:1: ()
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:759:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMethodAccess().getMethodAction_1(),
                        current);
                

            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:764:2: ( (lv_attributes_2_0= ruleNonExpression ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:765:1: (lv_attributes_2_0= ruleNonExpression )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:765:1: (lv_attributes_2_0= ruleNonExpression )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:766:3: lv_attributes_2_0= ruleNonExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMethodAccess().getAttributesNonExpressionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNonExpression_in_ruleMethod1635);
            	    lv_attributes_2_0=ruleNonExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMethodRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_2_0, 
            	            		"NonExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:782:3: ( ( ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_children_4_0= ruleRequired ) )* ( (lv_closedTag_5_0= RULE_METHOD_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_6= RULE_XML_TAG_SINGLEEND )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_XML_TAG_END) ) {
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
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:782:4: ( ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_children_4_0= ruleRequired ) )* ( (lv_closedTag_5_0= RULE_METHOD_END_TAG ) ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:782:4: ( ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_children_4_0= ruleRequired ) )* ( (lv_closedTag_5_0= RULE_METHOD_END_TAG ) ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:782:5: ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_children_4_0= ruleRequired ) )* ( (lv_closedTag_5_0= RULE_METHOD_END_TAG ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:782:5: ( (lv_splitTag_3_0= RULE_XML_TAG_END ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:783:1: (lv_splitTag_3_0= RULE_XML_TAG_END )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:783:1: (lv_splitTag_3_0= RULE_XML_TAG_END )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:784:3: lv_splitTag_3_0= RULE_XML_TAG_END
                    {
                    lv_splitTag_3_0=(Token)match(input,RULE_XML_TAG_END,FOLLOW_RULE_XML_TAG_END_in_ruleMethod1655); 

                    			newLeafNode(lv_splitTag_3_0, grammarAccess.getMethodAccess().getSplitTagXML_TAG_ENDTerminalRuleCall_3_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"splitTag",
                            		true, 
                            		"XML_TAG_END");
                    	    

                    }


                    }

                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:800:2: ( (lv_children_4_0= ruleRequired ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_REQUIRED_START_TAG) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:801:1: (lv_children_4_0= ruleRequired )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:801:1: (lv_children_4_0= ruleRequired )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:802:3: lv_children_4_0= ruleRequired
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMethodAccess().getChildrenRequiredParserRuleCall_3_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRequired_in_ruleMethod1681);
                    	    lv_children_4_0=ruleRequired();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMethodRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_4_0, 
                    	            		"Required");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:818:3: ( (lv_closedTag_5_0= RULE_METHOD_END_TAG ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:819:1: (lv_closedTag_5_0= RULE_METHOD_END_TAG )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:819:1: (lv_closedTag_5_0= RULE_METHOD_END_TAG )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:820:3: lv_closedTag_5_0= RULE_METHOD_END_TAG
                    {
                    lv_closedTag_5_0=(Token)match(input,RULE_METHOD_END_TAG,FOLLOW_RULE_METHOD_END_TAG_in_ruleMethod1699); 

                    			newLeafNode(lv_closedTag_5_0, grammarAccess.getMethodAccess().getClosedTagMETHOD_END_TAGTerminalRuleCall_3_0_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMethodRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"closedTag",
                            		true, 
                            		"METHOD_END_TAG");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:837:6: this_XML_TAG_SINGLEEND_6= RULE_XML_TAG_SINGLEEND
                    {
                    this_XML_TAG_SINGLEEND_6=(Token)match(input,RULE_XML_TAG_SINGLEEND,FOLLOW_RULE_XML_TAG_SINGLEEND_in_ruleMethod1722); 
                     
                        newLeafNode(this_XML_TAG_SINGLEEND_6, grammarAccess.getMethodAccess().getXML_TAG_SINGLEENDTerminalRuleCall_3_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleValidations"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:849:1: entryRuleValidations returns [EObject current=null] : iv_ruleValidations= ruleValidations EOF ;
    public final EObject entryRuleValidations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidations = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:850:2: (iv_ruleValidations= ruleValidations EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:851:2: iv_ruleValidations= ruleValidations EOF
            {
             newCompositeNode(grammarAccess.getValidationsRule()); 
            pushFollow(FOLLOW_ruleValidations_in_entryRuleValidations1758);
            iv_ruleValidations=ruleValidations();

            state._fsp--;

             current =iv_ruleValidations; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidations1768); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidations"


    // $ANTLR start "ruleValidations"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:858:1: ruleValidations returns [EObject current=null] : (this_VALIDATIONS_START_TAG_0= RULE_VALIDATIONS_START_TAG () ( ( ( (lv_splitTag_2_0= RULE_XML_TAG_END ) ) ( (lv_children_3_0= ruleCheck ) )* ( (lv_closedTag_4_0= RULE_VALIDATIONS_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_5= RULE_XML_TAG_SINGLEEND ) ) ;
    public final EObject ruleValidations() throws RecognitionException {
        EObject current = null;

        Token this_VALIDATIONS_START_TAG_0=null;
        Token lv_splitTag_2_0=null;
        Token lv_closedTag_4_0=null;
        Token this_XML_TAG_SINGLEEND_5=null;
        EObject lv_children_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:861:28: ( (this_VALIDATIONS_START_TAG_0= RULE_VALIDATIONS_START_TAG () ( ( ( (lv_splitTag_2_0= RULE_XML_TAG_END ) ) ( (lv_children_3_0= ruleCheck ) )* ( (lv_closedTag_4_0= RULE_VALIDATIONS_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_5= RULE_XML_TAG_SINGLEEND ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:862:1: (this_VALIDATIONS_START_TAG_0= RULE_VALIDATIONS_START_TAG () ( ( ( (lv_splitTag_2_0= RULE_XML_TAG_END ) ) ( (lv_children_3_0= ruleCheck ) )* ( (lv_closedTag_4_0= RULE_VALIDATIONS_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_5= RULE_XML_TAG_SINGLEEND ) )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:862:1: (this_VALIDATIONS_START_TAG_0= RULE_VALIDATIONS_START_TAG () ( ( ( (lv_splitTag_2_0= RULE_XML_TAG_END ) ) ( (lv_children_3_0= ruleCheck ) )* ( (lv_closedTag_4_0= RULE_VALIDATIONS_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_5= RULE_XML_TAG_SINGLEEND ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:862:2: this_VALIDATIONS_START_TAG_0= RULE_VALIDATIONS_START_TAG () ( ( ( (lv_splitTag_2_0= RULE_XML_TAG_END ) ) ( (lv_children_3_0= ruleCheck ) )* ( (lv_closedTag_4_0= RULE_VALIDATIONS_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_5= RULE_XML_TAG_SINGLEEND )
            {
            this_VALIDATIONS_START_TAG_0=(Token)match(input,RULE_VALIDATIONS_START_TAG,FOLLOW_RULE_VALIDATIONS_START_TAG_in_ruleValidations1804); 
             
                newLeafNode(this_VALIDATIONS_START_TAG_0, grammarAccess.getValidationsAccess().getVALIDATIONS_START_TAGTerminalRuleCall_0()); 
                
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:866:1: ()
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:867:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getValidationsAccess().getValidationsAction_1(),
                        current);
                

            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:872:2: ( ( ( (lv_splitTag_2_0= RULE_XML_TAG_END ) ) ( (lv_children_3_0= ruleCheck ) )* ( (lv_closedTag_4_0= RULE_VALIDATIONS_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_5= RULE_XML_TAG_SINGLEEND )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_XML_TAG_END) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_XML_TAG_SINGLEEND) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:872:3: ( ( (lv_splitTag_2_0= RULE_XML_TAG_END ) ) ( (lv_children_3_0= ruleCheck ) )* ( (lv_closedTag_4_0= RULE_VALIDATIONS_END_TAG ) ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:872:3: ( ( (lv_splitTag_2_0= RULE_XML_TAG_END ) ) ( (lv_children_3_0= ruleCheck ) )* ( (lv_closedTag_4_0= RULE_VALIDATIONS_END_TAG ) ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:872:4: ( (lv_splitTag_2_0= RULE_XML_TAG_END ) ) ( (lv_children_3_0= ruleCheck ) )* ( (lv_closedTag_4_0= RULE_VALIDATIONS_END_TAG ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:872:4: ( (lv_splitTag_2_0= RULE_XML_TAG_END ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:873:1: (lv_splitTag_2_0= RULE_XML_TAG_END )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:873:1: (lv_splitTag_2_0= RULE_XML_TAG_END )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:874:3: lv_splitTag_2_0= RULE_XML_TAG_END
                    {
                    lv_splitTag_2_0=(Token)match(input,RULE_XML_TAG_END,FOLLOW_RULE_XML_TAG_END_in_ruleValidations1831); 

                    			newLeafNode(lv_splitTag_2_0, grammarAccess.getValidationsAccess().getSplitTagXML_TAG_ENDTerminalRuleCall_2_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getValidationsRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"splitTag",
                            		true, 
                            		"XML_TAG_END");
                    	    

                    }


                    }

                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:890:2: ( (lv_children_3_0= ruleCheck ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_CHECK_START_TAG) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:891:1: (lv_children_3_0= ruleCheck )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:891:1: (lv_children_3_0= ruleCheck )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:892:3: lv_children_3_0= ruleCheck
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getValidationsAccess().getChildrenCheckParserRuleCall_2_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCheck_in_ruleValidations1857);
                    	    lv_children_3_0=ruleCheck();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getValidationsRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_3_0, 
                    	            		"Check");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:908:3: ( (lv_closedTag_4_0= RULE_VALIDATIONS_END_TAG ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:909:1: (lv_closedTag_4_0= RULE_VALIDATIONS_END_TAG )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:909:1: (lv_closedTag_4_0= RULE_VALIDATIONS_END_TAG )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:910:3: lv_closedTag_4_0= RULE_VALIDATIONS_END_TAG
                    {
                    lv_closedTag_4_0=(Token)match(input,RULE_VALIDATIONS_END_TAG,FOLLOW_RULE_VALIDATIONS_END_TAG_in_ruleValidations1875); 

                    			newLeafNode(lv_closedTag_4_0, grammarAccess.getValidationsAccess().getClosedTagVALIDATIONS_END_TAGTerminalRuleCall_2_0_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getValidationsRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"closedTag",
                            		true, 
                            		"VALIDATIONS_END_TAG");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:927:6: this_XML_TAG_SINGLEEND_5= RULE_XML_TAG_SINGLEEND
                    {
                    this_XML_TAG_SINGLEEND_5=(Token)match(input,RULE_XML_TAG_SINGLEEND,FOLLOW_RULE_XML_TAG_SINGLEEND_in_ruleValidations1898); 
                     
                        newLeafNode(this_XML_TAG_SINGLEEND_5, grammarAccess.getValidationsAccess().getXML_TAG_SINGLEENDTerminalRuleCall_2_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidations"


    // $ANTLR start "entryRuleCheck"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:939:1: entryRuleCheck returns [EObject current=null] : iv_ruleCheck= ruleCheck EOF ;
    public final EObject entryRuleCheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCheck = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:940:2: (iv_ruleCheck= ruleCheck EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:941:2: iv_ruleCheck= ruleCheck EOF
            {
             newCompositeNode(grammarAccess.getCheckRule()); 
            pushFollow(FOLLOW_ruleCheck_in_entryRuleCheck1934);
            iv_ruleCheck=ruleCheck();

            state._fsp--;

             current =iv_ruleCheck; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCheck1944); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCheck"


    // $ANTLR start "ruleCheck"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:948:1: ruleCheck returns [EObject current=null] : (this_CHECK_START_TAG_0= RULE_CHECK_START_TAG () ( (lv_attributes_2_0= ruleNonExpression ) )* ( ( ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_expression_4_0= ruleTopLevel ) ) ( (lv_closedTag_5_0= RULE_CHECK_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_6= RULE_XML_TAG_SINGLEEND ) ) ;
    public final EObject ruleCheck() throws RecognitionException {
        EObject current = null;

        Token this_CHECK_START_TAG_0=null;
        Token lv_splitTag_3_0=null;
        Token lv_closedTag_5_0=null;
        Token this_XML_TAG_SINGLEEND_6=null;
        EObject lv_attributes_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:951:28: ( (this_CHECK_START_TAG_0= RULE_CHECK_START_TAG () ( (lv_attributes_2_0= ruleNonExpression ) )* ( ( ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_expression_4_0= ruleTopLevel ) ) ( (lv_closedTag_5_0= RULE_CHECK_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_6= RULE_XML_TAG_SINGLEEND ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:952:1: (this_CHECK_START_TAG_0= RULE_CHECK_START_TAG () ( (lv_attributes_2_0= ruleNonExpression ) )* ( ( ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_expression_4_0= ruleTopLevel ) ) ( (lv_closedTag_5_0= RULE_CHECK_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_6= RULE_XML_TAG_SINGLEEND ) )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:952:1: (this_CHECK_START_TAG_0= RULE_CHECK_START_TAG () ( (lv_attributes_2_0= ruleNonExpression ) )* ( ( ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_expression_4_0= ruleTopLevel ) ) ( (lv_closedTag_5_0= RULE_CHECK_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_6= RULE_XML_TAG_SINGLEEND ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:952:2: this_CHECK_START_TAG_0= RULE_CHECK_START_TAG () ( (lv_attributes_2_0= ruleNonExpression ) )* ( ( ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_expression_4_0= ruleTopLevel ) ) ( (lv_closedTag_5_0= RULE_CHECK_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_6= RULE_XML_TAG_SINGLEEND )
            {
            this_CHECK_START_TAG_0=(Token)match(input,RULE_CHECK_START_TAG,FOLLOW_RULE_CHECK_START_TAG_in_ruleCheck1980); 
             
                newLeafNode(this_CHECK_START_TAG_0, grammarAccess.getCheckAccess().getCHECK_START_TAGTerminalRuleCall_0()); 
                
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:956:1: ()
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:957:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCheckAccess().getCheckAction_1(),
                        current);
                

            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:962:2: ( (lv_attributes_2_0= ruleNonExpression ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:963:1: (lv_attributes_2_0= ruleNonExpression )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:963:1: (lv_attributes_2_0= ruleNonExpression )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:964:3: lv_attributes_2_0= ruleNonExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCheckAccess().getAttributesNonExpressionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNonExpression_in_ruleCheck2009);
            	    lv_attributes_2_0=ruleNonExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCheckRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_2_0, 
            	            		"NonExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:980:3: ( ( ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_expression_4_0= ruleTopLevel ) ) ( (lv_closedTag_5_0= RULE_CHECK_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_6= RULE_XML_TAG_SINGLEEND )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_XML_TAG_END) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_XML_TAG_SINGLEEND) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:980:4: ( ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_expression_4_0= ruleTopLevel ) ) ( (lv_closedTag_5_0= RULE_CHECK_END_TAG ) ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:980:4: ( ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_expression_4_0= ruleTopLevel ) ) ( (lv_closedTag_5_0= RULE_CHECK_END_TAG ) ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:980:5: ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_expression_4_0= ruleTopLevel ) ) ( (lv_closedTag_5_0= RULE_CHECK_END_TAG ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:980:5: ( (lv_splitTag_3_0= RULE_XML_TAG_END ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:981:1: (lv_splitTag_3_0= RULE_XML_TAG_END )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:981:1: (lv_splitTag_3_0= RULE_XML_TAG_END )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:982:3: lv_splitTag_3_0= RULE_XML_TAG_END
                    {
                    lv_splitTag_3_0=(Token)match(input,RULE_XML_TAG_END,FOLLOW_RULE_XML_TAG_END_in_ruleCheck2029); 

                    			newLeafNode(lv_splitTag_3_0, grammarAccess.getCheckAccess().getSplitTagXML_TAG_ENDTerminalRuleCall_3_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCheckRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"splitTag",
                            		true, 
                            		"XML_TAG_END");
                    	    

                    }


                    }

                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:998:2: ( (lv_expression_4_0= ruleTopLevel ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:999:1: (lv_expression_4_0= ruleTopLevel )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:999:1: (lv_expression_4_0= ruleTopLevel )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1000:3: lv_expression_4_0= ruleTopLevel
                    {
                     
                    	        newCompositeNode(grammarAccess.getCheckAccess().getExpressionTopLevelParserRuleCall_3_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTopLevel_in_ruleCheck2055);
                    lv_expression_4_0=ruleTopLevel();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCheckRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_4_0, 
                            		"TopLevel");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1016:2: ( (lv_closedTag_5_0= RULE_CHECK_END_TAG ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1017:1: (lv_closedTag_5_0= RULE_CHECK_END_TAG )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1017:1: (lv_closedTag_5_0= RULE_CHECK_END_TAG )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1018:3: lv_closedTag_5_0= RULE_CHECK_END_TAG
                    {
                    lv_closedTag_5_0=(Token)match(input,RULE_CHECK_END_TAG,FOLLOW_RULE_CHECK_END_TAG_in_ruleCheck2072); 

                    			newLeafNode(lv_closedTag_5_0, grammarAccess.getCheckAccess().getClosedTagCHECK_END_TAGTerminalRuleCall_3_0_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCheckRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"closedTag",
                            		true, 
                            		"CHECK_END_TAG");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1035:6: this_XML_TAG_SINGLEEND_6= RULE_XML_TAG_SINGLEEND
                    {
                    this_XML_TAG_SINGLEEND_6=(Token)match(input,RULE_XML_TAG_SINGLEEND,FOLLOW_RULE_XML_TAG_SINGLEEND_in_ruleCheck2095); 
                     
                        newLeafNode(this_XML_TAG_SINGLEEND_6, grammarAccess.getCheckAccess().getXML_TAG_SINGLEENDTerminalRuleCall_3_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCheck"


    // $ANTLR start "entryRuleComment"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1047:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1048:2: (iv_ruleComment= ruleComment EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1049:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_ruleComment_in_entryRuleComment2131);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComment2141); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1056:1: ruleComment returns [EObject current=null] : (this_COMMENT_START_TAG_0= RULE_COMMENT_START_TAG () ( (lv_attributes_2_0= ruleExpression ) )* ( ( ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_4_0= RULE_COMMENT_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_5= RULE_XML_TAG_SINGLEEND ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token this_COMMENT_START_TAG_0=null;
        Token lv_splitTag_3_0=null;
        Token lv_closedTag_4_0=null;
        Token this_XML_TAG_SINGLEEND_5=null;
        EObject lv_attributes_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1059:28: ( (this_COMMENT_START_TAG_0= RULE_COMMENT_START_TAG () ( (lv_attributes_2_0= ruleExpression ) )* ( ( ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_4_0= RULE_COMMENT_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_5= RULE_XML_TAG_SINGLEEND ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1060:1: (this_COMMENT_START_TAG_0= RULE_COMMENT_START_TAG () ( (lv_attributes_2_0= ruleExpression ) )* ( ( ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_4_0= RULE_COMMENT_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_5= RULE_XML_TAG_SINGLEEND ) )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1060:1: (this_COMMENT_START_TAG_0= RULE_COMMENT_START_TAG () ( (lv_attributes_2_0= ruleExpression ) )* ( ( ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_4_0= RULE_COMMENT_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_5= RULE_XML_TAG_SINGLEEND ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1060:2: this_COMMENT_START_TAG_0= RULE_COMMENT_START_TAG () ( (lv_attributes_2_0= ruleExpression ) )* ( ( ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_4_0= RULE_COMMENT_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_5= RULE_XML_TAG_SINGLEEND )
            {
            this_COMMENT_START_TAG_0=(Token)match(input,RULE_COMMENT_START_TAG,FOLLOW_RULE_COMMENT_START_TAG_in_ruleComment2177); 
             
                newLeafNode(this_COMMENT_START_TAG_0, grammarAccess.getCommentAccess().getCOMMENT_START_TAGTerminalRuleCall_0()); 
                
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1064:1: ()
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1065:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCommentAccess().getCommentAction_1(),
                        current);
                

            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1070:2: ( (lv_attributes_2_0= ruleExpression ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1071:1: (lv_attributes_2_0= ruleExpression )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1071:1: (lv_attributes_2_0= ruleExpression )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1072:3: lv_attributes_2_0= ruleExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCommentAccess().getAttributesExpressionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpression_in_ruleComment2206);
            	    lv_attributes_2_0=ruleExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCommentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_2_0, 
            	            		"Expression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1088:3: ( ( ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_4_0= RULE_COMMENT_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_5= RULE_XML_TAG_SINGLEEND )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_XML_TAG_END) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_XML_TAG_SINGLEEND) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1088:4: ( ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_4_0= RULE_COMMENT_END_TAG ) ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1088:4: ( ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_4_0= RULE_COMMENT_END_TAG ) ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1088:5: ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_4_0= RULE_COMMENT_END_TAG ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1088:5: ( (lv_splitTag_3_0= RULE_XML_TAG_END ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1089:1: (lv_splitTag_3_0= RULE_XML_TAG_END )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1089:1: (lv_splitTag_3_0= RULE_XML_TAG_END )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1090:3: lv_splitTag_3_0= RULE_XML_TAG_END
                    {
                    lv_splitTag_3_0=(Token)match(input,RULE_XML_TAG_END,FOLLOW_RULE_XML_TAG_END_in_ruleComment2226); 

                    			newLeafNode(lv_splitTag_3_0, grammarAccess.getCommentAccess().getSplitTagXML_TAG_ENDTerminalRuleCall_3_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCommentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"splitTag",
                            		true, 
                            		"XML_TAG_END");
                    	    

                    }


                    }

                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1106:2: ( (lv_closedTag_4_0= RULE_COMMENT_END_TAG ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1107:1: (lv_closedTag_4_0= RULE_COMMENT_END_TAG )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1107:1: (lv_closedTag_4_0= RULE_COMMENT_END_TAG )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1108:3: lv_closedTag_4_0= RULE_COMMENT_END_TAG
                    {
                    lv_closedTag_4_0=(Token)match(input,RULE_COMMENT_END_TAG,FOLLOW_RULE_COMMENT_END_TAG_in_ruleComment2248); 

                    			newLeafNode(lv_closedTag_4_0, grammarAccess.getCommentAccess().getClosedTagCOMMENT_END_TAGTerminalRuleCall_3_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCommentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"closedTag",
                            		true, 
                            		"COMMENT_END_TAG");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1125:6: this_XML_TAG_SINGLEEND_5= RULE_XML_TAG_SINGLEEND
                    {
                    this_XML_TAG_SINGLEEND_5=(Token)match(input,RULE_XML_TAG_SINGLEEND,FOLLOW_RULE_XML_TAG_SINGLEEND_in_ruleComment2271); 
                     
                        newLeafNode(this_XML_TAG_SINGLEEND_5, grammarAccess.getCommentAccess().getXML_TAG_SINGLEENDTerminalRuleCall_3_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleBreak"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1137:1: entryRuleBreak returns [EObject current=null] : iv_ruleBreak= ruleBreak EOF ;
    public final EObject entryRuleBreak() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBreak = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1138:2: (iv_ruleBreak= ruleBreak EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1139:2: iv_ruleBreak= ruleBreak EOF
            {
             newCompositeNode(grammarAccess.getBreakRule()); 
            pushFollow(FOLLOW_ruleBreak_in_entryRuleBreak2307);
            iv_ruleBreak=ruleBreak();

            state._fsp--;

             current =iv_ruleBreak; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBreak2317); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBreak"


    // $ANTLR start "ruleBreak"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1146:1: ruleBreak returns [EObject current=null] : (this_BREAK_START_TAG_0= RULE_BREAK_START_TAG () ( (lv_attributes_2_0= ruleExpression ) )* ( ( ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_4_0= RULE_BREAK_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_5= RULE_XML_TAG_SINGLEEND ) ) ;
    public final EObject ruleBreak() throws RecognitionException {
        EObject current = null;

        Token this_BREAK_START_TAG_0=null;
        Token lv_splitTag_3_0=null;
        Token lv_closedTag_4_0=null;
        Token this_XML_TAG_SINGLEEND_5=null;
        EObject lv_attributes_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1149:28: ( (this_BREAK_START_TAG_0= RULE_BREAK_START_TAG () ( (lv_attributes_2_0= ruleExpression ) )* ( ( ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_4_0= RULE_BREAK_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_5= RULE_XML_TAG_SINGLEEND ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1150:1: (this_BREAK_START_TAG_0= RULE_BREAK_START_TAG () ( (lv_attributes_2_0= ruleExpression ) )* ( ( ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_4_0= RULE_BREAK_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_5= RULE_XML_TAG_SINGLEEND ) )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1150:1: (this_BREAK_START_TAG_0= RULE_BREAK_START_TAG () ( (lv_attributes_2_0= ruleExpression ) )* ( ( ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_4_0= RULE_BREAK_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_5= RULE_XML_TAG_SINGLEEND ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1150:2: this_BREAK_START_TAG_0= RULE_BREAK_START_TAG () ( (lv_attributes_2_0= ruleExpression ) )* ( ( ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_4_0= RULE_BREAK_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_5= RULE_XML_TAG_SINGLEEND )
            {
            this_BREAK_START_TAG_0=(Token)match(input,RULE_BREAK_START_TAG,FOLLOW_RULE_BREAK_START_TAG_in_ruleBreak2353); 
             
                newLeafNode(this_BREAK_START_TAG_0, grammarAccess.getBreakAccess().getBREAK_START_TAGTerminalRuleCall_0()); 
                
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1154:1: ()
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1155:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBreakAccess().getBreakAction_1(),
                        current);
                

            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1160:2: ( (lv_attributes_2_0= ruleExpression ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1161:1: (lv_attributes_2_0= ruleExpression )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1161:1: (lv_attributes_2_0= ruleExpression )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1162:3: lv_attributes_2_0= ruleExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBreakAccess().getAttributesExpressionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExpression_in_ruleBreak2382);
            	    lv_attributes_2_0=ruleExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBreakRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_2_0, 
            	            		"Expression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1178:3: ( ( ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_4_0= RULE_BREAK_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_5= RULE_XML_TAG_SINGLEEND )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_XML_TAG_END) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_XML_TAG_SINGLEEND) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1178:4: ( ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_4_0= RULE_BREAK_END_TAG ) ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1178:4: ( ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_4_0= RULE_BREAK_END_TAG ) ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1178:5: ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_4_0= RULE_BREAK_END_TAG ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1178:5: ( (lv_splitTag_3_0= RULE_XML_TAG_END ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1179:1: (lv_splitTag_3_0= RULE_XML_TAG_END )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1179:1: (lv_splitTag_3_0= RULE_XML_TAG_END )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1180:3: lv_splitTag_3_0= RULE_XML_TAG_END
                    {
                    lv_splitTag_3_0=(Token)match(input,RULE_XML_TAG_END,FOLLOW_RULE_XML_TAG_END_in_ruleBreak2402); 

                    			newLeafNode(lv_splitTag_3_0, grammarAccess.getBreakAccess().getSplitTagXML_TAG_ENDTerminalRuleCall_3_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBreakRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"splitTag",
                            		true, 
                            		"XML_TAG_END");
                    	    

                    }


                    }

                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1196:2: ( (lv_closedTag_4_0= RULE_BREAK_END_TAG ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1197:1: (lv_closedTag_4_0= RULE_BREAK_END_TAG )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1197:1: (lv_closedTag_4_0= RULE_BREAK_END_TAG )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1198:3: lv_closedTag_4_0= RULE_BREAK_END_TAG
                    {
                    lv_closedTag_4_0=(Token)match(input,RULE_BREAK_END_TAG,FOLLOW_RULE_BREAK_END_TAG_in_ruleBreak2424); 

                    			newLeafNode(lv_closedTag_4_0, grammarAccess.getBreakAccess().getClosedTagBREAK_END_TAGTerminalRuleCall_3_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBreakRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"closedTag",
                            		true, 
                            		"BREAK_END_TAG");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1215:6: this_XML_TAG_SINGLEEND_5= RULE_XML_TAG_SINGLEEND
                    {
                    this_XML_TAG_SINGLEEND_5=(Token)match(input,RULE_XML_TAG_SINGLEEND,FOLLOW_RULE_XML_TAG_SINGLEEND_in_ruleBreak2447); 
                     
                        newLeafNode(this_XML_TAG_SINGLEEND_5, grammarAccess.getBreakAccess().getXML_TAG_SINGLEENDTerminalRuleCall_3_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBreak"


    // $ANTLR start "entryRuleInclude"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1229:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1230:2: (iv_ruleInclude= ruleInclude EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1231:2: iv_ruleInclude= ruleInclude EOF
            {
             newCompositeNode(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude2485);
            iv_ruleInclude=ruleInclude();

            state._fsp--;

             current =iv_ruleInclude; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude2495); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1238:1: ruleInclude returns [EObject current=null] : (this_INCLUDE_START_TAG_0= RULE_INCLUDE_START_TAG () (otherlv_2= 'script' otherlv_3= '=' this_QUOTE_4= RULE_QUOTE ( (lv_path_5_0= rulePathElement ) )+ this_QUOTE_6= RULE_QUOTE )? ( ( ( (lv_splitTag_7_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_8_0= RULE_INCLUDE_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_9= RULE_XML_TAG_SINGLEEND ) ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token this_INCLUDE_START_TAG_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_QUOTE_4=null;
        Token this_QUOTE_6=null;
        Token lv_splitTag_7_0=null;
        Token lv_closedTag_8_0=null;
        Token this_XML_TAG_SINGLEEND_9=null;
        AntlrDatatypeRuleToken lv_path_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1241:28: ( (this_INCLUDE_START_TAG_0= RULE_INCLUDE_START_TAG () (otherlv_2= 'script' otherlv_3= '=' this_QUOTE_4= RULE_QUOTE ( (lv_path_5_0= rulePathElement ) )+ this_QUOTE_6= RULE_QUOTE )? ( ( ( (lv_splitTag_7_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_8_0= RULE_INCLUDE_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_9= RULE_XML_TAG_SINGLEEND ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1242:1: (this_INCLUDE_START_TAG_0= RULE_INCLUDE_START_TAG () (otherlv_2= 'script' otherlv_3= '=' this_QUOTE_4= RULE_QUOTE ( (lv_path_5_0= rulePathElement ) )+ this_QUOTE_6= RULE_QUOTE )? ( ( ( (lv_splitTag_7_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_8_0= RULE_INCLUDE_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_9= RULE_XML_TAG_SINGLEEND ) )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1242:1: (this_INCLUDE_START_TAG_0= RULE_INCLUDE_START_TAG () (otherlv_2= 'script' otherlv_3= '=' this_QUOTE_4= RULE_QUOTE ( (lv_path_5_0= rulePathElement ) )+ this_QUOTE_6= RULE_QUOTE )? ( ( ( (lv_splitTag_7_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_8_0= RULE_INCLUDE_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_9= RULE_XML_TAG_SINGLEEND ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1242:2: this_INCLUDE_START_TAG_0= RULE_INCLUDE_START_TAG () (otherlv_2= 'script' otherlv_3= '=' this_QUOTE_4= RULE_QUOTE ( (lv_path_5_0= rulePathElement ) )+ this_QUOTE_6= RULE_QUOTE )? ( ( ( (lv_splitTag_7_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_8_0= RULE_INCLUDE_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_9= RULE_XML_TAG_SINGLEEND )
            {
            this_INCLUDE_START_TAG_0=(Token)match(input,RULE_INCLUDE_START_TAG,FOLLOW_RULE_INCLUDE_START_TAG_in_ruleInclude2531); 
             
                newLeafNode(this_INCLUDE_START_TAG_0, grammarAccess.getIncludeAccess().getINCLUDE_START_TAGTerminalRuleCall_0()); 
                
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1246:1: ()
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1247:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIncludeAccess().getMethodAction_1(),
                        current);
                

            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1252:2: (otherlv_2= 'script' otherlv_3= '=' this_QUOTE_4= RULE_QUOTE ( (lv_path_5_0= rulePathElement ) )+ this_QUOTE_6= RULE_QUOTE )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==72) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1252:4: otherlv_2= 'script' otherlv_3= '=' this_QUOTE_4= RULE_QUOTE ( (lv_path_5_0= rulePathElement ) )+ this_QUOTE_6= RULE_QUOTE
                    {
                    otherlv_2=(Token)match(input,72,FOLLOW_72_in_ruleInclude2552); 

                        	newLeafNode(otherlv_2, grammarAccess.getIncludeAccess().getScriptKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,71,FOLLOW_71_in_ruleInclude2564); 

                        	newLeafNode(otherlv_3, grammarAccess.getIncludeAccess().getEqualsSignKeyword_2_1());
                        
                    this_QUOTE_4=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleInclude2575); 
                     
                        newLeafNode(this_QUOTE_4, grammarAccess.getIncludeAccess().getQUOTETerminalRuleCall_2_2()); 
                        
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1264:1: ( (lv_path_5_0= rulePathElement ) )+
                    int cnt22=0;
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_PARENT)||LA22_0==RULE_TML_SEPARATOR) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1265:1: (lv_path_5_0= rulePathElement )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1265:1: (lv_path_5_0= rulePathElement )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1266:3: lv_path_5_0= rulePathElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getIncludeAccess().getPathPathElementParserRuleCall_2_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePathElement_in_ruleInclude2595);
                    	    lv_path_5_0=rulePathElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getIncludeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"path",
                    	            		lv_path_5_0, 
                    	            		"PathElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt22 >= 1 ) break loop22;
                                EarlyExitException eee =
                                    new EarlyExitException(22, input);
                                throw eee;
                        }
                        cnt22++;
                    } while (true);

                    this_QUOTE_6=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleInclude2607); 
                     
                        newLeafNode(this_QUOTE_6, grammarAccess.getIncludeAccess().getQUOTETerminalRuleCall_2_4()); 
                        

                    }
                    break;

            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1286:3: ( ( ( (lv_splitTag_7_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_8_0= RULE_INCLUDE_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_9= RULE_XML_TAG_SINGLEEND )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_XML_TAG_END) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_XML_TAG_SINGLEEND) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1286:4: ( ( (lv_splitTag_7_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_8_0= RULE_INCLUDE_END_TAG ) ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1286:4: ( ( (lv_splitTag_7_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_8_0= RULE_INCLUDE_END_TAG ) ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1286:5: ( (lv_splitTag_7_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_8_0= RULE_INCLUDE_END_TAG ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1286:5: ( (lv_splitTag_7_0= RULE_XML_TAG_END ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1287:1: (lv_splitTag_7_0= RULE_XML_TAG_END )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1287:1: (lv_splitTag_7_0= RULE_XML_TAG_END )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1288:3: lv_splitTag_7_0= RULE_XML_TAG_END
                    {
                    lv_splitTag_7_0=(Token)match(input,RULE_XML_TAG_END,FOLLOW_RULE_XML_TAG_END_in_ruleInclude2627); 

                    			newLeafNode(lv_splitTag_7_0, grammarAccess.getIncludeAccess().getSplitTagXML_TAG_ENDTerminalRuleCall_3_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIncludeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"splitTag",
                            		true, 
                            		"XML_TAG_END");
                    	    

                    }


                    }

                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1304:2: ( (lv_closedTag_8_0= RULE_INCLUDE_END_TAG ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1305:1: (lv_closedTag_8_0= RULE_INCLUDE_END_TAG )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1305:1: (lv_closedTag_8_0= RULE_INCLUDE_END_TAG )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1306:3: lv_closedTag_8_0= RULE_INCLUDE_END_TAG
                    {
                    lv_closedTag_8_0=(Token)match(input,RULE_INCLUDE_END_TAG,FOLLOW_RULE_INCLUDE_END_TAG_in_ruleInclude2649); 

                    			newLeafNode(lv_closedTag_8_0, grammarAccess.getIncludeAccess().getClosedTagINCLUDE_END_TAGTerminalRuleCall_3_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIncludeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"closedTag",
                            		true, 
                            		"INCLUDE_END_TAG");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1323:6: this_XML_TAG_SINGLEEND_9= RULE_XML_TAG_SINGLEEND
                    {
                    this_XML_TAG_SINGLEEND_9=(Token)match(input,RULE_XML_TAG_SINGLEEND,FOLLOW_RULE_XML_TAG_SINGLEEND_in_ruleInclude2672); 
                     
                        newLeafNode(this_XML_TAG_SINGLEEND_9, grammarAccess.getIncludeAccess().getXML_TAG_SINGLEENDTerminalRuleCall_3_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRuleMessage"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1335:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1336:2: (iv_ruleMessage= ruleMessage EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1337:2: iv_ruleMessage= ruleMessage EOF
            {
             newCompositeNode(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage2708);
            iv_ruleMessage=ruleMessage();

            state._fsp--;

             current =iv_ruleMessage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage2718); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1344:1: ruleMessage returns [EObject current=null] : (this_MESSAGE_START_TAG_0= RULE_MESSAGE_START_TAG () ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'count' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_count_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'mode' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_mode_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'name' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_nameAttribute_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'type' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_type_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'condition' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_condition_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE ) ) ) ) )* ) ) ) ( ( ( (lv_splitTag_28_0= RULE_XML_TAG_END ) ) ( ( (lv_children_29_0= ruleMessage ) ) | ( (lv_children_30_0= ruleProperty ) ) | ( (lv_children_31_0= ruleParam ) ) | ( (lv_children_32_0= ruleMap ) ) | ( (lv_children_33_0= ruleMapMethod ) ) | ( (lv_children_34_0= ruleDebugTag ) ) | ( (lv_children_35_0= ruleField ) ) | ( (lv_children_36_0= ruleComment ) ) | ( (lv_children_37_0= ruleBreak ) ) )* ( (lv_closedTag_38_0= RULE_MESSAGE_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_39= RULE_XML_TAG_SINGLEEND ) ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token this_MESSAGE_START_TAG_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_QUOTE_5=null;
        Token lv_count_6_0=null;
        Token this_QUOTE_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token this_QUOTE_10=null;
        Token lv_mode_11_0=null;
        Token this_QUOTE_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token this_QUOTE_15=null;
        Token lv_nameAttribute_16_0=null;
        Token this_QUOTE_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token this_QUOTE_20=null;
        Token lv_type_21_0=null;
        Token this_QUOTE_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token this_QUOTE_25=null;
        Token this_QUOTE_27=null;
        Token lv_splitTag_28_0=null;
        Token lv_closedTag_38_0=null;
        Token this_XML_TAG_SINGLEEND_39=null;
        EObject lv_condition_26_0 = null;

        EObject lv_children_29_0 = null;

        EObject lv_children_30_0 = null;

        EObject lv_children_31_0 = null;

        EObject lv_children_32_0 = null;

        EObject lv_children_33_0 = null;

        EObject lv_children_34_0 = null;

        EObject lv_children_35_0 = null;

        EObject lv_children_36_0 = null;

        EObject lv_children_37_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1347:28: ( (this_MESSAGE_START_TAG_0= RULE_MESSAGE_START_TAG () ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'count' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_count_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'mode' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_mode_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'name' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_nameAttribute_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'type' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_type_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'condition' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_condition_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE ) ) ) ) )* ) ) ) ( ( ( (lv_splitTag_28_0= RULE_XML_TAG_END ) ) ( ( (lv_children_29_0= ruleMessage ) ) | ( (lv_children_30_0= ruleProperty ) ) | ( (lv_children_31_0= ruleParam ) ) | ( (lv_children_32_0= ruleMap ) ) | ( (lv_children_33_0= ruleMapMethod ) ) | ( (lv_children_34_0= ruleDebugTag ) ) | ( (lv_children_35_0= ruleField ) ) | ( (lv_children_36_0= ruleComment ) ) | ( (lv_children_37_0= ruleBreak ) ) )* ( (lv_closedTag_38_0= RULE_MESSAGE_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_39= RULE_XML_TAG_SINGLEEND ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1348:1: (this_MESSAGE_START_TAG_0= RULE_MESSAGE_START_TAG () ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'count' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_count_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'mode' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_mode_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'name' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_nameAttribute_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'type' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_type_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'condition' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_condition_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE ) ) ) ) )* ) ) ) ( ( ( (lv_splitTag_28_0= RULE_XML_TAG_END ) ) ( ( (lv_children_29_0= ruleMessage ) ) | ( (lv_children_30_0= ruleProperty ) ) | ( (lv_children_31_0= ruleParam ) ) | ( (lv_children_32_0= ruleMap ) ) | ( (lv_children_33_0= ruleMapMethod ) ) | ( (lv_children_34_0= ruleDebugTag ) ) | ( (lv_children_35_0= ruleField ) ) | ( (lv_children_36_0= ruleComment ) ) | ( (lv_children_37_0= ruleBreak ) ) )* ( (lv_closedTag_38_0= RULE_MESSAGE_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_39= RULE_XML_TAG_SINGLEEND ) )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1348:1: (this_MESSAGE_START_TAG_0= RULE_MESSAGE_START_TAG () ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'count' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_count_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'mode' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_mode_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'name' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_nameAttribute_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'type' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_type_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'condition' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_condition_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE ) ) ) ) )* ) ) ) ( ( ( (lv_splitTag_28_0= RULE_XML_TAG_END ) ) ( ( (lv_children_29_0= ruleMessage ) ) | ( (lv_children_30_0= ruleProperty ) ) | ( (lv_children_31_0= ruleParam ) ) | ( (lv_children_32_0= ruleMap ) ) | ( (lv_children_33_0= ruleMapMethod ) ) | ( (lv_children_34_0= ruleDebugTag ) ) | ( (lv_children_35_0= ruleField ) ) | ( (lv_children_36_0= ruleComment ) ) | ( (lv_children_37_0= ruleBreak ) ) )* ( (lv_closedTag_38_0= RULE_MESSAGE_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_39= RULE_XML_TAG_SINGLEEND ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1348:2: this_MESSAGE_START_TAG_0= RULE_MESSAGE_START_TAG () ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'count' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_count_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'mode' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_mode_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'name' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_nameAttribute_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'type' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_type_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'condition' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_condition_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE ) ) ) ) )* ) ) ) ( ( ( (lv_splitTag_28_0= RULE_XML_TAG_END ) ) ( ( (lv_children_29_0= ruleMessage ) ) | ( (lv_children_30_0= ruleProperty ) ) | ( (lv_children_31_0= ruleParam ) ) | ( (lv_children_32_0= ruleMap ) ) | ( (lv_children_33_0= ruleMapMethod ) ) | ( (lv_children_34_0= ruleDebugTag ) ) | ( (lv_children_35_0= ruleField ) ) | ( (lv_children_36_0= ruleComment ) ) | ( (lv_children_37_0= ruleBreak ) ) )* ( (lv_closedTag_38_0= RULE_MESSAGE_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_39= RULE_XML_TAG_SINGLEEND )
            {
            this_MESSAGE_START_TAG_0=(Token)match(input,RULE_MESSAGE_START_TAG,FOLLOW_RULE_MESSAGE_START_TAG_in_ruleMessage2754); 
             
                newLeafNode(this_MESSAGE_START_TAG_0, grammarAccess.getMessageAccess().getMESSAGE_START_TAGTerminalRuleCall_0()); 
                
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1352:1: ()
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1353:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMessageAccess().getMessageAction_1(),
                        current);
                

            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1358:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'count' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_count_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'mode' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_mode_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'name' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_nameAttribute_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'type' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_type_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'condition' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_condition_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE ) ) ) ) )* ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1360:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'count' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_count_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'mode' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_mode_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'name' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_nameAttribute_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'type' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_type_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'condition' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_condition_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE ) ) ) ) )* ) )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1360:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'count' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_count_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'mode' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_mode_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'name' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_nameAttribute_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'type' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_type_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'condition' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_condition_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE ) ) ) ) )* ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1361:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'count' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_count_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'mode' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_mode_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'name' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_nameAttribute_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'type' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_type_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'condition' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_condition_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getMessageAccess().getUnorderedGroup_2());
            	
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1364:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'count' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_count_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'mode' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_mode_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'name' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_nameAttribute_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'type' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_type_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'condition' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_condition_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE ) ) ) ) )* )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1365:3: ( ({...}? => ( ({...}? => (otherlv_3= 'count' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_count_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'mode' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_mode_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'name' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_nameAttribute_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'type' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_type_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'condition' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_condition_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE ) ) ) ) )*
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1365:3: ( ({...}? => ( ({...}? => (otherlv_3= 'count' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_count_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'mode' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_mode_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'name' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_nameAttribute_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'type' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_type_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'condition' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_condition_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE ) ) ) ) )*
            loop25:
            do {
                int alt25=6;
                int LA25_0 = input.LA(1);

                if ( LA25_0 ==73 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 0) ) {
                    alt25=1;
                }
                else if ( LA25_0 ==74 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 1) ) {
                    alt25=2;
                }
                else if ( LA25_0 ==75 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 2) ) {
                    alt25=3;
                }
                else if ( LA25_0 ==76 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 3) ) {
                    alt25=4;
                }
                else if ( LA25_0 ==77 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 4) ) {
                    alt25=5;
                }


                switch (alt25) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1367:4: ({...}? => ( ({...}? => (otherlv_3= 'count' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_count_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE ) ) ) )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1367:4: ({...}? => ( ({...}? => (otherlv_3= 'count' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_count_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE ) ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1368:5: {...}? => ( ({...}? => (otherlv_3= 'count' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_count_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1368:104: ( ({...}? => (otherlv_3= 'count' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_count_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1369:6: ({...}? => (otherlv_3= 'count' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_count_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1372:6: ({...}? => (otherlv_3= 'count' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_count_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1372:7: {...}? => (otherlv_3= 'count' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_count_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1372:16: (otherlv_3= 'count' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_count_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1372:18: otherlv_3= 'count' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_count_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE
            	    {
            	    otherlv_3=(Token)match(input,73,FOLLOW_73_in_ruleMessage2820); 

            	        	newLeafNode(otherlv_3, grammarAccess.getMessageAccess().getCountKeyword_2_0_0());
            	        
            	    otherlv_4=(Token)match(input,71,FOLLOW_71_in_ruleMessage2832); 

            	        	newLeafNode(otherlv_4, grammarAccess.getMessageAccess().getEqualsSignKeyword_2_0_1());
            	        
            	    this_QUOTE_5=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleMessage2843); 
            	     
            	        newLeafNode(this_QUOTE_5, grammarAccess.getMessageAccess().getQUOTETerminalRuleCall_2_0_2()); 
            	        
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1384:1: ( (lv_count_6_0= RULE_NUMBER ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1385:1: (lv_count_6_0= RULE_NUMBER )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1385:1: (lv_count_6_0= RULE_NUMBER )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1386:3: lv_count_6_0= RULE_NUMBER
            	    {
            	    lv_count_6_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleMessage2859); 

            	    			newLeafNode(lv_count_6_0, grammarAccess.getMessageAccess().getCountNUMBERTerminalRuleCall_2_0_3_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMessageRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"count",
            	            		lv_count_6_0, 
            	            		"NUMBER");
            	    	    

            	    }


            	    }

            	    this_QUOTE_7=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleMessage2875); 
            	     
            	        newLeafNode(this_QUOTE_7, grammarAccess.getMessageAccess().getQUOTETerminalRuleCall_2_0_4()); 
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMessageAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1413:4: ({...}? => ( ({...}? => (otherlv_8= 'mode' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_mode_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1413:4: ({...}? => ( ({...}? => (otherlv_8= 'mode' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_mode_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1414:5: {...}? => ( ({...}? => (otherlv_8= 'mode' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_mode_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1414:104: ( ({...}? => (otherlv_8= 'mode' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_mode_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1415:6: ({...}? => (otherlv_8= 'mode' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_mode_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1418:6: ({...}? => (otherlv_8= 'mode' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_mode_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1418:7: {...}? => (otherlv_8= 'mode' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_mode_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1418:16: (otherlv_8= 'mode' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_mode_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1418:18: otherlv_8= 'mode' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_mode_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE
            	    {
            	    otherlv_8=(Token)match(input,74,FOLLOW_74_in_ruleMessage2942); 

            	        	newLeafNode(otherlv_8, grammarAccess.getMessageAccess().getModeKeyword_2_1_0());
            	        
            	    otherlv_9=(Token)match(input,71,FOLLOW_71_in_ruleMessage2954); 

            	        	newLeafNode(otherlv_9, grammarAccess.getMessageAccess().getEqualsSignKeyword_2_1_1());
            	        
            	    this_QUOTE_10=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleMessage2965); 
            	     
            	        newLeafNode(this_QUOTE_10, grammarAccess.getMessageAccess().getQUOTETerminalRuleCall_2_1_2()); 
            	        
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1430:1: ( (lv_mode_11_0= RULE_ID ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1431:1: (lv_mode_11_0= RULE_ID )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1431:1: (lv_mode_11_0= RULE_ID )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1432:3: lv_mode_11_0= RULE_ID
            	    {
            	    lv_mode_11_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessage2981); 

            	    			newLeafNode(lv_mode_11_0, grammarAccess.getMessageAccess().getModeIDTerminalRuleCall_2_1_3_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMessageRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"mode",
            	            		lv_mode_11_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    this_QUOTE_12=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleMessage2997); 
            	     
            	        newLeafNode(this_QUOTE_12, grammarAccess.getMessageAccess().getQUOTETerminalRuleCall_2_1_4()); 
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMessageAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1459:4: ({...}? => ( ({...}? => (otherlv_13= 'name' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_nameAttribute_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1459:4: ({...}? => ( ({...}? => (otherlv_13= 'name' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_nameAttribute_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1460:5: {...}? => ( ({...}? => (otherlv_13= 'name' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_nameAttribute_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1460:104: ( ({...}? => (otherlv_13= 'name' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_nameAttribute_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1461:6: ({...}? => (otherlv_13= 'name' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_nameAttribute_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1464:6: ({...}? => (otherlv_13= 'name' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_nameAttribute_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1464:7: {...}? => (otherlv_13= 'name' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_nameAttribute_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1464:16: (otherlv_13= 'name' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_nameAttribute_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1464:18: otherlv_13= 'name' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_nameAttribute_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE
            	    {
            	    otherlv_13=(Token)match(input,75,FOLLOW_75_in_ruleMessage3064); 

            	        	newLeafNode(otherlv_13, grammarAccess.getMessageAccess().getNameKeyword_2_2_0());
            	        
            	    otherlv_14=(Token)match(input,71,FOLLOW_71_in_ruleMessage3076); 

            	        	newLeafNode(otherlv_14, grammarAccess.getMessageAccess().getEqualsSignKeyword_2_2_1());
            	        
            	    this_QUOTE_15=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleMessage3087); 
            	     
            	        newLeafNode(this_QUOTE_15, grammarAccess.getMessageAccess().getQUOTETerminalRuleCall_2_2_2()); 
            	        
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1476:1: ( (lv_nameAttribute_16_0= RULE_ID ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1477:1: (lv_nameAttribute_16_0= RULE_ID )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1477:1: (lv_nameAttribute_16_0= RULE_ID )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1478:3: lv_nameAttribute_16_0= RULE_ID
            	    {
            	    lv_nameAttribute_16_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessage3103); 

            	    			newLeafNode(lv_nameAttribute_16_0, grammarAccess.getMessageAccess().getNameAttributeIDTerminalRuleCall_2_2_3_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMessageRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"nameAttribute",
            	            		lv_nameAttribute_16_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    this_QUOTE_17=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleMessage3119); 
            	     
            	        newLeafNode(this_QUOTE_17, grammarAccess.getMessageAccess().getQUOTETerminalRuleCall_2_2_4()); 
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMessageAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1505:4: ({...}? => ( ({...}? => (otherlv_18= 'type' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_type_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE ) ) ) )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1505:4: ({...}? => ( ({...}? => (otherlv_18= 'type' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_type_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE ) ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1506:5: {...}? => ( ({...}? => (otherlv_18= 'type' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_type_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1506:104: ( ({...}? => (otherlv_18= 'type' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_type_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1507:6: ({...}? => (otherlv_18= 'type' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_type_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1510:6: ({...}? => (otherlv_18= 'type' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_type_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1510:7: {...}? => (otherlv_18= 'type' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_type_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1510:16: (otherlv_18= 'type' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_type_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1510:18: otherlv_18= 'type' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_type_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE
            	    {
            	    otherlv_18=(Token)match(input,76,FOLLOW_76_in_ruleMessage3186); 

            	        	newLeafNode(otherlv_18, grammarAccess.getMessageAccess().getTypeKeyword_2_3_0());
            	        
            	    otherlv_19=(Token)match(input,71,FOLLOW_71_in_ruleMessage3198); 

            	        	newLeafNode(otherlv_19, grammarAccess.getMessageAccess().getEqualsSignKeyword_2_3_1());
            	        
            	    this_QUOTE_20=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleMessage3209); 
            	     
            	        newLeafNode(this_QUOTE_20, grammarAccess.getMessageAccess().getQUOTETerminalRuleCall_2_3_2()); 
            	        
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1522:1: ( (lv_type_21_0= RULE_ID ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1523:1: (lv_type_21_0= RULE_ID )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1523:1: (lv_type_21_0= RULE_ID )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1524:3: lv_type_21_0= RULE_ID
            	    {
            	    lv_type_21_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMessage3225); 

            	    			newLeafNode(lv_type_21_0, grammarAccess.getMessageAccess().getTypeIDTerminalRuleCall_2_3_3_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMessageRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"type",
            	            		lv_type_21_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    this_QUOTE_22=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleMessage3241); 
            	     
            	        newLeafNode(this_QUOTE_22, grammarAccess.getMessageAccess().getQUOTETerminalRuleCall_2_3_4()); 
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMessageAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1551:4: ({...}? => ( ({...}? => (otherlv_23= 'condition' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_condition_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE ) ) ) )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1551:4: ({...}? => ( ({...}? => (otherlv_23= 'condition' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_condition_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE ) ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1552:5: {...}? => ( ({...}? => (otherlv_23= 'condition' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_condition_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1552:104: ( ({...}? => (otherlv_23= 'condition' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_condition_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1553:6: ({...}? => (otherlv_23= 'condition' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_condition_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1556:6: ({...}? => (otherlv_23= 'condition' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_condition_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1556:7: {...}? => (otherlv_23= 'condition' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_condition_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1556:16: (otherlv_23= 'condition' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_condition_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1556:18: otherlv_23= 'condition' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_condition_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE
            	    {
            	    otherlv_23=(Token)match(input,77,FOLLOW_77_in_ruleMessage3308); 

            	        	newLeafNode(otherlv_23, grammarAccess.getMessageAccess().getConditionKeyword_2_4_0());
            	        
            	    otherlv_24=(Token)match(input,71,FOLLOW_71_in_ruleMessage3320); 

            	        	newLeafNode(otherlv_24, grammarAccess.getMessageAccess().getEqualsSignKeyword_2_4_1());
            	        
            	    this_QUOTE_25=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleMessage3331); 
            	     
            	        newLeafNode(this_QUOTE_25, grammarAccess.getMessageAccess().getQUOTETerminalRuleCall_2_4_2()); 
            	        
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1568:1: ( (lv_condition_26_0= ruleTopLevel ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1569:1: (lv_condition_26_0= ruleTopLevel )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1569:1: (lv_condition_26_0= ruleTopLevel )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1570:3: lv_condition_26_0= ruleTopLevel
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMessageAccess().getConditionTopLevelParserRuleCall_2_4_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTopLevel_in_ruleMessage3351);
            	    lv_condition_26_0=ruleTopLevel();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMessageRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"condition",
            	            		lv_condition_26_0, 
            	            		"TopLevel");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    this_QUOTE_27=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleMessage3362); 
            	     
            	        newLeafNode(this_QUOTE_27, grammarAccess.getMessageAccess().getQUOTETerminalRuleCall_2_4_4()); 
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMessageAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getMessageAccess().getUnorderedGroup_2());
            	

            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1604:2: ( ( ( (lv_splitTag_28_0= RULE_XML_TAG_END ) ) ( ( (lv_children_29_0= ruleMessage ) ) | ( (lv_children_30_0= ruleProperty ) ) | ( (lv_children_31_0= ruleParam ) ) | ( (lv_children_32_0= ruleMap ) ) | ( (lv_children_33_0= ruleMapMethod ) ) | ( (lv_children_34_0= ruleDebugTag ) ) | ( (lv_children_35_0= ruleField ) ) | ( (lv_children_36_0= ruleComment ) ) | ( (lv_children_37_0= ruleBreak ) ) )* ( (lv_closedTag_38_0= RULE_MESSAGE_END_TAG ) ) ) | this_XML_TAG_SINGLEEND_39= RULE_XML_TAG_SINGLEEND )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_XML_TAG_END) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_XML_TAG_SINGLEEND) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1604:3: ( ( (lv_splitTag_28_0= RULE_XML_TAG_END ) ) ( ( (lv_children_29_0= ruleMessage ) ) | ( (lv_children_30_0= ruleProperty ) ) | ( (lv_children_31_0= ruleParam ) ) | ( (lv_children_32_0= ruleMap ) ) | ( (lv_children_33_0= ruleMapMethod ) ) | ( (lv_children_34_0= ruleDebugTag ) ) | ( (lv_children_35_0= ruleField ) ) | ( (lv_children_36_0= ruleComment ) ) | ( (lv_children_37_0= ruleBreak ) ) )* ( (lv_closedTag_38_0= RULE_MESSAGE_END_TAG ) ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1604:3: ( ( (lv_splitTag_28_0= RULE_XML_TAG_END ) ) ( ( (lv_children_29_0= ruleMessage ) ) | ( (lv_children_30_0= ruleProperty ) ) | ( (lv_children_31_0= ruleParam ) ) | ( (lv_children_32_0= ruleMap ) ) | ( (lv_children_33_0= ruleMapMethod ) ) | ( (lv_children_34_0= ruleDebugTag ) ) | ( (lv_children_35_0= ruleField ) ) | ( (lv_children_36_0= ruleComment ) ) | ( (lv_children_37_0= ruleBreak ) ) )* ( (lv_closedTag_38_0= RULE_MESSAGE_END_TAG ) ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1604:4: ( (lv_splitTag_28_0= RULE_XML_TAG_END ) ) ( ( (lv_children_29_0= ruleMessage ) ) | ( (lv_children_30_0= ruleProperty ) ) | ( (lv_children_31_0= ruleParam ) ) | ( (lv_children_32_0= ruleMap ) ) | ( (lv_children_33_0= ruleMapMethod ) ) | ( (lv_children_34_0= ruleDebugTag ) ) | ( (lv_children_35_0= ruleField ) ) | ( (lv_children_36_0= ruleComment ) ) | ( (lv_children_37_0= ruleBreak ) ) )* ( (lv_closedTag_38_0= RULE_MESSAGE_END_TAG ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1604:4: ( (lv_splitTag_28_0= RULE_XML_TAG_END ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1605:1: (lv_splitTag_28_0= RULE_XML_TAG_END )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1605:1: (lv_splitTag_28_0= RULE_XML_TAG_END )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1606:3: lv_splitTag_28_0= RULE_XML_TAG_END
                    {
                    lv_splitTag_28_0=(Token)match(input,RULE_XML_TAG_END,FOLLOW_RULE_XML_TAG_END_in_ruleMessage3421); 

                    			newLeafNode(lv_splitTag_28_0, grammarAccess.getMessageAccess().getSplitTagXML_TAG_ENDTerminalRuleCall_3_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMessageRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"splitTag",
                            		true, 
                            		"XML_TAG_END");
                    	    

                    }


                    }

                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1622:2: ( ( (lv_children_29_0= ruleMessage ) ) | ( (lv_children_30_0= ruleProperty ) ) | ( (lv_children_31_0= ruleParam ) ) | ( (lv_children_32_0= ruleMap ) ) | ( (lv_children_33_0= ruleMapMethod ) ) | ( (lv_children_34_0= ruleDebugTag ) ) | ( (lv_children_35_0= ruleField ) ) | ( (lv_children_36_0= ruleComment ) ) | ( (lv_children_37_0= ruleBreak ) ) )*
                    loop26:
                    do {
                        int alt26=10;
                        switch ( input.LA(1) ) {
                        case RULE_MESSAGE_START_TAG:
                            {
                            alt26=1;
                            }
                            break;
                        case RULE_PROPERTY_START_TAG:
                            {
                            alt26=2;
                            }
                            break;
                        case RULE_PARAM_START_TAG:
                            {
                            alt26=3;
                            }
                            break;
                        case RULE_MAPSTARTKEYWORD:
                            {
                            alt26=4;
                            }
                            break;
                        case RULE_MAP_METHOD_STARTTAG_START:
                            {
                            alt26=5;
                            }
                            break;
                        case RULE_DEBUG_START_TAG:
                            {
                            alt26=6;
                            }
                            break;
                        case RULE_FIELD_START_TAG:
                            {
                            alt26=7;
                            }
                            break;
                        case RULE_COMMENT_START_TAG:
                            {
                            alt26=8;
                            }
                            break;
                        case RULE_BREAK_START_TAG:
                            {
                            alt26=9;
                            }
                            break;

                        }

                        switch (alt26) {
                    	case 1 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1622:3: ( (lv_children_29_0= ruleMessage ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1622:3: ( (lv_children_29_0= ruleMessage ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1623:1: (lv_children_29_0= ruleMessage )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1623:1: (lv_children_29_0= ruleMessage )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1624:3: lv_children_29_0= ruleMessage
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMessageAccess().getChildrenMessageParserRuleCall_3_0_1_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMessage_in_ruleMessage3448);
                    	    lv_children_29_0=ruleMessage();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMessageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_29_0, 
                    	            		"Message");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1641:6: ( (lv_children_30_0= ruleProperty ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1641:6: ( (lv_children_30_0= ruleProperty ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1642:1: (lv_children_30_0= ruleProperty )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1642:1: (lv_children_30_0= ruleProperty )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1643:3: lv_children_30_0= ruleProperty
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMessageAccess().getChildrenPropertyParserRuleCall_3_0_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleProperty_in_ruleMessage3475);
                    	    lv_children_30_0=ruleProperty();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMessageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_30_0, 
                    	            		"Property");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1660:6: ( (lv_children_31_0= ruleParam ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1660:6: ( (lv_children_31_0= ruleParam ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1661:1: (lv_children_31_0= ruleParam )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1661:1: (lv_children_31_0= ruleParam )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1662:3: lv_children_31_0= ruleParam
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMessageAccess().getChildrenParamParserRuleCall_3_0_1_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParam_in_ruleMessage3502);
                    	    lv_children_31_0=ruleParam();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMessageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_31_0, 
                    	            		"Param");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1679:6: ( (lv_children_32_0= ruleMap ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1679:6: ( (lv_children_32_0= ruleMap ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1680:1: (lv_children_32_0= ruleMap )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1680:1: (lv_children_32_0= ruleMap )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1681:3: lv_children_32_0= ruleMap
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMessageAccess().getChildrenMapParserRuleCall_3_0_1_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMap_in_ruleMessage3529);
                    	    lv_children_32_0=ruleMap();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMessageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_32_0, 
                    	            		"Map");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1698:6: ( (lv_children_33_0= ruleMapMethod ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1698:6: ( (lv_children_33_0= ruleMapMethod ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1699:1: (lv_children_33_0= ruleMapMethod )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1699:1: (lv_children_33_0= ruleMapMethod )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1700:3: lv_children_33_0= ruleMapMethod
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMessageAccess().getChildrenMapMethodParserRuleCall_3_0_1_4_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMapMethod_in_ruleMessage3556);
                    	    lv_children_33_0=ruleMapMethod();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMessageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_33_0, 
                    	            		"MapMethod");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1717:6: ( (lv_children_34_0= ruleDebugTag ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1717:6: ( (lv_children_34_0= ruleDebugTag ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1718:1: (lv_children_34_0= ruleDebugTag )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1718:1: (lv_children_34_0= ruleDebugTag )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1719:3: lv_children_34_0= ruleDebugTag
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMessageAccess().getChildrenDebugTagParserRuleCall_3_0_1_5_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDebugTag_in_ruleMessage3583);
                    	    lv_children_34_0=ruleDebugTag();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMessageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_34_0, 
                    	            		"DebugTag");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 7 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1736:6: ( (lv_children_35_0= ruleField ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1736:6: ( (lv_children_35_0= ruleField ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1737:1: (lv_children_35_0= ruleField )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1737:1: (lv_children_35_0= ruleField )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1738:3: lv_children_35_0= ruleField
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMessageAccess().getChildrenFieldParserRuleCall_3_0_1_6_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleField_in_ruleMessage3610);
                    	    lv_children_35_0=ruleField();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMessageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_35_0, 
                    	            		"Field");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 8 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1755:6: ( (lv_children_36_0= ruleComment ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1755:6: ( (lv_children_36_0= ruleComment ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1756:1: (lv_children_36_0= ruleComment )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1756:1: (lv_children_36_0= ruleComment )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1757:3: lv_children_36_0= ruleComment
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMessageAccess().getChildrenCommentParserRuleCall_3_0_1_7_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleComment_in_ruleMessage3637);
                    	    lv_children_36_0=ruleComment();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMessageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_36_0, 
                    	            		"Comment");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 9 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1774:6: ( (lv_children_37_0= ruleBreak ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1774:6: ( (lv_children_37_0= ruleBreak ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1775:1: (lv_children_37_0= ruleBreak )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1775:1: (lv_children_37_0= ruleBreak )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1776:3: lv_children_37_0= ruleBreak
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMessageAccess().getChildrenBreakParserRuleCall_3_0_1_8_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleBreak_in_ruleMessage3664);
                    	    lv_children_37_0=ruleBreak();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMessageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_37_0, 
                    	            		"Break");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1792:4: ( (lv_closedTag_38_0= RULE_MESSAGE_END_TAG ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1793:1: (lv_closedTag_38_0= RULE_MESSAGE_END_TAG )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1793:1: (lv_closedTag_38_0= RULE_MESSAGE_END_TAG )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1794:3: lv_closedTag_38_0= RULE_MESSAGE_END_TAG
                    {
                    lv_closedTag_38_0=(Token)match(input,RULE_MESSAGE_END_TAG,FOLLOW_RULE_MESSAGE_END_TAG_in_ruleMessage3683); 

                    			newLeafNode(lv_closedTag_38_0, grammarAccess.getMessageAccess().getClosedTagMESSAGE_END_TAGTerminalRuleCall_3_0_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMessageRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"closedTag",
                            		true, 
                            		"MESSAGE_END_TAG");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1811:6: this_XML_TAG_SINGLEEND_39= RULE_XML_TAG_SINGLEEND
                    {
                    this_XML_TAG_SINGLEEND_39=(Token)match(input,RULE_XML_TAG_SINGLEEND,FOLLOW_RULE_XML_TAG_SINGLEEND_in_ruleMessage3706); 
                     
                        newLeafNode(this_XML_TAG_SINGLEEND_39, grammarAccess.getMessageAccess().getXML_TAG_SINGLEENDTerminalRuleCall_3_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleMap"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1823:1: entryRuleMap returns [EObject current=null] : iv_ruleMap= ruleMap EOF ;
    public final EObject entryRuleMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMap = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1824:2: (iv_ruleMap= ruleMap EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1825:2: iv_ruleMap= ruleMap EOF
            {
             newCompositeNode(grammarAccess.getMapRule()); 
            pushFollow(FOLLOW_ruleMap_in_entryRuleMap3742);
            iv_ruleMap=ruleMap();

            state._fsp--;

             current =iv_ruleMap; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMap3752); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMap"


    // $ANTLR start "ruleMap"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1832:1: ruleMap returns [EObject current=null] : (this_MAPSTARTKEYWORD_0= RULE_MAPSTARTKEYWORD () ( (this_DOT_2= RULE_DOT ( (lv_mapName_3_0= ruleMapId ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'ref' otherlv_6= '=' this_QUOTE_7= RULE_QUOTE ( (lv_ref_8_0= rulePathElement ) )+ this_QUOTE_9= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'object' otherlv_11= '=' this_QUOTE_12= RULE_QUOTE ( (lv_object_13_0= rulePathElement ) )+ this_QUOTE_14= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'name' otherlv_16= '=' this_QUOTE_17= RULE_QUOTE ( (lv_nameAttribute_18_0= RULE_ID ) ) this_QUOTE_19= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'filter' otherlv_21= '=' this_QUOTE_22= RULE_QUOTE ( (lv_filter_23_0= ruleTopLevel ) ) this_QUOTE_24= RULE_QUOTE ) ) ) ) )* ) ) ) ) (this_XML_TAG_SINGLEEND_25= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_26_0= RULE_XML_TAG_END ) ) ( ( (lv_children_27_0= ruleMessage ) ) | ( (lv_children_28_0= ruleProperty ) ) | ( (lv_children_29_0= ruleParam ) ) | ( (lv_children_30_0= ruleMap ) ) | ( (lv_children_31_0= ruleMapMethod ) ) | ( (lv_children_32_0= ruleDebugTag ) ) | ( (lv_children_33_0= ruleField ) ) | ( (lv_children_34_0= ruleComment ) ) | ( (lv_children_35_0= ruleBreak ) ) )* (this_MAPENDKEYWORD_36= RULE_MAPENDKEYWORD (this_DOT_37= RULE_DOT ( (lv_mapClosingName_38_0= ruleMapId ) ) )? ( (lv_closedTag_39_0= RULE_XML_TAG_END ) ) ) ) ) ) ;
    public final EObject ruleMap() throws RecognitionException {
        EObject current = null;

        Token this_MAPSTARTKEYWORD_0=null;
        Token this_DOT_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token this_QUOTE_7=null;
        Token this_QUOTE_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token this_QUOTE_12=null;
        Token this_QUOTE_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token this_QUOTE_17=null;
        Token lv_nameAttribute_18_0=null;
        Token this_QUOTE_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token this_QUOTE_22=null;
        Token this_QUOTE_24=null;
        Token this_XML_TAG_SINGLEEND_25=null;
        Token lv_splitTag_26_0=null;
        Token this_MAPENDKEYWORD_36=null;
        Token this_DOT_37=null;
        Token lv_closedTag_39_0=null;
        AntlrDatatypeRuleToken lv_mapName_3_0 = null;

        AntlrDatatypeRuleToken lv_ref_8_0 = null;

        AntlrDatatypeRuleToken lv_object_13_0 = null;

        EObject lv_filter_23_0 = null;

        EObject lv_children_27_0 = null;

        EObject lv_children_28_0 = null;

        EObject lv_children_29_0 = null;

        EObject lv_children_30_0 = null;

        EObject lv_children_31_0 = null;

        EObject lv_children_32_0 = null;

        EObject lv_children_33_0 = null;

        EObject lv_children_34_0 = null;

        EObject lv_children_35_0 = null;

        AntlrDatatypeRuleToken lv_mapClosingName_38_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1835:28: ( (this_MAPSTARTKEYWORD_0= RULE_MAPSTARTKEYWORD () ( (this_DOT_2= RULE_DOT ( (lv_mapName_3_0= ruleMapId ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'ref' otherlv_6= '=' this_QUOTE_7= RULE_QUOTE ( (lv_ref_8_0= rulePathElement ) )+ this_QUOTE_9= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'object' otherlv_11= '=' this_QUOTE_12= RULE_QUOTE ( (lv_object_13_0= rulePathElement ) )+ this_QUOTE_14= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'name' otherlv_16= '=' this_QUOTE_17= RULE_QUOTE ( (lv_nameAttribute_18_0= RULE_ID ) ) this_QUOTE_19= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'filter' otherlv_21= '=' this_QUOTE_22= RULE_QUOTE ( (lv_filter_23_0= ruleTopLevel ) ) this_QUOTE_24= RULE_QUOTE ) ) ) ) )* ) ) ) ) (this_XML_TAG_SINGLEEND_25= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_26_0= RULE_XML_TAG_END ) ) ( ( (lv_children_27_0= ruleMessage ) ) | ( (lv_children_28_0= ruleProperty ) ) | ( (lv_children_29_0= ruleParam ) ) | ( (lv_children_30_0= ruleMap ) ) | ( (lv_children_31_0= ruleMapMethod ) ) | ( (lv_children_32_0= ruleDebugTag ) ) | ( (lv_children_33_0= ruleField ) ) | ( (lv_children_34_0= ruleComment ) ) | ( (lv_children_35_0= ruleBreak ) ) )* (this_MAPENDKEYWORD_36= RULE_MAPENDKEYWORD (this_DOT_37= RULE_DOT ( (lv_mapClosingName_38_0= ruleMapId ) ) )? ( (lv_closedTag_39_0= RULE_XML_TAG_END ) ) ) ) ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1836:1: (this_MAPSTARTKEYWORD_0= RULE_MAPSTARTKEYWORD () ( (this_DOT_2= RULE_DOT ( (lv_mapName_3_0= ruleMapId ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'ref' otherlv_6= '=' this_QUOTE_7= RULE_QUOTE ( (lv_ref_8_0= rulePathElement ) )+ this_QUOTE_9= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'object' otherlv_11= '=' this_QUOTE_12= RULE_QUOTE ( (lv_object_13_0= rulePathElement ) )+ this_QUOTE_14= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'name' otherlv_16= '=' this_QUOTE_17= RULE_QUOTE ( (lv_nameAttribute_18_0= RULE_ID ) ) this_QUOTE_19= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'filter' otherlv_21= '=' this_QUOTE_22= RULE_QUOTE ( (lv_filter_23_0= ruleTopLevel ) ) this_QUOTE_24= RULE_QUOTE ) ) ) ) )* ) ) ) ) (this_XML_TAG_SINGLEEND_25= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_26_0= RULE_XML_TAG_END ) ) ( ( (lv_children_27_0= ruleMessage ) ) | ( (lv_children_28_0= ruleProperty ) ) | ( (lv_children_29_0= ruleParam ) ) | ( (lv_children_30_0= ruleMap ) ) | ( (lv_children_31_0= ruleMapMethod ) ) | ( (lv_children_32_0= ruleDebugTag ) ) | ( (lv_children_33_0= ruleField ) ) | ( (lv_children_34_0= ruleComment ) ) | ( (lv_children_35_0= ruleBreak ) ) )* (this_MAPENDKEYWORD_36= RULE_MAPENDKEYWORD (this_DOT_37= RULE_DOT ( (lv_mapClosingName_38_0= ruleMapId ) ) )? ( (lv_closedTag_39_0= RULE_XML_TAG_END ) ) ) ) ) )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1836:1: (this_MAPSTARTKEYWORD_0= RULE_MAPSTARTKEYWORD () ( (this_DOT_2= RULE_DOT ( (lv_mapName_3_0= ruleMapId ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'ref' otherlv_6= '=' this_QUOTE_7= RULE_QUOTE ( (lv_ref_8_0= rulePathElement ) )+ this_QUOTE_9= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'object' otherlv_11= '=' this_QUOTE_12= RULE_QUOTE ( (lv_object_13_0= rulePathElement ) )+ this_QUOTE_14= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'name' otherlv_16= '=' this_QUOTE_17= RULE_QUOTE ( (lv_nameAttribute_18_0= RULE_ID ) ) this_QUOTE_19= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'filter' otherlv_21= '=' this_QUOTE_22= RULE_QUOTE ( (lv_filter_23_0= ruleTopLevel ) ) this_QUOTE_24= RULE_QUOTE ) ) ) ) )* ) ) ) ) (this_XML_TAG_SINGLEEND_25= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_26_0= RULE_XML_TAG_END ) ) ( ( (lv_children_27_0= ruleMessage ) ) | ( (lv_children_28_0= ruleProperty ) ) | ( (lv_children_29_0= ruleParam ) ) | ( (lv_children_30_0= ruleMap ) ) | ( (lv_children_31_0= ruleMapMethod ) ) | ( (lv_children_32_0= ruleDebugTag ) ) | ( (lv_children_33_0= ruleField ) ) | ( (lv_children_34_0= ruleComment ) ) | ( (lv_children_35_0= ruleBreak ) ) )* (this_MAPENDKEYWORD_36= RULE_MAPENDKEYWORD (this_DOT_37= RULE_DOT ( (lv_mapClosingName_38_0= ruleMapId ) ) )? ( (lv_closedTag_39_0= RULE_XML_TAG_END ) ) ) ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1836:2: this_MAPSTARTKEYWORD_0= RULE_MAPSTARTKEYWORD () ( (this_DOT_2= RULE_DOT ( (lv_mapName_3_0= ruleMapId ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'ref' otherlv_6= '=' this_QUOTE_7= RULE_QUOTE ( (lv_ref_8_0= rulePathElement ) )+ this_QUOTE_9= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'object' otherlv_11= '=' this_QUOTE_12= RULE_QUOTE ( (lv_object_13_0= rulePathElement ) )+ this_QUOTE_14= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'name' otherlv_16= '=' this_QUOTE_17= RULE_QUOTE ( (lv_nameAttribute_18_0= RULE_ID ) ) this_QUOTE_19= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'filter' otherlv_21= '=' this_QUOTE_22= RULE_QUOTE ( (lv_filter_23_0= ruleTopLevel ) ) this_QUOTE_24= RULE_QUOTE ) ) ) ) )* ) ) ) ) (this_XML_TAG_SINGLEEND_25= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_26_0= RULE_XML_TAG_END ) ) ( ( (lv_children_27_0= ruleMessage ) ) | ( (lv_children_28_0= ruleProperty ) ) | ( (lv_children_29_0= ruleParam ) ) | ( (lv_children_30_0= ruleMap ) ) | ( (lv_children_31_0= ruleMapMethod ) ) | ( (lv_children_32_0= ruleDebugTag ) ) | ( (lv_children_33_0= ruleField ) ) | ( (lv_children_34_0= ruleComment ) ) | ( (lv_children_35_0= ruleBreak ) ) )* (this_MAPENDKEYWORD_36= RULE_MAPENDKEYWORD (this_DOT_37= RULE_DOT ( (lv_mapClosingName_38_0= ruleMapId ) ) )? ( (lv_closedTag_39_0= RULE_XML_TAG_END ) ) ) ) )
            {
            this_MAPSTARTKEYWORD_0=(Token)match(input,RULE_MAPSTARTKEYWORD,FOLLOW_RULE_MAPSTARTKEYWORD_in_ruleMap3788); 
             
                newLeafNode(this_MAPSTARTKEYWORD_0, grammarAccess.getMapAccess().getMAPSTARTKEYWORDTerminalRuleCall_0()); 
                
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1840:1: ()
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1841:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMapAccess().getMapAction_1(),
                        current);
                

            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1846:2: ( (this_DOT_2= RULE_DOT ( (lv_mapName_3_0= ruleMapId ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'ref' otherlv_6= '=' this_QUOTE_7= RULE_QUOTE ( (lv_ref_8_0= rulePathElement ) )+ this_QUOTE_9= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'object' otherlv_11= '=' this_QUOTE_12= RULE_QUOTE ( (lv_object_13_0= rulePathElement ) )+ this_QUOTE_14= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'name' otherlv_16= '=' this_QUOTE_17= RULE_QUOTE ( (lv_nameAttribute_18_0= RULE_ID ) ) this_QUOTE_19= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'filter' otherlv_21= '=' this_QUOTE_22= RULE_QUOTE ( (lv_filter_23_0= ruleTopLevel ) ) this_QUOTE_24= RULE_QUOTE ) ) ) ) )* ) ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1846:3: (this_DOT_2= RULE_DOT ( (lv_mapName_3_0= ruleMapId ) ) )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'ref' otherlv_6= '=' this_QUOTE_7= RULE_QUOTE ( (lv_ref_8_0= rulePathElement ) )+ this_QUOTE_9= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'object' otherlv_11= '=' this_QUOTE_12= RULE_QUOTE ( (lv_object_13_0= rulePathElement ) )+ this_QUOTE_14= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'name' otherlv_16= '=' this_QUOTE_17= RULE_QUOTE ( (lv_nameAttribute_18_0= RULE_ID ) ) this_QUOTE_19= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'filter' otherlv_21= '=' this_QUOTE_22= RULE_QUOTE ( (lv_filter_23_0= ruleTopLevel ) ) this_QUOTE_24= RULE_QUOTE ) ) ) ) )* ) ) )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1846:3: (this_DOT_2= RULE_DOT ( (lv_mapName_3_0= ruleMapId ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_DOT) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1846:4: this_DOT_2= RULE_DOT ( (lv_mapName_3_0= ruleMapId ) )
                    {
                    this_DOT_2=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleMap3809); 
                     
                        newLeafNode(this_DOT_2, grammarAccess.getMapAccess().getDOTTerminalRuleCall_2_0_0()); 
                        
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1850:1: ( (lv_mapName_3_0= ruleMapId ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1851:1: (lv_mapName_3_0= ruleMapId )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1851:1: (lv_mapName_3_0= ruleMapId )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1852:3: lv_mapName_3_0= ruleMapId
                    {
                     
                    	        newCompositeNode(grammarAccess.getMapAccess().getMapNameMapIdParserRuleCall_2_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMapId_in_ruleMap3829);
                    lv_mapName_3_0=ruleMapId();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMapRule());
                    	        }
                           		set(
                           			current, 
                           			"mapName",
                            		lv_mapName_3_0, 
                            		"MapId");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1868:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'ref' otherlv_6= '=' this_QUOTE_7= RULE_QUOTE ( (lv_ref_8_0= rulePathElement ) )+ this_QUOTE_9= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'object' otherlv_11= '=' this_QUOTE_12= RULE_QUOTE ( (lv_object_13_0= rulePathElement ) )+ this_QUOTE_14= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'name' otherlv_16= '=' this_QUOTE_17= RULE_QUOTE ( (lv_nameAttribute_18_0= RULE_ID ) ) this_QUOTE_19= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'filter' otherlv_21= '=' this_QUOTE_22= RULE_QUOTE ( (lv_filter_23_0= ruleTopLevel ) ) this_QUOTE_24= RULE_QUOTE ) ) ) ) )* ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1870:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'ref' otherlv_6= '=' this_QUOTE_7= RULE_QUOTE ( (lv_ref_8_0= rulePathElement ) )+ this_QUOTE_9= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'object' otherlv_11= '=' this_QUOTE_12= RULE_QUOTE ( (lv_object_13_0= rulePathElement ) )+ this_QUOTE_14= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'name' otherlv_16= '=' this_QUOTE_17= RULE_QUOTE ( (lv_nameAttribute_18_0= RULE_ID ) ) this_QUOTE_19= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'filter' otherlv_21= '=' this_QUOTE_22= RULE_QUOTE ( (lv_filter_23_0= ruleTopLevel ) ) this_QUOTE_24= RULE_QUOTE ) ) ) ) )* ) )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1870:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'ref' otherlv_6= '=' this_QUOTE_7= RULE_QUOTE ( (lv_ref_8_0= rulePathElement ) )+ this_QUOTE_9= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'object' otherlv_11= '=' this_QUOTE_12= RULE_QUOTE ( (lv_object_13_0= rulePathElement ) )+ this_QUOTE_14= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'name' otherlv_16= '=' this_QUOTE_17= RULE_QUOTE ( (lv_nameAttribute_18_0= RULE_ID ) ) this_QUOTE_19= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'filter' otherlv_21= '=' this_QUOTE_22= RULE_QUOTE ( (lv_filter_23_0= ruleTopLevel ) ) this_QUOTE_24= RULE_QUOTE ) ) ) ) )* ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1871:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'ref' otherlv_6= '=' this_QUOTE_7= RULE_QUOTE ( (lv_ref_8_0= rulePathElement ) )+ this_QUOTE_9= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'object' otherlv_11= '=' this_QUOTE_12= RULE_QUOTE ( (lv_object_13_0= rulePathElement ) )+ this_QUOTE_14= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'name' otherlv_16= '=' this_QUOTE_17= RULE_QUOTE ( (lv_nameAttribute_18_0= RULE_ID ) ) this_QUOTE_19= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'filter' otherlv_21= '=' this_QUOTE_22= RULE_QUOTE ( (lv_filter_23_0= ruleTopLevel ) ) this_QUOTE_24= RULE_QUOTE ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getMapAccess().getUnorderedGroup_2_1());
            	
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1874:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'ref' otherlv_6= '=' this_QUOTE_7= RULE_QUOTE ( (lv_ref_8_0= rulePathElement ) )+ this_QUOTE_9= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'object' otherlv_11= '=' this_QUOTE_12= RULE_QUOTE ( (lv_object_13_0= rulePathElement ) )+ this_QUOTE_14= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'name' otherlv_16= '=' this_QUOTE_17= RULE_QUOTE ( (lv_nameAttribute_18_0= RULE_ID ) ) this_QUOTE_19= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'filter' otherlv_21= '=' this_QUOTE_22= RULE_QUOTE ( (lv_filter_23_0= ruleTopLevel ) ) this_QUOTE_24= RULE_QUOTE ) ) ) ) )* )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1875:3: ( ({...}? => ( ({...}? => (otherlv_5= 'ref' otherlv_6= '=' this_QUOTE_7= RULE_QUOTE ( (lv_ref_8_0= rulePathElement ) )+ this_QUOTE_9= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'object' otherlv_11= '=' this_QUOTE_12= RULE_QUOTE ( (lv_object_13_0= rulePathElement ) )+ this_QUOTE_14= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'name' otherlv_16= '=' this_QUOTE_17= RULE_QUOTE ( (lv_nameAttribute_18_0= RULE_ID ) ) this_QUOTE_19= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'filter' otherlv_21= '=' this_QUOTE_22= RULE_QUOTE ( (lv_filter_23_0= ruleTopLevel ) ) this_QUOTE_24= RULE_QUOTE ) ) ) ) )*
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1875:3: ( ({...}? => ( ({...}? => (otherlv_5= 'ref' otherlv_6= '=' this_QUOTE_7= RULE_QUOTE ( (lv_ref_8_0= rulePathElement ) )+ this_QUOTE_9= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'object' otherlv_11= '=' this_QUOTE_12= RULE_QUOTE ( (lv_object_13_0= rulePathElement ) )+ this_QUOTE_14= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'name' otherlv_16= '=' this_QUOTE_17= RULE_QUOTE ( (lv_nameAttribute_18_0= RULE_ID ) ) this_QUOTE_19= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'filter' otherlv_21= '=' this_QUOTE_22= RULE_QUOTE ( (lv_filter_23_0= ruleTopLevel ) ) this_QUOTE_24= RULE_QUOTE ) ) ) ) )*
            loop31:
            do {
                int alt31=5;
                int LA31_0 = input.LA(1);

                if ( LA31_0 ==78 && getUnorderedGroupHelper().canSelect(grammarAccess.getMapAccess().getUnorderedGroup_2_1(), 0) ) {
                    alt31=1;
                }
                else if ( LA31_0 ==79 && getUnorderedGroupHelper().canSelect(grammarAccess.getMapAccess().getUnorderedGroup_2_1(), 1) ) {
                    alt31=2;
                }
                else if ( LA31_0 ==75 && getUnorderedGroupHelper().canSelect(grammarAccess.getMapAccess().getUnorderedGroup_2_1(), 2) ) {
                    alt31=3;
                }
                else if ( LA31_0 ==80 && getUnorderedGroupHelper().canSelect(grammarAccess.getMapAccess().getUnorderedGroup_2_1(), 3) ) {
                    alt31=4;
                }


                switch (alt31) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1877:4: ({...}? => ( ({...}? => (otherlv_5= 'ref' otherlv_6= '=' this_QUOTE_7= RULE_QUOTE ( (lv_ref_8_0= rulePathElement ) )+ this_QUOTE_9= RULE_QUOTE ) ) ) )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1877:4: ({...}? => ( ({...}? => (otherlv_5= 'ref' otherlv_6= '=' this_QUOTE_7= RULE_QUOTE ( (lv_ref_8_0= rulePathElement ) )+ this_QUOTE_9= RULE_QUOTE ) ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1878:5: {...}? => ( ({...}? => (otherlv_5= 'ref' otherlv_6= '=' this_QUOTE_7= RULE_QUOTE ( (lv_ref_8_0= rulePathElement ) )+ this_QUOTE_9= RULE_QUOTE ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMapAccess().getUnorderedGroup_2_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMap", "getUnorderedGroupHelper().canSelect(grammarAccess.getMapAccess().getUnorderedGroup_2_1(), 0)");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1878:102: ( ({...}? => (otherlv_5= 'ref' otherlv_6= '=' this_QUOTE_7= RULE_QUOTE ( (lv_ref_8_0= rulePathElement ) )+ this_QUOTE_9= RULE_QUOTE ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1879:6: ({...}? => (otherlv_5= 'ref' otherlv_6= '=' this_QUOTE_7= RULE_QUOTE ( (lv_ref_8_0= rulePathElement ) )+ this_QUOTE_9= RULE_QUOTE ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMapAccess().getUnorderedGroup_2_1(), 0);
            	    	 				
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1882:6: ({...}? => (otherlv_5= 'ref' otherlv_6= '=' this_QUOTE_7= RULE_QUOTE ( (lv_ref_8_0= rulePathElement ) )+ this_QUOTE_9= RULE_QUOTE ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1882:7: {...}? => (otherlv_5= 'ref' otherlv_6= '=' this_QUOTE_7= RULE_QUOTE ( (lv_ref_8_0= rulePathElement ) )+ this_QUOTE_9= RULE_QUOTE )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMap", "true");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1882:16: (otherlv_5= 'ref' otherlv_6= '=' this_QUOTE_7= RULE_QUOTE ( (lv_ref_8_0= rulePathElement ) )+ this_QUOTE_9= RULE_QUOTE )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1882:18: otherlv_5= 'ref' otherlv_6= '=' this_QUOTE_7= RULE_QUOTE ( (lv_ref_8_0= rulePathElement ) )+ this_QUOTE_9= RULE_QUOTE
            	    {
            	    otherlv_5=(Token)match(input,78,FOLLOW_78_in_ruleMap3889); 

            	        	newLeafNode(otherlv_5, grammarAccess.getMapAccess().getRefKeyword_2_1_0_0());
            	        
            	    otherlv_6=(Token)match(input,71,FOLLOW_71_in_ruleMap3901); 

            	        	newLeafNode(otherlv_6, grammarAccess.getMapAccess().getEqualsSignKeyword_2_1_0_1());
            	        
            	    this_QUOTE_7=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleMap3912); 
            	     
            	        newLeafNode(this_QUOTE_7, grammarAccess.getMapAccess().getQUOTETerminalRuleCall_2_1_0_2()); 
            	        
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1894:1: ( (lv_ref_8_0= rulePathElement ) )+
            	    int cnt29=0;
            	    loop29:
            	    do {
            	        int alt29=2;
            	        int LA29_0 = input.LA(1);

            	        if ( ((LA29_0>=RULE_ID && LA29_0<=RULE_PARENT)||LA29_0==RULE_TML_SEPARATOR) ) {
            	            alt29=1;
            	        }


            	        switch (alt29) {
            	    	case 1 :
            	    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1895:1: (lv_ref_8_0= rulePathElement )
            	    	    {
            	    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1895:1: (lv_ref_8_0= rulePathElement )
            	    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1896:3: lv_ref_8_0= rulePathElement
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getMapAccess().getRefPathElementParserRuleCall_2_1_0_3_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_rulePathElement_in_ruleMap3932);
            	    	    lv_ref_8_0=rulePathElement();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getMapRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"ref",
            	    	            		lv_ref_8_0, 
            	    	            		"PathElement");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt29 >= 1 ) break loop29;
            	                EarlyExitException eee =
            	                    new EarlyExitException(29, input);
            	                throw eee;
            	        }
            	        cnt29++;
            	    } while (true);

            	    this_QUOTE_9=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleMap3944); 
            	     
            	        newLeafNode(this_QUOTE_9, grammarAccess.getMapAccess().getQUOTETerminalRuleCall_2_1_0_4()); 
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMapAccess().getUnorderedGroup_2_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1923:4: ({...}? => ( ({...}? => (otherlv_10= 'object' otherlv_11= '=' this_QUOTE_12= RULE_QUOTE ( (lv_object_13_0= rulePathElement ) )+ this_QUOTE_14= RULE_QUOTE ) ) ) )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1923:4: ({...}? => ( ({...}? => (otherlv_10= 'object' otherlv_11= '=' this_QUOTE_12= RULE_QUOTE ( (lv_object_13_0= rulePathElement ) )+ this_QUOTE_14= RULE_QUOTE ) ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1924:5: {...}? => ( ({...}? => (otherlv_10= 'object' otherlv_11= '=' this_QUOTE_12= RULE_QUOTE ( (lv_object_13_0= rulePathElement ) )+ this_QUOTE_14= RULE_QUOTE ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMapAccess().getUnorderedGroup_2_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMap", "getUnorderedGroupHelper().canSelect(grammarAccess.getMapAccess().getUnorderedGroup_2_1(), 1)");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1924:102: ( ({...}? => (otherlv_10= 'object' otherlv_11= '=' this_QUOTE_12= RULE_QUOTE ( (lv_object_13_0= rulePathElement ) )+ this_QUOTE_14= RULE_QUOTE ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1925:6: ({...}? => (otherlv_10= 'object' otherlv_11= '=' this_QUOTE_12= RULE_QUOTE ( (lv_object_13_0= rulePathElement ) )+ this_QUOTE_14= RULE_QUOTE ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMapAccess().getUnorderedGroup_2_1(), 1);
            	    	 				
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1928:6: ({...}? => (otherlv_10= 'object' otherlv_11= '=' this_QUOTE_12= RULE_QUOTE ( (lv_object_13_0= rulePathElement ) )+ this_QUOTE_14= RULE_QUOTE ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1928:7: {...}? => (otherlv_10= 'object' otherlv_11= '=' this_QUOTE_12= RULE_QUOTE ( (lv_object_13_0= rulePathElement ) )+ this_QUOTE_14= RULE_QUOTE )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMap", "true");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1928:16: (otherlv_10= 'object' otherlv_11= '=' this_QUOTE_12= RULE_QUOTE ( (lv_object_13_0= rulePathElement ) )+ this_QUOTE_14= RULE_QUOTE )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1928:18: otherlv_10= 'object' otherlv_11= '=' this_QUOTE_12= RULE_QUOTE ( (lv_object_13_0= rulePathElement ) )+ this_QUOTE_14= RULE_QUOTE
            	    {
            	    otherlv_10=(Token)match(input,79,FOLLOW_79_in_ruleMap4011); 

            	        	newLeafNode(otherlv_10, grammarAccess.getMapAccess().getObjectKeyword_2_1_1_0());
            	        
            	    otherlv_11=(Token)match(input,71,FOLLOW_71_in_ruleMap4023); 

            	        	newLeafNode(otherlv_11, grammarAccess.getMapAccess().getEqualsSignKeyword_2_1_1_1());
            	        
            	    this_QUOTE_12=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleMap4034); 
            	     
            	        newLeafNode(this_QUOTE_12, grammarAccess.getMapAccess().getQUOTETerminalRuleCall_2_1_1_2()); 
            	        
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1940:1: ( (lv_object_13_0= rulePathElement ) )+
            	    int cnt30=0;
            	    loop30:
            	    do {
            	        int alt30=2;
            	        int LA30_0 = input.LA(1);

            	        if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_PARENT)||LA30_0==RULE_TML_SEPARATOR) ) {
            	            alt30=1;
            	        }


            	        switch (alt30) {
            	    	case 1 :
            	    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1941:1: (lv_object_13_0= rulePathElement )
            	    	    {
            	    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1941:1: (lv_object_13_0= rulePathElement )
            	    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1942:3: lv_object_13_0= rulePathElement
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getMapAccess().getObjectPathElementParserRuleCall_2_1_1_3_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_rulePathElement_in_ruleMap4054);
            	    	    lv_object_13_0=rulePathElement();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getMapRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"object",
            	    	            		lv_object_13_0, 
            	    	            		"PathElement");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt30 >= 1 ) break loop30;
            	                EarlyExitException eee =
            	                    new EarlyExitException(30, input);
            	                throw eee;
            	        }
            	        cnt30++;
            	    } while (true);

            	    this_QUOTE_14=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleMap4066); 
            	     
            	        newLeafNode(this_QUOTE_14, grammarAccess.getMapAccess().getQUOTETerminalRuleCall_2_1_1_4()); 
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMapAccess().getUnorderedGroup_2_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1969:4: ({...}? => ( ({...}? => (otherlv_15= 'name' otherlv_16= '=' this_QUOTE_17= RULE_QUOTE ( (lv_nameAttribute_18_0= RULE_ID ) ) this_QUOTE_19= RULE_QUOTE ) ) ) )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1969:4: ({...}? => ( ({...}? => (otherlv_15= 'name' otherlv_16= '=' this_QUOTE_17= RULE_QUOTE ( (lv_nameAttribute_18_0= RULE_ID ) ) this_QUOTE_19= RULE_QUOTE ) ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1970:5: {...}? => ( ({...}? => (otherlv_15= 'name' otherlv_16= '=' this_QUOTE_17= RULE_QUOTE ( (lv_nameAttribute_18_0= RULE_ID ) ) this_QUOTE_19= RULE_QUOTE ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMapAccess().getUnorderedGroup_2_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMap", "getUnorderedGroupHelper().canSelect(grammarAccess.getMapAccess().getUnorderedGroup_2_1(), 2)");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1970:102: ( ({...}? => (otherlv_15= 'name' otherlv_16= '=' this_QUOTE_17= RULE_QUOTE ( (lv_nameAttribute_18_0= RULE_ID ) ) this_QUOTE_19= RULE_QUOTE ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1971:6: ({...}? => (otherlv_15= 'name' otherlv_16= '=' this_QUOTE_17= RULE_QUOTE ( (lv_nameAttribute_18_0= RULE_ID ) ) this_QUOTE_19= RULE_QUOTE ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMapAccess().getUnorderedGroup_2_1(), 2);
            	    	 				
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1974:6: ({...}? => (otherlv_15= 'name' otherlv_16= '=' this_QUOTE_17= RULE_QUOTE ( (lv_nameAttribute_18_0= RULE_ID ) ) this_QUOTE_19= RULE_QUOTE ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1974:7: {...}? => (otherlv_15= 'name' otherlv_16= '=' this_QUOTE_17= RULE_QUOTE ( (lv_nameAttribute_18_0= RULE_ID ) ) this_QUOTE_19= RULE_QUOTE )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMap", "true");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1974:16: (otherlv_15= 'name' otherlv_16= '=' this_QUOTE_17= RULE_QUOTE ( (lv_nameAttribute_18_0= RULE_ID ) ) this_QUOTE_19= RULE_QUOTE )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1974:18: otherlv_15= 'name' otherlv_16= '=' this_QUOTE_17= RULE_QUOTE ( (lv_nameAttribute_18_0= RULE_ID ) ) this_QUOTE_19= RULE_QUOTE
            	    {
            	    otherlv_15=(Token)match(input,75,FOLLOW_75_in_ruleMap4133); 

            	        	newLeafNode(otherlv_15, grammarAccess.getMapAccess().getNameKeyword_2_1_2_0());
            	        
            	    otherlv_16=(Token)match(input,71,FOLLOW_71_in_ruleMap4145); 

            	        	newLeafNode(otherlv_16, grammarAccess.getMapAccess().getEqualsSignKeyword_2_1_2_1());
            	        
            	    this_QUOTE_17=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleMap4156); 
            	     
            	        newLeafNode(this_QUOTE_17, grammarAccess.getMapAccess().getQUOTETerminalRuleCall_2_1_2_2()); 
            	        
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1986:1: ( (lv_nameAttribute_18_0= RULE_ID ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1987:1: (lv_nameAttribute_18_0= RULE_ID )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1987:1: (lv_nameAttribute_18_0= RULE_ID )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:1988:3: lv_nameAttribute_18_0= RULE_ID
            	    {
            	    lv_nameAttribute_18_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMap4172); 

            	    			newLeafNode(lv_nameAttribute_18_0, grammarAccess.getMapAccess().getNameAttributeIDTerminalRuleCall_2_1_2_3_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMapRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"nameAttribute",
            	            		lv_nameAttribute_18_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    this_QUOTE_19=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleMap4188); 
            	     
            	        newLeafNode(this_QUOTE_19, grammarAccess.getMapAccess().getQUOTETerminalRuleCall_2_1_2_4()); 
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMapAccess().getUnorderedGroup_2_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2015:4: ({...}? => ( ({...}? => (otherlv_20= 'filter' otherlv_21= '=' this_QUOTE_22= RULE_QUOTE ( (lv_filter_23_0= ruleTopLevel ) ) this_QUOTE_24= RULE_QUOTE ) ) ) )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2015:4: ({...}? => ( ({...}? => (otherlv_20= 'filter' otherlv_21= '=' this_QUOTE_22= RULE_QUOTE ( (lv_filter_23_0= ruleTopLevel ) ) this_QUOTE_24= RULE_QUOTE ) ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2016:5: {...}? => ( ({...}? => (otherlv_20= 'filter' otherlv_21= '=' this_QUOTE_22= RULE_QUOTE ( (lv_filter_23_0= ruleTopLevel ) ) this_QUOTE_24= RULE_QUOTE ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMapAccess().getUnorderedGroup_2_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMap", "getUnorderedGroupHelper().canSelect(grammarAccess.getMapAccess().getUnorderedGroup_2_1(), 3)");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2016:102: ( ({...}? => (otherlv_20= 'filter' otherlv_21= '=' this_QUOTE_22= RULE_QUOTE ( (lv_filter_23_0= ruleTopLevel ) ) this_QUOTE_24= RULE_QUOTE ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2017:6: ({...}? => (otherlv_20= 'filter' otherlv_21= '=' this_QUOTE_22= RULE_QUOTE ( (lv_filter_23_0= ruleTopLevel ) ) this_QUOTE_24= RULE_QUOTE ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getMapAccess().getUnorderedGroup_2_1(), 3);
            	    	 				
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2020:6: ({...}? => (otherlv_20= 'filter' otherlv_21= '=' this_QUOTE_22= RULE_QUOTE ( (lv_filter_23_0= ruleTopLevel ) ) this_QUOTE_24= RULE_QUOTE ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2020:7: {...}? => (otherlv_20= 'filter' otherlv_21= '=' this_QUOTE_22= RULE_QUOTE ( (lv_filter_23_0= ruleTopLevel ) ) this_QUOTE_24= RULE_QUOTE )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMap", "true");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2020:16: (otherlv_20= 'filter' otherlv_21= '=' this_QUOTE_22= RULE_QUOTE ( (lv_filter_23_0= ruleTopLevel ) ) this_QUOTE_24= RULE_QUOTE )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2020:18: otherlv_20= 'filter' otherlv_21= '=' this_QUOTE_22= RULE_QUOTE ( (lv_filter_23_0= ruleTopLevel ) ) this_QUOTE_24= RULE_QUOTE
            	    {
            	    otherlv_20=(Token)match(input,80,FOLLOW_80_in_ruleMap4255); 

            	        	newLeafNode(otherlv_20, grammarAccess.getMapAccess().getFilterKeyword_2_1_3_0());
            	        
            	    otherlv_21=(Token)match(input,71,FOLLOW_71_in_ruleMap4267); 

            	        	newLeafNode(otherlv_21, grammarAccess.getMapAccess().getEqualsSignKeyword_2_1_3_1());
            	        
            	    this_QUOTE_22=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleMap4278); 
            	     
            	        newLeafNode(this_QUOTE_22, grammarAccess.getMapAccess().getQUOTETerminalRuleCall_2_1_3_2()); 
            	        
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2032:1: ( (lv_filter_23_0= ruleTopLevel ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2033:1: (lv_filter_23_0= ruleTopLevel )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2033:1: (lv_filter_23_0= ruleTopLevel )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2034:3: lv_filter_23_0= ruleTopLevel
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMapAccess().getFilterTopLevelParserRuleCall_2_1_3_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTopLevel_in_ruleMap4298);
            	    lv_filter_23_0=ruleTopLevel();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMapRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"filter",
            	            		lv_filter_23_0, 
            	            		"TopLevel");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    this_QUOTE_24=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleMap4309); 
            	     
            	        newLeafNode(this_QUOTE_24, grammarAccess.getMapAccess().getQUOTETerminalRuleCall_2_1_3_4()); 
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMapAccess().getUnorderedGroup_2_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getMapAccess().getUnorderedGroup_2_1());
            	

            }


            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2068:3: (this_XML_TAG_SINGLEEND_25= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_26_0= RULE_XML_TAG_END ) ) ( ( (lv_children_27_0= ruleMessage ) ) | ( (lv_children_28_0= ruleProperty ) ) | ( (lv_children_29_0= ruleParam ) ) | ( (lv_children_30_0= ruleMap ) ) | ( (lv_children_31_0= ruleMapMethod ) ) | ( (lv_children_32_0= ruleDebugTag ) ) | ( (lv_children_33_0= ruleField ) ) | ( (lv_children_34_0= ruleComment ) ) | ( (lv_children_35_0= ruleBreak ) ) )* (this_MAPENDKEYWORD_36= RULE_MAPENDKEYWORD (this_DOT_37= RULE_DOT ( (lv_mapClosingName_38_0= ruleMapId ) ) )? ( (lv_closedTag_39_0= RULE_XML_TAG_END ) ) ) ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_XML_TAG_SINGLEEND) ) {
                alt34=1;
            }
            else if ( (LA34_0==RULE_XML_TAG_END) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2068:4: this_XML_TAG_SINGLEEND_25= RULE_XML_TAG_SINGLEEND
                    {
                    this_XML_TAG_SINGLEEND_25=(Token)match(input,RULE_XML_TAG_SINGLEEND,FOLLOW_RULE_XML_TAG_SINGLEEND_in_ruleMap4362); 
                     
                        newLeafNode(this_XML_TAG_SINGLEEND_25, grammarAccess.getMapAccess().getXML_TAG_SINGLEENDTerminalRuleCall_3_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2073:6: ( ( (lv_splitTag_26_0= RULE_XML_TAG_END ) ) ( ( (lv_children_27_0= ruleMessage ) ) | ( (lv_children_28_0= ruleProperty ) ) | ( (lv_children_29_0= ruleParam ) ) | ( (lv_children_30_0= ruleMap ) ) | ( (lv_children_31_0= ruleMapMethod ) ) | ( (lv_children_32_0= ruleDebugTag ) ) | ( (lv_children_33_0= ruleField ) ) | ( (lv_children_34_0= ruleComment ) ) | ( (lv_children_35_0= ruleBreak ) ) )* (this_MAPENDKEYWORD_36= RULE_MAPENDKEYWORD (this_DOT_37= RULE_DOT ( (lv_mapClosingName_38_0= ruleMapId ) ) )? ( (lv_closedTag_39_0= RULE_XML_TAG_END ) ) ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2073:6: ( ( (lv_splitTag_26_0= RULE_XML_TAG_END ) ) ( ( (lv_children_27_0= ruleMessage ) ) | ( (lv_children_28_0= ruleProperty ) ) | ( (lv_children_29_0= ruleParam ) ) | ( (lv_children_30_0= ruleMap ) ) | ( (lv_children_31_0= ruleMapMethod ) ) | ( (lv_children_32_0= ruleDebugTag ) ) | ( (lv_children_33_0= ruleField ) ) | ( (lv_children_34_0= ruleComment ) ) | ( (lv_children_35_0= ruleBreak ) ) )* (this_MAPENDKEYWORD_36= RULE_MAPENDKEYWORD (this_DOT_37= RULE_DOT ( (lv_mapClosingName_38_0= ruleMapId ) ) )? ( (lv_closedTag_39_0= RULE_XML_TAG_END ) ) ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2073:7: ( (lv_splitTag_26_0= RULE_XML_TAG_END ) ) ( ( (lv_children_27_0= ruleMessage ) ) | ( (lv_children_28_0= ruleProperty ) ) | ( (lv_children_29_0= ruleParam ) ) | ( (lv_children_30_0= ruleMap ) ) | ( (lv_children_31_0= ruleMapMethod ) ) | ( (lv_children_32_0= ruleDebugTag ) ) | ( (lv_children_33_0= ruleField ) ) | ( (lv_children_34_0= ruleComment ) ) | ( (lv_children_35_0= ruleBreak ) ) )* (this_MAPENDKEYWORD_36= RULE_MAPENDKEYWORD (this_DOT_37= RULE_DOT ( (lv_mapClosingName_38_0= ruleMapId ) ) )? ( (lv_closedTag_39_0= RULE_XML_TAG_END ) ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2073:7: ( (lv_splitTag_26_0= RULE_XML_TAG_END ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2074:1: (lv_splitTag_26_0= RULE_XML_TAG_END )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2074:1: (lv_splitTag_26_0= RULE_XML_TAG_END )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2075:3: lv_splitTag_26_0= RULE_XML_TAG_END
                    {
                    lv_splitTag_26_0=(Token)match(input,RULE_XML_TAG_END,FOLLOW_RULE_XML_TAG_END_in_ruleMap4385); 

                    			newLeafNode(lv_splitTag_26_0, grammarAccess.getMapAccess().getSplitTagXML_TAG_ENDTerminalRuleCall_3_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMapRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"splitTag",
                            		true, 
                            		"XML_TAG_END");
                    	    

                    }


                    }

                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2091:2: ( ( (lv_children_27_0= ruleMessage ) ) | ( (lv_children_28_0= ruleProperty ) ) | ( (lv_children_29_0= ruleParam ) ) | ( (lv_children_30_0= ruleMap ) ) | ( (lv_children_31_0= ruleMapMethod ) ) | ( (lv_children_32_0= ruleDebugTag ) ) | ( (lv_children_33_0= ruleField ) ) | ( (lv_children_34_0= ruleComment ) ) | ( (lv_children_35_0= ruleBreak ) ) )*
                    loop32:
                    do {
                        int alt32=10;
                        switch ( input.LA(1) ) {
                        case RULE_MESSAGE_START_TAG:
                            {
                            alt32=1;
                            }
                            break;
                        case RULE_PROPERTY_START_TAG:
                            {
                            alt32=2;
                            }
                            break;
                        case RULE_PARAM_START_TAG:
                            {
                            alt32=3;
                            }
                            break;
                        case RULE_MAPSTARTKEYWORD:
                            {
                            alt32=4;
                            }
                            break;
                        case RULE_MAP_METHOD_STARTTAG_START:
                            {
                            alt32=5;
                            }
                            break;
                        case RULE_DEBUG_START_TAG:
                            {
                            alt32=6;
                            }
                            break;
                        case RULE_FIELD_START_TAG:
                            {
                            alt32=7;
                            }
                            break;
                        case RULE_COMMENT_START_TAG:
                            {
                            alt32=8;
                            }
                            break;
                        case RULE_BREAK_START_TAG:
                            {
                            alt32=9;
                            }
                            break;

                        }

                        switch (alt32) {
                    	case 1 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2091:3: ( (lv_children_27_0= ruleMessage ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2091:3: ( (lv_children_27_0= ruleMessage ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2092:1: (lv_children_27_0= ruleMessage )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2092:1: (lv_children_27_0= ruleMessage )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2093:3: lv_children_27_0= ruleMessage
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMapAccess().getChildrenMessageParserRuleCall_3_1_1_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMessage_in_ruleMap4412);
                    	    lv_children_27_0=ruleMessage();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMapRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_27_0, 
                    	            		"Message");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2110:6: ( (lv_children_28_0= ruleProperty ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2110:6: ( (lv_children_28_0= ruleProperty ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2111:1: (lv_children_28_0= ruleProperty )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2111:1: (lv_children_28_0= ruleProperty )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2112:3: lv_children_28_0= ruleProperty
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMapAccess().getChildrenPropertyParserRuleCall_3_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleProperty_in_ruleMap4439);
                    	    lv_children_28_0=ruleProperty();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMapRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_28_0, 
                    	            		"Property");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2129:6: ( (lv_children_29_0= ruleParam ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2129:6: ( (lv_children_29_0= ruleParam ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2130:1: (lv_children_29_0= ruleParam )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2130:1: (lv_children_29_0= ruleParam )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2131:3: lv_children_29_0= ruleParam
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMapAccess().getChildrenParamParserRuleCall_3_1_1_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParam_in_ruleMap4466);
                    	    lv_children_29_0=ruleParam();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMapRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_29_0, 
                    	            		"Param");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2148:6: ( (lv_children_30_0= ruleMap ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2148:6: ( (lv_children_30_0= ruleMap ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2149:1: (lv_children_30_0= ruleMap )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2149:1: (lv_children_30_0= ruleMap )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2150:3: lv_children_30_0= ruleMap
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMapAccess().getChildrenMapParserRuleCall_3_1_1_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMap_in_ruleMap4493);
                    	    lv_children_30_0=ruleMap();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMapRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_30_0, 
                    	            		"Map");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2167:6: ( (lv_children_31_0= ruleMapMethod ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2167:6: ( (lv_children_31_0= ruleMapMethod ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2168:1: (lv_children_31_0= ruleMapMethod )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2168:1: (lv_children_31_0= ruleMapMethod )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2169:3: lv_children_31_0= ruleMapMethod
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMapAccess().getChildrenMapMethodParserRuleCall_3_1_1_4_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMapMethod_in_ruleMap4520);
                    	    lv_children_31_0=ruleMapMethod();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMapRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_31_0, 
                    	            		"MapMethod");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2186:6: ( (lv_children_32_0= ruleDebugTag ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2186:6: ( (lv_children_32_0= ruleDebugTag ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2187:1: (lv_children_32_0= ruleDebugTag )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2187:1: (lv_children_32_0= ruleDebugTag )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2188:3: lv_children_32_0= ruleDebugTag
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMapAccess().getChildrenDebugTagParserRuleCall_3_1_1_5_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDebugTag_in_ruleMap4547);
                    	    lv_children_32_0=ruleDebugTag();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMapRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_32_0, 
                    	            		"DebugTag");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 7 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2205:6: ( (lv_children_33_0= ruleField ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2205:6: ( (lv_children_33_0= ruleField ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2206:1: (lv_children_33_0= ruleField )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2206:1: (lv_children_33_0= ruleField )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2207:3: lv_children_33_0= ruleField
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMapAccess().getChildrenFieldParserRuleCall_3_1_1_6_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleField_in_ruleMap4574);
                    	    lv_children_33_0=ruleField();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMapRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_33_0, 
                    	            		"Field");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 8 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2224:6: ( (lv_children_34_0= ruleComment ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2224:6: ( (lv_children_34_0= ruleComment ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2225:1: (lv_children_34_0= ruleComment )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2225:1: (lv_children_34_0= ruleComment )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2226:3: lv_children_34_0= ruleComment
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMapAccess().getChildrenCommentParserRuleCall_3_1_1_7_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleComment_in_ruleMap4601);
                    	    lv_children_34_0=ruleComment();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMapRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_34_0, 
                    	            		"Comment");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 9 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2243:6: ( (lv_children_35_0= ruleBreak ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2243:6: ( (lv_children_35_0= ruleBreak ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2244:1: (lv_children_35_0= ruleBreak )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2244:1: (lv_children_35_0= ruleBreak )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2245:3: lv_children_35_0= ruleBreak
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMapAccess().getChildrenBreakParserRuleCall_3_1_1_8_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleBreak_in_ruleMap4628);
                    	    lv_children_35_0=ruleBreak();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMapRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_35_0, 
                    	            		"Break");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2261:4: (this_MAPENDKEYWORD_36= RULE_MAPENDKEYWORD (this_DOT_37= RULE_DOT ( (lv_mapClosingName_38_0= ruleMapId ) ) )? ( (lv_closedTag_39_0= RULE_XML_TAG_END ) ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2261:5: this_MAPENDKEYWORD_36= RULE_MAPENDKEYWORD (this_DOT_37= RULE_DOT ( (lv_mapClosingName_38_0= ruleMapId ) ) )? ( (lv_closedTag_39_0= RULE_XML_TAG_END ) )
                    {
                    this_MAPENDKEYWORD_36=(Token)match(input,RULE_MAPENDKEYWORD,FOLLOW_RULE_MAPENDKEYWORD_in_ruleMap4642); 
                     
                        newLeafNode(this_MAPENDKEYWORD_36, grammarAccess.getMapAccess().getMAPENDKEYWORDTerminalRuleCall_3_1_2_0()); 
                        
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2265:1: (this_DOT_37= RULE_DOT ( (lv_mapClosingName_38_0= ruleMapId ) ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_DOT) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2265:2: this_DOT_37= RULE_DOT ( (lv_mapClosingName_38_0= ruleMapId ) )
                            {
                            this_DOT_37=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleMap4653); 
                             
                                newLeafNode(this_DOT_37, grammarAccess.getMapAccess().getDOTTerminalRuleCall_3_1_2_1_0()); 
                                
                            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2269:1: ( (lv_mapClosingName_38_0= ruleMapId ) )
                            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2270:1: (lv_mapClosingName_38_0= ruleMapId )
                            {
                            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2270:1: (lv_mapClosingName_38_0= ruleMapId )
                            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2271:3: lv_mapClosingName_38_0= ruleMapId
                            {
                             
                            	        newCompositeNode(grammarAccess.getMapAccess().getMapClosingNameMapIdParserRuleCall_3_1_2_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleMapId_in_ruleMap4673);
                            lv_mapClosingName_38_0=ruleMapId();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getMapRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"mapClosingName",
                                    		lv_mapClosingName_38_0, 
                                    		"MapId");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2287:4: ( (lv_closedTag_39_0= RULE_XML_TAG_END ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2288:1: (lv_closedTag_39_0= RULE_XML_TAG_END )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2288:1: (lv_closedTag_39_0= RULE_XML_TAG_END )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2289:3: lv_closedTag_39_0= RULE_XML_TAG_END
                    {
                    lv_closedTag_39_0=(Token)match(input,RULE_XML_TAG_END,FOLLOW_RULE_XML_TAG_END_in_ruleMap4692); 

                    			newLeafNode(lv_closedTag_39_0, grammarAccess.getMapAccess().getClosedTagXML_TAG_ENDTerminalRuleCall_3_1_2_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMapRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"closedTag",
                            		true, 
                            		"XML_TAG_END");
                    	    

                    }


                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMap"


    // $ANTLR start "entryRuleMapId"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2313:1: entryRuleMapId returns [String current=null] : iv_ruleMapId= ruleMapId EOF ;
    public final String entryRuleMapId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMapId = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2314:2: (iv_ruleMapId= ruleMapId EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2315:2: iv_ruleMapId= ruleMapId EOF
            {
             newCompositeNode(grammarAccess.getMapIdRule()); 
            pushFollow(FOLLOW_ruleMapId_in_entryRuleMapId4737);
            iv_ruleMapId=ruleMapId();

            state._fsp--;

             current =iv_ruleMapId.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapId4748); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapId"


    // $ANTLR start "ruleMapId"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2322:1: ruleMapId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleMapId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2325:28: (this_ID_0= RULE_ID )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2326:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapId4787); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getMapIdAccess().getIDTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapId"


    // $ANTLR start "entryRuleRequired"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2341:1: entryRuleRequired returns [EObject current=null] : iv_ruleRequired= ruleRequired EOF ;
    public final EObject entryRuleRequired() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequired = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2342:2: (iv_ruleRequired= ruleRequired EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2343:2: iv_ruleRequired= ruleRequired EOF
            {
             newCompositeNode(grammarAccess.getRequiredRule()); 
            pushFollow(FOLLOW_ruleRequired_in_entryRuleRequired4831);
            iv_ruleRequired=ruleRequired();

            state._fsp--;

             current =iv_ruleRequired; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequired4841); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequired"


    // $ANTLR start "ruleRequired"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2350:1: ruleRequired returns [EObject current=null] : (this_REQUIRED_START_TAG_0= RULE_REQUIRED_START_TAG () ( (lv_attributes_2_0= ruleNonExpression ) )* (this_XML_TAG_SINGLEEND_3= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_4_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_5_0= RULE_REQUIRED_END_TAG ) ) ) ) ) ;
    public final EObject ruleRequired() throws RecognitionException {
        EObject current = null;

        Token this_REQUIRED_START_TAG_0=null;
        Token this_XML_TAG_SINGLEEND_3=null;
        Token lv_splitTag_4_0=null;
        Token lv_closedTag_5_0=null;
        EObject lv_attributes_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2353:28: ( (this_REQUIRED_START_TAG_0= RULE_REQUIRED_START_TAG () ( (lv_attributes_2_0= ruleNonExpression ) )* (this_XML_TAG_SINGLEEND_3= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_4_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_5_0= RULE_REQUIRED_END_TAG ) ) ) ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2354:1: (this_REQUIRED_START_TAG_0= RULE_REQUIRED_START_TAG () ( (lv_attributes_2_0= ruleNonExpression ) )* (this_XML_TAG_SINGLEEND_3= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_4_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_5_0= RULE_REQUIRED_END_TAG ) ) ) ) )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2354:1: (this_REQUIRED_START_TAG_0= RULE_REQUIRED_START_TAG () ( (lv_attributes_2_0= ruleNonExpression ) )* (this_XML_TAG_SINGLEEND_3= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_4_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_5_0= RULE_REQUIRED_END_TAG ) ) ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2354:2: this_REQUIRED_START_TAG_0= RULE_REQUIRED_START_TAG () ( (lv_attributes_2_0= ruleNonExpression ) )* (this_XML_TAG_SINGLEEND_3= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_4_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_5_0= RULE_REQUIRED_END_TAG ) ) ) )
            {
            this_REQUIRED_START_TAG_0=(Token)match(input,RULE_REQUIRED_START_TAG,FOLLOW_RULE_REQUIRED_START_TAG_in_ruleRequired4877); 
             
                newLeafNode(this_REQUIRED_START_TAG_0, grammarAccess.getRequiredAccess().getREQUIRED_START_TAGTerminalRuleCall_0()); 
                
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2358:1: ()
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2359:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRequiredAccess().getRequiredAction_1(),
                        current);
                

            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2364:2: ( (lv_attributes_2_0= ruleNonExpression ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2365:1: (lv_attributes_2_0= ruleNonExpression )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2365:1: (lv_attributes_2_0= ruleNonExpression )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2366:3: lv_attributes_2_0= ruleNonExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRequiredAccess().getAttributesNonExpressionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNonExpression_in_ruleRequired4906);
            	    lv_attributes_2_0=ruleNonExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRequiredRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_2_0, 
            	            		"NonExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2382:3: (this_XML_TAG_SINGLEEND_3= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_4_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_5_0= RULE_REQUIRED_END_TAG ) ) ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_XML_TAG_SINGLEEND) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_XML_TAG_END) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2382:4: this_XML_TAG_SINGLEEND_3= RULE_XML_TAG_SINGLEEND
                    {
                    this_XML_TAG_SINGLEEND_3=(Token)match(input,RULE_XML_TAG_SINGLEEND,FOLLOW_RULE_XML_TAG_SINGLEEND_in_ruleRequired4919); 
                     
                        newLeafNode(this_XML_TAG_SINGLEEND_3, grammarAccess.getRequiredAccess().getXML_TAG_SINGLEENDTerminalRuleCall_3_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2387:6: ( ( (lv_splitTag_4_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_5_0= RULE_REQUIRED_END_TAG ) ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2387:6: ( ( (lv_splitTag_4_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_5_0= RULE_REQUIRED_END_TAG ) ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2387:7: ( (lv_splitTag_4_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_5_0= RULE_REQUIRED_END_TAG ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2387:7: ( (lv_splitTag_4_0= RULE_XML_TAG_END ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2388:1: (lv_splitTag_4_0= RULE_XML_TAG_END )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2388:1: (lv_splitTag_4_0= RULE_XML_TAG_END )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2389:3: lv_splitTag_4_0= RULE_XML_TAG_END
                    {
                    lv_splitTag_4_0=(Token)match(input,RULE_XML_TAG_END,FOLLOW_RULE_XML_TAG_END_in_ruleRequired4942); 

                    			newLeafNode(lv_splitTag_4_0, grammarAccess.getRequiredAccess().getSplitTagXML_TAG_ENDTerminalRuleCall_3_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRequiredRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"splitTag",
                            		true, 
                            		"XML_TAG_END");
                    	    

                    }


                    }

                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2405:2: ( (lv_closedTag_5_0= RULE_REQUIRED_END_TAG ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2406:1: (lv_closedTag_5_0= RULE_REQUIRED_END_TAG )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2406:1: (lv_closedTag_5_0= RULE_REQUIRED_END_TAG )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2407:3: lv_closedTag_5_0= RULE_REQUIRED_END_TAG
                    {
                    lv_closedTag_5_0=(Token)match(input,RULE_REQUIRED_END_TAG,FOLLOW_RULE_REQUIRED_END_TAG_in_ruleRequired4964); 

                    			newLeafNode(lv_closedTag_5_0, grammarAccess.getRequiredAccess().getClosedTagREQUIRED_END_TAGTerminalRuleCall_3_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRequiredRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"closedTag",
                            		true, 
                            		"REQUIRED_END_TAG");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequired"


    // $ANTLR start "entryRuleProperty"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2431:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2432:2: (iv_ruleProperty= ruleProperty EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2433:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty5007);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty5017); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2440:1: ruleProperty returns [EObject current=null] : (this_PROPERTY_START_TAG_0= RULE_PROPERTY_START_TAG () ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'length' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_length_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cardinality' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_cardinality_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'direction' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_direction_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'subtypes' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_subtypes_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'name' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_nameAttribute_26_0= RULE_ID ) ) this_QUOTE_27= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'type' otherlv_29= '=' this_QUOTE_30= RULE_QUOTE ( (lv_type_31_0= RULE_ID ) ) this_QUOTE_32= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'condition' otherlv_34= '=' this_QUOTE_35= RULE_QUOTE ( (lv_condition_36_0= ruleTopLevel ) ) this_QUOTE_37= RULE_QUOTE ) ) ) ) )* ) ) ) (this_XML_TAG_SINGLEEND_38= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_39_0= RULE_XML_TAG_END ) ) ( ( (lv_children_40_0= ruleExpressionOrOption ) ) | ( (lv_children_41_0= ruleMap ) ) )* ( (lv_closedTag_42_0= RULE_PROPERTY_END_TAG ) ) ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token this_PROPERTY_START_TAG_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_QUOTE_5=null;
        Token lv_length_6_0=null;
        Token this_QUOTE_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token this_QUOTE_10=null;
        Token lv_cardinality_11_0=null;
        Token this_QUOTE_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token this_QUOTE_15=null;
        Token lv_direction_16_0=null;
        Token this_QUOTE_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token this_QUOTE_20=null;
        Token lv_subtypes_21_0=null;
        Token this_QUOTE_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token this_QUOTE_25=null;
        Token lv_nameAttribute_26_0=null;
        Token this_QUOTE_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token this_QUOTE_30=null;
        Token lv_type_31_0=null;
        Token this_QUOTE_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token this_QUOTE_35=null;
        Token this_QUOTE_37=null;
        Token this_XML_TAG_SINGLEEND_38=null;
        Token lv_splitTag_39_0=null;
        Token lv_closedTag_42_0=null;
        EObject lv_condition_36_0 = null;

        EObject lv_children_40_0 = null;

        EObject lv_children_41_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2443:28: ( (this_PROPERTY_START_TAG_0= RULE_PROPERTY_START_TAG () ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'length' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_length_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cardinality' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_cardinality_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'direction' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_direction_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'subtypes' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_subtypes_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'name' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_nameAttribute_26_0= RULE_ID ) ) this_QUOTE_27= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'type' otherlv_29= '=' this_QUOTE_30= RULE_QUOTE ( (lv_type_31_0= RULE_ID ) ) this_QUOTE_32= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'condition' otherlv_34= '=' this_QUOTE_35= RULE_QUOTE ( (lv_condition_36_0= ruleTopLevel ) ) this_QUOTE_37= RULE_QUOTE ) ) ) ) )* ) ) ) (this_XML_TAG_SINGLEEND_38= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_39_0= RULE_XML_TAG_END ) ) ( ( (lv_children_40_0= ruleExpressionOrOption ) ) | ( (lv_children_41_0= ruleMap ) ) )* ( (lv_closedTag_42_0= RULE_PROPERTY_END_TAG ) ) ) ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2444:1: (this_PROPERTY_START_TAG_0= RULE_PROPERTY_START_TAG () ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'length' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_length_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cardinality' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_cardinality_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'direction' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_direction_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'subtypes' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_subtypes_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'name' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_nameAttribute_26_0= RULE_ID ) ) this_QUOTE_27= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'type' otherlv_29= '=' this_QUOTE_30= RULE_QUOTE ( (lv_type_31_0= RULE_ID ) ) this_QUOTE_32= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'condition' otherlv_34= '=' this_QUOTE_35= RULE_QUOTE ( (lv_condition_36_0= ruleTopLevel ) ) this_QUOTE_37= RULE_QUOTE ) ) ) ) )* ) ) ) (this_XML_TAG_SINGLEEND_38= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_39_0= RULE_XML_TAG_END ) ) ( ( (lv_children_40_0= ruleExpressionOrOption ) ) | ( (lv_children_41_0= ruleMap ) ) )* ( (lv_closedTag_42_0= RULE_PROPERTY_END_TAG ) ) ) ) )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2444:1: (this_PROPERTY_START_TAG_0= RULE_PROPERTY_START_TAG () ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'length' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_length_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cardinality' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_cardinality_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'direction' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_direction_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'subtypes' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_subtypes_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'name' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_nameAttribute_26_0= RULE_ID ) ) this_QUOTE_27= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'type' otherlv_29= '=' this_QUOTE_30= RULE_QUOTE ( (lv_type_31_0= RULE_ID ) ) this_QUOTE_32= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'condition' otherlv_34= '=' this_QUOTE_35= RULE_QUOTE ( (lv_condition_36_0= ruleTopLevel ) ) this_QUOTE_37= RULE_QUOTE ) ) ) ) )* ) ) ) (this_XML_TAG_SINGLEEND_38= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_39_0= RULE_XML_TAG_END ) ) ( ( (lv_children_40_0= ruleExpressionOrOption ) ) | ( (lv_children_41_0= ruleMap ) ) )* ( (lv_closedTag_42_0= RULE_PROPERTY_END_TAG ) ) ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2444:2: this_PROPERTY_START_TAG_0= RULE_PROPERTY_START_TAG () ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'length' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_length_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cardinality' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_cardinality_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'direction' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_direction_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'subtypes' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_subtypes_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'name' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_nameAttribute_26_0= RULE_ID ) ) this_QUOTE_27= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'type' otherlv_29= '=' this_QUOTE_30= RULE_QUOTE ( (lv_type_31_0= RULE_ID ) ) this_QUOTE_32= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'condition' otherlv_34= '=' this_QUOTE_35= RULE_QUOTE ( (lv_condition_36_0= ruleTopLevel ) ) this_QUOTE_37= RULE_QUOTE ) ) ) ) )* ) ) ) (this_XML_TAG_SINGLEEND_38= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_39_0= RULE_XML_TAG_END ) ) ( ( (lv_children_40_0= ruleExpressionOrOption ) ) | ( (lv_children_41_0= ruleMap ) ) )* ( (lv_closedTag_42_0= RULE_PROPERTY_END_TAG ) ) ) )
            {
            this_PROPERTY_START_TAG_0=(Token)match(input,RULE_PROPERTY_START_TAG,FOLLOW_RULE_PROPERTY_START_TAG_in_ruleProperty5053); 
             
                newLeafNode(this_PROPERTY_START_TAG_0, grammarAccess.getPropertyAccess().getPROPERTY_START_TAGTerminalRuleCall_0()); 
                
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2448:1: ()
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2449:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPropertyAccess().getPropertyAction_1(),
                        current);
                

            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2454:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'length' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_length_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cardinality' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_cardinality_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'direction' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_direction_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'subtypes' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_subtypes_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'name' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_nameAttribute_26_0= RULE_ID ) ) this_QUOTE_27= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'type' otherlv_29= '=' this_QUOTE_30= RULE_QUOTE ( (lv_type_31_0= RULE_ID ) ) this_QUOTE_32= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'condition' otherlv_34= '=' this_QUOTE_35= RULE_QUOTE ( (lv_condition_36_0= ruleTopLevel ) ) this_QUOTE_37= RULE_QUOTE ) ) ) ) )* ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2456:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'length' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_length_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cardinality' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_cardinality_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'direction' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_direction_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'subtypes' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_subtypes_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'name' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_nameAttribute_26_0= RULE_ID ) ) this_QUOTE_27= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'type' otherlv_29= '=' this_QUOTE_30= RULE_QUOTE ( (lv_type_31_0= RULE_ID ) ) this_QUOTE_32= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'condition' otherlv_34= '=' this_QUOTE_35= RULE_QUOTE ( (lv_condition_36_0= ruleTopLevel ) ) this_QUOTE_37= RULE_QUOTE ) ) ) ) )* ) )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2456:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'length' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_length_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cardinality' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_cardinality_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'direction' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_direction_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'subtypes' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_subtypes_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'name' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_nameAttribute_26_0= RULE_ID ) ) this_QUOTE_27= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'type' otherlv_29= '=' this_QUOTE_30= RULE_QUOTE ( (lv_type_31_0= RULE_ID ) ) this_QUOTE_32= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'condition' otherlv_34= '=' this_QUOTE_35= RULE_QUOTE ( (lv_condition_36_0= ruleTopLevel ) ) this_QUOTE_37= RULE_QUOTE ) ) ) ) )* ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2457:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'length' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_length_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cardinality' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_cardinality_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'direction' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_direction_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'subtypes' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_subtypes_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'name' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_nameAttribute_26_0= RULE_ID ) ) this_QUOTE_27= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'type' otherlv_29= '=' this_QUOTE_30= RULE_QUOTE ( (lv_type_31_0= RULE_ID ) ) this_QUOTE_32= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'condition' otherlv_34= '=' this_QUOTE_35= RULE_QUOTE ( (lv_condition_36_0= ruleTopLevel ) ) this_QUOTE_37= RULE_QUOTE ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getPropertyAccess().getUnorderedGroup_2());
            	
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2460:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'length' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_length_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cardinality' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_cardinality_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'direction' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_direction_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'subtypes' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_subtypes_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'name' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_nameAttribute_26_0= RULE_ID ) ) this_QUOTE_27= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'type' otherlv_29= '=' this_QUOTE_30= RULE_QUOTE ( (lv_type_31_0= RULE_ID ) ) this_QUOTE_32= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'condition' otherlv_34= '=' this_QUOTE_35= RULE_QUOTE ( (lv_condition_36_0= ruleTopLevel ) ) this_QUOTE_37= RULE_QUOTE ) ) ) ) )* )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2461:3: ( ({...}? => ( ({...}? => (otherlv_3= 'length' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_length_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cardinality' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_cardinality_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'direction' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_direction_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'subtypes' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_subtypes_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'name' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_nameAttribute_26_0= RULE_ID ) ) this_QUOTE_27= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'type' otherlv_29= '=' this_QUOTE_30= RULE_QUOTE ( (lv_type_31_0= RULE_ID ) ) this_QUOTE_32= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'condition' otherlv_34= '=' this_QUOTE_35= RULE_QUOTE ( (lv_condition_36_0= ruleTopLevel ) ) this_QUOTE_37= RULE_QUOTE ) ) ) ) )*
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2461:3: ( ({...}? => ( ({...}? => (otherlv_3= 'length' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_length_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'cardinality' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_cardinality_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'direction' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_direction_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'subtypes' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_subtypes_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'name' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_nameAttribute_26_0= RULE_ID ) ) this_QUOTE_27= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'type' otherlv_29= '=' this_QUOTE_30= RULE_QUOTE ( (lv_type_31_0= RULE_ID ) ) this_QUOTE_32= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'condition' otherlv_34= '=' this_QUOTE_35= RULE_QUOTE ( (lv_condition_36_0= ruleTopLevel ) ) this_QUOTE_37= RULE_QUOTE ) ) ) ) )*
            loop37:
            do {
                int alt37=8;
                int LA37_0 = input.LA(1);

                if ( LA37_0 ==81 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyAccess().getUnorderedGroup_2(), 0) ) {
                    alt37=1;
                }
                else if ( LA37_0 ==82 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyAccess().getUnorderedGroup_2(), 1) ) {
                    alt37=2;
                }
                else if ( LA37_0 ==83 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyAccess().getUnorderedGroup_2(), 2) ) {
                    alt37=3;
                }
                else if ( LA37_0 ==84 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyAccess().getUnorderedGroup_2(), 3) ) {
                    alt37=4;
                }
                else if ( LA37_0 ==75 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyAccess().getUnorderedGroup_2(), 4) ) {
                    alt37=5;
                }
                else if ( LA37_0 ==76 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyAccess().getUnorderedGroup_2(), 5) ) {
                    alt37=6;
                }
                else if ( LA37_0 ==77 && getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyAccess().getUnorderedGroup_2(), 6) ) {
                    alt37=7;
                }


                switch (alt37) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2463:4: ({...}? => ( ({...}? => (otherlv_3= 'length' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_length_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE ) ) ) )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2463:4: ({...}? => ( ({...}? => (otherlv_3= 'length' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_length_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE ) ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2464:5: {...}? => ( ({...}? => (otherlv_3= 'length' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_length_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleProperty", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2464:105: ( ({...}? => (otherlv_3= 'length' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_length_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2465:6: ({...}? => (otherlv_3= 'length' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_length_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2468:6: ({...}? => (otherlv_3= 'length' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_length_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2468:7: {...}? => (otherlv_3= 'length' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_length_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProperty", "true");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2468:16: (otherlv_3= 'length' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_length_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2468:18: otherlv_3= 'length' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_length_6_0= RULE_NUMBER ) ) this_QUOTE_7= RULE_QUOTE
            	    {
            	    otherlv_3=(Token)match(input,81,FOLLOW_81_in_ruleProperty5119); 

            	        	newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getLengthKeyword_2_0_0());
            	        
            	    otherlv_4=(Token)match(input,71,FOLLOW_71_in_ruleProperty5131); 

            	        	newLeafNode(otherlv_4, grammarAccess.getPropertyAccess().getEqualsSignKeyword_2_0_1());
            	        
            	    this_QUOTE_5=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleProperty5142); 
            	     
            	        newLeafNode(this_QUOTE_5, grammarAccess.getPropertyAccess().getQUOTETerminalRuleCall_2_0_2()); 
            	        
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2480:1: ( (lv_length_6_0= RULE_NUMBER ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2481:1: (lv_length_6_0= RULE_NUMBER )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2481:1: (lv_length_6_0= RULE_NUMBER )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2482:3: lv_length_6_0= RULE_NUMBER
            	    {
            	    lv_length_6_0=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleProperty5158); 

            	    			newLeafNode(lv_length_6_0, grammarAccess.getPropertyAccess().getLengthNUMBERTerminalRuleCall_2_0_3_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPropertyRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"length",
            	            		lv_length_6_0, 
            	            		"NUMBER");
            	    	    

            	    }


            	    }

            	    this_QUOTE_7=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleProperty5174); 
            	     
            	        newLeafNode(this_QUOTE_7, grammarAccess.getPropertyAccess().getQUOTETerminalRuleCall_2_0_4()); 
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertyAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2509:4: ({...}? => ( ({...}? => (otherlv_8= 'cardinality' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_cardinality_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2509:4: ({...}? => ( ({...}? => (otherlv_8= 'cardinality' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_cardinality_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2510:5: {...}? => ( ({...}? => (otherlv_8= 'cardinality' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_cardinality_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleProperty", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2510:105: ( ({...}? => (otherlv_8= 'cardinality' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_cardinality_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2511:6: ({...}? => (otherlv_8= 'cardinality' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_cardinality_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2514:6: ({...}? => (otherlv_8= 'cardinality' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_cardinality_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2514:7: {...}? => (otherlv_8= 'cardinality' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_cardinality_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProperty", "true");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2514:16: (otherlv_8= 'cardinality' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_cardinality_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2514:18: otherlv_8= 'cardinality' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_cardinality_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE
            	    {
            	    otherlv_8=(Token)match(input,82,FOLLOW_82_in_ruleProperty5241); 

            	        	newLeafNode(otherlv_8, grammarAccess.getPropertyAccess().getCardinalityKeyword_2_1_0());
            	        
            	    otherlv_9=(Token)match(input,71,FOLLOW_71_in_ruleProperty5253); 

            	        	newLeafNode(otherlv_9, grammarAccess.getPropertyAccess().getEqualsSignKeyword_2_1_1());
            	        
            	    this_QUOTE_10=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleProperty5264); 
            	     
            	        newLeafNode(this_QUOTE_10, grammarAccess.getPropertyAccess().getQUOTETerminalRuleCall_2_1_2()); 
            	        
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2526:1: ( (lv_cardinality_11_0= RULE_ID ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2527:1: (lv_cardinality_11_0= RULE_ID )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2527:1: (lv_cardinality_11_0= RULE_ID )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2528:3: lv_cardinality_11_0= RULE_ID
            	    {
            	    lv_cardinality_11_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty5280); 

            	    			newLeafNode(lv_cardinality_11_0, grammarAccess.getPropertyAccess().getCardinalityIDTerminalRuleCall_2_1_3_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPropertyRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"cardinality",
            	            		lv_cardinality_11_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    this_QUOTE_12=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleProperty5296); 
            	     
            	        newLeafNode(this_QUOTE_12, grammarAccess.getPropertyAccess().getQUOTETerminalRuleCall_2_1_4()); 
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertyAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2555:4: ({...}? => ( ({...}? => (otherlv_13= 'direction' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_direction_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2555:4: ({...}? => ( ({...}? => (otherlv_13= 'direction' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_direction_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2556:5: {...}? => ( ({...}? => (otherlv_13= 'direction' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_direction_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleProperty", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2556:105: ( ({...}? => (otherlv_13= 'direction' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_direction_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2557:6: ({...}? => (otherlv_13= 'direction' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_direction_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2560:6: ({...}? => (otherlv_13= 'direction' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_direction_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2560:7: {...}? => (otherlv_13= 'direction' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_direction_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProperty", "true");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2560:16: (otherlv_13= 'direction' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_direction_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2560:18: otherlv_13= 'direction' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_direction_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE
            	    {
            	    otherlv_13=(Token)match(input,83,FOLLOW_83_in_ruleProperty5363); 

            	        	newLeafNode(otherlv_13, grammarAccess.getPropertyAccess().getDirectionKeyword_2_2_0());
            	        
            	    otherlv_14=(Token)match(input,71,FOLLOW_71_in_ruleProperty5375); 

            	        	newLeafNode(otherlv_14, grammarAccess.getPropertyAccess().getEqualsSignKeyword_2_2_1());
            	        
            	    this_QUOTE_15=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleProperty5386); 
            	     
            	        newLeafNode(this_QUOTE_15, grammarAccess.getPropertyAccess().getQUOTETerminalRuleCall_2_2_2()); 
            	        
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2572:1: ( (lv_direction_16_0= RULE_ID ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2573:1: (lv_direction_16_0= RULE_ID )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2573:1: (lv_direction_16_0= RULE_ID )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2574:3: lv_direction_16_0= RULE_ID
            	    {
            	    lv_direction_16_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty5402); 

            	    			newLeafNode(lv_direction_16_0, grammarAccess.getPropertyAccess().getDirectionIDTerminalRuleCall_2_2_3_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPropertyRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"direction",
            	            		lv_direction_16_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    this_QUOTE_17=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleProperty5418); 
            	     
            	        newLeafNode(this_QUOTE_17, grammarAccess.getPropertyAccess().getQUOTETerminalRuleCall_2_2_4()); 
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertyAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2601:4: ({...}? => ( ({...}? => (otherlv_18= 'subtypes' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_subtypes_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE ) ) ) )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2601:4: ({...}? => ( ({...}? => (otherlv_18= 'subtypes' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_subtypes_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE ) ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2602:5: {...}? => ( ({...}? => (otherlv_18= 'subtypes' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_subtypes_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleProperty", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2602:105: ( ({...}? => (otherlv_18= 'subtypes' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_subtypes_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2603:6: ({...}? => (otherlv_18= 'subtypes' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_subtypes_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2606:6: ({...}? => (otherlv_18= 'subtypes' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_subtypes_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2606:7: {...}? => (otherlv_18= 'subtypes' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_subtypes_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProperty", "true");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2606:16: (otherlv_18= 'subtypes' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_subtypes_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2606:18: otherlv_18= 'subtypes' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_subtypes_21_0= RULE_ID ) ) this_QUOTE_22= RULE_QUOTE
            	    {
            	    otherlv_18=(Token)match(input,84,FOLLOW_84_in_ruleProperty5485); 

            	        	newLeafNode(otherlv_18, grammarAccess.getPropertyAccess().getSubtypesKeyword_2_3_0());
            	        
            	    otherlv_19=(Token)match(input,71,FOLLOW_71_in_ruleProperty5497); 

            	        	newLeafNode(otherlv_19, grammarAccess.getPropertyAccess().getEqualsSignKeyword_2_3_1());
            	        
            	    this_QUOTE_20=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleProperty5508); 
            	     
            	        newLeafNode(this_QUOTE_20, grammarAccess.getPropertyAccess().getQUOTETerminalRuleCall_2_3_2()); 
            	        
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2618:1: ( (lv_subtypes_21_0= RULE_ID ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2619:1: (lv_subtypes_21_0= RULE_ID )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2619:1: (lv_subtypes_21_0= RULE_ID )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2620:3: lv_subtypes_21_0= RULE_ID
            	    {
            	    lv_subtypes_21_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty5524); 

            	    			newLeafNode(lv_subtypes_21_0, grammarAccess.getPropertyAccess().getSubtypesIDTerminalRuleCall_2_3_3_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPropertyRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"subtypes",
            	            		lv_subtypes_21_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    this_QUOTE_22=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleProperty5540); 
            	     
            	        newLeafNode(this_QUOTE_22, grammarAccess.getPropertyAccess().getQUOTETerminalRuleCall_2_3_4()); 
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertyAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2647:4: ({...}? => ( ({...}? => (otherlv_23= 'name' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_nameAttribute_26_0= RULE_ID ) ) this_QUOTE_27= RULE_QUOTE ) ) ) )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2647:4: ({...}? => ( ({...}? => (otherlv_23= 'name' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_nameAttribute_26_0= RULE_ID ) ) this_QUOTE_27= RULE_QUOTE ) ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2648:5: {...}? => ( ({...}? => (otherlv_23= 'name' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_nameAttribute_26_0= RULE_ID ) ) this_QUOTE_27= RULE_QUOTE ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleProperty", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2648:105: ( ({...}? => (otherlv_23= 'name' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_nameAttribute_26_0= RULE_ID ) ) this_QUOTE_27= RULE_QUOTE ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2649:6: ({...}? => (otherlv_23= 'name' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_nameAttribute_26_0= RULE_ID ) ) this_QUOTE_27= RULE_QUOTE ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2652:6: ({...}? => (otherlv_23= 'name' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_nameAttribute_26_0= RULE_ID ) ) this_QUOTE_27= RULE_QUOTE ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2652:7: {...}? => (otherlv_23= 'name' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_nameAttribute_26_0= RULE_ID ) ) this_QUOTE_27= RULE_QUOTE )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProperty", "true");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2652:16: (otherlv_23= 'name' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_nameAttribute_26_0= RULE_ID ) ) this_QUOTE_27= RULE_QUOTE )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2652:18: otherlv_23= 'name' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_nameAttribute_26_0= RULE_ID ) ) this_QUOTE_27= RULE_QUOTE
            	    {
            	    otherlv_23=(Token)match(input,75,FOLLOW_75_in_ruleProperty5607); 

            	        	newLeafNode(otherlv_23, grammarAccess.getPropertyAccess().getNameKeyword_2_4_0());
            	        
            	    otherlv_24=(Token)match(input,71,FOLLOW_71_in_ruleProperty5619); 

            	        	newLeafNode(otherlv_24, grammarAccess.getPropertyAccess().getEqualsSignKeyword_2_4_1());
            	        
            	    this_QUOTE_25=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleProperty5630); 
            	     
            	        newLeafNode(this_QUOTE_25, grammarAccess.getPropertyAccess().getQUOTETerminalRuleCall_2_4_2()); 
            	        
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2664:1: ( (lv_nameAttribute_26_0= RULE_ID ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2665:1: (lv_nameAttribute_26_0= RULE_ID )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2665:1: (lv_nameAttribute_26_0= RULE_ID )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2666:3: lv_nameAttribute_26_0= RULE_ID
            	    {
            	    lv_nameAttribute_26_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty5646); 

            	    			newLeafNode(lv_nameAttribute_26_0, grammarAccess.getPropertyAccess().getNameAttributeIDTerminalRuleCall_2_4_3_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPropertyRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"nameAttribute",
            	            		lv_nameAttribute_26_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    this_QUOTE_27=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleProperty5662); 
            	     
            	        newLeafNode(this_QUOTE_27, grammarAccess.getPropertyAccess().getQUOTETerminalRuleCall_2_4_4()); 
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertyAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2693:4: ({...}? => ( ({...}? => (otherlv_28= 'type' otherlv_29= '=' this_QUOTE_30= RULE_QUOTE ( (lv_type_31_0= RULE_ID ) ) this_QUOTE_32= RULE_QUOTE ) ) ) )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2693:4: ({...}? => ( ({...}? => (otherlv_28= 'type' otherlv_29= '=' this_QUOTE_30= RULE_QUOTE ( (lv_type_31_0= RULE_ID ) ) this_QUOTE_32= RULE_QUOTE ) ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2694:5: {...}? => ( ({...}? => (otherlv_28= 'type' otherlv_29= '=' this_QUOTE_30= RULE_QUOTE ( (lv_type_31_0= RULE_ID ) ) this_QUOTE_32= RULE_QUOTE ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleProperty", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2694:105: ( ({...}? => (otherlv_28= 'type' otherlv_29= '=' this_QUOTE_30= RULE_QUOTE ( (lv_type_31_0= RULE_ID ) ) this_QUOTE_32= RULE_QUOTE ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2695:6: ({...}? => (otherlv_28= 'type' otherlv_29= '=' this_QUOTE_30= RULE_QUOTE ( (lv_type_31_0= RULE_ID ) ) this_QUOTE_32= RULE_QUOTE ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2698:6: ({...}? => (otherlv_28= 'type' otherlv_29= '=' this_QUOTE_30= RULE_QUOTE ( (lv_type_31_0= RULE_ID ) ) this_QUOTE_32= RULE_QUOTE ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2698:7: {...}? => (otherlv_28= 'type' otherlv_29= '=' this_QUOTE_30= RULE_QUOTE ( (lv_type_31_0= RULE_ID ) ) this_QUOTE_32= RULE_QUOTE )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProperty", "true");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2698:16: (otherlv_28= 'type' otherlv_29= '=' this_QUOTE_30= RULE_QUOTE ( (lv_type_31_0= RULE_ID ) ) this_QUOTE_32= RULE_QUOTE )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2698:18: otherlv_28= 'type' otherlv_29= '=' this_QUOTE_30= RULE_QUOTE ( (lv_type_31_0= RULE_ID ) ) this_QUOTE_32= RULE_QUOTE
            	    {
            	    otherlv_28=(Token)match(input,76,FOLLOW_76_in_ruleProperty5729); 

            	        	newLeafNode(otherlv_28, grammarAccess.getPropertyAccess().getTypeKeyword_2_5_0());
            	        
            	    otherlv_29=(Token)match(input,71,FOLLOW_71_in_ruleProperty5741); 

            	        	newLeafNode(otherlv_29, grammarAccess.getPropertyAccess().getEqualsSignKeyword_2_5_1());
            	        
            	    this_QUOTE_30=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleProperty5752); 
            	     
            	        newLeafNode(this_QUOTE_30, grammarAccess.getPropertyAccess().getQUOTETerminalRuleCall_2_5_2()); 
            	        
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2710:1: ( (lv_type_31_0= RULE_ID ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2711:1: (lv_type_31_0= RULE_ID )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2711:1: (lv_type_31_0= RULE_ID )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2712:3: lv_type_31_0= RULE_ID
            	    {
            	    lv_type_31_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProperty5768); 

            	    			newLeafNode(lv_type_31_0, grammarAccess.getPropertyAccess().getTypeIDTerminalRuleCall_2_5_3_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPropertyRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"type",
            	            		lv_type_31_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    this_QUOTE_32=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleProperty5784); 
            	     
            	        newLeafNode(this_QUOTE_32, grammarAccess.getPropertyAccess().getQUOTETerminalRuleCall_2_5_4()); 
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertyAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2739:4: ({...}? => ( ({...}? => (otherlv_33= 'condition' otherlv_34= '=' this_QUOTE_35= RULE_QUOTE ( (lv_condition_36_0= ruleTopLevel ) ) this_QUOTE_37= RULE_QUOTE ) ) ) )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2739:4: ({...}? => ( ({...}? => (otherlv_33= 'condition' otherlv_34= '=' this_QUOTE_35= RULE_QUOTE ( (lv_condition_36_0= ruleTopLevel ) ) this_QUOTE_37= RULE_QUOTE ) ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2740:5: {...}? => ( ({...}? => (otherlv_33= 'condition' otherlv_34= '=' this_QUOTE_35= RULE_QUOTE ( (lv_condition_36_0= ruleTopLevel ) ) this_QUOTE_37= RULE_QUOTE ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleProperty", "getUnorderedGroupHelper().canSelect(grammarAccess.getPropertyAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2740:105: ( ({...}? => (otherlv_33= 'condition' otherlv_34= '=' this_QUOTE_35= RULE_QUOTE ( (lv_condition_36_0= ruleTopLevel ) ) this_QUOTE_37= RULE_QUOTE ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2741:6: ({...}? => (otherlv_33= 'condition' otherlv_34= '=' this_QUOTE_35= RULE_QUOTE ( (lv_condition_36_0= ruleTopLevel ) ) this_QUOTE_37= RULE_QUOTE ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getPropertyAccess().getUnorderedGroup_2(), 6);
            	    	 				
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2744:6: ({...}? => (otherlv_33= 'condition' otherlv_34= '=' this_QUOTE_35= RULE_QUOTE ( (lv_condition_36_0= ruleTopLevel ) ) this_QUOTE_37= RULE_QUOTE ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2744:7: {...}? => (otherlv_33= 'condition' otherlv_34= '=' this_QUOTE_35= RULE_QUOTE ( (lv_condition_36_0= ruleTopLevel ) ) this_QUOTE_37= RULE_QUOTE )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleProperty", "true");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2744:16: (otherlv_33= 'condition' otherlv_34= '=' this_QUOTE_35= RULE_QUOTE ( (lv_condition_36_0= ruleTopLevel ) ) this_QUOTE_37= RULE_QUOTE )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2744:18: otherlv_33= 'condition' otherlv_34= '=' this_QUOTE_35= RULE_QUOTE ( (lv_condition_36_0= ruleTopLevel ) ) this_QUOTE_37= RULE_QUOTE
            	    {
            	    otherlv_33=(Token)match(input,77,FOLLOW_77_in_ruleProperty5851); 

            	        	newLeafNode(otherlv_33, grammarAccess.getPropertyAccess().getConditionKeyword_2_6_0());
            	        
            	    otherlv_34=(Token)match(input,71,FOLLOW_71_in_ruleProperty5863); 

            	        	newLeafNode(otherlv_34, grammarAccess.getPropertyAccess().getEqualsSignKeyword_2_6_1());
            	        
            	    this_QUOTE_35=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleProperty5874); 
            	     
            	        newLeafNode(this_QUOTE_35, grammarAccess.getPropertyAccess().getQUOTETerminalRuleCall_2_6_2()); 
            	        
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2756:1: ( (lv_condition_36_0= ruleTopLevel ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2757:1: (lv_condition_36_0= ruleTopLevel )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2757:1: (lv_condition_36_0= ruleTopLevel )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2758:3: lv_condition_36_0= ruleTopLevel
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPropertyAccess().getConditionTopLevelParserRuleCall_2_6_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTopLevel_in_ruleProperty5894);
            	    lv_condition_36_0=ruleTopLevel();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPropertyRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"condition",
            	            		lv_condition_36_0, 
            	            		"TopLevel");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    this_QUOTE_37=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleProperty5905); 
            	     
            	        newLeafNode(this_QUOTE_37, grammarAccess.getPropertyAccess().getQUOTETerminalRuleCall_2_6_4()); 
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPropertyAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getPropertyAccess().getUnorderedGroup_2());
            	

            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2792:2: (this_XML_TAG_SINGLEEND_38= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_39_0= RULE_XML_TAG_END ) ) ( ( (lv_children_40_0= ruleExpressionOrOption ) ) | ( (lv_children_41_0= ruleMap ) ) )* ( (lv_closedTag_42_0= RULE_PROPERTY_END_TAG ) ) ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_XML_TAG_SINGLEEND) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_XML_TAG_END) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2792:3: this_XML_TAG_SINGLEEND_38= RULE_XML_TAG_SINGLEEND
                    {
                    this_XML_TAG_SINGLEEND_38=(Token)match(input,RULE_XML_TAG_SINGLEEND,FOLLOW_RULE_XML_TAG_SINGLEEND_in_ruleProperty5957); 
                     
                        newLeafNode(this_XML_TAG_SINGLEEND_38, grammarAccess.getPropertyAccess().getXML_TAG_SINGLEENDTerminalRuleCall_3_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2797:6: ( ( (lv_splitTag_39_0= RULE_XML_TAG_END ) ) ( ( (lv_children_40_0= ruleExpressionOrOption ) ) | ( (lv_children_41_0= ruleMap ) ) )* ( (lv_closedTag_42_0= RULE_PROPERTY_END_TAG ) ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2797:6: ( ( (lv_splitTag_39_0= RULE_XML_TAG_END ) ) ( ( (lv_children_40_0= ruleExpressionOrOption ) ) | ( (lv_children_41_0= ruleMap ) ) )* ( (lv_closedTag_42_0= RULE_PROPERTY_END_TAG ) ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2797:7: ( (lv_splitTag_39_0= RULE_XML_TAG_END ) ) ( ( (lv_children_40_0= ruleExpressionOrOption ) ) | ( (lv_children_41_0= ruleMap ) ) )* ( (lv_closedTag_42_0= RULE_PROPERTY_END_TAG ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2797:7: ( (lv_splitTag_39_0= RULE_XML_TAG_END ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2798:1: (lv_splitTag_39_0= RULE_XML_TAG_END )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2798:1: (lv_splitTag_39_0= RULE_XML_TAG_END )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2799:3: lv_splitTag_39_0= RULE_XML_TAG_END
                    {
                    lv_splitTag_39_0=(Token)match(input,RULE_XML_TAG_END,FOLLOW_RULE_XML_TAG_END_in_ruleProperty5980); 

                    			newLeafNode(lv_splitTag_39_0, grammarAccess.getPropertyAccess().getSplitTagXML_TAG_ENDTerminalRuleCall_3_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPropertyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"splitTag",
                            		true, 
                            		"XML_TAG_END");
                    	    

                    }


                    }

                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2815:2: ( ( (lv_children_40_0= ruleExpressionOrOption ) ) | ( (lv_children_41_0= ruleMap ) ) )*
                    loop38:
                    do {
                        int alt38=3;
                        int LA38_0 = input.LA(1);

                        if ( ((LA38_0>=RULE_EXPRESSION_START_TAG && LA38_0<=RULE_OPTION_START_TAG)) ) {
                            alt38=1;
                        }
                        else if ( (LA38_0==RULE_MAPSTARTKEYWORD) ) {
                            alt38=2;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2815:3: ( (lv_children_40_0= ruleExpressionOrOption ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2815:3: ( (lv_children_40_0= ruleExpressionOrOption ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2816:1: (lv_children_40_0= ruleExpressionOrOption )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2816:1: (lv_children_40_0= ruleExpressionOrOption )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2817:3: lv_children_40_0= ruleExpressionOrOption
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPropertyAccess().getChildrenExpressionOrOptionParserRuleCall_3_1_1_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExpressionOrOption_in_ruleProperty6007);
                    	    lv_children_40_0=ruleExpressionOrOption();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_40_0, 
                    	            		"ExpressionOrOption");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2834:6: ( (lv_children_41_0= ruleMap ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2834:6: ( (lv_children_41_0= ruleMap ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2835:1: (lv_children_41_0= ruleMap )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2835:1: (lv_children_41_0= ruleMap )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2836:3: lv_children_41_0= ruleMap
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPropertyAccess().getChildrenMapParserRuleCall_3_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMap_in_ruleProperty6034);
                    	    lv_children_41_0=ruleMap();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_41_0, 
                    	            		"Map");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2852:4: ( (lv_closedTag_42_0= RULE_PROPERTY_END_TAG ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2853:1: (lv_closedTag_42_0= RULE_PROPERTY_END_TAG )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2853:1: (lv_closedTag_42_0= RULE_PROPERTY_END_TAG )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2854:3: lv_closedTag_42_0= RULE_PROPERTY_END_TAG
                    {
                    lv_closedTag_42_0=(Token)match(input,RULE_PROPERTY_END_TAG,FOLLOW_RULE_PROPERTY_END_TAG_in_ruleProperty6053); 

                    			newLeafNode(lv_closedTag_42_0, grammarAccess.getPropertyAccess().getClosedTagPROPERTY_END_TAGTerminalRuleCall_3_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPropertyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"closedTag",
                            		true, 
                            		"PROPERTY_END_TAG");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleParam"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2878:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2879:2: (iv_ruleParam= ruleParam EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2880:2: iv_ruleParam= ruleParam EOF
            {
             newCompositeNode(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_ruleParam_in_entryRuleParam6096);
            iv_ruleParam=ruleParam();

            state._fsp--;

             current =iv_ruleParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParam6106); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2887:1: ruleParam returns [EObject current=null] : (this_PARAM_START_TAG_0= RULE_PARAM_START_TAG () ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_type_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'condition' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_condition_16_0= ruleTopLevel ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) )* ) ) ) (this_XML_TAG_SINGLEEND_18= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_19_0= RULE_XML_TAG_END ) ) ( ( (lv_children_20_0= ruleExpressionOrOption ) ) | ( (lv_children_21_0= ruleMap ) ) )* ( (lv_closedTag_22_0= RULE_PARAM_END_TAG ) ) ) ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token this_PARAM_START_TAG_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_QUOTE_5=null;
        Token lv_nameAttribute_6_0=null;
        Token this_QUOTE_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token this_QUOTE_10=null;
        Token lv_type_11_0=null;
        Token this_QUOTE_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token this_QUOTE_15=null;
        Token this_QUOTE_17=null;
        Token this_XML_TAG_SINGLEEND_18=null;
        Token lv_splitTag_19_0=null;
        Token lv_closedTag_22_0=null;
        EObject lv_condition_16_0 = null;

        EObject lv_children_20_0 = null;

        EObject lv_children_21_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2890:28: ( (this_PARAM_START_TAG_0= RULE_PARAM_START_TAG () ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_type_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'condition' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_condition_16_0= ruleTopLevel ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) )* ) ) ) (this_XML_TAG_SINGLEEND_18= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_19_0= RULE_XML_TAG_END ) ) ( ( (lv_children_20_0= ruleExpressionOrOption ) ) | ( (lv_children_21_0= ruleMap ) ) )* ( (lv_closedTag_22_0= RULE_PARAM_END_TAG ) ) ) ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2891:1: (this_PARAM_START_TAG_0= RULE_PARAM_START_TAG () ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_type_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'condition' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_condition_16_0= ruleTopLevel ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) )* ) ) ) (this_XML_TAG_SINGLEEND_18= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_19_0= RULE_XML_TAG_END ) ) ( ( (lv_children_20_0= ruleExpressionOrOption ) ) | ( (lv_children_21_0= ruleMap ) ) )* ( (lv_closedTag_22_0= RULE_PARAM_END_TAG ) ) ) ) )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2891:1: (this_PARAM_START_TAG_0= RULE_PARAM_START_TAG () ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_type_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'condition' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_condition_16_0= ruleTopLevel ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) )* ) ) ) (this_XML_TAG_SINGLEEND_18= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_19_0= RULE_XML_TAG_END ) ) ( ( (lv_children_20_0= ruleExpressionOrOption ) ) | ( (lv_children_21_0= ruleMap ) ) )* ( (lv_closedTag_22_0= RULE_PARAM_END_TAG ) ) ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2891:2: this_PARAM_START_TAG_0= RULE_PARAM_START_TAG () ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_type_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'condition' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_condition_16_0= ruleTopLevel ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) )* ) ) ) (this_XML_TAG_SINGLEEND_18= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_19_0= RULE_XML_TAG_END ) ) ( ( (lv_children_20_0= ruleExpressionOrOption ) ) | ( (lv_children_21_0= ruleMap ) ) )* ( (lv_closedTag_22_0= RULE_PARAM_END_TAG ) ) ) )
            {
            this_PARAM_START_TAG_0=(Token)match(input,RULE_PARAM_START_TAG,FOLLOW_RULE_PARAM_START_TAG_in_ruleParam6142); 
             
                newLeafNode(this_PARAM_START_TAG_0, grammarAccess.getParamAccess().getPARAM_START_TAGTerminalRuleCall_0()); 
                
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2895:1: ()
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2896:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParamAccess().getParamAction_1(),
                        current);
                

            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2901:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_type_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'condition' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_condition_16_0= ruleTopLevel ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) )* ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2903:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_type_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'condition' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_condition_16_0= ruleTopLevel ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) )* ) )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2903:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_type_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'condition' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_condition_16_0= ruleTopLevel ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) )* ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2904:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_type_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'condition' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_condition_16_0= ruleTopLevel ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getParamAccess().getUnorderedGroup_2());
            	
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2907:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_type_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'condition' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_condition_16_0= ruleTopLevel ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) )* )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2908:3: ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_type_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'condition' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_condition_16_0= ruleTopLevel ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) )*
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2908:3: ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_type_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'condition' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_condition_16_0= ruleTopLevel ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) )*
            loop40:
            do {
                int alt40=4;
                int LA40_0 = input.LA(1);

                if ( LA40_0 ==75 && getUnorderedGroupHelper().canSelect(grammarAccess.getParamAccess().getUnorderedGroup_2(), 0) ) {
                    alt40=1;
                }
                else if ( LA40_0 ==76 && getUnorderedGroupHelper().canSelect(grammarAccess.getParamAccess().getUnorderedGroup_2(), 1) ) {
                    alt40=2;
                }
                else if ( LA40_0 ==77 && getUnorderedGroupHelper().canSelect(grammarAccess.getParamAccess().getUnorderedGroup_2(), 2) ) {
                    alt40=3;
                }


                switch (alt40) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2910:4: ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE ) ) ) )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2910:4: ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE ) ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2911:5: {...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParamAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleParam", "getUnorderedGroupHelper().canSelect(grammarAccess.getParamAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2911:102: ( ({...}? => (otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2912:6: ({...}? => (otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getParamAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2915:6: ({...}? => (otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2915:7: {...}? => (otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParam", "true");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2915:16: (otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2915:18: otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE
            	    {
            	    otherlv_3=(Token)match(input,75,FOLLOW_75_in_ruleParam6208); 

            	        	newLeafNode(otherlv_3, grammarAccess.getParamAccess().getNameKeyword_2_0_0());
            	        
            	    otherlv_4=(Token)match(input,71,FOLLOW_71_in_ruleParam6220); 

            	        	newLeafNode(otherlv_4, grammarAccess.getParamAccess().getEqualsSignKeyword_2_0_1());
            	        
            	    this_QUOTE_5=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleParam6231); 
            	     
            	        newLeafNode(this_QUOTE_5, grammarAccess.getParamAccess().getQUOTETerminalRuleCall_2_0_2()); 
            	        
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2927:1: ( (lv_nameAttribute_6_0= RULE_ID ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2928:1: (lv_nameAttribute_6_0= RULE_ID )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2928:1: (lv_nameAttribute_6_0= RULE_ID )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2929:3: lv_nameAttribute_6_0= RULE_ID
            	    {
            	    lv_nameAttribute_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParam6247); 

            	    			newLeafNode(lv_nameAttribute_6_0, grammarAccess.getParamAccess().getNameAttributeIDTerminalRuleCall_2_0_3_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getParamRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"nameAttribute",
            	            		lv_nameAttribute_6_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    this_QUOTE_7=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleParam6263); 
            	     
            	        newLeafNode(this_QUOTE_7, grammarAccess.getParamAccess().getQUOTETerminalRuleCall_2_0_4()); 
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParamAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2956:4: ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_type_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2956:4: ({...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_type_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2957:5: {...}? => ( ({...}? => (otherlv_8= 'type' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_type_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParamAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleParam", "getUnorderedGroupHelper().canSelect(grammarAccess.getParamAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2957:102: ( ({...}? => (otherlv_8= 'type' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_type_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2958:6: ({...}? => (otherlv_8= 'type' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_type_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getParamAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2961:6: ({...}? => (otherlv_8= 'type' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_type_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2961:7: {...}? => (otherlv_8= 'type' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_type_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParam", "true");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2961:16: (otherlv_8= 'type' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_type_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2961:18: otherlv_8= 'type' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_type_11_0= RULE_ID ) ) this_QUOTE_12= RULE_QUOTE
            	    {
            	    otherlv_8=(Token)match(input,76,FOLLOW_76_in_ruleParam6330); 

            	        	newLeafNode(otherlv_8, grammarAccess.getParamAccess().getTypeKeyword_2_1_0());
            	        
            	    otherlv_9=(Token)match(input,71,FOLLOW_71_in_ruleParam6342); 

            	        	newLeafNode(otherlv_9, grammarAccess.getParamAccess().getEqualsSignKeyword_2_1_1());
            	        
            	    this_QUOTE_10=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleParam6353); 
            	     
            	        newLeafNode(this_QUOTE_10, grammarAccess.getParamAccess().getQUOTETerminalRuleCall_2_1_2()); 
            	        
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2973:1: ( (lv_type_11_0= RULE_ID ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2974:1: (lv_type_11_0= RULE_ID )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2974:1: (lv_type_11_0= RULE_ID )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:2975:3: lv_type_11_0= RULE_ID
            	    {
            	    lv_type_11_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParam6369); 

            	    			newLeafNode(lv_type_11_0, grammarAccess.getParamAccess().getTypeIDTerminalRuleCall_2_1_3_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getParamRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"type",
            	            		lv_type_11_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    this_QUOTE_12=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleParam6385); 
            	     
            	        newLeafNode(this_QUOTE_12, grammarAccess.getParamAccess().getQUOTETerminalRuleCall_2_1_4()); 
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParamAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3002:4: ({...}? => ( ({...}? => (otherlv_13= 'condition' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_condition_16_0= ruleTopLevel ) ) this_QUOTE_17= RULE_QUOTE ) ) ) )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3002:4: ({...}? => ( ({...}? => (otherlv_13= 'condition' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_condition_16_0= ruleTopLevel ) ) this_QUOTE_17= RULE_QUOTE ) ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3003:5: {...}? => ( ({...}? => (otherlv_13= 'condition' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_condition_16_0= ruleTopLevel ) ) this_QUOTE_17= RULE_QUOTE ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParamAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleParam", "getUnorderedGroupHelper().canSelect(grammarAccess.getParamAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3003:102: ( ({...}? => (otherlv_13= 'condition' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_condition_16_0= ruleTopLevel ) ) this_QUOTE_17= RULE_QUOTE ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3004:6: ({...}? => (otherlv_13= 'condition' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_condition_16_0= ruleTopLevel ) ) this_QUOTE_17= RULE_QUOTE ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getParamAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3007:6: ({...}? => (otherlv_13= 'condition' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_condition_16_0= ruleTopLevel ) ) this_QUOTE_17= RULE_QUOTE ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3007:7: {...}? => (otherlv_13= 'condition' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_condition_16_0= ruleTopLevel ) ) this_QUOTE_17= RULE_QUOTE )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParam", "true");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3007:16: (otherlv_13= 'condition' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_condition_16_0= ruleTopLevel ) ) this_QUOTE_17= RULE_QUOTE )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3007:18: otherlv_13= 'condition' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_condition_16_0= ruleTopLevel ) ) this_QUOTE_17= RULE_QUOTE
            	    {
            	    otherlv_13=(Token)match(input,77,FOLLOW_77_in_ruleParam6452); 

            	        	newLeafNode(otherlv_13, grammarAccess.getParamAccess().getConditionKeyword_2_2_0());
            	        
            	    otherlv_14=(Token)match(input,71,FOLLOW_71_in_ruleParam6464); 

            	        	newLeafNode(otherlv_14, grammarAccess.getParamAccess().getEqualsSignKeyword_2_2_1());
            	        
            	    this_QUOTE_15=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleParam6475); 
            	     
            	        newLeafNode(this_QUOTE_15, grammarAccess.getParamAccess().getQUOTETerminalRuleCall_2_2_2()); 
            	        
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3019:1: ( (lv_condition_16_0= ruleTopLevel ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3020:1: (lv_condition_16_0= ruleTopLevel )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3020:1: (lv_condition_16_0= ruleTopLevel )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3021:3: lv_condition_16_0= ruleTopLevel
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getParamAccess().getConditionTopLevelParserRuleCall_2_2_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTopLevel_in_ruleParam6495);
            	    lv_condition_16_0=ruleTopLevel();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getParamRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"condition",
            	            		lv_condition_16_0, 
            	            		"TopLevel");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    this_QUOTE_17=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleParam6506); 
            	     
            	        newLeafNode(this_QUOTE_17, grammarAccess.getParamAccess().getQUOTETerminalRuleCall_2_2_4()); 
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParamAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getParamAccess().getUnorderedGroup_2());
            	

            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3055:2: (this_XML_TAG_SINGLEEND_18= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_19_0= RULE_XML_TAG_END ) ) ( ( (lv_children_20_0= ruleExpressionOrOption ) ) | ( (lv_children_21_0= ruleMap ) ) )* ( (lv_closedTag_22_0= RULE_PARAM_END_TAG ) ) ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_XML_TAG_SINGLEEND) ) {
                alt42=1;
            }
            else if ( (LA42_0==RULE_XML_TAG_END) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3055:3: this_XML_TAG_SINGLEEND_18= RULE_XML_TAG_SINGLEEND
                    {
                    this_XML_TAG_SINGLEEND_18=(Token)match(input,RULE_XML_TAG_SINGLEEND,FOLLOW_RULE_XML_TAG_SINGLEEND_in_ruleParam6558); 
                     
                        newLeafNode(this_XML_TAG_SINGLEEND_18, grammarAccess.getParamAccess().getXML_TAG_SINGLEENDTerminalRuleCall_3_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3060:6: ( ( (lv_splitTag_19_0= RULE_XML_TAG_END ) ) ( ( (lv_children_20_0= ruleExpressionOrOption ) ) | ( (lv_children_21_0= ruleMap ) ) )* ( (lv_closedTag_22_0= RULE_PARAM_END_TAG ) ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3060:6: ( ( (lv_splitTag_19_0= RULE_XML_TAG_END ) ) ( ( (lv_children_20_0= ruleExpressionOrOption ) ) | ( (lv_children_21_0= ruleMap ) ) )* ( (lv_closedTag_22_0= RULE_PARAM_END_TAG ) ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3060:7: ( (lv_splitTag_19_0= RULE_XML_TAG_END ) ) ( ( (lv_children_20_0= ruleExpressionOrOption ) ) | ( (lv_children_21_0= ruleMap ) ) )* ( (lv_closedTag_22_0= RULE_PARAM_END_TAG ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3060:7: ( (lv_splitTag_19_0= RULE_XML_TAG_END ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3061:1: (lv_splitTag_19_0= RULE_XML_TAG_END )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3061:1: (lv_splitTag_19_0= RULE_XML_TAG_END )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3062:3: lv_splitTag_19_0= RULE_XML_TAG_END
                    {
                    lv_splitTag_19_0=(Token)match(input,RULE_XML_TAG_END,FOLLOW_RULE_XML_TAG_END_in_ruleParam6581); 

                    			newLeafNode(lv_splitTag_19_0, grammarAccess.getParamAccess().getSplitTagXML_TAG_ENDTerminalRuleCall_3_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParamRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"splitTag",
                            		true, 
                            		"XML_TAG_END");
                    	    

                    }


                    }

                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3078:2: ( ( (lv_children_20_0= ruleExpressionOrOption ) ) | ( (lv_children_21_0= ruleMap ) ) )*
                    loop41:
                    do {
                        int alt41=3;
                        int LA41_0 = input.LA(1);

                        if ( ((LA41_0>=RULE_EXPRESSION_START_TAG && LA41_0<=RULE_OPTION_START_TAG)) ) {
                            alt41=1;
                        }
                        else if ( (LA41_0==RULE_MAPSTARTKEYWORD) ) {
                            alt41=2;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3078:3: ( (lv_children_20_0= ruleExpressionOrOption ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3078:3: ( (lv_children_20_0= ruleExpressionOrOption ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3079:1: (lv_children_20_0= ruleExpressionOrOption )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3079:1: (lv_children_20_0= ruleExpressionOrOption )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3080:3: lv_children_20_0= ruleExpressionOrOption
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getParamAccess().getChildrenExpressionOrOptionParserRuleCall_3_1_1_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExpressionOrOption_in_ruleParam6608);
                    	    lv_children_20_0=ruleExpressionOrOption();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getParamRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_20_0, 
                    	            		"ExpressionOrOption");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3097:6: ( (lv_children_21_0= ruleMap ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3097:6: ( (lv_children_21_0= ruleMap ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3098:1: (lv_children_21_0= ruleMap )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3098:1: (lv_children_21_0= ruleMap )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3099:3: lv_children_21_0= ruleMap
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getParamAccess().getChildrenMapParserRuleCall_3_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMap_in_ruleParam6635);
                    	    lv_children_21_0=ruleMap();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getParamRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_21_0, 
                    	            		"Map");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3115:4: ( (lv_closedTag_22_0= RULE_PARAM_END_TAG ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3116:1: (lv_closedTag_22_0= RULE_PARAM_END_TAG )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3116:1: (lv_closedTag_22_0= RULE_PARAM_END_TAG )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3117:3: lv_closedTag_22_0= RULE_PARAM_END_TAG
                    {
                    lv_closedTag_22_0=(Token)match(input,RULE_PARAM_END_TAG,FOLLOW_RULE_PARAM_END_TAG_in_ruleParam6654); 

                    			newLeafNode(lv_closedTag_22_0, grammarAccess.getParamAccess().getClosedTagPARAM_END_TAGTerminalRuleCall_3_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParamRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"closedTag",
                            		true, 
                            		"PARAM_END_TAG");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleMapMethod"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3141:1: entryRuleMapMethod returns [EObject current=null] : iv_ruleMapMethod= ruleMapMethod EOF ;
    public final EObject entryRuleMapMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapMethod = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3142:2: (iv_ruleMapMethod= ruleMapMethod EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3143:2: iv_ruleMapMethod= ruleMapMethod EOF
            {
             newCompositeNode(grammarAccess.getMapMethodRule()); 
            pushFollow(FOLLOW_ruleMapMethod_in_entryRuleMapMethod6697);
            iv_ruleMapMethod=ruleMapMethod();

            state._fsp--;

             current =iv_ruleMapMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapMethod6707); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapMethod"


    // $ANTLR start "ruleMapMethod"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3150:1: ruleMapMethod returns [EObject current=null] : (this_MAP_METHOD_STARTTAG_START_0= RULE_MAP_METHOD_STARTTAG_START ( (lv_mapName_1_0= RULE_ID ) ) this_DOT_2= RULE_DOT ( (lv_methodName_3_0= ruleAttributeName ) ) ( (lv_attributes_4_0= ruleNonExpression ) )* (this_XML_TAG_SINGLEEND_5= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_6_0= RULE_XML_TAG_END ) ) ( ( (lv_children_7_0= ruleExpressionOrOption ) ) | ( (lv_children_8_0= ruleMessage ) ) | ( (lv_children_9_0= ruleProperty ) ) | ( (lv_children_10_0= ruleParam ) ) | ( (lv_children_11_0= ruleMap ) ) | ( (lv_children_12_0= ruleMapMethod ) ) | ( (lv_children_13_0= ruleDebugTag ) ) | ( (lv_children_14_0= ruleField ) ) | ( (lv_children_15_0= ruleComment ) ) | ( (lv_children_16_0= ruleBreak ) ) )* ( (lv_closedTag_17_0= RULE_MAP_METHOD_ENDTAG_START ) ) ( (lv_methodClosingName_18_0= RULE_ID ) ) this_DOT_19= RULE_DOT ( (lv_methodClosingMethod_20_0= RULE_ID ) ) this_XML_TAG_END_21= RULE_XML_TAG_END ) ) ) ;
    public final EObject ruleMapMethod() throws RecognitionException {
        EObject current = null;

        Token this_MAP_METHOD_STARTTAG_START_0=null;
        Token lv_mapName_1_0=null;
        Token this_DOT_2=null;
        Token this_XML_TAG_SINGLEEND_5=null;
        Token lv_splitTag_6_0=null;
        Token lv_closedTag_17_0=null;
        Token lv_methodClosingName_18_0=null;
        Token this_DOT_19=null;
        Token lv_methodClosingMethod_20_0=null;
        Token this_XML_TAG_END_21=null;
        AntlrDatatypeRuleToken lv_methodName_3_0 = null;

        EObject lv_attributes_4_0 = null;

        EObject lv_children_7_0 = null;

        EObject lv_children_8_0 = null;

        EObject lv_children_9_0 = null;

        EObject lv_children_10_0 = null;

        EObject lv_children_11_0 = null;

        EObject lv_children_12_0 = null;

        EObject lv_children_13_0 = null;

        EObject lv_children_14_0 = null;

        EObject lv_children_15_0 = null;

        EObject lv_children_16_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3153:28: ( (this_MAP_METHOD_STARTTAG_START_0= RULE_MAP_METHOD_STARTTAG_START ( (lv_mapName_1_0= RULE_ID ) ) this_DOT_2= RULE_DOT ( (lv_methodName_3_0= ruleAttributeName ) ) ( (lv_attributes_4_0= ruleNonExpression ) )* (this_XML_TAG_SINGLEEND_5= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_6_0= RULE_XML_TAG_END ) ) ( ( (lv_children_7_0= ruleExpressionOrOption ) ) | ( (lv_children_8_0= ruleMessage ) ) | ( (lv_children_9_0= ruleProperty ) ) | ( (lv_children_10_0= ruleParam ) ) | ( (lv_children_11_0= ruleMap ) ) | ( (lv_children_12_0= ruleMapMethod ) ) | ( (lv_children_13_0= ruleDebugTag ) ) | ( (lv_children_14_0= ruleField ) ) | ( (lv_children_15_0= ruleComment ) ) | ( (lv_children_16_0= ruleBreak ) ) )* ( (lv_closedTag_17_0= RULE_MAP_METHOD_ENDTAG_START ) ) ( (lv_methodClosingName_18_0= RULE_ID ) ) this_DOT_19= RULE_DOT ( (lv_methodClosingMethod_20_0= RULE_ID ) ) this_XML_TAG_END_21= RULE_XML_TAG_END ) ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3154:1: (this_MAP_METHOD_STARTTAG_START_0= RULE_MAP_METHOD_STARTTAG_START ( (lv_mapName_1_0= RULE_ID ) ) this_DOT_2= RULE_DOT ( (lv_methodName_3_0= ruleAttributeName ) ) ( (lv_attributes_4_0= ruleNonExpression ) )* (this_XML_TAG_SINGLEEND_5= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_6_0= RULE_XML_TAG_END ) ) ( ( (lv_children_7_0= ruleExpressionOrOption ) ) | ( (lv_children_8_0= ruleMessage ) ) | ( (lv_children_9_0= ruleProperty ) ) | ( (lv_children_10_0= ruleParam ) ) | ( (lv_children_11_0= ruleMap ) ) | ( (lv_children_12_0= ruleMapMethod ) ) | ( (lv_children_13_0= ruleDebugTag ) ) | ( (lv_children_14_0= ruleField ) ) | ( (lv_children_15_0= ruleComment ) ) | ( (lv_children_16_0= ruleBreak ) ) )* ( (lv_closedTag_17_0= RULE_MAP_METHOD_ENDTAG_START ) ) ( (lv_methodClosingName_18_0= RULE_ID ) ) this_DOT_19= RULE_DOT ( (lv_methodClosingMethod_20_0= RULE_ID ) ) this_XML_TAG_END_21= RULE_XML_TAG_END ) ) )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3154:1: (this_MAP_METHOD_STARTTAG_START_0= RULE_MAP_METHOD_STARTTAG_START ( (lv_mapName_1_0= RULE_ID ) ) this_DOT_2= RULE_DOT ( (lv_methodName_3_0= ruleAttributeName ) ) ( (lv_attributes_4_0= ruleNonExpression ) )* (this_XML_TAG_SINGLEEND_5= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_6_0= RULE_XML_TAG_END ) ) ( ( (lv_children_7_0= ruleExpressionOrOption ) ) | ( (lv_children_8_0= ruleMessage ) ) | ( (lv_children_9_0= ruleProperty ) ) | ( (lv_children_10_0= ruleParam ) ) | ( (lv_children_11_0= ruleMap ) ) | ( (lv_children_12_0= ruleMapMethod ) ) | ( (lv_children_13_0= ruleDebugTag ) ) | ( (lv_children_14_0= ruleField ) ) | ( (lv_children_15_0= ruleComment ) ) | ( (lv_children_16_0= ruleBreak ) ) )* ( (lv_closedTag_17_0= RULE_MAP_METHOD_ENDTAG_START ) ) ( (lv_methodClosingName_18_0= RULE_ID ) ) this_DOT_19= RULE_DOT ( (lv_methodClosingMethod_20_0= RULE_ID ) ) this_XML_TAG_END_21= RULE_XML_TAG_END ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3154:2: this_MAP_METHOD_STARTTAG_START_0= RULE_MAP_METHOD_STARTTAG_START ( (lv_mapName_1_0= RULE_ID ) ) this_DOT_2= RULE_DOT ( (lv_methodName_3_0= ruleAttributeName ) ) ( (lv_attributes_4_0= ruleNonExpression ) )* (this_XML_TAG_SINGLEEND_5= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_6_0= RULE_XML_TAG_END ) ) ( ( (lv_children_7_0= ruleExpressionOrOption ) ) | ( (lv_children_8_0= ruleMessage ) ) | ( (lv_children_9_0= ruleProperty ) ) | ( (lv_children_10_0= ruleParam ) ) | ( (lv_children_11_0= ruleMap ) ) | ( (lv_children_12_0= ruleMapMethod ) ) | ( (lv_children_13_0= ruleDebugTag ) ) | ( (lv_children_14_0= ruleField ) ) | ( (lv_children_15_0= ruleComment ) ) | ( (lv_children_16_0= ruleBreak ) ) )* ( (lv_closedTag_17_0= RULE_MAP_METHOD_ENDTAG_START ) ) ( (lv_methodClosingName_18_0= RULE_ID ) ) this_DOT_19= RULE_DOT ( (lv_methodClosingMethod_20_0= RULE_ID ) ) this_XML_TAG_END_21= RULE_XML_TAG_END ) )
            {
            this_MAP_METHOD_STARTTAG_START_0=(Token)match(input,RULE_MAP_METHOD_STARTTAG_START,FOLLOW_RULE_MAP_METHOD_STARTTAG_START_in_ruleMapMethod6743); 
             
                newLeafNode(this_MAP_METHOD_STARTTAG_START_0, grammarAccess.getMapMethodAccess().getMAP_METHOD_STARTTAG_STARTTerminalRuleCall_0()); 
                
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3158:1: ( (lv_mapName_1_0= RULE_ID ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3159:1: (lv_mapName_1_0= RULE_ID )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3159:1: (lv_mapName_1_0= RULE_ID )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3160:3: lv_mapName_1_0= RULE_ID
            {
            lv_mapName_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapMethod6759); 

            			newLeafNode(lv_mapName_1_0, grammarAccess.getMapMethodAccess().getMapNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMapMethodRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"mapName",
                    		lv_mapName_1_0, 
                    		"ID");
            	    

            }


            }

            this_DOT_2=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleMapMethod6775); 
             
                newLeafNode(this_DOT_2, grammarAccess.getMapMethodAccess().getDOTTerminalRuleCall_2()); 
                
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3180:1: ( (lv_methodName_3_0= ruleAttributeName ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3181:1: (lv_methodName_3_0= ruleAttributeName )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3181:1: (lv_methodName_3_0= ruleAttributeName )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3182:3: lv_methodName_3_0= ruleAttributeName
            {
             
            	        newCompositeNode(grammarAccess.getMapMethodAccess().getMethodNameAttributeNameParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributeName_in_ruleMapMethod6795);
            lv_methodName_3_0=ruleAttributeName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMapMethodRule());
            	        }
                   		set(
                   			current, 
                   			"methodName",
                    		lv_methodName_3_0, 
                    		"AttributeName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3198:2: ( (lv_attributes_4_0= ruleNonExpression ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3199:1: (lv_attributes_4_0= ruleNonExpression )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3199:1: (lv_attributes_4_0= ruleNonExpression )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3200:3: lv_attributes_4_0= ruleNonExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMapMethodAccess().getAttributesNonExpressionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNonExpression_in_ruleMapMethod6816);
            	    lv_attributes_4_0=ruleNonExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMapMethodRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_4_0, 
            	            		"NonExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3216:3: (this_XML_TAG_SINGLEEND_5= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_6_0= RULE_XML_TAG_END ) ) ( ( (lv_children_7_0= ruleExpressionOrOption ) ) | ( (lv_children_8_0= ruleMessage ) ) | ( (lv_children_9_0= ruleProperty ) ) | ( (lv_children_10_0= ruleParam ) ) | ( (lv_children_11_0= ruleMap ) ) | ( (lv_children_12_0= ruleMapMethod ) ) | ( (lv_children_13_0= ruleDebugTag ) ) | ( (lv_children_14_0= ruleField ) ) | ( (lv_children_15_0= ruleComment ) ) | ( (lv_children_16_0= ruleBreak ) ) )* ( (lv_closedTag_17_0= RULE_MAP_METHOD_ENDTAG_START ) ) ( (lv_methodClosingName_18_0= RULE_ID ) ) this_DOT_19= RULE_DOT ( (lv_methodClosingMethod_20_0= RULE_ID ) ) this_XML_TAG_END_21= RULE_XML_TAG_END ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_XML_TAG_SINGLEEND) ) {
                alt45=1;
            }
            else if ( (LA45_0==RULE_XML_TAG_END) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3216:4: this_XML_TAG_SINGLEEND_5= RULE_XML_TAG_SINGLEEND
                    {
                    this_XML_TAG_SINGLEEND_5=(Token)match(input,RULE_XML_TAG_SINGLEEND,FOLLOW_RULE_XML_TAG_SINGLEEND_in_ruleMapMethod6829); 
                     
                        newLeafNode(this_XML_TAG_SINGLEEND_5, grammarAccess.getMapMethodAccess().getXML_TAG_SINGLEENDTerminalRuleCall_5_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3221:6: ( ( (lv_splitTag_6_0= RULE_XML_TAG_END ) ) ( ( (lv_children_7_0= ruleExpressionOrOption ) ) | ( (lv_children_8_0= ruleMessage ) ) | ( (lv_children_9_0= ruleProperty ) ) | ( (lv_children_10_0= ruleParam ) ) | ( (lv_children_11_0= ruleMap ) ) | ( (lv_children_12_0= ruleMapMethod ) ) | ( (lv_children_13_0= ruleDebugTag ) ) | ( (lv_children_14_0= ruleField ) ) | ( (lv_children_15_0= ruleComment ) ) | ( (lv_children_16_0= ruleBreak ) ) )* ( (lv_closedTag_17_0= RULE_MAP_METHOD_ENDTAG_START ) ) ( (lv_methodClosingName_18_0= RULE_ID ) ) this_DOT_19= RULE_DOT ( (lv_methodClosingMethod_20_0= RULE_ID ) ) this_XML_TAG_END_21= RULE_XML_TAG_END )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3221:6: ( ( (lv_splitTag_6_0= RULE_XML_TAG_END ) ) ( ( (lv_children_7_0= ruleExpressionOrOption ) ) | ( (lv_children_8_0= ruleMessage ) ) | ( (lv_children_9_0= ruleProperty ) ) | ( (lv_children_10_0= ruleParam ) ) | ( (lv_children_11_0= ruleMap ) ) | ( (lv_children_12_0= ruleMapMethod ) ) | ( (lv_children_13_0= ruleDebugTag ) ) | ( (lv_children_14_0= ruleField ) ) | ( (lv_children_15_0= ruleComment ) ) | ( (lv_children_16_0= ruleBreak ) ) )* ( (lv_closedTag_17_0= RULE_MAP_METHOD_ENDTAG_START ) ) ( (lv_methodClosingName_18_0= RULE_ID ) ) this_DOT_19= RULE_DOT ( (lv_methodClosingMethod_20_0= RULE_ID ) ) this_XML_TAG_END_21= RULE_XML_TAG_END )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3221:7: ( (lv_splitTag_6_0= RULE_XML_TAG_END ) ) ( ( (lv_children_7_0= ruleExpressionOrOption ) ) | ( (lv_children_8_0= ruleMessage ) ) | ( (lv_children_9_0= ruleProperty ) ) | ( (lv_children_10_0= ruleParam ) ) | ( (lv_children_11_0= ruleMap ) ) | ( (lv_children_12_0= ruleMapMethod ) ) | ( (lv_children_13_0= ruleDebugTag ) ) | ( (lv_children_14_0= ruleField ) ) | ( (lv_children_15_0= ruleComment ) ) | ( (lv_children_16_0= ruleBreak ) ) )* ( (lv_closedTag_17_0= RULE_MAP_METHOD_ENDTAG_START ) ) ( (lv_methodClosingName_18_0= RULE_ID ) ) this_DOT_19= RULE_DOT ( (lv_methodClosingMethod_20_0= RULE_ID ) ) this_XML_TAG_END_21= RULE_XML_TAG_END
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3221:7: ( (lv_splitTag_6_0= RULE_XML_TAG_END ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3222:1: (lv_splitTag_6_0= RULE_XML_TAG_END )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3222:1: (lv_splitTag_6_0= RULE_XML_TAG_END )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3223:3: lv_splitTag_6_0= RULE_XML_TAG_END
                    {
                    lv_splitTag_6_0=(Token)match(input,RULE_XML_TAG_END,FOLLOW_RULE_XML_TAG_END_in_ruleMapMethod6852); 

                    			newLeafNode(lv_splitTag_6_0, grammarAccess.getMapMethodAccess().getSplitTagXML_TAG_ENDTerminalRuleCall_5_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMapMethodRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"splitTag",
                            		true, 
                            		"XML_TAG_END");
                    	    

                    }


                    }

                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3239:2: ( ( (lv_children_7_0= ruleExpressionOrOption ) ) | ( (lv_children_8_0= ruleMessage ) ) | ( (lv_children_9_0= ruleProperty ) ) | ( (lv_children_10_0= ruleParam ) ) | ( (lv_children_11_0= ruleMap ) ) | ( (lv_children_12_0= ruleMapMethod ) ) | ( (lv_children_13_0= ruleDebugTag ) ) | ( (lv_children_14_0= ruleField ) ) | ( (lv_children_15_0= ruleComment ) ) | ( (lv_children_16_0= ruleBreak ) ) )*
                    loop44:
                    do {
                        int alt44=11;
                        switch ( input.LA(1) ) {
                        case RULE_EXPRESSION_START_TAG:
                        case RULE_OPTION_START_TAG:
                            {
                            alt44=1;
                            }
                            break;
                        case RULE_MESSAGE_START_TAG:
                            {
                            alt44=2;
                            }
                            break;
                        case RULE_PROPERTY_START_TAG:
                            {
                            alt44=3;
                            }
                            break;
                        case RULE_PARAM_START_TAG:
                            {
                            alt44=4;
                            }
                            break;
                        case RULE_MAPSTARTKEYWORD:
                            {
                            alt44=5;
                            }
                            break;
                        case RULE_MAP_METHOD_STARTTAG_START:
                            {
                            alt44=6;
                            }
                            break;
                        case RULE_DEBUG_START_TAG:
                            {
                            alt44=7;
                            }
                            break;
                        case RULE_FIELD_START_TAG:
                            {
                            alt44=8;
                            }
                            break;
                        case RULE_COMMENT_START_TAG:
                            {
                            alt44=9;
                            }
                            break;
                        case RULE_BREAK_START_TAG:
                            {
                            alt44=10;
                            }
                            break;

                        }

                        switch (alt44) {
                    	case 1 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3239:3: ( (lv_children_7_0= ruleExpressionOrOption ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3239:3: ( (lv_children_7_0= ruleExpressionOrOption ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3240:1: (lv_children_7_0= ruleExpressionOrOption )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3240:1: (lv_children_7_0= ruleExpressionOrOption )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3241:3: lv_children_7_0= ruleExpressionOrOption
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMapMethodAccess().getChildrenExpressionOrOptionParserRuleCall_5_1_1_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExpressionOrOption_in_ruleMapMethod6879);
                    	    lv_children_7_0=ruleExpressionOrOption();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMapMethodRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_7_0, 
                    	            		"ExpressionOrOption");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3258:6: ( (lv_children_8_0= ruleMessage ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3258:6: ( (lv_children_8_0= ruleMessage ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3259:1: (lv_children_8_0= ruleMessage )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3259:1: (lv_children_8_0= ruleMessage )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3260:3: lv_children_8_0= ruleMessage
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMapMethodAccess().getChildrenMessageParserRuleCall_5_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMessage_in_ruleMapMethod6906);
                    	    lv_children_8_0=ruleMessage();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMapMethodRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_8_0, 
                    	            		"Message");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3277:6: ( (lv_children_9_0= ruleProperty ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3277:6: ( (lv_children_9_0= ruleProperty ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3278:1: (lv_children_9_0= ruleProperty )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3278:1: (lv_children_9_0= ruleProperty )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3279:3: lv_children_9_0= ruleProperty
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMapMethodAccess().getChildrenPropertyParserRuleCall_5_1_1_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleProperty_in_ruleMapMethod6933);
                    	    lv_children_9_0=ruleProperty();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMapMethodRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_9_0, 
                    	            		"Property");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3296:6: ( (lv_children_10_0= ruleParam ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3296:6: ( (lv_children_10_0= ruleParam ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3297:1: (lv_children_10_0= ruleParam )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3297:1: (lv_children_10_0= ruleParam )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3298:3: lv_children_10_0= ruleParam
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMapMethodAccess().getChildrenParamParserRuleCall_5_1_1_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParam_in_ruleMapMethod6960);
                    	    lv_children_10_0=ruleParam();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMapMethodRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_10_0, 
                    	            		"Param");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3315:6: ( (lv_children_11_0= ruleMap ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3315:6: ( (lv_children_11_0= ruleMap ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3316:1: (lv_children_11_0= ruleMap )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3316:1: (lv_children_11_0= ruleMap )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3317:3: lv_children_11_0= ruleMap
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMapMethodAccess().getChildrenMapParserRuleCall_5_1_1_4_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMap_in_ruleMapMethod6987);
                    	    lv_children_11_0=ruleMap();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMapMethodRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_11_0, 
                    	            		"Map");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3334:6: ( (lv_children_12_0= ruleMapMethod ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3334:6: ( (lv_children_12_0= ruleMapMethod ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3335:1: (lv_children_12_0= ruleMapMethod )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3335:1: (lv_children_12_0= ruleMapMethod )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3336:3: lv_children_12_0= ruleMapMethod
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMapMethodAccess().getChildrenMapMethodParserRuleCall_5_1_1_5_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMapMethod_in_ruleMapMethod7014);
                    	    lv_children_12_0=ruleMapMethod();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMapMethodRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_12_0, 
                    	            		"MapMethod");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 7 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3353:6: ( (lv_children_13_0= ruleDebugTag ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3353:6: ( (lv_children_13_0= ruleDebugTag ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3354:1: (lv_children_13_0= ruleDebugTag )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3354:1: (lv_children_13_0= ruleDebugTag )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3355:3: lv_children_13_0= ruleDebugTag
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMapMethodAccess().getChildrenDebugTagParserRuleCall_5_1_1_6_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDebugTag_in_ruleMapMethod7041);
                    	    lv_children_13_0=ruleDebugTag();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMapMethodRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_13_0, 
                    	            		"DebugTag");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 8 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3372:6: ( (lv_children_14_0= ruleField ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3372:6: ( (lv_children_14_0= ruleField ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3373:1: (lv_children_14_0= ruleField )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3373:1: (lv_children_14_0= ruleField )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3374:3: lv_children_14_0= ruleField
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMapMethodAccess().getChildrenFieldParserRuleCall_5_1_1_7_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleField_in_ruleMapMethod7068);
                    	    lv_children_14_0=ruleField();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMapMethodRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_14_0, 
                    	            		"Field");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 9 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3391:6: ( (lv_children_15_0= ruleComment ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3391:6: ( (lv_children_15_0= ruleComment ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3392:1: (lv_children_15_0= ruleComment )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3392:1: (lv_children_15_0= ruleComment )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3393:3: lv_children_15_0= ruleComment
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMapMethodAccess().getChildrenCommentParserRuleCall_5_1_1_8_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleComment_in_ruleMapMethod7095);
                    	    lv_children_15_0=ruleComment();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMapMethodRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_15_0, 
                    	            		"Comment");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 10 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3410:6: ( (lv_children_16_0= ruleBreak ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3410:6: ( (lv_children_16_0= ruleBreak ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3411:1: (lv_children_16_0= ruleBreak )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3411:1: (lv_children_16_0= ruleBreak )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3412:3: lv_children_16_0= ruleBreak
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMapMethodAccess().getChildrenBreakParserRuleCall_5_1_1_9_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleBreak_in_ruleMapMethod7122);
                    	    lv_children_16_0=ruleBreak();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMapMethodRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_16_0, 
                    	            		"Break");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3428:4: ( (lv_closedTag_17_0= RULE_MAP_METHOD_ENDTAG_START ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3429:1: (lv_closedTag_17_0= RULE_MAP_METHOD_ENDTAG_START )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3429:1: (lv_closedTag_17_0= RULE_MAP_METHOD_ENDTAG_START )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3430:3: lv_closedTag_17_0= RULE_MAP_METHOD_ENDTAG_START
                    {
                    lv_closedTag_17_0=(Token)match(input,RULE_MAP_METHOD_ENDTAG_START,FOLLOW_RULE_MAP_METHOD_ENDTAG_START_in_ruleMapMethod7141); 

                    			newLeafNode(lv_closedTag_17_0, grammarAccess.getMapMethodAccess().getClosedTagMAP_METHOD_ENDTAG_STARTTerminalRuleCall_5_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMapMethodRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"closedTag",
                            		true, 
                            		"MAP_METHOD_ENDTAG_START");
                    	    

                    }


                    }

                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3446:2: ( (lv_methodClosingName_18_0= RULE_ID ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3447:1: (lv_methodClosingName_18_0= RULE_ID )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3447:1: (lv_methodClosingName_18_0= RULE_ID )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3448:3: lv_methodClosingName_18_0= RULE_ID
                    {
                    lv_methodClosingName_18_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapMethod7163); 

                    			newLeafNode(lv_methodClosingName_18_0, grammarAccess.getMapMethodAccess().getMethodClosingNameIDTerminalRuleCall_5_1_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMapMethodRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"methodClosingName",
                            		lv_methodClosingName_18_0, 
                            		"ID");
                    	    

                    }


                    }

                    this_DOT_19=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleMapMethod7179); 
                     
                        newLeafNode(this_DOT_19, grammarAccess.getMapMethodAccess().getDOTTerminalRuleCall_5_1_4()); 
                        
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3468:1: ( (lv_methodClosingMethod_20_0= RULE_ID ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3469:1: (lv_methodClosingMethod_20_0= RULE_ID )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3469:1: (lv_methodClosingMethod_20_0= RULE_ID )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3470:3: lv_methodClosingMethod_20_0= RULE_ID
                    {
                    lv_methodClosingMethod_20_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapMethod7195); 

                    			newLeafNode(lv_methodClosingMethod_20_0, grammarAccess.getMapMethodAccess().getMethodClosingMethodIDTerminalRuleCall_5_1_5_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMapMethodRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"methodClosingMethod",
                            		lv_methodClosingMethod_20_0, 
                            		"ID");
                    	    

                    }


                    }

                    this_XML_TAG_END_21=(Token)match(input,RULE_XML_TAG_END,FOLLOW_RULE_XML_TAG_END_in_ruleMapMethod7211); 
                     
                        newLeafNode(this_XML_TAG_END_21, grammarAccess.getMapMethodAccess().getXML_TAG_ENDTerminalRuleCall_5_1_6()); 
                        

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapMethod"


    // $ANTLR start "entryRuleField"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3498:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3499:2: (iv_ruleField= ruleField EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3500:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_ruleField_in_entryRuleField7248);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleField7258); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3507:1: ruleField returns [EObject current=null] : (this_FIELD_START_TAG_0= RULE_FIELD_START_TAG () ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'comment' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_comment_11_0= ruleGarbage ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'type' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_type_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'condition' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_condition_21_0= ruleTopLevel ) ) this_QUOTE_22= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'filter' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_filter_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE ) ) ) ) )* ) ) ) (this_XML_TAG_SINGLEEND_28= RULE_XML_TAG_SINGLEEND | ( ( ( (lv_splitTag_29_0= RULE_XML_TAG_END ) ) ( ( (lv_children_30_0= ruleExpressionOrOption ) ) | ( (lv_children_31_0= ruleParam ) ) | ( (lv_children_32_0= ruleMap ) ) | ( (lv_children_33_0= ruleMapMethod ) ) | ( (lv_children_34_0= ruleDebugTag ) ) | ( (lv_children_35_0= ruleComment ) ) | ( (lv_children_36_0= ruleBreak ) ) )* ) ( (lv_closedTag_37_0= RULE_FIELD_END_TAG ) ) ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token this_FIELD_START_TAG_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_QUOTE_5=null;
        Token lv_nameAttribute_6_0=null;
        Token this_QUOTE_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token this_QUOTE_10=null;
        Token this_QUOTE_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token this_QUOTE_15=null;
        Token lv_type_16_0=null;
        Token this_QUOTE_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token this_QUOTE_20=null;
        Token this_QUOTE_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token this_QUOTE_25=null;
        Token this_QUOTE_27=null;
        Token this_XML_TAG_SINGLEEND_28=null;
        Token lv_splitTag_29_0=null;
        Token lv_closedTag_37_0=null;
        AntlrDatatypeRuleToken lv_comment_11_0 = null;

        EObject lv_condition_21_0 = null;

        EObject lv_filter_26_0 = null;

        EObject lv_children_30_0 = null;

        EObject lv_children_31_0 = null;

        EObject lv_children_32_0 = null;

        EObject lv_children_33_0 = null;

        EObject lv_children_34_0 = null;

        EObject lv_children_35_0 = null;

        EObject lv_children_36_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3510:28: ( (this_FIELD_START_TAG_0= RULE_FIELD_START_TAG () ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'comment' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_comment_11_0= ruleGarbage ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'type' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_type_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'condition' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_condition_21_0= ruleTopLevel ) ) this_QUOTE_22= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'filter' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_filter_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE ) ) ) ) )* ) ) ) (this_XML_TAG_SINGLEEND_28= RULE_XML_TAG_SINGLEEND | ( ( ( (lv_splitTag_29_0= RULE_XML_TAG_END ) ) ( ( (lv_children_30_0= ruleExpressionOrOption ) ) | ( (lv_children_31_0= ruleParam ) ) | ( (lv_children_32_0= ruleMap ) ) | ( (lv_children_33_0= ruleMapMethod ) ) | ( (lv_children_34_0= ruleDebugTag ) ) | ( (lv_children_35_0= ruleComment ) ) | ( (lv_children_36_0= ruleBreak ) ) )* ) ( (lv_closedTag_37_0= RULE_FIELD_END_TAG ) ) ) ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3511:1: (this_FIELD_START_TAG_0= RULE_FIELD_START_TAG () ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'comment' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_comment_11_0= ruleGarbage ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'type' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_type_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'condition' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_condition_21_0= ruleTopLevel ) ) this_QUOTE_22= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'filter' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_filter_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE ) ) ) ) )* ) ) ) (this_XML_TAG_SINGLEEND_28= RULE_XML_TAG_SINGLEEND | ( ( ( (lv_splitTag_29_0= RULE_XML_TAG_END ) ) ( ( (lv_children_30_0= ruleExpressionOrOption ) ) | ( (lv_children_31_0= ruleParam ) ) | ( (lv_children_32_0= ruleMap ) ) | ( (lv_children_33_0= ruleMapMethod ) ) | ( (lv_children_34_0= ruleDebugTag ) ) | ( (lv_children_35_0= ruleComment ) ) | ( (lv_children_36_0= ruleBreak ) ) )* ) ( (lv_closedTag_37_0= RULE_FIELD_END_TAG ) ) ) ) )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3511:1: (this_FIELD_START_TAG_0= RULE_FIELD_START_TAG () ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'comment' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_comment_11_0= ruleGarbage ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'type' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_type_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'condition' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_condition_21_0= ruleTopLevel ) ) this_QUOTE_22= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'filter' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_filter_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE ) ) ) ) )* ) ) ) (this_XML_TAG_SINGLEEND_28= RULE_XML_TAG_SINGLEEND | ( ( ( (lv_splitTag_29_0= RULE_XML_TAG_END ) ) ( ( (lv_children_30_0= ruleExpressionOrOption ) ) | ( (lv_children_31_0= ruleParam ) ) | ( (lv_children_32_0= ruleMap ) ) | ( (lv_children_33_0= ruleMapMethod ) ) | ( (lv_children_34_0= ruleDebugTag ) ) | ( (lv_children_35_0= ruleComment ) ) | ( (lv_children_36_0= ruleBreak ) ) )* ) ( (lv_closedTag_37_0= RULE_FIELD_END_TAG ) ) ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3511:2: this_FIELD_START_TAG_0= RULE_FIELD_START_TAG () ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'comment' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_comment_11_0= ruleGarbage ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'type' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_type_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'condition' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_condition_21_0= ruleTopLevel ) ) this_QUOTE_22= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'filter' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_filter_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE ) ) ) ) )* ) ) ) (this_XML_TAG_SINGLEEND_28= RULE_XML_TAG_SINGLEEND | ( ( ( (lv_splitTag_29_0= RULE_XML_TAG_END ) ) ( ( (lv_children_30_0= ruleExpressionOrOption ) ) | ( (lv_children_31_0= ruleParam ) ) | ( (lv_children_32_0= ruleMap ) ) | ( (lv_children_33_0= ruleMapMethod ) ) | ( (lv_children_34_0= ruleDebugTag ) ) | ( (lv_children_35_0= ruleComment ) ) | ( (lv_children_36_0= ruleBreak ) ) )* ) ( (lv_closedTag_37_0= RULE_FIELD_END_TAG ) ) ) )
            {
            this_FIELD_START_TAG_0=(Token)match(input,RULE_FIELD_START_TAG,FOLLOW_RULE_FIELD_START_TAG_in_ruleField7294); 
             
                newLeafNode(this_FIELD_START_TAG_0, grammarAccess.getFieldAccess().getFIELD_START_TAGTerminalRuleCall_0()); 
                
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3515:1: ()
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3516:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFieldAccess().getFieldAction_1(),
                        current);
                

            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3521:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'comment' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_comment_11_0= ruleGarbage ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'type' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_type_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'condition' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_condition_21_0= ruleTopLevel ) ) this_QUOTE_22= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'filter' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_filter_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE ) ) ) ) )* ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3523:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'comment' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_comment_11_0= ruleGarbage ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'type' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_type_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'condition' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_condition_21_0= ruleTopLevel ) ) this_QUOTE_22= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'filter' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_filter_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE ) ) ) ) )* ) )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3523:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'comment' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_comment_11_0= ruleGarbage ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'type' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_type_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'condition' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_condition_21_0= ruleTopLevel ) ) this_QUOTE_22= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'filter' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_filter_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE ) ) ) ) )* ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3524:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'comment' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_comment_11_0= ruleGarbage ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'type' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_type_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'condition' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_condition_21_0= ruleTopLevel ) ) this_QUOTE_22= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'filter' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_filter_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getFieldAccess().getUnorderedGroup_2());
            	
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3527:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'comment' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_comment_11_0= ruleGarbage ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'type' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_type_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'condition' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_condition_21_0= ruleTopLevel ) ) this_QUOTE_22= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'filter' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_filter_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE ) ) ) ) )* )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3528:3: ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'comment' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_comment_11_0= ruleGarbage ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'type' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_type_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'condition' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_condition_21_0= ruleTopLevel ) ) this_QUOTE_22= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'filter' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_filter_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE ) ) ) ) )*
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3528:3: ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'comment' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_comment_11_0= ruleGarbage ) ) this_QUOTE_12= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'type' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_type_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'condition' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_condition_21_0= ruleTopLevel ) ) this_QUOTE_22= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'filter' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_filter_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE ) ) ) ) )*
            loop46:
            do {
                int alt46=6;
                int LA46_0 = input.LA(1);

                if ( LA46_0 ==75 && getUnorderedGroupHelper().canSelect(grammarAccess.getFieldAccess().getUnorderedGroup_2(), 0) ) {
                    alt46=1;
                }
                else if ( LA46_0 ==85 && getUnorderedGroupHelper().canSelect(grammarAccess.getFieldAccess().getUnorderedGroup_2(), 1) ) {
                    alt46=2;
                }
                else if ( LA46_0 ==76 && getUnorderedGroupHelper().canSelect(grammarAccess.getFieldAccess().getUnorderedGroup_2(), 2) ) {
                    alt46=3;
                }
                else if ( LA46_0 ==77 && getUnorderedGroupHelper().canSelect(grammarAccess.getFieldAccess().getUnorderedGroup_2(), 3) ) {
                    alt46=4;
                }
                else if ( LA46_0 ==80 && getUnorderedGroupHelper().canSelect(grammarAccess.getFieldAccess().getUnorderedGroup_2(), 4) ) {
                    alt46=5;
                }


                switch (alt46) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3530:4: ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE ) ) ) )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3530:4: ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE ) ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3531:5: {...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFieldAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleField", "getUnorderedGroupHelper().canSelect(grammarAccess.getFieldAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3531:102: ( ({...}? => (otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3532:6: ({...}? => (otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFieldAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3535:6: ({...}? => (otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3535:7: {...}? => (otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleField", "true");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3535:16: (otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3535:18: otherlv_3= 'name' otherlv_4= '=' this_QUOTE_5= RULE_QUOTE ( (lv_nameAttribute_6_0= RULE_ID ) ) this_QUOTE_7= RULE_QUOTE
            	    {
            	    otherlv_3=(Token)match(input,75,FOLLOW_75_in_ruleField7360); 

            	        	newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getNameKeyword_2_0_0());
            	        
            	    otherlv_4=(Token)match(input,71,FOLLOW_71_in_ruleField7372); 

            	        	newLeafNode(otherlv_4, grammarAccess.getFieldAccess().getEqualsSignKeyword_2_0_1());
            	        
            	    this_QUOTE_5=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleField7383); 
            	     
            	        newLeafNode(this_QUOTE_5, grammarAccess.getFieldAccess().getQUOTETerminalRuleCall_2_0_2()); 
            	        
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3547:1: ( (lv_nameAttribute_6_0= RULE_ID ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3548:1: (lv_nameAttribute_6_0= RULE_ID )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3548:1: (lv_nameAttribute_6_0= RULE_ID )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3549:3: lv_nameAttribute_6_0= RULE_ID
            	    {
            	    lv_nameAttribute_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField7399); 

            	    			newLeafNode(lv_nameAttribute_6_0, grammarAccess.getFieldAccess().getNameAttributeIDTerminalRuleCall_2_0_3_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getFieldRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"nameAttribute",
            	            		lv_nameAttribute_6_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    this_QUOTE_7=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleField7415); 
            	     
            	        newLeafNode(this_QUOTE_7, grammarAccess.getFieldAccess().getQUOTETerminalRuleCall_2_0_4()); 
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFieldAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3576:4: ({...}? => ( ({...}? => (otherlv_8= 'comment' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_comment_11_0= ruleGarbage ) ) this_QUOTE_12= RULE_QUOTE ) ) ) )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3576:4: ({...}? => ( ({...}? => (otherlv_8= 'comment' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_comment_11_0= ruleGarbage ) ) this_QUOTE_12= RULE_QUOTE ) ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3577:5: {...}? => ( ({...}? => (otherlv_8= 'comment' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_comment_11_0= ruleGarbage ) ) this_QUOTE_12= RULE_QUOTE ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFieldAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleField", "getUnorderedGroupHelper().canSelect(grammarAccess.getFieldAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3577:102: ( ({...}? => (otherlv_8= 'comment' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_comment_11_0= ruleGarbage ) ) this_QUOTE_12= RULE_QUOTE ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3578:6: ({...}? => (otherlv_8= 'comment' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_comment_11_0= ruleGarbage ) ) this_QUOTE_12= RULE_QUOTE ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFieldAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3581:6: ({...}? => (otherlv_8= 'comment' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_comment_11_0= ruleGarbage ) ) this_QUOTE_12= RULE_QUOTE ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3581:7: {...}? => (otherlv_8= 'comment' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_comment_11_0= ruleGarbage ) ) this_QUOTE_12= RULE_QUOTE )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleField", "true");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3581:16: (otherlv_8= 'comment' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_comment_11_0= ruleGarbage ) ) this_QUOTE_12= RULE_QUOTE )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3581:18: otherlv_8= 'comment' otherlv_9= '=' this_QUOTE_10= RULE_QUOTE ( (lv_comment_11_0= ruleGarbage ) ) this_QUOTE_12= RULE_QUOTE
            	    {
            	    otherlv_8=(Token)match(input,85,FOLLOW_85_in_ruleField7482); 

            	        	newLeafNode(otherlv_8, grammarAccess.getFieldAccess().getCommentKeyword_2_1_0());
            	        
            	    otherlv_9=(Token)match(input,71,FOLLOW_71_in_ruleField7494); 

            	        	newLeafNode(otherlv_9, grammarAccess.getFieldAccess().getEqualsSignKeyword_2_1_1());
            	        
            	    this_QUOTE_10=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleField7505); 
            	     
            	        newLeafNode(this_QUOTE_10, grammarAccess.getFieldAccess().getQUOTETerminalRuleCall_2_1_2()); 
            	        
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3593:1: ( (lv_comment_11_0= ruleGarbage ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3594:1: (lv_comment_11_0= ruleGarbage )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3594:1: (lv_comment_11_0= ruleGarbage )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3595:3: lv_comment_11_0= ruleGarbage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFieldAccess().getCommentGarbageParserRuleCall_2_1_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGarbage_in_ruleField7525);
            	    lv_comment_11_0=ruleGarbage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFieldRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"comment",
            	            		lv_comment_11_0, 
            	            		"Garbage");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    this_QUOTE_12=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleField7536); 
            	     
            	        newLeafNode(this_QUOTE_12, grammarAccess.getFieldAccess().getQUOTETerminalRuleCall_2_1_4()); 
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFieldAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3622:4: ({...}? => ( ({...}? => (otherlv_13= 'type' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_type_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3622:4: ({...}? => ( ({...}? => (otherlv_13= 'type' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_type_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3623:5: {...}? => ( ({...}? => (otherlv_13= 'type' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_type_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFieldAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleField", "getUnorderedGroupHelper().canSelect(grammarAccess.getFieldAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3623:102: ( ({...}? => (otherlv_13= 'type' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_type_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3624:6: ({...}? => (otherlv_13= 'type' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_type_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFieldAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3627:6: ({...}? => (otherlv_13= 'type' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_type_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3627:7: {...}? => (otherlv_13= 'type' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_type_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleField", "true");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3627:16: (otherlv_13= 'type' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_type_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3627:18: otherlv_13= 'type' otherlv_14= '=' this_QUOTE_15= RULE_QUOTE ( (lv_type_16_0= RULE_ID ) ) this_QUOTE_17= RULE_QUOTE
            	    {
            	    otherlv_13=(Token)match(input,76,FOLLOW_76_in_ruleField7603); 

            	        	newLeafNode(otherlv_13, grammarAccess.getFieldAccess().getTypeKeyword_2_2_0());
            	        
            	    otherlv_14=(Token)match(input,71,FOLLOW_71_in_ruleField7615); 

            	        	newLeafNode(otherlv_14, grammarAccess.getFieldAccess().getEqualsSignKeyword_2_2_1());
            	        
            	    this_QUOTE_15=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleField7626); 
            	     
            	        newLeafNode(this_QUOTE_15, grammarAccess.getFieldAccess().getQUOTETerminalRuleCall_2_2_2()); 
            	        
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3639:1: ( (lv_type_16_0= RULE_ID ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3640:1: (lv_type_16_0= RULE_ID )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3640:1: (lv_type_16_0= RULE_ID )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3641:3: lv_type_16_0= RULE_ID
            	    {
            	    lv_type_16_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleField7642); 

            	    			newLeafNode(lv_type_16_0, grammarAccess.getFieldAccess().getTypeIDTerminalRuleCall_2_2_3_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getFieldRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"type",
            	            		lv_type_16_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    this_QUOTE_17=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleField7658); 
            	     
            	        newLeafNode(this_QUOTE_17, grammarAccess.getFieldAccess().getQUOTETerminalRuleCall_2_2_4()); 
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFieldAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3668:4: ({...}? => ( ({...}? => (otherlv_18= 'condition' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_condition_21_0= ruleTopLevel ) ) this_QUOTE_22= RULE_QUOTE ) ) ) )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3668:4: ({...}? => ( ({...}? => (otherlv_18= 'condition' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_condition_21_0= ruleTopLevel ) ) this_QUOTE_22= RULE_QUOTE ) ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3669:5: {...}? => ( ({...}? => (otherlv_18= 'condition' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_condition_21_0= ruleTopLevel ) ) this_QUOTE_22= RULE_QUOTE ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFieldAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleField", "getUnorderedGroupHelper().canSelect(grammarAccess.getFieldAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3669:102: ( ({...}? => (otherlv_18= 'condition' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_condition_21_0= ruleTopLevel ) ) this_QUOTE_22= RULE_QUOTE ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3670:6: ({...}? => (otherlv_18= 'condition' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_condition_21_0= ruleTopLevel ) ) this_QUOTE_22= RULE_QUOTE ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFieldAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3673:6: ({...}? => (otherlv_18= 'condition' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_condition_21_0= ruleTopLevel ) ) this_QUOTE_22= RULE_QUOTE ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3673:7: {...}? => (otherlv_18= 'condition' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_condition_21_0= ruleTopLevel ) ) this_QUOTE_22= RULE_QUOTE )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleField", "true");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3673:16: (otherlv_18= 'condition' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_condition_21_0= ruleTopLevel ) ) this_QUOTE_22= RULE_QUOTE )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3673:18: otherlv_18= 'condition' otherlv_19= '=' this_QUOTE_20= RULE_QUOTE ( (lv_condition_21_0= ruleTopLevel ) ) this_QUOTE_22= RULE_QUOTE
            	    {
            	    otherlv_18=(Token)match(input,77,FOLLOW_77_in_ruleField7725); 

            	        	newLeafNode(otherlv_18, grammarAccess.getFieldAccess().getConditionKeyword_2_3_0());
            	        
            	    otherlv_19=(Token)match(input,71,FOLLOW_71_in_ruleField7737); 

            	        	newLeafNode(otherlv_19, grammarAccess.getFieldAccess().getEqualsSignKeyword_2_3_1());
            	        
            	    this_QUOTE_20=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleField7748); 
            	     
            	        newLeafNode(this_QUOTE_20, grammarAccess.getFieldAccess().getQUOTETerminalRuleCall_2_3_2()); 
            	        
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3685:1: ( (lv_condition_21_0= ruleTopLevel ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3686:1: (lv_condition_21_0= ruleTopLevel )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3686:1: (lv_condition_21_0= ruleTopLevel )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3687:3: lv_condition_21_0= ruleTopLevel
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFieldAccess().getConditionTopLevelParserRuleCall_2_3_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTopLevel_in_ruleField7768);
            	    lv_condition_21_0=ruleTopLevel();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFieldRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"condition",
            	            		lv_condition_21_0, 
            	            		"TopLevel");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    this_QUOTE_22=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleField7779); 
            	     
            	        newLeafNode(this_QUOTE_22, grammarAccess.getFieldAccess().getQUOTETerminalRuleCall_2_3_4()); 
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFieldAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3714:4: ({...}? => ( ({...}? => (otherlv_23= 'filter' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_filter_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE ) ) ) )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3714:4: ({...}? => ( ({...}? => (otherlv_23= 'filter' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_filter_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE ) ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3715:5: {...}? => ( ({...}? => (otherlv_23= 'filter' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_filter_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFieldAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleField", "getUnorderedGroupHelper().canSelect(grammarAccess.getFieldAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3715:102: ( ({...}? => (otherlv_23= 'filter' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_filter_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3716:6: ({...}? => (otherlv_23= 'filter' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_filter_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFieldAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3719:6: ({...}? => (otherlv_23= 'filter' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_filter_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3719:7: {...}? => (otherlv_23= 'filter' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_filter_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleField", "true");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3719:16: (otherlv_23= 'filter' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_filter_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3719:18: otherlv_23= 'filter' otherlv_24= '=' this_QUOTE_25= RULE_QUOTE ( (lv_filter_26_0= ruleTopLevel ) ) this_QUOTE_27= RULE_QUOTE
            	    {
            	    otherlv_23=(Token)match(input,80,FOLLOW_80_in_ruleField7846); 

            	        	newLeafNode(otherlv_23, grammarAccess.getFieldAccess().getFilterKeyword_2_4_0());
            	        
            	    otherlv_24=(Token)match(input,71,FOLLOW_71_in_ruleField7858); 

            	        	newLeafNode(otherlv_24, grammarAccess.getFieldAccess().getEqualsSignKeyword_2_4_1());
            	        
            	    this_QUOTE_25=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleField7869); 
            	     
            	        newLeafNode(this_QUOTE_25, grammarAccess.getFieldAccess().getQUOTETerminalRuleCall_2_4_2()); 
            	        
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3731:1: ( (lv_filter_26_0= ruleTopLevel ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3732:1: (lv_filter_26_0= ruleTopLevel )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3732:1: (lv_filter_26_0= ruleTopLevel )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3733:3: lv_filter_26_0= ruleTopLevel
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFieldAccess().getFilterTopLevelParserRuleCall_2_4_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTopLevel_in_ruleField7889);
            	    lv_filter_26_0=ruleTopLevel();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFieldRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"filter",
            	            		lv_filter_26_0, 
            	            		"TopLevel");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    this_QUOTE_27=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleField7900); 
            	     
            	        newLeafNode(this_QUOTE_27, grammarAccess.getFieldAccess().getQUOTETerminalRuleCall_2_4_4()); 
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFieldAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getFieldAccess().getUnorderedGroup_2());
            	

            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3767:2: (this_XML_TAG_SINGLEEND_28= RULE_XML_TAG_SINGLEEND | ( ( ( (lv_splitTag_29_0= RULE_XML_TAG_END ) ) ( ( (lv_children_30_0= ruleExpressionOrOption ) ) | ( (lv_children_31_0= ruleParam ) ) | ( (lv_children_32_0= ruleMap ) ) | ( (lv_children_33_0= ruleMapMethod ) ) | ( (lv_children_34_0= ruleDebugTag ) ) | ( (lv_children_35_0= ruleComment ) ) | ( (lv_children_36_0= ruleBreak ) ) )* ) ( (lv_closedTag_37_0= RULE_FIELD_END_TAG ) ) ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_XML_TAG_SINGLEEND) ) {
                alt48=1;
            }
            else if ( (LA48_0==RULE_XML_TAG_END) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3767:3: this_XML_TAG_SINGLEEND_28= RULE_XML_TAG_SINGLEEND
                    {
                    this_XML_TAG_SINGLEEND_28=(Token)match(input,RULE_XML_TAG_SINGLEEND,FOLLOW_RULE_XML_TAG_SINGLEEND_in_ruleField7952); 
                     
                        newLeafNode(this_XML_TAG_SINGLEEND_28, grammarAccess.getFieldAccess().getXML_TAG_SINGLEENDTerminalRuleCall_3_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3772:6: ( ( ( (lv_splitTag_29_0= RULE_XML_TAG_END ) ) ( ( (lv_children_30_0= ruleExpressionOrOption ) ) | ( (lv_children_31_0= ruleParam ) ) | ( (lv_children_32_0= ruleMap ) ) | ( (lv_children_33_0= ruleMapMethod ) ) | ( (lv_children_34_0= ruleDebugTag ) ) | ( (lv_children_35_0= ruleComment ) ) | ( (lv_children_36_0= ruleBreak ) ) )* ) ( (lv_closedTag_37_0= RULE_FIELD_END_TAG ) ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3772:6: ( ( ( (lv_splitTag_29_0= RULE_XML_TAG_END ) ) ( ( (lv_children_30_0= ruleExpressionOrOption ) ) | ( (lv_children_31_0= ruleParam ) ) | ( (lv_children_32_0= ruleMap ) ) | ( (lv_children_33_0= ruleMapMethod ) ) | ( (lv_children_34_0= ruleDebugTag ) ) | ( (lv_children_35_0= ruleComment ) ) | ( (lv_children_36_0= ruleBreak ) ) )* ) ( (lv_closedTag_37_0= RULE_FIELD_END_TAG ) ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3772:7: ( ( (lv_splitTag_29_0= RULE_XML_TAG_END ) ) ( ( (lv_children_30_0= ruleExpressionOrOption ) ) | ( (lv_children_31_0= ruleParam ) ) | ( (lv_children_32_0= ruleMap ) ) | ( (lv_children_33_0= ruleMapMethod ) ) | ( (lv_children_34_0= ruleDebugTag ) ) | ( (lv_children_35_0= ruleComment ) ) | ( (lv_children_36_0= ruleBreak ) ) )* ) ( (lv_closedTag_37_0= RULE_FIELD_END_TAG ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3772:7: ( ( (lv_splitTag_29_0= RULE_XML_TAG_END ) ) ( ( (lv_children_30_0= ruleExpressionOrOption ) ) | ( (lv_children_31_0= ruleParam ) ) | ( (lv_children_32_0= ruleMap ) ) | ( (lv_children_33_0= ruleMapMethod ) ) | ( (lv_children_34_0= ruleDebugTag ) ) | ( (lv_children_35_0= ruleComment ) ) | ( (lv_children_36_0= ruleBreak ) ) )* )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3772:8: ( (lv_splitTag_29_0= RULE_XML_TAG_END ) ) ( ( (lv_children_30_0= ruleExpressionOrOption ) ) | ( (lv_children_31_0= ruleParam ) ) | ( (lv_children_32_0= ruleMap ) ) | ( (lv_children_33_0= ruleMapMethod ) ) | ( (lv_children_34_0= ruleDebugTag ) ) | ( (lv_children_35_0= ruleComment ) ) | ( (lv_children_36_0= ruleBreak ) ) )*
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3772:8: ( (lv_splitTag_29_0= RULE_XML_TAG_END ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3773:1: (lv_splitTag_29_0= RULE_XML_TAG_END )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3773:1: (lv_splitTag_29_0= RULE_XML_TAG_END )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3774:3: lv_splitTag_29_0= RULE_XML_TAG_END
                    {
                    lv_splitTag_29_0=(Token)match(input,RULE_XML_TAG_END,FOLLOW_RULE_XML_TAG_END_in_ruleField7976); 

                    			newLeafNode(lv_splitTag_29_0, grammarAccess.getFieldAccess().getSplitTagXML_TAG_ENDTerminalRuleCall_3_1_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"splitTag",
                            		true, 
                            		"XML_TAG_END");
                    	    

                    }


                    }

                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3790:2: ( ( (lv_children_30_0= ruleExpressionOrOption ) ) | ( (lv_children_31_0= ruleParam ) ) | ( (lv_children_32_0= ruleMap ) ) | ( (lv_children_33_0= ruleMapMethod ) ) | ( (lv_children_34_0= ruleDebugTag ) ) | ( (lv_children_35_0= ruleComment ) ) | ( (lv_children_36_0= ruleBreak ) ) )*
                    loop47:
                    do {
                        int alt47=8;
                        switch ( input.LA(1) ) {
                        case RULE_EXPRESSION_START_TAG:
                        case RULE_OPTION_START_TAG:
                            {
                            alt47=1;
                            }
                            break;
                        case RULE_PARAM_START_TAG:
                            {
                            alt47=2;
                            }
                            break;
                        case RULE_MAPSTARTKEYWORD:
                            {
                            alt47=3;
                            }
                            break;
                        case RULE_MAP_METHOD_STARTTAG_START:
                            {
                            alt47=4;
                            }
                            break;
                        case RULE_DEBUG_START_TAG:
                            {
                            alt47=5;
                            }
                            break;
                        case RULE_COMMENT_START_TAG:
                            {
                            alt47=6;
                            }
                            break;
                        case RULE_BREAK_START_TAG:
                            {
                            alt47=7;
                            }
                            break;

                        }

                        switch (alt47) {
                    	case 1 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3790:3: ( (lv_children_30_0= ruleExpressionOrOption ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3790:3: ( (lv_children_30_0= ruleExpressionOrOption ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3791:1: (lv_children_30_0= ruleExpressionOrOption )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3791:1: (lv_children_30_0= ruleExpressionOrOption )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3792:3: lv_children_30_0= ruleExpressionOrOption
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFieldAccess().getChildrenExpressionOrOptionParserRuleCall_3_1_0_1_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExpressionOrOption_in_ruleField8003);
                    	    lv_children_30_0=ruleExpressionOrOption();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFieldRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_30_0, 
                    	            		"ExpressionOrOption");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3809:6: ( (lv_children_31_0= ruleParam ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3809:6: ( (lv_children_31_0= ruleParam ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3810:1: (lv_children_31_0= ruleParam )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3810:1: (lv_children_31_0= ruleParam )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3811:3: lv_children_31_0= ruleParam
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFieldAccess().getChildrenParamParserRuleCall_3_1_0_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParam_in_ruleField8030);
                    	    lv_children_31_0=ruleParam();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFieldRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_31_0, 
                    	            		"Param");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3828:6: ( (lv_children_32_0= ruleMap ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3828:6: ( (lv_children_32_0= ruleMap ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3829:1: (lv_children_32_0= ruleMap )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3829:1: (lv_children_32_0= ruleMap )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3830:3: lv_children_32_0= ruleMap
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFieldAccess().getChildrenMapParserRuleCall_3_1_0_1_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMap_in_ruleField8057);
                    	    lv_children_32_0=ruleMap();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFieldRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_32_0, 
                    	            		"Map");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3847:6: ( (lv_children_33_0= ruleMapMethod ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3847:6: ( (lv_children_33_0= ruleMapMethod ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3848:1: (lv_children_33_0= ruleMapMethod )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3848:1: (lv_children_33_0= ruleMapMethod )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3849:3: lv_children_33_0= ruleMapMethod
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFieldAccess().getChildrenMapMethodParserRuleCall_3_1_0_1_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMapMethod_in_ruleField8084);
                    	    lv_children_33_0=ruleMapMethod();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFieldRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_33_0, 
                    	            		"MapMethod");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3866:6: ( (lv_children_34_0= ruleDebugTag ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3866:6: ( (lv_children_34_0= ruleDebugTag ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3867:1: (lv_children_34_0= ruleDebugTag )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3867:1: (lv_children_34_0= ruleDebugTag )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3868:3: lv_children_34_0= ruleDebugTag
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFieldAccess().getChildrenDebugTagParserRuleCall_3_1_0_1_4_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDebugTag_in_ruleField8111);
                    	    lv_children_34_0=ruleDebugTag();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFieldRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_34_0, 
                    	            		"DebugTag");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3885:6: ( (lv_children_35_0= ruleComment ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3885:6: ( (lv_children_35_0= ruleComment ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3886:1: (lv_children_35_0= ruleComment )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3886:1: (lv_children_35_0= ruleComment )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3887:3: lv_children_35_0= ruleComment
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFieldAccess().getChildrenCommentParserRuleCall_3_1_0_1_5_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleComment_in_ruleField8138);
                    	    lv_children_35_0=ruleComment();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFieldRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_35_0, 
                    	            		"Comment");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 7 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3904:6: ( (lv_children_36_0= ruleBreak ) )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3904:6: ( (lv_children_36_0= ruleBreak ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3905:1: (lv_children_36_0= ruleBreak )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3905:1: (lv_children_36_0= ruleBreak )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3906:3: lv_children_36_0= ruleBreak
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFieldAccess().getChildrenBreakParserRuleCall_3_1_0_1_6_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleBreak_in_ruleField8165);
                    	    lv_children_36_0=ruleBreak();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFieldRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_36_0, 
                    	            		"Break");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);


                    }

                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3922:5: ( (lv_closedTag_37_0= RULE_FIELD_END_TAG ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3923:1: (lv_closedTag_37_0= RULE_FIELD_END_TAG )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3923:1: (lv_closedTag_37_0= RULE_FIELD_END_TAG )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3924:3: lv_closedTag_37_0= RULE_FIELD_END_TAG
                    {
                    lv_closedTag_37_0=(Token)match(input,RULE_FIELD_END_TAG,FOLLOW_RULE_FIELD_END_TAG_in_ruleField8185); 

                    			newLeafNode(lv_closedTag_37_0, grammarAccess.getFieldAccess().getClosedTagFIELD_END_TAGTerminalRuleCall_3_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFieldRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"closedTag",
                            		true, 
                            		"FIELD_END_TAG");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleDebugTag"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3948:1: entryRuleDebugTag returns [EObject current=null] : iv_ruleDebugTag= ruleDebugTag EOF ;
    public final EObject entryRuleDebugTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDebugTag = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3949:2: (iv_ruleDebugTag= ruleDebugTag EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3950:2: iv_ruleDebugTag= ruleDebugTag EOF
            {
             newCompositeNode(grammarAccess.getDebugTagRule()); 
            pushFollow(FOLLOW_ruleDebugTag_in_entryRuleDebugTag8228);
            iv_ruleDebugTag=ruleDebugTag();

            state._fsp--;

             current =iv_ruleDebugTag; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDebugTag8238); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDebugTag"


    // $ANTLR start "ruleDebugTag"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3957:1: ruleDebugTag returns [EObject current=null] : (this_DEBUG_START_TAG_0= RULE_DEBUG_START_TAG () ( (otherlv_2= 'value' otherlv_3= '=' ( (lv_value_4_0= ruleTopLevel ) ) )? (otherlv_5= 'condition' otherlv_6= '=' this_QUOTE_7= RULE_QUOTE ( (lv_condition_8_0= ruleTopLevel ) ) this_QUOTE_9= RULE_QUOTE )? ) (this_XML_TAG_SINGLEEND_10= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_11_0= RULE_XML_TAG_END ) ) ( (lv_expression_12_0= ruleTopLevel ) )? ( (lv_closedTag_13_0= RULE_DEBUG_END_TAG ) ) ) ) ) ;
    public final EObject ruleDebugTag() throws RecognitionException {
        EObject current = null;

        Token this_DEBUG_START_TAG_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token this_QUOTE_7=null;
        Token this_QUOTE_9=null;
        Token this_XML_TAG_SINGLEEND_10=null;
        Token lv_splitTag_11_0=null;
        Token lv_closedTag_13_0=null;
        EObject lv_value_4_0 = null;

        EObject lv_condition_8_0 = null;

        EObject lv_expression_12_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3960:28: ( (this_DEBUG_START_TAG_0= RULE_DEBUG_START_TAG () ( (otherlv_2= 'value' otherlv_3= '=' ( (lv_value_4_0= ruleTopLevel ) ) )? (otherlv_5= 'condition' otherlv_6= '=' this_QUOTE_7= RULE_QUOTE ( (lv_condition_8_0= ruleTopLevel ) ) this_QUOTE_9= RULE_QUOTE )? ) (this_XML_TAG_SINGLEEND_10= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_11_0= RULE_XML_TAG_END ) ) ( (lv_expression_12_0= ruleTopLevel ) )? ( (lv_closedTag_13_0= RULE_DEBUG_END_TAG ) ) ) ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3961:1: (this_DEBUG_START_TAG_0= RULE_DEBUG_START_TAG () ( (otherlv_2= 'value' otherlv_3= '=' ( (lv_value_4_0= ruleTopLevel ) ) )? (otherlv_5= 'condition' otherlv_6= '=' this_QUOTE_7= RULE_QUOTE ( (lv_condition_8_0= ruleTopLevel ) ) this_QUOTE_9= RULE_QUOTE )? ) (this_XML_TAG_SINGLEEND_10= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_11_0= RULE_XML_TAG_END ) ) ( (lv_expression_12_0= ruleTopLevel ) )? ( (lv_closedTag_13_0= RULE_DEBUG_END_TAG ) ) ) ) )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3961:1: (this_DEBUG_START_TAG_0= RULE_DEBUG_START_TAG () ( (otherlv_2= 'value' otherlv_3= '=' ( (lv_value_4_0= ruleTopLevel ) ) )? (otherlv_5= 'condition' otherlv_6= '=' this_QUOTE_7= RULE_QUOTE ( (lv_condition_8_0= ruleTopLevel ) ) this_QUOTE_9= RULE_QUOTE )? ) (this_XML_TAG_SINGLEEND_10= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_11_0= RULE_XML_TAG_END ) ) ( (lv_expression_12_0= ruleTopLevel ) )? ( (lv_closedTag_13_0= RULE_DEBUG_END_TAG ) ) ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3961:2: this_DEBUG_START_TAG_0= RULE_DEBUG_START_TAG () ( (otherlv_2= 'value' otherlv_3= '=' ( (lv_value_4_0= ruleTopLevel ) ) )? (otherlv_5= 'condition' otherlv_6= '=' this_QUOTE_7= RULE_QUOTE ( (lv_condition_8_0= ruleTopLevel ) ) this_QUOTE_9= RULE_QUOTE )? ) (this_XML_TAG_SINGLEEND_10= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_11_0= RULE_XML_TAG_END ) ) ( (lv_expression_12_0= ruleTopLevel ) )? ( (lv_closedTag_13_0= RULE_DEBUG_END_TAG ) ) ) )
            {
            this_DEBUG_START_TAG_0=(Token)match(input,RULE_DEBUG_START_TAG,FOLLOW_RULE_DEBUG_START_TAG_in_ruleDebugTag8274); 
             
                newLeafNode(this_DEBUG_START_TAG_0, grammarAccess.getDebugTagAccess().getDEBUG_START_TAGTerminalRuleCall_0()); 
                
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3965:1: ()
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3966:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDebugTagAccess().getDebugTagAction_1(),
                        current);
                

            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3971:2: ( (otherlv_2= 'value' otherlv_3= '=' ( (lv_value_4_0= ruleTopLevel ) ) )? (otherlv_5= 'condition' otherlv_6= '=' this_QUOTE_7= RULE_QUOTE ( (lv_condition_8_0= ruleTopLevel ) ) this_QUOTE_9= RULE_QUOTE )? )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3971:3: (otherlv_2= 'value' otherlv_3= '=' ( (lv_value_4_0= ruleTopLevel ) ) )? (otherlv_5= 'condition' otherlv_6= '=' this_QUOTE_7= RULE_QUOTE ( (lv_condition_8_0= ruleTopLevel ) ) this_QUOTE_9= RULE_QUOTE )?
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3971:3: (otherlv_2= 'value' otherlv_3= '=' ( (lv_value_4_0= ruleTopLevel ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==86) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3971:5: otherlv_2= 'value' otherlv_3= '=' ( (lv_value_4_0= ruleTopLevel ) )
                    {
                    otherlv_2=(Token)match(input,86,FOLLOW_86_in_ruleDebugTag8296); 

                        	newLeafNode(otherlv_2, grammarAccess.getDebugTagAccess().getValueKeyword_2_0_0());
                        
                    otherlv_3=(Token)match(input,71,FOLLOW_71_in_ruleDebugTag8308); 

                        	newLeafNode(otherlv_3, grammarAccess.getDebugTagAccess().getEqualsSignKeyword_2_0_1());
                        
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3979:1: ( (lv_value_4_0= ruleTopLevel ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3980:1: (lv_value_4_0= ruleTopLevel )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3980:1: (lv_value_4_0= ruleTopLevel )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3981:3: lv_value_4_0= ruleTopLevel
                    {
                     
                    	        newCompositeNode(grammarAccess.getDebugTagAccess().getValueTopLevelParserRuleCall_2_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTopLevel_in_ruleDebugTag8329);
                    lv_value_4_0=ruleTopLevel();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDebugTagRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_4_0, 
                            		"TopLevel");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3997:4: (otherlv_5= 'condition' otherlv_6= '=' this_QUOTE_7= RULE_QUOTE ( (lv_condition_8_0= ruleTopLevel ) ) this_QUOTE_9= RULE_QUOTE )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==77) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:3997:6: otherlv_5= 'condition' otherlv_6= '=' this_QUOTE_7= RULE_QUOTE ( (lv_condition_8_0= ruleTopLevel ) ) this_QUOTE_9= RULE_QUOTE
                    {
                    otherlv_5=(Token)match(input,77,FOLLOW_77_in_ruleDebugTag8344); 

                        	newLeafNode(otherlv_5, grammarAccess.getDebugTagAccess().getConditionKeyword_2_1_0());
                        
                    otherlv_6=(Token)match(input,71,FOLLOW_71_in_ruleDebugTag8356); 

                        	newLeafNode(otherlv_6, grammarAccess.getDebugTagAccess().getEqualsSignKeyword_2_1_1());
                        
                    this_QUOTE_7=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleDebugTag8367); 
                     
                        newLeafNode(this_QUOTE_7, grammarAccess.getDebugTagAccess().getQUOTETerminalRuleCall_2_1_2()); 
                        
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4009:1: ( (lv_condition_8_0= ruleTopLevel ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4010:1: (lv_condition_8_0= ruleTopLevel )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4010:1: (lv_condition_8_0= ruleTopLevel )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4011:3: lv_condition_8_0= ruleTopLevel
                    {
                     
                    	        newCompositeNode(grammarAccess.getDebugTagAccess().getConditionTopLevelParserRuleCall_2_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTopLevel_in_ruleDebugTag8387);
                    lv_condition_8_0=ruleTopLevel();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDebugTagRule());
                    	        }
                           		set(
                           			current, 
                           			"condition",
                            		lv_condition_8_0, 
                            		"TopLevel");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    this_QUOTE_9=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleDebugTag8398); 
                     
                        newLeafNode(this_QUOTE_9, grammarAccess.getDebugTagAccess().getQUOTETerminalRuleCall_2_1_4()); 
                        

                    }
                    break;

            }


            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4031:4: (this_XML_TAG_SINGLEEND_10= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_11_0= RULE_XML_TAG_END ) ) ( (lv_expression_12_0= ruleTopLevel ) )? ( (lv_closedTag_13_0= RULE_DEBUG_END_TAG ) ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_XML_TAG_SINGLEEND) ) {
                alt52=1;
            }
            else if ( (LA52_0==RULE_XML_TAG_END) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4031:5: this_XML_TAG_SINGLEEND_10= RULE_XML_TAG_SINGLEEND
                    {
                    this_XML_TAG_SINGLEEND_10=(Token)match(input,RULE_XML_TAG_SINGLEEND,FOLLOW_RULE_XML_TAG_SINGLEEND_in_ruleDebugTag8412); 
                     
                        newLeafNode(this_XML_TAG_SINGLEEND_10, grammarAccess.getDebugTagAccess().getXML_TAG_SINGLEENDTerminalRuleCall_3_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4036:6: ( ( (lv_splitTag_11_0= RULE_XML_TAG_END ) ) ( (lv_expression_12_0= ruleTopLevel ) )? ( (lv_closedTag_13_0= RULE_DEBUG_END_TAG ) ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4036:6: ( ( (lv_splitTag_11_0= RULE_XML_TAG_END ) ) ( (lv_expression_12_0= ruleTopLevel ) )? ( (lv_closedTag_13_0= RULE_DEBUG_END_TAG ) ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4036:7: ( (lv_splitTag_11_0= RULE_XML_TAG_END ) ) ( (lv_expression_12_0= ruleTopLevel ) )? ( (lv_closedTag_13_0= RULE_DEBUG_END_TAG ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4036:7: ( (lv_splitTag_11_0= RULE_XML_TAG_END ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4037:1: (lv_splitTag_11_0= RULE_XML_TAG_END )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4037:1: (lv_splitTag_11_0= RULE_XML_TAG_END )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4038:3: lv_splitTag_11_0= RULE_XML_TAG_END
                    {
                    lv_splitTag_11_0=(Token)match(input,RULE_XML_TAG_END,FOLLOW_RULE_XML_TAG_END_in_ruleDebugTag8435); 

                    			newLeafNode(lv_splitTag_11_0, grammarAccess.getDebugTagAccess().getSplitTagXML_TAG_ENDTerminalRuleCall_3_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDebugTagRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"splitTag",
                            		true, 
                            		"XML_TAG_END");
                    	    

                    }


                    }

                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4054:2: ( (lv_expression_12_0= ruleTopLevel ) )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==RULE_ID||LA51_0==RULE_DOLLAR||(LA51_0>=RULE_NUMBER && LA51_0<=RULE_SQBRACKET_OPEN)||LA51_0==RULE_TML_EXISTS||(LA51_0>=RULE_LITERALSTRING && LA51_0<=RULE_FALSE)||LA51_0==69||LA51_0==96||LA51_0==98) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4055:1: (lv_expression_12_0= ruleTopLevel )
                            {
                            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4055:1: (lv_expression_12_0= ruleTopLevel )
                            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4056:3: lv_expression_12_0= ruleTopLevel
                            {
                             
                            	        newCompositeNode(grammarAccess.getDebugTagAccess().getExpressionTopLevelParserRuleCall_3_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleTopLevel_in_ruleDebugTag8461);
                            lv_expression_12_0=ruleTopLevel();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getDebugTagRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"expression",
                                    		lv_expression_12_0, 
                                    		"TopLevel");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4072:3: ( (lv_closedTag_13_0= RULE_DEBUG_END_TAG ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4073:1: (lv_closedTag_13_0= RULE_DEBUG_END_TAG )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4073:1: (lv_closedTag_13_0= RULE_DEBUG_END_TAG )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4074:3: lv_closedTag_13_0= RULE_DEBUG_END_TAG
                    {
                    lv_closedTag_13_0=(Token)match(input,RULE_DEBUG_END_TAG,FOLLOW_RULE_DEBUG_END_TAG_in_ruleDebugTag8479); 

                    			newLeafNode(lv_closedTag_13_0, grammarAccess.getDebugTagAccess().getClosedTagDEBUG_END_TAGTerminalRuleCall_3_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDebugTagRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"closedTag",
                            		true, 
                            		"DEBUG_END_TAG");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDebugTag"


    // $ANTLR start "entryRuleExpressionOrOption"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4098:1: entryRuleExpressionOrOption returns [EObject current=null] : iv_ruleExpressionOrOption= ruleExpressionOrOption EOF ;
    public final EObject entryRuleExpressionOrOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionOrOption = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4099:2: (iv_ruleExpressionOrOption= ruleExpressionOrOption EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4100:2: iv_ruleExpressionOrOption= ruleExpressionOrOption EOF
            {
             newCompositeNode(grammarAccess.getExpressionOrOptionRule()); 
            pushFollow(FOLLOW_ruleExpressionOrOption_in_entryRuleExpressionOrOption8522);
            iv_ruleExpressionOrOption=ruleExpressionOrOption();

            state._fsp--;

             current =iv_ruleExpressionOrOption; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionOrOption8532); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionOrOption"


    // $ANTLR start "ruleExpressionOrOption"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4107:1: ruleExpressionOrOption returns [EObject current=null] : ( (this_EXPRESSION_START_TAG_0= RULE_EXPRESSION_START_TAG this_ExpressionTag_1= ruleExpressionTag ) | (this_OPTION_START_TAG_2= RULE_OPTION_START_TAG this_Option_3= ruleOption ) ) ;
    public final EObject ruleExpressionOrOption() throws RecognitionException {
        EObject current = null;

        Token this_EXPRESSION_START_TAG_0=null;
        Token this_OPTION_START_TAG_2=null;
        EObject this_ExpressionTag_1 = null;

        EObject this_Option_3 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4110:28: ( ( (this_EXPRESSION_START_TAG_0= RULE_EXPRESSION_START_TAG this_ExpressionTag_1= ruleExpressionTag ) | (this_OPTION_START_TAG_2= RULE_OPTION_START_TAG this_Option_3= ruleOption ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4111:1: ( (this_EXPRESSION_START_TAG_0= RULE_EXPRESSION_START_TAG this_ExpressionTag_1= ruleExpressionTag ) | (this_OPTION_START_TAG_2= RULE_OPTION_START_TAG this_Option_3= ruleOption ) )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4111:1: ( (this_EXPRESSION_START_TAG_0= RULE_EXPRESSION_START_TAG this_ExpressionTag_1= ruleExpressionTag ) | (this_OPTION_START_TAG_2= RULE_OPTION_START_TAG this_Option_3= ruleOption ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_EXPRESSION_START_TAG) ) {
                alt53=1;
            }
            else if ( (LA53_0==RULE_OPTION_START_TAG) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4111:2: (this_EXPRESSION_START_TAG_0= RULE_EXPRESSION_START_TAG this_ExpressionTag_1= ruleExpressionTag )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4111:2: (this_EXPRESSION_START_TAG_0= RULE_EXPRESSION_START_TAG this_ExpressionTag_1= ruleExpressionTag )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4111:3: this_EXPRESSION_START_TAG_0= RULE_EXPRESSION_START_TAG this_ExpressionTag_1= ruleExpressionTag
                    {
                    this_EXPRESSION_START_TAG_0=(Token)match(input,RULE_EXPRESSION_START_TAG,FOLLOW_RULE_EXPRESSION_START_TAG_in_ruleExpressionOrOption8569); 
                     
                        newLeafNode(this_EXPRESSION_START_TAG_0, grammarAccess.getExpressionOrOptionAccess().getEXPRESSION_START_TAGTerminalRuleCall_0_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getExpressionOrOptionAccess().getExpressionTagParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleExpressionTag_in_ruleExpressionOrOption8590);
                    this_ExpressionTag_1=ruleExpressionTag();

                    state._fsp--;

                     
                            current = this_ExpressionTag_1; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4125:6: (this_OPTION_START_TAG_2= RULE_OPTION_START_TAG this_Option_3= ruleOption )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4125:6: (this_OPTION_START_TAG_2= RULE_OPTION_START_TAG this_Option_3= ruleOption )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4125:7: this_OPTION_START_TAG_2= RULE_OPTION_START_TAG this_Option_3= ruleOption
                    {
                    this_OPTION_START_TAG_2=(Token)match(input,RULE_OPTION_START_TAG,FOLLOW_RULE_OPTION_START_TAG_in_ruleExpressionOrOption8608); 
                     
                        newLeafNode(this_OPTION_START_TAG_2, grammarAccess.getExpressionOrOptionAccess().getOPTION_START_TAGTerminalRuleCall_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getExpressionOrOptionAccess().getOptionParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleOption_in_ruleExpressionOrOption8629);
                    this_Option_3=ruleOption();

                    state._fsp--;

                     
                            current = this_Option_3; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionOrOption"


    // $ANTLR start "entryRuleExpressionTag"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4146:1: entryRuleExpressionTag returns [EObject current=null] : iv_ruleExpressionTag= ruleExpressionTag EOF ;
    public final EObject entryRuleExpressionTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionTag = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4147:2: (iv_ruleExpressionTag= ruleExpressionTag EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4148:2: iv_ruleExpressionTag= ruleExpressionTag EOF
            {
             newCompositeNode(grammarAccess.getExpressionTagRule()); 
            pushFollow(FOLLOW_ruleExpressionTag_in_entryRuleExpressionTag8665);
            iv_ruleExpressionTag=ruleExpressionTag();

            state._fsp--;

             current =iv_ruleExpressionTag; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpressionTag8675); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionTag"


    // $ANTLR start "ruleExpressionTag"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4155:1: ruleExpressionTag returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'value' otherlv_3= '=' this_QUOTE_4= RULE_QUOTE ( (lv_value_5_0= ruleTopLevel ) )? this_QUOTE_6= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'condition' otherlv_8= '=' this_QUOTE_9= RULE_QUOTE ( (lv_condition_10_0= ruleTopLevel ) )? this_QUOTE_11= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'xml:space' otherlv_13= '=' this_QUOTE_14= RULE_QUOTE otherlv_15= 'preserve' this_QUOTE_16= RULE_QUOTE ) ) ) ) )* ) ) ) (this_XML_TAG_SINGLEEND_17= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_18_0= RULE_XML_TAG_END ) ) ( (lv_content_19_0= ruleGarbage ) ) ( (lv_closedTag_20_0= RULE_EXPRESSION_END_TAG ) ) ) ) ) ;
    public final EObject ruleExpressionTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_QUOTE_4=null;
        Token this_QUOTE_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token this_QUOTE_9=null;
        Token this_QUOTE_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token this_QUOTE_14=null;
        Token otherlv_15=null;
        Token this_QUOTE_16=null;
        Token this_XML_TAG_SINGLEEND_17=null;
        Token lv_splitTag_18_0=null;
        Token lv_closedTag_20_0=null;
        EObject lv_value_5_0 = null;

        EObject lv_condition_10_0 = null;

        AntlrDatatypeRuleToken lv_content_19_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4158:28: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'value' otherlv_3= '=' this_QUOTE_4= RULE_QUOTE ( (lv_value_5_0= ruleTopLevel ) )? this_QUOTE_6= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'condition' otherlv_8= '=' this_QUOTE_9= RULE_QUOTE ( (lv_condition_10_0= ruleTopLevel ) )? this_QUOTE_11= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'xml:space' otherlv_13= '=' this_QUOTE_14= RULE_QUOTE otherlv_15= 'preserve' this_QUOTE_16= RULE_QUOTE ) ) ) ) )* ) ) ) (this_XML_TAG_SINGLEEND_17= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_18_0= RULE_XML_TAG_END ) ) ( (lv_content_19_0= ruleGarbage ) ) ( (lv_closedTag_20_0= RULE_EXPRESSION_END_TAG ) ) ) ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4159:1: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'value' otherlv_3= '=' this_QUOTE_4= RULE_QUOTE ( (lv_value_5_0= ruleTopLevel ) )? this_QUOTE_6= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'condition' otherlv_8= '=' this_QUOTE_9= RULE_QUOTE ( (lv_condition_10_0= ruleTopLevel ) )? this_QUOTE_11= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'xml:space' otherlv_13= '=' this_QUOTE_14= RULE_QUOTE otherlv_15= 'preserve' this_QUOTE_16= RULE_QUOTE ) ) ) ) )* ) ) ) (this_XML_TAG_SINGLEEND_17= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_18_0= RULE_XML_TAG_END ) ) ( (lv_content_19_0= ruleGarbage ) ) ( (lv_closedTag_20_0= RULE_EXPRESSION_END_TAG ) ) ) ) )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4159:1: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'value' otherlv_3= '=' this_QUOTE_4= RULE_QUOTE ( (lv_value_5_0= ruleTopLevel ) )? this_QUOTE_6= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'condition' otherlv_8= '=' this_QUOTE_9= RULE_QUOTE ( (lv_condition_10_0= ruleTopLevel ) )? this_QUOTE_11= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'xml:space' otherlv_13= '=' this_QUOTE_14= RULE_QUOTE otherlv_15= 'preserve' this_QUOTE_16= RULE_QUOTE ) ) ) ) )* ) ) ) (this_XML_TAG_SINGLEEND_17= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_18_0= RULE_XML_TAG_END ) ) ( (lv_content_19_0= ruleGarbage ) ) ( (lv_closedTag_20_0= RULE_EXPRESSION_END_TAG ) ) ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4159:2: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'value' otherlv_3= '=' this_QUOTE_4= RULE_QUOTE ( (lv_value_5_0= ruleTopLevel ) )? this_QUOTE_6= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'condition' otherlv_8= '=' this_QUOTE_9= RULE_QUOTE ( (lv_condition_10_0= ruleTopLevel ) )? this_QUOTE_11= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'xml:space' otherlv_13= '=' this_QUOTE_14= RULE_QUOTE otherlv_15= 'preserve' this_QUOTE_16= RULE_QUOTE ) ) ) ) )* ) ) ) (this_XML_TAG_SINGLEEND_17= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_18_0= RULE_XML_TAG_END ) ) ( (lv_content_19_0= ruleGarbage ) ) ( (lv_closedTag_20_0= RULE_EXPRESSION_END_TAG ) ) ) )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4159:2: ()
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4160:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getExpressionTagAccess().getExpressionTagAction_0(),
                        current);
                

            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4165:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'value' otherlv_3= '=' this_QUOTE_4= RULE_QUOTE ( (lv_value_5_0= ruleTopLevel ) )? this_QUOTE_6= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'condition' otherlv_8= '=' this_QUOTE_9= RULE_QUOTE ( (lv_condition_10_0= ruleTopLevel ) )? this_QUOTE_11= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'xml:space' otherlv_13= '=' this_QUOTE_14= RULE_QUOTE otherlv_15= 'preserve' this_QUOTE_16= RULE_QUOTE ) ) ) ) )* ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4167:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'value' otherlv_3= '=' this_QUOTE_4= RULE_QUOTE ( (lv_value_5_0= ruleTopLevel ) )? this_QUOTE_6= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'condition' otherlv_8= '=' this_QUOTE_9= RULE_QUOTE ( (lv_condition_10_0= ruleTopLevel ) )? this_QUOTE_11= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'xml:space' otherlv_13= '=' this_QUOTE_14= RULE_QUOTE otherlv_15= 'preserve' this_QUOTE_16= RULE_QUOTE ) ) ) ) )* ) )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4167:1: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'value' otherlv_3= '=' this_QUOTE_4= RULE_QUOTE ( (lv_value_5_0= ruleTopLevel ) )? this_QUOTE_6= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'condition' otherlv_8= '=' this_QUOTE_9= RULE_QUOTE ( (lv_condition_10_0= ruleTopLevel ) )? this_QUOTE_11= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'xml:space' otherlv_13= '=' this_QUOTE_14= RULE_QUOTE otherlv_15= 'preserve' this_QUOTE_16= RULE_QUOTE ) ) ) ) )* ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4168:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'value' otherlv_3= '=' this_QUOTE_4= RULE_QUOTE ( (lv_value_5_0= ruleTopLevel ) )? this_QUOTE_6= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'condition' otherlv_8= '=' this_QUOTE_9= RULE_QUOTE ( (lv_condition_10_0= ruleTopLevel ) )? this_QUOTE_11= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'xml:space' otherlv_13= '=' this_QUOTE_14= RULE_QUOTE otherlv_15= 'preserve' this_QUOTE_16= RULE_QUOTE ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getExpressionTagAccess().getUnorderedGroup_1());
            	
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4171:2: ( ( ({...}? => ( ({...}? => (otherlv_2= 'value' otherlv_3= '=' this_QUOTE_4= RULE_QUOTE ( (lv_value_5_0= ruleTopLevel ) )? this_QUOTE_6= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'condition' otherlv_8= '=' this_QUOTE_9= RULE_QUOTE ( (lv_condition_10_0= ruleTopLevel ) )? this_QUOTE_11= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'xml:space' otherlv_13= '=' this_QUOTE_14= RULE_QUOTE otherlv_15= 'preserve' this_QUOTE_16= RULE_QUOTE ) ) ) ) )* )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4172:3: ( ({...}? => ( ({...}? => (otherlv_2= 'value' otherlv_3= '=' this_QUOTE_4= RULE_QUOTE ( (lv_value_5_0= ruleTopLevel ) )? this_QUOTE_6= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'condition' otherlv_8= '=' this_QUOTE_9= RULE_QUOTE ( (lv_condition_10_0= ruleTopLevel ) )? this_QUOTE_11= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'xml:space' otherlv_13= '=' this_QUOTE_14= RULE_QUOTE otherlv_15= 'preserve' this_QUOTE_16= RULE_QUOTE ) ) ) ) )*
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4172:3: ( ({...}? => ( ({...}? => (otherlv_2= 'value' otherlv_3= '=' this_QUOTE_4= RULE_QUOTE ( (lv_value_5_0= ruleTopLevel ) )? this_QUOTE_6= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'condition' otherlv_8= '=' this_QUOTE_9= RULE_QUOTE ( (lv_condition_10_0= ruleTopLevel ) )? this_QUOTE_11= RULE_QUOTE ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'xml:space' otherlv_13= '=' this_QUOTE_14= RULE_QUOTE otherlv_15= 'preserve' this_QUOTE_16= RULE_QUOTE ) ) ) ) )*
            loop56:
            do {
                int alt56=4;
                int LA56_0 = input.LA(1);

                if ( LA56_0 ==86 && getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionTagAccess().getUnorderedGroup_1(), 0) ) {
                    alt56=1;
                }
                else if ( LA56_0 ==77 && getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionTagAccess().getUnorderedGroup_1(), 1) ) {
                    alt56=2;
                }
                else if ( LA56_0 ==87 && getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionTagAccess().getUnorderedGroup_1(), 2) ) {
                    alt56=3;
                }


                switch (alt56) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4174:4: ({...}? => ( ({...}? => (otherlv_2= 'value' otherlv_3= '=' this_QUOTE_4= RULE_QUOTE ( (lv_value_5_0= ruleTopLevel ) )? this_QUOTE_6= RULE_QUOTE ) ) ) )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4174:4: ({...}? => ( ({...}? => (otherlv_2= 'value' otherlv_3= '=' this_QUOTE_4= RULE_QUOTE ( (lv_value_5_0= ruleTopLevel ) )? this_QUOTE_6= RULE_QUOTE ) ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4175:5: {...}? => ( ({...}? => (otherlv_2= 'value' otherlv_3= '=' this_QUOTE_4= RULE_QUOTE ( (lv_value_5_0= ruleTopLevel ) )? this_QUOTE_6= RULE_QUOTE ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionTagAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleExpressionTag", "getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionTagAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4175:110: ( ({...}? => (otherlv_2= 'value' otherlv_3= '=' this_QUOTE_4= RULE_QUOTE ( (lv_value_5_0= ruleTopLevel ) )? this_QUOTE_6= RULE_QUOTE ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4176:6: ({...}? => (otherlv_2= 'value' otherlv_3= '=' this_QUOTE_4= RULE_QUOTE ( (lv_value_5_0= ruleTopLevel ) )? this_QUOTE_6= RULE_QUOTE ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getExpressionTagAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4179:6: ({...}? => (otherlv_2= 'value' otherlv_3= '=' this_QUOTE_4= RULE_QUOTE ( (lv_value_5_0= ruleTopLevel ) )? this_QUOTE_6= RULE_QUOTE ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4179:7: {...}? => (otherlv_2= 'value' otherlv_3= '=' this_QUOTE_4= RULE_QUOTE ( (lv_value_5_0= ruleTopLevel ) )? this_QUOTE_6= RULE_QUOTE )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleExpressionTag", "true");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4179:16: (otherlv_2= 'value' otherlv_3= '=' this_QUOTE_4= RULE_QUOTE ( (lv_value_5_0= ruleTopLevel ) )? this_QUOTE_6= RULE_QUOTE )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4179:18: otherlv_2= 'value' otherlv_3= '=' this_QUOTE_4= RULE_QUOTE ( (lv_value_5_0= ruleTopLevel ) )? this_QUOTE_6= RULE_QUOTE
            	    {
            	    otherlv_2=(Token)match(input,86,FOLLOW_86_in_ruleExpressionTag8767); 

            	        	newLeafNode(otherlv_2, grammarAccess.getExpressionTagAccess().getValueKeyword_1_0_0());
            	        
            	    otherlv_3=(Token)match(input,71,FOLLOW_71_in_ruleExpressionTag8779); 

            	        	newLeafNode(otherlv_3, grammarAccess.getExpressionTagAccess().getEqualsSignKeyword_1_0_1());
            	        
            	    this_QUOTE_4=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleExpressionTag8790); 
            	     
            	        newLeafNode(this_QUOTE_4, grammarAccess.getExpressionTagAccess().getQUOTETerminalRuleCall_1_0_2()); 
            	        
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4191:1: ( (lv_value_5_0= ruleTopLevel ) )?
            	    int alt54=2;
            	    int LA54_0 = input.LA(1);

            	    if ( (LA54_0==RULE_ID||LA54_0==RULE_DOLLAR||(LA54_0>=RULE_NUMBER && LA54_0<=RULE_SQBRACKET_OPEN)||LA54_0==RULE_TML_EXISTS||(LA54_0>=RULE_LITERALSTRING && LA54_0<=RULE_FALSE)||LA54_0==69||LA54_0==96||LA54_0==98) ) {
            	        alt54=1;
            	    }
            	    switch (alt54) {
            	        case 1 :
            	            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4192:1: (lv_value_5_0= ruleTopLevel )
            	            {
            	            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4192:1: (lv_value_5_0= ruleTopLevel )
            	            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4193:3: lv_value_5_0= ruleTopLevel
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getExpressionTagAccess().getValueTopLevelParserRuleCall_1_0_3_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleTopLevel_in_ruleExpressionTag8810);
            	            lv_value_5_0=ruleTopLevel();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getExpressionTagRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"value",
            	                    		lv_value_5_0, 
            	                    		"TopLevel");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    this_QUOTE_6=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleExpressionTag8822); 
            	     
            	        newLeafNode(this_QUOTE_6, grammarAccess.getExpressionTagAccess().getQUOTETerminalRuleCall_1_0_4()); 
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getExpressionTagAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4220:4: ({...}? => ( ({...}? => (otherlv_7= 'condition' otherlv_8= '=' this_QUOTE_9= RULE_QUOTE ( (lv_condition_10_0= ruleTopLevel ) )? this_QUOTE_11= RULE_QUOTE ) ) ) )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4220:4: ({...}? => ( ({...}? => (otherlv_7= 'condition' otherlv_8= '=' this_QUOTE_9= RULE_QUOTE ( (lv_condition_10_0= ruleTopLevel ) )? this_QUOTE_11= RULE_QUOTE ) ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4221:5: {...}? => ( ({...}? => (otherlv_7= 'condition' otherlv_8= '=' this_QUOTE_9= RULE_QUOTE ( (lv_condition_10_0= ruleTopLevel ) )? this_QUOTE_11= RULE_QUOTE ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionTagAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleExpressionTag", "getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionTagAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4221:110: ( ({...}? => (otherlv_7= 'condition' otherlv_8= '=' this_QUOTE_9= RULE_QUOTE ( (lv_condition_10_0= ruleTopLevel ) )? this_QUOTE_11= RULE_QUOTE ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4222:6: ({...}? => (otherlv_7= 'condition' otherlv_8= '=' this_QUOTE_9= RULE_QUOTE ( (lv_condition_10_0= ruleTopLevel ) )? this_QUOTE_11= RULE_QUOTE ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getExpressionTagAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4225:6: ({...}? => (otherlv_7= 'condition' otherlv_8= '=' this_QUOTE_9= RULE_QUOTE ( (lv_condition_10_0= ruleTopLevel ) )? this_QUOTE_11= RULE_QUOTE ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4225:7: {...}? => (otherlv_7= 'condition' otherlv_8= '=' this_QUOTE_9= RULE_QUOTE ( (lv_condition_10_0= ruleTopLevel ) )? this_QUOTE_11= RULE_QUOTE )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleExpressionTag", "true");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4225:16: (otherlv_7= 'condition' otherlv_8= '=' this_QUOTE_9= RULE_QUOTE ( (lv_condition_10_0= ruleTopLevel ) )? this_QUOTE_11= RULE_QUOTE )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4225:18: otherlv_7= 'condition' otherlv_8= '=' this_QUOTE_9= RULE_QUOTE ( (lv_condition_10_0= ruleTopLevel ) )? this_QUOTE_11= RULE_QUOTE
            	    {
            	    otherlv_7=(Token)match(input,77,FOLLOW_77_in_ruleExpressionTag8889); 

            	        	newLeafNode(otherlv_7, grammarAccess.getExpressionTagAccess().getConditionKeyword_1_1_0());
            	        
            	    otherlv_8=(Token)match(input,71,FOLLOW_71_in_ruleExpressionTag8901); 

            	        	newLeafNode(otherlv_8, grammarAccess.getExpressionTagAccess().getEqualsSignKeyword_1_1_1());
            	        
            	    this_QUOTE_9=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleExpressionTag8912); 
            	     
            	        newLeafNode(this_QUOTE_9, grammarAccess.getExpressionTagAccess().getQUOTETerminalRuleCall_1_1_2()); 
            	        
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4237:1: ( (lv_condition_10_0= ruleTopLevel ) )?
            	    int alt55=2;
            	    int LA55_0 = input.LA(1);

            	    if ( (LA55_0==RULE_ID||LA55_0==RULE_DOLLAR||(LA55_0>=RULE_NUMBER && LA55_0<=RULE_SQBRACKET_OPEN)||LA55_0==RULE_TML_EXISTS||(LA55_0>=RULE_LITERALSTRING && LA55_0<=RULE_FALSE)||LA55_0==69||LA55_0==96||LA55_0==98) ) {
            	        alt55=1;
            	    }
            	    switch (alt55) {
            	        case 1 :
            	            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4238:1: (lv_condition_10_0= ruleTopLevel )
            	            {
            	            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4238:1: (lv_condition_10_0= ruleTopLevel )
            	            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4239:3: lv_condition_10_0= ruleTopLevel
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getExpressionTagAccess().getConditionTopLevelParserRuleCall_1_1_3_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleTopLevel_in_ruleExpressionTag8932);
            	            lv_condition_10_0=ruleTopLevel();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getExpressionTagRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"condition",
            	                    		lv_condition_10_0, 
            	                    		"TopLevel");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }
            	            break;

            	    }

            	    this_QUOTE_11=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleExpressionTag8944); 
            	     
            	        newLeafNode(this_QUOTE_11, grammarAccess.getExpressionTagAccess().getQUOTETerminalRuleCall_1_1_4()); 
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getExpressionTagAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4266:4: ({...}? => ( ({...}? => (otherlv_12= 'xml:space' otherlv_13= '=' this_QUOTE_14= RULE_QUOTE otherlv_15= 'preserve' this_QUOTE_16= RULE_QUOTE ) ) ) )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4266:4: ({...}? => ( ({...}? => (otherlv_12= 'xml:space' otherlv_13= '=' this_QUOTE_14= RULE_QUOTE otherlv_15= 'preserve' this_QUOTE_16= RULE_QUOTE ) ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4267:5: {...}? => ( ({...}? => (otherlv_12= 'xml:space' otherlv_13= '=' this_QUOTE_14= RULE_QUOTE otherlv_15= 'preserve' this_QUOTE_16= RULE_QUOTE ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionTagAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleExpressionTag", "getUnorderedGroupHelper().canSelect(grammarAccess.getExpressionTagAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4267:110: ( ({...}? => (otherlv_12= 'xml:space' otherlv_13= '=' this_QUOTE_14= RULE_QUOTE otherlv_15= 'preserve' this_QUOTE_16= RULE_QUOTE ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4268:6: ({...}? => (otherlv_12= 'xml:space' otherlv_13= '=' this_QUOTE_14= RULE_QUOTE otherlv_15= 'preserve' this_QUOTE_16= RULE_QUOTE ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getExpressionTagAccess().getUnorderedGroup_1(), 2);
            	    	 				
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4271:6: ({...}? => (otherlv_12= 'xml:space' otherlv_13= '=' this_QUOTE_14= RULE_QUOTE otherlv_15= 'preserve' this_QUOTE_16= RULE_QUOTE ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4271:7: {...}? => (otherlv_12= 'xml:space' otherlv_13= '=' this_QUOTE_14= RULE_QUOTE otherlv_15= 'preserve' this_QUOTE_16= RULE_QUOTE )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleExpressionTag", "true");
            	    }
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4271:16: (otherlv_12= 'xml:space' otherlv_13= '=' this_QUOTE_14= RULE_QUOTE otherlv_15= 'preserve' this_QUOTE_16= RULE_QUOTE )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4271:18: otherlv_12= 'xml:space' otherlv_13= '=' this_QUOTE_14= RULE_QUOTE otherlv_15= 'preserve' this_QUOTE_16= RULE_QUOTE
            	    {
            	    otherlv_12=(Token)match(input,87,FOLLOW_87_in_ruleExpressionTag9011); 

            	        	newLeafNode(otherlv_12, grammarAccess.getExpressionTagAccess().getXmlSpaceKeyword_1_2_0());
            	        
            	    otherlv_13=(Token)match(input,71,FOLLOW_71_in_ruleExpressionTag9023); 

            	        	newLeafNode(otherlv_13, grammarAccess.getExpressionTagAccess().getEqualsSignKeyword_1_2_1());
            	        
            	    this_QUOTE_14=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleExpressionTag9034); 
            	     
            	        newLeafNode(this_QUOTE_14, grammarAccess.getExpressionTagAccess().getQUOTETerminalRuleCall_1_2_2()); 
            	        
            	    otherlv_15=(Token)match(input,88,FOLLOW_88_in_ruleExpressionTag9045); 

            	        	newLeafNode(otherlv_15, grammarAccess.getExpressionTagAccess().getPreserveKeyword_1_2_3());
            	        
            	    this_QUOTE_16=(Token)match(input,RULE_QUOTE,FOLLOW_RULE_QUOTE_in_ruleExpressionTag9056); 
            	     
            	        newLeafNode(this_QUOTE_16, grammarAccess.getExpressionTagAccess().getQUOTETerminalRuleCall_1_2_4()); 
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getExpressionTagAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getExpressionTagAccess().getUnorderedGroup_1());
            	

            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4305:2: (this_XML_TAG_SINGLEEND_17= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_18_0= RULE_XML_TAG_END ) ) ( (lv_content_19_0= ruleGarbage ) ) ( (lv_closedTag_20_0= RULE_EXPRESSION_END_TAG ) ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_XML_TAG_SINGLEEND) ) {
                alt57=1;
            }
            else if ( (LA57_0==RULE_XML_TAG_END) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4305:3: this_XML_TAG_SINGLEEND_17= RULE_XML_TAG_SINGLEEND
                    {
                    this_XML_TAG_SINGLEEND_17=(Token)match(input,RULE_XML_TAG_SINGLEEND,FOLLOW_RULE_XML_TAG_SINGLEEND_in_ruleExpressionTag9108); 
                     
                        newLeafNode(this_XML_TAG_SINGLEEND_17, grammarAccess.getExpressionTagAccess().getXML_TAG_SINGLEENDTerminalRuleCall_2_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4310:6: ( ( (lv_splitTag_18_0= RULE_XML_TAG_END ) ) ( (lv_content_19_0= ruleGarbage ) ) ( (lv_closedTag_20_0= RULE_EXPRESSION_END_TAG ) ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4310:6: ( ( (lv_splitTag_18_0= RULE_XML_TAG_END ) ) ( (lv_content_19_0= ruleGarbage ) ) ( (lv_closedTag_20_0= RULE_EXPRESSION_END_TAG ) ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4310:7: ( (lv_splitTag_18_0= RULE_XML_TAG_END ) ) ( (lv_content_19_0= ruleGarbage ) ) ( (lv_closedTag_20_0= RULE_EXPRESSION_END_TAG ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4310:7: ( (lv_splitTag_18_0= RULE_XML_TAG_END ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4311:1: (lv_splitTag_18_0= RULE_XML_TAG_END )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4311:1: (lv_splitTag_18_0= RULE_XML_TAG_END )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4312:3: lv_splitTag_18_0= RULE_XML_TAG_END
                    {
                    lv_splitTag_18_0=(Token)match(input,RULE_XML_TAG_END,FOLLOW_RULE_XML_TAG_END_in_ruleExpressionTag9131); 

                    			newLeafNode(lv_splitTag_18_0, grammarAccess.getExpressionTagAccess().getSplitTagXML_TAG_ENDTerminalRuleCall_2_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExpressionTagRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"splitTag",
                            		true, 
                            		"XML_TAG_END");
                    	    

                    }


                    }

                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4328:2: ( (lv_content_19_0= ruleGarbage ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4329:1: (lv_content_19_0= ruleGarbage )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4329:1: (lv_content_19_0= ruleGarbage )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4330:3: lv_content_19_0= ruleGarbage
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpressionTagAccess().getContentGarbageParserRuleCall_2_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGarbage_in_ruleExpressionTag9157);
                    lv_content_19_0=ruleGarbage();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExpressionTagRule());
                    	        }
                           		set(
                           			current, 
                           			"content",
                            		lv_content_19_0, 
                            		"Garbage");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4346:2: ( (lv_closedTag_20_0= RULE_EXPRESSION_END_TAG ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4347:1: (lv_closedTag_20_0= RULE_EXPRESSION_END_TAG )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4347:1: (lv_closedTag_20_0= RULE_EXPRESSION_END_TAG )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4348:3: lv_closedTag_20_0= RULE_EXPRESSION_END_TAG
                    {
                    lv_closedTag_20_0=(Token)match(input,RULE_EXPRESSION_END_TAG,FOLLOW_RULE_EXPRESSION_END_TAG_in_ruleExpressionTag9174); 

                    			newLeafNode(lv_closedTag_20_0, grammarAccess.getExpressionTagAccess().getClosedTagEXPRESSION_END_TAGTerminalRuleCall_2_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExpressionTagRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"closedTag",
                            		true, 
                            		"EXPRESSION_END_TAG");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionTag"


    // $ANTLR start "entryRuleOption"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4372:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4373:2: (iv_ruleOption= ruleOption EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4374:2: iv_ruleOption= ruleOption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_ruleOption_in_entryRuleOption9217);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOption9227); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4381:1: ruleOption returns [EObject current=null] : ( () ( (lv_attributes_1_0= ruleNonExpression ) )* (this_XML_TAG_SINGLEEND_2= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_4_0= RULE_OPTION_END_TAG ) ) ) ) ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        Token this_XML_TAG_SINGLEEND_2=null;
        Token lv_splitTag_3_0=null;
        Token lv_closedTag_4_0=null;
        EObject lv_attributes_1_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4384:28: ( ( () ( (lv_attributes_1_0= ruleNonExpression ) )* (this_XML_TAG_SINGLEEND_2= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_4_0= RULE_OPTION_END_TAG ) ) ) ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4385:1: ( () ( (lv_attributes_1_0= ruleNonExpression ) )* (this_XML_TAG_SINGLEEND_2= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_4_0= RULE_OPTION_END_TAG ) ) ) ) )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4385:1: ( () ( (lv_attributes_1_0= ruleNonExpression ) )* (this_XML_TAG_SINGLEEND_2= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_4_0= RULE_OPTION_END_TAG ) ) ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4385:2: () ( (lv_attributes_1_0= ruleNonExpression ) )* (this_XML_TAG_SINGLEEND_2= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_4_0= RULE_OPTION_END_TAG ) ) ) )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4385:2: ()
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4386:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOptionAccess().getOptionAction_0(),
                        current);
                

            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4391:2: ( (lv_attributes_1_0= ruleNonExpression ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_ID) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4392:1: (lv_attributes_1_0= ruleNonExpression )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4392:1: (lv_attributes_1_0= ruleNonExpression )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4393:3: lv_attributes_1_0= ruleNonExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOptionAccess().getAttributesNonExpressionParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNonExpression_in_ruleOption9282);
            	    lv_attributes_1_0=ruleNonExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOptionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_1_0, 
            	            		"NonExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4409:3: (this_XML_TAG_SINGLEEND_2= RULE_XML_TAG_SINGLEEND | ( ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_4_0= RULE_OPTION_END_TAG ) ) ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_XML_TAG_SINGLEEND) ) {
                alt59=1;
            }
            else if ( (LA59_0==RULE_XML_TAG_END) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4409:4: this_XML_TAG_SINGLEEND_2= RULE_XML_TAG_SINGLEEND
                    {
                    this_XML_TAG_SINGLEEND_2=(Token)match(input,RULE_XML_TAG_SINGLEEND,FOLLOW_RULE_XML_TAG_SINGLEEND_in_ruleOption9295); 
                     
                        newLeafNode(this_XML_TAG_SINGLEEND_2, grammarAccess.getOptionAccess().getXML_TAG_SINGLEENDTerminalRuleCall_2_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4414:6: ( ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_4_0= RULE_OPTION_END_TAG ) ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4414:6: ( ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_4_0= RULE_OPTION_END_TAG ) ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4414:7: ( (lv_splitTag_3_0= RULE_XML_TAG_END ) ) ( (lv_closedTag_4_0= RULE_OPTION_END_TAG ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4414:7: ( (lv_splitTag_3_0= RULE_XML_TAG_END ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4415:1: (lv_splitTag_3_0= RULE_XML_TAG_END )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4415:1: (lv_splitTag_3_0= RULE_XML_TAG_END )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4416:3: lv_splitTag_3_0= RULE_XML_TAG_END
                    {
                    lv_splitTag_3_0=(Token)match(input,RULE_XML_TAG_END,FOLLOW_RULE_XML_TAG_END_in_ruleOption9318); 

                    			newLeafNode(lv_splitTag_3_0, grammarAccess.getOptionAccess().getSplitTagXML_TAG_ENDTerminalRuleCall_2_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOptionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"splitTag",
                            		true, 
                            		"XML_TAG_END");
                    	    

                    }


                    }

                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4432:2: ( (lv_closedTag_4_0= RULE_OPTION_END_TAG ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4433:1: (lv_closedTag_4_0= RULE_OPTION_END_TAG )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4433:1: (lv_closedTag_4_0= RULE_OPTION_END_TAG )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4434:3: lv_closedTag_4_0= RULE_OPTION_END_TAG
                    {
                    lv_closedTag_4_0=(Token)match(input,RULE_OPTION_END_TAG,FOLLOW_RULE_OPTION_END_TAG_in_ruleOption9340); 

                    			newLeafNode(lv_closedTag_4_0, grammarAccess.getOptionAccess().getClosedTagOPTION_END_TAGTerminalRuleCall_2_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOptionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"closedTag",
                            		true, 
                            		"OPTION_END_TAG");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleTopLevel"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4458:1: entryRuleTopLevel returns [EObject current=null] : iv_ruleTopLevel= ruleTopLevel EOF ;
    public final EObject entryRuleTopLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopLevel = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4459:2: (iv_ruleTopLevel= ruleTopLevel EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4460:2: iv_ruleTopLevel= ruleTopLevel EOF
            {
             newCompositeNode(grammarAccess.getTopLevelRule()); 
            pushFollow(FOLLOW_ruleTopLevel_in_entryRuleTopLevel9383);
            iv_ruleTopLevel=ruleTopLevel();

            state._fsp--;

             current =iv_ruleTopLevel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopLevel9393); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTopLevel"


    // $ANTLR start "ruleTopLevel"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4467:1: ruleTopLevel returns [EObject current=null] : ( (lv_toplevelExpression_0_0= ruleOrExpression ) ) ;
    public final EObject ruleTopLevel() throws RecognitionException {
        EObject current = null;

        EObject lv_toplevelExpression_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4470:28: ( ( (lv_toplevelExpression_0_0= ruleOrExpression ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4471:1: ( (lv_toplevelExpression_0_0= ruleOrExpression ) )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4471:1: ( (lv_toplevelExpression_0_0= ruleOrExpression ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4472:1: (lv_toplevelExpression_0_0= ruleOrExpression )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4472:1: (lv_toplevelExpression_0_0= ruleOrExpression )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4473:3: lv_toplevelExpression_0_0= ruleOrExpression
            {
             
            	        newCompositeNode(grammarAccess.getTopLevelAccess().getToplevelExpressionOrExpressionParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleOrExpression_in_ruleTopLevel9438);
            lv_toplevelExpression_0_0=ruleOrExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTopLevelRule());
            	        }
                   		set(
                   			current, 
                   			"toplevelExpression",
                    		lv_toplevelExpression_0_0, 
                    		"OrExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTopLevel"


    // $ANTLR start "entryRulePathElement"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4497:1: entryRulePathElement returns [String current=null] : iv_rulePathElement= rulePathElement EOF ;
    public final String entryRulePathElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePathElement = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4498:2: (iv_rulePathElement= rulePathElement EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4499:2: iv_rulePathElement= rulePathElement EOF
            {
             newCompositeNode(grammarAccess.getPathElementRule()); 
            pushFollow(FOLLOW_rulePathElement_in_entryRulePathElement9474);
            iv_rulePathElement=rulePathElement();

            state._fsp--;

             current =iv_rulePathElement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathElement9485); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePathElement"


    // $ANTLR start "rulePathElement"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4506:1: rulePathElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_DOT_1= RULE_DOT | this_PARENT_2= RULE_PARENT | this_TML_SEPARATOR_3= RULE_TML_SEPARATOR ) ;
    public final AntlrDatatypeRuleToken rulePathElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_DOT_1=null;
        Token this_PARENT_2=null;
        Token this_TML_SEPARATOR_3=null;

         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4509:28: ( (this_ID_0= RULE_ID | this_DOT_1= RULE_DOT | this_PARENT_2= RULE_PARENT | this_TML_SEPARATOR_3= RULE_TML_SEPARATOR ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4510:1: (this_ID_0= RULE_ID | this_DOT_1= RULE_DOT | this_PARENT_2= RULE_PARENT | this_TML_SEPARATOR_3= RULE_TML_SEPARATOR )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4510:1: (this_ID_0= RULE_ID | this_DOT_1= RULE_DOT | this_PARENT_2= RULE_PARENT | this_TML_SEPARATOR_3= RULE_TML_SEPARATOR )
            int alt60=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt60=1;
                }
                break;
            case RULE_DOT:
                {
                alt60=2;
                }
                break;
            case RULE_PARENT:
                {
                alt60=3;
                }
                break;
            case RULE_TML_SEPARATOR:
                {
                alt60=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4510:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePathElement9525); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getPathElementAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4518:10: this_DOT_1= RULE_DOT
                    {
                    this_DOT_1=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_rulePathElement9551); 

                    		current.merge(this_DOT_1);
                        
                     
                        newLeafNode(this_DOT_1, grammarAccess.getPathElementAccess().getDOTTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4526:10: this_PARENT_2= RULE_PARENT
                    {
                    this_PARENT_2=(Token)match(input,RULE_PARENT,FOLLOW_RULE_PARENT_in_rulePathElement9577); 

                    		current.merge(this_PARENT_2);
                        
                     
                        newLeafNode(this_PARENT_2, grammarAccess.getPathElementAccess().getPARENTTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4534:10: this_TML_SEPARATOR_3= RULE_TML_SEPARATOR
                    {
                    this_TML_SEPARATOR_3=(Token)match(input,RULE_TML_SEPARATOR,FOLLOW_RULE_TML_SEPARATOR_in_rulePathElement9603); 

                    		current.merge(this_TML_SEPARATOR_3);
                        
                     
                        newLeafNode(this_TML_SEPARATOR_3, grammarAccess.getPathElementAccess().getTML_SEPARATORTerminalRuleCall_3()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePathElement"


    // $ANTLR start "entryRuleTmlExpression"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4549:1: entryRuleTmlExpression returns [EObject current=null] : iv_ruleTmlExpression= ruleTmlExpression EOF ;
    public final EObject entryRuleTmlExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTmlExpression = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4550:2: (iv_ruleTmlExpression= ruleTmlExpression EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4551:2: iv_ruleTmlExpression= ruleTmlExpression EOF
            {
             newCompositeNode(grammarAccess.getTmlExpressionRule()); 
            pushFollow(FOLLOW_ruleTmlExpression_in_entryRuleTmlExpression9648);
            iv_ruleTmlExpression=ruleTmlExpression();

            state._fsp--;

             current =iv_ruleTmlExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTmlExpression9658); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTmlExpression"


    // $ANTLR start "ruleTmlExpression"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4558:1: ruleTmlExpression returns [EObject current=null] : (this_SQBRACKET_OPEN_0= RULE_SQBRACKET_OPEN ( (lv_absolute_1_0= RULE_TML_SEPARATOR ) )? ( (lv_param_2_0= RULE_AT ) )? ( (lv_elements_3_0= rulePathElement ) ) (this_TML_SEPARATOR_4= RULE_TML_SEPARATOR ( (lv_elements_5_0= rulePathElement ) ) )* this_SQBRACKET_CLOSE_6= RULE_SQBRACKET_CLOSE ) ;
    public final EObject ruleTmlExpression() throws RecognitionException {
        EObject current = null;

        Token this_SQBRACKET_OPEN_0=null;
        Token lv_absolute_1_0=null;
        Token lv_param_2_0=null;
        Token this_TML_SEPARATOR_4=null;
        Token this_SQBRACKET_CLOSE_6=null;
        AntlrDatatypeRuleToken lv_elements_3_0 = null;

        AntlrDatatypeRuleToken lv_elements_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4561:28: ( (this_SQBRACKET_OPEN_0= RULE_SQBRACKET_OPEN ( (lv_absolute_1_0= RULE_TML_SEPARATOR ) )? ( (lv_param_2_0= RULE_AT ) )? ( (lv_elements_3_0= rulePathElement ) ) (this_TML_SEPARATOR_4= RULE_TML_SEPARATOR ( (lv_elements_5_0= rulePathElement ) ) )* this_SQBRACKET_CLOSE_6= RULE_SQBRACKET_CLOSE ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4562:1: (this_SQBRACKET_OPEN_0= RULE_SQBRACKET_OPEN ( (lv_absolute_1_0= RULE_TML_SEPARATOR ) )? ( (lv_param_2_0= RULE_AT ) )? ( (lv_elements_3_0= rulePathElement ) ) (this_TML_SEPARATOR_4= RULE_TML_SEPARATOR ( (lv_elements_5_0= rulePathElement ) ) )* this_SQBRACKET_CLOSE_6= RULE_SQBRACKET_CLOSE )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4562:1: (this_SQBRACKET_OPEN_0= RULE_SQBRACKET_OPEN ( (lv_absolute_1_0= RULE_TML_SEPARATOR ) )? ( (lv_param_2_0= RULE_AT ) )? ( (lv_elements_3_0= rulePathElement ) ) (this_TML_SEPARATOR_4= RULE_TML_SEPARATOR ( (lv_elements_5_0= rulePathElement ) ) )* this_SQBRACKET_CLOSE_6= RULE_SQBRACKET_CLOSE )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4562:2: this_SQBRACKET_OPEN_0= RULE_SQBRACKET_OPEN ( (lv_absolute_1_0= RULE_TML_SEPARATOR ) )? ( (lv_param_2_0= RULE_AT ) )? ( (lv_elements_3_0= rulePathElement ) ) (this_TML_SEPARATOR_4= RULE_TML_SEPARATOR ( (lv_elements_5_0= rulePathElement ) ) )* this_SQBRACKET_CLOSE_6= RULE_SQBRACKET_CLOSE
            {
            this_SQBRACKET_OPEN_0=(Token)match(input,RULE_SQBRACKET_OPEN,FOLLOW_RULE_SQBRACKET_OPEN_in_ruleTmlExpression9694); 
             
                newLeafNode(this_SQBRACKET_OPEN_0, grammarAccess.getTmlExpressionAccess().getSQBRACKET_OPENTerminalRuleCall_0()); 
                
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4566:1: ( (lv_absolute_1_0= RULE_TML_SEPARATOR ) )?
            int alt61=2;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4567:1: (lv_absolute_1_0= RULE_TML_SEPARATOR )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4567:1: (lv_absolute_1_0= RULE_TML_SEPARATOR )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4568:3: lv_absolute_1_0= RULE_TML_SEPARATOR
                    {
                    lv_absolute_1_0=(Token)match(input,RULE_TML_SEPARATOR,FOLLOW_RULE_TML_SEPARATOR_in_ruleTmlExpression9710); 

                    			newLeafNode(lv_absolute_1_0, grammarAccess.getTmlExpressionAccess().getAbsoluteTML_SEPARATORTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTmlExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"absolute",
                            		true, 
                            		"TML_SEPARATOR");
                    	    

                    }


                    }
                    break;

            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4584:3: ( (lv_param_2_0= RULE_AT ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_AT) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4585:1: (lv_param_2_0= RULE_AT )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4585:1: (lv_param_2_0= RULE_AT )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4586:3: lv_param_2_0= RULE_AT
                    {
                    lv_param_2_0=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_ruleTmlExpression9733); 

                    			newLeafNode(lv_param_2_0, grammarAccess.getTmlExpressionAccess().getParamATTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTmlExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"param",
                            		true, 
                            		"AT");
                    	    

                    }


                    }
                    break;

            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4602:3: ( (lv_elements_3_0= rulePathElement ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4603:1: (lv_elements_3_0= rulePathElement )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4603:1: (lv_elements_3_0= rulePathElement )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4604:3: lv_elements_3_0= rulePathElement
            {
             
            	        newCompositeNode(grammarAccess.getTmlExpressionAccess().getElementsPathElementParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulePathElement_in_ruleTmlExpression9760);
            lv_elements_3_0=rulePathElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTmlExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"elements",
                    		lv_elements_3_0, 
                    		"PathElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4620:2: (this_TML_SEPARATOR_4= RULE_TML_SEPARATOR ( (lv_elements_5_0= rulePathElement ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==RULE_TML_SEPARATOR) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4620:3: this_TML_SEPARATOR_4= RULE_TML_SEPARATOR ( (lv_elements_5_0= rulePathElement ) )
            	    {
            	    this_TML_SEPARATOR_4=(Token)match(input,RULE_TML_SEPARATOR,FOLLOW_RULE_TML_SEPARATOR_in_ruleTmlExpression9772); 
            	     
            	        newLeafNode(this_TML_SEPARATOR_4, grammarAccess.getTmlExpressionAccess().getTML_SEPARATORTerminalRuleCall_4_0()); 
            	        
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4624:1: ( (lv_elements_5_0= rulePathElement ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4625:1: (lv_elements_5_0= rulePathElement )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4625:1: (lv_elements_5_0= rulePathElement )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4626:3: lv_elements_5_0= rulePathElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTmlExpressionAccess().getElementsPathElementParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePathElement_in_ruleTmlExpression9792);
            	    lv_elements_5_0=rulePathElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTmlExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_5_0, 
            	            		"PathElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            this_SQBRACKET_CLOSE_6=(Token)match(input,RULE_SQBRACKET_CLOSE,FOLLOW_RULE_SQBRACKET_CLOSE_in_ruleTmlExpression9805); 
             
                newLeafNode(this_SQBRACKET_CLOSE_6, grammarAccess.getTmlExpressionAccess().getSQBRACKET_CLOSETerminalRuleCall_5()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTmlExpression"


    // $ANTLR start "entryRuleExistsTmlExpression"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4654:1: entryRuleExistsTmlExpression returns [EObject current=null] : iv_ruleExistsTmlExpression= ruleExistsTmlExpression EOF ;
    public final EObject entryRuleExistsTmlExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistsTmlExpression = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4655:2: (iv_ruleExistsTmlExpression= ruleExistsTmlExpression EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4656:2: iv_ruleExistsTmlExpression= ruleExistsTmlExpression EOF
            {
             newCompositeNode(grammarAccess.getExistsTmlExpressionRule()); 
            pushFollow(FOLLOW_ruleExistsTmlExpression_in_entryRuleExistsTmlExpression9840);
            iv_ruleExistsTmlExpression=ruleExistsTmlExpression();

            state._fsp--;

             current =iv_ruleExistsTmlExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExistsTmlExpression9850); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExistsTmlExpression"


    // $ANTLR start "ruleExistsTmlExpression"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4663:1: ruleExistsTmlExpression returns [EObject current=null] : (this_TML_EXISTS_0= RULE_TML_EXISTS this_SQBRACKET_OPEN_1= RULE_SQBRACKET_OPEN ( (lv_absolute_2_0= RULE_TML_SEPARATOR ) )? ( (lv_param_3_0= RULE_AT ) )? ( (lv_elements_4_0= rulePathElement ) ) (this_TML_SEPARATOR_5= RULE_TML_SEPARATOR ( (lv_elements_6_0= rulePathElement ) ) )* this_SQBRACKET_CLOSE_7= RULE_SQBRACKET_CLOSE ) ;
    public final EObject ruleExistsTmlExpression() throws RecognitionException {
        EObject current = null;

        Token this_TML_EXISTS_0=null;
        Token this_SQBRACKET_OPEN_1=null;
        Token lv_absolute_2_0=null;
        Token lv_param_3_0=null;
        Token this_TML_SEPARATOR_5=null;
        Token this_SQBRACKET_CLOSE_7=null;
        AntlrDatatypeRuleToken lv_elements_4_0 = null;

        AntlrDatatypeRuleToken lv_elements_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4666:28: ( (this_TML_EXISTS_0= RULE_TML_EXISTS this_SQBRACKET_OPEN_1= RULE_SQBRACKET_OPEN ( (lv_absolute_2_0= RULE_TML_SEPARATOR ) )? ( (lv_param_3_0= RULE_AT ) )? ( (lv_elements_4_0= rulePathElement ) ) (this_TML_SEPARATOR_5= RULE_TML_SEPARATOR ( (lv_elements_6_0= rulePathElement ) ) )* this_SQBRACKET_CLOSE_7= RULE_SQBRACKET_CLOSE ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4667:1: (this_TML_EXISTS_0= RULE_TML_EXISTS this_SQBRACKET_OPEN_1= RULE_SQBRACKET_OPEN ( (lv_absolute_2_0= RULE_TML_SEPARATOR ) )? ( (lv_param_3_0= RULE_AT ) )? ( (lv_elements_4_0= rulePathElement ) ) (this_TML_SEPARATOR_5= RULE_TML_SEPARATOR ( (lv_elements_6_0= rulePathElement ) ) )* this_SQBRACKET_CLOSE_7= RULE_SQBRACKET_CLOSE )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4667:1: (this_TML_EXISTS_0= RULE_TML_EXISTS this_SQBRACKET_OPEN_1= RULE_SQBRACKET_OPEN ( (lv_absolute_2_0= RULE_TML_SEPARATOR ) )? ( (lv_param_3_0= RULE_AT ) )? ( (lv_elements_4_0= rulePathElement ) ) (this_TML_SEPARATOR_5= RULE_TML_SEPARATOR ( (lv_elements_6_0= rulePathElement ) ) )* this_SQBRACKET_CLOSE_7= RULE_SQBRACKET_CLOSE )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4667:2: this_TML_EXISTS_0= RULE_TML_EXISTS this_SQBRACKET_OPEN_1= RULE_SQBRACKET_OPEN ( (lv_absolute_2_0= RULE_TML_SEPARATOR ) )? ( (lv_param_3_0= RULE_AT ) )? ( (lv_elements_4_0= rulePathElement ) ) (this_TML_SEPARATOR_5= RULE_TML_SEPARATOR ( (lv_elements_6_0= rulePathElement ) ) )* this_SQBRACKET_CLOSE_7= RULE_SQBRACKET_CLOSE
            {
            this_TML_EXISTS_0=(Token)match(input,RULE_TML_EXISTS,FOLLOW_RULE_TML_EXISTS_in_ruleExistsTmlExpression9886); 
             
                newLeafNode(this_TML_EXISTS_0, grammarAccess.getExistsTmlExpressionAccess().getTML_EXISTSTerminalRuleCall_0()); 
                
            this_SQBRACKET_OPEN_1=(Token)match(input,RULE_SQBRACKET_OPEN,FOLLOW_RULE_SQBRACKET_OPEN_in_ruleExistsTmlExpression9896); 
             
                newLeafNode(this_SQBRACKET_OPEN_1, grammarAccess.getExistsTmlExpressionAccess().getSQBRACKET_OPENTerminalRuleCall_1()); 
                
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4675:1: ( (lv_absolute_2_0= RULE_TML_SEPARATOR ) )?
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4676:1: (lv_absolute_2_0= RULE_TML_SEPARATOR )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4676:1: (lv_absolute_2_0= RULE_TML_SEPARATOR )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4677:3: lv_absolute_2_0= RULE_TML_SEPARATOR
                    {
                    lv_absolute_2_0=(Token)match(input,RULE_TML_SEPARATOR,FOLLOW_RULE_TML_SEPARATOR_in_ruleExistsTmlExpression9912); 

                    			newLeafNode(lv_absolute_2_0, grammarAccess.getExistsTmlExpressionAccess().getAbsoluteTML_SEPARATORTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExistsTmlExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"absolute",
                            		true, 
                            		"TML_SEPARATOR");
                    	    

                    }


                    }
                    break;

            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4693:3: ( (lv_param_3_0= RULE_AT ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_AT) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4694:1: (lv_param_3_0= RULE_AT )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4694:1: (lv_param_3_0= RULE_AT )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4695:3: lv_param_3_0= RULE_AT
                    {
                    lv_param_3_0=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_ruleExistsTmlExpression9935); 

                    			newLeafNode(lv_param_3_0, grammarAccess.getExistsTmlExpressionAccess().getParamATTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExistsTmlExpressionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"param",
                            		true, 
                            		"AT");
                    	    

                    }


                    }
                    break;

            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4711:3: ( (lv_elements_4_0= rulePathElement ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4712:1: (lv_elements_4_0= rulePathElement )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4712:1: (lv_elements_4_0= rulePathElement )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4713:3: lv_elements_4_0= rulePathElement
            {
             
            	        newCompositeNode(grammarAccess.getExistsTmlExpressionAccess().getElementsPathElementParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_rulePathElement_in_ruleExistsTmlExpression9962);
            lv_elements_4_0=rulePathElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExistsTmlExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"elements",
                    		lv_elements_4_0, 
                    		"PathElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4729:2: (this_TML_SEPARATOR_5= RULE_TML_SEPARATOR ( (lv_elements_6_0= rulePathElement ) ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==RULE_TML_SEPARATOR) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4729:3: this_TML_SEPARATOR_5= RULE_TML_SEPARATOR ( (lv_elements_6_0= rulePathElement ) )
            	    {
            	    this_TML_SEPARATOR_5=(Token)match(input,RULE_TML_SEPARATOR,FOLLOW_RULE_TML_SEPARATOR_in_ruleExistsTmlExpression9974); 
            	     
            	        newLeafNode(this_TML_SEPARATOR_5, grammarAccess.getExistsTmlExpressionAccess().getTML_SEPARATORTerminalRuleCall_5_0()); 
            	        
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4733:1: ( (lv_elements_6_0= rulePathElement ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4734:1: (lv_elements_6_0= rulePathElement )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4734:1: (lv_elements_6_0= rulePathElement )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4735:3: lv_elements_6_0= rulePathElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExistsTmlExpressionAccess().getElementsPathElementParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePathElement_in_ruleExistsTmlExpression9994);
            	    lv_elements_6_0=rulePathElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExistsTmlExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_6_0, 
            	            		"PathElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            this_SQBRACKET_CLOSE_7=(Token)match(input,RULE_SQBRACKET_CLOSE,FOLLOW_RULE_SQBRACKET_CLOSE_in_ruleExistsTmlExpression10007); 
             
                newLeafNode(this_SQBRACKET_CLOSE_7, grammarAccess.getExistsTmlExpressionAccess().getSQBRACKET_CLOSETerminalRuleCall_6()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExistsTmlExpression"


    // $ANTLR start "entryRuleMapReferenceParams"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4763:1: entryRuleMapReferenceParams returns [EObject current=null] : iv_ruleMapReferenceParams= ruleMapReferenceParams EOF ;
    public final EObject entryRuleMapReferenceParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapReferenceParams = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4764:2: (iv_ruleMapReferenceParams= ruleMapReferenceParams EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4765:2: iv_ruleMapReferenceParams= ruleMapReferenceParams EOF
            {
             newCompositeNode(grammarAccess.getMapReferenceParamsRule()); 
            pushFollow(FOLLOW_ruleMapReferenceParams_in_entryRuleMapReferenceParams10042);
            iv_ruleMapReferenceParams=ruleMapReferenceParams();

            state._fsp--;

             current =iv_ruleMapReferenceParams; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapReferenceParams10052); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapReferenceParams"


    // $ANTLR start "ruleMapReferenceParams"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4772:1: ruleMapReferenceParams returns [EObject current=null] : (otherlv_0= '(' ( (lv_getterParams_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_getterParams_3_0= ruleLiteral ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleMapReferenceParams() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_getterParams_1_0 = null;

        EObject lv_getterParams_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4775:28: ( (otherlv_0= '(' ( (lv_getterParams_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_getterParams_3_0= ruleLiteral ) ) )* otherlv_4= ')' ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4776:1: (otherlv_0= '(' ( (lv_getterParams_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_getterParams_3_0= ruleLiteral ) ) )* otherlv_4= ')' )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4776:1: (otherlv_0= '(' ( (lv_getterParams_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_getterParams_3_0= ruleLiteral ) ) )* otherlv_4= ')' )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4776:3: otherlv_0= '(' ( (lv_getterParams_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_getterParams_3_0= ruleLiteral ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_69_in_ruleMapReferenceParams10089); 

                	newLeafNode(otherlv_0, grammarAccess.getMapReferenceParamsAccess().getLeftParenthesisKeyword_0());
                
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4780:1: ( (lv_getterParams_1_0= ruleLiteral ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4781:1: (lv_getterParams_1_0= ruleLiteral )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4781:1: (lv_getterParams_1_0= ruleLiteral )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4782:3: lv_getterParams_1_0= ruleLiteral
            {
             
            	        newCompositeNode(grammarAccess.getMapReferenceParamsAccess().getGetterParamsLiteralParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleLiteral_in_ruleMapReferenceParams10110);
            lv_getterParams_1_0=ruleLiteral();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMapReferenceParamsRule());
            	        }
                   		add(
                   			current, 
                   			"getterParams",
                    		lv_getterParams_1_0, 
                    		"Literal");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4798:2: (otherlv_2= ',' ( (lv_getterParams_3_0= ruleLiteral ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==68) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4798:4: otherlv_2= ',' ( (lv_getterParams_3_0= ruleLiteral ) )
            	    {
            	    otherlv_2=(Token)match(input,68,FOLLOW_68_in_ruleMapReferenceParams10123); 

            	        	newLeafNode(otherlv_2, grammarAccess.getMapReferenceParamsAccess().getCommaKeyword_2_0());
            	        
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4802:1: ( (lv_getterParams_3_0= ruleLiteral ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4803:1: (lv_getterParams_3_0= ruleLiteral )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4803:1: (lv_getterParams_3_0= ruleLiteral )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4804:3: lv_getterParams_3_0= ruleLiteral
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMapReferenceParamsAccess().getGetterParamsLiteralParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLiteral_in_ruleMapReferenceParams10144);
            	    lv_getterParams_3_0=ruleLiteral();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMapReferenceParamsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"getterParams",
            	            		lv_getterParams_3_0, 
            	            		"Literal");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            otherlv_4=(Token)match(input,70,FOLLOW_70_in_ruleMapReferenceParams10158); 

                	newLeafNode(otherlv_4, grammarAccess.getMapReferenceParamsAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapReferenceParams"


    // $ANTLR start "entryRuleMapGetReference"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4832:1: entryRuleMapGetReference returns [EObject current=null] : iv_ruleMapGetReference= ruleMapGetReference EOF ;
    public final EObject entryRuleMapGetReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapGetReference = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4833:2: (iv_ruleMapGetReference= ruleMapGetReference EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4834:2: iv_ruleMapGetReference= ruleMapGetReference EOF
            {
             newCompositeNode(grammarAccess.getMapGetReferenceRule()); 
            pushFollow(FOLLOW_ruleMapGetReference_in_entryRuleMapGetReference10194);
            iv_ruleMapGetReference=ruleMapGetReference();

            state._fsp--;

             current =iv_ruleMapGetReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapGetReference10204); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapGetReference"


    // $ANTLR start "ruleMapGetReference"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4841:1: ruleMapGetReference returns [EObject current=null] : ( ( (lv_operations_0_0= RULE_DOLLAR ) ) ( ( (lv_elements_1_0= RULE_PARENT ) ) this_TML_SEPARATOR_2= RULE_TML_SEPARATOR )* ( (lv_elements_3_0= RULE_ID ) ) ( (lv_referenceParams_4_0= ruleMapReferenceParams ) )? ) ;
    public final EObject ruleMapGetReference() throws RecognitionException {
        EObject current = null;

        Token lv_operations_0_0=null;
        Token lv_elements_1_0=null;
        Token this_TML_SEPARATOR_2=null;
        Token lv_elements_3_0=null;
        EObject lv_referenceParams_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4844:28: ( ( ( (lv_operations_0_0= RULE_DOLLAR ) ) ( ( (lv_elements_1_0= RULE_PARENT ) ) this_TML_SEPARATOR_2= RULE_TML_SEPARATOR )* ( (lv_elements_3_0= RULE_ID ) ) ( (lv_referenceParams_4_0= ruleMapReferenceParams ) )? ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4845:1: ( ( (lv_operations_0_0= RULE_DOLLAR ) ) ( ( (lv_elements_1_0= RULE_PARENT ) ) this_TML_SEPARATOR_2= RULE_TML_SEPARATOR )* ( (lv_elements_3_0= RULE_ID ) ) ( (lv_referenceParams_4_0= ruleMapReferenceParams ) )? )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4845:1: ( ( (lv_operations_0_0= RULE_DOLLAR ) ) ( ( (lv_elements_1_0= RULE_PARENT ) ) this_TML_SEPARATOR_2= RULE_TML_SEPARATOR )* ( (lv_elements_3_0= RULE_ID ) ) ( (lv_referenceParams_4_0= ruleMapReferenceParams ) )? )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4845:2: ( (lv_operations_0_0= RULE_DOLLAR ) ) ( ( (lv_elements_1_0= RULE_PARENT ) ) this_TML_SEPARATOR_2= RULE_TML_SEPARATOR )* ( (lv_elements_3_0= RULE_ID ) ) ( (lv_referenceParams_4_0= ruleMapReferenceParams ) )?
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4845:2: ( (lv_operations_0_0= RULE_DOLLAR ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4846:1: (lv_operations_0_0= RULE_DOLLAR )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4846:1: (lv_operations_0_0= RULE_DOLLAR )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4847:3: lv_operations_0_0= RULE_DOLLAR
            {
            lv_operations_0_0=(Token)match(input,RULE_DOLLAR,FOLLOW_RULE_DOLLAR_in_ruleMapGetReference10246); 

            			newLeafNode(lv_operations_0_0, grammarAccess.getMapGetReferenceAccess().getOperationsDOLLARTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMapGetReferenceRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"operations",
                    		lv_operations_0_0, 
                    		"DOLLAR");
            	    

            }


            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4863:2: ( ( (lv_elements_1_0= RULE_PARENT ) ) this_TML_SEPARATOR_2= RULE_TML_SEPARATOR )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==RULE_PARENT) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4863:3: ( (lv_elements_1_0= RULE_PARENT ) ) this_TML_SEPARATOR_2= RULE_TML_SEPARATOR
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4863:3: ( (lv_elements_1_0= RULE_PARENT ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4864:1: (lv_elements_1_0= RULE_PARENT )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4864:1: (lv_elements_1_0= RULE_PARENT )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4865:3: lv_elements_1_0= RULE_PARENT
            	    {
            	    lv_elements_1_0=(Token)match(input,RULE_PARENT,FOLLOW_RULE_PARENT_in_ruleMapGetReference10269); 

            	    			newLeafNode(lv_elements_1_0, grammarAccess.getMapGetReferenceAccess().getElementsPARENTTerminalRuleCall_1_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMapGetReferenceRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"elements",
            	            		lv_elements_1_0, 
            	            		"PARENT");
            	    	    

            	    }


            	    }

            	    this_TML_SEPARATOR_2=(Token)match(input,RULE_TML_SEPARATOR,FOLLOW_RULE_TML_SEPARATOR_in_ruleMapGetReference10285); 
            	     
            	        newLeafNode(this_TML_SEPARATOR_2, grammarAccess.getMapGetReferenceAccess().getTML_SEPARATORTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4885:3: ( (lv_elements_3_0= RULE_ID ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4886:1: (lv_elements_3_0= RULE_ID )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4886:1: (lv_elements_3_0= RULE_ID )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4887:3: lv_elements_3_0= RULE_ID
            {
            lv_elements_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapGetReference10303); 

            			newLeafNode(lv_elements_3_0, grammarAccess.getMapGetReferenceAccess().getElementsIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMapGetReferenceRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"elements",
                    		lv_elements_3_0, 
                    		"ID");
            	    

            }


            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4903:2: ( (lv_referenceParams_4_0= ruleMapReferenceParams ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==69) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4904:1: (lv_referenceParams_4_0= ruleMapReferenceParams )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4904:1: (lv_referenceParams_4_0= ruleMapReferenceParams )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4905:3: lv_referenceParams_4_0= ruleMapReferenceParams
                    {
                     
                    	        newCompositeNode(grammarAccess.getMapGetReferenceAccess().getReferenceParamsMapReferenceParamsParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMapReferenceParams_in_ruleMapGetReference10329);
                    lv_referenceParams_4_0=ruleMapReferenceParams();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMapGetReferenceRule());
                    	        }
                           		set(
                           			current, 
                           			"referenceParams",
                            		lv_referenceParams_4_0, 
                            		"MapReferenceParams");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapGetReference"


    // $ANTLR start "entryRuleOrExpression"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4929:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4930:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4931:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression10366);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;

             current =iv_ruleOrExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression10376); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4938:1: ruleOrExpression returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleAndExpression ) ) ( ( (lv_operations_1_0= 'OR' ) ) ( (lv_parameters_2_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operations_1_0=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4941:28: ( ( ( (lv_parameters_0_0= ruleAndExpression ) ) ( ( (lv_operations_1_0= 'OR' ) ) ( (lv_parameters_2_0= ruleAndExpression ) ) )* ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4942:1: ( ( (lv_parameters_0_0= ruleAndExpression ) ) ( ( (lv_operations_1_0= 'OR' ) ) ( (lv_parameters_2_0= ruleAndExpression ) ) )* )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4942:1: ( ( (lv_parameters_0_0= ruleAndExpression ) ) ( ( (lv_operations_1_0= 'OR' ) ) ( (lv_parameters_2_0= ruleAndExpression ) ) )* )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4942:2: ( (lv_parameters_0_0= ruleAndExpression ) ) ( ( (lv_operations_1_0= 'OR' ) ) ( (lv_parameters_2_0= ruleAndExpression ) ) )*
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4942:2: ( (lv_parameters_0_0= ruleAndExpression ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4943:1: (lv_parameters_0_0= ruleAndExpression )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4943:1: (lv_parameters_0_0= ruleAndExpression )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4944:3: lv_parameters_0_0= ruleAndExpression
            {
             
            	        newCompositeNode(grammarAccess.getOrExpressionAccess().getParametersAndExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression10422);
            lv_parameters_0_0=ruleAndExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"parameters",
                    		lv_parameters_0_0, 
                    		"AndExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4960:2: ( ( (lv_operations_1_0= 'OR' ) ) ( (lv_parameters_2_0= ruleAndExpression ) ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==89) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4960:3: ( (lv_operations_1_0= 'OR' ) ) ( (lv_parameters_2_0= ruleAndExpression ) )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4960:3: ( (lv_operations_1_0= 'OR' ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4961:1: (lv_operations_1_0= 'OR' )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4961:1: (lv_operations_1_0= 'OR' )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4962:3: lv_operations_1_0= 'OR'
            	    {
            	    lv_operations_1_0=(Token)match(input,89,FOLLOW_89_in_ruleOrExpression10441); 

            	            newLeafNode(lv_operations_1_0, grammarAccess.getOrExpressionAccess().getOperationsORKeyword_1_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOrExpressionRule());
            	    	        }
            	           		addWithLastConsumed(current, "operations", lv_operations_1_0, "OR");
            	    	    

            	    }


            	    }

            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4975:2: ( (lv_parameters_2_0= ruleAndExpression ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4976:1: (lv_parameters_2_0= ruleAndExpression )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4976:1: (lv_parameters_2_0= ruleAndExpression )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:4977:3: lv_parameters_2_0= ruleAndExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrExpressionAccess().getParametersAndExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression10475);
            	    lv_parameters_2_0=ruleAndExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_2_0, 
            	            		"AndExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5001:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5002:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5003:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression10513);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression10523); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5010:1: ruleAndExpression returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleEqualityExpression ) ) ( ( (lv_operations_1_0= 'AND' ) ) ( (lv_parameters_2_0= ruleEqualityExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operations_1_0=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5013:28: ( ( ( (lv_parameters_0_0= ruleEqualityExpression ) ) ( ( (lv_operations_1_0= 'AND' ) ) ( (lv_parameters_2_0= ruleEqualityExpression ) ) )* ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5014:1: ( ( (lv_parameters_0_0= ruleEqualityExpression ) ) ( ( (lv_operations_1_0= 'AND' ) ) ( (lv_parameters_2_0= ruleEqualityExpression ) ) )* )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5014:1: ( ( (lv_parameters_0_0= ruleEqualityExpression ) ) ( ( (lv_operations_1_0= 'AND' ) ) ( (lv_parameters_2_0= ruleEqualityExpression ) ) )* )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5014:2: ( (lv_parameters_0_0= ruleEqualityExpression ) ) ( ( (lv_operations_1_0= 'AND' ) ) ( (lv_parameters_2_0= ruleEqualityExpression ) ) )*
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5014:2: ( (lv_parameters_0_0= ruleEqualityExpression ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5015:1: (lv_parameters_0_0= ruleEqualityExpression )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5015:1: (lv_parameters_0_0= ruleEqualityExpression )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5016:3: lv_parameters_0_0= ruleEqualityExpression
            {
             
            	        newCompositeNode(grammarAccess.getAndExpressionAccess().getParametersEqualityExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEqualityExpression_in_ruleAndExpression10569);
            lv_parameters_0_0=ruleEqualityExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"parameters",
                    		lv_parameters_0_0, 
                    		"EqualityExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5032:2: ( ( (lv_operations_1_0= 'AND' ) ) ( (lv_parameters_2_0= ruleEqualityExpression ) ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==90) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5032:3: ( (lv_operations_1_0= 'AND' ) ) ( (lv_parameters_2_0= ruleEqualityExpression ) )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5032:3: ( (lv_operations_1_0= 'AND' ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5033:1: (lv_operations_1_0= 'AND' )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5033:1: (lv_operations_1_0= 'AND' )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5034:3: lv_operations_1_0= 'AND'
            	    {
            	    lv_operations_1_0=(Token)match(input,90,FOLLOW_90_in_ruleAndExpression10588); 

            	            newLeafNode(lv_operations_1_0, grammarAccess.getAndExpressionAccess().getOperationsANDKeyword_1_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAndExpressionRule());
            	    	        }
            	           		addWithLastConsumed(current, "operations", lv_operations_1_0, "AND");
            	    	    

            	    }


            	    }

            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5047:2: ( (lv_parameters_2_0= ruleEqualityExpression ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5048:1: (lv_parameters_2_0= ruleEqualityExpression )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5048:1: (lv_parameters_2_0= ruleEqualityExpression )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5049:3: lv_parameters_2_0= ruleEqualityExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndExpressionAccess().getParametersEqualityExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEqualityExpression_in_ruleAndExpression10622);
            	    lv_parameters_2_0=ruleEqualityExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_2_0, 
            	            		"EqualityExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleEqualityExpression"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5073:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5074:2: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5075:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
            {
             newCompositeNode(grammarAccess.getEqualityExpressionRule()); 
            pushFollow(FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression10660);
            iv_ruleEqualityExpression=ruleEqualityExpression();

            state._fsp--;

             current =iv_ruleEqualityExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualityExpression10670); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEqualityExpression"


    // $ANTLR start "ruleEqualityExpression"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5082:1: ruleEqualityExpression returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleRelationalExpression ) ) ( ( ( (lv_operations_1_0= '==' ) ) ( (lv_parameters_2_0= ruleRelationalExpression ) ) ) | ( ( (lv_operations_3_0= '!=' ) ) ( (lv_parameters_4_0= ruleRelationalExpression ) ) ) )? ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operations_1_0=null;
        Token lv_operations_3_0=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5085:28: ( ( ( (lv_parameters_0_0= ruleRelationalExpression ) ) ( ( ( (lv_operations_1_0= '==' ) ) ( (lv_parameters_2_0= ruleRelationalExpression ) ) ) | ( ( (lv_operations_3_0= '!=' ) ) ( (lv_parameters_4_0= ruleRelationalExpression ) ) ) )? ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5086:1: ( ( (lv_parameters_0_0= ruleRelationalExpression ) ) ( ( ( (lv_operations_1_0= '==' ) ) ( (lv_parameters_2_0= ruleRelationalExpression ) ) ) | ( ( (lv_operations_3_0= '!=' ) ) ( (lv_parameters_4_0= ruleRelationalExpression ) ) ) )? )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5086:1: ( ( (lv_parameters_0_0= ruleRelationalExpression ) ) ( ( ( (lv_operations_1_0= '==' ) ) ( (lv_parameters_2_0= ruleRelationalExpression ) ) ) | ( ( (lv_operations_3_0= '!=' ) ) ( (lv_parameters_4_0= ruleRelationalExpression ) ) ) )? )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5086:2: ( (lv_parameters_0_0= ruleRelationalExpression ) ) ( ( ( (lv_operations_1_0= '==' ) ) ( (lv_parameters_2_0= ruleRelationalExpression ) ) ) | ( ( (lv_operations_3_0= '!=' ) ) ( (lv_parameters_4_0= ruleRelationalExpression ) ) ) )?
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5086:2: ( (lv_parameters_0_0= ruleRelationalExpression ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5087:1: (lv_parameters_0_0= ruleRelationalExpression )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5087:1: (lv_parameters_0_0= ruleRelationalExpression )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5088:3: lv_parameters_0_0= ruleRelationalExpression
            {
             
            	        newCompositeNode(grammarAccess.getEqualityExpressionAccess().getParametersRelationalExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleRelationalExpression_in_ruleEqualityExpression10716);
            lv_parameters_0_0=ruleRelationalExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"parameters",
                    		lv_parameters_0_0, 
                    		"RelationalExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5104:2: ( ( ( (lv_operations_1_0= '==' ) ) ( (lv_parameters_2_0= ruleRelationalExpression ) ) ) | ( ( (lv_operations_3_0= '!=' ) ) ( (lv_parameters_4_0= ruleRelationalExpression ) ) ) )?
            int alt72=3;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==91) ) {
                alt72=1;
            }
            else if ( (LA72_0==92) ) {
                alt72=2;
            }
            switch (alt72) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5104:3: ( ( (lv_operations_1_0= '==' ) ) ( (lv_parameters_2_0= ruleRelationalExpression ) ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5104:3: ( ( (lv_operations_1_0= '==' ) ) ( (lv_parameters_2_0= ruleRelationalExpression ) ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5104:4: ( (lv_operations_1_0= '==' ) ) ( (lv_parameters_2_0= ruleRelationalExpression ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5104:4: ( (lv_operations_1_0= '==' ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5105:1: (lv_operations_1_0= '==' )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5105:1: (lv_operations_1_0= '==' )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5106:3: lv_operations_1_0= '=='
                    {
                    lv_operations_1_0=(Token)match(input,91,FOLLOW_91_in_ruleEqualityExpression10736); 

                            newLeafNode(lv_operations_1_0, grammarAccess.getEqualityExpressionAccess().getOperationsEqualsSignEqualsSignKeyword_1_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEqualityExpressionRule());
                    	        }
                           		addWithLastConsumed(current, "operations", lv_operations_1_0, "==");
                    	    

                    }


                    }

                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5119:2: ( (lv_parameters_2_0= ruleRelationalExpression ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5120:1: (lv_parameters_2_0= ruleRelationalExpression )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5120:1: (lv_parameters_2_0= ruleRelationalExpression )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5121:3: lv_parameters_2_0= ruleRelationalExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getEqualityExpressionAccess().getParametersRelationalExpressionParserRuleCall_1_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRelationalExpression_in_ruleEqualityExpression10770);
                    lv_parameters_2_0=ruleRelationalExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_2_0, 
                            		"RelationalExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5138:6: ( ( (lv_operations_3_0= '!=' ) ) ( (lv_parameters_4_0= ruleRelationalExpression ) ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5138:6: ( ( (lv_operations_3_0= '!=' ) ) ( (lv_parameters_4_0= ruleRelationalExpression ) ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5138:7: ( (lv_operations_3_0= '!=' ) ) ( (lv_parameters_4_0= ruleRelationalExpression ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5138:7: ( (lv_operations_3_0= '!=' ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5139:1: (lv_operations_3_0= '!=' )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5139:1: (lv_operations_3_0= '!=' )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5140:3: lv_operations_3_0= '!='
                    {
                    lv_operations_3_0=(Token)match(input,92,FOLLOW_92_in_ruleEqualityExpression10796); 

                            newLeafNode(lv_operations_3_0, grammarAccess.getEqualityExpressionAccess().getOperationsExclamationMarkEqualsSignKeyword_1_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEqualityExpressionRule());
                    	        }
                           		addWithLastConsumed(current, "operations", lv_operations_3_0, "!=");
                    	    

                    }


                    }

                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5153:2: ( (lv_parameters_4_0= ruleRelationalExpression ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5154:1: (lv_parameters_4_0= ruleRelationalExpression )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5154:1: (lv_parameters_4_0= ruleRelationalExpression )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5155:3: lv_parameters_4_0= ruleRelationalExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getEqualityExpressionAccess().getParametersRelationalExpressionParserRuleCall_1_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRelationalExpression_in_ruleEqualityExpression10830);
                    lv_parameters_4_0=ruleRelationalExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_4_0, 
                            		"RelationalExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleRelationalExpression"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5179:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5180:2: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5181:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
             newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            pushFollow(FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression10869);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;

             current =iv_ruleRelationalExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpression10879); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationalExpression"


    // $ANTLR start "ruleRelationalExpression"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5188:1: ruleRelationalExpression returns [EObject current=null] : ( () ( (lv_parameters_1_0= ruleAdditiveExpression ) ) ( ( ( (lv_operations_2_0= RULE_XML_LT ) ) ( (lv_parameters_3_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_4_0= RULE_XML_GT ) ) ( (lv_parameters_5_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_6_0= RULE_XML_LTEQ ) ) ( (lv_parameters_7_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_8_0= RULE_XML_GTEQ ) ) ( (lv_parameters_9_0= ruleAdditiveExpression ) ) ) )? ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operations_2_0=null;
        Token lv_operations_4_0=null;
        Token lv_operations_6_0=null;
        Token lv_operations_8_0=null;
        EObject lv_parameters_1_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_parameters_7_0 = null;

        EObject lv_parameters_9_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5191:28: ( ( () ( (lv_parameters_1_0= ruleAdditiveExpression ) ) ( ( ( (lv_operations_2_0= RULE_XML_LT ) ) ( (lv_parameters_3_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_4_0= RULE_XML_GT ) ) ( (lv_parameters_5_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_6_0= RULE_XML_LTEQ ) ) ( (lv_parameters_7_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_8_0= RULE_XML_GTEQ ) ) ( (lv_parameters_9_0= ruleAdditiveExpression ) ) ) )? ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5192:1: ( () ( (lv_parameters_1_0= ruleAdditiveExpression ) ) ( ( ( (lv_operations_2_0= RULE_XML_LT ) ) ( (lv_parameters_3_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_4_0= RULE_XML_GT ) ) ( (lv_parameters_5_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_6_0= RULE_XML_LTEQ ) ) ( (lv_parameters_7_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_8_0= RULE_XML_GTEQ ) ) ( (lv_parameters_9_0= ruleAdditiveExpression ) ) ) )? )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5192:1: ( () ( (lv_parameters_1_0= ruleAdditiveExpression ) ) ( ( ( (lv_operations_2_0= RULE_XML_LT ) ) ( (lv_parameters_3_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_4_0= RULE_XML_GT ) ) ( (lv_parameters_5_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_6_0= RULE_XML_LTEQ ) ) ( (lv_parameters_7_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_8_0= RULE_XML_GTEQ ) ) ( (lv_parameters_9_0= ruleAdditiveExpression ) ) ) )? )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5192:2: () ( (lv_parameters_1_0= ruleAdditiveExpression ) ) ( ( ( (lv_operations_2_0= RULE_XML_LT ) ) ( (lv_parameters_3_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_4_0= RULE_XML_GT ) ) ( (lv_parameters_5_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_6_0= RULE_XML_LTEQ ) ) ( (lv_parameters_7_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_8_0= RULE_XML_GTEQ ) ) ( (lv_parameters_9_0= ruleAdditiveExpression ) ) ) )?
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5192:2: ()
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5193:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRelationalExpressionAccess().getExpressionAction_0(),
                        current);
                

            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5198:2: ( (lv_parameters_1_0= ruleAdditiveExpression ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5199:1: (lv_parameters_1_0= ruleAdditiveExpression )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5199:1: (lv_parameters_1_0= ruleAdditiveExpression )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5200:3: lv_parameters_1_0= ruleAdditiveExpression
            {
             
            	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getParametersAdditiveExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression10934);
            lv_parameters_1_0=ruleAdditiveExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"parameters",
                    		lv_parameters_1_0, 
                    		"AdditiveExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5216:2: ( ( ( (lv_operations_2_0= RULE_XML_LT ) ) ( (lv_parameters_3_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_4_0= RULE_XML_GT ) ) ( (lv_parameters_5_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_6_0= RULE_XML_LTEQ ) ) ( (lv_parameters_7_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_8_0= RULE_XML_GTEQ ) ) ( (lv_parameters_9_0= ruleAdditiveExpression ) ) ) )?
            int alt73=5;
            switch ( input.LA(1) ) {
                case RULE_XML_LT:
                    {
                    alt73=1;
                    }
                    break;
                case RULE_XML_GT:
                    {
                    alt73=2;
                    }
                    break;
                case RULE_XML_LTEQ:
                    {
                    alt73=3;
                    }
                    break;
                case RULE_XML_GTEQ:
                    {
                    alt73=4;
                    }
                    break;
            }

            switch (alt73) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5216:3: ( ( (lv_operations_2_0= RULE_XML_LT ) ) ( (lv_parameters_3_0= ruleAdditiveExpression ) ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5216:3: ( ( (lv_operations_2_0= RULE_XML_LT ) ) ( (lv_parameters_3_0= ruleAdditiveExpression ) ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5216:4: ( (lv_operations_2_0= RULE_XML_LT ) ) ( (lv_parameters_3_0= ruleAdditiveExpression ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5216:4: ( (lv_operations_2_0= RULE_XML_LT ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5217:1: (lv_operations_2_0= RULE_XML_LT )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5217:1: (lv_operations_2_0= RULE_XML_LT )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5218:3: lv_operations_2_0= RULE_XML_LT
                    {
                    lv_operations_2_0=(Token)match(input,RULE_XML_LT,FOLLOW_RULE_XML_LT_in_ruleRelationalExpression10953); 

                    			newLeafNode(lv_operations_2_0, grammarAccess.getRelationalExpressionAccess().getOperationsXML_LTTerminalRuleCall_2_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRelationalExpressionRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"operations",
                            		lv_operations_2_0, 
                            		"XML_LT");
                    	    

                    }


                    }

                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5234:2: ( (lv_parameters_3_0= ruleAdditiveExpression ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5235:1: (lv_parameters_3_0= ruleAdditiveExpression )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5235:1: (lv_parameters_3_0= ruleAdditiveExpression )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5236:3: lv_parameters_3_0= ruleAdditiveExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getParametersAdditiveExpressionParserRuleCall_2_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression10979);
                    lv_parameters_3_0=ruleAdditiveExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_3_0, 
                            		"AdditiveExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5253:6: ( ( (lv_operations_4_0= RULE_XML_GT ) ) ( (lv_parameters_5_0= ruleAdditiveExpression ) ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5253:6: ( ( (lv_operations_4_0= RULE_XML_GT ) ) ( (lv_parameters_5_0= ruleAdditiveExpression ) ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5253:7: ( (lv_operations_4_0= RULE_XML_GT ) ) ( (lv_parameters_5_0= ruleAdditiveExpression ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5253:7: ( (lv_operations_4_0= RULE_XML_GT ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5254:1: (lv_operations_4_0= RULE_XML_GT )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5254:1: (lv_operations_4_0= RULE_XML_GT )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5255:3: lv_operations_4_0= RULE_XML_GT
                    {
                    lv_operations_4_0=(Token)match(input,RULE_XML_GT,FOLLOW_RULE_XML_GT_in_ruleRelationalExpression11004); 

                    			newLeafNode(lv_operations_4_0, grammarAccess.getRelationalExpressionAccess().getOperationsXML_GTTerminalRuleCall_2_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRelationalExpressionRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"operations",
                            		lv_operations_4_0, 
                            		"XML_GT");
                    	    

                    }


                    }

                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5271:2: ( (lv_parameters_5_0= ruleAdditiveExpression ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5272:1: (lv_parameters_5_0= ruleAdditiveExpression )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5272:1: (lv_parameters_5_0= ruleAdditiveExpression )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5273:3: lv_parameters_5_0= ruleAdditiveExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getParametersAdditiveExpressionParserRuleCall_2_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression11030);
                    lv_parameters_5_0=ruleAdditiveExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_5_0, 
                            		"AdditiveExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5290:6: ( ( (lv_operations_6_0= RULE_XML_LTEQ ) ) ( (lv_parameters_7_0= ruleAdditiveExpression ) ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5290:6: ( ( (lv_operations_6_0= RULE_XML_LTEQ ) ) ( (lv_parameters_7_0= ruleAdditiveExpression ) ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5290:7: ( (lv_operations_6_0= RULE_XML_LTEQ ) ) ( (lv_parameters_7_0= ruleAdditiveExpression ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5290:7: ( (lv_operations_6_0= RULE_XML_LTEQ ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5291:1: (lv_operations_6_0= RULE_XML_LTEQ )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5291:1: (lv_operations_6_0= RULE_XML_LTEQ )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5292:3: lv_operations_6_0= RULE_XML_LTEQ
                    {
                    lv_operations_6_0=(Token)match(input,RULE_XML_LTEQ,FOLLOW_RULE_XML_LTEQ_in_ruleRelationalExpression11055); 

                    			newLeafNode(lv_operations_6_0, grammarAccess.getRelationalExpressionAccess().getOperationsXML_LTEQTerminalRuleCall_2_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRelationalExpressionRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"operations",
                            		lv_operations_6_0, 
                            		"XML_LTEQ");
                    	    

                    }


                    }

                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5308:2: ( (lv_parameters_7_0= ruleAdditiveExpression ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5309:1: (lv_parameters_7_0= ruleAdditiveExpression )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5309:1: (lv_parameters_7_0= ruleAdditiveExpression )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5310:3: lv_parameters_7_0= ruleAdditiveExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getParametersAdditiveExpressionParserRuleCall_2_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression11081);
                    lv_parameters_7_0=ruleAdditiveExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_7_0, 
                            		"AdditiveExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5327:6: ( ( (lv_operations_8_0= RULE_XML_GTEQ ) ) ( (lv_parameters_9_0= ruleAdditiveExpression ) ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5327:6: ( ( (lv_operations_8_0= RULE_XML_GTEQ ) ) ( (lv_parameters_9_0= ruleAdditiveExpression ) ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5327:7: ( (lv_operations_8_0= RULE_XML_GTEQ ) ) ( (lv_parameters_9_0= ruleAdditiveExpression ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5327:7: ( (lv_operations_8_0= RULE_XML_GTEQ ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5328:1: (lv_operations_8_0= RULE_XML_GTEQ )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5328:1: (lv_operations_8_0= RULE_XML_GTEQ )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5329:3: lv_operations_8_0= RULE_XML_GTEQ
                    {
                    lv_operations_8_0=(Token)match(input,RULE_XML_GTEQ,FOLLOW_RULE_XML_GTEQ_in_ruleRelationalExpression11106); 

                    			newLeafNode(lv_operations_8_0, grammarAccess.getRelationalExpressionAccess().getOperationsXML_GTEQTerminalRuleCall_2_3_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRelationalExpressionRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"operations",
                            		lv_operations_8_0, 
                            		"XML_GTEQ");
                    	    

                    }


                    }

                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5345:2: ( (lv_parameters_9_0= ruleAdditiveExpression ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5346:1: (lv_parameters_9_0= ruleAdditiveExpression )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5346:1: (lv_parameters_9_0= ruleAdditiveExpression )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5347:3: lv_parameters_9_0= ruleAdditiveExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getParametersAdditiveExpressionParserRuleCall_2_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression11132);
                    lv_parameters_9_0=ruleAdditiveExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_9_0, 
                            		"AdditiveExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5371:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5372:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5373:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
             newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression11171);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;

             current =iv_ruleAdditiveExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpression11181); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5380:1: ruleAdditiveExpression returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleMultiplicativeExpression ) ) ( (otherlv_1= '+' ( (lv_parameters_2_0= ruleMultiplicativeExpression ) ) ) | (otherlv_3= '-' ( (lv_parameters_4_0= ruleMultiplicativeExpression ) ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5383:28: ( ( ( (lv_parameters_0_0= ruleMultiplicativeExpression ) ) ( (otherlv_1= '+' ( (lv_parameters_2_0= ruleMultiplicativeExpression ) ) ) | (otherlv_3= '-' ( (lv_parameters_4_0= ruleMultiplicativeExpression ) ) ) )* ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5384:1: ( ( (lv_parameters_0_0= ruleMultiplicativeExpression ) ) ( (otherlv_1= '+' ( (lv_parameters_2_0= ruleMultiplicativeExpression ) ) ) | (otherlv_3= '-' ( (lv_parameters_4_0= ruleMultiplicativeExpression ) ) ) )* )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5384:1: ( ( (lv_parameters_0_0= ruleMultiplicativeExpression ) ) ( (otherlv_1= '+' ( (lv_parameters_2_0= ruleMultiplicativeExpression ) ) ) | (otherlv_3= '-' ( (lv_parameters_4_0= ruleMultiplicativeExpression ) ) ) )* )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5384:2: ( (lv_parameters_0_0= ruleMultiplicativeExpression ) ) ( (otherlv_1= '+' ( (lv_parameters_2_0= ruleMultiplicativeExpression ) ) ) | (otherlv_3= '-' ( (lv_parameters_4_0= ruleMultiplicativeExpression ) ) ) )*
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5384:2: ( (lv_parameters_0_0= ruleMultiplicativeExpression ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5385:1: (lv_parameters_0_0= ruleMultiplicativeExpression )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5385:1: (lv_parameters_0_0= ruleMultiplicativeExpression )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5386:3: lv_parameters_0_0= ruleMultiplicativeExpression
            {
             
            	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getParametersMultiplicativeExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression11227);
            lv_parameters_0_0=ruleMultiplicativeExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"parameters",
                    		lv_parameters_0_0, 
                    		"MultiplicativeExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5402:2: ( (otherlv_1= '+' ( (lv_parameters_2_0= ruleMultiplicativeExpression ) ) ) | (otherlv_3= '-' ( (lv_parameters_4_0= ruleMultiplicativeExpression ) ) ) )*
            loop74:
            do {
                int alt74=3;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==93) ) {
                    alt74=1;
                }
                else if ( (LA74_0==94) ) {
                    alt74=2;
                }


                switch (alt74) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5402:3: (otherlv_1= '+' ( (lv_parameters_2_0= ruleMultiplicativeExpression ) ) )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5402:3: (otherlv_1= '+' ( (lv_parameters_2_0= ruleMultiplicativeExpression ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5402:5: otherlv_1= '+' ( (lv_parameters_2_0= ruleMultiplicativeExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,93,FOLLOW_93_in_ruleAdditiveExpression11241); 

            	        	newLeafNode(otherlv_1, grammarAccess.getAdditiveExpressionAccess().getPlusSignKeyword_1_0_0());
            	        
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5406:1: ( (lv_parameters_2_0= ruleMultiplicativeExpression ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5407:1: (lv_parameters_2_0= ruleMultiplicativeExpression )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5407:1: (lv_parameters_2_0= ruleMultiplicativeExpression )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5408:3: lv_parameters_2_0= ruleMultiplicativeExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getParametersMultiplicativeExpressionParserRuleCall_1_0_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression11262);
            	    lv_parameters_2_0=ruleMultiplicativeExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_2_0, 
            	            		"MultiplicativeExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5425:6: (otherlv_3= '-' ( (lv_parameters_4_0= ruleMultiplicativeExpression ) ) )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5425:6: (otherlv_3= '-' ( (lv_parameters_4_0= ruleMultiplicativeExpression ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5425:8: otherlv_3= '-' ( (lv_parameters_4_0= ruleMultiplicativeExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,94,FOLLOW_94_in_ruleAdditiveExpression11282); 

            	        	newLeafNode(otherlv_3, grammarAccess.getAdditiveExpressionAccess().getHyphenMinusKeyword_1_1_0());
            	        
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5429:1: ( (lv_parameters_4_0= ruleMultiplicativeExpression ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5430:1: (lv_parameters_4_0= ruleMultiplicativeExpression )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5430:1: (lv_parameters_4_0= ruleMultiplicativeExpression )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5431:3: lv_parameters_4_0= ruleMultiplicativeExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getParametersMultiplicativeExpressionParserRuleCall_1_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression11303);
            	    lv_parameters_4_0=ruleMultiplicativeExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_4_0, 
            	            		"MultiplicativeExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5455:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5456:2: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5457:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
             newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression11342);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;

             current =iv_ruleMultiplicativeExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeExpression11352); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5464:1: ruleMultiplicativeExpression returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleUnaryExpression ) ) ( ( ( (lv_operations_1_0= '*' ) ) ( (lv_parameters_2_0= ruleUnaryExpression ) ) ) | ( ( (lv_operations_3_0= RULE_TML_SEPARATOR ) ) ( (lv_parameters_4_0= ruleUnaryExpression ) ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operations_1_0=null;
        Token lv_operations_3_0=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5467:28: ( ( ( (lv_parameters_0_0= ruleUnaryExpression ) ) ( ( ( (lv_operations_1_0= '*' ) ) ( (lv_parameters_2_0= ruleUnaryExpression ) ) ) | ( ( (lv_operations_3_0= RULE_TML_SEPARATOR ) ) ( (lv_parameters_4_0= ruleUnaryExpression ) ) ) )* ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5468:1: ( ( (lv_parameters_0_0= ruleUnaryExpression ) ) ( ( ( (lv_operations_1_0= '*' ) ) ( (lv_parameters_2_0= ruleUnaryExpression ) ) ) | ( ( (lv_operations_3_0= RULE_TML_SEPARATOR ) ) ( (lv_parameters_4_0= ruleUnaryExpression ) ) ) )* )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5468:1: ( ( (lv_parameters_0_0= ruleUnaryExpression ) ) ( ( ( (lv_operations_1_0= '*' ) ) ( (lv_parameters_2_0= ruleUnaryExpression ) ) ) | ( ( (lv_operations_3_0= RULE_TML_SEPARATOR ) ) ( (lv_parameters_4_0= ruleUnaryExpression ) ) ) )* )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5468:2: ( (lv_parameters_0_0= ruleUnaryExpression ) ) ( ( ( (lv_operations_1_0= '*' ) ) ( (lv_parameters_2_0= ruleUnaryExpression ) ) ) | ( ( (lv_operations_3_0= RULE_TML_SEPARATOR ) ) ( (lv_parameters_4_0= ruleUnaryExpression ) ) ) )*
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5468:2: ( (lv_parameters_0_0= ruleUnaryExpression ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5469:1: (lv_parameters_0_0= ruleUnaryExpression )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5469:1: (lv_parameters_0_0= ruleUnaryExpression )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5470:3: lv_parameters_0_0= ruleUnaryExpression
            {
             
            	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getParametersUnaryExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleUnaryExpression_in_ruleMultiplicativeExpression11398);
            lv_parameters_0_0=ruleUnaryExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"parameters",
                    		lv_parameters_0_0, 
                    		"UnaryExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5486:2: ( ( ( (lv_operations_1_0= '*' ) ) ( (lv_parameters_2_0= ruleUnaryExpression ) ) ) | ( ( (lv_operations_3_0= RULE_TML_SEPARATOR ) ) ( (lv_parameters_4_0= ruleUnaryExpression ) ) ) )*
            loop75:
            do {
                int alt75=3;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==95) ) {
                    alt75=1;
                }
                else if ( (LA75_0==RULE_TML_SEPARATOR) ) {
                    alt75=2;
                }


                switch (alt75) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5486:3: ( ( (lv_operations_1_0= '*' ) ) ( (lv_parameters_2_0= ruleUnaryExpression ) ) )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5486:3: ( ( (lv_operations_1_0= '*' ) ) ( (lv_parameters_2_0= ruleUnaryExpression ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5486:4: ( (lv_operations_1_0= '*' ) ) ( (lv_parameters_2_0= ruleUnaryExpression ) )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5486:4: ( (lv_operations_1_0= '*' ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5487:1: (lv_operations_1_0= '*' )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5487:1: (lv_operations_1_0= '*' )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5488:3: lv_operations_1_0= '*'
            	    {
            	    lv_operations_1_0=(Token)match(input,95,FOLLOW_95_in_ruleMultiplicativeExpression11418); 

            	            newLeafNode(lv_operations_1_0, grammarAccess.getMultiplicativeExpressionAccess().getOperationsAsteriskKeyword_1_0_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
            	    	        }
            	           		addWithLastConsumed(current, "operations", lv_operations_1_0, "*");
            	    	    

            	    }


            	    }

            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5501:2: ( (lv_parameters_2_0= ruleUnaryExpression ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5502:1: (lv_parameters_2_0= ruleUnaryExpression )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5502:1: (lv_parameters_2_0= ruleUnaryExpression )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5503:3: lv_parameters_2_0= ruleUnaryExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getParametersUnaryExpressionParserRuleCall_1_0_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUnaryExpression_in_ruleMultiplicativeExpression11452);
            	    lv_parameters_2_0=ruleUnaryExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_2_0, 
            	            		"UnaryExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5520:6: ( ( (lv_operations_3_0= RULE_TML_SEPARATOR ) ) ( (lv_parameters_4_0= ruleUnaryExpression ) ) )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5520:6: ( ( (lv_operations_3_0= RULE_TML_SEPARATOR ) ) ( (lv_parameters_4_0= ruleUnaryExpression ) ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5520:7: ( (lv_operations_3_0= RULE_TML_SEPARATOR ) ) ( (lv_parameters_4_0= ruleUnaryExpression ) )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5520:7: ( (lv_operations_3_0= RULE_TML_SEPARATOR ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5521:1: (lv_operations_3_0= RULE_TML_SEPARATOR )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5521:1: (lv_operations_3_0= RULE_TML_SEPARATOR )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5522:3: lv_operations_3_0= RULE_TML_SEPARATOR
            	    {
            	    lv_operations_3_0=(Token)match(input,RULE_TML_SEPARATOR,FOLLOW_RULE_TML_SEPARATOR_in_ruleMultiplicativeExpression11477); 

            	    			newLeafNode(lv_operations_3_0, grammarAccess.getMultiplicativeExpressionAccess().getOperationsTML_SEPARATORTerminalRuleCall_1_1_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"operations",
            	            		lv_operations_3_0, 
            	            		"TML_SEPARATOR");
            	    	    

            	    }


            	    }

            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5538:2: ( (lv_parameters_4_0= ruleUnaryExpression ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5539:1: (lv_parameters_4_0= ruleUnaryExpression )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5539:1: (lv_parameters_4_0= ruleUnaryExpression )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5540:3: lv_parameters_4_0= ruleUnaryExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getParametersUnaryExpressionParserRuleCall_1_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUnaryExpression_in_ruleMultiplicativeExpression11503);
            	    lv_parameters_4_0=ruleUnaryExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_4_0, 
            	            		"UnaryExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5564:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5565:2: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5566:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression11542);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;

             current =iv_ruleUnaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpression11552); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5573:1: ruleUnaryExpression returns [EObject current=null] : ( ( ( (lv_operations_0_0= '!' ) ) ( (lv_parameters_1_0= rulePrimaryExpression ) ) ) | this_PrimaryExpression_2= rulePrimaryExpression ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operations_0_0=null;
        EObject lv_parameters_1_0 = null;

        EObject this_PrimaryExpression_2 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5576:28: ( ( ( ( (lv_operations_0_0= '!' ) ) ( (lv_parameters_1_0= rulePrimaryExpression ) ) ) | this_PrimaryExpression_2= rulePrimaryExpression ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5577:1: ( ( ( (lv_operations_0_0= '!' ) ) ( (lv_parameters_1_0= rulePrimaryExpression ) ) ) | this_PrimaryExpression_2= rulePrimaryExpression )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5577:1: ( ( ( (lv_operations_0_0= '!' ) ) ( (lv_parameters_1_0= rulePrimaryExpression ) ) ) | this_PrimaryExpression_2= rulePrimaryExpression )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==96) ) {
                alt76=1;
            }
            else if ( (LA76_0==RULE_ID||LA76_0==RULE_DOLLAR||(LA76_0>=RULE_NUMBER && LA76_0<=RULE_SQBRACKET_OPEN)||LA76_0==RULE_TML_EXISTS||(LA76_0>=RULE_LITERALSTRING && LA76_0<=RULE_FALSE)||LA76_0==69||LA76_0==98) ) {
                alt76=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5577:2: ( ( (lv_operations_0_0= '!' ) ) ( (lv_parameters_1_0= rulePrimaryExpression ) ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5577:2: ( ( (lv_operations_0_0= '!' ) ) ( (lv_parameters_1_0= rulePrimaryExpression ) ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5577:3: ( (lv_operations_0_0= '!' ) ) ( (lv_parameters_1_0= rulePrimaryExpression ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5577:3: ( (lv_operations_0_0= '!' ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5578:1: (lv_operations_0_0= '!' )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5578:1: (lv_operations_0_0= '!' )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5579:3: lv_operations_0_0= '!'
                    {
                    lv_operations_0_0=(Token)match(input,96,FOLLOW_96_in_ruleUnaryExpression11596); 

                            newLeafNode(lv_operations_0_0, grammarAccess.getUnaryExpressionAccess().getOperationsExclamationMarkKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUnaryExpressionRule());
                    	        }
                           		addWithLastConsumed(current, "operations", lv_operations_0_0, "!");
                    	    

                    }


                    }

                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5592:2: ( (lv_parameters_1_0= rulePrimaryExpression ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5593:1: (lv_parameters_1_0= rulePrimaryExpression )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5593:1: (lv_parameters_1_0= rulePrimaryExpression )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5594:3: lv_parameters_1_0= rulePrimaryExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getParametersPrimaryExpressionParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleUnaryExpression11630);
                    lv_parameters_1_0=rulePrimaryExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_1_0, 
                            		"PrimaryExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5612:5: this_PrimaryExpression_2= rulePrimaryExpression
                    {
                     
                            newCompositeNode(grammarAccess.getUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleUnaryExpression11659);
                    this_PrimaryExpression_2=rulePrimaryExpression();

                    state._fsp--;

                     
                            current = this_PrimaryExpression_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5628:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5629:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5630:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression11694);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression11704); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5637:1: rulePrimaryExpression returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleLiteral ) ) | (otherlv_1= '(' ( (lv_parameters_2_0= ruleOrExpression ) ) otherlv_3= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5640:28: ( ( ( (lv_parameters_0_0= ruleLiteral ) ) | (otherlv_1= '(' ( (lv_parameters_2_0= ruleOrExpression ) ) otherlv_3= ')' ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5641:1: ( ( (lv_parameters_0_0= ruleLiteral ) ) | (otherlv_1= '(' ( (lv_parameters_2_0= ruleOrExpression ) ) otherlv_3= ')' ) )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5641:1: ( ( (lv_parameters_0_0= ruleLiteral ) ) | (otherlv_1= '(' ( (lv_parameters_2_0= ruleOrExpression ) ) otherlv_3= ')' ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_ID||LA77_0==RULE_DOLLAR||(LA77_0>=RULE_NUMBER && LA77_0<=RULE_SQBRACKET_OPEN)||LA77_0==RULE_TML_EXISTS||(LA77_0>=RULE_LITERALSTRING && LA77_0<=RULE_FALSE)||LA77_0==98) ) {
                alt77=1;
            }
            else if ( (LA77_0==69) ) {
                alt77=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5641:2: ( (lv_parameters_0_0= ruleLiteral ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5641:2: ( (lv_parameters_0_0= ruleLiteral ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5642:1: (lv_parameters_0_0= ruleLiteral )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5642:1: (lv_parameters_0_0= ruleLiteral )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5643:3: lv_parameters_0_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getParametersLiteralParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_rulePrimaryExpression11750);
                    lv_parameters_0_0=ruleLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_0_0, 
                            		"Literal");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5660:6: (otherlv_1= '(' ( (lv_parameters_2_0= ruleOrExpression ) ) otherlv_3= ')' )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5660:6: (otherlv_1= '(' ( (lv_parameters_2_0= ruleOrExpression ) ) otherlv_3= ')' )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5660:8: otherlv_1= '(' ( (lv_parameters_2_0= ruleOrExpression ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,69,FOLLOW_69_in_rulePrimaryExpression11769); 

                        	newLeafNode(otherlv_1, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5664:1: ( (lv_parameters_2_0= ruleOrExpression ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5665:1: (lv_parameters_2_0= ruleOrExpression )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5665:1: (lv_parameters_2_0= ruleOrExpression )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5666:3: lv_parameters_2_0= ruleOrExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getParametersOrExpressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOrExpression_in_rulePrimaryExpression11790);
                    lv_parameters_2_0=ruleOrExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_2_0, 
                            		"OrExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,70,FOLLOW_70_in_rulePrimaryExpression11802); 

                        	newLeafNode(otherlv_3, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_1_2());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleFunctionName"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5694:1: entryRuleFunctionName returns [String current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final String entryRuleFunctionName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionName = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5695:2: (iv_ruleFunctionName= ruleFunctionName EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5696:2: iv_ruleFunctionName= ruleFunctionName EOF
            {
             newCompositeNode(grammarAccess.getFunctionNameRule()); 
            pushFollow(FOLLOW_ruleFunctionName_in_entryRuleFunctionName11840);
            iv_ruleFunctionName=ruleFunctionName();

            state._fsp--;

             current =iv_ruleFunctionName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionName11851); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionName"


    // $ANTLR start "ruleFunctionName"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5703:1: ruleFunctionName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleFunctionName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5706:28: (this_ID_0= RULE_ID )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5707:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionName11890); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getFunctionNameAccess().getIDTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionName"


    // $ANTLR start "entryRuleFunctionCall"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5722:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5723:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5724:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
             newCompositeNode(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall11934);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;

             current =iv_ruleFunctionCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCall11944); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5731:1: ruleFunctionCall returns [EObject current=null] : ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleOrExpression ) )? (otherlv_3= ',' ( (lv_parameters_4_0= ruleOrExpression ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5734:28: ( ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleOrExpression ) )? (otherlv_3= ',' ( (lv_parameters_4_0= ruleOrExpression ) ) )* otherlv_5= ')' ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5735:1: ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleOrExpression ) )? (otherlv_3= ',' ( (lv_parameters_4_0= ruleOrExpression ) ) )* otherlv_5= ')' )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5735:1: ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleOrExpression ) )? (otherlv_3= ',' ( (lv_parameters_4_0= ruleOrExpression ) ) )* otherlv_5= ')' )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5735:2: ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleOrExpression ) )? (otherlv_3= ',' ( (lv_parameters_4_0= ruleOrExpression ) ) )* otherlv_5= ')'
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5735:2: ( (lv_name_0_0= ruleFunctionName ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5736:1: (lv_name_0_0= ruleFunctionName )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5736:1: (lv_name_0_0= ruleFunctionName )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5737:3: lv_name_0_0= ruleFunctionName
            {
             
            	        newCompositeNode(grammarAccess.getFunctionCallAccess().getNameFunctionNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleFunctionName_in_ruleFunctionCall11990);
            lv_name_0_0=ruleFunctionName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"FunctionName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleFunctionCall12002); 

                	newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1());
                
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5757:1: ( (lv_parameters_2_0= ruleOrExpression ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_ID||LA78_0==RULE_DOLLAR||(LA78_0>=RULE_NUMBER && LA78_0<=RULE_SQBRACKET_OPEN)||LA78_0==RULE_TML_EXISTS||(LA78_0>=RULE_LITERALSTRING && LA78_0<=RULE_FALSE)||LA78_0==69||LA78_0==96||LA78_0==98) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5758:1: (lv_parameters_2_0= ruleOrExpression )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5758:1: (lv_parameters_2_0= ruleOrExpression )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5759:3: lv_parameters_2_0= ruleOrExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersOrExpressionParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOrExpression_in_ruleFunctionCall12023);
                    lv_parameters_2_0=ruleOrExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_2_0, 
                            		"OrExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5775:3: (otherlv_3= ',' ( (lv_parameters_4_0= ruleOrExpression ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==68) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5775:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleOrExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,68,FOLLOW_68_in_ruleFunctionCall12037); 

            	        	newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getCommaKeyword_3_0());
            	        
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5779:1: ( (lv_parameters_4_0= ruleOrExpression ) )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5780:1: (lv_parameters_4_0= ruleOrExpression )
            	    {
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5780:1: (lv_parameters_4_0= ruleOrExpression )
            	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5781:3: lv_parameters_4_0= ruleOrExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersOrExpressionParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOrExpression_in_ruleFunctionCall12058);
            	    lv_parameters_4_0=ruleOrExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_4_0, 
            	            		"OrExpression");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            otherlv_5=(Token)match(input,70,FOLLOW_70_in_ruleFunctionCall12072); 

                	newLeafNode(otherlv_5, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleDateLiteral"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5809:1: entryRuleDateLiteral returns [EObject current=null] : iv_ruleDateLiteral= ruleDateLiteral EOF ;
    public final EObject entryRuleDateLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateLiteral = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5810:2: (iv_ruleDateLiteral= ruleDateLiteral EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5811:2: iv_ruleDateLiteral= ruleDateLiteral EOF
            {
             newCompositeNode(grammarAccess.getDateLiteralRule()); 
            pushFollow(FOLLOW_ruleDateLiteral_in_entryRuleDateLiteral12108);
            iv_ruleDateLiteral=ruleDateLiteral();

            state._fsp--;

             current =iv_ruleDateLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateLiteral12118); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDateLiteral"


    // $ANTLR start "ruleDateLiteral"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5818:1: ruleDateLiteral returns [EObject current=null] : ( () this_NUMBER_1= RULE_NUMBER otherlv_2= '#' this_NUMBER_3= RULE_NUMBER otherlv_4= '#' this_NUMBER_5= RULE_NUMBER otherlv_6= '#' this_NUMBER_7= RULE_NUMBER otherlv_8= '#' this_NUMBER_9= RULE_NUMBER otherlv_10= '#' this_NUMBER_11= RULE_NUMBER ) ;
    public final EObject ruleDateLiteral() throws RecognitionException {
        EObject current = null;

        Token this_NUMBER_1=null;
        Token otherlv_2=null;
        Token this_NUMBER_3=null;
        Token otherlv_4=null;
        Token this_NUMBER_5=null;
        Token otherlv_6=null;
        Token this_NUMBER_7=null;
        Token otherlv_8=null;
        Token this_NUMBER_9=null;
        Token otherlv_10=null;
        Token this_NUMBER_11=null;

         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5821:28: ( ( () this_NUMBER_1= RULE_NUMBER otherlv_2= '#' this_NUMBER_3= RULE_NUMBER otherlv_4= '#' this_NUMBER_5= RULE_NUMBER otherlv_6= '#' this_NUMBER_7= RULE_NUMBER otherlv_8= '#' this_NUMBER_9= RULE_NUMBER otherlv_10= '#' this_NUMBER_11= RULE_NUMBER ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5822:1: ( () this_NUMBER_1= RULE_NUMBER otherlv_2= '#' this_NUMBER_3= RULE_NUMBER otherlv_4= '#' this_NUMBER_5= RULE_NUMBER otherlv_6= '#' this_NUMBER_7= RULE_NUMBER otherlv_8= '#' this_NUMBER_9= RULE_NUMBER otherlv_10= '#' this_NUMBER_11= RULE_NUMBER )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5822:1: ( () this_NUMBER_1= RULE_NUMBER otherlv_2= '#' this_NUMBER_3= RULE_NUMBER otherlv_4= '#' this_NUMBER_5= RULE_NUMBER otherlv_6= '#' this_NUMBER_7= RULE_NUMBER otherlv_8= '#' this_NUMBER_9= RULE_NUMBER otherlv_10= '#' this_NUMBER_11= RULE_NUMBER )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5822:2: () this_NUMBER_1= RULE_NUMBER otherlv_2= '#' this_NUMBER_3= RULE_NUMBER otherlv_4= '#' this_NUMBER_5= RULE_NUMBER otherlv_6= '#' this_NUMBER_7= RULE_NUMBER otherlv_8= '#' this_NUMBER_9= RULE_NUMBER otherlv_10= '#' this_NUMBER_11= RULE_NUMBER
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5822:2: ()
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5823:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDateLiteralAccess().getExpressionAction_0(),
                        current);
                

            }

            this_NUMBER_1=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleDateLiteral12163); 
             
                newLeafNode(this_NUMBER_1, grammarAccess.getDateLiteralAccess().getNUMBERTerminalRuleCall_1()); 
                
            otherlv_2=(Token)match(input,97,FOLLOW_97_in_ruleDateLiteral12174); 

                	newLeafNode(otherlv_2, grammarAccess.getDateLiteralAccess().getNumberSignKeyword_2());
                
            this_NUMBER_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleDateLiteral12185); 
             
                newLeafNode(this_NUMBER_3, grammarAccess.getDateLiteralAccess().getNUMBERTerminalRuleCall_3()); 
                
            otherlv_4=(Token)match(input,97,FOLLOW_97_in_ruleDateLiteral12196); 

                	newLeafNode(otherlv_4, grammarAccess.getDateLiteralAccess().getNumberSignKeyword_4());
                
            this_NUMBER_5=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleDateLiteral12207); 
             
                newLeafNode(this_NUMBER_5, grammarAccess.getDateLiteralAccess().getNUMBERTerminalRuleCall_5()); 
                
            otherlv_6=(Token)match(input,97,FOLLOW_97_in_ruleDateLiteral12218); 

                	newLeafNode(otherlv_6, grammarAccess.getDateLiteralAccess().getNumberSignKeyword_6());
                
            this_NUMBER_7=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleDateLiteral12229); 
             
                newLeafNode(this_NUMBER_7, grammarAccess.getDateLiteralAccess().getNUMBERTerminalRuleCall_7()); 
                
            otherlv_8=(Token)match(input,97,FOLLOW_97_in_ruleDateLiteral12240); 

                	newLeafNode(otherlv_8, grammarAccess.getDateLiteralAccess().getNumberSignKeyword_8());
                
            this_NUMBER_9=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleDateLiteral12251); 
             
                newLeafNode(this_NUMBER_9, grammarAccess.getDateLiteralAccess().getNUMBERTerminalRuleCall_9()); 
                
            otherlv_10=(Token)match(input,97,FOLLOW_97_in_ruleDateLiteral12262); 

                	newLeafNode(otherlv_10, grammarAccess.getDateLiteralAccess().getNumberSignKeyword_10());
                
            this_NUMBER_11=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleDateLiteral12273); 
             
                newLeafNode(this_NUMBER_11, grammarAccess.getDateLiteralAccess().getNUMBERTerminalRuleCall_11()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDateLiteral"


    // $ANTLR start "entryRuleLiteral"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5880:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5881:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5882:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral12308);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral12318); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5889:1: ruleLiteral returns [EObject current=null] : ( ( () this_NUMBER_1= RULE_NUMBER ) | ( (lv_valueString_2_0= RULE_LITERALSTRING ) ) | ( ( (lv_operations_3_0= RULE_FORALL ) ) otherlv_4= '(' ( (lv_valueString_5_0= RULE_LITERALSTRING ) ) otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) ) otherlv_8= ')' ) | ( (lv_parameters_9_0= ruleFunctionCall ) ) | ( ( (lv_expressionType_10_0= '{' ) ) ( (lv_parameters_11_0= ruleOrExpression ) )? (otherlv_12= ',' ( (lv_parameters_13_0= ruleOrExpression ) ) )* otherlv_14= '}' ) | ( (lv_elements_15_0= RULE_NULL ) ) | ( (lv_elements_16_0= RULE_TODAY ) ) | ( (lv_elements_17_0= RULE_TRUE ) ) | ( (lv_elements_18_0= RULE_FALSE ) ) | ( (lv_parameters_19_0= ruleTmlExpression ) ) | ( (lv_parameters_20_0= ruleExistsTmlExpression ) ) | ( (lv_parameters_21_0= ruleMapGetReference ) ) | ( (lv_parameters_22_0= ruleDateLiteral ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token this_NUMBER_1=null;
        Token lv_valueString_2_0=null;
        Token lv_operations_3_0=null;
        Token otherlv_4=null;
        Token lv_valueString_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_expressionType_10_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_elements_15_0=null;
        Token lv_elements_16_0=null;
        Token lv_elements_17_0=null;
        Token lv_elements_18_0=null;
        EObject lv_parameters_7_0 = null;

        EObject lv_parameters_9_0 = null;

        EObject lv_parameters_11_0 = null;

        EObject lv_parameters_13_0 = null;

        EObject lv_parameters_19_0 = null;

        EObject lv_parameters_20_0 = null;

        EObject lv_parameters_21_0 = null;

        EObject lv_parameters_22_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5892:28: ( ( ( () this_NUMBER_1= RULE_NUMBER ) | ( (lv_valueString_2_0= RULE_LITERALSTRING ) ) | ( ( (lv_operations_3_0= RULE_FORALL ) ) otherlv_4= '(' ( (lv_valueString_5_0= RULE_LITERALSTRING ) ) otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) ) otherlv_8= ')' ) | ( (lv_parameters_9_0= ruleFunctionCall ) ) | ( ( (lv_expressionType_10_0= '{' ) ) ( (lv_parameters_11_0= ruleOrExpression ) )? (otherlv_12= ',' ( (lv_parameters_13_0= ruleOrExpression ) ) )* otherlv_14= '}' ) | ( (lv_elements_15_0= RULE_NULL ) ) | ( (lv_elements_16_0= RULE_TODAY ) ) | ( (lv_elements_17_0= RULE_TRUE ) ) | ( (lv_elements_18_0= RULE_FALSE ) ) | ( (lv_parameters_19_0= ruleTmlExpression ) ) | ( (lv_parameters_20_0= ruleExistsTmlExpression ) ) | ( (lv_parameters_21_0= ruleMapGetReference ) ) | ( (lv_parameters_22_0= ruleDateLiteral ) ) ) )
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5893:1: ( ( () this_NUMBER_1= RULE_NUMBER ) | ( (lv_valueString_2_0= RULE_LITERALSTRING ) ) | ( ( (lv_operations_3_0= RULE_FORALL ) ) otherlv_4= '(' ( (lv_valueString_5_0= RULE_LITERALSTRING ) ) otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) ) otherlv_8= ')' ) | ( (lv_parameters_9_0= ruleFunctionCall ) ) | ( ( (lv_expressionType_10_0= '{' ) ) ( (lv_parameters_11_0= ruleOrExpression ) )? (otherlv_12= ',' ( (lv_parameters_13_0= ruleOrExpression ) ) )* otherlv_14= '}' ) | ( (lv_elements_15_0= RULE_NULL ) ) | ( (lv_elements_16_0= RULE_TODAY ) ) | ( (lv_elements_17_0= RULE_TRUE ) ) | ( (lv_elements_18_0= RULE_FALSE ) ) | ( (lv_parameters_19_0= ruleTmlExpression ) ) | ( (lv_parameters_20_0= ruleExistsTmlExpression ) ) | ( (lv_parameters_21_0= ruleMapGetReference ) ) | ( (lv_parameters_22_0= ruleDateLiteral ) ) )
            {
            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5893:1: ( ( () this_NUMBER_1= RULE_NUMBER ) | ( (lv_valueString_2_0= RULE_LITERALSTRING ) ) | ( ( (lv_operations_3_0= RULE_FORALL ) ) otherlv_4= '(' ( (lv_valueString_5_0= RULE_LITERALSTRING ) ) otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) ) otherlv_8= ')' ) | ( (lv_parameters_9_0= ruleFunctionCall ) ) | ( ( (lv_expressionType_10_0= '{' ) ) ( (lv_parameters_11_0= ruleOrExpression ) )? (otherlv_12= ',' ( (lv_parameters_13_0= ruleOrExpression ) ) )* otherlv_14= '}' ) | ( (lv_elements_15_0= RULE_NULL ) ) | ( (lv_elements_16_0= RULE_TODAY ) ) | ( (lv_elements_17_0= RULE_TRUE ) ) | ( (lv_elements_18_0= RULE_FALSE ) ) | ( (lv_parameters_19_0= ruleTmlExpression ) ) | ( (lv_parameters_20_0= ruleExistsTmlExpression ) ) | ( (lv_parameters_21_0= ruleMapGetReference ) ) | ( (lv_parameters_22_0= ruleDateLiteral ) ) )
            int alt82=13;
            alt82 = dfa82.predict(input);
            switch (alt82) {
                case 1 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5893:2: ( () this_NUMBER_1= RULE_NUMBER )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5893:2: ( () this_NUMBER_1= RULE_NUMBER )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5893:3: () this_NUMBER_1= RULE_NUMBER
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5893:3: ()
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5894:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralAccess().getExpressionAction_0_0(),
                                current);
                        

                    }

                    this_NUMBER_1=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleLiteral12364); 
                     
                        newLeafNode(this_NUMBER_1, grammarAccess.getLiteralAccess().getNUMBERTerminalRuleCall_0_1()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5904:6: ( (lv_valueString_2_0= RULE_LITERALSTRING ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5904:6: ( (lv_valueString_2_0= RULE_LITERALSTRING ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5905:1: (lv_valueString_2_0= RULE_LITERALSTRING )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5905:1: (lv_valueString_2_0= RULE_LITERALSTRING )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5906:3: lv_valueString_2_0= RULE_LITERALSTRING
                    {
                    lv_valueString_2_0=(Token)match(input,RULE_LITERALSTRING,FOLLOW_RULE_LITERALSTRING_in_ruleLiteral12387); 

                    			newLeafNode(lv_valueString_2_0, grammarAccess.getLiteralAccess().getValueStringLITERALSTRINGTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"valueString",
                            		lv_valueString_2_0, 
                            		"LITERALSTRING");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5923:6: ( ( (lv_operations_3_0= RULE_FORALL ) ) otherlv_4= '(' ( (lv_valueString_5_0= RULE_LITERALSTRING ) ) otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) ) otherlv_8= ')' )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5923:6: ( ( (lv_operations_3_0= RULE_FORALL ) ) otherlv_4= '(' ( (lv_valueString_5_0= RULE_LITERALSTRING ) ) otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) ) otherlv_8= ')' )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5923:7: ( (lv_operations_3_0= RULE_FORALL ) ) otherlv_4= '(' ( (lv_valueString_5_0= RULE_LITERALSTRING ) ) otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) ) otherlv_8= ')'
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5923:7: ( (lv_operations_3_0= RULE_FORALL ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5924:1: (lv_operations_3_0= RULE_FORALL )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5924:1: (lv_operations_3_0= RULE_FORALL )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5925:3: lv_operations_3_0= RULE_FORALL
                    {
                    lv_operations_3_0=(Token)match(input,RULE_FORALL,FOLLOW_RULE_FORALL_in_ruleLiteral12416); 

                    			newLeafNode(lv_operations_3_0, grammarAccess.getLiteralAccess().getOperationsFORALLTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"operations",
                            		lv_operations_3_0, 
                            		"FORALL");
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,69,FOLLOW_69_in_ruleLiteral12433); 

                        	newLeafNode(otherlv_4, grammarAccess.getLiteralAccess().getLeftParenthesisKeyword_2_1());
                        
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5945:1: ( (lv_valueString_5_0= RULE_LITERALSTRING ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5946:1: (lv_valueString_5_0= RULE_LITERALSTRING )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5946:1: (lv_valueString_5_0= RULE_LITERALSTRING )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5947:3: lv_valueString_5_0= RULE_LITERALSTRING
                    {
                    lv_valueString_5_0=(Token)match(input,RULE_LITERALSTRING,FOLLOW_RULE_LITERALSTRING_in_ruleLiteral12450); 

                    			newLeafNode(lv_valueString_5_0, grammarAccess.getLiteralAccess().getValueStringLITERALSTRINGTerminalRuleCall_2_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"valueString",
                            		lv_valueString_5_0, 
                            		"LITERALSTRING");
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,68,FOLLOW_68_in_ruleLiteral12467); 

                        	newLeafNode(otherlv_6, grammarAccess.getLiteralAccess().getCommaKeyword_2_3());
                        
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5967:1: ( (lv_parameters_7_0= ruleOrExpression ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5968:1: (lv_parameters_7_0= ruleOrExpression )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5968:1: (lv_parameters_7_0= ruleOrExpression )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5969:3: lv_parameters_7_0= ruleOrExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralAccess().getParametersOrExpressionParserRuleCall_2_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOrExpression_in_ruleLiteral12488);
                    lv_parameters_7_0=ruleOrExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLiteralRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_7_0, 
                            		"OrExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,70,FOLLOW_70_in_ruleLiteral12500); 

                        	newLeafNode(otherlv_8, grammarAccess.getLiteralAccess().getRightParenthesisKeyword_2_5());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5990:6: ( (lv_parameters_9_0= ruleFunctionCall ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5990:6: ( (lv_parameters_9_0= ruleFunctionCall ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5991:1: (lv_parameters_9_0= ruleFunctionCall )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5991:1: (lv_parameters_9_0= ruleFunctionCall )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:5992:3: lv_parameters_9_0= ruleFunctionCall
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralAccess().getParametersFunctionCallParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionCall_in_ruleLiteral12528);
                    lv_parameters_9_0=ruleFunctionCall();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLiteralRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_9_0, 
                            		"FunctionCall");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6009:6: ( ( (lv_expressionType_10_0= '{' ) ) ( (lv_parameters_11_0= ruleOrExpression ) )? (otherlv_12= ',' ( (lv_parameters_13_0= ruleOrExpression ) ) )* otherlv_14= '}' )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6009:6: ( ( (lv_expressionType_10_0= '{' ) ) ( (lv_parameters_11_0= ruleOrExpression ) )? (otherlv_12= ',' ( (lv_parameters_13_0= ruleOrExpression ) ) )* otherlv_14= '}' )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6009:7: ( (lv_expressionType_10_0= '{' ) ) ( (lv_parameters_11_0= ruleOrExpression ) )? (otherlv_12= ',' ( (lv_parameters_13_0= ruleOrExpression ) ) )* otherlv_14= '}'
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6009:7: ( (lv_expressionType_10_0= '{' ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6010:1: (lv_expressionType_10_0= '{' )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6010:1: (lv_expressionType_10_0= '{' )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6011:3: lv_expressionType_10_0= '{'
                    {
                    lv_expressionType_10_0=(Token)match(input,98,FOLLOW_98_in_ruleLiteral12553); 

                            newLeafNode(lv_expressionType_10_0, grammarAccess.getLiteralAccess().getExpressionTypeLeftCurlyBracketKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralRule());
                    	        }
                           		setWithLastConsumed(current, "expressionType", lv_expressionType_10_0, "{");
                    	    

                    }


                    }

                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6024:2: ( (lv_parameters_11_0= ruleOrExpression ) )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==RULE_ID||LA80_0==RULE_DOLLAR||(LA80_0>=RULE_NUMBER && LA80_0<=RULE_SQBRACKET_OPEN)||LA80_0==RULE_TML_EXISTS||(LA80_0>=RULE_LITERALSTRING && LA80_0<=RULE_FALSE)||LA80_0==69||LA80_0==96||LA80_0==98) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6025:1: (lv_parameters_11_0= ruleOrExpression )
                            {
                            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6025:1: (lv_parameters_11_0= ruleOrExpression )
                            // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6026:3: lv_parameters_11_0= ruleOrExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getLiteralAccess().getParametersOrExpressionParserRuleCall_4_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleOrExpression_in_ruleLiteral12587);
                            lv_parameters_11_0=ruleOrExpression();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getLiteralRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"parameters",
                                    		lv_parameters_11_0, 
                                    		"OrExpression");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6042:3: (otherlv_12= ',' ( (lv_parameters_13_0= ruleOrExpression ) ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==68) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6042:5: otherlv_12= ',' ( (lv_parameters_13_0= ruleOrExpression ) )
                    	    {
                    	    otherlv_12=(Token)match(input,68,FOLLOW_68_in_ruleLiteral12601); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getLiteralAccess().getCommaKeyword_4_2_0());
                    	        
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6046:1: ( (lv_parameters_13_0= ruleOrExpression ) )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6047:1: (lv_parameters_13_0= ruleOrExpression )
                    	    {
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6047:1: (lv_parameters_13_0= ruleOrExpression )
                    	    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6048:3: lv_parameters_13_0= ruleOrExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLiteralAccess().getParametersOrExpressionParserRuleCall_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleOrExpression_in_ruleLiteral12622);
                    	    lv_parameters_13_0=ruleOrExpression();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getLiteralRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_13_0, 
                    	            		"OrExpression");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,99,FOLLOW_99_in_ruleLiteral12636); 

                        	newLeafNode(otherlv_14, grammarAccess.getLiteralAccess().getRightCurlyBracketKeyword_4_3());
                        

                    }


                    }
                    break;
                case 6 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6069:6: ( (lv_elements_15_0= RULE_NULL ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6069:6: ( (lv_elements_15_0= RULE_NULL ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6070:1: (lv_elements_15_0= RULE_NULL )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6070:1: (lv_elements_15_0= RULE_NULL )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6071:3: lv_elements_15_0= RULE_NULL
                    {
                    lv_elements_15_0=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleLiteral12660); 

                    			newLeafNode(lv_elements_15_0, grammarAccess.getLiteralAccess().getElementsNULLTerminalRuleCall_5_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"elements",
                            		lv_elements_15_0, 
                            		"NULL");
                    	    

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6088:6: ( (lv_elements_16_0= RULE_TODAY ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6088:6: ( (lv_elements_16_0= RULE_TODAY ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6089:1: (lv_elements_16_0= RULE_TODAY )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6089:1: (lv_elements_16_0= RULE_TODAY )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6090:3: lv_elements_16_0= RULE_TODAY
                    {
                    lv_elements_16_0=(Token)match(input,RULE_TODAY,FOLLOW_RULE_TODAY_in_ruleLiteral12688); 

                    			newLeafNode(lv_elements_16_0, grammarAccess.getLiteralAccess().getElementsTODAYTerminalRuleCall_6_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"elements",
                            		lv_elements_16_0, 
                            		"TODAY");
                    	    

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6107:6: ( (lv_elements_17_0= RULE_TRUE ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6107:6: ( (lv_elements_17_0= RULE_TRUE ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6108:1: (lv_elements_17_0= RULE_TRUE )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6108:1: (lv_elements_17_0= RULE_TRUE )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6109:3: lv_elements_17_0= RULE_TRUE
                    {
                    lv_elements_17_0=(Token)match(input,RULE_TRUE,FOLLOW_RULE_TRUE_in_ruleLiteral12716); 

                    			newLeafNode(lv_elements_17_0, grammarAccess.getLiteralAccess().getElementsTRUETerminalRuleCall_7_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"elements",
                            		lv_elements_17_0, 
                            		"TRUE");
                    	    

                    }


                    }


                    }
                    break;
                case 9 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6126:6: ( (lv_elements_18_0= RULE_FALSE ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6126:6: ( (lv_elements_18_0= RULE_FALSE ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6127:1: (lv_elements_18_0= RULE_FALSE )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6127:1: (lv_elements_18_0= RULE_FALSE )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6128:3: lv_elements_18_0= RULE_FALSE
                    {
                    lv_elements_18_0=(Token)match(input,RULE_FALSE,FOLLOW_RULE_FALSE_in_ruleLiteral12744); 

                    			newLeafNode(lv_elements_18_0, grammarAccess.getLiteralAccess().getElementsFALSETerminalRuleCall_8_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"elements",
                            		lv_elements_18_0, 
                            		"FALSE");
                    	    

                    }


                    }


                    }
                    break;
                case 10 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6145:6: ( (lv_parameters_19_0= ruleTmlExpression ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6145:6: ( (lv_parameters_19_0= ruleTmlExpression ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6146:1: (lv_parameters_19_0= ruleTmlExpression )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6146:1: (lv_parameters_19_0= ruleTmlExpression )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6147:3: lv_parameters_19_0= ruleTmlExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralAccess().getParametersTmlExpressionParserRuleCall_9_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTmlExpression_in_ruleLiteral12776);
                    lv_parameters_19_0=ruleTmlExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLiteralRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_19_0, 
                            		"TmlExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 11 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6164:6: ( (lv_parameters_20_0= ruleExistsTmlExpression ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6164:6: ( (lv_parameters_20_0= ruleExistsTmlExpression ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6165:1: (lv_parameters_20_0= ruleExistsTmlExpression )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6165:1: (lv_parameters_20_0= ruleExistsTmlExpression )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6166:3: lv_parameters_20_0= ruleExistsTmlExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralAccess().getParametersExistsTmlExpressionParserRuleCall_10_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExistsTmlExpression_in_ruleLiteral12803);
                    lv_parameters_20_0=ruleExistsTmlExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLiteralRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_20_0, 
                            		"ExistsTmlExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 12 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6183:6: ( (lv_parameters_21_0= ruleMapGetReference ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6183:6: ( (lv_parameters_21_0= ruleMapGetReference ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6184:1: (lv_parameters_21_0= ruleMapGetReference )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6184:1: (lv_parameters_21_0= ruleMapGetReference )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6185:3: lv_parameters_21_0= ruleMapGetReference
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralAccess().getParametersMapGetReferenceParserRuleCall_11_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMapGetReference_in_ruleLiteral12830);
                    lv_parameters_21_0=ruleMapGetReference();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLiteralRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_21_0, 
                            		"MapGetReference");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 13 :
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6202:6: ( (lv_parameters_22_0= ruleDateLiteral ) )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6202:6: ( (lv_parameters_22_0= ruleDateLiteral ) )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6203:1: (lv_parameters_22_0= ruleDateLiteral )
                    {
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6203:1: (lv_parameters_22_0= ruleDateLiteral )
                    // ../com.dexels.navajo.dsl.tsl/src-gen/com/dexels/navajo/dsl/tsl/parser/antlr/internal/InternalTsl.g:6204:3: lv_parameters_22_0= ruleDateLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralAccess().getParametersDateLiteralParserRuleCall_12_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDateLiteral_in_ruleLiteral12857);
                    lv_parameters_22_0=ruleDateLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLiteralRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_22_0, 
                            		"DateLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"

    // Delegated rules


    protected DFA61 dfa61 = new DFA61(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA82 dfa82 = new DFA82(this);
    static final String DFA61_eotS =
        "\7\uffff";
    static final String DFA61_eofS =
        "\7\uffff";
    static final String DFA61_minS =
        "\2\11\2\uffff\3\11";
    static final String DFA61_maxS =
        "\2\21\2\uffff\3\20";
    static final String DFA61_acceptS =
        "\2\uffff\1\2\1\1\3\uffff";
    static final String DFA61_specialS =
        "\7\uffff}>";
    static final String[] DFA61_transitionS = {
            "\3\2\1\uffff\1\1\3\uffff\1\2",
            "\3\3\1\uffff\1\4\2\uffff\1\2\1\3",
            "",
            "",
            "\3\2\1\uffff\1\5\2\uffff\1\3",
            "\3\3\1\uffff\1\6\2\uffff\1\2",
            "\3\2\1\uffff\1\5\2\uffff\1\3"
    };

    static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
    static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
    static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
    static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
    static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
    static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
    static final short[][] DFA61_transition;

    static {
        int numStates = DFA61_transitionS.length;
        DFA61_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = DFA61_eot;
            this.eof = DFA61_eof;
            this.min = DFA61_min;
            this.max = DFA61_max;
            this.accept = DFA61_accept;
            this.special = DFA61_special;
            this.transition = DFA61_transition;
        }
        public String getDescription() {
            return "4566:1: ( (lv_absolute_1_0= RULE_TML_SEPARATOR ) )?";
        }
    }
    static final String DFA64_eotS =
        "\7\uffff";
    static final String DFA64_eofS =
        "\7\uffff";
    static final String DFA64_minS =
        "\2\11\2\uffff\3\11";
    static final String DFA64_maxS =
        "\2\21\2\uffff\3\20";
    static final String DFA64_acceptS =
        "\2\uffff\1\2\1\1\3\uffff";
    static final String DFA64_specialS =
        "\7\uffff}>";
    static final String[] DFA64_transitionS = {
            "\3\2\1\uffff\1\1\3\uffff\1\2",
            "\3\3\1\uffff\1\4\2\uffff\1\2\1\3",
            "",
            "",
            "\3\2\1\uffff\1\5\2\uffff\1\3",
            "\3\3\1\uffff\1\6\2\uffff\1\2",
            "\3\2\1\uffff\1\5\2\uffff\1\3"
    };

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "4675:1: ( (lv_absolute_2_0= RULE_TML_SEPARATOR ) )?";
        }
    }
    static final String DFA82_eotS =
        "\17\uffff";
    static final String DFA82_eofS =
        "\1\uffff\1\16\15\uffff";
    static final String DFA82_minS =
        "\1\11\1\6\15\uffff";
    static final String DFA82_maxS =
        "\1\142\1\143\15\uffff";
    static final String DFA82_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1"+
        "\1";
    static final String DFA82_specialS =
        "\17\uffff}>";
    static final String[] DFA82_transitionS = {
            "\1\4\2\uffff\1\14\1\uffff\1\1\1\12\3\uffff\1\13\47\uffff\1\2"+
            "\1\3\1\6\1\7\1\10\1\11\41\uffff\1\5",
            "\1\16\1\uffff\1\16\4\uffff\1\16\6\uffff\1\16\7\uffff\1\16\25"+
            "\uffff\1\16\4\uffff\4\16\11\uffff\1\16\1\uffff\1\16\6\uffff"+
            "\1\16\13\uffff\7\16\1\uffff\1\15\1\uffff\1\16",
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

    static final short[] DFA82_eot = DFA.unpackEncodedString(DFA82_eotS);
    static final short[] DFA82_eof = DFA.unpackEncodedString(DFA82_eofS);
    static final char[] DFA82_min = DFA.unpackEncodedStringToUnsignedChars(DFA82_minS);
    static final char[] DFA82_max = DFA.unpackEncodedStringToUnsignedChars(DFA82_maxS);
    static final short[] DFA82_accept = DFA.unpackEncodedString(DFA82_acceptS);
    static final short[] DFA82_special = DFA.unpackEncodedString(DFA82_specialS);
    static final short[][] DFA82_transition;

    static {
        int numStates = DFA82_transitionS.length;
        DFA82_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA82_transition[i] = DFA.unpackEncodedString(DFA82_transitionS[i]);
        }
    }

    class DFA82 extends DFA {

        public DFA82(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 82;
            this.eot = DFA82_eot;
            this.eof = DFA82_eof;
            this.min = DFA82_min;
            this.max = DFA82_max;
            this.accept = DFA82_accept;
            this.special = DFA82_special;
            this.transition = DFA82_transition;
        }
        public String getDescription() {
            return "5893:1: ( ( () this_NUMBER_1= RULE_NUMBER ) | ( (lv_valueString_2_0= RULE_LITERALSTRING ) ) | ( ( (lv_operations_3_0= RULE_FORALL ) ) otherlv_4= '(' ( (lv_valueString_5_0= RULE_LITERALSTRING ) ) otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) ) otherlv_8= ')' ) | ( (lv_parameters_9_0= ruleFunctionCall ) ) | ( ( (lv_expressionType_10_0= '{' ) ) ( (lv_parameters_11_0= ruleOrExpression ) )? (otherlv_12= ',' ( (lv_parameters_13_0= ruleOrExpression ) ) )* otherlv_14= '}' ) | ( (lv_elements_15_0= RULE_NULL ) ) | ( (lv_elements_16_0= RULE_TODAY ) ) | ( (lv_elements_17_0= RULE_TRUE ) ) | ( (lv_elements_18_0= RULE_FALSE ) ) | ( (lv_parameters_19_0= ruleTmlExpression ) ) | ( (lv_parameters_20_0= ruleExistsTmlExpression ) ) | ( (lv_parameters_21_0= ruleMapGetReference ) ) | ( (lv_parameters_22_0= ruleDateLiteral ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleTml_in_entryRuleTml75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTml85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XMLHEAD_in_ruleTml131 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_NAVASCRIPT_START_in_ruleTml143 = new BitSet(new long[]{0x0000000000000340L});
    public static final BitSet FOLLOW_ruleNonExpression_in_ruleTml163 = new BitSet(new long[]{0x0000000000000340L});
    public static final BitSet FOLLOW_RULE_XML_TAG_END_in_ruleTml177 = new BitSet(new long[]{0x0002082A22200080L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleTml198 = new BitSet(new long[]{0x0002082A22200080L});
    public static final BitSet FOLLOW_ruleMap_in_ruleTml225 = new BitSet(new long[]{0x0002082A22200080L});
    public static final BitSet FOLLOW_ruleParam_in_ruleTml252 = new BitSet(new long[]{0x0002082A22200080L});
    public static final BitSet FOLLOW_ruleMethods_in_ruleTml279 = new BitSet(new long[]{0x0002082A22200080L});
    public static final BitSet FOLLOW_ruleDebugTag_in_ruleTml306 = new BitSet(new long[]{0x0002082A22200080L});
    public static final BitSet FOLLOW_ruleInclude_in_ruleTml333 = new BitSet(new long[]{0x0002082A22200080L});
    public static final BitSet FOLLOW_ruleValidations_in_ruleTml360 = new BitSet(new long[]{0x0002082A22200080L});
    public static final BitSet FOLLOW_ruleComment_in_ruleTml387 = new BitSet(new long[]{0x0002082A22200080L});
    public static final BitSet FOLLOW_RULE_NAVASCRIPT_END_in_ruleTml400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XML_TAG_SINGLEEND_in_ruleTml417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGarbage_in_entryRuleGarbage454 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGarbage465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGarbage505 = new BitSet(new long[]{0x00000000000FFE02L,0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleGarbage531 = new BitSet(new long[]{0x00000000000FFE02L,0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_PARENT_in_ruleGarbage557 = new BitSet(new long[]{0x00000000000FFE02L,0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_DOLLAR_in_ruleGarbage583 = new BitSet(new long[]{0x00000000000FFE02L,0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_TML_SEPARATOR_in_ruleGarbage609 = new BitSet(new long[]{0x00000000000FFE02L,0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleGarbage635 = new BitSet(new long[]{0x00000000000FFE02L,0x0000000000000070L});
    public static final BitSet FOLLOW_68_in_ruleGarbage659 = new BitSet(new long[]{0x00000000000FFE02L,0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_SQBRACKET_OPEN_in_ruleGarbage680 = new BitSet(new long[]{0x00000000000FFE02L,0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_SQBRACKET_CLOSE_in_ruleGarbage706 = new BitSet(new long[]{0x00000000000FFE02L,0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_AT_in_ruleGarbage732 = new BitSet(new long[]{0x00000000000FFE02L,0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleGarbage758 = new BitSet(new long[]{0x00000000000FFE02L,0x0000000000000070L});
    public static final BitSet FOLLOW_69_in_ruleGarbage782 = new BitSet(new long[]{0x00000000000FFE02L,0x0000000000000070L});
    public static final BitSet FOLLOW_70_in_ruleGarbage801 = new BitSet(new long[]{0x00000000000FFE02L,0x0000000000000070L});
    public static final BitSet FOLLOW_RULE_TML_EXISTS_in_ruleGarbage822 = new BitSet(new long[]{0x00000000000FFE02L,0x0000000000000070L});
    public static final BitSet FOLLOW_ruleAttributeName_in_entryRuleAttributeName869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeName880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeName920 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleAttributeName941 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeName961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1008 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpression1061 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleExpression1077 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleAttributeName_in_ruleExpression1099 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleExpression1111 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleExpression1123 = new BitSet(new long[]{0xF80000000008D200L,0x0000000500000021L});
    public static final BitSet FOLLOW_ruleTopLevel_in_ruleExpression1143 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleExpression1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonExpression_in_entryRuleNonExpression1202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNonExpression1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNonExpression1255 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleNonExpression1271 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleAttributeName_in_ruleNonExpression1293 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleNonExpression1305 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleNonExpression1317 = new BitSet(new long[]{0x00000000001FFE00L,0x0000000000000070L});
    public static final BitSet FOLLOW_ruleGarbage_in_ruleNonExpression1337 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleNonExpression1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethods_in_entryRuleMethods1384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethods1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_METHODS_START_TAG_in_ruleMethods1430 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_RULE_XML_TAG_END_in_ruleMethods1457 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleMethods1483 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_RULE_METHODS_END_TAG_in_ruleMethods1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XML_TAG_SINGLEEND_in_ruleMethods1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod1560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_METHOD_START_TAG_in_ruleMethod1606 = new BitSet(new long[]{0x0000000000000340L});
    public static final BitSet FOLLOW_ruleNonExpression_in_ruleMethod1635 = new BitSet(new long[]{0x0000000000000340L});
    public static final BitSet FOLLOW_RULE_XML_TAG_END_in_ruleMethod1655 = new BitSet(new long[]{0x0000008001000000L});
    public static final BitSet FOLLOW_ruleRequired_in_ruleMethod1681 = new BitSet(new long[]{0x0000008001000000L});
    public static final BitSet FOLLOW_RULE_METHOD_END_TAG_in_ruleMethod1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XML_TAG_SINGLEEND_in_ruleMethod1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidations_in_entryRuleValidations1758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidations1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VALIDATIONS_START_TAG_in_ruleValidations1804 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_RULE_XML_TAG_END_in_ruleValidations1831 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_ruleCheck_in_ruleValidations1857 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_RULE_VALIDATIONS_END_TAG_in_ruleValidations1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XML_TAG_SINGLEEND_in_ruleValidations1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCheck_in_entryRuleCheck1934 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCheck1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHECK_START_TAG_in_ruleCheck1980 = new BitSet(new long[]{0x0000000000000340L});
    public static final BitSet FOLLOW_ruleNonExpression_in_ruleCheck2009 = new BitSet(new long[]{0x0000000000000340L});
    public static final BitSet FOLLOW_RULE_XML_TAG_END_in_ruleCheck2029 = new BitSet(new long[]{0xF80000000008D200L,0x0000000500000021L});
    public static final BitSet FOLLOW_ruleTopLevel_in_ruleCheck2055 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_RULE_CHECK_END_TAG_in_ruleCheck2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XML_TAG_SINGLEEND_in_ruleCheck2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_entryRuleComment2131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComment2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_START_TAG_in_ruleComment2177 = new BitSet(new long[]{0x0000000000000340L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleComment2206 = new BitSet(new long[]{0x0000000000000340L});
    public static final BitSet FOLLOW_RULE_XML_TAG_END_in_ruleComment2226 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_COMMENT_END_TAG_in_ruleComment2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XML_TAG_SINGLEEND_in_ruleComment2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreak_in_entryRuleBreak2307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBreak2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BREAK_START_TAG_in_ruleBreak2353 = new BitSet(new long[]{0x0000000000000340L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBreak2382 = new BitSet(new long[]{0x0000000000000340L});
    public static final BitSet FOLLOW_RULE_XML_TAG_END_in_ruleBreak2402 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_RULE_BREAK_END_TAG_in_ruleBreak2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XML_TAG_SINGLEEND_in_ruleBreak2447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude2485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INCLUDE_START_TAG_in_ruleInclude2531 = new BitSet(new long[]{0x0000000000000140L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleInclude2552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleInclude2564 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleInclude2575 = new BitSet(new long[]{0x0000000000002E00L});
    public static final BitSet FOLLOW_rulePathElement_in_ruleInclude2595 = new BitSet(new long[]{0x0000000000102E00L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleInclude2607 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_RULE_XML_TAG_END_in_ruleInclude2627 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RULE_INCLUDE_END_TAG_in_ruleInclude2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XML_TAG_SINGLEEND_in_ruleInclude2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage2708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MESSAGE_START_TAG_in_ruleMessage2754 = new BitSet(new long[]{0x0000000000000140L,0x0000000000003E00L});
    public static final BitSet FOLLOW_73_in_ruleMessage2820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleMessage2832 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleMessage2843 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleMessage2859 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleMessage2875 = new BitSet(new long[]{0x0000000000000140L,0x0000000000003E00L});
    public static final BitSet FOLLOW_74_in_ruleMessage2942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleMessage2954 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleMessage2965 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessage2981 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleMessage2997 = new BitSet(new long[]{0x0000000000000140L,0x0000000000003E00L});
    public static final BitSet FOLLOW_75_in_ruleMessage3064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleMessage3076 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleMessage3087 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessage3103 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleMessage3119 = new BitSet(new long[]{0x0000000000000140L,0x0000000000003E00L});
    public static final BitSet FOLLOW_76_in_ruleMessage3186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleMessage3198 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleMessage3209 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMessage3225 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleMessage3241 = new BitSet(new long[]{0x0000000000000140L,0x0000000000003E00L});
    public static final BitSet FOLLOW_77_in_ruleMessage3308 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleMessage3320 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleMessage3331 = new BitSet(new long[]{0xF80000000008D200L,0x0000000500000021L});
    public static final BitSet FOLLOW_ruleTopLevel_in_ruleMessage3351 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleMessage3362 = new BitSet(new long[]{0x0000000000000140L,0x0000000000003E00L});
    public static final BitSet FOLLOW_RULE_XML_TAG_END_in_ruleMessage3421 = new BitSet(new long[]{0x0002AA3AA2200000L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleMessage3448 = new BitSet(new long[]{0x0002AA3AA2200000L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleMessage3475 = new BitSet(new long[]{0x0002AA3AA2200000L});
    public static final BitSet FOLLOW_ruleParam_in_ruleMessage3502 = new BitSet(new long[]{0x0002AA3AA2200000L});
    public static final BitSet FOLLOW_ruleMap_in_ruleMessage3529 = new BitSet(new long[]{0x0002AA3AA2200000L});
    public static final BitSet FOLLOW_ruleMapMethod_in_ruleMessage3556 = new BitSet(new long[]{0x0002AA3AA2200000L});
    public static final BitSet FOLLOW_ruleDebugTag_in_ruleMessage3583 = new BitSet(new long[]{0x0002AA3AA2200000L});
    public static final BitSet FOLLOW_ruleField_in_ruleMessage3610 = new BitSet(new long[]{0x0002AA3AA2200000L});
    public static final BitSet FOLLOW_ruleComment_in_ruleMessage3637 = new BitSet(new long[]{0x0002AA3AA2200000L});
    public static final BitSet FOLLOW_ruleBreak_in_ruleMessage3664 = new BitSet(new long[]{0x0002AA3AA2200000L});
    public static final BitSet FOLLOW_RULE_MESSAGE_END_TAG_in_ruleMessage3683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XML_TAG_SINGLEEND_in_ruleMessage3706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMap_in_entryRuleMap3742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMap3752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MAPSTARTKEYWORD_in_ruleMap3788 = new BitSet(new long[]{0x0000000000000540L,0x000000000001C800L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleMap3809 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleMapId_in_ruleMap3829 = new BitSet(new long[]{0x0000000000000140L,0x000000000001C800L});
    public static final BitSet FOLLOW_78_in_ruleMap3889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleMap3901 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleMap3912 = new BitSet(new long[]{0x0000000000002E00L});
    public static final BitSet FOLLOW_rulePathElement_in_ruleMap3932 = new BitSet(new long[]{0x0000000000102E00L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleMap3944 = new BitSet(new long[]{0x0000000000000140L,0x000000000001C800L});
    public static final BitSet FOLLOW_79_in_ruleMap4011 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleMap4023 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleMap4034 = new BitSet(new long[]{0x0000000000002E00L});
    public static final BitSet FOLLOW_rulePathElement_in_ruleMap4054 = new BitSet(new long[]{0x0000000000102E00L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleMap4066 = new BitSet(new long[]{0x0000000000000140L,0x000000000001C800L});
    public static final BitSet FOLLOW_75_in_ruleMap4133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleMap4145 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleMap4156 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMap4172 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleMap4188 = new BitSet(new long[]{0x0000000000000140L,0x000000000001C800L});
    public static final BitSet FOLLOW_80_in_ruleMap4255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleMap4267 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleMap4278 = new BitSet(new long[]{0xF80000000008D200L,0x0000000500000021L});
    public static final BitSet FOLLOW_ruleTopLevel_in_ruleMap4298 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleMap4309 = new BitSet(new long[]{0x0000000000000140L,0x000000000001C800L});
    public static final BitSet FOLLOW_RULE_XML_TAG_SINGLEEND_in_ruleMap4362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XML_TAG_END_in_ruleMap4385 = new BitSet(new long[]{0x0002AA6AA2200000L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleMap4412 = new BitSet(new long[]{0x0002AA6AA2200000L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleMap4439 = new BitSet(new long[]{0x0002AA6AA2200000L});
    public static final BitSet FOLLOW_ruleParam_in_ruleMap4466 = new BitSet(new long[]{0x0002AA6AA2200000L});
    public static final BitSet FOLLOW_ruleMap_in_ruleMap4493 = new BitSet(new long[]{0x0002AA6AA2200000L});
    public static final BitSet FOLLOW_ruleMapMethod_in_ruleMap4520 = new BitSet(new long[]{0x0002AA6AA2200000L});
    public static final BitSet FOLLOW_ruleDebugTag_in_ruleMap4547 = new BitSet(new long[]{0x0002AA6AA2200000L});
    public static final BitSet FOLLOW_ruleField_in_ruleMap4574 = new BitSet(new long[]{0x0002AA6AA2200000L});
    public static final BitSet FOLLOW_ruleComment_in_ruleMap4601 = new BitSet(new long[]{0x0002AA6AA2200000L});
    public static final BitSet FOLLOW_ruleBreak_in_ruleMap4628 = new BitSet(new long[]{0x0002AA6AA2200000L});
    public static final BitSet FOLLOW_RULE_MAPENDKEYWORD_in_ruleMap4642 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleMap4653 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleMapId_in_ruleMap4673 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_XML_TAG_END_in_ruleMap4692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapId_in_entryRuleMapId4737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapId4748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapId4787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequired_in_entryRuleRequired4831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequired4841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REQUIRED_START_TAG_in_ruleRequired4877 = new BitSet(new long[]{0x0000000000000340L});
    public static final BitSet FOLLOW_ruleNonExpression_in_ruleRequired4906 = new BitSet(new long[]{0x0000000000000340L});
    public static final BitSet FOLLOW_RULE_XML_TAG_SINGLEEND_in_ruleRequired4919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XML_TAG_END_in_ruleRequired4942 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RULE_REQUIRED_END_TAG_in_ruleRequired4964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty5007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty5017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PROPERTY_START_TAG_in_ruleProperty5053 = new BitSet(new long[]{0x0000000000000140L,0x00000000001E3800L});
    public static final BitSet FOLLOW_81_in_ruleProperty5119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleProperty5131 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleProperty5142 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleProperty5158 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleProperty5174 = new BitSet(new long[]{0x0000000000000140L,0x00000000001E3800L});
    public static final BitSet FOLLOW_82_in_ruleProperty5241 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleProperty5253 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleProperty5264 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty5280 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleProperty5296 = new BitSet(new long[]{0x0000000000000140L,0x00000000001E3800L});
    public static final BitSet FOLLOW_83_in_ruleProperty5363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleProperty5375 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleProperty5386 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty5402 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleProperty5418 = new BitSet(new long[]{0x0000000000000140L,0x00000000001E3800L});
    public static final BitSet FOLLOW_84_in_ruleProperty5485 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleProperty5497 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleProperty5508 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty5524 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleProperty5540 = new BitSet(new long[]{0x0000000000000140L,0x00000000001E3800L});
    public static final BitSet FOLLOW_75_in_ruleProperty5607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleProperty5619 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleProperty5630 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty5646 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleProperty5662 = new BitSet(new long[]{0x0000000000000140L,0x00000000001E3800L});
    public static final BitSet FOLLOW_76_in_ruleProperty5729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleProperty5741 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleProperty5752 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProperty5768 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleProperty5784 = new BitSet(new long[]{0x0000000000000140L,0x00000000001E3800L});
    public static final BitSet FOLLOW_77_in_ruleProperty5851 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleProperty5863 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleProperty5874 = new BitSet(new long[]{0xF80000000008D200L,0x0000000500000021L});
    public static final BitSet FOLLOW_ruleTopLevel_in_ruleProperty5894 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleProperty5905 = new BitSet(new long[]{0x0000000000000140L,0x00000000001E3800L});
    public static final BitSet FOLLOW_RULE_XML_TAG_SINGLEEND_in_ruleProperty5957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XML_TAG_END_in_ruleProperty5980 = new BitSet(new long[]{0x0018042000000000L});
    public static final BitSet FOLLOW_ruleExpressionOrOption_in_ruleProperty6007 = new BitSet(new long[]{0x0018042000000000L});
    public static final BitSet FOLLOW_ruleMap_in_ruleProperty6034 = new BitSet(new long[]{0x0018042000000000L});
    public static final BitSet FOLLOW_RULE_PROPERTY_END_TAG_in_ruleProperty6053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_entryRuleParam6096 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParam6106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAM_START_TAG_in_ruleParam6142 = new BitSet(new long[]{0x0000000000000140L,0x0000000000003800L});
    public static final BitSet FOLLOW_75_in_ruleParam6208 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleParam6220 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleParam6231 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParam6247 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleParam6263 = new BitSet(new long[]{0x0000000000000140L,0x0000000000003800L});
    public static final BitSet FOLLOW_76_in_ruleParam6330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleParam6342 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleParam6353 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParam6369 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleParam6385 = new BitSet(new long[]{0x0000000000000140L,0x0000000000003800L});
    public static final BitSet FOLLOW_77_in_ruleParam6452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleParam6464 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleParam6475 = new BitSet(new long[]{0xF80000000008D200L,0x0000000500000021L});
    public static final BitSet FOLLOW_ruleTopLevel_in_ruleParam6495 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleParam6506 = new BitSet(new long[]{0x0000000000000140L,0x0000000000003800L});
    public static final BitSet FOLLOW_RULE_XML_TAG_SINGLEEND_in_ruleParam6558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XML_TAG_END_in_ruleParam6581 = new BitSet(new long[]{0x0018102000000000L});
    public static final BitSet FOLLOW_ruleExpressionOrOption_in_ruleParam6608 = new BitSet(new long[]{0x0018102000000000L});
    public static final BitSet FOLLOW_ruleMap_in_ruleParam6635 = new BitSet(new long[]{0x0018102000000000L});
    public static final BitSet FOLLOW_RULE_PARAM_END_TAG_in_ruleParam6654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapMethod_in_entryRuleMapMethod6697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapMethod6707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MAP_METHOD_STARTTAG_START_in_ruleMapMethod6743 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapMethod6759 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleMapMethod6775 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleAttributeName_in_ruleMapMethod6795 = new BitSet(new long[]{0x0000000000000340L});
    public static final BitSet FOLLOW_ruleNonExpression_in_ruleMapMethod6816 = new BitSet(new long[]{0x0000000000000340L});
    public static final BitSet FOLLOW_RULE_XML_TAG_SINGLEEND_in_ruleMapMethod6829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XML_TAG_END_in_ruleMapMethod6852 = new BitSet(new long[]{0x001AEA2AA2200000L});
    public static final BitSet FOLLOW_ruleExpressionOrOption_in_ruleMapMethod6879 = new BitSet(new long[]{0x001AEA2AA2200000L});
    public static final BitSet FOLLOW_ruleMessage_in_ruleMapMethod6906 = new BitSet(new long[]{0x001AEA2AA2200000L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleMapMethod6933 = new BitSet(new long[]{0x001AEA2AA2200000L});
    public static final BitSet FOLLOW_ruleParam_in_ruleMapMethod6960 = new BitSet(new long[]{0x001AEA2AA2200000L});
    public static final BitSet FOLLOW_ruleMap_in_ruleMapMethod6987 = new BitSet(new long[]{0x001AEA2AA2200000L});
    public static final BitSet FOLLOW_ruleMapMethod_in_ruleMapMethod7014 = new BitSet(new long[]{0x001AEA2AA2200000L});
    public static final BitSet FOLLOW_ruleDebugTag_in_ruleMapMethod7041 = new BitSet(new long[]{0x001AEA2AA2200000L});
    public static final BitSet FOLLOW_ruleField_in_ruleMapMethod7068 = new BitSet(new long[]{0x001AEA2AA2200000L});
    public static final BitSet FOLLOW_ruleComment_in_ruleMapMethod7095 = new BitSet(new long[]{0x001AEA2AA2200000L});
    public static final BitSet FOLLOW_ruleBreak_in_ruleMapMethod7122 = new BitSet(new long[]{0x001AEA2AA2200000L});
    public static final BitSet FOLLOW_RULE_MAP_METHOD_ENDTAG_START_in_ruleMapMethod7141 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapMethod7163 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleMapMethod7179 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapMethod7195 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_XML_TAG_END_in_ruleMapMethod7211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField7248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField7258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FIELD_START_TAG_in_ruleField7294 = new BitSet(new long[]{0x0000000000000140L,0x0000000000213800L});
    public static final BitSet FOLLOW_75_in_ruleField7360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleField7372 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleField7383 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField7399 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleField7415 = new BitSet(new long[]{0x0000000000000140L,0x0000000000213800L});
    public static final BitSet FOLLOW_85_in_ruleField7482 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleField7494 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleField7505 = new BitSet(new long[]{0x00000000001FFE00L,0x0000000000000070L});
    public static final BitSet FOLLOW_ruleGarbage_in_ruleField7525 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleField7536 = new BitSet(new long[]{0x0000000000000140L,0x0000000000213800L});
    public static final BitSet FOLLOW_76_in_ruleField7603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleField7615 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleField7626 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleField7642 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleField7658 = new BitSet(new long[]{0x0000000000000140L,0x0000000000213800L});
    public static final BitSet FOLLOW_77_in_ruleField7725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleField7737 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleField7748 = new BitSet(new long[]{0xF80000000008D200L,0x0000000500000021L});
    public static final BitSet FOLLOW_ruleTopLevel_in_ruleField7768 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleField7779 = new BitSet(new long[]{0x0000000000000140L,0x0000000000213800L});
    public static final BitSet FOLLOW_80_in_ruleField7846 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleField7858 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleField7869 = new BitSet(new long[]{0xF80000000008D200L,0x0000000500000021L});
    public static final BitSet FOLLOW_ruleTopLevel_in_ruleField7889 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleField7900 = new BitSet(new long[]{0x0000000000000140L,0x0000000000213800L});
    public static final BitSet FOLLOW_RULE_XML_TAG_SINGLEEND_in_ruleField7952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XML_TAG_END_in_ruleField7976 = new BitSet(new long[]{0x001BAA2AA2200000L});
    public static final BitSet FOLLOW_ruleExpressionOrOption_in_ruleField8003 = new BitSet(new long[]{0x001BAA2AA2200000L});
    public static final BitSet FOLLOW_ruleParam_in_ruleField8030 = new BitSet(new long[]{0x001BAA2AA2200000L});
    public static final BitSet FOLLOW_ruleMap_in_ruleField8057 = new BitSet(new long[]{0x001BAA2AA2200000L});
    public static final BitSet FOLLOW_ruleMapMethod_in_ruleField8084 = new BitSet(new long[]{0x001BAA2AA2200000L});
    public static final BitSet FOLLOW_ruleDebugTag_in_ruleField8111 = new BitSet(new long[]{0x001BAA2AA2200000L});
    public static final BitSet FOLLOW_ruleComment_in_ruleField8138 = new BitSet(new long[]{0x001BAA2AA2200000L});
    public static final BitSet FOLLOW_ruleBreak_in_ruleField8165 = new BitSet(new long[]{0x001BAA2AA2200000L});
    public static final BitSet FOLLOW_RULE_FIELD_END_TAG_in_ruleField8185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDebugTag_in_entryRuleDebugTag8228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDebugTag8238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DEBUG_START_TAG_in_ruleDebugTag8274 = new BitSet(new long[]{0x0000000000000140L,0x0000000000402000L});
    public static final BitSet FOLLOW_86_in_ruleDebugTag8296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleDebugTag8308 = new BitSet(new long[]{0xF80000000008D200L,0x0000000500000021L});
    public static final BitSet FOLLOW_ruleTopLevel_in_ruleDebugTag8329 = new BitSet(new long[]{0x0000000000000140L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleDebugTag8344 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleDebugTag8356 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleDebugTag8367 = new BitSet(new long[]{0xF80000000008D200L,0x0000000500000021L});
    public static final BitSet FOLLOW_ruleTopLevel_in_ruleDebugTag8387 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleDebugTag8398 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_RULE_XML_TAG_SINGLEEND_in_ruleDebugTag8412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XML_TAG_END_in_ruleDebugTag8435 = new BitSet(new long[]{0xF80400000008D200L,0x0000000500000021L});
    public static final BitSet FOLLOW_ruleTopLevel_in_ruleDebugTag8461 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RULE_DEBUG_END_TAG_in_ruleDebugTag8479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionOrOption_in_entryRuleExpressionOrOption8522 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionOrOption8532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EXPRESSION_START_TAG_in_ruleExpressionOrOption8569 = new BitSet(new long[]{0x0000000000000140L,0x0000000000C02000L});
    public static final BitSet FOLLOW_ruleExpressionTag_in_ruleExpressionOrOption8590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPTION_START_TAG_in_ruleExpressionOrOption8608 = new BitSet(new long[]{0x0000000000000340L});
    public static final BitSet FOLLOW_ruleOption_in_ruleExpressionOrOption8629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpressionTag_in_entryRuleExpressionTag8665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpressionTag8675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleExpressionTag8767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleExpressionTag8779 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleExpressionTag8790 = new BitSet(new long[]{0xF80000000018D200L,0x0000000500000021L});
    public static final BitSet FOLLOW_ruleTopLevel_in_ruleExpressionTag8810 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleExpressionTag8822 = new BitSet(new long[]{0x0000000000000140L,0x0000000000C02000L});
    public static final BitSet FOLLOW_77_in_ruleExpressionTag8889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleExpressionTag8901 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleExpressionTag8912 = new BitSet(new long[]{0xF80000000018D200L,0x0000000500000021L});
    public static final BitSet FOLLOW_ruleTopLevel_in_ruleExpressionTag8932 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleExpressionTag8944 = new BitSet(new long[]{0x0000000000000140L,0x0000000000C02000L});
    public static final BitSet FOLLOW_87_in_ruleExpressionTag9011 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleExpressionTag9023 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleExpressionTag9034 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_ruleExpressionTag9045 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RULE_QUOTE_in_ruleExpressionTag9056 = new BitSet(new long[]{0x0000000000000140L,0x0000000000C02000L});
    public static final BitSet FOLLOW_RULE_XML_TAG_SINGLEEND_in_ruleExpressionTag9108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XML_TAG_END_in_ruleExpressionTag9131 = new BitSet(new long[]{0x00200000000FFE00L,0x0000000000000070L});
    public static final BitSet FOLLOW_ruleGarbage_in_ruleExpressionTag9157 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_RULE_EXPRESSION_END_TAG_in_ruleExpressionTag9174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOption_in_entryRuleOption9217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOption9227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonExpression_in_ruleOption9282 = new BitSet(new long[]{0x0000000000000340L});
    public static final BitSet FOLLOW_RULE_XML_TAG_SINGLEEND_in_ruleOption9295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XML_TAG_END_in_ruleOption9318 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RULE_OPTION_END_TAG_in_ruleOption9340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevel_in_entryRuleTopLevel9383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopLevel9393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleTopLevel9438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathElement_in_entryRulePathElement9474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathElement9485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePathElement9525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_rulePathElement9551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARENT_in_rulePathElement9577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TML_SEPARATOR_in_rulePathElement9603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTmlExpression_in_entryRuleTmlExpression9648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTmlExpression9658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SQBRACKET_OPEN_in_ruleTmlExpression9694 = new BitSet(new long[]{0x0000000000022E00L});
    public static final BitSet FOLLOW_RULE_TML_SEPARATOR_in_ruleTmlExpression9710 = new BitSet(new long[]{0x0000000000022E00L});
    public static final BitSet FOLLOW_RULE_AT_in_ruleTmlExpression9733 = new BitSet(new long[]{0x0000000000002E00L});
    public static final BitSet FOLLOW_rulePathElement_in_ruleTmlExpression9760 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_RULE_TML_SEPARATOR_in_ruleTmlExpression9772 = new BitSet(new long[]{0x0000000000002E00L});
    public static final BitSet FOLLOW_rulePathElement_in_ruleTmlExpression9792 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_RULE_SQBRACKET_CLOSE_in_ruleTmlExpression9805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExistsTmlExpression_in_entryRuleExistsTmlExpression9840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExistsTmlExpression9850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TML_EXISTS_in_ruleExistsTmlExpression9886 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_SQBRACKET_OPEN_in_ruleExistsTmlExpression9896 = new BitSet(new long[]{0x0000000000022E00L});
    public static final BitSet FOLLOW_RULE_TML_SEPARATOR_in_ruleExistsTmlExpression9912 = new BitSet(new long[]{0x0000000000022E00L});
    public static final BitSet FOLLOW_RULE_AT_in_ruleExistsTmlExpression9935 = new BitSet(new long[]{0x0000000000002E00L});
    public static final BitSet FOLLOW_rulePathElement_in_ruleExistsTmlExpression9962 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_RULE_TML_SEPARATOR_in_ruleExistsTmlExpression9974 = new BitSet(new long[]{0x0000000000002E00L});
    public static final BitSet FOLLOW_rulePathElement_in_ruleExistsTmlExpression9994 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_RULE_SQBRACKET_CLOSE_in_ruleExistsTmlExpression10007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapReferenceParams_in_entryRuleMapReferenceParams10042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapReferenceParams10052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleMapReferenceParams10089 = new BitSet(new long[]{0xF80000000008D200L,0x0000000400000001L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleMapReferenceParams10110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000050L});
    public static final BitSet FOLLOW_68_in_ruleMapReferenceParams10123 = new BitSet(new long[]{0xF80000000008D200L,0x0000000400000001L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleMapReferenceParams10144 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000050L});
    public static final BitSet FOLLOW_70_in_ruleMapReferenceParams10158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapGetReference_in_entryRuleMapGetReference10194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapGetReference10204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOLLAR_in_ruleMapGetReference10246 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_RULE_PARENT_in_ruleMapGetReference10269 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_TML_SEPARATOR_in_ruleMapGetReference10285 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapGetReference10303 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleMapReferenceParams_in_ruleMapGetReference10329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression10366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression10376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression10422 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleOrExpression10441 = new BitSet(new long[]{0xF80000000008D200L,0x0000000500000021L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression10475 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression10513 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression10523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_ruleAndExpression10569 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_ruleAndExpression10588 = new BitSet(new long[]{0xF80000000008D200L,0x0000000500000021L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_ruleAndExpression10622 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression10660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualityExpression10670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleEqualityExpression10716 = new BitSet(new long[]{0x0000000000000002L,0x0000000018000000L});
    public static final BitSet FOLLOW_91_in_ruleEqualityExpression10736 = new BitSet(new long[]{0xF80000000008D200L,0x0000000500000021L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleEqualityExpression10770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleEqualityExpression10796 = new BitSet(new long[]{0xF80000000008D200L,0x0000000500000021L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleEqualityExpression10830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression10869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpression10879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression10934 = new BitSet(new long[]{0x0780000000000002L});
    public static final BitSet FOLLOW_RULE_XML_LT_in_ruleRelationalExpression10953 = new BitSet(new long[]{0xF80000000008D200L,0x0000000500000021L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression10979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XML_GT_in_ruleRelationalExpression11004 = new BitSet(new long[]{0xF80000000008D200L,0x0000000500000021L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression11030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XML_LTEQ_in_ruleRelationalExpression11055 = new BitSet(new long[]{0xF80000000008D200L,0x0000000500000021L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression11081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XML_GTEQ_in_ruleRelationalExpression11106 = new BitSet(new long[]{0xF80000000008D200L,0x0000000500000021L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression11132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression11171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression11181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression11227 = new BitSet(new long[]{0x0000000000000002L,0x0000000060000000L});
    public static final BitSet FOLLOW_93_in_ruleAdditiveExpression11241 = new BitSet(new long[]{0xF80000000008D200L,0x0000000500000021L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression11262 = new BitSet(new long[]{0x0000000000000002L,0x0000000060000000L});
    public static final BitSet FOLLOW_94_in_ruleAdditiveExpression11282 = new BitSet(new long[]{0xF80000000008D200L,0x0000000500000021L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression11303 = new BitSet(new long[]{0x0000000000000002L,0x0000000060000000L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression11342 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpression11352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultiplicativeExpression11398 = new BitSet(new long[]{0x0000000000002002L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_ruleMultiplicativeExpression11418 = new BitSet(new long[]{0xF80000000008D200L,0x0000000500000021L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultiplicativeExpression11452 = new BitSet(new long[]{0x0000000000002002L,0x0000000080000000L});
    public static final BitSet FOLLOW_RULE_TML_SEPARATOR_in_ruleMultiplicativeExpression11477 = new BitSet(new long[]{0xF80000000008D200L,0x0000000500000021L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultiplicativeExpression11503 = new BitSet(new long[]{0x0000000000002002L,0x0000000080000000L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression11542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression11552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleUnaryExpression11596 = new BitSet(new long[]{0xF80000000008D200L,0x0000000500000021L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleUnaryExpression11630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleUnaryExpression11659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression11694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression11704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimaryExpression11750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rulePrimaryExpression11769 = new BitSet(new long[]{0xF80000000008D200L,0x0000000500000021L});
    public static final BitSet FOLLOW_ruleOrExpression_in_rulePrimaryExpression11790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_rulePrimaryExpression11802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionName_in_entryRuleFunctionName11840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionName11851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionName11890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall11934 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall11944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionName_in_ruleFunctionCall11990 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleFunctionCall12002 = new BitSet(new long[]{0xF80000000008D200L,0x0000000500000071L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleFunctionCall12023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000050L});
    public static final BitSet FOLLOW_68_in_ruleFunctionCall12037 = new BitSet(new long[]{0xF80000000008D200L,0x0000000500000021L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleFunctionCall12058 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000050L});
    public static final BitSet FOLLOW_70_in_ruleFunctionCall12072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateLiteral_in_entryRuleDateLiteral12108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateLiteral12118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleDateLiteral12163 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_ruleDateLiteral12174 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleDateLiteral12185 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_ruleDateLiteral12196 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleDateLiteral12207 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_ruleDateLiteral12218 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleDateLiteral12229 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_ruleDateLiteral12240 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleDateLiteral12251 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_ruleDateLiteral12262 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleDateLiteral12273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral12308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral12318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleLiteral12364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LITERALSTRING_in_ruleLiteral12387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FORALL_in_ruleLiteral12416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleLiteral12433 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_RULE_LITERALSTRING_in_ruleLiteral12450 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleLiteral12467 = new BitSet(new long[]{0xF80000000008D200L,0x0000000500000021L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleLiteral12488 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_ruleLiteral12500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_ruleLiteral12528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleLiteral12553 = new BitSet(new long[]{0xF80000000008D200L,0x0000000D00000031L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleLiteral12587 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000010L});
    public static final BitSet FOLLOW_68_in_ruleLiteral12601 = new BitSet(new long[]{0xF80000000008D200L,0x0000000500000021L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleLiteral12622 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000010L});
    public static final BitSet FOLLOW_99_in_ruleLiteral12636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleLiteral12660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TODAY_in_ruleLiteral12688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TRUE_in_ruleLiteral12716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FALSE_in_ruleLiteral12744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTmlExpression_in_ruleLiteral12776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExistsTmlExpression_in_ruleLiteral12803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapGetReference_in_ruleLiteral12830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateLiteral_in_ruleLiteral12857 = new BitSet(new long[]{0x0000000000000002L});

}
