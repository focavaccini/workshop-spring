package com.workshop.demo.workshop.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.demo.workshop.spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
