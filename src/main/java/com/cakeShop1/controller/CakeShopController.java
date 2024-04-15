package com.cakeShop1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import java.util.*;

@Controller
public class CakeShopController {
	
	@GetMapping("/")
	public String index() {
		return "index"; 
	}
	@GetMapping("/menu")
	public String menu() {
		return "menu"; 
	}
	@GetMapping("/registration")
	public String registration() {
		return "registration"; 
	}
	@GetMapping("/logIn")
	public String logIn() {
		return "logIn"; 
	}	
	@GetMapping("/blog")
	public String blog() {
		return "blog"; 
	}
	@GetMapping("/contact")
	public String contact() {
		return "contact"; 
	}
	@GetMapping("/cart")
	public String cart() {
		return "cart"; 
	}
	@GetMapping("/orders")
	public String orders() {
		return "orders"; 
	}
	@GetMapping("/UBlog")
	public String UBlog() {
		return "UBlog"; 
	}
}
