package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "juniorEmployee")
public class JuniorEmployee {
	
	@Id
	@Column(name = "juniorName")
	private String name;
	
	@Column(name = "juniorAge")
	private Integer age;
	
	public JuniorEmployee()
	{
		
	}

	public JuniorEmployee(String name, Integer age) {
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
		return "JuniorEmployee [name=" + name + ", age=" + age + "]";
	}
	
}
