/**
 * 
 */
package com.example.Springdatajpa.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Springdatajpa.entity.Course;

/**
 * @author srinidhi.k
 *
 */
@Repository
public interface CourseRepositry extends JpaRepository<Course, Long> {

}
