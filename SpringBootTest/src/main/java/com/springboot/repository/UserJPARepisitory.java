package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.springboot.model.Users;

//@Component //required to autowire
public interface UserJPARepisitory extends JpaRepository<Users, Long> {

	Users findByName(String name);
	
}