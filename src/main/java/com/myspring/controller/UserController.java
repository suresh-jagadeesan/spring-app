package com.myspring.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myspring.entity.User;
import com.myspring.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(method=RequestMethod.GET)
	public Collection<User> getUsers(){
		return userService.getUsers();
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public User getUser(@PathVariable("id") Integer id) {
		return userService.getUser(id);
	}
}
