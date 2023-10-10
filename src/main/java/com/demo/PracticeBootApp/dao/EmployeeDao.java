package com.demo.PracticeBootApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.PracticeBootApp.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	public Employee findByName(String name);
	
}
