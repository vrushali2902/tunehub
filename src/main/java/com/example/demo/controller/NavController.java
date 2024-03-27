package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController 
{
	@GetMapping("/map-register")
	public String registerMapping()	
	{
		return "register";
	}
	
	@GetMapping("/map-login")
	public String loginMapping()	
	{
		return "login";
	}
	
	@GetMapping("/map-addsongs")
	public String songMapping()	
	{
		return "addsong";
	}
	
	@GetMapping("/samplePayment")
	public String samplePayment()	
	{
		return "samplePayment";
	}
	
	@GetMapping("/home")
	public String home()
	{
		return "home";
	}
	
	@GetMapping("/about")
	public String about()
	{
		return "about";
	}
	
	@GetMapping("/contact")
	public String contact()
	{
		return "contact";
	}
}
