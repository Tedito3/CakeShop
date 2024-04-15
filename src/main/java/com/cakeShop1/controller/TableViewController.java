package com.cakeShop1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cakeShop1.entity.Blog;
import com.cakeShop1.repository.BlogRepository;

public class TableViewController {


		
		@Autowired
	    private BlogRepository blogRepository;

	    @GetMapping("/blg")
	    public String listBlog(Model model) {
	        List<Blog> blg = blogRepository.findAll();
	        model.addAttribute("blg", blg);
	        return "blog";
	    }
}
