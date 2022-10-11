package com.sonata.mvc.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {
	@Id
@GeneratedValue(strategy = GenerationType. IDENTITY)
	long cartid;
	long productid;
	int customerid;
	int qty;
	int price;
	int orderid;
	public long getProductid() {
		return productid;
	}
	public void setProductid(long productid) {
		this.productid = productid;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public long getCartid() {
		return cartid;
	}
	public void setCartid(long cartid) {
		this.cartid = cartid;
	}
	public Cart(long cartid, long productid, int customerid, int qty, int price, int orderid) {
		//super();
		this.cartid = cartid;
		this.productid = productid;
		this.customerid = customerid;
		this.qty = qty;
		this.price = price;
		this.orderid = orderid;
	}
	public Cart() {
		//super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}