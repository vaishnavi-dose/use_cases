package com.example.policy.insurance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController 
{
	// this is for showing only one client data
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
	
	// This is for discount...to display discount value
	@GetMapping("/discount/{ten}/{premium}")
	public int discount(@PathVariable String ten, @PathVariable int premium) 
	{
		if (ten.equals("morethan5"))
		{
			int x = (premium*12)/100;
			premium = premium-x;
			return premium;
		}
		if (ten.equals("equalsto5"))
		{
			int x = (premium*10)/100;
			premium = premium-x;
			return premium;
		}
		else if (ten.equals("lessthan5"))
		{
			return premium;
		}
		return 0;
	}
}

