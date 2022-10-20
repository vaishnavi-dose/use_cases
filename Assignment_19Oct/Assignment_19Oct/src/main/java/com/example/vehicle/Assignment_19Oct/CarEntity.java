package com.example.vehicle.Assignment_19Oct;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class CarEntity 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer car_id;
	private String car_name;
	private String no_of_tyres;
	
	public Integer getCar_id() {
		return car_id;
	}
	public void setCar_id(Integer car_id) {
		this.car_id = car_id;
	}
	public String getCar_name() {
		return car_name;
	}
	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}
	public String getNo_of_tyres() {
		return no_of_tyres;
	}
	public void setNo_of_tyres(String no_of_tyres) {
		this.no_of_tyres = no_of_tyres;
	}
}
