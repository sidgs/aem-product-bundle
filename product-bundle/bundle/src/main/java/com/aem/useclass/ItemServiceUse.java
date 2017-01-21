package com.aem.useclass;


import org.apache.felix.scr.annotations.Reference;
import com.adobe.cq.sightly.WCMUse;
import com.aem.ItemService;

public class ItemServiceUse extends WCMUse {
	@Reference
    ItemService itemservice;
	@Override
	public void activate() throws Exception {
		
		
	
	
	}
	
	public ItemService getItemService(){
		return itemservice;
	}
}
