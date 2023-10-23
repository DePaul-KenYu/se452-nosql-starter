package edu.depaul.cdm.se452.concept.nosql.school.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SchoolRepository extends MongoRepository<School, String> { 
    public School findByName(String name);
}