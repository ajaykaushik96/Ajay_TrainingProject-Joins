package com.example.demo.Course;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.example.demo.Book.Book;

@Entity
@Table(name="course")
public class Course {

	public Course() {
	
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Course_id;
	private String name;
	private String description;
	@OneToOne
	@JoinColumn(name="id")
	private Book book;



	/*public Course(long Course_id, String name, String description) {

		this.Course_id = Course_id;
		this.name = name;
		this.description = description;
	}*/

	public long getCourse_Id() {
		return Course_id;
	}

	public void setId(long id) {
		this.Course_id = Course_id;
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
	
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	

}
