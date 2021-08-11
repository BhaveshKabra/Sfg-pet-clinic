package org.bhavesh.model;

public class PetType{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1108880737914258298L;
	private String name;

	public Long Id;
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PetType(String name, Long id) {
		super();
		this.name = name;
		Id = id;
	}
}
