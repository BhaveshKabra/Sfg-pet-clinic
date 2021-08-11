package org.bhavesh.service;

import java.util.Set;

import org.bhavesh.model.Owner;
import org.bhavesh.model.Vet;
import org.springframework.stereotype.Service;

@Service
public interface VetService {
	Owner findByid(Long id);
	Owner save(Vet vet);
	Set<Vet> findAll();
	Vet findByLastName(String lastName);
}
