package org.bhavesh.repository;

import org.bhavesh.model.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepoistory extends CrudRepository<Owner, Long> {

	public Owner findByLastName(String lastName);
}
