package edu.depaul.cdm.se452.concept.nosql.school.redis;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {
    Optional<Course> findByDeptAndNum(String dept, String num);
}
