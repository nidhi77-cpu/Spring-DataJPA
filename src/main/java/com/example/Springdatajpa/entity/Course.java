/**
 * 
 */
package com.example.Springdatajpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

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
@Table(name="tbl_Course")
public class Course 
{
   @Id
   @SequenceGenerator(name="course_sequence" , sequenceName = "course_sequence", allocationSize = 1)
   @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "course_sequence" )
   private Long courseId;
   private String title;
   private Integer credit;
   
   
   @OneToOne(mappedBy = "course")
   private CourseMaterial courseMaterial;
}
