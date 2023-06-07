package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.entity.Employee;
import com.web.model.EmployeeModel;
import com.web.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService empService;
	
	@RequestMapping("/")
	public String home() {
		return "home";
		
	}
	@RequestMapping("/employee")
	public String regPage(Model m) {
		
		EmployeeModel emp = new EmployeeModel();
		m.addAttribute("employee",emp);
		return "empreg";
	}
	@RequestMapping("/register")
	public String save(@ModelAttribute Employee employee,Model m) {
		Employee s = empService.saveEmployee(employee);
		return "success";
		
	}
	@RequestMapping("/views")
	public String getDetails(Model m) {
		List<Employee> employee = empService.getAll();
		m.addAttribute("employees",employee);
		return "viewemployees";
	}
	@RequestMapping("/deleteemployee/{eid}")
	public String deleteRecord(@PathVariable int eid) {
		empService.deleteEmployee(eid);
		return "home";
		
	}
	
	@RequestMapping("/editemployee/{eid}")
	public String editUser(@PathVariable int eid, Model model) {

		Employee std = empService.updateEmployee(eid);
		model.addAttribute("command", std);
		return "editemployee";

	}

}
