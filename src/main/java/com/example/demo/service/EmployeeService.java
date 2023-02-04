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
	

	
	public EmployeeService() {
		list = new ArrayList();
		
		list.add(new Employee(1, "Manav", "987654321", 102));
		list.add(new Employee(2, "Abhishek", "987657868", 101));
		list.add(new Employee(3, "Rohan", "9811154321", 104));
		list.add(new Employee(4, "Akash", "876654321", 102));
	}

	public List<Employee> getAllEmployees() {

		return list;
			
	}
	
	public Employee getEmployee(int employeeId) {
		for(Employee e: list) {
			if(e.getId() == employeeId) {
				return e;
			}
		}
		return null;
		
	}

	@Override
	public Employee addEmployee(Employee employee) {
		list.add(employee);
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		for(Employee e: list) {
			if(e.getId() == employee.getId()) {
				e.setName(employee.getName());
				e.setPhone(employee.getPhone());
				e.setDept(employee.getDept());
				
			}
		}
		return employee;
		
	}

	@Override
	public void deleteEmployee(int employeeId) {
		for(Employee e: list) {
			if(e.getId() == employeeId) {
				list.remove(e);
			}
		}
		
	}






}
