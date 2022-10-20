package com.example.vehicle.Assignment_19Oct;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BikeRepo extends JpaRepository<BikeEntity, Integer>
{
	@Query(value="SELECT * from bike b JOIN car c ON b.no_of_tyres=c.no_of_tyres;",nativeQuery=true)
	public List<BikeEntity> getjoinbike();
}
