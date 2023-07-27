package edu.depaul.cdm.se452.concept.nosql.users;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AuthenticationServiceTest {
    @Autowired
    private AuthenticationService service;

    @Autowired
    private UserRoleRepository userRoleRepo;

    @BeforeEach
    public void beforeAnyTest() {
        Optional<UserRole> findUser = userRoleRepo.findByAuthority("USER");
        if (findUser.isPresent() == false) {
            UserRole userRole = new UserRole("USER");
            userRoleRepo.save(userRole);
        }
    }

    @Test
    public void testAdd() {
        String userName = "Ken";
        String password = "password";

        AppUser registeredUser  = service.registerUser(userName,password);
        
        AppUser loggedInUser = service.loginUser(userName,password);
        
        assertEquals(registeredUser.getId(), loggedInUser.getId());
    }


}
