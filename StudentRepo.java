package com.sharan.student;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, String> {

	@Query(value = "select * from stud s where s.status ='ACCEPTED';",nativeQuery = true)
	List<Student> findAllBystatus(String string);


//	void findByCourseId(String courseOfferingId);



}
