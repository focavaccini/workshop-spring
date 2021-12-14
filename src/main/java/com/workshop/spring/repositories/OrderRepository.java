package com.workshop.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.spring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
