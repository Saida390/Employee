package com.Phone.demo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Phone.demo.dao.EmployeeDao;
import com.Phone.demo.entity.Employee;

@Service
public class EmployeeService {
	Logger logger = LoggerFactory.getLogger(EmployeeService.class);
	
	@Autowired
	EmployeeDao employeedao;
	public String addEmployeeDetails(Employee employee) {
		return employeedao.addEmployeeDetails(employee);
	}
	
	public String updateEmployeeInfo( Employee employee ) {
		return employeedao.updateEmployeeInfo(employee);
	}
	
	public String insertingBulkData( List<Employee> employees) {
		return employeedao.insertingBulkData(employees);
	}

	public Employee getEmployeeInfo(int id) {
	
		return employeedao.getEmployeeInfo(id);
	}


	public List<Employee> getAll() {
		logger.info("After controller is service class===");
		
		return employeedao.getAll();
	}

	public String deleteDatabyId(int id) {
	
		return employeedao.deleteDatabyId(id);
	}

	public List<Employee> getSalaryRange(int salary1, int salary2) {
		
		return employeedao.getSalaryRange(salary1,salary2);
	}

	public List<Employee> getHighestSalary() {
		
		return employeedao.getHighestSalary();
	}
	
	

}
