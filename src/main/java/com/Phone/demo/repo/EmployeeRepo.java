package com.Phone.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Phone.demo.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee , Integer>{

	@Query(value = "select * from employee_info where salary >=? and salary <=?",nativeQuery = true)
	public List<Employee> getSalaryRange(int salary1, int salary2);
	
	@Query(value = "select * from employee_info where salary= (select Max(salary) from employee_info)",nativeQuery = true)
	public List<Employee> getHighestSalary();

}
