package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeServiceInterface {
	
	public List<Employee> getAllEmployees();
	
	public Employee getEmployee(int employeeId);

	public Employee addEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public void deleteEmployee(int employeeId);
	
}
