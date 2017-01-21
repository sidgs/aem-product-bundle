package com.aem.model;

/**
 * Created by ayeluri on 1/15/2017.
 */
public class Product {

    String name ;
    String description ;
    int id ;
    String style;
    String brand;
    String image;
    
    

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
