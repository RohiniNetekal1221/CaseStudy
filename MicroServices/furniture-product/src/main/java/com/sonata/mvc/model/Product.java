package com.sonata.mvc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	long productID;
	String productName;
	int productPrice;
	String productDescription;
	String productImage;
	int categoryID;
	public long getProductID() {
		return productID;
	}
	public void setProductID(long productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getProductImage() {
		return productImage;
	}
	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}
	public int getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}
	public Product(long productID, String productName, int productPrice, String productDescription, String productImage,
			int categoryID) {
		//super();
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productDescription = productDescription;
		this.productImage = productImage;
		this.categoryID = categoryID;
	}
	public Product() {
		//super();
		// TODO Auto-generated constructor stub
	}
	
	

}
