/**
 * 
 */
package com.example.Springdatajpa.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

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
public class Teachers {
	@Id
	@SequenceGenerator(name ="teacher_id" ,
	sequenceName = "teacher_id",
	allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long TeacherId;
	private String firstname;
	private String Lastname;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name= "courseId", referencedColumnName = "courseId")
	private List<Courses> courses;

}
