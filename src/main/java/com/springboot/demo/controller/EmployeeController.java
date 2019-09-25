package com.springboot.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.model.Employee;

@RestController
public class EmployeeController {

	@RequestMapping("/findall")
	public List<Employee> getEmployees() {
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(11, "HariKishoreM", "BhargaviC", "hari.kishore@gmail.com"));
		employeesList.add(new Employee(12, "AnilKumarM", "CharanC", "anil.kumar@gmail.com"));
		employeesList.add(new Employee(13, "SrinivasM", "Madipalli", "Srinivas@gmail.com"));
		employeesList.add(new Employee(14, "Lepakshi", "Yanamala", "Lepakshi.jetti@gmail.com"));
		employeesList.add(new Employee(15, "Sai", "Z", "Sai.jetti@gmail.com"));
		return employeesList;
	}

}
