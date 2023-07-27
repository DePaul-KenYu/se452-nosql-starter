package edu.depaul.cdm.se452.concept.nosql.school.mongo;

import org.springframework.data.repository.CrudRepository;

public interface SchoolRepository extends CrudRepository<School, String> { 
    public School findByName(String name);
}