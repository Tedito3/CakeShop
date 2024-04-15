package com.cakeShop1.service;

import java.io.Console;
import java.sql.Date;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.cakeShop1.entity.Blog;
import com.cakeShop1.repository.BlogRepository;

@Service
public class BlogService {

	private BlogRepository blogRepository;
	
	@Autowired
	public BlogService(BlogRepository blogRepository) {
		this.blogRepository = blogRepository;
	}
	public Blog registerBlog(String title, String content, Date publishDate) {
		
		if(title.isBlank()  || 
			content.isBlank()) {
			return null;
		}
		Blog blog = new Blog(title, content, publishDate);
		return blogRepository.save(blog);
	}
	public  Blog testMethoda(String title) {
		return null;
	}
	public List<Blog> getAll(){
		return blogRepository.findAll();
	}	
	
}
