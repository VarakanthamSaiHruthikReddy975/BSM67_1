package com.demo.PracticeBootApp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.PracticeBootApp.model.Employee;
import com.demo.PracticeBootApp.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping("/greet")
	public String greeting()
	{
		System.out.println("Good Afternoon");
		return "Good Afternoon";
	}
	
	@GetMapping("/greet1")
	public String greeting2()
	{
		return "Good Morning";
	}
	
	@PostMapping("/save")
	public Employee receiveJson(@RequestBody Employee employee)
	{
		System.out.println("Employee name -> "+employee.getName());
		return employeeService.save(employee);
	}
	
//	@PutMapping("/save5")
//	public Integer updateValue(@PathVariable Integer id,@RequestBody Employee employee)
//	{
//		return employee.getId();
//	}
	@GetMapping("/fetchAll")
	public List<Employee> fetchAllEmployees()
	{
	
		return employeeService.findAll();
	}
	
	@GetMapping("/fetchbyid/{id}")
	public Optional<Employee> fetchById(@PathVariable Integer id)
	{
	
		return employeeService.findById(id);
	}
	
	@GetMapping("/fetchbyname/{name}")
	public Employee fetchByName(@PathVariable String name)
	{
	
		return employeeService.findByname(name);
	}
	
	@DeleteMapping("/deletebyid/{id}")
	public String deleteEmployee(@PathVariable Integer id)
	{
		employeeService.delete(id);
		return id+" deleted from database";
	}
	
	
}
