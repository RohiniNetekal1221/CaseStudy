package com.sonata.mvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Customer {
	@Id
	String username;
	//@SequenceGenerator(name="seq", initialValue=2, allocationSize=100)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long customerID;
	String dateofbirth;
	long phone;
	String email;
	String address;
	String customerName;
	String password;
	
	
	
	
	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", dateofbirth=" + dateofbirth
				+ ", phone=" + phone + ", email=" + email + ", address=" + address + ", username=" + username
				+ ", password=" + password + "]";
	}
	public Customer() {
		//super();
	}
	public Customer(long customerID, String customerName, String dateofbirth, long phone, String email, String address,
			String username, String password) {
		//super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.dateofbirth = dateofbirth;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.username = username;
		this.password = password;
	}
	
	public long getCustomerID() {
		return customerID;
	}
	public void setCustomerID(long customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
