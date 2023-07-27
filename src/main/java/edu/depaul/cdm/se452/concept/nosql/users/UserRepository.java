package edu.depaul.cdm.se452.concept.nosql.users;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<AppUser, String> {
    Optional<AppUser> findByUsername(String username);    
}
