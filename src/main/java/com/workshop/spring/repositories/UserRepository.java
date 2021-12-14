package com.workshop.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
