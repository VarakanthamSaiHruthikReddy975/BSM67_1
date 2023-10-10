package com.demo.PracticeBootApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.PracticeBootApp.dao.EmployeeDao;
import com.demo.PracticeBootApp.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;
	
	@Override
	public Employee save(Employee employee) {
		Employee e = employeeDao.save(employee);
		return e;
	}

	@Override
	public Optional<Employee> findById(Integer id) {
		// TODO Auto-generated method stub	
		return employeeDao.findById(id);
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeDao.findAll();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		employeeDao.deleteById(id);
	}

	@Override
	public Employee findByname(String name) {
		// TODO Auto-generated method stub
		return employeeDao.findByName(name);
	}
	
	

	
}
