package com.workshop.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.spring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
