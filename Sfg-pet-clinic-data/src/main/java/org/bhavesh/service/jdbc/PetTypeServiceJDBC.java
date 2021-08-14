package org.bhavesh.service.jdbc;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.bhavesh.model.PetType;
import org.bhavesh.repository.PetTypeRepoistory;
import org.bhavesh.service.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile(value = "JDBC")
public class PetTypeServiceJDBC implements PetTypeService{

private final PetTypeRepoistory petTypeRepo;
	
	public PetTypeServiceJDBC(PetTypeRepoistory ownerRepo) {
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
	public PetType save(PetType petType)
	{
		petTypeRepo.save(petType);
		return petType;
	}
	public Set<PetType> findAll()
	{
		Set<PetType> petTypeSet=new HashSet<PetType>();
		petTypeRepo.findAll().forEach(petTypeSet::add);
		return petTypeSet;
	}
	@Override
	public PetType findById(Long id) {
		Optional<PetType> optPetType=petTypeRepo.findById(id);
		if(optPetType.isPresent())
		{
			return optPetType.get();
		}
		else
		{
			return null;
		}
	}
	@Override
	public void delete(PetType object) {
		petTypeRepo.delete(object);
		
	}
	@Override
	public void deleteById(Long id) {
		petTypeRepo.deleteById(id);
		
	}
}
