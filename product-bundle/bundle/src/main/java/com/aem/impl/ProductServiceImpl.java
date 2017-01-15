package com.aem.impl;

import com.aem.ProductService;
import com.aem.model.Product;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;

import java.util.*;

@Service (ProductService.class)
@Component(metatype = false)
public class ProductServiceImpl implements ProductService{

    Map<Integer, Product> map = new HashMap<Integer, Product>();

    public void add(Product product) {
        map.put(new Integer(product.getId()), product);
    }

    public List<Product> getProducts() {
        List list = new ArrayList<Product>();
        list.addAll(map.values());
        return list;
    }

    public Product getProduct(int id) {
        return map.get(new Integer(id));
    }

    public void remove(int product_id) {
        map.remove(new Integer(product_id));
    }


    public ProductServiceImpl() {
        for ( int i = 0 ; i < 5; i++) {
            Product product = new Product();
            product.setId(i);
            product.setDescription("long desc " + i);
            product.setName("Product " + i +
                    " name ");
            map.put(new Integer(i), product );
        }
    }
}
