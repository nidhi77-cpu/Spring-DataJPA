package com.example.Springdatajpa.Repositry;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.Springdatajpa.entity.Course;

@SpringBootTest
class CourseRepositryTest {

	@Autowired
	CourseRepositry courseRepositry;

	@Test
	public void savecourse() {
		Course course = Course.builder().title("java").credit(5).build();
		try {
			courseRepositry.save(course);
		} catch (Exception e) {
		
		}

		System.out.println("course" + course);
		
	}
	
	/*Test
	public void findallcourses()
	{
		 List<Course> courses = courseRepositry.findAll();
	      System.out.println(courses);
	}*/
   

}
