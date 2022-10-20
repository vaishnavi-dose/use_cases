package com.example.vehicle.Assignment_19Oct;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController 
{
	@Autowired
	private CarRepo cr;
	@GetMapping("/car") 
	public List<CarEntity> getSample(){
		ArrayList<CarEntity> transformedvalues=new ArrayList<CarEntity>();
		
    	for(CarEntity emt:cr.findAll()) {
    		CarEntity temp=new CarEntity();
    		
    		temp.setCar_id(emt.getCar_id());
    		temp.setCar_name(emt.getCar_name());
    		temp.setNo_of_tyres(emt.getNo_of_tyres());
    		
    		transformedvalues.add(temp);
    	}
    	return transformedvalues;
	}
	
	@Autowired
	private BikeRepo br;
	@GetMapping("/bike") 

	public List<BikeEntity> joinbike(){
		return br.getjoinbike();
	}
	
	@Autowired
	private CarRepo c;
	@GetMapping("/car2") 

	public List<CarEntity> join2(){
		return c.getjoin2();
	}
	
	@Autowired
	private TruckRepo t;
	@GetMapping("/t2") 

	public List<TruckEntity> join(){
		return t.getjoin();
	}
}
