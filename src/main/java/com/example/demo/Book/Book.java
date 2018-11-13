package com.example.demo.Book;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.demo.Course.Course;

@Entity
@Table(name="book")
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Book_id;
	private String name;
	private String description;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Course> course;
	
	
	public List<Course> getCourse() {
		return course;
	}


	public void setCourse(List<Course> course) {
		this.course = course;
	}


	/*public Book(Long book_id, String name, String description) {
		super();
		Book_id = book_id;
		this.name = name;
		this.description = description;
	}*/


	public Long getBook_id() {
		return Book_id;
	}


	public void setBook_id(Long book_id) {
		Book_id = book_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	

}
