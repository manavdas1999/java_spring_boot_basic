package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;

// Spring boot understands this as a dependency
@Service
public class EmployeeService implements EmployeeServiceInterface{
	
	Employee e;
	List<Employee> list;
	
	public List<Employee> getAllEmployees() {
		list = new ArrayList();
		
		list.add(new Employee(1, "Manav", "987654321", 102));
		list.add(new Employee(2, "Abhishek", "987657868", 101));
		list.add(new Employee(3, "Rohan", "9811154321", 104));
		list.add(new Employee(4, "Akash", "876654321", 102));
		
		return list;
		
		
	}

	@Override
	public Employee getEmployee() {
		e = new Employee(12, "Manav", "987654321", 102);
		return e;
	}
}
