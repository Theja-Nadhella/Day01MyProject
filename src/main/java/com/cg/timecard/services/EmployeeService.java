package com.cg.timecard.services;

/**Author: Aswitha
Project Desc: Employee Service
Desc: EmployeeService Interface performing crud operations on Employee Class**/
import java.util.List;

import com.cg.timecard.entities.Employee;
import com.cg.timecard.exception.ResourceNotFoundException;

public interface EmployeeService {
	
	/**Create an employee
	 * @param employee
	 * @return
	 * @throws ResourceNotFoundException
	 */
	Employee createEmployee(Employee employee) throws ResourceNotFoundException;
	
	/**Update Employee details
	 * @param employeeId
	 * @param employeeDetails
	 * @return
	 * @throws ResourceNotFoundException
	 */
	Employee updateEmployee(Integer employeeId, Employee employeeDetails) throws ResourceNotFoundException;
	
	/**Delete an employee
	 * @param employeeId
	 * @return
	 * @throws ResourceNotFoundException
	 */
	boolean deleteEmployeeById(Integer employeeId) throws ResourceNotFoundException;
	
	/**Display list of employees
	 * @return
	 */
	List<Employee> getAllEmployee();
	
	/**Find employee using his/her ID
	 * @param empId
	 * @return
	 * @throws ResourceNotFoundException
	 */
	Employee getEmpById(int empId) throws ResourceNotFoundException;

}
