package com.country.CRUD;

import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest

public class EmployeeServicesTest 
{
	@Autowired
    private EmployeeServices employeeService;

    @Test
    public void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
       List<EmployeeEntity> emp = employeeService.list();

       Assert.assertEquals(emp.size(),5);
    }
}
