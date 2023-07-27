package edu.depaul.cdm.se452.concept.nosql.school.redis;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * Additional setup with mapping between code and table/columns when they do not match  class/property
 */
@ToString
@EqualsAndHashCode
@Getter
@RequiredArgsConstructor
@RedisHash("Students")
public class Student {
	@Id
	private long id;
	
	@NonNull
	private String studentId;

	@NonNull
	private String name;

	@NonNull
	private String email;

	@NonNull
	private LocalDate admittedDate;
}