package com.school.CRUDdemo;

import org.springframework.data.repository.CrudRepository;

public interface SchoolRepo extends CrudRepository<SchoolEntity, Integer>
{

}
