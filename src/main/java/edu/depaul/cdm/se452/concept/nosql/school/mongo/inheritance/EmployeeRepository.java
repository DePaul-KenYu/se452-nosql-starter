package edu.depaul.cdm.se452.concept.nosql.school.mongo.inheritance;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository<T extends Employee> extends CrudRepository<T, String> {
    
}
