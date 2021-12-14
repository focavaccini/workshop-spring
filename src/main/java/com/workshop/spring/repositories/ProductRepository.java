package com.workshop.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.spring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
