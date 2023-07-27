package edu.depaul.cdm.se452.concept.nosql.users;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class AuthenticationService {

    @Autowired
    private UserRepository userRepo;
    
    @Autowired
    private UserRoleRepository userRoleRepo;

    public AppUser registerUser(String username, String password) {
        UserRole userRole = userRoleRepo.findByAuthority("USER").get();

        Set<UserRole> authorities = new HashSet<>();
        authorities.add(userRole);
        AppUser user = new AppUser(username, password);
        user.setAuthorities(authorities);
        return userRepo.save(user);
    }
    

    public AppUser loginUser(String username, String password) {
        AppUser retval = new AppUser(username, password);

        retval = userRepo.findByUsername(username).get();

        return retval;
    }

}
