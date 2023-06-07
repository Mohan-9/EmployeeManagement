package com.web.service;

import java.util.List;

import com.web.entity.Employee;

public interface EmployeeService {
	public Employee saveEmployee(Employee employee);
	public Employee updateEmployee(Integer eid);
	public void deleteEmployee(Integer eid);
	public List<Employee> getAll();
	

}
