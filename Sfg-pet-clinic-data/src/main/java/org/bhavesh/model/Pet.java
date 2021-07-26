package org.bhavesh.model;

import java.time.LocalDate;

public class Pet {
	private PetType petType;
	private Owner owner;
	private LocalDate dob;
	public PetType getPetType() {
		return petType;
	}
	public void setPetType(PetType petType) {
		this.petType = petType;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Pet(PetType petType, Owner owner, LocalDate dob) {
		super();
		this.petType = petType;
		this.owner = owner;
		this.dob = dob;
	}
	public Pet() {
		super();
	}
	

}
