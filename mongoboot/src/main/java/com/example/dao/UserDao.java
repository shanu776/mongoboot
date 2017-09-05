package com.example.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.model.User;

public interface UserDao extends MongoRepository<User, String>{
	 
}