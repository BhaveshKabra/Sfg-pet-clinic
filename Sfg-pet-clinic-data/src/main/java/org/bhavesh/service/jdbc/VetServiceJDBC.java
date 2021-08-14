package org.bhavesh.service.jdbc;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.bhavesh.model.Vet;
import org.bhavesh.repository.VetRepository;
import org.bhavesh.service.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile(value = "JDBC")
public class VetServiceJDBC implements VetService{
private final VetRepository vetRepo;
	
	public VetServiceJDBC(VetRepository vetRepo) {
		super();
		this.vetRepo = vetRepo;
	}
	public Vet findById(Long id)
	{
		Optional<Vet> optVet= vetRepo.findById(id);
		if(optVet.isPresent())
		{
			return optVet.get();
		}
		else
		{
			return null;
		}
	}
	public Vet save(Vet vet)
	{
		return vetRepo.save(vet);
	}
	public Set<Vet> findAll()
	{
		HashSet<Vet> vetSet=new HashSet<>();
		vetRepo.findAll().forEach(vetSet::add);
		return vetSet;
	}
	public Vet findByLastName(String lastName)
	{
		Optional<Vet> optVet= vetRepo.findByLastName(lastName);
		if(optVet.isPresent())
		{
			return optVet.get();
		}
		else
		{
			return null;
		}
	}
	@Override
	public void delete(Vet object) {
		vetRepo.delete(object);
	}
	@Override
	public void deleteById(Long id) {
		vetRepo.deleteById(id);
	}
}
