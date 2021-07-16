package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seniorEmployee")
public class SeniorEmployee {
	
	@Id
	@Column(name = "seniorName")
	private String name;
	
	@Column(name = "seniorAge")
	private Integer age;
	
	public SeniorEmployee()
	{
		
	}

	public SeniorEmployee(String name, Integer age) {
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
		return "SeniorEmployee [name=" + name + ", age=" + age + "]";
	}
}
