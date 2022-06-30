package com.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.controller.entities.Employees;

@Service
public class employeeServiceImpl implements employeeService {

	
	
	
	List<Employees> list;
	public employeeServiceImpl() {
			list=new ArrayList<>();
	
		list.add(new Employees(001,"Sanket","Java FSE"));
		list.add(new Employees(002,"shrusti",".NET"));
		
	}
	
	
	@Override
	public List<Employees> getEmployees() {
		// TODO Auto-generated method stub
		return list;
	}


	@Override
	public Employees addEmployee(Employees employee) {
		// TODO Auto-generated method stub
		list.add(employee);
		return employee;
	}


	@Override
	public Employees getEmployeeById(long id) {
		// TODO Auto-generated method stub
	
  	Employees obj= null;
		for(Employees e:list) {
			if(e.getId()==id) {
				obj=e;
				break;
			}
		}
		
		return obj;
	}

}
