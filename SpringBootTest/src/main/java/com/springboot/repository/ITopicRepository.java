package com.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.bean.Topic;

/**
 * CrudRepository is a common repository which contains all general methods for CRUD operations
 *
 */
public interface ITopicRepository extends CrudRepository<Topic, String>	{ //Topic and it's Id column
	
}