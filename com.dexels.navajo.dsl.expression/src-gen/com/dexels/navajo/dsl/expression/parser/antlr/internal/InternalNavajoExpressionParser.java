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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOT", "RULE_PARENT", "RULE_TML_SEPARATOR", "RULE_SQBRACKET_OPEN", "RULE_AT", "RULE_SQBRACKET_CLOSE", "RULE_TML_EXISTS", "RULE_BRACKET_OPEN", "RULE_COMMA", "RULE_BRACKET_CLOSE", "RULE_DOLLAR", "RULE_OR", "RULE_AND", "RULE_EQUALSEQUALS", "RULE_NEQUALS", "RULE_XML_LT", "RULE_XML_GT", "RULE_XML_LTEQ", "RULE_XML_GTEQ", "RULE_PLUS", "RULE_MINUS", "RULE_MULTIPLY", "RULE_NOT", "RULE_NUMBER", "RULE_HASH", "RULE_LITERALSTRING", "RULE_FORALL", "RULE_CURLYOPEN", "RULE_CURLYCLOSE", "RULE_NULL", "RULE_TODAY", "RULE_TRUE", "RULE_FALSE", "RULE_BADNUMBER", "RULE_WS", "RULE_COLON"
    };
    public static final int RULE_ID=4;
    public static final int RULE_PARENT=6;
    public static final int RULE_SQBRACKET_OPEN=8;
    public static final int RULE_XML_LT=20;
    public static final int RULE_CURLYOPEN=32;
    public static final int RULE_PLUS=24;
    public static final int RULE_OR=16;
    public static final int RULE_HASH=29;
    public static final int RULE_COMMA=13;
    public static final int RULE_LITERALSTRING=30;
    public static final int RULE_BRACKET_CLOSE=14;
    public static final int RULE_AND=17;
    public static final int RULE_XML_GTEQ=23;
    public static final int RULE_TML_SEPARATOR=7;
    public static final int RULE_CURLYCLOSE=33;
    public static final int EOF=-1;
    public static final int RULE_NOT=27;
    public static final int RULE_NULL=34;
    public static final int RULE_TRUE=36;
    public static final int RULE_NEQUALS=19;
    public static final int RULE_BRACKET_OPEN=12;
    public static final int RULE_FORALL=31;
    public static final int RULE_DOLLAR=15;
    public static final int RULE_COLON=40;
    public static final int RULE_MINUS=25;
    public static final int RULE_FALSE=37;
    public static final int RULE_TML_EXISTS=11;
    public static final int RULE_DOT=5;
    public static final int RULE_NUMBER=28;
    public static final int RULE_TODAY=35;
    public static final int RULE_SQBRACKET_CLOSE=10;
    public static final int RULE_MULTIPLY=26;
    public static final int RULE_XML_LTEQ=22;
    public static final int RULE_BADNUMBER=38;
    public static final int RULE_WS=39;
    public static final int RULE_XML_GT=21;
    public static final int RULE_AT=9;
    public static final int RULE_EQUALSEQUALS=18;

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:108:1: entryRulePathElement returns [String current=null] : iv_rulePathElement= rulePathElement EOF ;
    public final String entryRulePathElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePathElement = null;


        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:109:2: (iv_rulePathElement= rulePathElement EOF )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:110:2: iv_rulePathElement= rulePathElement EOF
            {
             newCompositeNode(grammarAccess.getPathElementRule()); 
            pushFollow(FOLLOW_rulePathElement_in_entryRulePathElement168);
            iv_rulePathElement=rulePathElement();

            state._fsp--;

             current =iv_rulePathElement.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathElement179); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:117:1: rulePathElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_DOT_1= RULE_DOT | this_PARENT_2= RULE_PARENT | this_TML_SEPARATOR_3= RULE_TML_SEPARATOR ) ;
    public final AntlrDatatypeRuleToken rulePathElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_DOT_1=null;
        Token this_PARENT_2=null;
        Token this_TML_SEPARATOR_3=null;

         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:120:28: ( (this_ID_0= RULE_ID | this_DOT_1= RULE_DOT | this_PARENT_2= RULE_PARENT | this_TML_SEPARATOR_3= RULE_TML_SEPARATOR ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:121:1: (this_ID_0= RULE_ID | this_DOT_1= RULE_DOT | this_PARENT_2= RULE_PARENT | this_TML_SEPARATOR_3= RULE_TML_SEPARATOR )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:121:1: (this_ID_0= RULE_ID | this_DOT_1= RULE_DOT | this_PARENT_2= RULE_PARENT | this_TML_SEPARATOR_3= RULE_TML_SEPARATOR )
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
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:121:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePathElement219); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getPathElementAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:129:10: this_DOT_1= RULE_DOT
                    {
                    this_DOT_1=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_rulePathElement245); 

                    		current.merge(this_DOT_1);
                        
                     
                        newLeafNode(this_DOT_1, grammarAccess.getPathElementAccess().getDOTTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:137:10: this_PARENT_2= RULE_PARENT
                    {
                    this_PARENT_2=(Token)match(input,RULE_PARENT,FOLLOW_RULE_PARENT_in_rulePathElement271); 

                    		current.merge(this_PARENT_2);
                        
                     
                        newLeafNode(this_PARENT_2, grammarAccess.getPathElementAccess().getPARENTTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:145:10: this_TML_SEPARATOR_3= RULE_TML_SEPARATOR
                    {
                    this_TML_SEPARATOR_3=(Token)match(input,RULE_TML_SEPARATOR,FOLLOW_RULE_TML_SEPARATOR_in_rulePathElement297); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:160:1: entryRuleTmlExpression returns [EObject current=null] : iv_ruleTmlExpression= ruleTmlExpression EOF ;
    public final EObject entryRuleTmlExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTmlExpression = null;


        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:161:2: (iv_ruleTmlExpression= ruleTmlExpression EOF )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:162:2: iv_ruleTmlExpression= ruleTmlExpression EOF
            {
             newCompositeNode(grammarAccess.getTmlExpressionRule()); 
            pushFollow(FOLLOW_ruleTmlExpression_in_entryRuleTmlExpression342);
            iv_ruleTmlExpression=ruleTmlExpression();

            state._fsp--;

             current =iv_ruleTmlExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTmlExpression352); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:169:1: ruleTmlExpression returns [EObject current=null] : (this_SQBRACKET_OPEN_0= RULE_SQBRACKET_OPEN ( (lv_absolute_1_0= RULE_TML_SEPARATOR ) )? ( (lv_param_2_0= RULE_AT ) )? ( (lv_elements_3_0= rulePathElement ) ) (this_TML_SEPARATOR_4= RULE_TML_SEPARATOR ( (lv_elements_5_0= rulePathElement ) ) )* this_SQBRACKET_CLOSE_6= RULE_SQBRACKET_CLOSE ) ;
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
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:172:28: ( (this_SQBRACKET_OPEN_0= RULE_SQBRACKET_OPEN ( (lv_absolute_1_0= RULE_TML_SEPARATOR ) )? ( (lv_param_2_0= RULE_AT ) )? ( (lv_elements_3_0= rulePathElement ) ) (this_TML_SEPARATOR_4= RULE_TML_SEPARATOR ( (lv_elements_5_0= rulePathElement ) ) )* this_SQBRACKET_CLOSE_6= RULE_SQBRACKET_CLOSE ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:173:1: (this_SQBRACKET_OPEN_0= RULE_SQBRACKET_OPEN ( (lv_absolute_1_0= RULE_TML_SEPARATOR ) )? ( (lv_param_2_0= RULE_AT ) )? ( (lv_elements_3_0= rulePathElement ) ) (this_TML_SEPARATOR_4= RULE_TML_SEPARATOR ( (lv_elements_5_0= rulePathElement ) ) )* this_SQBRACKET_CLOSE_6= RULE_SQBRACKET_CLOSE )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:173:1: (this_SQBRACKET_OPEN_0= RULE_SQBRACKET_OPEN ( (lv_absolute_1_0= RULE_TML_SEPARATOR ) )? ( (lv_param_2_0= RULE_AT ) )? ( (lv_elements_3_0= rulePathElement ) ) (this_TML_SEPARATOR_4= RULE_TML_SEPARATOR ( (lv_elements_5_0= rulePathElement ) ) )* this_SQBRACKET_CLOSE_6= RULE_SQBRACKET_CLOSE )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:173:2: this_SQBRACKET_OPEN_0= RULE_SQBRACKET_OPEN ( (lv_absolute_1_0= RULE_TML_SEPARATOR ) )? ( (lv_param_2_0= RULE_AT ) )? ( (lv_elements_3_0= rulePathElement ) ) (this_TML_SEPARATOR_4= RULE_TML_SEPARATOR ( (lv_elements_5_0= rulePathElement ) ) )* this_SQBRACKET_CLOSE_6= RULE_SQBRACKET_CLOSE
            {
            this_SQBRACKET_OPEN_0=(Token)match(input,RULE_SQBRACKET_OPEN,FOLLOW_RULE_SQBRACKET_OPEN_in_ruleTmlExpression388); 
             
                newLeafNode(this_SQBRACKET_OPEN_0, grammarAccess.getTmlExpressionAccess().getSQBRACKET_OPENTerminalRuleCall_0()); 
                
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:177:1: ( (lv_absolute_1_0= RULE_TML_SEPARATOR ) )?
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:178:1: (lv_absolute_1_0= RULE_TML_SEPARATOR )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:178:1: (lv_absolute_1_0= RULE_TML_SEPARATOR )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:179:3: lv_absolute_1_0= RULE_TML_SEPARATOR
                    {
                    lv_absolute_1_0=(Token)match(input,RULE_TML_SEPARATOR,FOLLOW_RULE_TML_SEPARATOR_in_ruleTmlExpression404); 

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

            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:195:3: ( (lv_param_2_0= RULE_AT ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_AT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:196:1: (lv_param_2_0= RULE_AT )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:196:1: (lv_param_2_0= RULE_AT )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:197:3: lv_param_2_0= RULE_AT
                    {
                    lv_param_2_0=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_ruleTmlExpression427); 

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

            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:213:3: ( (lv_elements_3_0= rulePathElement ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:214:1: (lv_elements_3_0= rulePathElement )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:214:1: (lv_elements_3_0= rulePathElement )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:215:3: lv_elements_3_0= rulePathElement
            {
             
            	        newCompositeNode(grammarAccess.getTmlExpressionAccess().getElementsPathElementParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_rulePathElement_in_ruleTmlExpression454);
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

            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:231:2: (this_TML_SEPARATOR_4= RULE_TML_SEPARATOR ( (lv_elements_5_0= rulePathElement ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_TML_SEPARATOR) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:231:3: this_TML_SEPARATOR_4= RULE_TML_SEPARATOR ( (lv_elements_5_0= rulePathElement ) )
            	    {
            	    this_TML_SEPARATOR_4=(Token)match(input,RULE_TML_SEPARATOR,FOLLOW_RULE_TML_SEPARATOR_in_ruleTmlExpression466); 
            	     
            	        newLeafNode(this_TML_SEPARATOR_4, grammarAccess.getTmlExpressionAccess().getTML_SEPARATORTerminalRuleCall_4_0()); 
            	        
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:235:1: ( (lv_elements_5_0= rulePathElement ) )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:236:1: (lv_elements_5_0= rulePathElement )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:236:1: (lv_elements_5_0= rulePathElement )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:237:3: lv_elements_5_0= rulePathElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTmlExpressionAccess().getElementsPathElementParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePathElement_in_ruleTmlExpression486);
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

            this_SQBRACKET_CLOSE_6=(Token)match(input,RULE_SQBRACKET_CLOSE,FOLLOW_RULE_SQBRACKET_CLOSE_in_ruleTmlExpression499); 
             
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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:265:1: entryRuleExistsTmlExpression returns [EObject current=null] : iv_ruleExistsTmlExpression= ruleExistsTmlExpression EOF ;
    public final EObject entryRuleExistsTmlExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistsTmlExpression = null;


        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:266:2: (iv_ruleExistsTmlExpression= ruleExistsTmlExpression EOF )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:267:2: iv_ruleExistsTmlExpression= ruleExistsTmlExpression EOF
            {
             newCompositeNode(grammarAccess.getExistsTmlExpressionRule()); 
            pushFollow(FOLLOW_ruleExistsTmlExpression_in_entryRuleExistsTmlExpression534);
            iv_ruleExistsTmlExpression=ruleExistsTmlExpression();

            state._fsp--;

             current =iv_ruleExistsTmlExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExistsTmlExpression544); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:274:1: ruleExistsTmlExpression returns [EObject current=null] : (this_TML_EXISTS_0= RULE_TML_EXISTS this_SQBRACKET_OPEN_1= RULE_SQBRACKET_OPEN ( (lv_absolute_2_0= RULE_TML_SEPARATOR ) )? ( (lv_param_3_0= RULE_AT ) )? ( (lv_elements_4_0= rulePathElement ) ) (this_TML_SEPARATOR_5= RULE_TML_SEPARATOR ( (lv_elements_6_0= rulePathElement ) ) )* this_SQBRACKET_CLOSE_7= RULE_SQBRACKET_CLOSE ) ;
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
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:277:28: ( (this_TML_EXISTS_0= RULE_TML_EXISTS this_SQBRACKET_OPEN_1= RULE_SQBRACKET_OPEN ( (lv_absolute_2_0= RULE_TML_SEPARATOR ) )? ( (lv_param_3_0= RULE_AT ) )? ( (lv_elements_4_0= rulePathElement ) ) (this_TML_SEPARATOR_5= RULE_TML_SEPARATOR ( (lv_elements_6_0= rulePathElement ) ) )* this_SQBRACKET_CLOSE_7= RULE_SQBRACKET_CLOSE ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:278:1: (this_TML_EXISTS_0= RULE_TML_EXISTS this_SQBRACKET_OPEN_1= RULE_SQBRACKET_OPEN ( (lv_absolute_2_0= RULE_TML_SEPARATOR ) )? ( (lv_param_3_0= RULE_AT ) )? ( (lv_elements_4_0= rulePathElement ) ) (this_TML_SEPARATOR_5= RULE_TML_SEPARATOR ( (lv_elements_6_0= rulePathElement ) ) )* this_SQBRACKET_CLOSE_7= RULE_SQBRACKET_CLOSE )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:278:1: (this_TML_EXISTS_0= RULE_TML_EXISTS this_SQBRACKET_OPEN_1= RULE_SQBRACKET_OPEN ( (lv_absolute_2_0= RULE_TML_SEPARATOR ) )? ( (lv_param_3_0= RULE_AT ) )? ( (lv_elements_4_0= rulePathElement ) ) (this_TML_SEPARATOR_5= RULE_TML_SEPARATOR ( (lv_elements_6_0= rulePathElement ) ) )* this_SQBRACKET_CLOSE_7= RULE_SQBRACKET_CLOSE )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:278:2: this_TML_EXISTS_0= RULE_TML_EXISTS this_SQBRACKET_OPEN_1= RULE_SQBRACKET_OPEN ( (lv_absolute_2_0= RULE_TML_SEPARATOR ) )? ( (lv_param_3_0= RULE_AT ) )? ( (lv_elements_4_0= rulePathElement ) ) (this_TML_SEPARATOR_5= RULE_TML_SEPARATOR ( (lv_elements_6_0= rulePathElement ) ) )* this_SQBRACKET_CLOSE_7= RULE_SQBRACKET_CLOSE
            {
            this_TML_EXISTS_0=(Token)match(input,RULE_TML_EXISTS,FOLLOW_RULE_TML_EXISTS_in_ruleExistsTmlExpression580); 
             
                newLeafNode(this_TML_EXISTS_0, grammarAccess.getExistsTmlExpressionAccess().getTML_EXISTSTerminalRuleCall_0()); 
                
            this_SQBRACKET_OPEN_1=(Token)match(input,RULE_SQBRACKET_OPEN,FOLLOW_RULE_SQBRACKET_OPEN_in_ruleExistsTmlExpression590); 
             
                newLeafNode(this_SQBRACKET_OPEN_1, grammarAccess.getExistsTmlExpressionAccess().getSQBRACKET_OPENTerminalRuleCall_1()); 
                
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:286:1: ( (lv_absolute_2_0= RULE_TML_SEPARATOR ) )?
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:287:1: (lv_absolute_2_0= RULE_TML_SEPARATOR )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:287:1: (lv_absolute_2_0= RULE_TML_SEPARATOR )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:288:3: lv_absolute_2_0= RULE_TML_SEPARATOR
                    {
                    lv_absolute_2_0=(Token)match(input,RULE_TML_SEPARATOR,FOLLOW_RULE_TML_SEPARATOR_in_ruleExistsTmlExpression606); 

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

            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:304:3: ( (lv_param_3_0= RULE_AT ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_AT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:305:1: (lv_param_3_0= RULE_AT )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:305:1: (lv_param_3_0= RULE_AT )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:306:3: lv_param_3_0= RULE_AT
                    {
                    lv_param_3_0=(Token)match(input,RULE_AT,FOLLOW_RULE_AT_in_ruleExistsTmlExpression629); 

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

            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:322:3: ( (lv_elements_4_0= rulePathElement ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:323:1: (lv_elements_4_0= rulePathElement )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:323:1: (lv_elements_4_0= rulePathElement )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:324:3: lv_elements_4_0= rulePathElement
            {
             
            	        newCompositeNode(grammarAccess.getExistsTmlExpressionAccess().getElementsPathElementParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_rulePathElement_in_ruleExistsTmlExpression656);
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

            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:340:2: (this_TML_SEPARATOR_5= RULE_TML_SEPARATOR ( (lv_elements_6_0= rulePathElement ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_TML_SEPARATOR) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:340:3: this_TML_SEPARATOR_5= RULE_TML_SEPARATOR ( (lv_elements_6_0= rulePathElement ) )
            	    {
            	    this_TML_SEPARATOR_5=(Token)match(input,RULE_TML_SEPARATOR,FOLLOW_RULE_TML_SEPARATOR_in_ruleExistsTmlExpression668); 
            	     
            	        newLeafNode(this_TML_SEPARATOR_5, grammarAccess.getExistsTmlExpressionAccess().getTML_SEPARATORTerminalRuleCall_5_0()); 
            	        
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:344:1: ( (lv_elements_6_0= rulePathElement ) )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:345:1: (lv_elements_6_0= rulePathElement )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:345:1: (lv_elements_6_0= rulePathElement )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:346:3: lv_elements_6_0= rulePathElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExistsTmlExpressionAccess().getElementsPathElementParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePathElement_in_ruleExistsTmlExpression688);
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

            this_SQBRACKET_CLOSE_7=(Token)match(input,RULE_SQBRACKET_CLOSE,FOLLOW_RULE_SQBRACKET_CLOSE_in_ruleExistsTmlExpression701); 
             
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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:374:1: entryRuleMapReferenceParams returns [EObject current=null] : iv_ruleMapReferenceParams= ruleMapReferenceParams EOF ;
    public final EObject entryRuleMapReferenceParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapReferenceParams = null;


        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:375:2: (iv_ruleMapReferenceParams= ruleMapReferenceParams EOF )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:376:2: iv_ruleMapReferenceParams= ruleMapReferenceParams EOF
            {
             newCompositeNode(grammarAccess.getMapReferenceParamsRule()); 
            pushFollow(FOLLOW_ruleMapReferenceParams_in_entryRuleMapReferenceParams736);
            iv_ruleMapReferenceParams=ruleMapReferenceParams();

            state._fsp--;

             current =iv_ruleMapReferenceParams; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapReferenceParams746); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:383:1: ruleMapReferenceParams returns [EObject current=null] : (this_BRACKET_OPEN_0= RULE_BRACKET_OPEN ( (lv_getterParams_1_0= ruleLiteral ) ) (this_COMMA_2= RULE_COMMA ( (lv_getterParams_3_0= ruleLiteral ) ) )* this_BRACKET_CLOSE_4= RULE_BRACKET_CLOSE ) ;
    public final EObject ruleMapReferenceParams() throws RecognitionException {
        EObject current = null;

        Token this_BRACKET_OPEN_0=null;
        Token this_COMMA_2=null;
        Token this_BRACKET_CLOSE_4=null;
        EObject lv_getterParams_1_0 = null;

        EObject lv_getterParams_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:386:28: ( (this_BRACKET_OPEN_0= RULE_BRACKET_OPEN ( (lv_getterParams_1_0= ruleLiteral ) ) (this_COMMA_2= RULE_COMMA ( (lv_getterParams_3_0= ruleLiteral ) ) )* this_BRACKET_CLOSE_4= RULE_BRACKET_CLOSE ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:387:1: (this_BRACKET_OPEN_0= RULE_BRACKET_OPEN ( (lv_getterParams_1_0= ruleLiteral ) ) (this_COMMA_2= RULE_COMMA ( (lv_getterParams_3_0= ruleLiteral ) ) )* this_BRACKET_CLOSE_4= RULE_BRACKET_CLOSE )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:387:1: (this_BRACKET_OPEN_0= RULE_BRACKET_OPEN ( (lv_getterParams_1_0= ruleLiteral ) ) (this_COMMA_2= RULE_COMMA ( (lv_getterParams_3_0= ruleLiteral ) ) )* this_BRACKET_CLOSE_4= RULE_BRACKET_CLOSE )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:387:2: this_BRACKET_OPEN_0= RULE_BRACKET_OPEN ( (lv_getterParams_1_0= ruleLiteral ) ) (this_COMMA_2= RULE_COMMA ( (lv_getterParams_3_0= ruleLiteral ) ) )* this_BRACKET_CLOSE_4= RULE_BRACKET_CLOSE
            {
            this_BRACKET_OPEN_0=(Token)match(input,RULE_BRACKET_OPEN,FOLLOW_RULE_BRACKET_OPEN_in_ruleMapReferenceParams782); 
             
                newLeafNode(this_BRACKET_OPEN_0, grammarAccess.getMapReferenceParamsAccess().getBRACKET_OPENTerminalRuleCall_0()); 
                
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:391:1: ( (lv_getterParams_1_0= ruleLiteral ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:392:1: (lv_getterParams_1_0= ruleLiteral )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:392:1: (lv_getterParams_1_0= ruleLiteral )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:393:3: lv_getterParams_1_0= ruleLiteral
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

            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:409:2: (this_COMMA_2= RULE_COMMA ( (lv_getterParams_3_0= ruleLiteral ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_COMMA) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:409:3: this_COMMA_2= RULE_COMMA ( (lv_getterParams_3_0= ruleLiteral ) )
            	    {
            	    this_COMMA_2=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleMapReferenceParams814); 
            	     
            	        newLeafNode(this_COMMA_2, grammarAccess.getMapReferenceParamsAccess().getCOMMATerminalRuleCall_2_0()); 
            	        
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:413:1: ( (lv_getterParams_3_0= ruleLiteral ) )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:414:1: (lv_getterParams_3_0= ruleLiteral )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:414:1: (lv_getterParams_3_0= ruleLiteral )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:415:3: lv_getterParams_3_0= ruleLiteral
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMapReferenceParamsAccess().getGetterParamsLiteralParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLiteral_in_ruleMapReferenceParams834);
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

            this_BRACKET_CLOSE_4=(Token)match(input,RULE_BRACKET_CLOSE,FOLLOW_RULE_BRACKET_CLOSE_in_ruleMapReferenceParams847); 
             
                newLeafNode(this_BRACKET_CLOSE_4, grammarAccess.getMapReferenceParamsAccess().getBRACKET_CLOSETerminalRuleCall_3()); 
                

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:443:1: entryRuleMapGetReference returns [EObject current=null] : iv_ruleMapGetReference= ruleMapGetReference EOF ;
    public final EObject entryRuleMapGetReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapGetReference = null;


        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:444:2: (iv_ruleMapGetReference= ruleMapGetReference EOF )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:445:2: iv_ruleMapGetReference= ruleMapGetReference EOF
            {
             newCompositeNode(grammarAccess.getMapGetReferenceRule()); 
            pushFollow(FOLLOW_ruleMapGetReference_in_entryRuleMapGetReference882);
            iv_ruleMapGetReference=ruleMapGetReference();

            state._fsp--;

             current =iv_ruleMapGetReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapGetReference892); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:452:1: ruleMapGetReference returns [EObject current=null] : ( ( (lv_operations_0_0= RULE_DOLLAR ) ) ( ( (lv_elements_1_0= RULE_PARENT ) ) this_TML_SEPARATOR_2= RULE_TML_SEPARATOR )* ( (lv_elements_3_0= RULE_ID ) ) ( (lv_referenceParams_4_0= ruleMapReferenceParams ) )? ) ;
    public final EObject ruleMapGetReference() throws RecognitionException {
        EObject current = null;

        Token lv_operations_0_0=null;
        Token lv_elements_1_0=null;
        Token this_TML_SEPARATOR_2=null;
        Token lv_elements_3_0=null;
        EObject lv_referenceParams_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:455:28: ( ( ( (lv_operations_0_0= RULE_DOLLAR ) ) ( ( (lv_elements_1_0= RULE_PARENT ) ) this_TML_SEPARATOR_2= RULE_TML_SEPARATOR )* ( (lv_elements_3_0= RULE_ID ) ) ( (lv_referenceParams_4_0= ruleMapReferenceParams ) )? ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:456:1: ( ( (lv_operations_0_0= RULE_DOLLAR ) ) ( ( (lv_elements_1_0= RULE_PARENT ) ) this_TML_SEPARATOR_2= RULE_TML_SEPARATOR )* ( (lv_elements_3_0= RULE_ID ) ) ( (lv_referenceParams_4_0= ruleMapReferenceParams ) )? )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:456:1: ( ( (lv_operations_0_0= RULE_DOLLAR ) ) ( ( (lv_elements_1_0= RULE_PARENT ) ) this_TML_SEPARATOR_2= RULE_TML_SEPARATOR )* ( (lv_elements_3_0= RULE_ID ) ) ( (lv_referenceParams_4_0= ruleMapReferenceParams ) )? )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:456:2: ( (lv_operations_0_0= RULE_DOLLAR ) ) ( ( (lv_elements_1_0= RULE_PARENT ) ) this_TML_SEPARATOR_2= RULE_TML_SEPARATOR )* ( (lv_elements_3_0= RULE_ID ) ) ( (lv_referenceParams_4_0= ruleMapReferenceParams ) )?
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:456:2: ( (lv_operations_0_0= RULE_DOLLAR ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:457:1: (lv_operations_0_0= RULE_DOLLAR )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:457:1: (lv_operations_0_0= RULE_DOLLAR )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:458:3: lv_operations_0_0= RULE_DOLLAR
            {
            lv_operations_0_0=(Token)match(input,RULE_DOLLAR,FOLLOW_RULE_DOLLAR_in_ruleMapGetReference934); 

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

            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:474:2: ( ( (lv_elements_1_0= RULE_PARENT ) ) this_TML_SEPARATOR_2= RULE_TML_SEPARATOR )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_PARENT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:474:3: ( (lv_elements_1_0= RULE_PARENT ) ) this_TML_SEPARATOR_2= RULE_TML_SEPARATOR
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:474:3: ( (lv_elements_1_0= RULE_PARENT ) )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:475:1: (lv_elements_1_0= RULE_PARENT )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:475:1: (lv_elements_1_0= RULE_PARENT )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:476:3: lv_elements_1_0= RULE_PARENT
            	    {
            	    lv_elements_1_0=(Token)match(input,RULE_PARENT,FOLLOW_RULE_PARENT_in_ruleMapGetReference957); 

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

            	    this_TML_SEPARATOR_2=(Token)match(input,RULE_TML_SEPARATOR,FOLLOW_RULE_TML_SEPARATOR_in_ruleMapGetReference973); 
            	     
            	        newLeafNode(this_TML_SEPARATOR_2, grammarAccess.getMapGetReferenceAccess().getTML_SEPARATORTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:496:3: ( (lv_elements_3_0= RULE_ID ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:497:1: (lv_elements_3_0= RULE_ID )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:497:1: (lv_elements_3_0= RULE_ID )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:498:3: lv_elements_3_0= RULE_ID
            {
            lv_elements_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapGetReference991); 

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

            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:514:2: ( (lv_referenceParams_4_0= ruleMapReferenceParams ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_BRACKET_OPEN) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:515:1: (lv_referenceParams_4_0= ruleMapReferenceParams )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:515:1: (lv_referenceParams_4_0= ruleMapReferenceParams )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:516:3: lv_referenceParams_4_0= ruleMapReferenceParams
                    {
                     
                    	        newCompositeNode(grammarAccess.getMapGetReferenceAccess().getReferenceParamsMapReferenceParamsParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMapReferenceParams_in_ruleMapGetReference1017);
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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:540:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:541:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:542:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression1054);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;

             current =iv_ruleOrExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression1064); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:549:1: ruleOrExpression returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleAndExpression ) ) ( ( (lv_operations_1_0= RULE_OR ) ) ( (lv_parameters_2_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operations_1_0=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:552:28: ( ( ( (lv_parameters_0_0= ruleAndExpression ) ) ( ( (lv_operations_1_0= RULE_OR ) ) ( (lv_parameters_2_0= ruleAndExpression ) ) )* ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:553:1: ( ( (lv_parameters_0_0= ruleAndExpression ) ) ( ( (lv_operations_1_0= RULE_OR ) ) ( (lv_parameters_2_0= ruleAndExpression ) ) )* )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:553:1: ( ( (lv_parameters_0_0= ruleAndExpression ) ) ( ( (lv_operations_1_0= RULE_OR ) ) ( (lv_parameters_2_0= ruleAndExpression ) ) )* )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:553:2: ( (lv_parameters_0_0= ruleAndExpression ) ) ( ( (lv_operations_1_0= RULE_OR ) ) ( (lv_parameters_2_0= ruleAndExpression ) ) )*
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:553:2: ( (lv_parameters_0_0= ruleAndExpression ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:554:1: (lv_parameters_0_0= ruleAndExpression )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:554:1: (lv_parameters_0_0= ruleAndExpression )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:555:3: lv_parameters_0_0= ruleAndExpression
            {
             
            	        newCompositeNode(grammarAccess.getOrExpressionAccess().getParametersAndExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression1110);
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

            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:571:2: ( ( (lv_operations_1_0= RULE_OR ) ) ( (lv_parameters_2_0= ruleAndExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_OR) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:571:3: ( (lv_operations_1_0= RULE_OR ) ) ( (lv_parameters_2_0= ruleAndExpression ) )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:571:3: ( (lv_operations_1_0= RULE_OR ) )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:572:1: (lv_operations_1_0= RULE_OR )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:572:1: (lv_operations_1_0= RULE_OR )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:573:3: lv_operations_1_0= RULE_OR
            	    {
            	    lv_operations_1_0=(Token)match(input,RULE_OR,FOLLOW_RULE_OR_in_ruleOrExpression1128); 

            	    			newLeafNode(lv_operations_1_0, grammarAccess.getOrExpressionAccess().getOperationsORTerminalRuleCall_1_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOrExpressionRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"operations",
            	            		lv_operations_1_0, 
            	            		"OR");
            	    	    

            	    }


            	    }

            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:589:2: ( (lv_parameters_2_0= ruleAndExpression ) )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:590:1: (lv_parameters_2_0= ruleAndExpression )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:590:1: (lv_parameters_2_0= ruleAndExpression )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:591:3: lv_parameters_2_0= ruleAndExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrExpressionAccess().getParametersAndExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression1154);
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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:615:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:616:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:617:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression1192);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression1202); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:624:1: ruleAndExpression returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleEqualityExpression ) ) ( ( (lv_operations_1_0= RULE_AND ) ) ( (lv_parameters_2_0= ruleEqualityExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operations_1_0=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:627:28: ( ( ( (lv_parameters_0_0= ruleEqualityExpression ) ) ( ( (lv_operations_1_0= RULE_AND ) ) ( (lv_parameters_2_0= ruleEqualityExpression ) ) )* ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:628:1: ( ( (lv_parameters_0_0= ruleEqualityExpression ) ) ( ( (lv_operations_1_0= RULE_AND ) ) ( (lv_parameters_2_0= ruleEqualityExpression ) ) )* )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:628:1: ( ( (lv_parameters_0_0= ruleEqualityExpression ) ) ( ( (lv_operations_1_0= RULE_AND ) ) ( (lv_parameters_2_0= ruleEqualityExpression ) ) )* )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:628:2: ( (lv_parameters_0_0= ruleEqualityExpression ) ) ( ( (lv_operations_1_0= RULE_AND ) ) ( (lv_parameters_2_0= ruleEqualityExpression ) ) )*
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:628:2: ( (lv_parameters_0_0= ruleEqualityExpression ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:629:1: (lv_parameters_0_0= ruleEqualityExpression )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:629:1: (lv_parameters_0_0= ruleEqualityExpression )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:630:3: lv_parameters_0_0= ruleEqualityExpression
            {
             
            	        newCompositeNode(grammarAccess.getAndExpressionAccess().getParametersEqualityExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEqualityExpression_in_ruleAndExpression1248);
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

            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:646:2: ( ( (lv_operations_1_0= RULE_AND ) ) ( (lv_parameters_2_0= ruleEqualityExpression ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_AND) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:646:3: ( (lv_operations_1_0= RULE_AND ) ) ( (lv_parameters_2_0= ruleEqualityExpression ) )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:646:3: ( (lv_operations_1_0= RULE_AND ) )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:647:1: (lv_operations_1_0= RULE_AND )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:647:1: (lv_operations_1_0= RULE_AND )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:648:3: lv_operations_1_0= RULE_AND
            	    {
            	    lv_operations_1_0=(Token)match(input,RULE_AND,FOLLOW_RULE_AND_in_ruleAndExpression1266); 

            	    			newLeafNode(lv_operations_1_0, grammarAccess.getAndExpressionAccess().getOperationsANDTerminalRuleCall_1_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAndExpressionRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"operations",
            	            		lv_operations_1_0, 
            	            		"AND");
            	    	    

            	    }


            	    }

            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:664:2: ( (lv_parameters_2_0= ruleEqualityExpression ) )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:665:1: (lv_parameters_2_0= ruleEqualityExpression )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:665:1: (lv_parameters_2_0= ruleEqualityExpression )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:666:3: lv_parameters_2_0= ruleEqualityExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndExpressionAccess().getParametersEqualityExpressionParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEqualityExpression_in_ruleAndExpression1292);
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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:690:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:691:2: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:692:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
            {
             newCompositeNode(grammarAccess.getEqualityExpressionRule()); 
            pushFollow(FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression1330);
            iv_ruleEqualityExpression=ruleEqualityExpression();

            state._fsp--;

             current =iv_ruleEqualityExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualityExpression1340); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:699:1: ruleEqualityExpression returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleRelationalExpression ) ) ( ( ( (lv_operations_1_0= RULE_EQUALSEQUALS ) ) ( (lv_parameters_2_0= ruleRelationalExpression ) ) ) | ( ( (lv_operations_3_0= RULE_NEQUALS ) ) ( (lv_parameters_4_0= ruleRelationalExpression ) ) ) )? ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operations_1_0=null;
        Token lv_operations_3_0=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:702:28: ( ( ( (lv_parameters_0_0= ruleRelationalExpression ) ) ( ( ( (lv_operations_1_0= RULE_EQUALSEQUALS ) ) ( (lv_parameters_2_0= ruleRelationalExpression ) ) ) | ( ( (lv_operations_3_0= RULE_NEQUALS ) ) ( (lv_parameters_4_0= ruleRelationalExpression ) ) ) )? ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:703:1: ( ( (lv_parameters_0_0= ruleRelationalExpression ) ) ( ( ( (lv_operations_1_0= RULE_EQUALSEQUALS ) ) ( (lv_parameters_2_0= ruleRelationalExpression ) ) ) | ( ( (lv_operations_3_0= RULE_NEQUALS ) ) ( (lv_parameters_4_0= ruleRelationalExpression ) ) ) )? )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:703:1: ( ( (lv_parameters_0_0= ruleRelationalExpression ) ) ( ( ( (lv_operations_1_0= RULE_EQUALSEQUALS ) ) ( (lv_parameters_2_0= ruleRelationalExpression ) ) ) | ( ( (lv_operations_3_0= RULE_NEQUALS ) ) ( (lv_parameters_4_0= ruleRelationalExpression ) ) ) )? )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:703:2: ( (lv_parameters_0_0= ruleRelationalExpression ) ) ( ( ( (lv_operations_1_0= RULE_EQUALSEQUALS ) ) ( (lv_parameters_2_0= ruleRelationalExpression ) ) ) | ( ( (lv_operations_3_0= RULE_NEQUALS ) ) ( (lv_parameters_4_0= ruleRelationalExpression ) ) ) )?
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:703:2: ( (lv_parameters_0_0= ruleRelationalExpression ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:704:1: (lv_parameters_0_0= ruleRelationalExpression )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:704:1: (lv_parameters_0_0= ruleRelationalExpression )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:705:3: lv_parameters_0_0= ruleRelationalExpression
            {
             
            	        newCompositeNode(grammarAccess.getEqualityExpressionAccess().getParametersRelationalExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleRelationalExpression_in_ruleEqualityExpression1386);
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

            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:721:2: ( ( ( (lv_operations_1_0= RULE_EQUALSEQUALS ) ) ( (lv_parameters_2_0= ruleRelationalExpression ) ) ) | ( ( (lv_operations_3_0= RULE_NEQUALS ) ) ( (lv_parameters_4_0= ruleRelationalExpression ) ) ) )?
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_EQUALSEQUALS) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_NEQUALS) ) {
                alt13=2;
            }
            switch (alt13) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:721:3: ( ( (lv_operations_1_0= RULE_EQUALSEQUALS ) ) ( (lv_parameters_2_0= ruleRelationalExpression ) ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:721:3: ( ( (lv_operations_1_0= RULE_EQUALSEQUALS ) ) ( (lv_parameters_2_0= ruleRelationalExpression ) ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:721:4: ( (lv_operations_1_0= RULE_EQUALSEQUALS ) ) ( (lv_parameters_2_0= ruleRelationalExpression ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:721:4: ( (lv_operations_1_0= RULE_EQUALSEQUALS ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:722:1: (lv_operations_1_0= RULE_EQUALSEQUALS )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:722:1: (lv_operations_1_0= RULE_EQUALSEQUALS )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:723:3: lv_operations_1_0= RULE_EQUALSEQUALS
                    {
                    lv_operations_1_0=(Token)match(input,RULE_EQUALSEQUALS,FOLLOW_RULE_EQUALSEQUALS_in_ruleEqualityExpression1405); 

                    			newLeafNode(lv_operations_1_0, grammarAccess.getEqualityExpressionAccess().getOperationsEQUALSEQUALSTerminalRuleCall_1_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEqualityExpressionRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"operations",
                            		lv_operations_1_0, 
                            		"EQUALSEQUALS");
                    	    

                    }


                    }

                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:739:2: ( (lv_parameters_2_0= ruleRelationalExpression ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:740:1: (lv_parameters_2_0= ruleRelationalExpression )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:740:1: (lv_parameters_2_0= ruleRelationalExpression )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:741:3: lv_parameters_2_0= ruleRelationalExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getEqualityExpressionAccess().getParametersRelationalExpressionParserRuleCall_1_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRelationalExpression_in_ruleEqualityExpression1431);
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
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:758:6: ( ( (lv_operations_3_0= RULE_NEQUALS ) ) ( (lv_parameters_4_0= ruleRelationalExpression ) ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:758:6: ( ( (lv_operations_3_0= RULE_NEQUALS ) ) ( (lv_parameters_4_0= ruleRelationalExpression ) ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:758:7: ( (lv_operations_3_0= RULE_NEQUALS ) ) ( (lv_parameters_4_0= ruleRelationalExpression ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:758:7: ( (lv_operations_3_0= RULE_NEQUALS ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:759:1: (lv_operations_3_0= RULE_NEQUALS )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:759:1: (lv_operations_3_0= RULE_NEQUALS )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:760:3: lv_operations_3_0= RULE_NEQUALS
                    {
                    lv_operations_3_0=(Token)match(input,RULE_NEQUALS,FOLLOW_RULE_NEQUALS_in_ruleEqualityExpression1456); 

                    			newLeafNode(lv_operations_3_0, grammarAccess.getEqualityExpressionAccess().getOperationsNEQUALSTerminalRuleCall_1_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEqualityExpressionRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"operations",
                            		lv_operations_3_0, 
                            		"NEQUALS");
                    	    

                    }


                    }

                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:776:2: ( (lv_parameters_4_0= ruleRelationalExpression ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:777:1: (lv_parameters_4_0= ruleRelationalExpression )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:777:1: (lv_parameters_4_0= ruleRelationalExpression )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:778:3: lv_parameters_4_0= ruleRelationalExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getEqualityExpressionAccess().getParametersRelationalExpressionParserRuleCall_1_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRelationalExpression_in_ruleEqualityExpression1482);
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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:802:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:803:2: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:804:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
             newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            pushFollow(FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression1521);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;

             current =iv_ruleRelationalExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpression1531); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:811:1: ruleRelationalExpression returns [EObject current=null] : ( () ( (lv_parameters_1_0= ruleAdditiveExpression ) ) ( ( ( (lv_operations_2_0= RULE_XML_LT ) ) ( (lv_parameters_3_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_4_0= RULE_XML_GT ) ) ( (lv_parameters_5_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_6_0= RULE_XML_LTEQ ) ) ( (lv_parameters_7_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_8_0= RULE_XML_GTEQ ) ) ( (lv_parameters_9_0= ruleAdditiveExpression ) ) ) )? ) ;
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
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:814:28: ( ( () ( (lv_parameters_1_0= ruleAdditiveExpression ) ) ( ( ( (lv_operations_2_0= RULE_XML_LT ) ) ( (lv_parameters_3_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_4_0= RULE_XML_GT ) ) ( (lv_parameters_5_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_6_0= RULE_XML_LTEQ ) ) ( (lv_parameters_7_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_8_0= RULE_XML_GTEQ ) ) ( (lv_parameters_9_0= ruleAdditiveExpression ) ) ) )? ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:815:1: ( () ( (lv_parameters_1_0= ruleAdditiveExpression ) ) ( ( ( (lv_operations_2_0= RULE_XML_LT ) ) ( (lv_parameters_3_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_4_0= RULE_XML_GT ) ) ( (lv_parameters_5_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_6_0= RULE_XML_LTEQ ) ) ( (lv_parameters_7_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_8_0= RULE_XML_GTEQ ) ) ( (lv_parameters_9_0= ruleAdditiveExpression ) ) ) )? )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:815:1: ( () ( (lv_parameters_1_0= ruleAdditiveExpression ) ) ( ( ( (lv_operations_2_0= RULE_XML_LT ) ) ( (lv_parameters_3_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_4_0= RULE_XML_GT ) ) ( (lv_parameters_5_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_6_0= RULE_XML_LTEQ ) ) ( (lv_parameters_7_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_8_0= RULE_XML_GTEQ ) ) ( (lv_parameters_9_0= ruleAdditiveExpression ) ) ) )? )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:815:2: () ( (lv_parameters_1_0= ruleAdditiveExpression ) ) ( ( ( (lv_operations_2_0= RULE_XML_LT ) ) ( (lv_parameters_3_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_4_0= RULE_XML_GT ) ) ( (lv_parameters_5_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_6_0= RULE_XML_LTEQ ) ) ( (lv_parameters_7_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_8_0= RULE_XML_GTEQ ) ) ( (lv_parameters_9_0= ruleAdditiveExpression ) ) ) )?
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:815:2: ()
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:816:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRelationalExpressionAccess().getExpressionAction_0(),
                        current);
                

            }

            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:821:2: ( (lv_parameters_1_0= ruleAdditiveExpression ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:822:1: (lv_parameters_1_0= ruleAdditiveExpression )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:822:1: (lv_parameters_1_0= ruleAdditiveExpression )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:823:3: lv_parameters_1_0= ruleAdditiveExpression
            {
             
            	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getParametersAdditiveExpressionParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression1586);
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

            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:839:2: ( ( ( (lv_operations_2_0= RULE_XML_LT ) ) ( (lv_parameters_3_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_4_0= RULE_XML_GT ) ) ( (lv_parameters_5_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_6_0= RULE_XML_LTEQ ) ) ( (lv_parameters_7_0= ruleAdditiveExpression ) ) ) | ( ( (lv_operations_8_0= RULE_XML_GTEQ ) ) ( (lv_parameters_9_0= ruleAdditiveExpression ) ) ) )?
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
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:839:3: ( ( (lv_operations_2_0= RULE_XML_LT ) ) ( (lv_parameters_3_0= ruleAdditiveExpression ) ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:839:3: ( ( (lv_operations_2_0= RULE_XML_LT ) ) ( (lv_parameters_3_0= ruleAdditiveExpression ) ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:839:4: ( (lv_operations_2_0= RULE_XML_LT ) ) ( (lv_parameters_3_0= ruleAdditiveExpression ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:839:4: ( (lv_operations_2_0= RULE_XML_LT ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:840:1: (lv_operations_2_0= RULE_XML_LT )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:840:1: (lv_operations_2_0= RULE_XML_LT )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:841:3: lv_operations_2_0= RULE_XML_LT
                    {
                    lv_operations_2_0=(Token)match(input,RULE_XML_LT,FOLLOW_RULE_XML_LT_in_ruleRelationalExpression1605); 

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

                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:857:2: ( (lv_parameters_3_0= ruleAdditiveExpression ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:858:1: (lv_parameters_3_0= ruleAdditiveExpression )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:858:1: (lv_parameters_3_0= ruleAdditiveExpression )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:859:3: lv_parameters_3_0= ruleAdditiveExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getParametersAdditiveExpressionParserRuleCall_2_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression1631);
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
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:876:6: ( ( (lv_operations_4_0= RULE_XML_GT ) ) ( (lv_parameters_5_0= ruleAdditiveExpression ) ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:876:6: ( ( (lv_operations_4_0= RULE_XML_GT ) ) ( (lv_parameters_5_0= ruleAdditiveExpression ) ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:876:7: ( (lv_operations_4_0= RULE_XML_GT ) ) ( (lv_parameters_5_0= ruleAdditiveExpression ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:876:7: ( (lv_operations_4_0= RULE_XML_GT ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:877:1: (lv_operations_4_0= RULE_XML_GT )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:877:1: (lv_operations_4_0= RULE_XML_GT )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:878:3: lv_operations_4_0= RULE_XML_GT
                    {
                    lv_operations_4_0=(Token)match(input,RULE_XML_GT,FOLLOW_RULE_XML_GT_in_ruleRelationalExpression1656); 

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

                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:894:2: ( (lv_parameters_5_0= ruleAdditiveExpression ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:895:1: (lv_parameters_5_0= ruleAdditiveExpression )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:895:1: (lv_parameters_5_0= ruleAdditiveExpression )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:896:3: lv_parameters_5_0= ruleAdditiveExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getParametersAdditiveExpressionParserRuleCall_2_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression1682);
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
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:913:6: ( ( (lv_operations_6_0= RULE_XML_LTEQ ) ) ( (lv_parameters_7_0= ruleAdditiveExpression ) ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:913:6: ( ( (lv_operations_6_0= RULE_XML_LTEQ ) ) ( (lv_parameters_7_0= ruleAdditiveExpression ) ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:913:7: ( (lv_operations_6_0= RULE_XML_LTEQ ) ) ( (lv_parameters_7_0= ruleAdditiveExpression ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:913:7: ( (lv_operations_6_0= RULE_XML_LTEQ ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:914:1: (lv_operations_6_0= RULE_XML_LTEQ )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:914:1: (lv_operations_6_0= RULE_XML_LTEQ )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:915:3: lv_operations_6_0= RULE_XML_LTEQ
                    {
                    lv_operations_6_0=(Token)match(input,RULE_XML_LTEQ,FOLLOW_RULE_XML_LTEQ_in_ruleRelationalExpression1707); 

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

                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:931:2: ( (lv_parameters_7_0= ruleAdditiveExpression ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:932:1: (lv_parameters_7_0= ruleAdditiveExpression )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:932:1: (lv_parameters_7_0= ruleAdditiveExpression )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:933:3: lv_parameters_7_0= ruleAdditiveExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getParametersAdditiveExpressionParserRuleCall_2_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression1733);
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
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:950:6: ( ( (lv_operations_8_0= RULE_XML_GTEQ ) ) ( (lv_parameters_9_0= ruleAdditiveExpression ) ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:950:6: ( ( (lv_operations_8_0= RULE_XML_GTEQ ) ) ( (lv_parameters_9_0= ruleAdditiveExpression ) ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:950:7: ( (lv_operations_8_0= RULE_XML_GTEQ ) ) ( (lv_parameters_9_0= ruleAdditiveExpression ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:950:7: ( (lv_operations_8_0= RULE_XML_GTEQ ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:951:1: (lv_operations_8_0= RULE_XML_GTEQ )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:951:1: (lv_operations_8_0= RULE_XML_GTEQ )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:952:3: lv_operations_8_0= RULE_XML_GTEQ
                    {
                    lv_operations_8_0=(Token)match(input,RULE_XML_GTEQ,FOLLOW_RULE_XML_GTEQ_in_ruleRelationalExpression1758); 

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

                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:968:2: ( (lv_parameters_9_0= ruleAdditiveExpression ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:969:1: (lv_parameters_9_0= ruleAdditiveExpression )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:969:1: (lv_parameters_9_0= ruleAdditiveExpression )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:970:3: lv_parameters_9_0= ruleAdditiveExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getParametersAdditiveExpressionParserRuleCall_2_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression1784);
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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:994:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:995:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:996:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
             newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression1823);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;

             current =iv_ruleAdditiveExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpression1833); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1003:1: ruleAdditiveExpression returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleMultiplicativeExpression ) ) ( (this_PLUS_1= RULE_PLUS ( (lv_parameters_2_0= ruleMultiplicativeExpression ) ) ) | (this_MINUS_3= RULE_MINUS ( (lv_parameters_4_0= ruleMultiplicativeExpression ) ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        Token this_PLUS_1=null;
        Token this_MINUS_3=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1006:28: ( ( ( (lv_parameters_0_0= ruleMultiplicativeExpression ) ) ( (this_PLUS_1= RULE_PLUS ( (lv_parameters_2_0= ruleMultiplicativeExpression ) ) ) | (this_MINUS_3= RULE_MINUS ( (lv_parameters_4_0= ruleMultiplicativeExpression ) ) ) )* ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1007:1: ( ( (lv_parameters_0_0= ruleMultiplicativeExpression ) ) ( (this_PLUS_1= RULE_PLUS ( (lv_parameters_2_0= ruleMultiplicativeExpression ) ) ) | (this_MINUS_3= RULE_MINUS ( (lv_parameters_4_0= ruleMultiplicativeExpression ) ) ) )* )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1007:1: ( ( (lv_parameters_0_0= ruleMultiplicativeExpression ) ) ( (this_PLUS_1= RULE_PLUS ( (lv_parameters_2_0= ruleMultiplicativeExpression ) ) ) | (this_MINUS_3= RULE_MINUS ( (lv_parameters_4_0= ruleMultiplicativeExpression ) ) ) )* )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1007:2: ( (lv_parameters_0_0= ruleMultiplicativeExpression ) ) ( (this_PLUS_1= RULE_PLUS ( (lv_parameters_2_0= ruleMultiplicativeExpression ) ) ) | (this_MINUS_3= RULE_MINUS ( (lv_parameters_4_0= ruleMultiplicativeExpression ) ) ) )*
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1007:2: ( (lv_parameters_0_0= ruleMultiplicativeExpression ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1008:1: (lv_parameters_0_0= ruleMultiplicativeExpression )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1008:1: (lv_parameters_0_0= ruleMultiplicativeExpression )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1009:3: lv_parameters_0_0= ruleMultiplicativeExpression
            {
             
            	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getParametersMultiplicativeExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression1879);
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

            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1025:2: ( (this_PLUS_1= RULE_PLUS ( (lv_parameters_2_0= ruleMultiplicativeExpression ) ) ) | (this_MINUS_3= RULE_MINUS ( (lv_parameters_4_0= ruleMultiplicativeExpression ) ) ) )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_PLUS) ) {
                    alt15=1;
                }
                else if ( (LA15_0==RULE_MINUS) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1025:3: (this_PLUS_1= RULE_PLUS ( (lv_parameters_2_0= ruleMultiplicativeExpression ) ) )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1025:3: (this_PLUS_1= RULE_PLUS ( (lv_parameters_2_0= ruleMultiplicativeExpression ) ) )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1025:4: this_PLUS_1= RULE_PLUS ( (lv_parameters_2_0= ruleMultiplicativeExpression ) )
            	    {
            	    this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleAdditiveExpression1892); 
            	     
            	        newLeafNode(this_PLUS_1, grammarAccess.getAdditiveExpressionAccess().getPLUSTerminalRuleCall_1_0_0()); 
            	        
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1029:1: ( (lv_parameters_2_0= ruleMultiplicativeExpression ) )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1030:1: (lv_parameters_2_0= ruleMultiplicativeExpression )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1030:1: (lv_parameters_2_0= ruleMultiplicativeExpression )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1031:3: lv_parameters_2_0= ruleMultiplicativeExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getParametersMultiplicativeExpressionParserRuleCall_1_0_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression1912);
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
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1048:6: (this_MINUS_3= RULE_MINUS ( (lv_parameters_4_0= ruleMultiplicativeExpression ) ) )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1048:6: (this_MINUS_3= RULE_MINUS ( (lv_parameters_4_0= ruleMultiplicativeExpression ) ) )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1048:7: this_MINUS_3= RULE_MINUS ( (lv_parameters_4_0= ruleMultiplicativeExpression ) )
            	    {
            	    this_MINUS_3=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleAdditiveExpression1931); 
            	     
            	        newLeafNode(this_MINUS_3, grammarAccess.getAdditiveExpressionAccess().getMINUSTerminalRuleCall_1_1_0()); 
            	        
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1052:1: ( (lv_parameters_4_0= ruleMultiplicativeExpression ) )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1053:1: (lv_parameters_4_0= ruleMultiplicativeExpression )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1053:1: (lv_parameters_4_0= ruleMultiplicativeExpression )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1054:3: lv_parameters_4_0= ruleMultiplicativeExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getParametersMultiplicativeExpressionParserRuleCall_1_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression1951);
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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1078:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1079:2: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1080:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
             newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression1990);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;

             current =iv_ruleMultiplicativeExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeExpression2000); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1087:1: ruleMultiplicativeExpression returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleUnaryExpression ) ) ( ( ( (lv_operations_1_0= RULE_MULTIPLY ) ) ( (lv_parameters_2_0= ruleUnaryExpression ) ) ) | ( ( (lv_operations_3_0= RULE_TML_SEPARATOR ) ) ( (lv_parameters_4_0= ruleUnaryExpression ) ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operations_1_0=null;
        Token lv_operations_3_0=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1090:28: ( ( ( (lv_parameters_0_0= ruleUnaryExpression ) ) ( ( ( (lv_operations_1_0= RULE_MULTIPLY ) ) ( (lv_parameters_2_0= ruleUnaryExpression ) ) ) | ( ( (lv_operations_3_0= RULE_TML_SEPARATOR ) ) ( (lv_parameters_4_0= ruleUnaryExpression ) ) ) )* ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1091:1: ( ( (lv_parameters_0_0= ruleUnaryExpression ) ) ( ( ( (lv_operations_1_0= RULE_MULTIPLY ) ) ( (lv_parameters_2_0= ruleUnaryExpression ) ) ) | ( ( (lv_operations_3_0= RULE_TML_SEPARATOR ) ) ( (lv_parameters_4_0= ruleUnaryExpression ) ) ) )* )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1091:1: ( ( (lv_parameters_0_0= ruleUnaryExpression ) ) ( ( ( (lv_operations_1_0= RULE_MULTIPLY ) ) ( (lv_parameters_2_0= ruleUnaryExpression ) ) ) | ( ( (lv_operations_3_0= RULE_TML_SEPARATOR ) ) ( (lv_parameters_4_0= ruleUnaryExpression ) ) ) )* )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1091:2: ( (lv_parameters_0_0= ruleUnaryExpression ) ) ( ( ( (lv_operations_1_0= RULE_MULTIPLY ) ) ( (lv_parameters_2_0= ruleUnaryExpression ) ) ) | ( ( (lv_operations_3_0= RULE_TML_SEPARATOR ) ) ( (lv_parameters_4_0= ruleUnaryExpression ) ) ) )*
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1091:2: ( (lv_parameters_0_0= ruleUnaryExpression ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1092:1: (lv_parameters_0_0= ruleUnaryExpression )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1092:1: (lv_parameters_0_0= ruleUnaryExpression )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1093:3: lv_parameters_0_0= ruleUnaryExpression
            {
             
            	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getParametersUnaryExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleUnaryExpression_in_ruleMultiplicativeExpression2046);
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

            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1109:2: ( ( ( (lv_operations_1_0= RULE_MULTIPLY ) ) ( (lv_parameters_2_0= ruleUnaryExpression ) ) ) | ( ( (lv_operations_3_0= RULE_TML_SEPARATOR ) ) ( (lv_parameters_4_0= ruleUnaryExpression ) ) ) )*
            loop16:
            do {
                int alt16=3;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_MULTIPLY) ) {
                    alt16=1;
                }
                else if ( (LA16_0==RULE_TML_SEPARATOR) ) {
                    alt16=2;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1109:3: ( ( (lv_operations_1_0= RULE_MULTIPLY ) ) ( (lv_parameters_2_0= ruleUnaryExpression ) ) )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1109:3: ( ( (lv_operations_1_0= RULE_MULTIPLY ) ) ( (lv_parameters_2_0= ruleUnaryExpression ) ) )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1109:4: ( (lv_operations_1_0= RULE_MULTIPLY ) ) ( (lv_parameters_2_0= ruleUnaryExpression ) )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1109:4: ( (lv_operations_1_0= RULE_MULTIPLY ) )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1110:1: (lv_operations_1_0= RULE_MULTIPLY )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1110:1: (lv_operations_1_0= RULE_MULTIPLY )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1111:3: lv_operations_1_0= RULE_MULTIPLY
            	    {
            	    lv_operations_1_0=(Token)match(input,RULE_MULTIPLY,FOLLOW_RULE_MULTIPLY_in_ruleMultiplicativeExpression2065); 

            	    			newLeafNode(lv_operations_1_0, grammarAccess.getMultiplicativeExpressionAccess().getOperationsMULTIPLYTerminalRuleCall_1_0_0_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMultiplicativeExpressionRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"operations",
            	            		lv_operations_1_0, 
            	            		"MULTIPLY");
            	    	    

            	    }


            	    }

            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1127:2: ( (lv_parameters_2_0= ruleUnaryExpression ) )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1128:1: (lv_parameters_2_0= ruleUnaryExpression )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1128:1: (lv_parameters_2_0= ruleUnaryExpression )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1129:3: lv_parameters_2_0= ruleUnaryExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getParametersUnaryExpressionParserRuleCall_1_0_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUnaryExpression_in_ruleMultiplicativeExpression2091);
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
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1146:6: ( ( (lv_operations_3_0= RULE_TML_SEPARATOR ) ) ( (lv_parameters_4_0= ruleUnaryExpression ) ) )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1146:6: ( ( (lv_operations_3_0= RULE_TML_SEPARATOR ) ) ( (lv_parameters_4_0= ruleUnaryExpression ) ) )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1146:7: ( (lv_operations_3_0= RULE_TML_SEPARATOR ) ) ( (lv_parameters_4_0= ruleUnaryExpression ) )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1146:7: ( (lv_operations_3_0= RULE_TML_SEPARATOR ) )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1147:1: (lv_operations_3_0= RULE_TML_SEPARATOR )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1147:1: (lv_operations_3_0= RULE_TML_SEPARATOR )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1148:3: lv_operations_3_0= RULE_TML_SEPARATOR
            	    {
            	    lv_operations_3_0=(Token)match(input,RULE_TML_SEPARATOR,FOLLOW_RULE_TML_SEPARATOR_in_ruleMultiplicativeExpression2116); 

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

            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1164:2: ( (lv_parameters_4_0= ruleUnaryExpression ) )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1165:1: (lv_parameters_4_0= ruleUnaryExpression )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1165:1: (lv_parameters_4_0= ruleUnaryExpression )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1166:3: lv_parameters_4_0= ruleUnaryExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getParametersUnaryExpressionParserRuleCall_1_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUnaryExpression_in_ruleMultiplicativeExpression2142);
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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1190:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1191:2: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1192:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression2181);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;

             current =iv_ruleUnaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpression2191); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1199:1: ruleUnaryExpression returns [EObject current=null] : ( ( ( ( (lv_operations_0_0= RULE_NOT ) ) ( (lv_parameters_1_0= rulePrimaryExpression ) ) ) | ( ( (lv_operations_2_0= RULE_MINUS ) ) ( (lv_parameters_3_0= rulePrimaryExpression ) ) ) ) | this_PrimaryExpression_4= rulePrimaryExpression ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operations_0_0=null;
        Token lv_operations_2_0=null;
        EObject lv_parameters_1_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject this_PrimaryExpression_4 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1202:28: ( ( ( ( ( (lv_operations_0_0= RULE_NOT ) ) ( (lv_parameters_1_0= rulePrimaryExpression ) ) ) | ( ( (lv_operations_2_0= RULE_MINUS ) ) ( (lv_parameters_3_0= rulePrimaryExpression ) ) ) ) | this_PrimaryExpression_4= rulePrimaryExpression ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1203:1: ( ( ( ( (lv_operations_0_0= RULE_NOT ) ) ( (lv_parameters_1_0= rulePrimaryExpression ) ) ) | ( ( (lv_operations_2_0= RULE_MINUS ) ) ( (lv_parameters_3_0= rulePrimaryExpression ) ) ) ) | this_PrimaryExpression_4= rulePrimaryExpression )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1203:1: ( ( ( ( (lv_operations_0_0= RULE_NOT ) ) ( (lv_parameters_1_0= rulePrimaryExpression ) ) ) | ( ( (lv_operations_2_0= RULE_MINUS ) ) ( (lv_parameters_3_0= rulePrimaryExpression ) ) ) ) | this_PrimaryExpression_4= rulePrimaryExpression )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_MINUS||LA18_0==RULE_NOT) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ID||LA18_0==RULE_SQBRACKET_OPEN||(LA18_0>=RULE_TML_EXISTS && LA18_0<=RULE_BRACKET_OPEN)||LA18_0==RULE_DOLLAR||LA18_0==RULE_NUMBER||(LA18_0>=RULE_LITERALSTRING && LA18_0<=RULE_CURLYOPEN)||(LA18_0>=RULE_NULL && LA18_0<=RULE_FALSE)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1203:2: ( ( ( (lv_operations_0_0= RULE_NOT ) ) ( (lv_parameters_1_0= rulePrimaryExpression ) ) ) | ( ( (lv_operations_2_0= RULE_MINUS ) ) ( (lv_parameters_3_0= rulePrimaryExpression ) ) ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1203:2: ( ( ( (lv_operations_0_0= RULE_NOT ) ) ( (lv_parameters_1_0= rulePrimaryExpression ) ) ) | ( ( (lv_operations_2_0= RULE_MINUS ) ) ( (lv_parameters_3_0= rulePrimaryExpression ) ) ) )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_NOT) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==RULE_MINUS) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1203:3: ( ( (lv_operations_0_0= RULE_NOT ) ) ( (lv_parameters_1_0= rulePrimaryExpression ) ) )
                            {
                            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1203:3: ( ( (lv_operations_0_0= RULE_NOT ) ) ( (lv_parameters_1_0= rulePrimaryExpression ) ) )
                            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1203:4: ( (lv_operations_0_0= RULE_NOT ) ) ( (lv_parameters_1_0= rulePrimaryExpression ) )
                            {
                            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1203:4: ( (lv_operations_0_0= RULE_NOT ) )
                            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1204:1: (lv_operations_0_0= RULE_NOT )
                            {
                            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1204:1: (lv_operations_0_0= RULE_NOT )
                            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1205:3: lv_operations_0_0= RULE_NOT
                            {
                            lv_operations_0_0=(Token)match(input,RULE_NOT,FOLLOW_RULE_NOT_in_ruleUnaryExpression2235); 

                            			newLeafNode(lv_operations_0_0, grammarAccess.getUnaryExpressionAccess().getOperationsNOTTerminalRuleCall_0_0_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getUnaryExpressionRule());
                            	        }
                                   		addWithLastConsumed(
                                   			current, 
                                   			"operations",
                                    		lv_operations_0_0, 
                                    		"NOT");
                            	    

                            }


                            }

                            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1221:2: ( (lv_parameters_1_0= rulePrimaryExpression ) )
                            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1222:1: (lv_parameters_1_0= rulePrimaryExpression )
                            {
                            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1222:1: (lv_parameters_1_0= rulePrimaryExpression )
                            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1223:3: lv_parameters_1_0= rulePrimaryExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getParametersPrimaryExpressionParserRuleCall_0_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleUnaryExpression2261);
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
                            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1240:6: ( ( (lv_operations_2_0= RULE_MINUS ) ) ( (lv_parameters_3_0= rulePrimaryExpression ) ) )
                            {
                            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1240:6: ( ( (lv_operations_2_0= RULE_MINUS ) ) ( (lv_parameters_3_0= rulePrimaryExpression ) ) )
                            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1240:7: ( (lv_operations_2_0= RULE_MINUS ) ) ( (lv_parameters_3_0= rulePrimaryExpression ) )
                            {
                            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1240:7: ( (lv_operations_2_0= RULE_MINUS ) )
                            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1241:1: (lv_operations_2_0= RULE_MINUS )
                            {
                            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1241:1: (lv_operations_2_0= RULE_MINUS )
                            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1242:3: lv_operations_2_0= RULE_MINUS
                            {
                            lv_operations_2_0=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleUnaryExpression2286); 

                            			newLeafNode(lv_operations_2_0, grammarAccess.getUnaryExpressionAccess().getOperationsMINUSTerminalRuleCall_0_1_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getUnaryExpressionRule());
                            	        }
                                   		addWithLastConsumed(
                                   			current, 
                                   			"operations",
                                    		lv_operations_2_0, 
                                    		"MINUS");
                            	    

                            }


                            }

                            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1258:2: ( (lv_parameters_3_0= rulePrimaryExpression ) )
                            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1259:1: (lv_parameters_3_0= rulePrimaryExpression )
                            {
                            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1259:1: (lv_parameters_3_0= rulePrimaryExpression )
                            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1260:3: lv_parameters_3_0= rulePrimaryExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getParametersPrimaryExpressionParserRuleCall_0_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleUnaryExpression2312);
                            lv_parameters_3_0=rulePrimaryExpression();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"parameters",
                                    		lv_parameters_3_0, 
                                    		"PrimaryExpression");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1278:5: this_PrimaryExpression_4= rulePrimaryExpression
                    {
                     
                            newCompositeNode(grammarAccess.getUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleUnaryExpression2342);
                    this_PrimaryExpression_4=rulePrimaryExpression();

                    state._fsp--;

                     
                            current = this_PrimaryExpression_4; 
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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1294:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1295:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1296:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2377);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression2387); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1303:1: rulePrimaryExpression returns [EObject current=null] : ( ( (lv_parameters_0_0= ruleLiteral ) ) | (this_BRACKET_OPEN_1= RULE_BRACKET_OPEN ( (lv_parameters_2_0= ruleOrExpression ) ) this_BRACKET_CLOSE_3= RULE_BRACKET_CLOSE ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token this_BRACKET_OPEN_1=null;
        Token this_BRACKET_CLOSE_3=null;
        EObject lv_parameters_0_0 = null;

        EObject lv_parameters_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1306:28: ( ( ( (lv_parameters_0_0= ruleLiteral ) ) | (this_BRACKET_OPEN_1= RULE_BRACKET_OPEN ( (lv_parameters_2_0= ruleOrExpression ) ) this_BRACKET_CLOSE_3= RULE_BRACKET_CLOSE ) ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1307:1: ( ( (lv_parameters_0_0= ruleLiteral ) ) | (this_BRACKET_OPEN_1= RULE_BRACKET_OPEN ( (lv_parameters_2_0= ruleOrExpression ) ) this_BRACKET_CLOSE_3= RULE_BRACKET_CLOSE ) )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1307:1: ( ( (lv_parameters_0_0= ruleLiteral ) ) | (this_BRACKET_OPEN_1= RULE_BRACKET_OPEN ( (lv_parameters_2_0= ruleOrExpression ) ) this_BRACKET_CLOSE_3= RULE_BRACKET_CLOSE ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID||LA19_0==RULE_SQBRACKET_OPEN||LA19_0==RULE_TML_EXISTS||LA19_0==RULE_DOLLAR||LA19_0==RULE_NUMBER||(LA19_0>=RULE_LITERALSTRING && LA19_0<=RULE_CURLYOPEN)||(LA19_0>=RULE_NULL && LA19_0<=RULE_FALSE)) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_BRACKET_OPEN) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1307:2: ( (lv_parameters_0_0= ruleLiteral ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1307:2: ( (lv_parameters_0_0= ruleLiteral ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1308:1: (lv_parameters_0_0= ruleLiteral )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1308:1: (lv_parameters_0_0= ruleLiteral )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1309:3: lv_parameters_0_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getParametersLiteralParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_rulePrimaryExpression2433);
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
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1326:6: (this_BRACKET_OPEN_1= RULE_BRACKET_OPEN ( (lv_parameters_2_0= ruleOrExpression ) ) this_BRACKET_CLOSE_3= RULE_BRACKET_CLOSE )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1326:6: (this_BRACKET_OPEN_1= RULE_BRACKET_OPEN ( (lv_parameters_2_0= ruleOrExpression ) ) this_BRACKET_CLOSE_3= RULE_BRACKET_CLOSE )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1326:7: this_BRACKET_OPEN_1= RULE_BRACKET_OPEN ( (lv_parameters_2_0= ruleOrExpression ) ) this_BRACKET_CLOSE_3= RULE_BRACKET_CLOSE
                    {
                    this_BRACKET_OPEN_1=(Token)match(input,RULE_BRACKET_OPEN,FOLLOW_RULE_BRACKET_OPEN_in_rulePrimaryExpression2451); 
                     
                        newLeafNode(this_BRACKET_OPEN_1, grammarAccess.getPrimaryExpressionAccess().getBRACKET_OPENTerminalRuleCall_1_0()); 
                        
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1330:1: ( (lv_parameters_2_0= ruleOrExpression ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1331:1: (lv_parameters_2_0= ruleOrExpression )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1331:1: (lv_parameters_2_0= ruleOrExpression )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1332:3: lv_parameters_2_0= ruleOrExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getParametersOrExpressionParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOrExpression_in_rulePrimaryExpression2471);
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

                    this_BRACKET_CLOSE_3=(Token)match(input,RULE_BRACKET_CLOSE,FOLLOW_RULE_BRACKET_CLOSE_in_rulePrimaryExpression2482); 
                     
                        newLeafNode(this_BRACKET_CLOSE_3, grammarAccess.getPrimaryExpressionAccess().getBRACKET_CLOSETerminalRuleCall_1_2()); 
                        

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1360:1: entryRuleFunctionName returns [String current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final String entryRuleFunctionName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionName = null;


        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1361:2: (iv_ruleFunctionName= ruleFunctionName EOF )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1362:2: iv_ruleFunctionName= ruleFunctionName EOF
            {
             newCompositeNode(grammarAccess.getFunctionNameRule()); 
            pushFollow(FOLLOW_ruleFunctionName_in_entryRuleFunctionName2519);
            iv_ruleFunctionName=ruleFunctionName();

            state._fsp--;

             current =iv_ruleFunctionName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionName2530); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1369:1: ruleFunctionName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleFunctionName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1372:28: (this_ID_0= RULE_ID )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1373:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionName2569); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1388:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1389:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1390:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
             newCompositeNode(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall2613);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;

             current =iv_ruleFunctionCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCall2623); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1397:1: ruleFunctionCall returns [EObject current=null] : ( ( (lv_name_0_0= ruleFunctionName ) ) this_BRACKET_OPEN_1= RULE_BRACKET_OPEN ( (lv_parameters_2_0= ruleOrExpression ) )? (this_COMMA_3= RULE_COMMA ( (lv_parameters_4_0= ruleOrExpression ) ) )* this_BRACKET_CLOSE_5= RULE_BRACKET_CLOSE ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token this_BRACKET_OPEN_1=null;
        Token this_COMMA_3=null;
        Token this_BRACKET_CLOSE_5=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_parameters_2_0 = null;

        EObject lv_parameters_4_0 = null;


         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1400:28: ( ( ( (lv_name_0_0= ruleFunctionName ) ) this_BRACKET_OPEN_1= RULE_BRACKET_OPEN ( (lv_parameters_2_0= ruleOrExpression ) )? (this_COMMA_3= RULE_COMMA ( (lv_parameters_4_0= ruleOrExpression ) ) )* this_BRACKET_CLOSE_5= RULE_BRACKET_CLOSE ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1401:1: ( ( (lv_name_0_0= ruleFunctionName ) ) this_BRACKET_OPEN_1= RULE_BRACKET_OPEN ( (lv_parameters_2_0= ruleOrExpression ) )? (this_COMMA_3= RULE_COMMA ( (lv_parameters_4_0= ruleOrExpression ) ) )* this_BRACKET_CLOSE_5= RULE_BRACKET_CLOSE )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1401:1: ( ( (lv_name_0_0= ruleFunctionName ) ) this_BRACKET_OPEN_1= RULE_BRACKET_OPEN ( (lv_parameters_2_0= ruleOrExpression ) )? (this_COMMA_3= RULE_COMMA ( (lv_parameters_4_0= ruleOrExpression ) ) )* this_BRACKET_CLOSE_5= RULE_BRACKET_CLOSE )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1401:2: ( (lv_name_0_0= ruleFunctionName ) ) this_BRACKET_OPEN_1= RULE_BRACKET_OPEN ( (lv_parameters_2_0= ruleOrExpression ) )? (this_COMMA_3= RULE_COMMA ( (lv_parameters_4_0= ruleOrExpression ) ) )* this_BRACKET_CLOSE_5= RULE_BRACKET_CLOSE
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1401:2: ( (lv_name_0_0= ruleFunctionName ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1402:1: (lv_name_0_0= ruleFunctionName )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1402:1: (lv_name_0_0= ruleFunctionName )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1403:3: lv_name_0_0= ruleFunctionName
            {
             
            	        newCompositeNode(grammarAccess.getFunctionCallAccess().getNameFunctionNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleFunctionName_in_ruleFunctionCall2669);
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

            this_BRACKET_OPEN_1=(Token)match(input,RULE_BRACKET_OPEN,FOLLOW_RULE_BRACKET_OPEN_in_ruleFunctionCall2680); 
             
                newLeafNode(this_BRACKET_OPEN_1, grammarAccess.getFunctionCallAccess().getBRACKET_OPENTerminalRuleCall_1()); 
                
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1423:1: ( (lv_parameters_2_0= ruleOrExpression ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID||LA20_0==RULE_SQBRACKET_OPEN||(LA20_0>=RULE_TML_EXISTS && LA20_0<=RULE_BRACKET_OPEN)||LA20_0==RULE_DOLLAR||LA20_0==RULE_MINUS||(LA20_0>=RULE_NOT && LA20_0<=RULE_NUMBER)||(LA20_0>=RULE_LITERALSTRING && LA20_0<=RULE_CURLYOPEN)||(LA20_0>=RULE_NULL && LA20_0<=RULE_FALSE)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1424:1: (lv_parameters_2_0= ruleOrExpression )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1424:1: (lv_parameters_2_0= ruleOrExpression )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1425:3: lv_parameters_2_0= ruleOrExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersOrExpressionParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOrExpression_in_ruleFunctionCall2700);
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

            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1441:3: (this_COMMA_3= RULE_COMMA ( (lv_parameters_4_0= ruleOrExpression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_COMMA) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1441:4: this_COMMA_3= RULE_COMMA ( (lv_parameters_4_0= ruleOrExpression ) )
            	    {
            	    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleFunctionCall2713); 
            	     
            	        newLeafNode(this_COMMA_3, grammarAccess.getFunctionCallAccess().getCOMMATerminalRuleCall_3_0()); 
            	        
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1445:1: ( (lv_parameters_4_0= ruleOrExpression ) )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1446:1: (lv_parameters_4_0= ruleOrExpression )
            	    {
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1446:1: (lv_parameters_4_0= ruleOrExpression )
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1447:3: lv_parameters_4_0= ruleOrExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionCallAccess().getParametersOrExpressionParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOrExpression_in_ruleFunctionCall2733);
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
            	    break loop21;
                }
            } while (true);

            this_BRACKET_CLOSE_5=(Token)match(input,RULE_BRACKET_CLOSE,FOLLOW_RULE_BRACKET_CLOSE_in_ruleFunctionCall2746); 
             
                newLeafNode(this_BRACKET_CLOSE_5, grammarAccess.getFunctionCallAccess().getBRACKET_CLOSETerminalRuleCall_4()); 
                

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1475:1: entryRuleDateLiteral returns [EObject current=null] : iv_ruleDateLiteral= ruleDateLiteral EOF ;
    public final EObject entryRuleDateLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateLiteral = null;


        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1476:2: (iv_ruleDateLiteral= ruleDateLiteral EOF )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1477:2: iv_ruleDateLiteral= ruleDateLiteral EOF
            {
             newCompositeNode(grammarAccess.getDateLiteralRule()); 
            pushFollow(FOLLOW_ruleDateLiteral_in_entryRuleDateLiteral2781);
            iv_ruleDateLiteral=ruleDateLiteral();

            state._fsp--;

             current =iv_ruleDateLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateLiteral2791); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1484:1: ruleDateLiteral returns [EObject current=null] : ( () this_NUMBER_1= RULE_NUMBER this_HASH_2= RULE_HASH this_NUMBER_3= RULE_NUMBER this_HASH_4= RULE_HASH this_NUMBER_5= RULE_NUMBER this_HASH_6= RULE_HASH this_NUMBER_7= RULE_NUMBER this_HASH_8= RULE_HASH this_NUMBER_9= RULE_NUMBER this_HASH_10= RULE_HASH this_NUMBER_11= RULE_NUMBER ) ;
    public final EObject ruleDateLiteral() throws RecognitionException {
        EObject current = null;

        Token this_NUMBER_1=null;
        Token this_HASH_2=null;
        Token this_NUMBER_3=null;
        Token this_HASH_4=null;
        Token this_NUMBER_5=null;
        Token this_HASH_6=null;
        Token this_NUMBER_7=null;
        Token this_HASH_8=null;
        Token this_NUMBER_9=null;
        Token this_HASH_10=null;
        Token this_NUMBER_11=null;

         enterRule(); 
            
        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1487:28: ( ( () this_NUMBER_1= RULE_NUMBER this_HASH_2= RULE_HASH this_NUMBER_3= RULE_NUMBER this_HASH_4= RULE_HASH this_NUMBER_5= RULE_NUMBER this_HASH_6= RULE_HASH this_NUMBER_7= RULE_NUMBER this_HASH_8= RULE_HASH this_NUMBER_9= RULE_NUMBER this_HASH_10= RULE_HASH this_NUMBER_11= RULE_NUMBER ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1488:1: ( () this_NUMBER_1= RULE_NUMBER this_HASH_2= RULE_HASH this_NUMBER_3= RULE_NUMBER this_HASH_4= RULE_HASH this_NUMBER_5= RULE_NUMBER this_HASH_6= RULE_HASH this_NUMBER_7= RULE_NUMBER this_HASH_8= RULE_HASH this_NUMBER_9= RULE_NUMBER this_HASH_10= RULE_HASH this_NUMBER_11= RULE_NUMBER )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1488:1: ( () this_NUMBER_1= RULE_NUMBER this_HASH_2= RULE_HASH this_NUMBER_3= RULE_NUMBER this_HASH_4= RULE_HASH this_NUMBER_5= RULE_NUMBER this_HASH_6= RULE_HASH this_NUMBER_7= RULE_NUMBER this_HASH_8= RULE_HASH this_NUMBER_9= RULE_NUMBER this_HASH_10= RULE_HASH this_NUMBER_11= RULE_NUMBER )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1488:2: () this_NUMBER_1= RULE_NUMBER this_HASH_2= RULE_HASH this_NUMBER_3= RULE_NUMBER this_HASH_4= RULE_HASH this_NUMBER_5= RULE_NUMBER this_HASH_6= RULE_HASH this_NUMBER_7= RULE_NUMBER this_HASH_8= RULE_HASH this_NUMBER_9= RULE_NUMBER this_HASH_10= RULE_HASH this_NUMBER_11= RULE_NUMBER
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1488:2: ()
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1489:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDateLiteralAccess().getExpressionAction_0(),
                        current);
                

            }

            this_NUMBER_1=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleDateLiteral2836); 
             
                newLeafNode(this_NUMBER_1, grammarAccess.getDateLiteralAccess().getNUMBERTerminalRuleCall_1()); 
                
            this_HASH_2=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleDateLiteral2846); 
             
                newLeafNode(this_HASH_2, grammarAccess.getDateLiteralAccess().getHASHTerminalRuleCall_2()); 
                
            this_NUMBER_3=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleDateLiteral2856); 
             
                newLeafNode(this_NUMBER_3, grammarAccess.getDateLiteralAccess().getNUMBERTerminalRuleCall_3()); 
                
            this_HASH_4=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleDateLiteral2866); 
             
                newLeafNode(this_HASH_4, grammarAccess.getDateLiteralAccess().getHASHTerminalRuleCall_4()); 
                
            this_NUMBER_5=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleDateLiteral2876); 
             
                newLeafNode(this_NUMBER_5, grammarAccess.getDateLiteralAccess().getNUMBERTerminalRuleCall_5()); 
                
            this_HASH_6=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleDateLiteral2886); 
             
                newLeafNode(this_HASH_6, grammarAccess.getDateLiteralAccess().getHASHTerminalRuleCall_6()); 
                
            this_NUMBER_7=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleDateLiteral2896); 
             
                newLeafNode(this_NUMBER_7, grammarAccess.getDateLiteralAccess().getNUMBERTerminalRuleCall_7()); 
                
            this_HASH_8=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleDateLiteral2906); 
             
                newLeafNode(this_HASH_8, grammarAccess.getDateLiteralAccess().getHASHTerminalRuleCall_8()); 
                
            this_NUMBER_9=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleDateLiteral2916); 
             
                newLeafNode(this_NUMBER_9, grammarAccess.getDateLiteralAccess().getNUMBERTerminalRuleCall_9()); 
                
            this_HASH_10=(Token)match(input,RULE_HASH,FOLLOW_RULE_HASH_in_ruleDateLiteral2926); 
             
                newLeafNode(this_HASH_10, grammarAccess.getDateLiteralAccess().getHASHTerminalRuleCall_10()); 
                
            this_NUMBER_11=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleDateLiteral2936); 
             
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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1546:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1547:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1548:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral2971);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral2981); 

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
    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1555:1: ruleLiteral returns [EObject current=null] : ( ( () this_NUMBER_1= RULE_NUMBER ) | ( (lv_valueString_2_0= RULE_LITERALSTRING ) ) | ( ( (lv_operations_3_0= RULE_FORALL ) ) this_BRACKET_OPEN_4= RULE_BRACKET_OPEN ( (lv_valueString_5_0= RULE_LITERALSTRING ) ) this_COMMA_6= RULE_COMMA ( (lv_parameters_7_0= ruleOrExpression ) ) this_BRACKET_CLOSE_8= RULE_BRACKET_CLOSE ) | ( (lv_parameters_9_0= ruleFunctionCall ) ) | ( ( (lv_expressionType_10_0= RULE_CURLYOPEN ) ) ( (lv_parameters_11_0= ruleOrExpression ) )? (this_COMMA_12= RULE_COMMA ( (lv_parameters_13_0= ruleOrExpression ) ) )* this_CURLYCLOSE_14= RULE_CURLYCLOSE ) | ( (lv_elements_15_0= RULE_NULL ) ) | ( (lv_elements_16_0= RULE_TODAY ) ) | ( (lv_elements_17_0= RULE_TRUE ) ) | ( (lv_elements_18_0= RULE_FALSE ) ) | ( (lv_parameters_19_0= ruleTmlExpression ) ) | ( (lv_parameters_20_0= ruleExistsTmlExpression ) ) | ( (lv_parameters_21_0= ruleMapGetReference ) ) | ( (lv_parameters_22_0= ruleDateLiteral ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token this_NUMBER_1=null;
        Token lv_valueString_2_0=null;
        Token lv_operations_3_0=null;
        Token this_BRACKET_OPEN_4=null;
        Token lv_valueString_5_0=null;
        Token this_COMMA_6=null;
        Token this_BRACKET_CLOSE_8=null;
        Token lv_expressionType_10_0=null;
        Token this_COMMA_12=null;
        Token this_CURLYCLOSE_14=null;
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
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1558:28: ( ( ( () this_NUMBER_1= RULE_NUMBER ) | ( (lv_valueString_2_0= RULE_LITERALSTRING ) ) | ( ( (lv_operations_3_0= RULE_FORALL ) ) this_BRACKET_OPEN_4= RULE_BRACKET_OPEN ( (lv_valueString_5_0= RULE_LITERALSTRING ) ) this_COMMA_6= RULE_COMMA ( (lv_parameters_7_0= ruleOrExpression ) ) this_BRACKET_CLOSE_8= RULE_BRACKET_CLOSE ) | ( (lv_parameters_9_0= ruleFunctionCall ) ) | ( ( (lv_expressionType_10_0= RULE_CURLYOPEN ) ) ( (lv_parameters_11_0= ruleOrExpression ) )? (this_COMMA_12= RULE_COMMA ( (lv_parameters_13_0= ruleOrExpression ) ) )* this_CURLYCLOSE_14= RULE_CURLYCLOSE ) | ( (lv_elements_15_0= RULE_NULL ) ) | ( (lv_elements_16_0= RULE_TODAY ) ) | ( (lv_elements_17_0= RULE_TRUE ) ) | ( (lv_elements_18_0= RULE_FALSE ) ) | ( (lv_parameters_19_0= ruleTmlExpression ) ) | ( (lv_parameters_20_0= ruleExistsTmlExpression ) ) | ( (lv_parameters_21_0= ruleMapGetReference ) ) | ( (lv_parameters_22_0= ruleDateLiteral ) ) ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1559:1: ( ( () this_NUMBER_1= RULE_NUMBER ) | ( (lv_valueString_2_0= RULE_LITERALSTRING ) ) | ( ( (lv_operations_3_0= RULE_FORALL ) ) this_BRACKET_OPEN_4= RULE_BRACKET_OPEN ( (lv_valueString_5_0= RULE_LITERALSTRING ) ) this_COMMA_6= RULE_COMMA ( (lv_parameters_7_0= ruleOrExpression ) ) this_BRACKET_CLOSE_8= RULE_BRACKET_CLOSE ) | ( (lv_parameters_9_0= ruleFunctionCall ) ) | ( ( (lv_expressionType_10_0= RULE_CURLYOPEN ) ) ( (lv_parameters_11_0= ruleOrExpression ) )? (this_COMMA_12= RULE_COMMA ( (lv_parameters_13_0= ruleOrExpression ) ) )* this_CURLYCLOSE_14= RULE_CURLYCLOSE ) | ( (lv_elements_15_0= RULE_NULL ) ) | ( (lv_elements_16_0= RULE_TODAY ) ) | ( (lv_elements_17_0= RULE_TRUE ) ) | ( (lv_elements_18_0= RULE_FALSE ) ) | ( (lv_parameters_19_0= ruleTmlExpression ) ) | ( (lv_parameters_20_0= ruleExistsTmlExpression ) ) | ( (lv_parameters_21_0= ruleMapGetReference ) ) | ( (lv_parameters_22_0= ruleDateLiteral ) ) )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1559:1: ( ( () this_NUMBER_1= RULE_NUMBER ) | ( (lv_valueString_2_0= RULE_LITERALSTRING ) ) | ( ( (lv_operations_3_0= RULE_FORALL ) ) this_BRACKET_OPEN_4= RULE_BRACKET_OPEN ( (lv_valueString_5_0= RULE_LITERALSTRING ) ) this_COMMA_6= RULE_COMMA ( (lv_parameters_7_0= ruleOrExpression ) ) this_BRACKET_CLOSE_8= RULE_BRACKET_CLOSE ) | ( (lv_parameters_9_0= ruleFunctionCall ) ) | ( ( (lv_expressionType_10_0= RULE_CURLYOPEN ) ) ( (lv_parameters_11_0= ruleOrExpression ) )? (this_COMMA_12= RULE_COMMA ( (lv_parameters_13_0= ruleOrExpression ) ) )* this_CURLYCLOSE_14= RULE_CURLYCLOSE ) | ( (lv_elements_15_0= RULE_NULL ) ) | ( (lv_elements_16_0= RULE_TODAY ) ) | ( (lv_elements_17_0= RULE_TRUE ) ) | ( (lv_elements_18_0= RULE_FALSE ) ) | ( (lv_parameters_19_0= ruleTmlExpression ) ) | ( (lv_parameters_20_0= ruleExistsTmlExpression ) ) | ( (lv_parameters_21_0= ruleMapGetReference ) ) | ( (lv_parameters_22_0= ruleDateLiteral ) ) )
            int alt24=13;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1559:2: ( () this_NUMBER_1= RULE_NUMBER )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1559:2: ( () this_NUMBER_1= RULE_NUMBER )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1559:3: () this_NUMBER_1= RULE_NUMBER
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1559:3: ()
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1560:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getLiteralAccess().getExpressionAction_0_0(),
                                current);
                        

                    }

                    this_NUMBER_1=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleLiteral3027); 
                     
                        newLeafNode(this_NUMBER_1, grammarAccess.getLiteralAccess().getNUMBERTerminalRuleCall_0_1()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1570:6: ( (lv_valueString_2_0= RULE_LITERALSTRING ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1570:6: ( (lv_valueString_2_0= RULE_LITERALSTRING ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1571:1: (lv_valueString_2_0= RULE_LITERALSTRING )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1571:1: (lv_valueString_2_0= RULE_LITERALSTRING )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1572:3: lv_valueString_2_0= RULE_LITERALSTRING
                    {
                    lv_valueString_2_0=(Token)match(input,RULE_LITERALSTRING,FOLLOW_RULE_LITERALSTRING_in_ruleLiteral3050); 

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
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1589:6: ( ( (lv_operations_3_0= RULE_FORALL ) ) this_BRACKET_OPEN_4= RULE_BRACKET_OPEN ( (lv_valueString_5_0= RULE_LITERALSTRING ) ) this_COMMA_6= RULE_COMMA ( (lv_parameters_7_0= ruleOrExpression ) ) this_BRACKET_CLOSE_8= RULE_BRACKET_CLOSE )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1589:6: ( ( (lv_operations_3_0= RULE_FORALL ) ) this_BRACKET_OPEN_4= RULE_BRACKET_OPEN ( (lv_valueString_5_0= RULE_LITERALSTRING ) ) this_COMMA_6= RULE_COMMA ( (lv_parameters_7_0= ruleOrExpression ) ) this_BRACKET_CLOSE_8= RULE_BRACKET_CLOSE )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1589:7: ( (lv_operations_3_0= RULE_FORALL ) ) this_BRACKET_OPEN_4= RULE_BRACKET_OPEN ( (lv_valueString_5_0= RULE_LITERALSTRING ) ) this_COMMA_6= RULE_COMMA ( (lv_parameters_7_0= ruleOrExpression ) ) this_BRACKET_CLOSE_8= RULE_BRACKET_CLOSE
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1589:7: ( (lv_operations_3_0= RULE_FORALL ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1590:1: (lv_operations_3_0= RULE_FORALL )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1590:1: (lv_operations_3_0= RULE_FORALL )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1591:3: lv_operations_3_0= RULE_FORALL
                    {
                    lv_operations_3_0=(Token)match(input,RULE_FORALL,FOLLOW_RULE_FORALL_in_ruleLiteral3079); 

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

                    this_BRACKET_OPEN_4=(Token)match(input,RULE_BRACKET_OPEN,FOLLOW_RULE_BRACKET_OPEN_in_ruleLiteral3095); 
                     
                        newLeafNode(this_BRACKET_OPEN_4, grammarAccess.getLiteralAccess().getBRACKET_OPENTerminalRuleCall_2_1()); 
                        
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1611:1: ( (lv_valueString_5_0= RULE_LITERALSTRING ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1612:1: (lv_valueString_5_0= RULE_LITERALSTRING )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1612:1: (lv_valueString_5_0= RULE_LITERALSTRING )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1613:3: lv_valueString_5_0= RULE_LITERALSTRING
                    {
                    lv_valueString_5_0=(Token)match(input,RULE_LITERALSTRING,FOLLOW_RULE_LITERALSTRING_in_ruleLiteral3111); 

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

                    this_COMMA_6=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleLiteral3127); 
                     
                        newLeafNode(this_COMMA_6, grammarAccess.getLiteralAccess().getCOMMATerminalRuleCall_2_3()); 
                        
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1633:1: ( (lv_parameters_7_0= ruleOrExpression ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1634:1: (lv_parameters_7_0= ruleOrExpression )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1634:1: (lv_parameters_7_0= ruleOrExpression )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1635:3: lv_parameters_7_0= ruleOrExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralAccess().getParametersOrExpressionParserRuleCall_2_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOrExpression_in_ruleLiteral3147);
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

                    this_BRACKET_CLOSE_8=(Token)match(input,RULE_BRACKET_CLOSE,FOLLOW_RULE_BRACKET_CLOSE_in_ruleLiteral3158); 
                     
                        newLeafNode(this_BRACKET_CLOSE_8, grammarAccess.getLiteralAccess().getBRACKET_CLOSETerminalRuleCall_2_5()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1656:6: ( (lv_parameters_9_0= ruleFunctionCall ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1656:6: ( (lv_parameters_9_0= ruleFunctionCall ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1657:1: (lv_parameters_9_0= ruleFunctionCall )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1657:1: (lv_parameters_9_0= ruleFunctionCall )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1658:3: lv_parameters_9_0= ruleFunctionCall
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralAccess().getParametersFunctionCallParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionCall_in_ruleLiteral3185);
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
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1675:6: ( ( (lv_expressionType_10_0= RULE_CURLYOPEN ) ) ( (lv_parameters_11_0= ruleOrExpression ) )? (this_COMMA_12= RULE_COMMA ( (lv_parameters_13_0= ruleOrExpression ) ) )* this_CURLYCLOSE_14= RULE_CURLYCLOSE )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1675:6: ( ( (lv_expressionType_10_0= RULE_CURLYOPEN ) ) ( (lv_parameters_11_0= ruleOrExpression ) )? (this_COMMA_12= RULE_COMMA ( (lv_parameters_13_0= ruleOrExpression ) ) )* this_CURLYCLOSE_14= RULE_CURLYCLOSE )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1675:7: ( (lv_expressionType_10_0= RULE_CURLYOPEN ) ) ( (lv_parameters_11_0= ruleOrExpression ) )? (this_COMMA_12= RULE_COMMA ( (lv_parameters_13_0= ruleOrExpression ) ) )* this_CURLYCLOSE_14= RULE_CURLYCLOSE
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1675:7: ( (lv_expressionType_10_0= RULE_CURLYOPEN ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1676:1: (lv_expressionType_10_0= RULE_CURLYOPEN )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1676:1: (lv_expressionType_10_0= RULE_CURLYOPEN )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1677:3: lv_expressionType_10_0= RULE_CURLYOPEN
                    {
                    lv_expressionType_10_0=(Token)match(input,RULE_CURLYOPEN,FOLLOW_RULE_CURLYOPEN_in_ruleLiteral3209); 

                    			newLeafNode(lv_expressionType_10_0, grammarAccess.getLiteralAccess().getExpressionTypeCURLYOPENTerminalRuleCall_4_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"expressionType",
                            		lv_expressionType_10_0, 
                            		"CURLYOPEN");
                    	    

                    }


                    }

                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1693:2: ( (lv_parameters_11_0= ruleOrExpression ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_ID||LA22_0==RULE_SQBRACKET_OPEN||(LA22_0>=RULE_TML_EXISTS && LA22_0<=RULE_BRACKET_OPEN)||LA22_0==RULE_DOLLAR||LA22_0==RULE_MINUS||(LA22_0>=RULE_NOT && LA22_0<=RULE_NUMBER)||(LA22_0>=RULE_LITERALSTRING && LA22_0<=RULE_CURLYOPEN)||(LA22_0>=RULE_NULL && LA22_0<=RULE_FALSE)) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1694:1: (lv_parameters_11_0= ruleOrExpression )
                            {
                            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1694:1: (lv_parameters_11_0= ruleOrExpression )
                            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1695:3: lv_parameters_11_0= ruleOrExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getLiteralAccess().getParametersOrExpressionParserRuleCall_4_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleOrExpression_in_ruleLiteral3235);
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

                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1711:3: (this_COMMA_12= RULE_COMMA ( (lv_parameters_13_0= ruleOrExpression ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==RULE_COMMA) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1711:4: this_COMMA_12= RULE_COMMA ( (lv_parameters_13_0= ruleOrExpression ) )
                    	    {
                    	    this_COMMA_12=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleLiteral3248); 
                    	     
                    	        newLeafNode(this_COMMA_12, grammarAccess.getLiteralAccess().getCOMMATerminalRuleCall_4_2_0()); 
                    	        
                    	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1715:1: ( (lv_parameters_13_0= ruleOrExpression ) )
                    	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1716:1: (lv_parameters_13_0= ruleOrExpression )
                    	    {
                    	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1716:1: (lv_parameters_13_0= ruleOrExpression )
                    	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1717:3: lv_parameters_13_0= ruleOrExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLiteralAccess().getParametersOrExpressionParserRuleCall_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleOrExpression_in_ruleLiteral3268);
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
                    	    break loop23;
                        }
                    } while (true);

                    this_CURLYCLOSE_14=(Token)match(input,RULE_CURLYCLOSE,FOLLOW_RULE_CURLYCLOSE_in_ruleLiteral3281); 
                     
                        newLeafNode(this_CURLYCLOSE_14, grammarAccess.getLiteralAccess().getCURLYCLOSETerminalRuleCall_4_3()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1738:6: ( (lv_elements_15_0= RULE_NULL ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1738:6: ( (lv_elements_15_0= RULE_NULL ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1739:1: (lv_elements_15_0= RULE_NULL )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1739:1: (lv_elements_15_0= RULE_NULL )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1740:3: lv_elements_15_0= RULE_NULL
                    {
                    lv_elements_15_0=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleLiteral3304); 

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
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1757:6: ( (lv_elements_16_0= RULE_TODAY ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1757:6: ( (lv_elements_16_0= RULE_TODAY ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1758:1: (lv_elements_16_0= RULE_TODAY )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1758:1: (lv_elements_16_0= RULE_TODAY )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1759:3: lv_elements_16_0= RULE_TODAY
                    {
                    lv_elements_16_0=(Token)match(input,RULE_TODAY,FOLLOW_RULE_TODAY_in_ruleLiteral3332); 

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
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1776:6: ( (lv_elements_17_0= RULE_TRUE ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1776:6: ( (lv_elements_17_0= RULE_TRUE ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1777:1: (lv_elements_17_0= RULE_TRUE )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1777:1: (lv_elements_17_0= RULE_TRUE )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1778:3: lv_elements_17_0= RULE_TRUE
                    {
                    lv_elements_17_0=(Token)match(input,RULE_TRUE,FOLLOW_RULE_TRUE_in_ruleLiteral3360); 

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
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1795:6: ( (lv_elements_18_0= RULE_FALSE ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1795:6: ( (lv_elements_18_0= RULE_FALSE ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1796:1: (lv_elements_18_0= RULE_FALSE )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1796:1: (lv_elements_18_0= RULE_FALSE )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1797:3: lv_elements_18_0= RULE_FALSE
                    {
                    lv_elements_18_0=(Token)match(input,RULE_FALSE,FOLLOW_RULE_FALSE_in_ruleLiteral3388); 

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
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1814:6: ( (lv_parameters_19_0= ruleTmlExpression ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1814:6: ( (lv_parameters_19_0= ruleTmlExpression ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1815:1: (lv_parameters_19_0= ruleTmlExpression )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1815:1: (lv_parameters_19_0= ruleTmlExpression )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1816:3: lv_parameters_19_0= ruleTmlExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralAccess().getParametersTmlExpressionParserRuleCall_9_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTmlExpression_in_ruleLiteral3420);
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
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1833:6: ( (lv_parameters_20_0= ruleExistsTmlExpression ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1833:6: ( (lv_parameters_20_0= ruleExistsTmlExpression ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1834:1: (lv_parameters_20_0= ruleExistsTmlExpression )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1834:1: (lv_parameters_20_0= ruleExistsTmlExpression )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1835:3: lv_parameters_20_0= ruleExistsTmlExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralAccess().getParametersExistsTmlExpressionParserRuleCall_10_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExistsTmlExpression_in_ruleLiteral3447);
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
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1852:6: ( (lv_parameters_21_0= ruleMapGetReference ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1852:6: ( (lv_parameters_21_0= ruleMapGetReference ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1853:1: (lv_parameters_21_0= ruleMapGetReference )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1853:1: (lv_parameters_21_0= ruleMapGetReference )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1854:3: lv_parameters_21_0= ruleMapGetReference
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralAccess().getParametersMapGetReferenceParserRuleCall_11_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMapGetReference_in_ruleLiteral3474);
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
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1871:6: ( (lv_parameters_22_0= ruleDateLiteral ) )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1871:6: ( (lv_parameters_22_0= ruleDateLiteral ) )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1872:1: (lv_parameters_22_0= ruleDateLiteral )
                    {
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1872:1: (lv_parameters_22_0= ruleDateLiteral )
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/internal/InternalNavajoExpression.g:1873:3: lv_parameters_22_0= ruleDateLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralAccess().getParametersDateLiteralParserRuleCall_12_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDateLiteral_in_ruleLiteral3501);
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
    protected DFA24 dfa24 = new DFA24(this);
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
            return "177:1: ( (lv_absolute_1_0= RULE_TML_SEPARATOR ) )?";
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
            return "286:1: ( (lv_absolute_2_0= RULE_TML_SEPARATOR ) )?";
        }
    }
    static final String DFA24_eotS =
        "\17\uffff";
    static final String DFA24_eofS =
        "\1\uffff\1\16\15\uffff";
    static final String DFA24_minS =
        "\1\4\1\7\15\uffff";
    static final String DFA24_maxS =
        "\1\45\1\41\15\uffff";
    static final String DFA24_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1"+
        "\1";
    static final String DFA24_specialS =
        "\17\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\4\3\uffff\1\12\2\uffff\1\13\3\uffff\1\14\14\uffff\1\1\1\uffff"+
            "\1\2\1\3\1\5\1\uffff\1\6\1\7\1\10\1\11",
            "\1\16\5\uffff\2\16\1\uffff\13\16\2\uffff\1\15\3\uffff\1\16",
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

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "1559:1: ( ( () this_NUMBER_1= RULE_NUMBER ) | ( (lv_valueString_2_0= RULE_LITERALSTRING ) ) | ( ( (lv_operations_3_0= RULE_FORALL ) ) this_BRACKET_OPEN_4= RULE_BRACKET_OPEN ( (lv_valueString_5_0= RULE_LITERALSTRING ) ) this_COMMA_6= RULE_COMMA ( (lv_parameters_7_0= ruleOrExpression ) ) this_BRACKET_CLOSE_8= RULE_BRACKET_CLOSE ) | ( (lv_parameters_9_0= ruleFunctionCall ) ) | ( ( (lv_expressionType_10_0= RULE_CURLYOPEN ) ) ( (lv_parameters_11_0= ruleOrExpression ) )? (this_COMMA_12= RULE_COMMA ( (lv_parameters_13_0= ruleOrExpression ) ) )* this_CURLYCLOSE_14= RULE_CURLYCLOSE ) | ( (lv_elements_15_0= RULE_NULL ) ) | ( (lv_elements_16_0= RULE_TODAY ) ) | ( (lv_elements_17_0= RULE_TRUE ) ) | ( (lv_elements_18_0= RULE_FALSE ) ) | ( (lv_parameters_19_0= ruleTmlExpression ) ) | ( (lv_parameters_20_0= ruleExistsTmlExpression ) ) | ( (lv_parameters_21_0= ruleMapGetReference ) ) | ( (lv_parameters_22_0= ruleDateLiteral ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleTopLevel_in_entryRuleTopLevel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopLevel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleTopLevel130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathElement_in_entryRulePathElement168 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathElement179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePathElement219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_rulePathElement245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARENT_in_rulePathElement271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TML_SEPARATOR_in_rulePathElement297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTmlExpression_in_entryRuleTmlExpression342 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTmlExpression352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SQBRACKET_OPEN_in_ruleTmlExpression388 = new BitSet(new long[]{0x00000000000002F0L});
    public static final BitSet FOLLOW_RULE_TML_SEPARATOR_in_ruleTmlExpression404 = new BitSet(new long[]{0x00000000000002F0L});
    public static final BitSet FOLLOW_RULE_AT_in_ruleTmlExpression427 = new BitSet(new long[]{0x00000000000002F0L});
    public static final BitSet FOLLOW_rulePathElement_in_ruleTmlExpression454 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_RULE_TML_SEPARATOR_in_ruleTmlExpression466 = new BitSet(new long[]{0x00000000000002F0L});
    public static final BitSet FOLLOW_rulePathElement_in_ruleTmlExpression486 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_RULE_SQBRACKET_CLOSE_in_ruleTmlExpression499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExistsTmlExpression_in_entryRuleExistsTmlExpression534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExistsTmlExpression544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TML_EXISTS_in_ruleExistsTmlExpression580 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_SQBRACKET_OPEN_in_ruleExistsTmlExpression590 = new BitSet(new long[]{0x00000000000002F0L});
    public static final BitSet FOLLOW_RULE_TML_SEPARATOR_in_ruleExistsTmlExpression606 = new BitSet(new long[]{0x00000000000002F0L});
    public static final BitSet FOLLOW_RULE_AT_in_ruleExistsTmlExpression629 = new BitSet(new long[]{0x00000000000002F0L});
    public static final BitSet FOLLOW_rulePathElement_in_ruleExistsTmlExpression656 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_RULE_TML_SEPARATOR_in_ruleExistsTmlExpression668 = new BitSet(new long[]{0x00000000000002F0L});
    public static final BitSet FOLLOW_rulePathElement_in_ruleExistsTmlExpression688 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_RULE_SQBRACKET_CLOSE_in_ruleExistsTmlExpression701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapReferenceParams_in_entryRuleMapReferenceParams736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapReferenceParams746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACKET_OPEN_in_ruleMapReferenceParams782 = new BitSet(new long[]{0x0000003DD0008910L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleMapReferenceParams802 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleMapReferenceParams814 = new BitSet(new long[]{0x0000003DD0008910L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleMapReferenceParams834 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_RULE_BRACKET_CLOSE_in_ruleMapReferenceParams847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapGetReference_in_entryRuleMapGetReference882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapGetReference892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOLLAR_in_ruleMapGetReference934 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_PARENT_in_ruleMapGetReference957 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_TML_SEPARATOR_in_ruleMapGetReference973 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapGetReference991 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleMapReferenceParams_in_ruleMapGetReference1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression1054 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression1110 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_RULE_OR_in_ruleOrExpression1128 = new BitSet(new long[]{0x0000003DDA009910L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression1154 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression1192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_ruleAndExpression1248 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_RULE_AND_in_ruleAndExpression1266 = new BitSet(new long[]{0x0000003DDA009910L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_ruleAndExpression1292 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleEqualityExpression_in_entryRuleEqualityExpression1330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualityExpression1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleEqualityExpression1386 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_RULE_EQUALSEQUALS_in_ruleEqualityExpression1405 = new BitSet(new long[]{0x0000003DDA009910L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleEqualityExpression1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEQUALS_in_ruleEqualityExpression1456 = new BitSet(new long[]{0x0000003DDA009910L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleEqualityExpression1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression1521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpression1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression1586 = new BitSet(new long[]{0x0000000000F00002L});
    public static final BitSet FOLLOW_RULE_XML_LT_in_ruleRelationalExpression1605 = new BitSet(new long[]{0x0000003DDA009910L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XML_GT_in_ruleRelationalExpression1656 = new BitSet(new long[]{0x0000003DDA009910L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XML_LTEQ_in_ruleRelationalExpression1707 = new BitSet(new long[]{0x0000003DDA009910L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XML_GTEQ_in_ruleRelationalExpression1758 = new BitSet(new long[]{0x0000003DDA009910L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleRelationalExpression1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression1823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression1879 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleAdditiveExpression1892 = new BitSet(new long[]{0x0000003DDA009910L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression1912 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleAdditiveExpression1931 = new BitSet(new long[]{0x0000003DDA009910L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression1951 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression1990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpression2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultiplicativeExpression2046 = new BitSet(new long[]{0x0000000004000082L});
    public static final BitSet FOLLOW_RULE_MULTIPLY_in_ruleMultiplicativeExpression2065 = new BitSet(new long[]{0x0000003DDA009910L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultiplicativeExpression2091 = new BitSet(new long[]{0x0000000004000082L});
    public static final BitSet FOLLOW_RULE_TML_SEPARATOR_in_ruleMultiplicativeExpression2116 = new BitSet(new long[]{0x0000003DDA009910L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleMultiplicativeExpression2142 = new BitSet(new long[]{0x0000000004000082L});
    public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression2181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOT_in_ruleUnaryExpression2235 = new BitSet(new long[]{0x0000003DDA009910L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleUnaryExpression2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleUnaryExpression2286 = new BitSet(new long[]{0x0000003DDA009910L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleUnaryExpression2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleUnaryExpression2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimaryExpression2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BRACKET_OPEN_in_rulePrimaryExpression2451 = new BitSet(new long[]{0x0000003DDA009910L});
    public static final BitSet FOLLOW_ruleOrExpression_in_rulePrimaryExpression2471 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_BRACKET_CLOSE_in_rulePrimaryExpression2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionName_in_entryRuleFunctionName2519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionName2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionName2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall2613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionName_in_ruleFunctionCall2669 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_BRACKET_OPEN_in_ruleFunctionCall2680 = new BitSet(new long[]{0x0000003DDA00F910L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleFunctionCall2700 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleFunctionCall2713 = new BitSet(new long[]{0x0000003DDA009910L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleFunctionCall2733 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_RULE_BRACKET_CLOSE_in_ruleFunctionCall2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateLiteral_in_entryRuleDateLiteral2781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateLiteral2791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleDateLiteral2836 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleDateLiteral2846 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleDateLiteral2856 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleDateLiteral2866 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleDateLiteral2876 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleDateLiteral2886 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleDateLiteral2896 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleDateLiteral2906 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleDateLiteral2916 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_RULE_HASH_in_ruleDateLiteral2926 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleDateLiteral2936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral2971 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral2981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleLiteral3027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LITERALSTRING_in_ruleLiteral3050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FORALL_in_ruleLiteral3079 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_BRACKET_OPEN_in_ruleLiteral3095 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_LITERALSTRING_in_ruleLiteral3111 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleLiteral3127 = new BitSet(new long[]{0x0000003DDA009910L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleLiteral3147 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_BRACKET_CLOSE_in_ruleLiteral3158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_ruleLiteral3185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CURLYOPEN_in_ruleLiteral3209 = new BitSet(new long[]{0x0000003FDA00B910L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleLiteral3235 = new BitSet(new long[]{0x0000000200002000L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleLiteral3248 = new BitSet(new long[]{0x0000003DDA009910L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleLiteral3268 = new BitSet(new long[]{0x0000000200002000L});
    public static final BitSet FOLLOW_RULE_CURLYCLOSE_in_ruleLiteral3281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleLiteral3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TODAY_in_ruleLiteral3332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TRUE_in_ruleLiteral3360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FALSE_in_ruleLiteral3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTmlExpression_in_ruleLiteral3420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExistsTmlExpression_in_ruleLiteral3447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapGetReference_in_ruleLiteral3474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateLiteral_in_ruleLiteral3501 = new BitSet(new long[]{0x0000000000000002L});

}