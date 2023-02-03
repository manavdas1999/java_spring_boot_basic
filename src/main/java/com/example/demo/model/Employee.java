package com.example.demo.model;

public class Employee {
	private int id;
	private String name;
	private String phone;
	private int dept;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phone=" + phone + ", dept=" + dept + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getDept() {
		return dept;
	}

	public void setDept(int dept) {
		this.dept = dept;
	}

	public Employee(int id, String name, String phone, int dept) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.dept = dept;
	}
	
	
}
