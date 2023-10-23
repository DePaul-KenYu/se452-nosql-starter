package edu.depaul.cdm.se452.concept.nosql.school.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UniversityRepository extends MongoRepository<University, String> { 
    public University findByName(String name);
}