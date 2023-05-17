/**
 * 
 */
package com.example.Springdatajpa.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author srinidhi.k
 *
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Coursematerails {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private Long courseMaterialId;
	private String url;
	
	
	// uni directional::
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "courseId" , referencedColumnName = "courseId")
	private Courses courses;

}
