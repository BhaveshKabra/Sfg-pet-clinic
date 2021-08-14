package org.bhavesh.model;

import javax.persistence.MappedSuperclass;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class Person extends BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = -985475393109874096L;
	/**
	 * 
	 */
	
	private String firstName;
	private String lastName;
	
}