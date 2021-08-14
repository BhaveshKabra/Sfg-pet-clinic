package org.bhavesh.model;

import javax.persistence.Entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class PetType extends BaseEntity{
	public PetType(String name) {
		this.name=name;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1108880737914258298L;
	private String name;
}
