package edu.depaul.cdm.se452.concept.nosql.school.redis;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CourseRespositoryTest {
    @Autowired
    private CourseRepository repo;

    @Test
    public void testAdd() {
        Course course1 = new Course("SE", "352");			
        Course course2 = new Course("SE", "452");			

		repo.save(course1);
		repo.save(course2);
		
		Course courseFind1 = repo.findById(course1.getId()).get();
        assertEquals(course1, courseFind1);
        
        Course courseFind2 = repo.findByDeptAndNum("SE", "452").get();
        assertEquals(course2, courseFind2);
    }
    
}
