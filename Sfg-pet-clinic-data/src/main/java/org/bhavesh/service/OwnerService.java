package org.bhavesh.service;

import java.util.Set;

import org.bhavesh.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{	
	public Owner findById(Long id);
	public Owner save(Owner owner);
	public Set<Owner> findAll();
	public Owner findByLastName(String lastName);
}
