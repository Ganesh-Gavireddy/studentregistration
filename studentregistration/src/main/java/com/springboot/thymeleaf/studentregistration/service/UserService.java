package com.springboot.thymeleaf.studentregistration.service;


import java.util.List;

import com.springboot.thymeleaf.studentregistration.entity.User;

public interface UserService 
{
	List<User> saveStudentDetails(User user);
}
