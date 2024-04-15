package com.cakeShop1.entity;

import java.sql.Date;
import java.util.Set;

//import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Blogs")
public class Blog {
	
	    @Id
		@Column(name = "blogId", nullable = false)
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int blogId;
	    
	    @Column(name = "title", nullable = false)
	    private String title;
	    
	    @Column(name = "content", nullable = false)
	    private String content;
	    
	    @Column(name = "publishDate", nullable = false)
	    private Date publishDate;

		public int getBlogId() {
			return blogId;
		}

		public void setBlogId(int blogId) {
			this.blogId = blogId;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public Date getPublishDate() {
			return publishDate;
		}
		public void setPublishDate(Date publishDate) {
			this.publishDate = publishDate;
		}
		public Blog() {
	    }
	    @Autowired
	    public Blog(String title, String content, Date publishDate) {
	        this.title = title;
	        this.content = content;
	        this.publishDate = publishDate; 
	    }
	    @Override
	    public String toString() {
	        return "Blog { " +
	                " Title = '" + title + '\'' +
	                ", Content = '" + content + '\'' +
	                ", Publish date = " + publishDate +
	                '}';
	    }
}
