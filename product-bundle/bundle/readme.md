## Steps to add a new Service 

1. Add model 
    - Ref com.aem.model.Product
2. Add a service definition i.e. interface 
    - Ref com.aem.ProductService
3. Add an implementation of the interface 
    - Ref com.aem.impl.ProductServiceImpl
4. Annotate the service implementation using @Service (<Interface_name>.class)
    1. Add unit Tests 
5. Expose the Service implementation to data-sly 
    - Add the dependency shown below
    ```
            <dependency>
                <groupId>com.adobe.aem</groupId>
                <artifactId>aem-api</artifactId>
                <version>6.0.0.1</version>
                <scope>provided</scope>
            </dependency>

    ```
    - Add a class that extends WCMUse. Expose the service via this class to data-sly. ref 
        - com.aem.useclass.ProductServiceUse
    



## Deploy the service to UAT 
