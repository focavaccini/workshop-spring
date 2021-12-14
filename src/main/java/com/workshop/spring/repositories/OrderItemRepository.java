package com.workshop.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.spring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
