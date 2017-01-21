package com.aem.model;

public class Item {
	Number PRODUCT_ID;
	Number STYLE_ID;
	Number ITEM_ID;
	Number ITEM_QTY;
	Float ITEM_PRICE;
	
	public Item(Number PRODUCT_ID, Number STYLE_ID, Number ITEM_ID, Number ITEM_QTY, Float ITEM_PRICE) {
		super();
		this.PRODUCT_ID = PRODUCT_ID;
		this.STYLE_ID = STYLE_ID;
		this.ITEM_ID = ITEM_ID;
		this.ITEM_QTY = ITEM_QTY;
		this.ITEM_PRICE = ITEM_PRICE;
	}
	public Number getPRODUCT_ID() {
		return PRODUCT_ID;
	}
	public void setPRODUCT_ID(Number PRODUCT_ID) {
		this.PRODUCT_ID = PRODUCT_ID;
	}
	public Number getSTYLE_ID() {
		return STYLE_ID;
	}
	public void setSTYLE_ID(Number STYLE_ID) {
		this.STYLE_ID = STYLE_ID;
	}
	public Number getITEM_ID() {
		return ITEM_ID;
	}
	public void setITEM_ID(Number ITEM_ID) {
		this.ITEM_ID = ITEM_ID;
	}
	public Number getITEM_QTY() {
		return ITEM_QTY;
	}
	public void setITEM_QTY(Number ITEM_QTY) {
		this.ITEM_QTY = ITEM_QTY;
	}
	public Float getITEM_PRICE() {
		return ITEM_PRICE;
	}
	public void setITEM_PRICE(Float ITEM_PRICE) {
		this.ITEM_PRICE = ITEM_PRICE;
	}
	

}
