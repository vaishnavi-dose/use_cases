package com.country.CRUD;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class EmployeeServices 
{
	@Autowired
    private EmployeeRepoJpa er;

	@GetMapping("/jpa")
    public List<EmployeeEntity> list() {
        return er.findAll();
    }
}
