package com.example.vehicle.Assignment_19Oct;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "truck")
public class TruckEntity 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer truck_id;
	private String truck_name;
	private String no_of_tyres;
	
	public Integer getTruck_id() {
		return truck_id;
	}
	public void setTruck_id(Integer truck_id) {
		this.truck_id = truck_id;
	}
	public String getTruck_name() {
		return truck_name;
	}
	public void setTruck_name(String truck_name) {
		this.truck_name = truck_name;
	}
	public String getNo_of_tyres() {
		return no_of_tyres;
	}
	public void setNo_of_tyres(String no_of_tyres) {
		this.no_of_tyres = no_of_tyres;
	}
	
}
