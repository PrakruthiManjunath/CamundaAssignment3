package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeData {
	
	@Id
	@Column(name = "employeeName")
	private String name;
	
	@Column(name = "employeeAge")
	private Integer age;
	
	public EmployeeData()
	{
		
	}

	public EmployeeData(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "EmployeeData [name=" + name + ", age=" + age + "]";
	}
	

}
