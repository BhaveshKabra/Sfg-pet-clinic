package org.bhavesh.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vet {

	/**
	 * 
	 */
	@Id
	private Long id; 
	private static final long serialVersionUID = -2219238827505816083L;
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
	public Vet(String firstName, String lastName, Long id) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Vet() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
