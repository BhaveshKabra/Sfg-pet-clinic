package org.bhavesh.service;

import java.util.Set;

import org.bhavesh.model.Vet;

public interface VetService extends CrudService<Vet, Long> {

	public Vet findById(Long id);
	public Vet save(Vet vet);
	public Set<Vet> findAll();
	public Vet findByLastName(String lastName);
}
