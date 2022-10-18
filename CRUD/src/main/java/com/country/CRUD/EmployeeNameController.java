package com.country.CRUD;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeNameController 
{
	@Autowired
	private EmployeeRepo er;
	@GetMapping("/employeename") 
	
	public List<String> getSample(){
		ArrayList<String> transformedvalues=new ArrayList<String>();
    	for(EmployeeEntity emt:er.findAll()) {
    		//EmployeeEntity temp=new EmployeeEntity();
    		String employeeName;
    		employeeName = emt.getEmployeeName();
    		
    		//temp.setEmployeeName(emt.getEmployeeName());
    		
    		transformedvalues.add(employeeName);
    	}
    	return transformedvalues;
	}
}
