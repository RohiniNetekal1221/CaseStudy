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

import com.sonata.mvc.model.Category;
import com.sonata.mvc.repository.CategoryRepository;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class CategoryController {
	
Optional<Category> p1;
	
	@Autowired
	private CategoryRepository prepository;

	@RequestMapping("/")
	public String sayHi() {
		return "This is a spring controller";
	}

	@GetMapping("/category")
	public List<Category> getAllProducts(){
		return prepository.findAll();
	}
	
@GetMapping("/category/{id}")
	public ResponseEntity getProductsById(@PathVariable (value = "id") Long categoryID) {
	p1 = prepository.findById(categoryID);
	return ResponseEntity.ok().body(p1);
}	

@PostMapping(value = "/addcategory")
public Category saveProduct(@RequestBody Category prod) {
	return prepository.save(prod);
}



@PutMapping(value="/update/category")
public ResponseEntity updateEmployee(@PathVariable(value="id") Long categoryID, 
		@Validated @RequestBody Category pdata) {
	p1 = prepository.findById(categoryID);
	Category p2 = p1.get();
	p2.setCategoryID(pdata.getCategoryID());
	p2.setCategoryName(pdata.getCategoryName());
	p2.setCategoryImage(pdata.getCategoryImage());
	
	Category updateProduct = prepository.save(p2);
	return ResponseEntity.ok(updateProduct);
}

@DeleteMapping(value="/delete/category/{id}")
public ResponseEntity deleteProduct(@PathVariable(value="id")Long categoryID) {
	prepository.deleteById(categoryID);
	return ResponseEntity.noContent().build();
}

}



