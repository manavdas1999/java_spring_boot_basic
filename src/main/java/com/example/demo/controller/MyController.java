package com.example.demo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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


	
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/employee/{employeeId}")
	public Employee getEmployee(@PathVariable int employeeId) {
		return employeeService.getEmployee(employeeId);
	}
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
	
	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
	
	@DeleteMapping("/employee/{employeeId}")
	public ResponseEntity<HttpStatus>deleteEmployee(@PathVariable int employeeId){
		try {
			employeeService.deleteEmployee(employeeId);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
}
