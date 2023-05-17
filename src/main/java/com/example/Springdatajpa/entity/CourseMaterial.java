/**
 * 
 */
package com.example.Springdatajpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

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
@Table(name="tbl_CourseMaterial")
public class CourseMaterial {
   
	@Id
	@SequenceGenerator(name="course_material" , sequenceName = "course_material", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "course_material")
	private Long courseMaterialId;
	private String url;
	
	@OneToOne(cascade = javax.persistence.CascadeType.ALL)
	@JoinColumn(name="courseId" , referencedColumnName = "courseId")
		private Course course;
}


