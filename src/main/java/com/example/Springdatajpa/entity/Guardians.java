/**
 * 
 */
package com.example.Springdatajpa.entity;

import javax.persistence.Embeddable;
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

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Guardians {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long guardianid;
	private String guardianname;
	private String guardianlastname;

}
