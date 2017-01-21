package com.aem.useclass;

import org.apache.felix.scr.annotations.Reference;

import com.adobe.cq.sightly.WCMUse;
import com.aem.StyleService;

public class StyleServiceUse extends WCMUse {

	@Override
	public void activate() throws Exception {
		// TODO Auto-generated method stub	
	}
	
	@Reference
	StyleService styleService;
	
	public StyleService getStyleService(){
	
		return styleService;
	}
	

}
 