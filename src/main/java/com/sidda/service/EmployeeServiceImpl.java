package com.sidda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sidda.model.Employee;
import com.sidda.repository.EmployeeRepository;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	
	
	private EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		System.out.println("Autowiring using constructor Injection");
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}
}
