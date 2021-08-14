package org.bhavesh.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class Vet extends Person {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1593404115054942827L;
	/**
	 * 
	 */
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name="vet_specialties", joinColumns = @JoinColumn(name="vet_id"),inverseJoinColumns = @JoinColumn(name="specialties_id"))
	private Set<Speciality> specialities=new HashSet<Speciality>();	
}