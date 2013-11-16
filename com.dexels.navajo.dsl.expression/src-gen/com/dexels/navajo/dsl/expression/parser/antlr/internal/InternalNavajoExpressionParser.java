package com.dexels.navajo.dsl.expression.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.dexels.navajo.dsl.expression.services.NavajoExpressionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNavajoExpressionParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOT", "RULE_PARENT", "RULE_TML_SEPARATOR", "RULE_SQBRACKET_OPEN", "RULE_AT", "RULE_SQBRACKET_CLOSE", "RULE_TML_EXISTS", "RULE_DOLLAR", "RULE_XML_LT", "RULE_XML_GT", "RULE_XML_LTEQ", "RULE_XML_GTEQ", "RULE_NUMBER", "RULE_LITERALSTRING", "RULE_FORALL", "RULE_NULL", "RULE_TODAY", "RULE_TRUE", "RULE_FALSE", "RULE_WS", "RULE_COLON", "'('", "','", "')'", "'OR'", "'AND'", "'=='", "'!='", "'+'", "'-'", "'*'", "'!'", "'#'", "'{'", "'}'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int RULE_PARENT=6;
    public static final int T__27=27;
    public static final int RULE_SQBRACKET_OPEN=8;
    public static final int T__26=26;
    public static final int RULE_XML_LT=13;
    public static final int RULE_LITERALSTRING=18;
    public static final int RULE_XML_GTEQ=16;
    public static final int RULE_TML_SEPARATOR=7;
    public static final int EOF=-1;
    public static final int RULE_NULL=20;
    public static final int RULE_TRUE=22;
    public static final int RULE_FORALL=19;
    public static final int RULE_DOLLAR=12;
    public static final int T__30=30;
    public static final int RULE_COLON=25;
    public static final int T__31=31;
    public static final int RULE_FALSE=23;
    public static final int RULE_TML_EXISTS=11;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int RULE_DOT=5;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_NUMBER=17;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_TODAY=21;
    public static final int RULE_SQBRACKET_CLOSE=10;
    public static final int RULE_XML_LTEQ=15;
    public static final int RULE_WS=24;
    public static final int RULE_XML_GT=14;
    public static final int RULE_AT=9;

    // delegates
    // delegators


        public InternalNavajoExpressionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalNavajoExpressionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalNavajoExpressionParser.tokenNames; }
    public String getGrammarFileName() { return "../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g"; }



     	private NavajoExpressionGrammarAccess grammarAccess;
     	
        public InternalNavajoExpressionParser(TokenStream input, NavajoExpressionGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "TopLevel";	
       	}
       	
       	@Override
       	protected NavajoExpressionGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleTopLevel"
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:67:1: entryRuleTopLevel returns [EObject current=null] : iv_ruleTopLevel= ruleTopLevel EOF ;
    public final EObject entryRuleTopLevel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopLevel = null;


        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:68:2: (iv_ruleTopLevel= ruleTopLevel EOF )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:69:2: iv_ruleTopLevel= ruleTopLevel EOF
            {
             newCompositeNode(grammarAccess.getTopLevelRule()); 
            pushFollow(FOLLOW_ruleTopLevel_in_entryRuleTopLevel75);
            iv_ruleTopLevel=ruleTopLevel();

            state._fsp--;

             current =iv_ruleTopLevel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopLevel85); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:76:1: ruleTopLevel returns [EObject current=null] : ( (lv_toplevelExpression_0_0= ruleOrExpression ) ) ;
    public final EObject ruleTopLevel() throws RecognitionException {
        EObject current = null;

        EObject lv_toplevelExpression_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:79:28: ( ( (lv_toplevelExpression_0_0= ruleOrExpression ) ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:80:1: ( (lv_toplevelExpression_0_0= ruleOrExpression ) )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:80:1: ( (lv_toplevelExpression_0_0= ruleOrExpression ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:81:1: (lv_toplevelExpression_0_0= ruleOrExpression )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:81:1: (lv_toplevelExpression_0_0= ruleOrExpression )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:82:3: lv_toplevelExpression_0_0= ruleOrExpression
            {
             
            	        newCompositeNode(grammarAccess.getTopLevelAccess().getToplevelExpressionOrExpressionParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleOrExpression_in_ruleTopLevel130);
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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:106:1: entryRulePathElement returns [String current=null] : iv_rulePathElement= rulePathElement EOF ;
    public final String entryRulePathElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePathElement = null;


        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:107:2: (iv_rulePathElement= rulePathElement EOF )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:108:2: iv_rulePathElement= rulePathElement EOF
            {
             newCompositeNode(grammarAccess.getPathElementRule()); 
            pushFollow(FOLLOW_rulePathElement_in_entryRulePathElement166);
            iv_rulePathElement=rulePathElement();

            state._fsp--;

             current =iv_rulePathElement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathElement177); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:115:1: rulePathElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_DOT_1= RULE_DOT | this_PARENT_2= RULE_PARENT | this_TML_SEPARATOR_3= RULE_TML_SEPARATOR ) ;
    public final AntlrDatatypeRuleToken rulePathElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_DOT_1=null;
        Token this_PARENT_2=null;
        Token this_TML_SEPARATOR_3=null;

         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:118:28: ( (this_ID_0= RULE_ID | this_DOT_1= RULE_DOT | this_PARENT_2= RULE_PARENT | this_TML_SEPARATOR_3= RULE_TML_SEPARATOR ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:119:1: (this_ID_0= RULE_ID | this_DOT_1= RULE_DOT | this_PARENT_2= RULE_PARENT | this_TML_SEPARATOR_3= RULE_TML_SEPARATOR )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:119:1: (this_ID_0= RULE_ID | this_DOT_1= RULE_DOT | this_PARENT_2= RULE_PARENT | this_TML_SEPARATOR_3= RULE_TML_SEPARATOR )
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
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:119:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePathElement217); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getPathElementAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:127:10: this_DOT_1= RULE_DOT
                    {
                    this_DOT_1=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_rulePathElement243); 

                    		current.merge(this_DOT_1);
                        
                     
                        newLeafNode(this_DOT_1, grammarAccess.getPathElementAccess().getDOTTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:135:10: this_PARENT_2= RULE_PARENT
                    {
                    this_PARENT_2=(Token)match(input,RULE_PARENT,FOLLOW_RULE_PARENT_in_rulePathElement269); 

                    		current.merge(this_PARENT_2);
                        
                     
                        newLeafNode(this_PARENT_2, grammarAccess.getPathElementAccess().getPARENTTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:143:10: this_TML_SEPARATOR_3= RULE_TML_SEPARATOR
                    {
                    this_TML_SEPARATOR_3=(Token)match(input,RULE_TML_SEPARATOR,FOLLOW_RULE_TML_SEPARATOR_in_rulePathElement295); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:158:1: entryRuleTmlExpression returns [EObject current=null] : iv_ruleTmlExpression= ruleTmlExpression EOF ;
    public final EObject entryRuleTmlExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTmlExpression = null;


        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:159:2: (iv_ruleTmlExpression= ruleTmlExpression EOF )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:160:2: iv_ruleTmlExpression= ruleTmlExpression EOF
            {
             newCompositeNode(grammarAccess.getTmlExpressionRule()); 
            pushFollow(FOLLOW_ruleTmlExpression_in_entryRuleTmlExpression340);
            iv_ruleTmlExpression=ruleTmlExpression();

            state._fsp--;

             current =iv_ruleTmlExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTmlExpression350); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:167:1: ruleTmlExpression returns [EObject current=null] : (this_SQBRACKET_OPEN_0= RULE_SQBRACKET_OPEN ( (lv_absolute_1_0= RULE_TML_SEPARATOR ) )? ( (lv_param_2_0= RULE_AT ) )? ( (lv_elements_3_0= rulePathElement ) ) (this_TML_SEPARATOR_4= RULE_TML_SEPARATOR ( (lv_elements_5_0= rulePathElement ) ) )* this_SQBRACKET_CLOSE_6= RULE_SQBRACKET_CLOSE ) ;
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
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:170:28: ( (this_SQBRACKET_OPEN_0= RULE_SQBRACKET_OPEN ( (lv_absolute_1_0= RULE_TML_SEPARATOR ) )? ( (lv_param_2_0= RULE_AT ) )? ( (lv_elements_3_0= rulePathElement ) ) (this_TML_SEPARATOR_4= RULE_TML_SEPARATOR ( (lv_elements_5_0= rulePathElement ) ) )* this_SQBRACKET_CLOSE_6= RULE_SQBRACKET_CLOSE ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:171:1: (this_SQBRACKET_OPEN_0= RULE_SQBRACKET_OPEN ( (lv_absolute_1_0= RULE_TML_SEPARATOR ) )? ( (lv_param_2_0= RULE_AT ) )? ( (lv_elements_3_0= rulePathElement ) ) (this_TML_SEPARATOR_4= RULE_TML_SEPARATOR ( (lv_elements_5_0= rulePathElement ) ) )* this_SQBRACKET_CLOSE_6= RULE_SQBRACKET_CLOSE )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:171:1: (this_SQBRACKET_OPEN_0= RULE_SQBRACKET_OPEN ( (lv_absolute_1_0= RULE_TML_SEPARATOR ) )? ( (lv_param_2_0= RULE_AT ) )? ( (lv_elements_3_0= rulePathElement ) ) (this_TML_SEPARATOR_4= RULE_TML_SEPARATOR ( (lv_elements_5_0= rulePathElement ) ) )* this_SQBRACKET_CLOSE_6= RULE_SQBRACKET_CLOSE )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:171:2: this_SQBRACKET_OPEN_0= RULE_SQBRACKET_OPEN ( (lv_absolute_1_0= RULE_TML_SEPARATOR ) )? ( (lv_param_2_0= RULE_AT ) )? ( (lv_elements_3_0= rulePathElement ) ) (this_TML_SEPARATOR_4= RULE_TML_SEPARATOR ( (lv_elements_5_0= rulePathElement ) ) )* this_SQBRACKET_CLOSE_6= RULE_SQBRACKET_CLOSE
            {
            this_SQBRACKET_OPEN_0=(Token)match(input,RULE_SQBRACKET_OPEN,FOLLOW_RULE_SQBRACKET_OPEN_in_ruleTmlExpression386); 
             
                newLeafNode(this_SQBRACKET_OPEN_0, grammarAccess.getTmlExpressionAccess().getSQBRACKET_OPENTerminalRuleCall_0()); 
                
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:175:1: ( (lv_absolute_1_0= RULE_TML_SEPARATOR ) )?
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:176:1: (lv_absolute_1_0= RULE_TML_SEPARATOR )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:176:1: (lv_absolute_1_0= RULE_TML_SEPARATOR )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:177:3: lv_absolute_1_0= RULE_TML_SEPARATOR
                    {
                    lv_absolute_1_0=(Token)match(input,RULE_TML_SEPARATOR,FOLLOW_RULE_TML_SEPARATOR_in_ruleTmlExpression402); 

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

            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:193:3: ( (lv_param_2_0= RULE_AT ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_AT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:194:1: (lv_param_2_0= RULE_AT )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:194:1: (lv_param_2_0= RULE_AT )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:195:3: lv_param_2_0= RULE_AT
                    {
                    lv_param_2_0=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_ruleTmlExpression425); 

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

            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:211:3: ( (lv_elements_3_0= rulePathElement ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:212:1: (lv_elements_3_0= rulePathElement )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:212:1: (lv_elements_3_0= rulePathElement )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:213:3: lv_elements_3_0= rulePathElement
            {
             
            	        newCompositeNode(grammarAccess.getTmlExpressionAccess().getElementsPathElementParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulePathElement_in_ruleTmlExpression452);
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

            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:229:2: (this_TML_SEPARATOR_4= RULE_TML_SEPARATOR ( (lv_elements_5_0= rulePathElement ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_TML_SEPARATOR) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:229:3: this_TML_SEPARATOR_4= RULE_TML_SEPARATOR ( (lv_elements_5_0= rulePathElement ) )
            	    {
            	    this_TML_SEPARATOR_4=(Token)match(input,RULE_TML_SEPARATOR,FOLLOW_RULE_TML_SEPARATOR_in_ruleTmlExpression464); 
            	     
            	        newLeafNode(this_TML_SEPARATOR_4, grammarAccess.getTmlExpressionAccess().getTML_SEPARATORTerminalRuleCall_4_0()); 
            	        
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:233:1: ( (lv_elements_5_0= rulePathElement ) )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:234:1: (lv_elements_5_0= rulePathElement )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:234:1: (lv_elements_5_0= rulePathElement )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:235:3: lv_elements_5_0= rulePathElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTmlExpressionAccess().getElementsPathElementParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePathElement_in_ruleTmlExpression484);
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
            	    break loop4;
                }
            } while (true);

            this_SQBRACKET_CLOSE_6=(Token)match(input,RULE_SQBRACKET_CLOSE,FOLLOW_RULE_SQBRACKET_CLOSE_in_ruleTmlExpression497); 
             
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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:263:1: entryRuleExistsTmlExpression returns [EObject current=null] : iv_ruleExistsTmlExpression= ruleExistsTmlExpression EOF ;
    public final EObject entryRuleExistsTmlExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistsTmlExpression = null;


        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:264:2: (iv_ruleExistsTmlExpression= ruleExistsTmlExpression EOF )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:265:2: iv_ruleExistsTmlExpression= ruleExistsTmlExpression EOF
            {
             newCompositeNode(grammarAccess.getExistsTmlExpressionRule()); 
            pushFollow(FOLLOW_ruleExistsTmlExpression_in_entryRuleExistsTmlExpression532);
            iv_ruleExistsTmlExpression=ruleExistsTmlExpression();

            state._fsp--;

             current =iv_ruleExistsTmlExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExistsTmlExpression542); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:272:1: ruleExistsTmlExpression returns [EObject current=null] : (this_TML_EXISTS_0= RULE_TML_EXISTS this_SQBRACKET_OPEN_1= RULE_SQBRACKET_OPEN ( (lv_absolute_2_0= RULE_TML_SEPARATOR ) )? ( (lv_param_3_0= RULE_AT ) )? ( (lv_elements_4_0= rulePathElement ) ) (this_TML_SEPARATOR_5= RULE_TML_SEPARATOR ( (lv_elements_6_0= rulePathElement ) ) )* this_SQBRACKET_CLOSE_7= RULE_SQBRACKET_CLOSE ) ;
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
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:275:28: ( (this_TML_EXISTS_0= RULE_TML_EXISTS this_SQBRACKET_OPEN_1= RULE_SQBRACKET_OPEN ( (lv_absolute_2_0= RULE_TML_SEPARATOR ) )? ( (lv_param_3_0= RULE_AT ) )? ( (lv_elements_4_0= rulePathElement ) ) (this_TML_SEPARATOR_5= RULE_TML_SEPARATOR ( (lv_elements_6_0= rulePathElement ) ) )* this_SQBRACKET_CLOSE_7= RULE_SQBRACKET_CLOSE ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:276:1: (this_TML_EXISTS_0= RULE_TML_EXISTS this_SQBRACKET_OPEN_1= RULE_SQBRACKET_OPEN ( (lv_absolute_2_0= RULE_TML_SEPARATOR ) )? ( (lv_param_3_0= RULE_AT ) )? ( (lv_elements_4_0= rulePathElement ) ) (this_TML_SEPARATOR_5= RULE_TML_SEPARATOR ( (lv_elements_6_0= rulePathElement ) ) )* this_SQBRACKET_CLOSE_7= RULE_SQBRACKET_CLOSE )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:276:1: (this_TML_EXISTS_0= RULE_TML_EXISTS this_SQBRACKET_OPEN_1= RULE_SQBRACKET_OPEN ( (lv_absolute_2_0= RULE_TML_SEPARATOR ) )? ( (lv_param_3_0= RULE_AT ) )? ( (lv_elements_4_0= rulePathElement ) ) (this_TML_SEPARATOR_5= RULE_TML_SEPARATOR ( (lv_elements_6_0= rulePathElement ) ) )* this_SQBRACKET_CLOSE_7= RULE_SQBRACKET_CLOSE )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:276:2: this_TML_EXISTS_0= RULE_TML_EXISTS this_SQBRACKET_OPEN_1= RULE_SQBRACKET_OPEN ( (lv_absolute_2_0= RULE_TML_SEPARATOR ) )? ( (lv_param_3_0= RULE_AT ) )? ( (lv_elements_4_0= rulePathElement ) ) (this_TML_SEPARATOR_5= RULE_TML_SEPARATOR ( (lv_elements_6_0= rulePathElement ) ) )* this_SQBRACKET_CLOSE_7= RULE_SQBRACKET_CLOSE
            {
            this_TML_EXISTS_0=(Token)match(input,RULE_TML_EXISTS,FOLLOW_RULE_TML_EXISTS_in_ruleExistsTmlExpression578); 
             
                newLeafNode(this_TML_EXISTS_0, grammarAccess.getExistsTmlExpressionAccess().getTML_EXISTSTerminalRuleCall_0()); 
                
            this_SQBRACKET_OPEN_1=(Token)match(input,RULE_SQBRACKET_OPEN,FOLLOW_RULE_SQBRACKET_OPEN_in_ruleExistsTmlExpression588); 
             
                newLeafNode(this_SQBRACKET_OPEN_1, grammarAccess.getExistsTmlExpressionAccess().getSQBRACKET_OPENTerminalRuleCall_1()); 
                
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:284:1: ( (lv_absolute_2_0= RULE_TML_SEPARATOR ) )?
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:285:1: (lv_absolute_2_0= RULE_TML_SEPARATOR )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:285:1: (lv_absolute_2_0= RULE_TML_SEPARATOR )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:286:3: lv_absolute_2_0= RULE_TML_SEPARATOR
                    {
                    lv_absolute_2_0=(Token)match(input,RULE_TML_SEPARATOR,FOLLOW_RULE_TML_SEPARATOR_in_ruleExistsTmlExpression604); 

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

            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:302:3: ( (lv_param_3_0= RULE_AT ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_AT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:303:1: (lv_param_3_0= RULE_AT )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:303:1: (lv_param_3_0= RULE_AT )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:304:3: lv_param_3_0= RULE_AT
                    {
                    lv_param_3_0=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_ruleExistsTmlExpression627); 

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

            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:320:3: ( (lv_elements_4_0= rulePathElement ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:321:1: (lv_elements_4_0= rulePathElement )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:321:1: (lv_elements_4_0= rulePathElement )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:322:3: lv_elements_4_0= rulePathElement
            {
             
            	        newCompositeNode(grammarAccess.getExistsTmlExpressionAccess().getElementsPathElementParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_rulePathElement_in_ruleExistsTmlExpression654);
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

            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:338:2: (this_TML_SEPARATOR_5= RULE_TML_SEPARATOR ( (lv_elements_6_0= rulePathElement ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_TML_SEPARATOR) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:338:3: this_TML_SEPARATOR_5= RULE_TML_SEPARATOR ( (lv_elements_6_0= rulePathElement ) )
            	    {
            	    this_TML_SEPARATOR_5=(Token)match(input,RULE_TML_SEPARATOR,FOLLOW_RULE_TML_SEPARATOR_in_ruleExistsTmlExpression666); 
            	     
            	        newLeafNode(this_TML_SEPARATOR_5, grammarAccess.getExistsTmlExpressionAccess().getTML_SEPARATORTerminalRuleCall_5_0()); 
            	        
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:342:1: ( (lv_elements_6_0= rulePathElement ) )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:343:1: (lv_elements_6_0= rulePathElement )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:343:1: (lv_elements_6_0= rulePathElement )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:344:3: lv_elements_6_0= rulePathElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExistsTmlExpressionAccess().getElementsPathElementParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePathElement_in_ruleExistsTmlExpression686);
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
            	    break loop7;
                }
            } while (true);

            this_SQBRACKET_CLOSE_7=(Token)match(input,RULE_SQBRACKET_CLOSE,FOLLOW_RULE_SQBRACKET_CLOSE_in_ruleExistsTmlExpression699); 
             
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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:372:1: entryRuleMapReferenceParams returns [EObject current=null] : iv_ruleMapReferenceParams= ruleMapReferenceParams EOF ;
    public final EObject entryRuleMapReferenceParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapReferenceParams = null;


        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:373:2: (iv_ruleMapReferenceParams= ruleMapReferenceParams EOF )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:374:2: iv_ruleMapReferenceParams= ruleMapReferenceParams EOF
            {
             newCompositeNode(grammarAccess.getMapReferenceParamsRule()); 
            pushFollow(FOLLOW_ruleMapReferenceParams_in_entryRuleMapReferenceParams734);
            iv_ruleMapReferenceParams=ruleMapReferenceParams();

            state._fsp--;

             current =iv_ruleMapReferenceParams; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapReferenceParams744); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:381:1: ruleMapReferenceParams returns [EObject current=null] : (otherlv_0= '(' ( (lv_getterParams_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_getterParams_3_0= ruleLiteral ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleMapReferenceParams() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_getterParams_1_0 = null;

        EObject lv_getterParams_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:384:28: ( (otherlv_0= '(' ( (lv_getterParams_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_getterParams_3_0= ruleLiteral ) ) )* otherlv_4= ')' ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:385:1: (otherlv_0= '(' ( (lv_getterParams_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_getterParams_3_0= ruleLiteral ) ) )* otherlv_4= ')' )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:385:1: (otherlv_0= '(' ( (lv_getterParams_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_getterParams_3_0= ruleLiteral ) ) )* otherlv_4= ')' )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:385:3: otherlv_0= '(' ( (lv_getterParams_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_getterParams_3_0= ruleLiteral ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleMapReferenceParams781); 

                	newLeafNode(otherlv_0, grammarAccess.getMapReferenceParamsAccess().getLeftParenthesisKeyword_0());
                
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:389:1: ( (lv_getterParams_1_0= ruleLiteral ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:390:1: (lv_getterParams_1_0= ruleLiteral )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:390:1: (lv_getterParams_1_0= ruleLiteral )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:391:3: lv_getterParams_1_0= ruleLiteral
            {
             
            	        newCompositeNode(grammarAccess.getMapReferenceParamsAccess().getGetterParamsLiteralParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleLiteral_in_ruleMapReferenceParams802);
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

            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:407:2: (otherlv_2= ',' ( (lv_getterParams_3_0= ruleLiteral ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==27) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:407:4: otherlv_2= ',' ( (lv_getterParams_3_0= ruleLiteral ) )
            	    {
            	    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleMapReferenceParams815); 

            	        	newLeafNode(otherlv_2, grammarAccess.getMapReferenceParamsAccess().getCommaKeyword_2_0());
            	        
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:411:1: ( (lv_getterParams_3_0= ruleLiteral ) )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:412:1: (lv_getterParams_3_0= ruleLiteral )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:412:1: (lv_getterParams_3_0= ruleLiteral )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:413:3: lv_getterParams_3_0= ruleLiteral
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMapReferenceParamsAccess().getGetterParamsLiteralParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLiteral_in_ruleMapReferenceParams836);
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
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleMapReferenceParams850); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:441:1: entryRuleMapGetReference returns [EObject current=null] : iv_ruleMapGetReference= ruleMapGetReference EOF ;
    public final EObject entryRuleMapGetReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapGetReference = null;


        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:442:2: (iv_ruleMapGetReference= ruleMapGetReference EOF )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:443:2: iv_ruleMapGetReference= ruleMapGetReference EOF
            {
             newCompositeNode(grammarAccess.getMapGetReferenceRule()); 
            pushFollow(FOLLOW_ruleMapGetReference_in_entryRuleMapGetReference886);
            iv_ruleMapGetReference=ruleMapGetReference();

            state._fsp--;

             current =iv_ruleMapGetReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapGetReference896); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:450:1: ruleMapGetReference returns [EObject current=null] : ( ( (lv_operations_0_0= RULE_DOLLAR ) ) ( ( (lv_elements_1_0= RULE_PARENT ) ) this_TML_SEPARATOR_2= RULE_TML_SEPARATOR )* ( (lv_elements_3_0= RULE_ID ) ) ( (lv_referenceParams_4_0= ruleMapReferenceParams ) )? ) ;
    public final EObject ruleMapGetReference() throws RecognitionException {
        EObject current = null;

        Token lv_operations_0_0=null;
        Token lv_elements_1_0=null;
        Token this_TML_SEPARATOR_2=null;
        Token lv_elements_3_0=null;
        EObject lv_referenceParams_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:453:28: ( ( ( (lv_operations_0_0= RULE_DOLLAR ) ) ( ( (lv_elements_1_0= RULE_PARENT ) ) this_TML_SEPARATOR_2= RULE_TML_SEPARATOR )* ( (lv_elements_3_0= RULE_ID ) ) ( (lv_referenceParams_4_0= ruleMapReferenceParams ) )? ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:454:1: ( ( (lv_operations_0_0= RULE_DOLLAR ) ) ( ( (lv_elements_1_0= RULE_PARENT ) ) this_TML_SEPARATOR_2= RULE_TML_SEPARATOR )* ( (lv_elements_3_0= RULE_ID ) ) ( (lv_referenceParams_4_0= ruleMapReferenceParams ) )? )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:454:1: ( ( (lv_operations_0_0= RULE_DOLLAR ) ) ( ( (lv_elements_1_0= RULE_PARENT ) ) this_TML_SEPARATOR_2= RULE_TML_SEPARATOR )* ( (lv_elements_3_0= RULE_ID ) ) ( (lv_referenceParams_4_0= ruleMapReferenceParams ) )? )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:454:2: ( (lv_operations_0_0= RULE_DOLLAR ) ) ( ( (lv_elements_1_0= RULE_PARENT ) ) this_TML_SEPARATOR_2= RULE_TML_SEPARATOR )* ( (lv_elements_3_0= RULE_ID ) ) ( (lv_referenceParams_4_0= ruleMapReferenceParams ) )?
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:454:2: ( (lv_operations_0_0= RULE_DOLLAR ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:455:1: (lv_operations_0_0= RULE_DOLLAR )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:455:1: (lv_operations_0_0= RULE_DOLLAR )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:456:3: lv_operations_0_0= RULE_DOLLAR
            {
            lv_operations_0_0=(Token)match(input,RULE_DOLLAR,FOLLOW_RULE_DOLLAR_in_ruleMapGetReference938); 

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

            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:472:2: ( ( (lv_elements_1_0= RULE_PARENT ) ) this_TML_SEPARATOR_2= RULE_TML_SEPARATOR )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_PARENT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:472:3: ( (lv_elements_1_0= RULE_PARENT ) ) this_TML_SEPARATOR_2= RULE_TML_SEPARATOR
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:472:3: ( (lv_elements_1_0= RULE_PARENT ) )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:473:1: (lv_elements_1_0= RULE_PARENT )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:473:1: (lv_elements_1_0= RULE_PARENT )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:474:3: lv_elements_1_0= RULE_PARENT
            	    {
            	    lv_elements_1_0=(Token)match(input,RULE_PARENT,FOLLOW_RULE_PARENT_in_ruleMapGetReference961); 

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

            	    this_TML_SEPARATOR_2=(Token)match(input,RULE_TML_SEPARATOR,FOLLOW_RULE_TML_SEPARATOR_in_ruleMapGetReference977); 
            	     
            	        newLeafNode(this_TML_SEPARATOR_2, grammarAccess.getMapGetReferenceAccess().getTML_SEPARATORTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:494:3: ( (lv_elements_3_0= RULE_ID ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:495:1: (lv_elements_3_0= RULE_ID )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:495:1: (lv_elements_3_0= RULE_ID )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:496:3: lv_elements_3_0= RULE_ID
            {
            lv_elements_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapGetReference995); 

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

            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:512:2: ( (lv_referenceParams_4_0= ruleMapReferenceParams ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:513:1: (lv_referenceParams_4_0= ruleMapReferenceParams )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:513:1: (lv_referenceParams_4_0= ruleMapReferenceParams )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:514:3: lv_referenceParams_4_0= ruleMapReferenceParams
                    {
                     
                    	        newCompositeNode(grammarAccess.getMapGetReferenceAccess().getReferenceParamsMapReferenceParamsParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMapReferenceParams_in_ruleMapGetReference1021);
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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:538:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:539:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:540:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression1058);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;

             current =iv_ruleOrExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression1068); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:547:1: ruleOrExpression returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleAndExpression ) ) ( ( (lv_operations_1_0= 'OR' ) ) ( (lv_parameters_2_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operations_1_0=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:550:28: ( ( ( (lv_parameters_0_0= ruleAndExpression ) ) ( ( (lv_operations_1_0= 'OR' ) ) ( (lv_parameters_2_0= ruleAndExpression ) ) )* ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:551:1: ( ( (lv_parameters_0_0= ruleAndExpression ) ) ( ( (lv_operations_1_0= 'OR' ) ) ( (lv_parameters_2_0= ruleAndExpression ) ) )* )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:551:1: ( ( (lv_parameters_0_0= ruleAndExpression ) ) ( ( (lv_operations_1_0= 'OR' ) ) ( (lv_parameters_2_0= ruleAndExpression ) ) )* )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:551:2: ( (lv_parameters_0_0= ruleAndExpression ) ) ( ( (lv_operations_1_0= 'OR' ) ) ( (lv_parameters_2_0= ruleAndExpression ) ) )*
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:551:2: ( (lv_parameters_0_0= ruleAndExpression ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:552:1: (lv_parameters_0_0= ruleAndExpression )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:552:1: (lv_parameters_0_0= ruleAndExpression )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:553:3: lv_parameters_0_0= ruleAndExpression
            {
             
            	        newCompositeNode(grammarAccess.getOrExpressionAccess().getParametersAndExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression1114);
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

            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:569:2: ( ( (lv_operations_1_0= 'OR' ) ) ( (lv_parameters_2_0= ruleAndExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==29) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:569:3: ( (lv_operations_1_0= 'OR' ) ) ( (lv_parameters_2_0= ruleAndExpression ) )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:569:3: ( (lv_operations_1_0= 'OR' ) )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:570:1: (lv_operations_1_0= 'OR' )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:570:1: (lv_operations_1_0= 'OR' )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:571:3: lv_operations_1_0= 'OR'
            	    {
            	    lv_operations_1_0=(Token)match(input,29,FOLLOW_29_in_ruleOrExpression1133); 

            	            newLeafNode(lv_operations_1_0, grammarAccess.getOrExpressionAccess().getOperationsORKeyword_1_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOrExpressionRule());
            	    	        }
            	           		addWithLastConsumed(current, "operations", lv_operations_1_0, "OR");
            	    	    

            	    }


            	    }

            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:584:2: ( (lv_parameters_2_0= ruleAndExpression ) )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:585:1: (lv_parameters_2_0= ruleAndExpression )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:585:1: (lv_parameters_2_0= ruleAndExpression )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:586:3: lv_parameters_2_0= ruleAndExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrExpressionAccess().getParametersAndExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression1167);
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
            	    break loop11;
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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:610:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:611:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:612:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression1205);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression1215); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:619:1: ruleAndExpression returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleEqualityExpression ) ) ( ( (lv_operations_1_0= 'AND' ) ) ( (lv_parameters_2_0= ruleEqualityExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operations_1_0=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:622:28: ( ( ( (lv_parameters_0_0= ruleEqualityExpression ) ) ( ( (lv_operations_1_0= 'AND' ) ) ( (lv_parameters_2_0= ruleEqualityExpression ) ) )* ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:623:1: ( ( (lv_parameters_0_0= ruleEqualityExpression ) ) ( ( (lv_operations_1_0= 'AND' ) ) ( (lv_parameters_2_0= ruleEqualityExpression ) ) )* )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:623:1: ( ( (lv_parameters_0_0= ruleEqualityExpression ) ) ( ( (lv_operations_1_0= 'AND' ) ) ( (lv_parameters_2_0= ruleEqualityExpression ) ) )* )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:623:2: ( (lv_parameters_0_0= ruleEqualityExpression ) ) ( ( (lv_operations_1_0= 'AND' ) ) ( (lv_parameters_2_0= ruleEqualityExpression ) ) )*
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:623:2: ( (lv_parameters_0_0= ruleEqualityExpression ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:624:1: (lv_parameters_0_0= ruleEqualityExpression )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:624:1: (lv_parameters_0_0= ruleEqualityExpression )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:625:3: lv_parameters_0_0= ruleEqualityExpression
            {
             
            	        newCompositeNode(grammarAccess.getAndExpressionAccess().getParametersEqualityExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEqualityExpression_in_ruleAndExpression1261);
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

            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:641:2: ( ( (lv_operations_1_0= 'AND' ) ) ( (lv_parameters_2_0= ruleEqualityExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==30) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:641:3: ( (lv_operations_1_0= 'AND' ) ) ( (lv_parameters_2_0= ruleEqualityExpression ) )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:641:3: ( (lv_operations_1_0= 'AND' ) )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:642:1: (lv_operations_1_0= 'AND' )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:642:1: (lv_operations_1_0= 'AND' )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:643:3: lv_operations_1_0= 'AND'
            	    {
            	    lv_operations_1_0=(Token)match(input,30,FOLLOW_30_in_ruleAndExpression1280); 

            	            newLeafNode(lv_operations_1_0, grammarAccess.getAndExpressionAccess().getOperationsANDKeyword_1_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAndExpressionRule());
            	    	        }
            	           		addWithLastConsumed(current, "operations", lv_operations_1_0, "AND");
            	    	    

            	    }


            	    }

            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:656:2: ( (lv_parameters_2_0= ruleEqualityExpression ) )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:657:1: (lv_parameters_2_0= ruleEqualityExpression )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:657:1: (lv_parameters_2_0= ruleEqualityExpression )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:658:3: lv_parameters_2_0= ruleEqualityExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndExpressionAccess().getParametersEqualityExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEqualityExpression_in_ruleAndExpression1314);
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
            	    break loop12;
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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:682:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:683:2: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:684:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
            {
             newCompositeNode(grammarAccess.getEqualityExpressionRule()); 
            pushFollow(FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression1352);
            iv_ruleEqualityExpression=ruleEqualityExpression();

            state._fsp--;

             current =iv_ruleEqualityExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualityExpression1362); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:691:1: ruleEqualityExpression returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleRelationalExpression ) ) ( ( ( (lv_operations_1_0= '==' ) ) ( (lv_parameters_2_0= ruleRelationalExpression ) ) ) | ( ( (lv_operations_3_0= '!=' ) ) ( (lv_parameters_4_0= ruleRelationalExpression ) ) ) )? ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operations_1_0=null;
        Token lv_operations_3_0=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:694:28: ( ( ( (lv_parameters_0_0= ruleRelationalExpression ) ) ( ( ( (lv_operations_1_0= '==' ) ) ( (lv_parameters_2_0= ruleRelationalExpression ) ) ) | ( ( (lv_operations_3_0= '!=' ) ) ( (lv_parameters_4_0= ruleRelationalExpression ) ) ) )? ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:695:1: ( ( (lv_parameters_0_0= ruleRelationalExpression ) ) ( ( ( (lv_operations_1_0= '==' ) ) ( (lv_parameters_2_0= ruleRelationalExpression ) ) ) | ( ( (lv_operations_3_0= '!=' ) ) ( (lv_parameters_4_0= ruleRelationalExpression ) ) ) )? )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:695:1: ( ( (lv_parameters_0_0= ruleRelationalExpression ) ) ( ( ( (lv_operations_1_0= '==' ) ) ( (lv_parameters_2_0= ruleRelationalExpression ) ) ) | ( ( (lv_operations_3_0= '!=' ) ) ( (lv_parameters_4_0= ruleRelationalExpression ) ) ) )? )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:695:2: ( (lv_parameters_0_0= ruleRelationalExpression ) ) ( ( ( (lv_operations_1_0= '==' ) ) ( (lv_parameters_2_0= ruleRelationalExpression ) ) ) | ( ( (lv_operations_3_0= '!=' ) ) ( (lv_parameters_4_0= ruleRelationalExpression ) ) ) )?
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:695:2: ( (lv_parameters_0_0= ruleRelationalExpression ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:696:1: (lv_parameters_0_0= ruleRelationalExpression )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:696:1: (lv_parameters_0_0= ruleRelationalExpression )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:697:3: lv_parameters_0_0= ruleRelationalExpression
            {
             
            	        newCompositeNode(grammarAccess.getEqualityExpressionAccess().getParametersRelationalExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleRelationalExpression_in_ruleEqualityExpression1408);
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

            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:713:2: ( ( ( (lv_operations_1_0= '==' ) ) ( (lv_parameters_2_0= ruleRelationalExpression ) ) ) | ( ( (lv_operations_3_0= '!=' ) ) ( (lv_parameters_4_0= ruleRelationalExpression ) ) ) )?
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            else if ( (LA13_0==32) ) {
                alt13=2;
            }
            switch (alt13) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:713:3: ( ( (lv_operations_1_0= '==' ) ) ( (lv_parameters_2_0= ruleRelationalExpression ) ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:713:3: ( ( (lv_operations_1_0= '==' ) ) ( (lv_parameters_2_0= ruleRelationalExpression ) ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:713:4: ( (lv_operations_1_0= '==' ) ) ( (lv_parameters_2_0= ruleRelationalExpression ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:713:4: ( (lv_operations_1_0= '==' ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:714:1: (lv_operations_1_0= '==' )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:714:1: (lv_operations_1_0= '==' )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:715:3: lv_operations_1_0= '=='
                    {
                    lv_operations_1_0=(Token)match(input,31,FOLLOW_31_in_ruleEqualityExpression1428); 

                            newLeafNode(lv_operations_1_0, grammarAccess.getEqualityExpressionAccess().getOperationsEqualsSignEqualsSignKeyword_1_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEqualityExpressionRule());
                    	        }
                           		addWithLastConsumed(current, "operations", lv_operations_1_0, "==");
                    	    

                    }


                    }

                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:728:2: ( (lv_parameters_2_0= ruleRelationalExpression ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:729:1: (lv_parameters_2_0= ruleRelationalExpression )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:729:1: (lv_parameters_2_0= ruleRelationalExpression )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:730:3: lv_parameters_2_0= ruleRelationalExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getEqualityExpressionAccess().getParametersRelationalExpressionParserRuleCall_1_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRelationalExpression_in_ruleEqualityExpression1462);
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
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:747:6: ( ( (lv_operations_3_0= '!=' ) ) ( (lv_parameters_4_0= ruleRelationalExpression ) ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:747:6: ( ( (lv_operations_3_0= '!=' ) ) ( (lv_parameters_4_0= ruleRelationalExpression ) ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:747:7: ( (lv_operations_3_0= '!=' ) ) ( (lv_parameters_4_0= ruleRelationalExpression ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:747:7: ( (lv_operations_3_0= '!=' ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:748:1: (lv_operations_3_0= '!=' )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:748:1: (lv_operations_3_0= '!=' )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:749:3: lv_operations_3_0= '!='
                    {
                    lv_operations_3_0=(Token)match(input,32,FOLLOW_32_in_ruleEqualityExpression1488); 

                            newLeafNode(lv_operations_3_0, grammarAccess.getEqualityExpressionAccess().getOperationsExclamationMarkEqualsSignKeyword_1_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEqualityExpressionRule());
                    	        }
                           		addWithLastConsumed(current, "operations", lv_operations_3_0, "!=");
                    	    

                    }


                    }

                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:762:2: ( (lv_parameters_4_0= ruleRelationalExpression ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:763:1: (lv_parameters_4_0= ruleRelationalExpression )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:763:1: (lv_parameters_4_0= ruleRelationalExpression )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:764:3: lv_parameters_4_0= ruleRelationalExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getEqualityExpressionAccess().getParametersRelationalExpressionParserRuleCall_1_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRelationalExpression_in_ruleEqualityExpression1522);
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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:788:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:789:2: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:790:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
             newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            pushFollow(FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression1561);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;

             current =iv_ruleRelationalExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpression1571); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:797:1: ruleRelationalExpression returns [EObject current=null] : ( () ( (lv_parameters_1_0= ruleAdditiveExpression ) ) ( ( ( (lv_operations_2_0= RULE_XML_LT ) ) ( (lv_parameters_3_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_4_0= RULE_XML_GT ) ) ( (lv_parameters_5_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_6_0= RULE_XML_LTEQ ) ) ( (lv_parameters_7_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_8_0= RULE_XML_GTEQ ) ) ( (lv_parameters_9_0= ruleAdditiveExpression ) ) ) )? ) ;
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
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:800:28: ( ( () ( (lv_parameters_1_0= ruleAdditiveExpression ) ) ( ( ( (lv_operations_2_0= RULE_XML_LT ) ) ( (lv_parameters_3_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_4_0= RULE_XML_GT ) ) ( (lv_parameters_5_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_6_0= RULE_XML_LTEQ ) ) ( (lv_parameters_7_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_8_0= RULE_XML_GTEQ ) ) ( (lv_parameters_9_0= ruleAdditiveExpression ) ) ) )? ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:801:1: ( () ( (lv_parameters_1_0= ruleAdditiveExpression ) ) ( ( ( (lv_operations_2_0= RULE_XML_LT ) ) ( (lv_parameters_3_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_4_0= RULE_XML_GT ) ) ( (lv_parameters_5_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_6_0= RULE_XML_LTEQ ) ) ( (lv_parameters_7_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_8_0= RULE_XML_GTEQ ) ) ( (lv_parameters_9_0= ruleAdditiveExpression ) ) ) )? )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:801:1: ( () ( (lv_parameters_1_0= ruleAdditiveExpression ) ) ( ( ( (lv_operations_2_0= RULE_XML_LT ) ) ( (lv_parameters_3_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_4_0= RULE_XML_GT ) ) ( (lv_parameters_5_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_6_0= RULE_XML_LTEQ ) ) ( (lv_parameters_7_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_8_0= RULE_XML_GTEQ ) ) ( (lv_parameters_9_0= ruleAdditiveExpression ) ) ) )? )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:801:2: () ( (lv_parameters_1_0= ruleAdditiveExpression ) ) ( ( ( (lv_operations_2_0= RULE_XML_LT ) ) ( (lv_parameters_3_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_4_0= RULE_XML_GT ) ) ( (lv_parameters_5_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_6_0= RULE_XML_LTEQ ) ) ( (lv_parameters_7_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_8_0= RULE_XML_GTEQ ) ) ( (lv_parameters_9_0= ruleAdditiveExpression ) ) ) )?
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:801:2: ()
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:802:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRelationalExpressionAccess().getExpressionAction_0(),
                        current);
                

            }

            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:807:2: ( (lv_parameters_1_0= ruleAdditiveExpression ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:808:1: (lv_parameters_1_0= ruleAdditiveExpression )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:808:1: (lv_parameters_1_0= ruleAdditiveExpression )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:809:3: lv_parameters_1_0= ruleAdditiveExpression
            {
             
            	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getParametersAdditiveExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression1626);
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

            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:825:2: ( ( ( (lv_operations_2_0= RULE_XML_LT ) ) ( (lv_parameters_3_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_4_0= RULE_XML_GT ) ) ( (lv_parameters_5_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_6_0= RULE_XML_LTEQ ) ) ( (lv_parameters_7_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_8_0= RULE_XML_GTEQ ) ) ( (lv_parameters_9_0= ruleAdditiveExpression ) ) ) )?
            int alt14=5;
            switch ( input.LA(1) ) {
                case RULE_XML_LT:
                    {
                    alt14=1;
                    }
                    break;
                case RULE_XML_GT:
                    {
                    alt14=2;
                    }
                    break;
                case RULE_XML_LTEQ:
                    {
                    alt14=3;
                    }
                    break;
                case RULE_XML_GTEQ:
                    {
                    alt14=4;
                    }
                    break;
            }

            switch (alt14) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:825:3: ( ( (lv_operations_2_0= RULE_XML_LT ) ) ( (lv_parameters_3_0= ruleAdditiveExpression ) ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:825:3: ( ( (lv_operations_2_0= RULE_XML_LT ) ) ( (lv_parameters_3_0= ruleAdditiveExpression ) ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:825:4: ( (lv_operations_2_0= RULE_XML_LT ) ) ( (lv_parameters_3_0= ruleAdditiveExpression ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:825:4: ( (lv_operations_2_0= RULE_XML_LT ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:826:1: (lv_operations_2_0= RULE_XML_LT )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:826:1: (lv_operations_2_0= RULE_XML_LT )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:827:3: lv_operations_2_0= RULE_XML_LT
                    {
                    lv_operations_2_0=(Token)match(input,RULE_XML_LT,FOLLOW_RULE_XML_LT_in_ruleRelationalExpression1645); 

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

                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:843:2: ( (lv_parameters_3_0= ruleAdditiveExpression ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:844:1: (lv_parameters_3_0= ruleAdditiveExpression )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:844:1: (lv_parameters_3_0= ruleAdditiveExpression )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:845:3: lv_parameters_3_0= ruleAdditiveExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getParametersAdditiveExpressionParserRuleCall_2_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression1671);
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
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:862:6: ( ( (lv_operations_4_0= RULE_XML_GT ) ) ( (lv_parameters_5_0= ruleAdditiveExpression ) ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:862:6: ( ( (lv_operations_4_0= RULE_XML_GT ) ) ( (lv_parameters_5_0= ruleAdditiveExpression ) ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:862:7: ( (lv_operations_4_0= RULE_XML_GT ) ) ( (lv_parameters_5_0= ruleAdditiveExpression ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:862:7: ( (lv_operations_4_0= RULE_XML_GT ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:863:1: (lv_operations_4_0= RULE_XML_GT )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:863:1: (lv_operations_4_0= RULE_XML_GT )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:864:3: lv_operations_4_0= RULE_XML_GT
                    {
                    lv_operations_4_0=(Token)match(input,RULE_XML_GT,FOLLOW_RULE_XML_GT_in_ruleRelationalExpression1696); 

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

                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:880:2: ( (lv_parameters_5_0= ruleAdditiveExpression ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:881:1: (lv_parameters_5_0= ruleAdditiveExpression )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:881:1: (lv_parameters_5_0= ruleAdditiveExpression )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:882:3: lv_parameters_5_0= ruleAdditiveExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getParametersAdditiveExpressionParserRuleCall_2_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression1722);
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
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:899:6: ( ( (lv_operations_6_0= RULE_XML_LTEQ ) ) ( (lv_parameters_7_0= ruleAdditiveExpression ) ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:899:6: ( ( (lv_operations_6_0= RULE_XML_LTEQ ) ) ( (lv_parameters_7_0= ruleAdditiveExpression ) ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:899:7: ( (lv_operations_6_0= RULE_XML_LTEQ ) ) ( (lv_parameters_7_0= ruleAdditiveExpression ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:899:7: ( (lv_operations_6_0= RULE_XML_LTEQ ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:900:1: (lv_operations_6_0= RULE_XML_LTEQ )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:900:1: (lv_operations_6_0= RULE_XML_LTEQ )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:901:3: lv_operations_6_0= RULE_XML_LTEQ
                    {
                    lv_operations_6_0=(Token)match(input,RULE_XML_LTEQ,FOLLOW_RULE_XML_LTEQ_in_ruleRelationalExpression1747); 

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

                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:917:2: ( (lv_parameters_7_0= ruleAdditiveExpression ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:918:1: (lv_parameters_7_0= ruleAdditiveExpression )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:918:1: (lv_parameters_7_0= ruleAdditiveExpression )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:919:3: lv_parameters_7_0= ruleAdditiveExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getParametersAdditiveExpressionParserRuleCall_2_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression1773);
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
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:936:6: ( ( (lv_operations_8_0= RULE_XML_GTEQ ) ) ( (lv_parameters_9_0= ruleAdditiveExpression ) ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:936:6: ( ( (lv_operations_8_0= RULE_XML_GTEQ ) ) ( (lv_parameters_9_0= ruleAdditiveExpression ) ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:936:7: ( (lv_operations_8_0= RULE_XML_GTEQ ) ) ( (lv_parameters_9_0= ruleAdditiveExpression ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:936:7: ( (lv_operations_8_0= RULE_XML_GTEQ ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:937:1: (lv_operations_8_0= RULE_XML_GTEQ )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:937:1: (lv_operations_8_0= RULE_XML_GTEQ )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:938:3: lv_operations_8_0= RULE_XML_GTEQ
                    {
                    lv_operations_8_0=(Token)match(input,RULE_XML_GTEQ,FOLLOW_RULE_XML_GTEQ_in_ruleRelationalExpression1798); 

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

                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:954:2: ( (lv_parameters_9_0= ruleAdditiveExpression ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:955:1: (lv_parameters_9_0= ruleAdditiveExpression )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:955:1: (lv_parameters_9_0= ruleAdditiveExpression )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:956:3: lv_parameters_9_0= ruleAdditiveExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getParametersAdditiveExpressionParserRuleCall_2_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression1824);
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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:980:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:981:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:982:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
             newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression1863);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;

             current =iv_ruleAdditiveExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpression1873); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:989:1: ruleAdditiveExpression returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleMultiplicativeExpression ) ) ( (otherlv_1= '+' ( (lv_parameters_2_0= ruleMultiplicativeExpression ) ) ) | (otherlv_3= '-' ( (lv_parameters_4_0= ruleMultiplicativeExpression ) ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:992:28: ( ( ( (lv_parameters_0_0= ruleMultiplicativeExpression ) ) ( (otherlv_1= '+' ( (lv_parameters_2_0= ruleMultiplicativeExpression ) ) ) | (otherlv_3= '-' ( (lv_parameters_4_0= ruleMultiplicativeExpression ) ) ) )* ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:993:1: ( ( (lv_parameters_0_0= ruleMultiplicativeExpression ) ) ( (otherlv_1= '+' ( (lv_parameters_2_0= ruleMultiplicativeExpression ) ) ) | (otherlv_3= '-' ( (lv_parameters_4_0= ruleMultiplicativeExpression ) ) ) )* )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:993:1: ( ( (lv_parameters_0_0= ruleMultiplicativeExpression ) ) ( (otherlv_1= '+' ( (lv_parameters_2_0= ruleMultiplicativeExpression ) ) ) | (otherlv_3= '-' ( (lv_parameters_4_0= ruleMultiplicativeExpression ) ) ) )* )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:993:2: ( (lv_parameters_0_0= ruleMultiplicativeExpression ) ) ( (otherlv_1= '+' ( (lv_parameters_2_0= ruleMultiplicativeExpression ) ) ) | (otherlv_3= '-' ( (lv_parameters_4_0= ruleMultiplicativeExpression ) ) ) )*
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:993:2: ( (lv_parameters_0_0= ruleMultiplicativeExpression ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:994:1: (lv_parameters_0_0= ruleMultiplicativeExpression )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:994:1: (lv_parameters_0_0= ruleMultiplicativeExpression )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:995:3: lv_parameters_0_0= ruleMultiplicativeExpression
            {
             
            	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getParametersMultiplicativeExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression1919);
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

            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1011:2: ( (otherlv_1= '+' ( (lv_parameters_2_0= ruleMultiplicativeExpression ) ) ) | (otherlv_3= '-' ( (lv_parameters_4_0= ruleMultiplicativeExpression ) ) ) )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==33) ) {
                    alt15=1;
                }
                else if ( (LA15_0==34) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1011:3: (otherlv_1= '+' ( (lv_parameters_2_0= ruleMultiplicativeExpression ) ) )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1011:3: (otherlv_1= '+' ( (lv_parameters_2_0= ruleMultiplicativeExpression ) ) )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1011:5: otherlv_1= '+' ( (lv_parameters_2_0= ruleMultiplicativeExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleAdditiveExpression1933); 

            	        	newLeafNode(otherlv_1, grammarAccess.getAdditiveExpressionAccess().getPlusSignKeyword_1_0_0());
            	        
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1015:1: ( (lv_parameters_2_0= ruleMultiplicativeExpression ) )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1016:1: (lv_parameters_2_0= ruleMultiplicativeExpression )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1016:1: (lv_parameters_2_0= ruleMultiplicativeExpression )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1017:3: lv_parameters_2_0= ruleMultiplicativeExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getParametersMultiplicativeExpressionParserRuleCall_1_0_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression1954);
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
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1034:6: (otherlv_3= '-' ( (lv_parameters_4_0= ruleMultiplicativeExpression ) ) )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1034:6: (otherlv_3= '-' ( (lv_parameters_4_0= ruleMultiplicativeExpression ) ) )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1034:8: otherlv_3= '-' ( (lv_parameters_4_0= ruleMultiplicativeExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleAdditiveExpression1974); 

            	        	newLeafNode(otherlv_3, grammarAccess.getAdditiveExpressionAccess().getHyphenMinusKeyword_1_1_0());
            	        
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1038:1: ( (lv_parameters_4_0= ruleMultiplicativeExpression ) )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1039:1: (lv_parameters_4_0= ruleMultiplicativeExpression )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1039:1: (lv_parameters_4_0= ruleMultiplicativeExpression )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1040:3: lv_parameters_4_0= ruleMultiplicativeExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getParametersMultiplicativeExpressionParserRuleCall_1_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression1995);
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
            	    break loop15;
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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1064:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1065:2: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1066:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
             newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression2034);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;

             current =iv_ruleMultiplicativeExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeExpression2044); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1073:1: ruleMultiplicativeExpression returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleUnaryExpression ) ) ( ( ( (lv_operations_1_0= '*' ) ) ( (lv_parameters_2_0= ruleUnaryExpression ) ) ) | ( ( (lv_operations_3_0= RULE_TML_SEPARATOR ) ) ( (lv_parameters_4_0= ruleUnaryExpression ) ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operations_1_0=null;
        Token lv_operations_3_0=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1076:28: ( ( ( (lv_parameters_0_0= ruleUnaryExpression ) ) ( ( ( (lv_operations_1_0= '*' ) ) ( (lv_parameters_2_0= ruleUnaryExpression ) ) ) | ( ( (lv_operations_3_0= RULE_TML_SEPARATOR ) ) ( (lv_parameters_4_0= ruleUnaryExpression ) ) ) )* ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1077:1: ( ( (lv_parameters_0_0= ruleUnaryExpression ) ) ( ( ( (lv_operations_1_0= '*' ) ) ( (lv_parameters_2_0= ruleUnaryExpression ) ) ) | ( ( (lv_operations_3_0= RULE_TML_SEPARATOR ) ) ( (lv_parameters_4_0= ruleUnaryExpression ) ) ) )* )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1077:1: ( ( (lv_parameters_0_0= ruleUnaryExpression ) ) ( ( ( (lv_operations_1_0= '*' ) ) ( (lv_parameters_2_0= ruleUnaryExpression ) ) ) | ( ( (lv_operations_3_0= RULE_TML_SEPARATOR ) ) ( (lv_parameters_4_0= ruleUnaryExpression ) ) ) )* )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1077:2: ( (lv_parameters_0_0= ruleUnaryExpression ) ) ( ( ( (lv_operations_1_0= '*' ) ) ( (lv_parameters_2_0= ruleUnaryExpression ) ) ) | ( ( (lv_operations_3_0= RULE_TML_SEPARATOR ) ) ( (lv_parameters_4_0= ruleUnaryExpression ) ) ) )*
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1077:2: ( (lv_parameters_0_0= ruleUnaryExpression ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1078:1: (lv_parameters_0_0= ruleUnaryExpression )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1078:1: (lv_parameters_0_0= ruleUnaryExpression )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1079:3: lv_parameters_0_0= ruleUnaryExpression
            {
             
            	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getParametersUnaryExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleUnaryExpression_in_ruleMultiplicativeExpression2090);
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

            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1095:2: ( ( ( (lv_operations_1_0= '*' ) ) ( (lv_parameters_2_0= ruleUnaryExpression ) ) ) | ( ( (lv_operations_3_0= RULE_TML_SEPARATOR ) ) ( (lv_parameters_4_0= ruleUnaryExpression ) ) ) )*
            loop16:
            do {
                int alt16=3;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==35) ) {
                    alt16=1;
                }
                else if ( (LA16_0==RULE_TML_SEPARATOR) ) {
                    alt16=2;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1095:3: ( ( (lv_operations_1_0= '*' ) ) ( (lv_parameters_2_0= ruleUnaryExpression ) ) )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1095:3: ( ( (lv_operations_1_0= '*' ) ) ( (lv_parameters_2_0= ruleUnaryExpression ) ) )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1095:4: ( (lv_operations_1_0= '*' ) ) ( (lv_parameters_2_0= ruleUnaryExpression ) )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1095:4: ( (lv_operations_1_0= '*' ) )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1096:1: (lv_operations_1_0= '*' )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1096:1: (lv_operations_1_0= '*' )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1097:3: lv_operations_1_0= '*'
            	    {
            	    lv_operations_1_0=(Token)match(input,35,FOLLOW_35_in_ruleMultiplicativeExpression2110); 

            	            newLeafNode(lv_operations_1_0, grammarAccess.getMultiplicativeExpressionAccess().getOperationsAsteriskKeyword_1_0_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
            	    	        }
            	           		addWithLastConsumed(current, "operations", lv_operations_1_0, "*");
            	    	    

            	    }


            	    }

            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1110:2: ( (lv_parameters_2_0= ruleUnaryExpression ) )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1111:1: (lv_parameters_2_0= ruleUnaryExpression )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1111:1: (lv_parameters_2_0= ruleUnaryExpression )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1112:3: lv_parameters_2_0= ruleUnaryExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getParametersUnaryExpressionParserRuleCall_1_0_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUnaryExpression_in_ruleMultiplicativeExpression2144);
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
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1129:6: ( ( (lv_operations_3_0= RULE_TML_SEPARATOR ) ) ( (lv_parameters_4_0= ruleUnaryExpression ) ) )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1129:6: ( ( (lv_operations_3_0= RULE_TML_SEPARATOR ) ) ( (lv_parameters_4_0= ruleUnaryExpression ) ) )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1129:7: ( (lv_operations_3_0= RULE_TML_SEPARATOR ) ) ( (lv_parameters_4_0= ruleUnaryExpression ) )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1129:7: ( (lv_operations_3_0= RULE_TML_SEPARATOR ) )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1130:1: (lv_operations_3_0= RULE_TML_SEPARATOR )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1130:1: (lv_operations_3_0= RULE_TML_SEPARATOR )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1131:3: lv_operations_3_0= RULE_TML_SEPARATOR
            	    {
            	    lv_operations_3_0=(Token)match(input,RULE_TML_SEPARATOR,FOLLOW_RULE_TML_SEPARATOR_in_ruleMultiplicativeExpression2169); 

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

            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1147:2: ( (lv_parameters_4_0= ruleUnaryExpression ) )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1148:1: (lv_parameters_4_0= ruleUnaryExpression )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1148:1: (lv_parameters_4_0= ruleUnaryExpression )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1149:3: lv_parameters_4_0= ruleUnaryExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getParametersUnaryExpressionParserRuleCall_1_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUnaryExpression_in_ruleMultiplicativeExpression2195);
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
            	    break loop16;
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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1173:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1174:2: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1175:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression2234);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;

             current =iv_ruleUnaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpression2244); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1182:1: ruleUnaryExpression returns [EObject current=null] : ( ( ( (lv_operations_0_0= '!' ) ) ( (lv_parameters_1_0= rulePrimaryExpression ) ) ) | this_PrimaryExpression_2= rulePrimaryExpression ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operations_0_0=null;
        EObject lv_parameters_1_0 = null;

        EObject this_PrimaryExpression_2 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1185:28: ( ( ( ( (lv_operations_0_0= '!' ) ) ( (lv_parameters_1_0= rulePrimaryExpression ) ) ) | this_PrimaryExpression_2= rulePrimaryExpression ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1186:1: ( ( ( (lv_operations_0_0= '!' ) ) ( (lv_parameters_1_0= rulePrimaryExpression ) ) ) | this_PrimaryExpression_2= rulePrimaryExpression )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1186:1: ( ( ( (lv_operations_0_0= '!' ) ) ( (lv_parameters_1_0= rulePrimaryExpression ) ) ) | this_PrimaryExpression_2= rulePrimaryExpression )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID||LA17_0==RULE_SQBRACKET_OPEN||(LA17_0>=RULE_TML_EXISTS && LA17_0<=RULE_DOLLAR)||(LA17_0>=RULE_NUMBER && LA17_0<=RULE_FALSE)||LA17_0==26||LA17_0==38) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1186:2: ( ( (lv_operations_0_0= '!' ) ) ( (lv_parameters_1_0= rulePrimaryExpression ) ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1186:2: ( ( (lv_operations_0_0= '!' ) ) ( (lv_parameters_1_0= rulePrimaryExpression ) ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1186:3: ( (lv_operations_0_0= '!' ) ) ( (lv_parameters_1_0= rulePrimaryExpression ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1186:3: ( (lv_operations_0_0= '!' ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1187:1: (lv_operations_0_0= '!' )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1187:1: (lv_operations_0_0= '!' )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1188:3: lv_operations_0_0= '!'
                    {
                    lv_operations_0_0=(Token)match(input,36,FOLLOW_36_in_ruleUnaryExpression2288); 

                            newLeafNode(lv_operations_0_0, grammarAccess.getUnaryExpressionAccess().getOperationsExclamationMarkKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUnaryExpressionRule());
                    	        }
                           		addWithLastConsumed(current, "operations", lv_operations_0_0, "!");
                    	    

                    }


                    }

                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1201:2: ( (lv_parameters_1_0= rulePrimaryExpression ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1202:1: (lv_parameters_1_0= rulePrimaryExpression )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1202:1: (lv_parameters_1_0= rulePrimaryExpression )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1203:3: lv_parameters_1_0= rulePrimaryExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getParametersPrimaryExpressionParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleUnaryExpression2322);
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
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1221:5: this_PrimaryExpression_2= rulePrimaryExpression
                    {
                     
                            newCompositeNode(grammarAccess.getUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleUnaryExpression2351);
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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1237:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1238:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1239:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2386);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression2396); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1246:1: rulePrimaryExpression returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleLiteral ) ) | (otherlv_1= '(' ( (lv_parameters_2_0= ruleOrExpression ) ) otherlv_3= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1249:28: ( ( ( (lv_parameters_0_0= ruleLiteral ) ) | (otherlv_1= '(' ( (lv_parameters_2_0= ruleOrExpression ) ) otherlv_3= ')' ) ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1250:1: ( ( (lv_parameters_0_0= ruleLiteral ) ) | (otherlv_1= '(' ( (lv_parameters_2_0= ruleOrExpression ) ) otherlv_3= ')' ) )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1250:1: ( ( (lv_parameters_0_0= ruleLiteral ) ) | (otherlv_1= '(' ( (lv_parameters_2_0= ruleOrExpression ) ) otherlv_3= ')' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID||LA18_0==RULE_SQBRACKET_OPEN||(LA18_0>=RULE_TML_EXISTS && LA18_0<=RULE_DOLLAR)||(LA18_0>=RULE_NUMBER && LA18_0<=RULE_FALSE)||LA18_0==38) ) {
                alt18=1;
            }
            else if ( (LA18_0==26) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1250:2: ( (lv_parameters_0_0= ruleLiteral ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1250:2: ( (lv_parameters_0_0= ruleLiteral ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1251:1: (lv_parameters_0_0= ruleLiteral )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1251:1: (lv_parameters_0_0= ruleLiteral )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1252:3: lv_parameters_0_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getParametersLiteralParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_rulePrimaryExpression2442);
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
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1269:6: (otherlv_1= '(' ( (lv_parameters_2_0= ruleOrExpression ) ) otherlv_3= ')' )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1269:6: (otherlv_1= '(' ( (lv_parameters_2_0= ruleOrExpression ) ) otherlv_3= ')' )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1269:8: otherlv_1= '(' ( (lv_parameters_2_0= ruleOrExpression ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_rulePrimaryExpression2461); 

                        	newLeafNode(otherlv_1, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1273:1: ( (lv_parameters_2_0= ruleOrExpression ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1274:1: (lv_parameters_2_0= ruleOrExpression )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1274:1: (lv_parameters_2_0= ruleOrExpression )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1275:3: lv_parameters_2_0= ruleOrExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getParametersOrExpressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOrExpression_in_rulePrimaryExpression2482);
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

                    otherlv_3=(Token)match(input,28,FOLLOW_28_in_rulePrimaryExpression2494); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1303:1: entryRuleFunctionName returns [String current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final String entryRuleFunctionName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionName = null;


        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1304:2: (iv_ruleFunctionName= ruleFunctionName EOF )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1305:2: iv_ruleFunctionName= ruleFunctionName EOF
            {
             newCompositeNode(grammarAccess.getFunctionNameRule()); 
            pushFollow(FOLLOW_ruleFunctionName_in_entryRuleFunctionName2532);
            iv_ruleFunctionName=ruleFunctionName();

            state._fsp--;

             current =iv_ruleFunctionName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionName2543); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1312:1: ruleFunctionName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleFunctionName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1315:28: (this_ID_0= RULE_ID )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1316:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionName2582); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1331:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1332:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1333:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
             newCompositeNode(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall2626);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;

             current =iv_ruleFunctionCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCall2636); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1340:1: ruleFunctionCall returns [EObject current=null] : ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleOrExpression ) )? (otherlv_3= ',' ( (lv_parameters_4_0= ruleOrExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1343:28: ( ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleOrExpression ) )? (otherlv_3= ',' ( (lv_parameters_4_0= ruleOrExpression ) ) )* otherlv_5= ')' ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1344:1: ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleOrExpression ) )? (otherlv_3= ',' ( (lv_parameters_4_0= ruleOrExpression ) ) )* otherlv_5= ')' )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1344:1: ( ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleOrExpression ) )? (otherlv_3= ',' ( (lv_parameters_4_0= ruleOrExpression ) ) )* otherlv_5= ')' )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1344:2: ( (lv_name_0_0= ruleFunctionName ) ) otherlv_1= '(' ( (lv_parameters_2_0= ruleOrExpression ) )? (otherlv_3= ',' ( (lv_parameters_4_0= ruleOrExpression ) ) )* otherlv_5= ')'
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1344:2: ( (lv_name_0_0= ruleFunctionName ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1345:1: (lv_name_0_0= ruleFunctionName )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1345:1: (lv_name_0_0= ruleFunctionName )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1346:3: lv_name_0_0= ruleFunctionName
            {
             
            	        newCompositeNode(grammarAccess.getFunctionCallAccess().getNameFunctionNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleFunctionName_in_ruleFunctionCall2682);
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

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleFunctionCall2694); 

                	newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1());
                
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1366:1: ( (lv_parameters_2_0= ruleOrExpression ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID||LA19_0==RULE_SQBRACKET_OPEN||(LA19_0>=RULE_TML_EXISTS && LA19_0<=RULE_DOLLAR)||(LA19_0>=RULE_NUMBER && LA19_0<=RULE_FALSE)||LA19_0==26||LA19_0==36||LA19_0==38) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1367:1: (lv_parameters_2_0= ruleOrExpression )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1367:1: (lv_parameters_2_0= ruleOrExpression )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1368:3: lv_parameters_2_0= ruleOrExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersOrExpressionParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOrExpression_in_ruleFunctionCall2715);
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

            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1384:3: (otherlv_3= ',' ( (lv_parameters_4_0= ruleOrExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==27) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1384:5: otherlv_3= ',' ( (lv_parameters_4_0= ruleOrExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleFunctionCall2729); 

            	        	newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getCommaKeyword_3_0());
            	        
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1388:1: ( (lv_parameters_4_0= ruleOrExpression ) )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1389:1: (lv_parameters_4_0= ruleOrExpression )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1389:1: (lv_parameters_4_0= ruleOrExpression )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1390:3: lv_parameters_4_0= ruleOrExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersOrExpressionParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOrExpression_in_ruleFunctionCall2750);
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
            	    break loop20;
                }
            } while (true);

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleFunctionCall2764); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1418:1: entryRuleDateLiteral returns [EObject current=null] : iv_ruleDateLiteral= ruleDateLiteral EOF ;
    public final EObject entryRuleDateLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateLiteral = null;


        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1419:2: (iv_ruleDateLiteral= ruleDateLiteral EOF )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1420:2: iv_ruleDateLiteral= ruleDateLiteral EOF
            {
             newCompositeNode(grammarAccess.getDateLiteralRule()); 
            pushFollow(FOLLOW_ruleDateLiteral_in_entryRuleDateLiteral2800);
            iv_ruleDateLiteral=ruleDateLiteral();

            state._fsp--;

             current =iv_ruleDateLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateLiteral2810); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1427:1: ruleDateLiteral returns [EObject current=null] : ( () this_NUMBER_1= RULE_NUMBER otherlv_2= '#' this_NUMBER_3= RULE_NUMBER otherlv_4= '#' this_NUMBER_5= RULE_NUMBER otherlv_6= '#' this_NUMBER_7= RULE_NUMBER otherlv_8= '#' this_NUMBER_9= RULE_NUMBER otherlv_10= '#' this_NUMBER_11= RULE_NUMBER ) ;
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
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1430:28: ( ( () this_NUMBER_1= RULE_NUMBER otherlv_2= '#' this_NUMBER_3= RULE_NUMBER otherlv_4= '#' this_NUMBER_5= RULE_NUMBER otherlv_6= '#' this_NUMBER_7= RULE_NUMBER otherlv_8= '#' this_NUMBER_9= RULE_NUMBER otherlv_10= '#' this_NUMBER_11= RULE_NUMBER ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1431:1: ( () this_NUMBER_1= RULE_NUMBER otherlv_2= '#' this_NUMBER_3= RULE_NUMBER otherlv_4= '#' this_NUMBER_5= RULE_NUMBER otherlv_6= '#' this_NUMBER_7= RULE_NUMBER otherlv_8= '#' this_NUMBER_9= RULE_NUMBER otherlv_10= '#' this_NUMBER_11= RULE_NUMBER )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1431:1: ( () this_NUMBER_1= RULE_NUMBER otherlv_2= '#' this_NUMBER_3= RULE_NUMBER otherlv_4= '#' this_NUMBER_5= RULE_NUMBER otherlv_6= '#' this_NUMBER_7= RULE_NUMBER otherlv_8= '#' this_NUMBER_9= RULE_NUMBER otherlv_10= '#' this_NUMBER_11= RULE_NUMBER )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1431:2: () this_NUMBER_1= RULE_NUMBER otherlv_2= '#' this_NUMBER_3= RULE_NUMBER otherlv_4= '#' this_NUMBER_5= RULE_NUMBER otherlv_6= '#' this_NUMBER_7= RULE_NUMBER otherlv_8= '#' this_NUMBER_9= RULE_NUMBER otherlv_10= '#' this_NUMBER_11= RULE_NUMBER
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1431:2: ()
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1432:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDateLiteralAccess().getExpressionAction_0(),
                        current);
                

            }

            this_NUMBER_1=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleDateLiteral2855); 
             
                newLeafNode(this_NUMBER_1, grammarAccess.getDateLiteralAccess().getNUMBERTerminalRuleCall_1()); 
                
            otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleDateLiteral2866); 

                	newLeafNode(otherlv_2, grammarAccess.getDateLiteralAccess().getNumberSignKeyword_2());
                
            this_NUMBER_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleDateLiteral2877); 
             
                newLeafNode(this_NUMBER_3, grammarAccess.getDateLiteralAccess().getNUMBERTerminalRuleCall_3()); 
                
            otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleDateLiteral2888); 

                	newLeafNode(otherlv_4, grammarAccess.getDateLiteralAccess().getNumberSignKeyword_4());
                
            this_NUMBER_5=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleDateLiteral2899); 
             
                newLeafNode(this_NUMBER_5, grammarAccess.getDateLiteralAccess().getNUMBERTerminalRuleCall_5()); 
                
            otherlv_6=(Token)match(input,37,FOLLOW_37_in_ruleDateLiteral2910); 

                	newLeafNode(otherlv_6, grammarAccess.getDateLiteralAccess().getNumberSignKeyword_6());
                
            this_NUMBER_7=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleDateLiteral2921); 
             
                newLeafNode(this_NUMBER_7, grammarAccess.getDateLiteralAccess().getNUMBERTerminalRuleCall_7()); 
                
            otherlv_8=(Token)match(input,37,FOLLOW_37_in_ruleDateLiteral2932); 

                	newLeafNode(otherlv_8, grammarAccess.getDateLiteralAccess().getNumberSignKeyword_8());
                
            this_NUMBER_9=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleDateLiteral2943); 
             
                newLeafNode(this_NUMBER_9, grammarAccess.getDateLiteralAccess().getNUMBERTerminalRuleCall_9()); 
                
            otherlv_10=(Token)match(input,37,FOLLOW_37_in_ruleDateLiteral2954); 

                	newLeafNode(otherlv_10, grammarAccess.getDateLiteralAccess().getNumberSignKeyword_10());
                
            this_NUMBER_11=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleDateLiteral2965); 
             
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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1489:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1490:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1491:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral3000);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral3010); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1498:1: ruleLiteral returns [EObject current=null] : ( ( () this_NUMBER_1= RULE_NUMBER ) | ( (lv_valueString_2_0= RULE_LITERALSTRING ) ) | ( ( (lv_operations_3_0= RULE_FORALL ) ) otherlv_4= '(' ( (lv_valueString_5_0= RULE_LITERALSTRING ) ) otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) ) otherlv_8= ')' ) | ( (lv_parameters_9_0= ruleFunctionCall ) ) | ( ( (lv_expressionType_10_0= '{' ) ) ( (lv_parameters_11_0= ruleOrExpression ) )? (otherlv_12= ',' ( (lv_parameters_13_0= ruleOrExpression ) ) )* otherlv_14= '}' ) | ( (lv_elements_15_0= RULE_NULL ) ) | ( (lv_elements_16_0= RULE_TODAY ) ) | ( (lv_elements_17_0= RULE_TRUE ) ) | ( (lv_elements_18_0= RULE_FALSE ) ) | ( (lv_parameters_19_0= ruleTmlExpression ) ) | ( (lv_parameters_20_0= ruleExistsTmlExpression ) ) | ( (lv_parameters_21_0= ruleMapGetReference ) ) | ( (lv_parameters_22_0= ruleDateLiteral ) ) ) ;
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
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1501:28: ( ( ( () this_NUMBER_1= RULE_NUMBER ) | ( (lv_valueString_2_0= RULE_LITERALSTRING ) ) | ( ( (lv_operations_3_0= RULE_FORALL ) ) otherlv_4= '(' ( (lv_valueString_5_0= RULE_LITERALSTRING ) ) otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) ) otherlv_8= ')' ) | ( (lv_parameters_9_0= ruleFunctionCall ) ) | ( ( (lv_expressionType_10_0= '{' ) ) ( (lv_parameters_11_0= ruleOrExpression ) )? (otherlv_12= ',' ( (lv_parameters_13_0= ruleOrExpression ) ) )* otherlv_14= '}' ) | ( (lv_elements_15_0= RULE_NULL ) ) | ( (lv_elements_16_0= RULE_TODAY ) ) | ( (lv_elements_17_0= RULE_TRUE ) ) | ( (lv_elements_18_0= RULE_FALSE ) ) | ( (lv_parameters_19_0= ruleTmlExpression ) ) | ( (lv_parameters_20_0= ruleExistsTmlExpression ) ) | ( (lv_parameters_21_0= ruleMapGetReference ) ) | ( (lv_parameters_22_0= ruleDateLiteral ) ) ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1502:1: ( ( () this_NUMBER_1= RULE_NUMBER ) | ( (lv_valueString_2_0= RULE_LITERALSTRING ) ) | ( ( (lv_operations_3_0= RULE_FORALL ) ) otherlv_4= '(' ( (lv_valueString_5_0= RULE_LITERALSTRING ) ) otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) ) otherlv_8= ')' ) | ( (lv_parameters_9_0= ruleFunctionCall ) ) | ( ( (lv_expressionType_10_0= '{' ) ) ( (lv_parameters_11_0= ruleOrExpression ) )? (otherlv_12= ',' ( (lv_parameters_13_0= ruleOrExpression ) ) )* otherlv_14= '}' ) | ( (lv_elements_15_0= RULE_NULL ) ) | ( (lv_elements_16_0= RULE_TODAY ) ) | ( (lv_elements_17_0= RULE_TRUE ) ) | ( (lv_elements_18_0= RULE_FALSE ) ) | ( (lv_parameters_19_0= ruleTmlExpression ) ) | ( (lv_parameters_20_0= ruleExistsTmlExpression ) ) | ( (lv_parameters_21_0= ruleMapGetReference ) ) | ( (lv_parameters_22_0= ruleDateLiteral ) ) )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1502:1: ( ( () this_NUMBER_1= RULE_NUMBER ) | ( (lv_valueString_2_0= RULE_LITERALSTRING ) ) | ( ( (lv_operations_3_0= RULE_FORALL ) ) otherlv_4= '(' ( (lv_valueString_5_0= RULE_LITERALSTRING ) ) otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) ) otherlv_8= ')' ) | ( (lv_parameters_9_0= ruleFunctionCall ) ) | ( ( (lv_expressionType_10_0= '{' ) ) ( (lv_parameters_11_0= ruleOrExpression ) )? (otherlv_12= ',' ( (lv_parameters_13_0= ruleOrExpression ) ) )* otherlv_14= '}' ) | ( (lv_elements_15_0= RULE_NULL ) ) | ( (lv_elements_16_0= RULE_TODAY ) ) | ( (lv_elements_17_0= RULE_TRUE ) ) | ( (lv_elements_18_0= RULE_FALSE ) ) | ( (lv_parameters_19_0= ruleTmlExpression ) ) | ( (lv_parameters_20_0= ruleExistsTmlExpression ) ) | ( (lv_parameters_21_0= ruleMapGetReference ) ) | ( (lv_parameters_22_0= ruleDateLiteral ) ) )
            int alt23=13;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1502:2: ( () this_NUMBER_1= RULE_NUMBER )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1502:2: ( () this_NUMBER_1= RULE_NUMBER )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1502:3: () this_NUMBER_1= RULE_NUMBER
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1502:3: ()
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1503:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralAccess().getExpressionAction_0_0(),
                                current);
                        

                    }

                    this_NUMBER_1=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleLiteral3056); 
                     
                        newLeafNode(this_NUMBER_1, grammarAccess.getLiteralAccess().getNUMBERTerminalRuleCall_0_1()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1513:6: ( (lv_valueString_2_0= RULE_LITERALSTRING ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1513:6: ( (lv_valueString_2_0= RULE_LITERALSTRING ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1514:1: (lv_valueString_2_0= RULE_LITERALSTRING )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1514:1: (lv_valueString_2_0= RULE_LITERALSTRING )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1515:3: lv_valueString_2_0= RULE_LITERALSTRING
                    {
                    lv_valueString_2_0=(Token)match(input,RULE_LITERALSTRING,FOLLOW_RULE_LITERALSTRING_in_ruleLiteral3079); 

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
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1532:6: ( ( (lv_operations_3_0= RULE_FORALL ) ) otherlv_4= '(' ( (lv_valueString_5_0= RULE_LITERALSTRING ) ) otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) ) otherlv_8= ')' )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1532:6: ( ( (lv_operations_3_0= RULE_FORALL ) ) otherlv_4= '(' ( (lv_valueString_5_0= RULE_LITERALSTRING ) ) otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) ) otherlv_8= ')' )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1532:7: ( (lv_operations_3_0= RULE_FORALL ) ) otherlv_4= '(' ( (lv_valueString_5_0= RULE_LITERALSTRING ) ) otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) ) otherlv_8= ')'
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1532:7: ( (lv_operations_3_0= RULE_FORALL ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1533:1: (lv_operations_3_0= RULE_FORALL )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1533:1: (lv_operations_3_0= RULE_FORALL )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1534:3: lv_operations_3_0= RULE_FORALL
                    {
                    lv_operations_3_0=(Token)match(input,RULE_FORALL,FOLLOW_RULE_FORALL_in_ruleLiteral3108); 

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

                    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleLiteral3125); 

                        	newLeafNode(otherlv_4, grammarAccess.getLiteralAccess().getLeftParenthesisKeyword_2_1());
                        
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1554:1: ( (lv_valueString_5_0= RULE_LITERALSTRING ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1555:1: (lv_valueString_5_0= RULE_LITERALSTRING )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1555:1: (lv_valueString_5_0= RULE_LITERALSTRING )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1556:3: lv_valueString_5_0= RULE_LITERALSTRING
                    {
                    lv_valueString_5_0=(Token)match(input,RULE_LITERALSTRING,FOLLOW_RULE_LITERALSTRING_in_ruleLiteral3142); 

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

                    otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleLiteral3159); 

                        	newLeafNode(otherlv_6, grammarAccess.getLiteralAccess().getCommaKeyword_2_3());
                        
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1576:1: ( (lv_parameters_7_0= ruleOrExpression ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1577:1: (lv_parameters_7_0= ruleOrExpression )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1577:1: (lv_parameters_7_0= ruleOrExpression )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1578:3: lv_parameters_7_0= ruleOrExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralAccess().getParametersOrExpressionParserRuleCall_2_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOrExpression_in_ruleLiteral3180);
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

                    otherlv_8=(Token)match(input,28,FOLLOW_28_in_ruleLiteral3192); 

                        	newLeafNode(otherlv_8, grammarAccess.getLiteralAccess().getRightParenthesisKeyword_2_5());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1599:6: ( (lv_parameters_9_0= ruleFunctionCall ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1599:6: ( (lv_parameters_9_0= ruleFunctionCall ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1600:1: (lv_parameters_9_0= ruleFunctionCall )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1600:1: (lv_parameters_9_0= ruleFunctionCall )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1601:3: lv_parameters_9_0= ruleFunctionCall
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralAccess().getParametersFunctionCallParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionCall_in_ruleLiteral3220);
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
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1618:6: ( ( (lv_expressionType_10_0= '{' ) ) ( (lv_parameters_11_0= ruleOrExpression ) )? (otherlv_12= ',' ( (lv_parameters_13_0= ruleOrExpression ) ) )* otherlv_14= '}' )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1618:6: ( ( (lv_expressionType_10_0= '{' ) ) ( (lv_parameters_11_0= ruleOrExpression ) )? (otherlv_12= ',' ( (lv_parameters_13_0= ruleOrExpression ) ) )* otherlv_14= '}' )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1618:7: ( (lv_expressionType_10_0= '{' ) ) ( (lv_parameters_11_0= ruleOrExpression ) )? (otherlv_12= ',' ( (lv_parameters_13_0= ruleOrExpression ) ) )* otherlv_14= '}'
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1618:7: ( (lv_expressionType_10_0= '{' ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1619:1: (lv_expressionType_10_0= '{' )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1619:1: (lv_expressionType_10_0= '{' )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1620:3: lv_expressionType_10_0= '{'
                    {
                    lv_expressionType_10_0=(Token)match(input,38,FOLLOW_38_in_ruleLiteral3245); 

                            newLeafNode(lv_expressionType_10_0, grammarAccess.getLiteralAccess().getExpressionTypeLeftCurlyBracketKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralRule());
                    	        }
                           		setWithLastConsumed(current, "expressionType", lv_expressionType_10_0, "{");
                    	    

                    }


                    }

                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1633:2: ( (lv_parameters_11_0= ruleOrExpression ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_ID||LA21_0==RULE_SQBRACKET_OPEN||(LA21_0>=RULE_TML_EXISTS && LA21_0<=RULE_DOLLAR)||(LA21_0>=RULE_NUMBER && LA21_0<=RULE_FALSE)||LA21_0==26||LA21_0==36||LA21_0==38) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1634:1: (lv_parameters_11_0= ruleOrExpression )
                            {
                            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1634:1: (lv_parameters_11_0= ruleOrExpression )
                            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1635:3: lv_parameters_11_0= ruleOrExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getLiteralAccess().getParametersOrExpressionParserRuleCall_4_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleOrExpression_in_ruleLiteral3279);
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

                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1651:3: (otherlv_12= ',' ( (lv_parameters_13_0= ruleOrExpression ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==27) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1651:5: otherlv_12= ',' ( (lv_parameters_13_0= ruleOrExpression ) )
                    	    {
                    	    otherlv_12=(Token)match(input,27,FOLLOW_27_in_ruleLiteral3293); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getLiteralAccess().getCommaKeyword_4_2_0());
                    	        
                    	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1655:1: ( (lv_parameters_13_0= ruleOrExpression ) )
                    	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1656:1: (lv_parameters_13_0= ruleOrExpression )
                    	    {
                    	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1656:1: (lv_parameters_13_0= ruleOrExpression )
                    	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1657:3: lv_parameters_13_0= ruleOrExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLiteralAccess().getParametersOrExpressionParserRuleCall_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleOrExpression_in_ruleLiteral3314);
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
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,39,FOLLOW_39_in_ruleLiteral3328); 

                        	newLeafNode(otherlv_14, grammarAccess.getLiteralAccess().getRightCurlyBracketKeyword_4_3());
                        

                    }


                    }
                    break;
                case 6 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1678:6: ( (lv_elements_15_0= RULE_NULL ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1678:6: ( (lv_elements_15_0= RULE_NULL ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1679:1: (lv_elements_15_0= RULE_NULL )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1679:1: (lv_elements_15_0= RULE_NULL )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1680:3: lv_elements_15_0= RULE_NULL
                    {
                    lv_elements_15_0=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleLiteral3352); 

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
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1697:6: ( (lv_elements_16_0= RULE_TODAY ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1697:6: ( (lv_elements_16_0= RULE_TODAY ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1698:1: (lv_elements_16_0= RULE_TODAY )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1698:1: (lv_elements_16_0= RULE_TODAY )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1699:3: lv_elements_16_0= RULE_TODAY
                    {
                    lv_elements_16_0=(Token)match(input,RULE_TODAY,FOLLOW_RULE_TODAY_in_ruleLiteral3380); 

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
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1716:6: ( (lv_elements_17_0= RULE_TRUE ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1716:6: ( (lv_elements_17_0= RULE_TRUE ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1717:1: (lv_elements_17_0= RULE_TRUE )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1717:1: (lv_elements_17_0= RULE_TRUE )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1718:3: lv_elements_17_0= RULE_TRUE
                    {
                    lv_elements_17_0=(Token)match(input,RULE_TRUE,FOLLOW_RULE_TRUE_in_ruleLiteral3408); 

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
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1735:6: ( (lv_elements_18_0= RULE_FALSE ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1735:6: ( (lv_elements_18_0= RULE_FALSE ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1736:1: (lv_elements_18_0= RULE_FALSE )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1736:1: (lv_elements_18_0= RULE_FALSE )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1737:3: lv_elements_18_0= RULE_FALSE
                    {
                    lv_elements_18_0=(Token)match(input,RULE_FALSE,FOLLOW_RULE_FALSE_in_ruleLiteral3436); 

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
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1754:6: ( (lv_parameters_19_0= ruleTmlExpression ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1754:6: ( (lv_parameters_19_0= ruleTmlExpression ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1755:1: (lv_parameters_19_0= ruleTmlExpression )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1755:1: (lv_parameters_19_0= ruleTmlExpression )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1756:3: lv_parameters_19_0= ruleTmlExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralAccess().getParametersTmlExpressionParserRuleCall_9_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTmlExpression_in_ruleLiteral3468);
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
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1773:6: ( (lv_parameters_20_0= ruleExistsTmlExpression ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1773:6: ( (lv_parameters_20_0= ruleExistsTmlExpression ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1774:1: (lv_parameters_20_0= ruleExistsTmlExpression )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1774:1: (lv_parameters_20_0= ruleExistsTmlExpression )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1775:3: lv_parameters_20_0= ruleExistsTmlExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralAccess().getParametersExistsTmlExpressionParserRuleCall_10_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExistsTmlExpression_in_ruleLiteral3495);
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
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1792:6: ( (lv_parameters_21_0= ruleMapGetReference ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1792:6: ( (lv_parameters_21_0= ruleMapGetReference ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1793:1: (lv_parameters_21_0= ruleMapGetReference )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1793:1: (lv_parameters_21_0= ruleMapGetReference )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1794:3: lv_parameters_21_0= ruleMapGetReference
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralAccess().getParametersMapGetReferenceParserRuleCall_11_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMapGetReference_in_ruleLiteral3522);
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
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1811:6: ( (lv_parameters_22_0= ruleDateLiteral ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1811:6: ( (lv_parameters_22_0= ruleDateLiteral ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1812:1: (lv_parameters_22_0= ruleDateLiteral )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1812:1: (lv_parameters_22_0= ruleDateLiteral )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1813:3: lv_parameters_22_0= ruleDateLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralAccess().getParametersDateLiteralParserRuleCall_12_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDateLiteral_in_ruleLiteral3549);
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


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA2_eotS =
        "\7\uffff";
    static final String DFA2_eofS =
        "\7\uffff";
    static final String DFA2_minS =
        "\2\4\1\uffff\1\4\1\uffff\2\4";
    static final String DFA2_maxS =
        "\1\11\1\12\1\uffff\1\12\1\uffff\2\12";
    static final String DFA2_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\2\uffff";
    static final String DFA2_specialS =
        "\7\uffff}>";
    static final String[] DFA2_transitionS = {
            "\3\2\1\1\1\uffff\1\2",
            "\3\4\1\3\1\uffff\1\4\1\2",
            "",
            "\3\2\1\5\2\uffff\1\4",
            "",
            "\3\4\1\6\2\uffff\1\2",
            "\3\2\1\5\2\uffff\1\4"
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "175:1: ( (lv_absolute_1_0= RULE_TML_SEPARATOR ) )?";
        }
    }
    static final String DFA5_eotS =
        "\7\uffff";
    static final String DFA5_eofS =
        "\7\uffff";
    static final String DFA5_minS =
        "\2\4\1\uffff\1\4\1\uffff\2\4";
    static final String DFA5_maxS =
        "\1\11\1\12\1\uffff\1\12\1\uffff\2\12";
    static final String DFA5_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\2\uffff";
    static final String DFA5_specialS =
        "\7\uffff}>";
    static final String[] DFA5_transitionS = {
            "\3\2\1\1\1\uffff\1\2",
            "\3\4\1\3\1\uffff\1\4\1\2",
            "",
            "\3\2\1\5\2\uffff\1\4",
            "",
            "\3\4\1\6\2\uffff\1\2",
            "\3\2\1\5\2\uffff\1\4"
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "284:1: ( (lv_absolute_2_0= RULE_TML_SEPARATOR ) )?";
        }
    }
    static final String DFA23_eotS =
        "\17\uffff";
    static final String DFA23_eofS =
        "\1\uffff\1\16\15\uffff";
    static final String DFA23_minS =
        "\1\4\1\7\15\uffff";
    static final String DFA23_maxS =
        "\1\46\1\47\15\uffff";
    static final String DFA23_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1"+
        "\1";
    static final String DFA23_specialS =
        "\17\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\4\3\uffff\1\12\2\uffff\1\13\1\14\4\uffff\1\1\1\2\1\3\1\6"+
            "\1\7\1\10\1\11\16\uffff\1\5",
            "\1\16\5\uffff\4\16\12\uffff\11\16\1\uffff\1\15\1\uffff\1\16",
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

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1502:1: ( ( () this_NUMBER_1= RULE_NUMBER ) | ( (lv_valueString_2_0= RULE_LITERALSTRING ) ) | ( ( (lv_operations_3_0= RULE_FORALL ) ) otherlv_4= '(' ( (lv_valueString_5_0= RULE_LITERALSTRING ) ) otherlv_6= ',' ( (lv_parameters_7_0= ruleOrExpression ) ) otherlv_8= ')' ) | ( (lv_parameters_9_0= ruleFunctionCall ) ) | ( ( (lv_expressionType_10_0= '{' ) ) ( (lv_parameters_11_0= ruleOrExpression ) )? (otherlv_12= ',' ( (lv_parameters_13_0= ruleOrExpression ) ) )* otherlv_14= '}' ) | ( (lv_elements_15_0= RULE_NULL ) ) | ( (lv_elements_16_0= RULE_TODAY ) ) | ( (lv_elements_17_0= RULE_TRUE ) ) | ( (lv_elements_18_0= RULE_FALSE ) ) | ( (lv_parameters_19_0= ruleTmlExpression ) ) | ( (lv_parameters_20_0= ruleExistsTmlExpression ) ) | ( (lv_parameters_21_0= ruleMapGetReference ) ) | ( (lv_parameters_22_0= ruleDateLiteral ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleTopLevel_in_entryRuleTopLevel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopLevel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleTopLevel130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathElement_in_entryRulePathElement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathElement177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePathElement217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_rulePathElement243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARENT_in_rulePathElement269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TML_SEPARATOR_in_rulePathElement295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTmlExpression_in_entryRuleTmlExpression340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTmlExpression350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SQBRACKET_OPEN_in_ruleTmlExpression386 = new BitSet(new long[]{0x00000000000002F0L});
    public static final BitSet FOLLOW_RULE_TML_SEPARATOR_in_ruleTmlExpression402 = new BitSet(new long[]{0x00000000000002F0L});
    public static final BitSet FOLLOW_RULE_AT_in_ruleTmlExpression425 = new BitSet(new long[]{0x00000000000002F0L});
    public static final BitSet FOLLOW_rulePathElement_in_ruleTmlExpression452 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_RULE_TML_SEPARATOR_in_ruleTmlExpression464 = new BitSet(new long[]{0x00000000000002F0L});
    public static final BitSet FOLLOW_rulePathElement_in_ruleTmlExpression484 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_RULE_SQBRACKET_CLOSE_in_ruleTmlExpression497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExistsTmlExpression_in_entryRuleExistsTmlExpression532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExistsTmlExpression542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TML_EXISTS_in_ruleExistsTmlExpression578 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_SQBRACKET_OPEN_in_ruleExistsTmlExpression588 = new BitSet(new long[]{0x00000000000002F0L});
    public static final BitSet FOLLOW_RULE_TML_SEPARATOR_in_ruleExistsTmlExpression604 = new BitSet(new long[]{0x00000000000002F0L});
    public static final BitSet FOLLOW_RULE_AT_in_ruleExistsTmlExpression627 = new BitSet(new long[]{0x00000000000002F0L});
    public static final BitSet FOLLOW_rulePathElement_in_ruleExistsTmlExpression654 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_RULE_TML_SEPARATOR_in_ruleExistsTmlExpression666 = new BitSet(new long[]{0x00000000000002F0L});
    public static final BitSet FOLLOW_rulePathElement_in_ruleExistsTmlExpression686 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_RULE_SQBRACKET_CLOSE_in_ruleExistsTmlExpression699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapReferenceParams_in_entryRuleMapReferenceParams734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapReferenceParams744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleMapReferenceParams781 = new BitSet(new long[]{0x0000004000FE1910L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleMapReferenceParams802 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_27_in_ruleMapReferenceParams815 = new BitSet(new long[]{0x0000004000FE1910L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleMapReferenceParams836 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_28_in_ruleMapReferenceParams850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapGetReference_in_entryRuleMapGetReference886 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapGetReference896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOLLAR_in_ruleMapGetReference938 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_PARENT_in_ruleMapGetReference961 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_TML_SEPARATOR_in_ruleMapGetReference977 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapGetReference995 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleMapReferenceParams_in_ruleMapGetReference1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression1058 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression1114 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleOrExpression1133 = new BitSet(new long[]{0x0000005004FE1910L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression1167 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression1205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_ruleAndExpression1261 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleAndExpression1280 = new BitSet(new long[]{0x0000005004FE1910L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_ruleAndExpression1314 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression1352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualityExpression1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleEqualityExpression1408 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_31_in_ruleEqualityExpression1428 = new BitSet(new long[]{0x0000005004FE1910L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleEqualityExpression1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleEqualityExpression1488 = new BitSet(new long[]{0x0000005004FE1910L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleEqualityExpression1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression1561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpression1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression1626 = new BitSet(new long[]{0x000000000001E002L});
    public static final BitSet FOLLOW_RULE_XML_LT_in_ruleRelationalExpression1645 = new BitSet(new long[]{0x0000005004FE1910L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XML_GT_in_ruleRelationalExpression1696 = new BitSet(new long[]{0x0000005004FE1910L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XML_LTEQ_in_ruleRelationalExpression1747 = new BitSet(new long[]{0x0000005004FE1910L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XML_GTEQ_in_ruleRelationalExpression1798 = new BitSet(new long[]{0x0000005004FE1910L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression1863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression1919 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_33_in_ruleAdditiveExpression1933 = new BitSet(new long[]{0x0000005004FE1910L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression1954 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_34_in_ruleAdditiveExpression1974 = new BitSet(new long[]{0x0000005004FE1910L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression1995 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression2034 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpression2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultiplicativeExpression2090 = new BitSet(new long[]{0x0000000800000082L});
    public static final BitSet FOLLOW_35_in_ruleMultiplicativeExpression2110 = new BitSet(new long[]{0x0000005004FE1910L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultiplicativeExpression2144 = new BitSet(new long[]{0x0000000800000082L});
    public static final BitSet FOLLOW_RULE_TML_SEPARATOR_in_ruleMultiplicativeExpression2169 = new BitSet(new long[]{0x0000005004FE1910L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultiplicativeExpression2195 = new BitSet(new long[]{0x0000000800000082L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression2234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression2244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleUnaryExpression2288 = new BitSet(new long[]{0x0000005004FE1910L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleUnaryExpression2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleUnaryExpression2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimaryExpression2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulePrimaryExpression2461 = new BitSet(new long[]{0x0000005004FE1910L});
    public static final BitSet FOLLOW_ruleOrExpression_in_rulePrimaryExpression2482 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePrimaryExpression2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionName_in_entryRuleFunctionName2532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionName2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionName2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall2626 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionName_in_ruleFunctionCall2682 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleFunctionCall2694 = new BitSet(new long[]{0x000000501CFE1910L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleFunctionCall2715 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_27_in_ruleFunctionCall2729 = new BitSet(new long[]{0x0000005004FE1910L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleFunctionCall2750 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_28_in_ruleFunctionCall2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateLiteral_in_entryRuleDateLiteral2800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateLiteral2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleDateLiteral2855 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleDateLiteral2866 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleDateLiteral2877 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleDateLiteral2888 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleDateLiteral2899 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleDateLiteral2910 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleDateLiteral2921 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleDateLiteral2932 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleDateLiteral2943 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleDateLiteral2954 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleDateLiteral2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral3000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleLiteral3056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LITERALSTRING_in_ruleLiteral3079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FORALL_in_ruleLiteral3108 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleLiteral3125 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_LITERALSTRING_in_ruleLiteral3142 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleLiteral3159 = new BitSet(new long[]{0x0000005004FE1910L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleLiteral3180 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleLiteral3192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_ruleLiteral3220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleLiteral3245 = new BitSet(new long[]{0x000000D00CFE1910L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleLiteral3279 = new BitSet(new long[]{0x0000008008000000L});
    public static final BitSet FOLLOW_27_in_ruleLiteral3293 = new BitSet(new long[]{0x0000005004FE1910L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleLiteral3314 = new BitSet(new long[]{0x0000008008000000L});
    public static final BitSet FOLLOW_39_in_ruleLiteral3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleLiteral3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TODAY_in_ruleLiteral3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TRUE_in_ruleLiteral3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FALSE_in_ruleLiteral3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTmlExpression_in_ruleLiteral3468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExistsTmlExpression_in_ruleLiteral3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapGetReference_in_ruleLiteral3522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateLiteral_in_ruleLiteral3549 = new BitSet(new long[]{0x0000000000000002L});

}