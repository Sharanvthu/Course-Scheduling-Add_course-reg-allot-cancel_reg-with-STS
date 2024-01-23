package com.sharan.student;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CancelRepo extends CrudRepository<Cancel, Integer> {

}
