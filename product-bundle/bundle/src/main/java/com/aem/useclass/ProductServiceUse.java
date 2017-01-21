package com.aem.useclass;

import com.adobe.cq.sightly.WCMUse;
import com.aem.ProductService;
import org.apache.felix.scr.annotations.Reference;


//Sightly will only see a class that extends WCMUse

public class ProductServiceUse extends WCMUse  {

    @Override
    public void activate() throws Exception {
    	
    }

    @Reference
    ProductService productService;

    public ProductService getProductService() {
        return productService;
    }
}
