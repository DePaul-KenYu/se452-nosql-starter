package edu.depaul.cdm.se452.concept.nosql.school.mongo.inheritance;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository<T extends Employee> extends MongoRepository<T, String> {
    
}
