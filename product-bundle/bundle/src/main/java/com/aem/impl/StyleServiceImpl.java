package com.aem.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;

import com.aem.ProductService;
import com.aem.StyleService;
import com.aem.model.Product;
import com.aem.model.StyleMaster;


@Service (StyleService.class)
@Component(metatype = false)

public class StyleServiceImpl implements StyleService{

	
	   Map<Integer, StyleMaster> map = new HashMap<Integer, StyleMaster>();
	
	public void add(StyleMaster style) {
		
		 map.put(new Integer(style.getStyleId()), style);
		
	}

	public List<StyleMaster> getStyles() {
		
		List list = new ArrayList<StyleMaster>();
		list.addAll(map.values());
		return list;
	}

	public StyleMaster getStyle(int id) {
		
		return(map.get(new Integer(id)));
	}

	public void remove(int styleId) {
		
		map.remove(new Integer(styleId));
	}

	
	public void noStyle(StyleMaster style) {
		
	}
	
	}
