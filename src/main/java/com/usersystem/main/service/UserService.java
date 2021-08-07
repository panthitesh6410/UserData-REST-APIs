package com.usersystem.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usersystem.main.model.User;
import com.usersystem.main.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository  repo;
	
	public List<User> listAllUser(){
		return repo.findAll();
	}
	
	public void saveUser(User user) {
		repo.save(user);
	}
	
	public User getUser(Integer id) {
		return repo.findById(id).get();
	}
	
	public void deleteUser(Integer id) {
		repo.deleteById(id);
	}
	
}
