package org.bhavesh.repository;

import java.util.Optional;

import org.bhavesh.model.Vet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VetRepository extends CrudRepository<Vet, Long> {

	Optional<Vet> findByLastName(String lastName);

}
