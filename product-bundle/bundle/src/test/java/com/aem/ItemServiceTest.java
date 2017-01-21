package com.aem;

import com.aem.impl.ItemServiceimpl;
import com.aem.model.Item;
import org.apache.felix.scr.annotations.Reference;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Map;
import java.util.Set;

/**
 * Created by ayeluri on 1/21/2017.
 * This should test all the methods implemented in the ItemService Interface
 */

public class ItemServiceTest {

    @Reference
    ItemService itemService;

    Map mapofItems;

    @BeforeClass
    void setup() {
        assert (itemService != null );
        if ( itemService instanceof ItemServiceimpl) {
            mapofItems = ((ItemServiceimpl)itemService).getMap();
        }
    }

    @Test
    void add(){

        Item item = new Item();
        item.setItemId(1231);
        item.setItemQty(1);
        itemService.add(item);

        // Item was created
        assert (mapofItems.containsKey(1231));
        // item was created with the correct data
        Item result = (Item)mapofItems.get(1232);
        assert ( result.equals(item));


        // get DataSource
        // query DB for item with id 1231
        // assert that item is found
        // create a new item
        // compare with the original iteam
        // assert both are equal


    }

    void  getItems(){

    }

    void getItem(){

    }

    void changePrice(Float price,Number itemId){

    }

    void changeQty(Number quantity,Number itemId){

    }

}
