package org.bhavesh.repository;

import org.bhavesh.model.Pet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends CrudRepository<Pet, Long> {
	public Pet findByLastName(String lastName);
}
