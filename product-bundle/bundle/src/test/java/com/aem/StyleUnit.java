package com.aem;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.aem.model.StyleMaster;

import junit.framework.Assert;

public class StyleUnit {

	
	@Test
	public void getStyleId(){
		StyleMaster s = new StyleMaster();
		int expResult = 10;
		s.setStyleId(10);
		int result = s.getStyleId();
		assertEquals(expResult, result);
		
		}
	
	@Test
	public void setStyleId(){
		StyleMaster s = new StyleMaster();
		s.setStyleId(10);
		Assert.assertEquals(s.getStyleId(),10);
	}
	
	@Test
	public void getStyleName(){
		StyleMaster s = new StyleMaster();
		String expResult = "Tagore";
		s.setStyleName("Tagore");
		String result = s.getStyleName();
		assertEquals(expResult, result);
		}
	
	@Test
	public void setStyleName(){
		StyleMaster s = new StyleMaster();
		s.setStyleName("Tagore");
		Assert.assertEquals(s.getStyleName(), "Tagore");
	}
	
	@Test
	public void getStyleSize(){
		StyleMaster s = new StyleMaster();
		String expResult = "Large";
		s.setStyleName("Large");
		String result = s.getStyleName();
		assertEquals(expResult, result);
		
	}
	
	@Test
	public void setStyleSize(){
		StyleMaster s = new StyleMaster();
		s.setStyleName("Medium");
		Assert.assertEquals(s.getStyleName(), "Medium");
	}
	
	@Test
	public void setStyleColor(){
		StyleMaster s = new StyleMaster();
		s.setStyleName("Green");
		Assert.assertEquals(s.getStyleName(), "Green");
	}
	
	@Test
	public void getStyleColor(){
		StyleMaster s = new StyleMaster();
		String expResult = "Black";
		s.setStyleName("Orange");
		String result = s.getStyleName();
		assertEquals(expResult, result);
	}
	
	@Test
	public void setStyleBrand(){
		StyleMaster s = new StyleMaster();
		s.setStyleName("Hollister");
		Assert.assertEquals(s.getStyleName(), "Hollister");
	}
	
	@Test
	public void getStyleBrand(){
		StyleMaster s = new StyleMaster();
		String expResult = "Armani";
		s.setStyleName("A&F");
		String result = s.getStyleName();
		assertEquals(expResult, result);
	}
	
	@Test
	public void setStyleDescription(){
		StyleMaster s = new StyleMaster();
		s.setStyleName("Suits");
		Assert.assertEquals(s.getStyleName(), "Accesories");
	}
	
	@Test
	public void getStyleDescription(){
		StyleMaster s = new StyleMaster();
		String expResult = "Trousers";
		s.setStyleName("Shirts");
		String result = s.getStyleName();
		assertEquals(expResult, result);
	}
}
