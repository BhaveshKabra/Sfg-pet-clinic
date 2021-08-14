package org.bhavesh.service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.bhavesh.model.PetType;
import org.bhavesh.repository.PetTypeRepoistory;
import org.springframework.stereotype.Service;

@Service
public class PetTypeService{

private final PetTypeRepoistory petTypeRepo;
	
	public PetTypeService(PetTypeRepoistory ownerRepo) {
		super();
		this.petTypeRepo = ownerRepo;
	}
	public PetType findByid(Long id)
	{
		Optional<PetType> petTypeopt= petTypeRepo.findById(id);
		if(petTypeopt.isPresent())
			return petTypeopt.get();
		else
			return null;
	}
	public void save(PetType owner)
	{
		petTypeRepo.save(owner);
	}
	public Set<PetType> findAll()
	{
		Set<PetType> petTypeSet=new HashSet<PetType>();
		petTypeRepo.findAll().forEach(petTypeSet::add);
		return petTypeSet;
	}
}
