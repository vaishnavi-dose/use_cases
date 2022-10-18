package com.country.CRUD;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeIdController 
{
	@Autowired
	private EmployeeRepo er;
	@GetMapping("/id") 
	
	public List<Integer> getSample(){
		ArrayList<Integer> transformedvalues=new ArrayList<Integer>();
    	for(EmployeeEntity emt:er.findAll()) {
    		//EmployeeEntity temp=new EmployeeEntity();
    		int id;
    		id = emt.getId();
    				
    		//temp.setId(emt.getId());
    		
    		transformedvalues.add(id);
    	}
    	return transformedvalues;
	}
}
