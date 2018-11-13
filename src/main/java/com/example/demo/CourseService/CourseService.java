package com.example.demo.CourseService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Book.Book;
import com.example.demo.BookRepository.BookRepository;
import com.example.demo.Course.Course;
import com.example.demo.CourseRepository.CourseRepository;

@Service
public class CourseService {
	
		@Autowired
		private CourseRepository courserepo;
		@Autowired 
		BookRepository bookRepo;
		
		public List<Course> GetAllCourse() 
		{
			return courserepo.findAll();
		}

		public Optional<Course> GetCourse(Long Course_id)
		{
			return courserepo.findById(Course_id);
			
			
		}
		
		 public String AddCourse(Long id,Course course)
		 {
			 Optional<Book> b=bookRepo.findById(id);
			 if(b.isPresent())
			 {
				 Book b1=b.get();
				 course.setBook(b1);
				 courserepo.save(course);
				 return "Inserted";
				 
			 }
			 else {
				return "book id does not exist";
			}
			 
			// return courserepo.save(course);
		 }
		 
		 
		 public Optional<Course> UpdateCourse (Long Course_id, Course course)
		 {
			 return courserepo.findById(Course_id);
		 }
		 
		 public Optional<Course> DeleteCourse (Long Course_id)
		 {
			 return courserepo.findById(Course_id);
		 }

		
	}

