package com.dexels.navajo.dsl.expression.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNavajoExpressionLexer extends Lexer {
    public static final int RULE_ID=22;
    public static final int RULE_PARENT=18;
    public static final int RULE_SQBRACKET_OPEN=25;
    public static final int RULE_XML_LT=6;
    public static final int RULE_PLUS=40;
    public static final int RULE_CURLYOPEN=36;
    public static final int RULE_OR=34;
    public static final int KEYWORD_1=4;
    public static final int RULE_HASH=35;
    public static final int RULE_COMMA=32;
    public static final int RULE_AND=33;
    public static final int RULE_BRACKET_CLOSE=31;
    public static final int RULE_LITERALSTRING=24;
    public static final int RULE_XML_GTEQ=7;
    public static final int RULE_TML_SEPARATOR=27;
    public static final int RULE_CURLYCLOSE=37;
    public static final int EOF=-1;
    public static final int RULE_NOT=21;
    public static final int RULE_NULL=15;
    public static final int RULE_NEQUALS=39;
    public static final int RULE_BRACKET_OPEN=30;
    public static final int RULE_TRUE=13;
    public static final int RULE_DOLLAR=29;
    public static final int RULE_FORALL=17;
    public static final int RULE_MINUS=41;
    public static final int RULE_COLON=20;
    public static final int RULE_TML_EXISTS=28;
    public static final int RULE_FALSE=14;
    public static final int RULE_DOT=9;
    public static final int RULE_NUMBER=10;
    public static final int RULE_SQBRACKET_CLOSE=26;
    public static final int RULE_TODAY=16;
    public static final int RULE_MULTIPLY=42;
    public static final int RULE_XMLESCAPED=23;
    public static final int RULE_XML_LTEQ=8;
    public static final int RULE_BADNUMBER=11;
    public static final int RULE_WS=12;
    public static final int RULE_XML_GT=5;
    public static final int RULE_EQUALSEQUALS=38;
    public static final int RULE_AT=19;

    // delegates
    // delegators

    public InternalNavajoExpressionLexer() {;} 
    public InternalNavajoExpressionLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalNavajoExpressionLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g"; }

    // $ANTLR start "KEYWORD_1"
    public final void mKEYWORD_1() throws RecognitionException {
        try {
            int _type = KEYWORD_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:19:11: ( ';' )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:19:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_1"

    // $ANTLR start "RULE_XML_GT"
    public final void mRULE_XML_GT() throws RecognitionException {
        try {
            int _type = RULE_XML_GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:23:13: ( '&gt;' )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:23:15: '&gt;'
            {
            match("&gt;"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_XML_GT"

    // $ANTLR start "RULE_XML_LT"
    public final void mRULE_XML_LT() throws RecognitionException {
        try {
            int _type = RULE_XML_LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:25:13: ( '&lt;' )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:25:15: '&lt;'
            {
            match("&lt;"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_XML_LT"

    // $ANTLR start "RULE_XML_GTEQ"
    public final void mRULE_XML_GTEQ() throws RecognitionException {
        try {
            int _type = RULE_XML_GTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:27:15: ( '&gt;=' )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:27:17: '&gt;='
            {
            match("&gt;="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_XML_GTEQ"

    // $ANTLR start "RULE_XML_LTEQ"
    public final void mRULE_XML_LTEQ() throws RecognitionException {
        try {
            int _type = RULE_XML_LTEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:29:15: ( '&lt;=' )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:29:17: '&lt;='
            {
            match("&lt;="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_XML_LTEQ"

    // $ANTLR start "RULE_DOT"
    public final void mRULE_DOT() throws RecognitionException {
        try {
            int _type = RULE_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:31:10: ( '.' )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:31:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOT"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:33:13: ( ( '0' .. '9' )+ ( RULE_DOT ( '0' .. '9' )+ )? )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:33:15: ( '0' .. '9' )+ ( RULE_DOT ( '0' .. '9' )+ )?
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:33:15: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:33:16: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:33:27: ( RULE_DOT ( '0' .. '9' )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='.') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:33:28: RULE_DOT ( '0' .. '9' )+
                    {
                    mRULE_DOT(); 
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:33:37: ( '0' .. '9' )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:33:38: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_BADNUMBER"
    public final void mRULE_BADNUMBER() throws RecognitionException {
        try {
            int _type = RULE_BADNUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:35:16: ( ( '0' .. '9' )+ RULE_DOT )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:35:18: ( '0' .. '9' )+ RULE_DOT
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:35:18: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:35:19: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            mRULE_DOT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BADNUMBER"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:37:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:37:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:37:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\t' && LA5_0<='\n')||LA5_0=='\r'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_TRUE"
    public final void mRULE_TRUE() throws RecognitionException {
        try {
            int _type = RULE_TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:39:11: ( ( 'true' | 'TRUE' ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:39:13: ( 'true' | 'TRUE' )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:39:13: ( 'true' | 'TRUE' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='t') ) {
                alt6=1;
            }
            else if ( (LA6_0=='T') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:39:14: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:39:21: 'TRUE'
                    {
                    match("TRUE"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TRUE"

    // $ANTLR start "RULE_FALSE"
    public final void mRULE_FALSE() throws RecognitionException {
        try {
            int _type = RULE_FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:41:12: ( ( 'false' | 'FALSE' ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:41:14: ( 'false' | 'FALSE' )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:41:14: ( 'false' | 'FALSE' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='f') ) {
                alt7=1;
            }
            else if ( (LA7_0=='F') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:41:15: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:41:23: 'FALSE'
                    {
                    match("FALSE"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FALSE"

    // $ANTLR start "RULE_NULL"
    public final void mRULE_NULL() throws RecognitionException {
        try {
            int _type = RULE_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:43:11: ( ( 'null' | 'NULL' ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:43:13: ( 'null' | 'NULL' )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:43:13: ( 'null' | 'NULL' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='n') ) {
                alt8=1;
            }
            else if ( (LA8_0=='N') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:43:14: 'null'
                    {
                    match("null"); 


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:43:21: 'NULL'
                    {
                    match("NULL"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NULL"

    // $ANTLR start "RULE_TODAY"
    public final void mRULE_TODAY() throws RecognitionException {
        try {
            int _type = RULE_TODAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:45:12: ( ( 'today' | 'TODAY' ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:45:14: ( 'today' | 'TODAY' )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:45:14: ( 'today' | 'TODAY' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='t') ) {
                alt9=1;
            }
            else if ( (LA9_0=='T') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:45:15: 'today'
                    {
                    match("today"); 


                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:45:23: 'TODAY'
                    {
                    match("TODAY"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TODAY"

    // $ANTLR start "RULE_FORALL"
    public final void mRULE_FORALL() throws RecognitionException {
        try {
            int _type = RULE_FORALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:47:13: ( 'FORALL' )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:47:15: 'FORALL'
            {
            match("FORALL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FORALL"

    // $ANTLR start "RULE_PARENT"
    public final void mRULE_PARENT() throws RecognitionException {
        try {
            int _type = RULE_PARENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:49:13: ( '..' )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:49:15: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PARENT"

    // $ANTLR start "RULE_AT"
    public final void mRULE_AT() throws RecognitionException {
        try {
            int _type = RULE_AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:51:9: ( '@' )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:51:11: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AT"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:53:12: ( ':' )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:53:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_NOT"
    public final void mRULE_NOT() throws RecognitionException {
        try {
            int _type = RULE_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:55:10: ( '!' )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:55:12: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOT"

    // $ANTLR start "RULE_XMLESCAPED"
    public final void mRULE_XMLESCAPED() throws RecognitionException {
        try {
            int _type = RULE_XMLESCAPED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:57:17: ( '&' RULE_ID ';' )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:57:19: '&' RULE_ID ';'
            {
            match('&'); 
            mRULE_ID(); 
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_XMLESCAPED"

    // $ANTLR start "RULE_LITERALSTRING"
    public final void mRULE_LITERALSTRING() throws RecognitionException {
        try {
            int _type = RULE_LITERALSTRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:59:20: ( ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' | '<![CDATA[' ( options {greedy=false; } : . )* ']]>' ) )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:59:22: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' | '<![CDATA[' ( options {greedy=false; } : . )* ']]>' )
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:59:22: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' | '<![CDATA[' ( options {greedy=false; } : . )* ']]>' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\'') ) {
                alt12=1;
            }
            else if ( (LA12_0=='<') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:59:23: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:59:28: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:59:29: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:59:70: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;
                case 2 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:59:92: '<![CDATA[' ( options {greedy=false; } : . )* ']]>'
                    {
                    match("<![CDATA["); 

                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:59:104: ( options {greedy=false; } : . )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==']') ) {
                            int LA11_1 = input.LA(2);

                            if ( (LA11_1==']') ) {
                                int LA11_3 = input.LA(3);

                                if ( (LA11_3=='>') ) {
                                    alt11=2;
                                }
                                else if ( ((LA11_3>='\u0000' && LA11_3<='=')||(LA11_3>='?' && LA11_3<='\uFFFF')) ) {
                                    alt11=1;
                                }


                            }
                            else if ( ((LA11_1>='\u0000' && LA11_1<='\\')||(LA11_1>='^' && LA11_1<='\uFFFF')) ) {
                                alt11=1;
                            }


                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='\\')||(LA11_0>='^' && LA11_0<='\uFFFF')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:59:132: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match("]]>"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LITERALSTRING"

    // $ANTLR start "RULE_SQBRACKET_OPEN"
    public final void mRULE_SQBRACKET_OPEN() throws RecognitionException {
        try {
            int _type = RULE_SQBRACKET_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:61:21: ( '[' )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:61:23: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SQBRACKET_OPEN"

    // $ANTLR start "RULE_SQBRACKET_CLOSE"
    public final void mRULE_SQBRACKET_CLOSE() throws RecognitionException {
        try {
            int _type = RULE_SQBRACKET_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:63:22: ( ']' )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:63:24: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SQBRACKET_CLOSE"

    // $ANTLR start "RULE_TML_SEPARATOR"
    public final void mRULE_TML_SEPARATOR() throws RecognitionException {
        try {
            int _type = RULE_TML_SEPARATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:65:20: ( '/' )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:65:22: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TML_SEPARATOR"

    // $ANTLR start "RULE_TML_EXISTS"
    public final void mRULE_TML_EXISTS() throws RecognitionException {
        try {
            int _type = RULE_TML_EXISTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:67:17: ( '?' )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:67:19: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TML_EXISTS"

    // $ANTLR start "RULE_DOLLAR"
    public final void mRULE_DOLLAR() throws RecognitionException {
        try {
            int _type = RULE_DOLLAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:69:13: ( '$' )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:69:15: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOLLAR"

    // $ANTLR start "RULE_BRACKET_OPEN"
    public final void mRULE_BRACKET_OPEN() throws RecognitionException {
        try {
            int _type = RULE_BRACKET_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:71:19: ( '(' )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:71:21: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BRACKET_OPEN"

    // $ANTLR start "RULE_BRACKET_CLOSE"
    public final void mRULE_BRACKET_CLOSE() throws RecognitionException {
        try {
            int _type = RULE_BRACKET_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:73:20: ( ')' )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:73:22: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BRACKET_CLOSE"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:75:12: ( ',' )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:75:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_AND"
    public final void mRULE_AND() throws RecognitionException {
        try {
            int _type = RULE_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:77:10: ( 'AND' )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:77:12: 'AND'
            {
            match("AND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AND"

    // $ANTLR start "RULE_OR"
    public final void mRULE_OR() throws RecognitionException {
        try {
            int _type = RULE_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:79:9: ( 'OR' )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:79:11: 'OR'
            {
            match("OR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OR"

    // $ANTLR start "RULE_HASH"
    public final void mRULE_HASH() throws RecognitionException {
        try {
            int _type = RULE_HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:81:11: ( '#' )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:81:13: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HASH"

    // $ANTLR start "RULE_CURLYOPEN"
    public final void mRULE_CURLYOPEN() throws RecognitionException {
        try {
            int _type = RULE_CURLYOPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:83:16: ( '{' )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:83:18: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CURLYOPEN"

    // $ANTLR start "RULE_CURLYCLOSE"
    public final void mRULE_CURLYCLOSE() throws RecognitionException {
        try {
            int _type = RULE_CURLYCLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:85:17: ( '}' )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:85:19: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CURLYCLOSE"

    // $ANTLR start "RULE_EQUALSEQUALS"
    public final void mRULE_EQUALSEQUALS() throws RecognitionException {
        try {
            int _type = RULE_EQUALSEQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:87:19: ( '==' )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:87:21: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQUALSEQUALS"

    // $ANTLR start "RULE_NEQUALS"
    public final void mRULE_NEQUALS() throws RecognitionException {
        try {
            int _type = RULE_NEQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:89:14: ( '!=' )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:89:16: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NEQUALS"

    // $ANTLR start "RULE_PLUS"
    public final void mRULE_PLUS() throws RecognitionException {
        try {
            int _type = RULE_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:91:11: ( '+' )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:91:13: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLUS"

    // $ANTLR start "RULE_MINUS"
    public final void mRULE_MINUS() throws RecognitionException {
        try {
            int _type = RULE_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:93:12: ( '-' )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:93:14: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MINUS"

    // $ANTLR start "RULE_MULTIPLY"
    public final void mRULE_MULTIPLY() throws RecognitionException {
        try {
            int _type = RULE_MULTIPLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:95:15: ( '*' )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:95:17: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MULTIPLY"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:97:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:97:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:97:11: ( '^' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='^') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:97:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:97:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')||(LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='z')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    public void mTokens() throws RecognitionException {
        // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:1:8: ( KEYWORD_1 | RULE_XML_GT | RULE_XML_LT | RULE_XML_GTEQ | RULE_XML_LTEQ | RULE_DOT | RULE_NUMBER | RULE_BADNUMBER | RULE_WS | RULE_TRUE | RULE_FALSE | RULE_NULL | RULE_TODAY | RULE_FORALL | RULE_PARENT | RULE_AT | RULE_COLON | RULE_NOT | RULE_XMLESCAPED | RULE_LITERALSTRING | RULE_SQBRACKET_OPEN | RULE_SQBRACKET_CLOSE | RULE_TML_SEPARATOR | RULE_TML_EXISTS | RULE_DOLLAR | RULE_BRACKET_OPEN | RULE_BRACKET_CLOSE | RULE_COMMA | RULE_AND | RULE_OR | RULE_HASH | RULE_CURLYOPEN | RULE_CURLYCLOSE | RULE_EQUALSEQUALS | RULE_NEQUALS | RULE_PLUS | RULE_MINUS | RULE_MULTIPLY | RULE_ID )
        int alt15=39;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:1:10: KEYWORD_1
                {
                mKEYWORD_1(); 

                }
                break;
            case 2 :
                // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:1:20: RULE_XML_GT
                {
                mRULE_XML_GT(); 

                }
                break;
            case 3 :
                // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:1:32: RULE_XML_LT
                {
                mRULE_XML_LT(); 

                }
                break;
            case 4 :
                // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:1:44: RULE_XML_GTEQ
                {
                mRULE_XML_GTEQ(); 

                }
                break;
            case 5 :
                // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:1:58: RULE_XML_LTEQ
                {
                mRULE_XML_LTEQ(); 

                }
                break;
            case 6 :
                // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:1:72: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 7 :
                // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:1:81: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 8 :
                // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:1:93: RULE_BADNUMBER
                {
                mRULE_BADNUMBER(); 

                }
                break;
            case 9 :
                // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:1:108: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 10 :
                // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:1:116: RULE_TRUE
                {
                mRULE_TRUE(); 

                }
                break;
            case 11 :
                // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:1:126: RULE_FALSE
                {
                mRULE_FALSE(); 

                }
                break;
            case 12 :
                // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:1:137: RULE_NULL
                {
                mRULE_NULL(); 

                }
                break;
            case 13 :
                // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:1:147: RULE_TODAY
                {
                mRULE_TODAY(); 

                }
                break;
            case 14 :
                // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:1:158: RULE_FORALL
                {
                mRULE_FORALL(); 

                }
                break;
            case 15 :
                // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:1:170: RULE_PARENT
                {
                mRULE_PARENT(); 

                }
                break;
            case 16 :
                // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:1:182: RULE_AT
                {
                mRULE_AT(); 

                }
                break;
            case 17 :
                // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:1:190: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 18 :
                // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:1:201: RULE_NOT
                {
                mRULE_NOT(); 

                }
                break;
            case 19 :
                // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:1:210: RULE_XMLESCAPED
                {
                mRULE_XMLESCAPED(); 

                }
                break;
            case 20 :
                // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:1:226: RULE_LITERALSTRING
                {
                mRULE_LITERALSTRING(); 

                }
                break;
            case 21 :
                // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:1:245: RULE_SQBRACKET_OPEN
                {
                mRULE_SQBRACKET_OPEN(); 

                }
                break;
            case 22 :
                // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:1:265: RULE_SQBRACKET_CLOSE
                {
                mRULE_SQBRACKET_CLOSE(); 

                }
                break;
            case 23 :
                // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:1:286: RULE_TML_SEPARATOR
                {
                mRULE_TML_SEPARATOR(); 

                }
                break;
            case 24 :
                // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:1:305: RULE_TML_EXISTS
                {
                mRULE_TML_EXISTS(); 

                }
                break;
            case 25 :
                // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:1:321: RULE_DOLLAR
                {
                mRULE_DOLLAR(); 

                }
                break;
            case 26 :
                // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:1:333: RULE_BRACKET_OPEN
                {
                mRULE_BRACKET_OPEN(); 

                }
                break;
            case 27 :
                // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:1:351: RULE_BRACKET_CLOSE
                {
                mRULE_BRACKET_CLOSE(); 

                }
                break;
            case 28 :
                // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:1:370: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 29 :
                // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:1:381: RULE_AND
                {
                mRULE_AND(); 

                }
                break;
            case 30 :
                // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:1:390: RULE_OR
                {
                mRULE_OR(); 

                }
                break;
            case 31 :
                // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:1:398: RULE_HASH
                {
                mRULE_HASH(); 

                }
                break;
            case 32 :
                // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:1:408: RULE_CURLYOPEN
                {
                mRULE_CURLYOPEN(); 

                }
                break;
            case 33 :
                // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:1:423: RULE_CURLYCLOSE
                {
                mRULE_CURLYCLOSE(); 

                }
                break;
            case 34 :
                // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:1:439: RULE_EQUALSEQUALS
                {
                mRULE_EQUALSEQUALS(); 

                }
                break;
            case 35 :
                // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:1:457: RULE_NEQUALS
                {
                mRULE_NEQUALS(); 

                }
                break;
            case 36 :
                // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:1:470: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 37 :
                // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:1:480: RULE_MINUS
                {
                mRULE_MINUS(); 

                }
                break;
            case 38 :
                // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:1:491: RULE_MULTIPLY
                {
                mRULE_MULTIPLY(); 

                }
                break;
            case 39 :
                // ../com.dexels.navajo.dsl.expression/src-gen/com/dexels/navajo/dsl/expression/parser/antlr/lexer/InternalNavajoExpressionLexer.g:1:505: RULE_ID
                {
                mRULE_ID(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\3\uffff\1\46\1\50\1\uffff\6\41\2\uffff\1\63\11\uffff\2\41\15\uffff"+
        "\1\70\1\uffff\11\41\2\uffff\1\41\1\103\3\uffff\11\41\1\117\1\uffff"+
        "\1\121\1\123\1\124\1\41\1\124\4\41\2\132\6\uffff\2\133\2\134\1\41"+
        "\3\uffff\1\136\1\uffff";
    static final String DFA15_eofS =
        "\137\uffff";
    static final String DFA15_minS =
        "\1\11\1\uffff\1\101\2\56\1\uffff\1\157\1\117\1\141\1\101\1\165\1"+
        "\125\2\uffff\1\75\11\uffff\1\116\1\122\10\uffff\2\60\3\uffff\1\60"+
        "\1\uffff\1\165\1\144\1\125\1\104\1\154\1\114\1\122\1\154\1\114\2"+
        "\uffff\1\104\3\60\1\uffff\1\145\1\141\1\105\1\101\1\163\1\123\1"+
        "\101\1\154\1\114\1\60\1\uffff\2\75\1\60\1\171\1\60\1\131\1\145\1"+
        "\105\1\114\2\60\6\uffff\4\60\1\114\3\uffff\1\60\1\uffff";
    static final String DFA15_maxS =
        "\1\175\1\uffff\1\172\1\56\1\71\1\uffff\1\162\1\122\1\141\1\117\1"+
        "\165\1\125\2\uffff\1\75\11\uffff\1\116\1\122\10\uffff\2\172\3\uffff"+
        "\1\71\1\uffff\1\165\1\144\1\125\1\104\1\154\1\114\1\122\1\154\1"+
        "\114\2\uffff\1\104\3\172\1\uffff\1\145\1\141\1\105\1\101\1\163\1"+
        "\123\1\101\1\154\1\114\1\172\1\uffff\2\75\1\172\1\171\1\172\1\131"+
        "\1\145\1\105\1\114\2\172\6\uffff\4\172\1\114\3\uffff\1\172\1\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\3\uffff\1\11\6\uffff\1\20\1\21\1\uffff\1\24\1\25\1"+
        "\26\1\27\1\30\1\31\1\32\1\33\1\34\2\uffff\1\37\1\40\1\41\1\42\1"+
        "\44\1\45\1\46\1\47\2\uffff\1\23\1\17\1\6\1\uffff\1\7\11\uffff\1"+
        "\43\1\22\4\uffff\1\10\12\uffff\1\36\13\uffff\1\35\1\4\1\2\1\5\1"+
        "\3\1\12\5\uffff\1\14\1\15\1\13\1\uffff\1\16";
    static final String DFA15_specialS =
        "\137\uffff}>";
    static final String[] DFA15_transitionS = {
            "\2\5\2\uffff\1\5\22\uffff\1\5\1\16\1\uffff\1\32\1\24\1\uffff"+
            "\1\2\1\17\1\25\1\26\1\40\1\36\1\27\1\37\1\3\1\22\12\4\1\15\1"+
            "\1\1\17\1\35\1\uffff\1\23\1\14\1\30\4\41\1\11\7\41\1\13\1\31"+
            "\4\41\1\7\6\41\1\20\1\uffff\1\21\2\41\1\uffff\5\41\1\10\7\41"+
            "\1\12\5\41\1\6\6\41\1\33\1\uffff\1\34",
            "",
            "\32\44\3\uffff\2\44\1\uffff\6\44\1\42\4\44\1\43\16\44",
            "\1\45",
            "\1\47\1\uffff\12\4",
            "",
            "\1\52\2\uffff\1\51",
            "\1\54\2\uffff\1\53",
            "\1\55",
            "\1\56\15\uffff\1\57",
            "\1\60",
            "\1\61",
            "",
            "",
            "\1\62",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\64",
            "\1\65",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\44\1\uffff\1\44\5\uffff\32\44\4\uffff\1\44\1\uffff\23\44"+
            "\1\66\6\44",
            "\12\44\1\uffff\1\44\5\uffff\32\44\4\uffff\1\44\1\uffff\23\44"+
            "\1\67\6\44",
            "",
            "",
            "",
            "\12\50",
            "",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "",
            "",
            "\1\102",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\44\1\uffff\1\104\5\uffff\32\44\4\uffff\1\44\1\uffff\32"+
            "\44",
            "\12\44\1\uffff\1\105\5\uffff\32\44\4\uffff\1\44\1\uffff\32"+
            "\44",
            "",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\120",
            "\1\122",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\125",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\135",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( KEYWORD_1 | RULE_XML_GT | RULE_XML_LT | RULE_XML_GTEQ | RULE_XML_LTEQ | RULE_DOT | RULE_NUMBER | RULE_BADNUMBER | RULE_WS | RULE_TRUE | RULE_FALSE | RULE_NULL | RULE_TODAY | RULE_FORALL | RULE_PARENT | RULE_AT | RULE_COLON | RULE_NOT | RULE_XMLESCAPED | RULE_LITERALSTRING | RULE_SQBRACKET_OPEN | RULE_SQBRACKET_CLOSE | RULE_TML_SEPARATOR | RULE_TML_EXISTS | RULE_DOLLAR | RULE_BRACKET_OPEN | RULE_BRACKET_CLOSE | RULE_COMMA | RULE_AND | RULE_OR | RULE_HASH | RULE_CURLYOPEN | RULE_CURLYCLOSE | RULE_EQUALSEQUALS | RULE_NEQUALS | RULE_PLUS | RULE_MINUS | RULE_MULTIPLY | RULE_ID );";
        }
    }
 

}