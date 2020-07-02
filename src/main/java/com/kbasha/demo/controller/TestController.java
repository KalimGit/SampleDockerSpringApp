package com.kbasha.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kbasha.demo.model.Employee;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class TestController {
	
	private List<Employee> employees = createList();
	
	@RequestMapping(method=RequestMethod.GET, value="/employees",produces="application/json")
	public List<Employee> getEmployees() {
		return employees;
	}
	
	private static List<Employee> createList(){
		List<Employee> tempEmployees = new ArrayList<>();
		Employee emp1 = new Employee();
		emp1.setEmpName("emp1");
		emp1.setDesignation("manager");
		emp1.setEmpId("1");
		emp1.setSalary(3000);

		Employee emp2 = new Employee();
		emp2.setEmpName("emp2");
		emp2.setDesignation("developer");
		emp2.setEmpId("2");
		emp2.setSalary(3000);
		tempEmployees.add(emp1);
		tempEmployees.add(emp2);
		return tempEmployees;
	}

}
