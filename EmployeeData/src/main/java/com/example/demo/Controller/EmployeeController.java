package com.example.demo.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Entity.EmployeeData;
import com.example.demo.Service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/getEmployee/{employeeName}")
	public ResponseEntity<EmployeeData> getEmployee(@PathVariable String employeeName){
		EmployeeData employeeData = employeeService.getEmployee(employeeName);
        System.out.println(employeeData);
        return new ResponseEntity<EmployeeData>(employeeData, HttpStatus.OK);
    }

    @PostMapping("/saveEmployee")
	public ResponseEntity<EmployeeData> saveEmployee(@RequestBody EmployeeData employeeData){
		employeeService.saveEmployee(employeeData);
		return new ResponseEntity<EmployeeData>(employeeData, HttpStatus.OK);
	}

	@PostMapping("/saveSeniorEmployee")
	public ResponseEntity<EmployeeData> saveSeniorEmployee(@RequestBody EmployeeData employeeData) throws JsonProcessingException {
		employeeService.saveSeniorEmployee(employeeData);
		return new ResponseEntity<EmployeeData>(employeeData, HttpStatus.OK);
	}

	@PostMapping("/saveJuniorEmployee")
	public ResponseEntity<EmployeeData> saveJuniorEmployee(@RequestBody EmployeeData employeeData) throws JsonProcessingException{
		employeeService.saveJuniorEmployee(employeeData);
		return new ResponseEntity<EmployeeData>(employeeData, HttpStatus.OK);
	}
}
