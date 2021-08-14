package org.bhavesh.service.jdbc;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.bhavesh.model.Pet;
import org.bhavesh.repository.PetRepository;
import org.bhavesh.service.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile(value = "JDBC")
public class PetServiceJDBC implements PetService{
	private final PetRepository petrepo;
	
	public PetServiceJDBC(PetRepository petrepo) {
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
	public Pet save(Pet pet)
	{
		petrepo.save(pet);
		return pet;
	}
	public Set<Pet> findAll()
	{
		Set<Pet> petSet=new HashSet<Pet>();
		petrepo.findAll().forEach(petSet::add);
		return petSet;
	}
	public Pet findByName(String name)
	{
		return petrepo.findByName(name);
	}
	@Override
	public Pet findById(Long id) {
		petrepo.findById(id);
		return null;
	}
	@Override
	public void delete(Pet object) {
		petrepo.delete(object);
		
	}
	@Override
	public void deleteById(Long id) {
		petrepo.deleteById(id);
		
	}
}
