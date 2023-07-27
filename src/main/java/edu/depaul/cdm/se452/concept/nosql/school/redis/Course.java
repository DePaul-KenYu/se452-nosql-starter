package edu.depaul.cdm.se452.concept.nosql.school.redis;

import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import java.util.UUID;

import lombok.ToString;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * Minimialist code to map against database when then table/column is same as the class/property
 */
@ToString
@EqualsAndHashCode
@Getter
@RequiredArgsConstructor
@RedisHash("Courses")
public class Course {
    private String id = UUID.randomUUID().toString();

    @NonNull
    @Indexed
    private String dept;

    @NonNull
    @Indexed
    private String num;
}