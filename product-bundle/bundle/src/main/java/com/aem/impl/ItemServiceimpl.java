package com.aem.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.aem.ItemService;
import com.aem.model.Item;

public class ItemServiceimpl implements ItemService{
	
     Map<Number,Item> map=new HashMap<Number,Item>();
      
	public void add(Item item) {
		map.put(item.getITEM_ID(),item);
		
	}

	public Set<Item> getItems() {
		Set<Item> set = new TreeSet<Item>();
		set.addAll(map.values());
		return set;
	}

	public Item getItem(Number id) {
		if(map.containsKey(id)){
			return map.get(id);
		}
		return null;
	}

	public void changePrice(Float price,Number id) {
		if(map.containsKey(id)){
		  Item obj=map.get(id);
		  obj.setITEM_PRICE(price);
		  
		}
		
	}

	public void changeQty(Number quantity,Number id) {
		if(map.containsKey(id)){
			Item obj = map.get(id);
			obj.setITEM_QTY(quantity);
		}
		
		
	}

	

}
