package com.aem;

import java.util.Set;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;

import com.aem.impl.ItemServiceimpl;
import com.aem.model.Item;
public interface ItemService {
	
	void add(Item item);
	Set<Item> getItems();
	Item getItem(Number itemId);
	void changePrice(Float price,Number itemId);
	void changeQty(Number quantity,Number itemId);
}
