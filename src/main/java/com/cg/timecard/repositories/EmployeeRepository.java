package com.cg.timecard.repositories;

/**Author: Aswitha
Project Desc: Time Card Service
Desc: EmployeeRepository Interface performing crud operations on Employee**/

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.timecard.entities.Employee;

@Repository
public interface EmployeeRepository extends  JpaRepository<Employee, Integer>  {

}
