package org.bhavesh.service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.bhavesh.model.Owner;
import org.bhavesh.repository.OwnerRepoistory;
import org.springframework.stereotype.Service;

@Service
public class OwnerService {
	private final OwnerRepoistory ownerRepo;
	
	public OwnerService(OwnerRepoistory ownerRepo) {
		super();
		this.ownerRepo = ownerRepo;
	}
	public Owner findByid(Long id)
	{
		Optional<Owner> owneropt= ownerRepo.findById(id);
		if(owneropt.isPresent())
			return owneropt.get();
		else
			return null;
	}
	public void save(Owner owner)
	{
		ownerRepo.save(owner);
	}
	public Set<Owner> findAll()
	{
		Set<Owner> ownerSet=new HashSet<Owner>();
		ownerRepo.findAll().forEach(ownerSet::add);
		return ownerSet;
	}
	public Owner findByLastName(String lastName)
	{
		return ownerRepo.findByLastName(lastName);
	}
}
