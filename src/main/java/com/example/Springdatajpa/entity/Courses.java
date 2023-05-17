/**
 * 
 */
package com.example.Springdatajpa.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import antlr.collections.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author srinidhi.k
 *

 *
 *
 */
@Entity
@Data
 @AllArgsConstructor
 @NoArgsConstructor
 @Builder
public class Courses {
	   
	   @Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
	   private Long courseId;
	   private String title;
	   private Integer credit;
	   
	   
	   // bi-directional::
	   @OneToOne(mappedBy = "Courses")
	  private Coursematerails coursematerails;
	   
	   @ManyToOne(cascade = CascadeType.ALL)
	   private Teachers teachers;

}
