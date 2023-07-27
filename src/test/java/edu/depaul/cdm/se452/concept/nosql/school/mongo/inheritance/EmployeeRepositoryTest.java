package edu.depaul.cdm.se452.concept.nosql.school.mongo.inheritance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmployeeRepositoryTest {
    @Autowired
    private HourlyEmployeeRepository hrlyRepo;

    @Autowired
    private SalaryEmployeeRepository salaryRepo;

    @Test
    public void testAddFind() {
        String name1 = "Hannah Yu";
        HourlyEmployee hourlyEmployee = HourlyEmployee.builder().name(name1).rate(15.25).build();
        hrlyRepo.save(hourlyEmployee);

        String name2 = "James Yu";
        SalaryEmployee salaryEmployee = SalaryEmployee.builder().name(name2).salary(Long.valueOf(100000)).build();
        salaryRepo.save(salaryEmployee);

        Optional<HourlyEmployee> findHr1 = hrlyRepo.findById(salaryEmployee.getId());
        Optional<HourlyEmployee> findHr2 = hrlyRepo.findById(hourlyEmployee.getId());
        assertFalse(findHr1.isPresent());
        assertEquals(hourlyEmployee.getId(),findHr2.get().getId());

        Optional<SalaryEmployee> findSalry1 = salaryRepo.findById(salaryEmployee.getId());
        Optional<SalaryEmployee> findSalry2 = salaryRepo.findById(hourlyEmployee.getId());
        assertFalse(findSalry2.isPresent());
        assertEquals(salaryEmployee.getId(),findSalry1.get().getId());

    }
    
}
