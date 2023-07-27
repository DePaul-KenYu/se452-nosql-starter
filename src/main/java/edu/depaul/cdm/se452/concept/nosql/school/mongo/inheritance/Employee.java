package edu.depaul.cdm.se452.concept.nosql.school.mongo.inheritance;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@ToString
@EqualsAndHashCode
@Getter
@NoArgsConstructor
@SuperBuilder
@Document("employees")
public abstract class Employee {
    @Id
    private String id = UUID.randomUUID().toString();


    @NonNull
    private String name;

    private LocalDate startDate;
    
}
