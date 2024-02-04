package com.springboot.thymeleaf.studentregistration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.thymeleaf.studentregistration.entity.User;
import com.springboot.thymeleaf.studentregistration.repository.UserRepository;

public class UserServiceImpl implements UserService
{
	@Autowired
	private UserRepository userRepository;


	@Override
	public List<User> saveStudentDetails(User user) 
	{
		userRepository.save(user);
		return null;
	}

}
