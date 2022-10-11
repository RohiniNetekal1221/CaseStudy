package com.sonata.mvc.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.sonata.mvc.JWTConfiguration.ShoppingConfiguration;


import com.sonata.mvc.model.Cart;
import com.sonata.mvc.model.CartDetails;
import com.sonata.mvc.model.Customer;
import com.sonata.mvc.model.Product;
import com.sonata.mvc.model.UserCart;
import com.sonata.mvc.repository.CartRepository;


@CrossOrigin(origins="http://localhost:4200")
@RestController

public class CartController {

Optional<Cart> p1;



	
@Autowired
	private CartRepository prepository;

@Autowired
private RestTemplate restTemplate;


@GetMapping(value = "/addcart/{id}/{qty}")
public Cart saveProduct(@RequestBody Cart prod) {
	return prepository.save(prod);
}

@GetMapping("/mycart")
public List<Cart> getAllProducts(){
	return prepository.findAll();
}

@DeleteMapping(value="/delectproductfromcart/{id}")
public ResponseEntity deleteProduct(@PathVariable(value="id")Long prodId) {
	prepository.deleteById(prodId);
	return ResponseEntity.noContent().build();
}
}




