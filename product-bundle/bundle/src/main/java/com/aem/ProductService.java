package com.aem;

import com.aem.model.Product;

import java.util.Collection;
import java.util.List;

/**
 * Created by ayeluri on 1/15/2017.
 */
public interface ProductService {

    void add( Product product);
    List<Product> getProducts() ;
    Product getProduct(int id);
    void remove (int product_id);
}
