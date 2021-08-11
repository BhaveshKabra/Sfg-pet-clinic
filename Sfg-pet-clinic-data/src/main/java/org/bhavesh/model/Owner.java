package org.bhavesh.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Owner{

	/**
	 * 
	 */
	
	@Id
	private Long id; 
	private static final long serialVersionUID = -5227491768596307832L;
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Owner(Long id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Owner() {
		super();
		
	}
}
