package com.springboot.thymeleaf.studentregistration;


import java.util.Arrays;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.thymeleaf.studentregistration.entity.User;

@org.springframework.stereotype.Controller
public class Controller
{
	@RequestMapping("/index")
	public String showindexPage()
	{
		return "index.html";
	}
	@GetMapping("/register")
	public String showForm(Model model, User user)
	{
		//User user = new User();
		model.addAttribute("user", user);
		
		List<String> professionList = Arrays.asList("Developer","Tester","Heker");
		model.addAttribute("professionList",professionList);
		
		return "registration_form.html";
	}
	@RequestMapping("/registration/success")
	public String submitForm(@ModelAttribute("user") User user)
	{
		System.out.println(user);
		return "registration_success.html";
	}
}
