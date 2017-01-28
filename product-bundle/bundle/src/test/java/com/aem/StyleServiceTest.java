package com.aem;

import static org.junit.Assert.*;

import java.util.Map;

import org.apache.felix.scr.annotations.Reference;
import org.junit.Test;

import com.aem.impl.StyleServiceImpl;
import com.aem.model.StyleMaster;

public class StyleServiceTest {

	@Reference
	StyleServiceImpl styleService;
	Map mapofItems;
	
	@Test
	public void addStyle(){
		
		StyleMaster style = new StyleMaster();
		style.setStyleId(10);
		style.setStyleName("Jeans");
		style.setStyleBrand("A&F");
		style.setStyleColor("Black");
		style.setStyleDescription("Jeans");
		style.setStyleSize("Medium");
	
		styleService.add(style);
		
		
		
	}
	

}
