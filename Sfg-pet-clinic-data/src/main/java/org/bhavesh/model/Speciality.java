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
public class Speciality extends BaseEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8337594490618161853L;
	@OneToMany(targetEntity = Vet.class)
	private Set<Vet> vetSet=new HashSet<>();
	private String description;	
}
