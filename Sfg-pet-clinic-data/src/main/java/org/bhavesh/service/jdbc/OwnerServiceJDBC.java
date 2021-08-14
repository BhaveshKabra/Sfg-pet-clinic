package org.bhavesh.service.jdbc;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.bhavesh.model.Owner;
import org.bhavesh.repository.OwnerRepoistory;
import org.bhavesh.service.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile(value = "JDBC")
public class OwnerServiceJDBC implements OwnerService{
	private final OwnerRepoistory ownerRepo;
	
	public OwnerServiceJDBC(OwnerRepoistory ownerRepo) {
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
	public Owner save(Owner owner)
	{
		ownerRepo.save(owner);
		return owner;
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
	@Override
	public Owner findById(Long id) {
		Optional<Owner> optOwner=ownerRepo.findById(id);
		if(optOwner.isPresent())
		{
			return optOwner.get();
		}
		else
		{
			return null;
		}
	}
	@Override
	public void delete(Owner object) {
		ownerRepo.delete(object);
		
	}
	@Override
	public void deleteById(Long id) {
		ownerRepo.deleteById(id);
		
	}
}
