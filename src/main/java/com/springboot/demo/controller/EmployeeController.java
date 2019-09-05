package com.springboot.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.model.Employee;

@RestController
public class EmployeeController {

	@RequestMapping("/findall")
	public List<Employee> getEmployees() {
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(1, "HariKishoreM", "BhargaviC", "hari.kishore@gmail.com"));
		employeesList.add(new Employee(2, "AnilKumarM", "CharanC", "anil.kumar@gmail.com"));
		employeesList.add(new Employee(3, "SrinivasM", "Madipalli", "Srinivas@gmail.com"));
		employeesList.add(new Employee(4, "Lepakshi", "Yanamala", "Lepakshi.jetti@gmail.com"));
		employeesList.add(new Employee(5, "Sai", "Z", "Sai.jetti@gmail.com"));
		return employeesList;
	}

}
