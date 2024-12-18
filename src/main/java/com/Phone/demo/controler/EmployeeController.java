package com.Phone.demo.controler;

import org.slf4j.Logger;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Phone.demo.entity.Employee;
import com.Phone.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping(value = "/addInfo")
	public String addEmployeeDetails(@RequestBody Employee employee) {
		return employeeService.addEmployeeDetails(employee);
	}
	@PutMapping(value = "/updateData")
	public String updateEmployeeInfo(@RequestBody Employee employee) {
		return employeeService.updateEmployeeInfo(employee);
	}
	
	@PostMapping(value = "/addingBulkData")
	public String insertingBulkData( @RequestBody List<Employee> employees) {
		return employeeService.insertingBulkData(employees);
	}
	
	@GetMapping(value ="/getInfo/{id}")
	public Employee getEmployeeInfo(@PathVariable int id) {
		return employeeService.getEmployeeInfo(id);
	}
	
	@GetMapping(value ="/getAllData")
	public List<Employee> getAll(){
		logger.info("Started executing from the controller class===");
		return employeeService.getAll();
	}
	
	@DeleteMapping(value ="/deleteId/{id}")
	public String deleteDatabyId(@PathVariable int id) {
		return employeeService.deleteDatabyId(id);
	}
	
	@GetMapping(value ="/getSalary/{from}/{to}")
	public List<Employee> getSalaryRange(@PathVariable("from") int salary1,@PathVariable ("to") int salary2){
		return employeeService.getSalaryRange(salary1,salary2);
	}
	
	@GetMapping(value ="/highestSallary")
	public List<Employee> getHighestSalary(){
		return employeeService.getHighestSalary();
	}
	
	
}
