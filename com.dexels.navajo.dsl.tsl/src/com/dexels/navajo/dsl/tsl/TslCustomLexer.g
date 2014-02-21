lexer grammar TslCustomLexer;


@header {
package com.dexels.navajo.dsl.tsl;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@members {
	private boolean inExpression = false;
	private boolean inCustomMap = false;
}



KEYWORD_1 : ';';



RULE_XMLHEAD : '<?' ( options {greedy=false;} : . )*'?>';

RULE_XMLCOMMENT : '<!--' ( options {greedy=false;} : . )*'-->';

RULE_LTS : '</';

RULE_LT : '<';


RULE_NAVASCRIPTTAG : 'navascript';

RULE_TSLTAG : 'tsl';

RULE_QUOTE : '"';

RULE_NOTES : 'notes';

RULE_NAME : 'name';

RULE_ID : 'id';

RULE_REPOSITORY : 'repository';

RULE_AUTHOR : 'author';

RULE_XMLNS : 'xmlns';

RULE_SCHEMALOCATION : 'schemaLocation';

RULE_NONAMESPACESCHEMALOCATION : 'noNamespaceSchemaLocation';

RULE_TYPE : 'type';

RULE_MODE : 'mode';

RULE_SCRIPT : 'script';

RULE_CONDITION : 'condition';

RULE_FILTER : 'filter';

RULE_OBJECT : 'object';

RULE_COUNT : 'count';

RULE_REF : 'ref';

RULE_LENGTH : 'length';

RULE_CARDINALITY : 'cardinality';

RULE_SUBTYPES : 'subtypes';

RULE_DIRECTION : 'direction';

RULE_DESCRIPTION : 'description';

RULE_CODE : 'code';

RULE_VALUE : 'value';

RULE_XMLSPACE : 'xml:space';

RULE_PRESERVE : 'preserve';

RULE_COMMENT : 'comment';

RULE_GT : '>';

RULE_XML_TAG_SINGLEEND : '/>';

RULE_INCLUDETAG : 'include';

RULE_PROPERTYTAG : 'property';

RULE_REQUIREDTAG : 'required';

RULE_VALIDATIONSTAG : 'validations';

RULE_CHECKTAG : 'check';

RULE_BREAKTAG : 'break';

RULE_OPTIONTAG : 'option';

RULE_EQUALS : '=';

RULE_EXPRESSION_TAG : 'expression';

RULE_PARAMTAG : 'param';

RULE_MESSAGETAG : 'message';

RULE_METHODTAG : 'method';

RULE_METHODSTAG : 'methods';

RULE_FIELDTAG : 'field';

RULE_DEBUG_TAG : 'debug';

RULE_NAVASCRIPT_END : (RULE_LTS RULE_NAVASCRIPTTAG RULE_GT|RULE_LTS RULE_TSLTAG RULE_GT);

RULE_XML_GT : '&gt;';

RULE_XML_LT : '&lt;';

RULE_XML_GTEQ : '&gt;=';

RULE_XML_LTEQ : '&lt;=';

RULE_DOT : '.';

RULE_NUMBER : ('0'..'9')+ (RULE_DOT ('0'..'9')+)?;

RULE_BADNUMBER : ('0'..'9')+ RULE_DOT;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_TRUE : {inExpression}?('true'|'TRUE');

RULE_FALSE :{inExpression}? ('false'|'FALSE');

RULE_NULL : {inExpression}?('null'|'NULL');

RULE_TODAY : {inExpression}?('today'|'TODAY');

RULE_FORALL :{inExpression}? 'FORALL';

RULE_PARENT :{inExpression}? '..';

RULE_AT :{inExpression}? '@';

RULE_COLON : {inExpression}?':';

RULE_NOT : {inExpression}?'!';

RULE_XMLESCAPED :{inExpression}? '&' RULE_ID ';';

RULE_LITERALSTRING :{inExpression}? ('\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\''|'<![CDATA[' ( options {greedy=false;} : . )*']]>');

RULE_SQBRACKET_OPEN :{inExpression}? '[';

RULE_SQBRACKET_CLOSE :{inExpression}? ']';

RULE_TML_SEPARATOR :{inExpression}? '/';

RULE_TML_EXISTS :{inExpression}? '?';

RULE_DOLLAR :{inExpression}? '$';

RULE_BRACKET_OPEN :{inExpression}? '(';

RULE_BRACKET_CLOSE :{inExpression}? ')';

RULE_COMMA :{inExpression}? ',';

RULE_AND :{inExpression}? 'AND';

RULE_OR :{inExpression}? 'OR';

RULE_HASH :{inExpression}? '#';

RULE_CURLYOPEN :{inExpression}? '{';

RULE_CURLYCLOSE :{inExpression}? '}';

RULE_EQUALSEQUALS :{inExpression}? '==';

RULE_NEQUALS :{inExpression}? '!=';

RULE_PLUS : {inExpression}?'+';

RULE_MINUS : {inExpression}? '-';

RULE_MULTIPLY :{inExpression}? '*';



