package org.bhavesh.service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.bhavesh.model.Speciality;
import org.bhavesh.repository.SpecialityRepoistory;
import org.springframework.stereotype.Service;

@Service
public class SpecialityService {

	private final SpecialityRepoistory specialityRepo;

	public SpecialityService(SpecialityRepoistory specialityRepo) {
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
	public void save(Speciality speciality)
	{
		specialityRepo.save(speciality);
	}
	public Set<Speciality> findAll()
	{
		Set<Speciality> specialitySet=new HashSet<Speciality>();
		specialityRepo.findAll().forEach(specialitySet::add);
		return specialitySet;
	}
	
}
