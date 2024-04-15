package com.cakeShop1.controller;

import java.io.IOException;
import java.sql.Date;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cakeShop1.entity.Blog;
import com.cakeShop1.service.BlogService;

@RestController
public class BlogController {
	
	
	private BlogService blogService;
	@Autowired
	public BlogController(BlogService blogService) {
		this.blogService = blogService;
	}	
	@PostMapping(path = "/blogRegister")
	public String register(
			   @RequestParam(value = "title") String title,
			   @RequestParam(value = "content") String content,
			   @RequestParam(value = "publishDate") Date publishDate,
			   RedirectAttributes redirectAttributes
			) {
		Blog createdBlog = blogService.registerBlog(title, content, publishDate);
        if (createdBlog != null) {
            // Извлечете текущия списък с постове
            List<Blog> currentPosts = blogService.getAll();
            // Добавете новия пост към списъка
            currentPosts.add(createdBlog);

            // Пренасочете потребителя към желаната страница, например "/blog"
            return "redirect:/blog.html";
        } else {
            // Обработка на грешка, например към страницата за грешка
            return "redirect:/error";
        }
}
}