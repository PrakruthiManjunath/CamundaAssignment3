package com.example.camunda3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.camunda3.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/process/{activityName}/employeeName/{name}")
	public Object getEmployeeData(@PathVariable String activityName, @PathVariable String name)
	{
		return employeeService.triggerProcess(activityName, name);
	}
}
