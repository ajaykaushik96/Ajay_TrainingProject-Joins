package com.example.demo.CourseController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Course.Course;
import com.example.demo.CourseService.CourseService;

@RestController
public class CourseController {
     
	
		
	@Autowired
		private CourseService courseservice;
		
		
	@GetMapping("/course")
		public List<Course> GetAllCourses()
		{
			return courseservice.GetAllCourse(); 
		}
		
		@GetMapping("/course/{Course_id}")
		public Optional<Course> GetCourse(@PathVariable Long Course_id)
		{
			return courseservice.GetCourse(Course_id);
		}
		
		@PostMapping("book/{id}/course")
	    public String AddCourse(@PathVariable Long id,@RequestBody Course course)
	    {
	    	return courseservice.AddCourse(id,course);
	    }
		
		@PutMapping("/course/{id}")
		public Optional<Course> UpdateCourse(@RequestBody Course course , @PathVariable Long Course_id )
		{
			return courseservice.UpdateCourse(Course_id ,course);
		}
		
		@DeleteMapping("/course/{Course_id}")
		public Optional<Course> DeleteCourse (@PathVariable Long Course_id)
		{
			return courseservice.DeleteCourse(Course_id);
		}

		
		
	}


