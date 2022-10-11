package com.sonata.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sonata.mvc.model.Cart;

@Repository
public interface CartRepository extends JpaRepository <Cart, Long> {

}
