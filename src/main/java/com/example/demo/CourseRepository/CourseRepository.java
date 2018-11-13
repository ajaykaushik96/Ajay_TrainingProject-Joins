package com.example.demo.CourseRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Course.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
