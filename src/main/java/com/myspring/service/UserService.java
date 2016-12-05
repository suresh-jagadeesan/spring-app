package com.myspring.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myspring.dao.UserDAO;
import com.myspring.entity.User;

@Service
public class UserService {

	@Autowired
	private UserDAO userDAO;

	public Collection<User> getUsers() {
		return userDAO.getUsers();
	}
	public User getUser(Integer id) {
		return userDAO.getUser(id);
	}
	public User addUser(User user) {
		return userDAO.addUser(user);
	}
}
