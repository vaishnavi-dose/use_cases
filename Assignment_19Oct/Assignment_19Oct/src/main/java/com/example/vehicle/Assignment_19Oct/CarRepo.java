package com.example.vehicle.Assignment_19Oct;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CarRepo extends JpaRepository<CarEntity, Integer>
{
	@Query(value="SELECT * from car c INNER JOIN truck t ON t.no_of_tyres=c.no_of_tyres;",nativeQuery=true)
	public List<CarEntity> getjoin2();
	
	
}
