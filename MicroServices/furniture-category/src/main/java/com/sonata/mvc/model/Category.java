package com.sonata.mvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Category {
	@Id
	@SequenceGenerator(name="seq", initialValue=6, allocationSize=100)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	int categoryID;
	String categoryName;
	String categoryImage;
	
	public Category(int categoryID, String categoryName, String categoryImage) {
		//super();
		this.categoryID = categoryID;
		this.categoryName = categoryName;
		this.categoryImage = categoryImage;
	}
	public Category() {
		//super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Category [categoryID=" + categoryID + ", categoryName=" + categoryName + ", categoryImage="
				+ categoryImage + "]";
	}
	public int getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryImage() {
		return categoryImage;
	}
	public void setCategoryImage(String categoryImage) {
		this.categoryImage = categoryImage;
	}
	

}
