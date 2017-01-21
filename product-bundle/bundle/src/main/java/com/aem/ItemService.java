package com.aem;

import java.util.Set;

import com.aem.model.Item;

public interface ItemService {
	void add(Item item);
	Set<Item> getItems();
	Item getItem(Number itemId);
	void changePrice(Float price,Number itemId);
	void changeQty(Number quantity,Number itemId);
}
