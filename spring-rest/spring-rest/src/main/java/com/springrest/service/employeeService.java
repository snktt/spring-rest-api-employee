package com.springrest.service;

import java.util.List;

import com.springrest.controller.entities.Employees;

public interface employeeService {

	public List<Employees> getEmployees();
	
	public Employees addEmployee(Employees employee);
	
	public Employees getEmployeeById(long id);
}
