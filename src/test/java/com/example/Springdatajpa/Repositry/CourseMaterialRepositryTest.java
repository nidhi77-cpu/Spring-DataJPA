package com.example.Springdatajpa.Repositry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Repository;

import com.example.Springdatajpa.entity.Course;
import com.example.Springdatajpa.entity.CourseMaterial;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
class CourseMaterialRepositryTest {

	@Autowired
	CourseMaterialRepositry courseMaterialRepositry;

	@Test
	public void savecoursematerial() {

		
		  Course course = Course.builder().title("python").credit(8).build();
		  
		  System.out.println("course" + course);
		  
		  CourseMaterial courseMaterial =
		  CourseMaterial.builder().url("abc.com").course(course).build(); try {
		  courseMaterialRepositry.save(courseMaterial);
		  System.out.println("coursematerial" + courseMaterial); } catch (Exception e)
		  {
		  
		  }
		 
	}

}
