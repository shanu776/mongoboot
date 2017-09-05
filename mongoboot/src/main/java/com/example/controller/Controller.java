package com.example.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.User;
import com.example.service.UserDaoService;
import com.example.utility.UtilityDao;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	UserDaoService userDao;	
	@Autowired
	UtilityDao utility;

	@ResponseBody
	@RequestMapping(value="test")
	public String test(){
		utility.print();
		return "done";
	}
	
	@ResponseBody
	@RequestMapping(value="/saveData",method=RequestMethod.POST)
	public String saveData(HttpServletRequest req,User user){	
		//Integer id = Integer.parseInt(req.getParameter("id"));
		String name =req.getParameter("name");
		user = new User(name);
		userDao.save(user);
		return "save...";
	}
	
	@ResponseBody
	@RequestMapping(value="/findall")
	public List<User> findall(){
		return userDao.find();
	}
	
	@ResponseBody
	@RequestMapping(value="/findone",method=RequestMethod.POST)
	public User findone(@RequestParam("id") String id){
		return userDao.findOne(id);
	}
	
	@ResponseBody
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	public String delete(HttpServletRequest req){
		String id = req.getParameter("id");
		System.out.println(id);
		 userDao.delete(id);
		 return "success.....";
	}
}
