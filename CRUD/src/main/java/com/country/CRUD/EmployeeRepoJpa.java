package com.country.CRUD;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepoJpa extends JpaRepository<EmployeeEntity, Integer>
{

}
