package org.bhavesh.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Vet extends Person {

	/**
	 * 
	 */
	@OneToMany
	private Set<Speciality> specialities=new HashSet<Speciality>();

	public Set<Speciality> getSpecialities() {
		return specialities;
	}

	public void setSpecialities(Set<Speciality> specialities) {
		this.specialities = specialities;
	}
	
}