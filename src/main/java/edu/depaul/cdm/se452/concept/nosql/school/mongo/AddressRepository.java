package edu.depaul.cdm.se452.concept.nosql.school.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AddressRepository extends MongoRepository<Address, String> {
    Address findByLocation(String location);
}