package com.sonata.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sonata.mvc.model.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders,Long>{

}
