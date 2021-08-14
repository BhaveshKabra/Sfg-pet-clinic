package org.bhavesh.model;

import javax.persistence.Entity;

@Entity
public class PetType extends BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1108880737914258298L;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PetType(String name) {
		super();
		this.name = name;
	}
}
