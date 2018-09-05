package com.employeeinfo.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.employeeinfo.data.Employee;
import com.employeeinfo.exception.InvalidEmployeeException;
import com.employeeinfo.service.EmployeeService;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/employee") // This means URL's start with /demo (after Application path)
public class EmployeeController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping(path="/add", consumes="application/json") 
	public @ResponseBody String addNewEmployee (@Valid @RequestBody EmployeeForm employeeForm) {
		logger.info("new employee: " + employeeForm);
		try {
			return employeeService.addNewEmployee(employeeForm);
		} catch (InvalidEmployeeException e) {
			logger.error("Error while add new employee: ", e);
			
			return "error while storing";
		}
	}

//	@GetMapping(path="/update") // Map ONLY GET Requests
//	public @ResponseBody String updateEmployee (@RequestParam String name, @RequestParam String email) {
//		// @ResponseBody means the returned String is the response, not a view name
//		// @RequestParam means it is a parameter from the GET or POST request
//		
//		User n = new User();
//		n.setName(name);
//		n.setEmail(email);
//		employeeRepository.save(n);
//		return "Saved";
//	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
}
