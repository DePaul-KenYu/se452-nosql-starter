package edu.depaul.cdm.se452.concept.nosql.users;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface UserRoleRepository extends CrudRepository<UserRole, String>{
    Optional<UserRole> findByAuthority(String authority);
}
