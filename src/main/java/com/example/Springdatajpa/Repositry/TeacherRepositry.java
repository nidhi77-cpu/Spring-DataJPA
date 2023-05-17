/**
 * 
 */
package com.example.Springdatajpa.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Springdatajpa.entity.Teacher;

/**
 * @author srinidhi.k
 *
 */
public interface TeacherRepositry extends JpaRepository<Teacher, Long> {

}
