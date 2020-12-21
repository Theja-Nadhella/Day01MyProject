package com.cg.timecard.repositories;

/**Author: Aswitha
Project Desc: Time Card Service
Desc: ManagerRepository Interface performing crud operations on Manager**/
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.timecard.entities.Manager;

@Repository
public interface ManagerRepository extends  JpaRepository<Manager, Integer>  {

}
