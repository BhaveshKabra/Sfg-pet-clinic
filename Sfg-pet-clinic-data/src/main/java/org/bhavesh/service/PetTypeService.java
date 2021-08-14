package org.bhavesh.service;

import java.util.Set;

import org.bhavesh.model.PetType;

public interface PetTypeService extends CrudService<PetType, Long>{
	public PetType findById(Long id);
	public PetType save(PetType owner);
	public Set<PetType> findAll();
}
