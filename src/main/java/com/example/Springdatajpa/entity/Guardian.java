/**
 * 
 */
package com.example.Springdatajpa.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.example.Springdatajpa.Repositry.StduentRepositry;


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
@AllArgsConstructor
@NoArgsConstructor
@Builder
@AttributeOverrides({
	@AttributeOverride(name="name", column = @Column(name="guardianname")),
	@AttributeOverride(name="email", column = @Column(name="guardianemail")),
	@AttributeOverride(name="mobile", column = @Column(name="guardianmobile"))
})

public class Guardian {

	private String name;
	private String email;
	private String mobile;
}
