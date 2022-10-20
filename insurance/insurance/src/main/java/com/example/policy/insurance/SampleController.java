package com.example.policy.insurance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController 
{
	@Autowired
	private InsuranceRepo ir;
	@GetMapping("/detailsc1") 
	
	public List<InsuranceEntity> join()
	{
		return ir.getjoin(1);
	}
	
 @GetMapping("/detailsc3") 
	
	public List<InsuranceEntity> join3()
	{
		return ir.getjoin(3);
	}
}
