package org.bhavesh.service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.bhavesh.model.Pet;
import org.bhavesh.repository.PetRepository;
import org.springframework.stereotype.Service;

@Service
public class PetService {
	private final PetRepository petrepo;
	
	public PetService(PetRepository petrepo) {
		super();
		this.petrepo = petrepo;
	}
	public Pet findByid(Long id)
	{
		Optional<Pet> optPet=petrepo.findById(id);
		if(optPet.isPresent())
			return optPet.get();
		else
			return null;
	}
	public void save(Pet pet)
	{
		petrepo.save(pet);
	}
	public Set<Pet> findAll()
	{
		Set<Pet> petSet=new HashSet<Pet>();
		petrepo.findAll().forEach(petSet::add);
		return petSet;
	}
	public Pet findByLastName(String lastName)
	{
		return petrepo.findByLastName(lastName);
	}
}
