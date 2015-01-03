package net.javabeat.springdata.repo;

import java.math.BigInteger;

import net.javabeat.springdata.jpa.data.Employee;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/*
This layer speak with db for you.

*/




@Repository
public interface EmployeeRepository extends CrudRepository<Employee, BigInteger>{

}
