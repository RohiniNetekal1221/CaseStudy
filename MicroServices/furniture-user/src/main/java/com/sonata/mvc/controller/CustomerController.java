package com.sonata.mvc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sonata.mvc.model.Customer;
import com.sonata.mvc.repository.CustomerRepository;
import com.sonata.mvc.service.CustomerService;


@CrossOrigin(origins = "http://localhost:4200")

@RestController
public class CustomerController {
	
	Optional<Customer> p1;
	
	@Autowired
	private CustomerRepository prepository;
	
	

	@GetMapping("/customer")
	public List<Customer> getAllCustomers(){
		return prepository.findAll();
	}
	
	@GetMapping("/customer/{id}/{password}")
	public ResponseEntity getProductsById(@PathVariable (value = "id") String username, @PathVariable(value ="password")  String password) {
		if(username != null && password != null) {
	p1 = prepository.findById(username);}
	return ResponseEntity.ok().body(p1);
}

@DeleteMapping(value="/delectcustomer/{id}")
public ResponseEntity deleteCustomer(@PathVariable(value="id")String username) {
	prepository.deleteById(username);
	return ResponseEntity.noContent().build();
}


@PostMapping(value = "/addcustomer")
public Customer saveCustomer(@RequestBody Customer cust) {
	return prepository.save(cust);
}



@PutMapping(value="/update/customer")
public ResponseEntity updateCustomer(@PathVariable(value="id") String username, 
		@Validated @RequestBody Customer pdata) {
	p1 = prepository.findById(username);
	Customer p2 = p1.get();
	
	p2.setCustomerID(pdata.getCustomerID());
	p2.setCustomerName(pdata.getCustomerName());
	p2.setDateofbirth(pdata.getDateofbirth());
	p2.setPhone(pdata.getPhone());
	p2.setEmail(pdata.getEmail());
	p2.setAddress(p2.getAddress());
	p2.setUsername(pdata.getUsername());
	p2.setPassword(pdata.getPassword());
	
	
	Customer updateCustomer = prepository.save(p2);
	return ResponseEntity.ok(updateCustomer);
}





}