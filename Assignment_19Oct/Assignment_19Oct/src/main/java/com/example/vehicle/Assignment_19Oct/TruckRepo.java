package com.example.vehicle.Assignment_19Oct;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TruckRepo extends JpaRepository<TruckEntity, Integer>
{
	@Query(value="SELECT * from truck t INNER JOIN car c ON t.no_of_tyres=c.no_of_tyres;",nativeQuery=true)
	public List<TruckEntity> getjoin();
}
