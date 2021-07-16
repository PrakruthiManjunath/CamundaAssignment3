package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.EmployeeData;

public interface EmployeeRepository extends JpaRepository<EmployeeData, String>{

}
