package com.sidda.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
	
import com.sidda.model.Employee;

@Repository("employeeRepository")
public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sidda.repository.EmployeeRepository#findAll()
	 */
	@Override
	public List<Employee> findAll() {
		List<Employee> employees = new ArrayList<>();
		Employee emp = new Employee();
		emp.setFirstName("Sidda");
		emp.setLastName("Hebbal");
		employees.add(emp);
		return employees;
	}
}
