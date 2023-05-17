/**
 * 
 */
package com.example.Springdatajpa.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Springdatajpa.entity.CourseMaterial;

/**
 * @author srinidhi.k
 *
 */

@Repository
public interface CourseMaterialRepositry  extends JpaRepository<CourseMaterial, Long>{

}
