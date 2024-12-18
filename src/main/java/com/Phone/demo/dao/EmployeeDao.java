package com.Phone.demo.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.Phone.demo.entity.Employee;
import com.Phone.demo.repo.EmployeeRepo;

@Repository
public class EmployeeDao {
	Logger logger = LoggerFactory.getLogger(EmployeeDao.class);
	@Autowired
	EmployeeRepo employeeRepo;
	public String addEmployeeDetails(Employee employee) {
		employeeRepo.save(employee);
		return "Data Added To The Data Base";
	}
	
	public String updateEmployeeInfo(Employee employee) {
		employeeRepo.save(employee);
		return "Data update to the DB";
	}
	
	public String insertingBulkData(List<Employee> employees) {
		employeeRepo.saveAll(employees);
		return "Bulk data add in DB";
	}

	public Employee getEmployeeInfo(int id) {
		
		return employeeRepo.findById(id).get();
	}

	public List<Employee> getAll() {
		logger.info("finally DAO class===");
		
		return employeeRepo.findAll();
	}

	public String deleteDatabyId(int id) {
		employeeRepo.deleteById(id);
	
		return "Delete the data DB";
	}

	public List<Employee> getSalaryRange(int salary1, int salary2) {
		
		return employeeRepo.getSalaryRange(salary1,salary2);
	}

	public List<Employee> getHighestSalary() {
	
		return employeeRepo.getHighestSalary();
	}

}
