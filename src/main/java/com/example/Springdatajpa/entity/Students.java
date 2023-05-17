/**
 * 
 */
package com.example.Springdatajpa.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Students {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long studentid;
	private String firstname;
	private String lastname;
	
	@Embedded
	private Guardians guardians;

}
