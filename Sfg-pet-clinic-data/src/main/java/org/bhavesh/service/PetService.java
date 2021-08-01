package org.bhavesh.service;

import java.util.Set;

import org.bhavesh.model.Pet;
import org.springframework.stereotype.Service;

@Service
public interface PetService {
	Pet findByid(Long id);
	Pet save(Pet owner);
	Set<Pet> findAll();
	Pet findByLastName(String lastName);
}
