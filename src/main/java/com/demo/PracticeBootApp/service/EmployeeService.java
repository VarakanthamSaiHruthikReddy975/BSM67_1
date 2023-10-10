package com.demo.PracticeBootApp.service;

import java.util.List;
import java.util.Optional;

import com.demo.PracticeBootApp.model.Employee;

public interface EmployeeService {
	public Employee save(Employee employee);
	public Optional<Employee> findById(Integer id);
	public Employee findByname(String name);
	public List<Employee> findAll();
	public void delete(Integer id);
	
}
