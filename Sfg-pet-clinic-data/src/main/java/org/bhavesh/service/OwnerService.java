package org.bhavesh.service;

import java.util.Set;

import org.bhavesh.model.Owner;
import org.springframework.stereotype.Service;

@Service
public interface OwnerService {
	Owner findByid(Long id);
	Owner save(Owner owner);
	Set<Owner> findAll();
	Owner findByLastName(String LastName);
}
