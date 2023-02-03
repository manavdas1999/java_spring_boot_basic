package com.example.demo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Employee;
import com.example.demo.service.*;


@RestController
public class MyController {
	
	@GetMapping("/home")
	public String home() {
		return "<h1>Welcome to my site</h1>";
	}
	
//	SPring boot injects dependency object here
	@Autowired
	EmployeeServiceInterface employeeService;

	@GetMapping("/employee")
	public Employee getEmployee() {
		return employeeService.getEmployee();
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return employeeService.getAllEmployees();
	}
}
