package org.bhavesh.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
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
public class Owner extends Person{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2670757171545447689L;
	/**
	 * 
	 */
	@OneToMany(mappedBy = "owner")
    private Set<Pet> pets=new HashSet<Pet>();
    private String address;
    private String city;
    private String telephone;
}
