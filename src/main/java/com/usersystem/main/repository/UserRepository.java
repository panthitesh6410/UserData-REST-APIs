package com.usersystem.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usersystem.main.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
}
