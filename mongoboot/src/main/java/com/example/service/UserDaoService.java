package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserDao;
import com.example.model.User;

@Service
public class UserDaoService {

	@Autowired
	UserDao userDao;
	
	public void save(User user){
		userDao.save(user);
	}
	
	public List<User> find(){
		return userDao.findAll();
	}
	
	public User findOne(String id) {
		return userDao.findOne(id);
	}
	
	public void delete(String id) {
		userDao.delete(id);
	}
		
}
