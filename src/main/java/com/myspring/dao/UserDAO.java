package com.myspring.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.myspring.entity.User;

@Repository
public class UserDAO {

	private static Map<Integer,User> users;

	static {
		users = new HashMap<Integer,User>(){
			{
				put(1,new User(1,"User1","Group 1"));
				put(2,new User(1,"User2","Group 2"));
				put(3,new User(1,"User3","Group 3"));
			}
			
		};
	}
	public Collection<User> getUsers() {
		return users.values();
	}
	public User getUser(Integer id){
		return users.get(id);
	}
}

