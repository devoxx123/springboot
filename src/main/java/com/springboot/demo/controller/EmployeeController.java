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
		return employeesList;
	}
	@RequestMapping("/today")
	public String todayDate(){
		String date=" Welcome To Jenkins Learning Centre " + new Date();
		return date;

}
