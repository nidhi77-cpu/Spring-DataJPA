/**
 * 
 */
package com.example.Springdatajpa.Repositry;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;

import com.example.Springdatajpa.entity.Guardian;
import com.example.Springdatajpa.entity.Student;

import lombok.Builder;

/**
 * @author srinidhi.k
 *
 */
@SpringBootTest

class StduentRepositryTest {

	@Autowired
	private StduentRepositry stduentRepositry;

	@Test
	public void savestudent() {
		Student student = Student.builder()
				.emailid("nidhi77@gmail.com")
				.firstname("nidhi")
				.lastname("krishna")
				.build();
				/*
				 * .guardianname("vidhya") .guardianemail("vidhyak@gmail.com")
				 * .guardianmobile("123456789")
				 */
				
		stduentRepositry.save(student);

	}

	@Test
	public void saveGuardianstduent()
		
	{
		Guardian guardian = Guardian.builder()
				.name("vidhya")
				.email("vidhyak@gmail.com")
				.mobile("123456789")
				.build();
		
		
		Student student = Student.builder()
				.firstname("hari")
				.lastname("vishnu")
				.emailid("hari@gmail.com")
				.guardian(guardian)
				.build();
		stduentRepositry.save(student);
	}

	@Test
	public void printAllStudent() {
		List<Student> studentlist = stduentRepositry.findAll();

		System.out.println("studentlist are" + studentlist);
	}
	
	@Test
	public void StudentByfirstname()
	{
		List<Student> studentfirstname = stduentRepositry.findByFirstname("hari");
		System.out.println("studentsnameis"+ studentfirstname);
	}
	
	@Test
	public void StudentBylastname()
	{
		List<Student> stduentlastname = stduentRepositry.findByLastname("krishna");
		System.out.println("studentsnameis"+ stduentlastname);
	}
    
	@Test
	public void StduentByGuardianname()
	{
		List<Student> studentguardianname = stduentRepositry.findByGuardianName("vidhya");
		System.out.println("studentguardianname"+ studentguardianname);
		
	}
	
	@Test
	//jpql
	public void getStudentByEmailid()
	{
		Student student = stduentRepositry.getStudentByEmailid("nidhi77@gmail.com");
		System.out.println("student"+ student);
	}
	
	
	
	//jpql
	@Test
	public void getdeaprtmentfirstname()
	{
		Student student = stduentRepositry.getstudentfirstname("hari");
		
	}
	
	@Test
	//nativequery : use for complex stuffs
	public void getStudentByEmailidNative()
	{
		Student student = stduentRepositry.getStudentByEmailidNative("nidhi77@gmail.com");
		System.out.println("student"+ student.getEmailid());
	}
	
	@Test
	public void getstudentEmailIdbyNativeParam()
	{
		Student student = stduentRepositry.getStudentByEmailidNativeparam("nidhi77@gmail.com");
		System.out.println("student"+ student.getEmailid());

	}
	
	@Test
	public void updateStudentByEmail()
	{
		stduentRepositry.updateStudentByEmail("naryana", "nidhi77@gmail.com");
	
	}
}
