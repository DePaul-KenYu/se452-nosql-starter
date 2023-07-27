package edu.depaul.cdm.se452.concept.nosql.school.mongo;

import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, String> {
    Address findByLocation(String location);
}