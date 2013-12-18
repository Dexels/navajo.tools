/*
 * generated by Xtext
 */
package com.dexels.navajo.dsl.tsl.formatting;

import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;

import com.dexels.navajo.dsl.tsl.services.TslGrammarAccess;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
public class TslFormatter extends AbstractDeclarativeFormatter {
	
	@Override
	protected void configureFormatting(FormattingConfig c) {
// It's usually a good idea to activate the following three statements.
// They will add and preserve newlines around comments
		TslGrammarAccess f = (TslGrammarAccess) getGrammarAccess();
		c.setNoLinewrap();
		c.setAutoLinewrap(160);
		
	

		c.setSpace(" ").after(f.getMapIdRule());
		c.setNoSpace().after(f.getAttributeNameRule());
	//	c.setNoSpace().after(f.getMapStartRule());
//		c.setNoSpace().after(f.getMAPSTARTKEYWORDRule());
		c.setNoSpace().after(f.getDOLLARRule());
		c.setNoSpace().before(f.getMapIdRule());
		c.setNoSpace().before(f.getGTRule());
		c.setNoSpace().before(f.getXML_TAG_SINGLEENDRule());
//		c.setNoSpace().before(f.getATTRIBUTESTRINGRule());
//		c.setNoSpace().before(f.getQUOTEQRule());
//		c.setNoSpace().after(f.getQUOTEQRule());
//		c.setNoSpace().before(f.getSEMICOLONQUOTERule());
		
		c.setNoSpace().before(f.getDOTRule());
		c.setNoSpace().after(f.getDOTRule());

		c.setLinewrap(1).after(f.getXMLHEADRule());

		
		c.setLinewrap(1).after(f.getXML_GTRule());
		c.setLinewrap(1).after(f.getXML_TAG_SINGLEENDRule());
//		c.setLinewrap(1).before(f.getXML_TAG_STARTRule());
		c.setLinewrap(1).before(f.getPropertyRule());
		c.setLinewrap(1).before(f.getMessageRule());
		c.setLinewrap(1).before(f.getFieldRule());
		c.setLinewrap(1).before(f.getNAVASCRIPT_ENDRule());
//		c.setLinewrap(1).before(f.getMapRule());

		c.setLinewrap(1).before(f.getMethodRule());

		c.setLinewrap(1).before(f.getMethodsRule());
		


		
		c.setIndentationIncrement().before(f.getGTRule());
		c.setIndentationDecrement().after(f.getXML_START_ENDTAGRule());
		
		c.setIndentationDecrement().after(f.getXML_TAG_SINGLEENDRule());
		

//		c.setNoSpace().after(f.getQUOTEQRule());
		c.setNoSpace().after(f.getPathElementRule());
		c.setNoSpace().after(f.getFunctionNameRule());
		c.setNoSpace().after(f.getAttributeNameRule());
		c.setNoSpace().after(f.getSQBRACKET_OPENRule());
		c.setNoSpace().after(f.getSQBRACKET_OPENRule());
		c.setNoSpace().after(f.getTML_EXISTSRule());
		c.setNoSpace().after(f.getTML_SEPARATORRule());
		
		//		c.setNoSpace().after(f.getMap)
//		c.setLinewrap(1).after(f.findKeywordPairs("<", "/>").);
		
//		c.setLinewrap(1).after(f.getMessageRule());
//		c.setLinewrap(1).after(f.getMessageRule());
//		c.setLinewrap(1).after(f.getPropertyRule());

	}


}
