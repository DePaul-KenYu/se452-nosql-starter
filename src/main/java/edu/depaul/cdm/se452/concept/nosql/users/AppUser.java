package edu.depaul.cdm.se452.concept.nosql.users;

import java.util.Set;
import java.util.UUID;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@ToString
@EqualsAndHashCode
@Getter
@RequiredArgsConstructor
@Document("AppUsers")
public class AppUser {
    @Id
    private String id = UUID.randomUUID().toString();

    @NonNull
    private String username;

    @NonNull
    private String password;

    @Setter
    private Set<UserRole> authorities;

}
