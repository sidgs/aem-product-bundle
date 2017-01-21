package com.aem;

import static org.junit.Assert.*;

import org.junit.Test;

import com.aem.model.Product;

public class ProductUnitTest {

	@Test
	
	public void getName() {
		
		Product name= new Product();
		String expectedResult="shirt";
		name.setName("shirt");
		String result=name.getName();
		assertEquals(expectedResult,result);
 }
	
	@Test
	
	public void getStyle(){
		Product style= new Product();
		String expResult="printed";
		style.setStyle("printed");
		String result=style.getStyle();
		assertEquals(expResult,result);
	}
	
	@Test 
	
	public void getDescription(){
		Product description=new Product();
		String expResult="cotton";
		description.setDescription("cotton");
		String result=description.getDescription();
		assertEquals(expResult,result);
		
		
		
	}
   
	@Test
	
	public void getId(){
		
		Product id=new Product();
		int expResult=123;
		id.setId(123);
		int result=id.getId();
		assertEquals(expResult,result);
		
		
	}
	
@Test
	
	public void getBrand(){
		
		Product brand=new Product();
		String expResult="A&F";
		brand.setBrand("A&F");
		String result=brand.getBrand();
		assertEquals(expResult,result);
		
		
	}
@Test

public void getImage(){
	
	Product image=new Product();
	String expResult="A&F";
	image.setBrand("A&F");
	String result=image.getBrand();
	assertEquals(expResult,result);
	
	
}


}
