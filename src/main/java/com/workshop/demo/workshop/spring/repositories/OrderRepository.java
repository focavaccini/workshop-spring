package com.workshop.demo.workshop.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.demo.workshop.spring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
