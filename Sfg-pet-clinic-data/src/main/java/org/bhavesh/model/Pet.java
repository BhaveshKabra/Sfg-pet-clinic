package org.bhavesh.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class Pet extends BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2303771160941510965L;
	private String name;
	@ManyToOne()
	@JoinColumn(name="pet_id")
	private PetType petType;
	@ManyToOne
	@JoinColumn(name="owner_id")
	private Owner owner;
	private LocalDate dob;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "pet")
	private Set<Visit> visitSet=new HashSet<Visit>();
}