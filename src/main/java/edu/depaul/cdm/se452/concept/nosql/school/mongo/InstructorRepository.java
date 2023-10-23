package edu.depaul.cdm.se452.concept.nosql.school.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface InstructorRepository extends MongoRepository<Instructor, String> { 
    public Instructor findByName(String name);
}
