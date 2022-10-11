package com.sonata.mvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Orders {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	long orderID;
	String orderDate;
	long customerID;
	double total;
	public long getOrderID() {
		return orderID;
	}
	public void setOrderID(long orderID) {
		this.orderID = orderID;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public long getCustomerID() {
		return customerID;
	}
	public void setCustomerID(long customerID) {
		this.customerID = customerID;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Orders(long orderID, String orderDate, long customerID, double total) {
		super();
		this.orderID = orderID;
		this.orderDate = orderDate;
		this.customerID = customerID;
		this.total = total;
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}