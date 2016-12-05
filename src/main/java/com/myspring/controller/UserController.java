package com.myspring.controller;

import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<User> addUser(@RequestBody User user){
		return new ResponseEntity<User>(userService.addUser(user),HttpStatus.OK);
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public  ResponseEntity<Void> deleteUser(@PathVariable("id") Integer id) {
		User user = userService.getUser(id);
		if (user == null ) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		userService.deleteUser(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.DELETE)
	public ResponseEntity<Void> deleteUsers() {
		userService.deleteUsers();
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
