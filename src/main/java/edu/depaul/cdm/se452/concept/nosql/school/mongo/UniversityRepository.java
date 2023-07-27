package edu.depaul.cdm.se452.concept.nosql.school.mongo;

import org.springframework.data.repository.CrudRepository;

public interface UniversityRepository extends CrudRepository<University, String> { 
    public University findByName(String name);
}