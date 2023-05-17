/**
 * 
 */
package com.example.Springdatajpa.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Springdatajpa.entity.Courses;

/**
 * @author srinidhi.k
 *
 */

@Repository
public interface CoursesRepositry  extends JpaRepository<Courses, Long>{

}
