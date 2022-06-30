package com.springrest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import com.springrest.controller.entities.Employees;
import com.springrest.service.employeeServiceImpl;

@SpringBootTest
public class serviceTest {

	@InjectMocks
	employeeServiceImpl eSerImpl;
	
	List<Employees> empList;
	
	@Test
	@Order(1)
	public void test_getEmployees() {
		List<Employees> empList=new ArrayList<Employees>();
		empList.add(new Employees(11,"raj","autocad"));
		empList.add(new Employees(22,"shri","MERn"));
	//	when(eSerImpl.getEmployees()).thenReturn(empList);
		assertEquals(2,eSerImpl.getEmployees().size());

	} 
	
	@Test
	@Order(2)
	public void test_getEmployeeById() {
		
		List<Employees> empList=new ArrayList<Employees>();
		empList.add(new Employees(11,"raj","autocad"));
		empList.add(new Employees(22,"shri","MERn"));
		int empId=1;
		assertEquals(empId, eSerImpl.getEmployeeById(empId).getId());;
	}
	
	@Test
	@Order(3)
	public void test_addEmployee() {
		
		Employees emp=new Employees(33,"salman","Shooting");
		assertEquals(emp, eSerImpl.addEmployee(emp));
		
	}
	
	
}
