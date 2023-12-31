package edu.depaul.cdm.se452.concept.nosql.school.redis;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

/**
 * Example of adding additional finders
 */
public interface StudentRepository extends CrudRepository<Student, Long> {
    public List<Student> findByAgeLessThanEqual(long age);
}
