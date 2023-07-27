package edu.depaul.cdm.se452.concept.nosql.school.mongo;

import org.springframework.data.repository.CrudRepository;

public interface InstructorRepository extends CrudRepository<Instructor, String> { 
    public Instructor findByName(String name);
}
