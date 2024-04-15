package com.cakeShop1.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cakeShop1.entity.Blog;

@Repository
public interface BlogRepository extends CrudRepository<Blog, Integer> {
	Blog findByTitle(String title);
	Blog findByContent(String content);
	Blog findByPublishDate(Date publishDate);
	Blog findByBlogId(int blogId);
    List<Blog> findAll();
    
}