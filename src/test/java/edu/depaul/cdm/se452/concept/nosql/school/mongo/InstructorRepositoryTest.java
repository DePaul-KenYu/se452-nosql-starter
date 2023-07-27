package edu.depaul.cdm.se452.concept.nosql.school.mongo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class InstructorRepositoryTest {
    @Autowired
    private InstructorRepository instructorRepo;

    @Autowired
    private UniversityRepository uniRepo;

    @Test
    public void testAddFind() {
        String name = "Hannah Yu";
        Instructor instructor = new Instructor(name);

        instructorRepo.save(instructor);

        University depaul = new University("DePaul");
        uniRepo.save(depaul);
        ArrayList<University> unis = new ArrayList<>();
        unis.add(depaul);

        instructor.setUniversities(unis);
        instructorRepo.save(instructor);

        Instructor findInstructor = instructorRepo.findByName(name);
        assertEquals(instructor.getId(), findInstructor.getId());
        assertEquals(instructor.getUniversities().size(), findInstructor.getUniversities().size());
    };
}
