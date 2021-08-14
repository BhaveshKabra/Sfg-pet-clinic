package org.bhavesh.repository;

import org.bhavesh.model.Speciality;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialityRepoistory extends CrudRepository<Speciality, Long> {

}
