package org.bhavesh.service;

import java.util.Set;

import org.bhavesh.model.Pet;

public interface PetService extends CrudService<Pet, Long>{
	
	public Pet findById(Long id);
	public Pet save(Pet pet);
	public Set<Pet> findAll();
	public Pet findByName(String name);
}
