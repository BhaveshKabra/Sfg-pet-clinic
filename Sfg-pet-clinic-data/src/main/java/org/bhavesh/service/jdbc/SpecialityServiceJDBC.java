package org.bhavesh.service.jdbc;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.bhavesh.model.Speciality;
import org.bhavesh.repository.SpecialityRepoistory;
import org.bhavesh.service.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile(value = "JDBC")
public class SpecialityServiceJDBC implements SpecialityService {

	private final SpecialityRepoistory specialityRepo;

	public SpecialityServiceJDBC(SpecialityRepoistory specialityRepo) {
		super();
		this.specialityRepo = specialityRepo;
	}
	
	public Speciality findByid(Long id)
	{
		Optional<Speciality> optSpeciality=specialityRepo.findById(id);
		if(optSpeciality.isPresent())
			return optSpeciality.get();
		else
			return null;
	}
	public Speciality save(Speciality speciality)
	{
		specialityRepo.save(speciality);
		return speciality;
	}
	public Set<Speciality> findAll()
	{
		Set<Speciality> specialitySet=new HashSet<Speciality>();
		specialityRepo.findAll().forEach(specialitySet::add);
		return specialitySet;
	}

	@Override
	public Speciality findById(Long id) {
		Optional<Speciality> specialityOpt= specialityRepo.findById(id);
		if(specialityOpt.isPresent())
		{
			return specialityOpt.get();
		}
		else
		{	
			return null;
		}
	}

	@Override
	public void delete(Speciality object) {
		specialityRepo.delete(object);
		
	}

	@Override
	public void deleteById(Long id) {
		specialityRepo.deleteById(id);
		
	}
	
}
