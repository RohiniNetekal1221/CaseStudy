package com.sonata.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sonata.mvc.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository <Customer, String>{

	
}
