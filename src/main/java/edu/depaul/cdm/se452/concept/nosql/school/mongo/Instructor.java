package edu.depaul.cdm.se452.concept.nosql.school.mongo;

import java.util.List;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Reference;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.ToString.Exclude;

@ToString
@EqualsAndHashCode
@Getter
@RequiredArgsConstructor
@Document("instructors")
public class Instructor {
    @Id
    private String id = UUID.randomUUID().toString();


    @NonNull
    private String name;
    
    @Exclude
    @Reference
    @Setter
    private List<University> universities;    
}
