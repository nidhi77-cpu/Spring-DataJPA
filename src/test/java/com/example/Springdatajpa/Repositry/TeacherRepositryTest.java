/**
 * 
 */
package com.example.Springdatajpa.Repositry;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.Springdatajpa.entity.Course;
import com.example.Springdatajpa.entity.Teacher;

/**
 * @author srinidhi.k
 *
 */
@SpringBootTest
class TeacherRepositryTest {
   @Autowired
   TeacherRepositry teacherRepositry;
	@Test
	public void saveteacher()
	{
		Course course = Course.builder()
				.credit(5)
				.title("php")
				.build();
		Course course1 = Course.builder()
				.credit(6)
				.title("php2")
				.build();
		Course course2 = Course.builder()
				.credit(7)
				.title("php3")
				.build();
		
		/*
		 * Teacher teacher = Teacher.builder() .firstname("nidhii") .Lastname("kkkk")
		 * .courses(List.of(course,course1,course2)).build();
		 */
		 
	}

}
