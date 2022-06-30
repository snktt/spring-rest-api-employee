package com.springrest.controller.entities;




public class Employees {
	
	
	private long id;
	private String name;
	private String department;
	public Employees(long id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", department=" + department + "]";
	}
	
	
}
