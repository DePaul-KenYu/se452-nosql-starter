package edu.depaul.cdm.se452.concept.nosql.school.mongo;


import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;


@ToString
@EqualsAndHashCode
@Getter
@RequiredArgsConstructor
@Document("addresses")
public class Address {
    @Id
    private String id = UUID.randomUUID().toString();

    @NonNull
    private String location;        
}
