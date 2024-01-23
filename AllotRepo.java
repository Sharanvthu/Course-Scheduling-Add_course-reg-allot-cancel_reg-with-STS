package com.sharan.student;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllotRepo extends CrudRepository<Allot, Integer> {

	@Query(value = "select status from allot a where a.course_offering_id=:string",nativeQuery = true)
	String findByStatus(String string);

	
	 
	

}
