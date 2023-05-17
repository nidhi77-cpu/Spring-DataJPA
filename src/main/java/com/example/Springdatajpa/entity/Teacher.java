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
import javax.persistence.Table;

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
@Table(name="tbl_teacher")
public class Teacher {
	@Id
	@SequenceGenerator(name="teacher_Sequence" , sequenceName = "teacher_Sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "teacher_Sequence")
	private Long TeacherId;
	private String firstname;
	private String Lastname;
	
	
	//one to many realtionship::
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="TeacherId", referencedColumnName = "TeacherId")
	private List<Course> courses;

}
