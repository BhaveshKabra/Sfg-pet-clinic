package org.bhavesh.service;

import java.util.Set;

import org.bhavesh.model.Speciality;

public interface SpecialityService extends CrudService<Speciality, Long>{

	public Speciality findById(Long id);
	public Speciality save(Speciality speciality);
	public Set<Speciality> findAll();
	
}
