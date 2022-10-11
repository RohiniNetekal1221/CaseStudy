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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sonata.mvc.model.Product;
import com.sonata.mvc.repository.ProductRepository;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class ProductController {
	
Optional<Product> p1;
	
	@Autowired
	private ProductRepository prepository;

	@RequestMapping("/")
	public String sayHi() {
		return "This is a spring controller";
	}

	@GetMapping("/product")
	public List<Product> getAllProducts(){
		return prepository.findAll();
	}
	
@GetMapping("/product/{id}")
	public ResponseEntity getProductsById(@PathVariable (value = "id") Long prodId) {
	p1 = prepository.findById(prodId);
	return ResponseEntity.ok().body(p1);
}	

@PostMapping(value = "/add/product")
public Product saveProduct(@RequestBody Product prod) {
	return prepository.save(prod);
}

@PutMapping(value="/update/product")
public ResponseEntity updateEmployee(@PathVariable(value="id") Long prodId, 
		@Validated @RequestBody Product pdata) {
	p1 = prepository.findById(prodId);
	Product p2 = p1.get();
	p2.setProductID(pdata.getProductID());
	p2.setCategoryID(pdata.getCategoryID());
	p2.setProductName(pdata.getProductName());
	p2.setProductDescription(pdata.getProductDescription());
	p2.setProductPrice(pdata.getProductPrice());
	p2.setProductImage(pdata.getProductImage());
	
	Product updateProduct = prepository.save(p2);
	return ResponseEntity.ok(updateProduct);
}

@DeleteMapping(value="/delete/product/{id}")
public ResponseEntity deleteProduct(@PathVariable(value="id")Long prodId) {
	prepository.deleteById(prodId);
	return ResponseEntity.noContent().build();
}

}
