/**
 * 
 */
package com.example.Springdatajpa.Repositry;

import java.lang.annotation.Repeatable;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.query.NativeQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Springdatajpa.entity.Guardian;
import com.example.Springdatajpa.entity.Student;

/**
 * @author srinidhi.k
 *
 */
public interface StduentRepositry  extends JpaRepository<Student, Long>{

	
	String nativeQuery = null;


	public List<Student> findByFirstname(String firstname);
	public List<Student> findByLastname(String lastname);
	public List<Student> findByGuardianName(String guardiannamess);
	
	//jpql
	@Query("select s from Student s where s.emailid=?1")
	Student getStudentByEmailid(String emailid);
	
	
	//jpql
	@Query("select s from Student s where s.firstname=?1")
	Student getstudentfirstname(String firstname);
	
	
	//native query
	@Query(value="select * from tbl_student s where s.email_address=?1", nativeQuery = true)		
	Student getStudentByEmailidNative(String emailid);
	
	
	//native query with params
	@Query(value="select * from tbl_student s where s.email_address =:emailid", nativeQuery = true)		
	Student getStudentByEmailidNativeparam(@Param("emailid") String emailid);
	
	
	//@Query("select s from Student s where s.email_id=?1")
	//@Query @Repeatable( value ="select * from tbl_stduent s where s.email_id=?1 " ,nativeQuery = true)
	
	
	/*
	 * @Transactional
	 * 
	 * @Modifying
	 * 
	 * @Query(value ="update tbl_student set firstname=?1 where email_address=?2")
	 */
	
	@Transactional
	@Modifying
	@Query(value="update tbl_student set FIRSTNAME =?1 where EMAIL_ADDRESS=?2", nativeQuery = true)
	
	int updateStudentByEmail(String firstname , String emailId);
	
}

