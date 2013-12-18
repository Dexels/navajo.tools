package com.dexels.navajo.dsl.tsl.ui.highlighting;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;

public class TslLexicalHighlightingMapper extends
		AbstractAntlrTokenToAttributeIdMapper {

	// private static final Pattern QUOTED =
	// Pattern.compile("(?:^'([^']*)'$)|(?:^\"([^\"]*)\")$", Pattern.MULTILINE);

	// private static final Pattern PUNCTUATION =
	// Pattern.compile("\\p{Punct}*");

	@Override
	protected String calculateId(String tokenName, int tokenType) {
//		if(true) {
//			return TslHighlightingConfiguration.KEYWORD_ID;
//		}
//		if("RULE_EXPRESSION_START".equals(tokenName)) {
//			return TslHighlightingConfiguration.DEPRECATED_ID;
//		}
//		if("RULE_EXPRESSION_END".equals(tokenName)) {
//			return TslHighlightingConfiguration.DEPRECATED_ID;
//		}
		String[] keytags = new String[]{				"RULE_LTSDEBUG_TAG",
				"RULE_LTSMETHODSTAG",
				"RULE_LTSMAPTAG",
				"RULE_NAVASCRIPT_END",
				"RULE_LTSCOMMENT",
				"RULE_LTEXPRESSION_TAG",
				"RULE_LITERALSTRING",
				"RULE_LTCHECKTAG",
				"RULE_LTTSLTAG",
				"RULE_LTPROPERTYTAG",
				"RULE_LTOPTIONTAG",
				"RULE_LTSPROPERTYTAG",
				"RULE_LTDEBUG_TAG",
				"RULE_LTFIELDTAG",
				"RULE_LTSCHECKTAG",
				"RULE_LTINCLUDETAG",
				"RULE_LTSOPTIONTAG",
				"RULE_LTMESSAGETAG",
				"RULE_LTBREAKTAG",
				"RULE_EXPRESSION_END_TAG",
				"RULE_LTSMESSAGETAG",
				"RULE_LTSFIELDTAG",
				"RULE_LTMETHODTAG",
				"RULE_LTSNAVASCRIPTTAG",
				"RULE_LTSPARAMTAG",
				"RULE_LTSVALIDATIONSTAG",
				"RULE_LTVALIDATIONSTAG",
				"RULE_LTSMETHODTAG",
				"RULE_LTMETHODSTAG",
				"RULE_LTNAVASCRIPTTAG",
				"RULE_LTSINCLUDETAG",
				"RULE_LTMAPTAG",
				"RULE_LTPARAMTAG",
				"RULE_LTCOMMENT",
				"RULE_LTSTSLTAG",
				"RULE_LTSREQUIREDTAG",
				"RULE_LTSBREAKTAG",
				"RULE_GT",
				"RULE_XML_TAG_SINGLEEND",
				"RULE_LTREQUIREDTAG"};
		String[] keyattributes = new String[]{
				"RULE_VALUEEQ",
				"RULE_MESSAGEEQ",
				"RULE_REPOSITORYEQ",
				"RULE_SUBTYPESEQ",
				"RULE_IDEQ",
				"RULE_REFEQ",
				"RULE_AUTHOREQ",
				"RULE_NAMEEQ",
				"RULE_DIRECTIONEQ",
				"RULE_CARDINALITYEQ",
				"RULE_NOTESEQ",
				"RULE_TYPEEQ",
				"RULE_SCRIPTEQ",
				"RULE_DESCRIPTIONEQ",
				"RULE_MODEEQ",
				"RULE_COMMENTEQ",
				"RULE_CONDITIONEQ",
				"RULE_OBJECTEQ",
				"RULE_FILTEREQ",
				"RULE_COUNTEQ",
				"RULE_LENGTHEQ",
		};
		String[] unimportant = new String[]{
				"RULE_XMLHEAD",
				"RULE_PRESERVE",
				"RULE_SCHEMALOCATIONEQ",
				"RULE_XMLSPACE",
				"RULE_XMLCOMMENT",
				"RULE_NONAMESPACESCHEMALOCATIONEQ",
								"RULE_XMLNS",
		};
		String[] expression = new String[]{
				"RULE_FORALL",
				"RULE_OR",
				"RULE_NOT",
				"RULE_AND",
				"RULE_TODAY",
				"RULE_TRUE",
				"RULE_FALSE",
		};
		String[] other = new String[]{

				"RULE_ID",
				"RULE_PARENT",
				"RULE_XML_GT",
				"RULE_BRACKET_CLOSE",
				"RULE_CURLYCLOSE",
				"RULE_HASH",
				"RULE_COMMA",
				"RULE_MINUS",
				"RULE_TML_EXISTS",
				"RULE_SQBRACKET_CLOSE",
				"RULE_NEQUALS",
				"RULE_MULTIPLY",
				"RULE_EQUALSEQUALS",
				"RULE_AT",
				"RULE_QUOTE",
				"RULE_SQBRACKET_OPEN",
				"RULE_LT",
				"RULE_DOT",
				"RULE_NUMBER",

				"RULE_BADNUMBER",

				"RULE_XML_LT",
				"RULE_XML_LTEQ",
				"RULE_PLUS",
				"RULE_CURLYOPEN",

				"RULE_XML_GTEQ",
				"RULE_TML_SEPARATOR",
				"RULE_NULL",
				"RULE_BRACKET_OPEN",
				"RULE_DOLLAR",
				"RULE_COLON",
				"RULE_XMLESCAPED",
				"RULE_XML_START_ENDTAG",
				"RULE_EQUALS",
				"RULE_WS"
				};
		
				

//		boolean encountered = valueForAnyInString(tokenName, new String[]{"RULE_ATTRIBUTESTRING","RULE_EMPTYSTRING","RULE_INT","RULE_LITERALSTRING"});
//		if(encountered) {
//			return TslHighlightingConfiguration.LITERAL_ID;
//		}
		
		boolean encountered = valueForAnyInString(tokenName, unimportant);
		if(encountered) { 
//			System.err.println("COMMENT FOUND>>>>"+getId(tokenType)+" ttype: "+tokenType+" tokenname: "+tokenName);
			return TslHighlightingConfiguration.TSL_COMMENT_ID;
		}

		encountered = valueForAnyInString(tokenName, keytags);
		if(encountered) {
			return TslHighlightingConfiguration.KEYWORD_ID;
		}
		encountered = valueForAnyInString(tokenName, keyattributes);
		if(encountered) {
			return TslHighlightingConfiguration.KEYATTRIBUTE_ID;
		}
		encountered = valueForAnyInString(tokenName, expression);
		if(encountered) {
			return TslHighlightingConfiguration.KEYEXPRESSION_ID;
		}
		encountered = valueForAnyInString(tokenName, unimportant);
		if(encountered) {
			return TslHighlightingConfiguration.TSL_COMMENT_ID;
		}

//		encountered = valueForAnyInString(tokenName, new String[]{"RULE_QUOTEQ","RULE_SEMICOLONQUOTE"});
//		if(encountered) {
//			return TslHighlightingConfiguration.EXPR_DELIM_ID;
//		}

		
		
//		if(PUNCTUATION.matcher(tokenName).matches()) {
//			return DefaultHighlightingConfiguration.PUNCTUATION_ID;
//		}
//		if(QUOTED.matcher(tokenName).matches()) {
//			return DefaultHighlightingConfiguration.KEYWORD_ID;
//		}
		if("RULE_STRING".equals(tokenName)) {
			return DefaultHighlightingConfiguration.STRING_ID;
		}
		if("RULE_INT".equals(tokenName)) {
			return DefaultHighlightingConfiguration.NUMBER_ID;
		}
		return DefaultHighlightingConfiguration.DEFAULT_ID;
	}

	private boolean valueForAnyInString(String tokenName, String[] tokenList) {
		for (String string : tokenList) {
			if (string.equals(tokenName)) {
				return true;
			}
		}
		return false;
	}

}