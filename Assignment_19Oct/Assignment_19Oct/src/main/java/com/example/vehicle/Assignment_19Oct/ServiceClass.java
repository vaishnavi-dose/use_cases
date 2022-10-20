package com.example.vehicle.Assignment_19Oct;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class ServiceClass 
{
	@Resource
	private CarRepo cr;
	
	@Resource
	private TruckRepo tr;
}
