package com.usersystem.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usersystem.main.model.User;
import com.usersystem.main.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService service;
	
	@GetMapping("/users")
	public List<User> listUsers(){
		return service.listAllUser();
	}
	
	@GetMapping("/user/{id}")
	public User oneUser(@PathVariable("id") Integer id) {
		return service.getUser(id);
	}
	
	@PostMapping("/add")
	public void addUser(User user) {
		service.saveUser(user);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteUser(@PathVariable("id") Integer id) {
		service.deleteUser(id);
	}
	
}
