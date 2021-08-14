package org.bhavesh.service.jdbc;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.bhavesh.model.Visit;
import org.bhavesh.repository.VisitRepository;
import org.bhavesh.service.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile(value = "JDBC")
public class VisitServiceJDBC implements VisitService{

	private VisitRepository visitRepository;
	
	
	public VisitServiceJDBC(VisitRepository visitRepository) {
		super();
		this.visitRepository = visitRepository;
	}

	@Override
	public Set<Visit> findAll() {
		Set<Visit> visits=new HashSet<Visit>();
		visitRepository.findAll().forEach(visits::add);
		return visits;
	}

	@Override
	public Visit findById(Long id) {
		Optional<Visit> visitOpt =visitRepository.findById(id);
		if(visitOpt.isPresent())
		{
			return visitOpt.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public Visit save(Visit object) {
		visitRepository.save(object);
		return object;
	}

	@Override
	public void delete(Visit object) {
		visitRepository.delete(object);
		
	}

	@Override
	public void deleteById(Long id) {
		visitRepository.deleteById(id);
		
	}
	
}
