package com.springboot.thymeleaf.studentregistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.thymeleaf.studentregistration.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>
{

}
