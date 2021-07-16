package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.EmployeeData;
import com.example.demo.Entity.JuniorEmployee;
import com.example.demo.Entity.SeniorEmployee;
import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.Repository.JuniorRepository;
import com.example.demo.Repository.SeniorRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private SeniorRepository seniorRepository;
	
	@Autowired
	private JuniorRepository juniorRepository;
	
	public EmployeeData getEmployee(String employeeName)
	{
		EmployeeData employeeData = employeeRepository.findById(employeeName).get();
		return employeeData;
	}
	
	public void saveEmployee(EmployeeData employeeData)
	{
		employeeRepository.save(employeeData);
	}
	
	public void saveSeniorEmployee(EmployeeData employeeData)
	{
		SeniorEmployee seniorEmployee = new SeniorEmployee(employeeData.getName(), employeeData.getAge());
		seniorRepository.save(seniorEmployee);
	}
	
	public void saveJuniorEmployee(EmployeeData employeeData)
	{
		JuniorEmployee juniorEmployee = new JuniorEmployee(employeeData.getName(), employeeData.getAge());
		juniorRepository.save(juniorEmployee);
	}
	
	

}
