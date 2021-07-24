package com.project.controller2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class EmployeeController
{
	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public ResponseEntity<String> saveEmployeeInformation(@RequestBody Employee employee)
	{
		return ResponseEntity.ok("employee added succesfully");
	}
	
}
