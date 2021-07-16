package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.SeniorEmployee;

public interface SeniorRepository extends JpaRepository<SeniorEmployee, String>{

}
