package com.springrest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.controller.entities.Employees;
import com.springrest.service.employeeService;

@RestController
public class restcontroller {
	
	@Autowired
	private employeeService eService;

	@GetMapping("/home")
	public String home() {
		return "mic test 1 2 3...";
	}
	
    	/*
	@GetMapping("/employees")
	public List<Employees> getEmployees(){
		return this.eService.getEmployees();
	}
	   */

	@GetMapping("/employees")
	public ResponseEntity<List<Employees>> getEmployees(){
		List<Employees> list=eService.getEmployees();
		if(list.size()<=0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(list));
	}
	
	@GetMapping("/employees/{id}")
	public Employees getEmployeeById(@PathVariable String id) {
		return this.eService.getEmployeeById(Long.parseLong(id));
	}
	
	@PostMapping("/employees")
	public Employees addEmployee(@RequestBody Employees employee) {
		return this.eService.addEmployee(employee);
	}
	
}
