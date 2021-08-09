package com.example.demo.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ServiceManager;
import com.example.demo.vo.Student;

@RestController
public class MyController extends BaseController {
	
	@Autowired
	@Qualifier("ServiceManager")
	private ServiceManager service;
	
	@PutMapping(value="/student",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Student>> addStudent(@RequestBody Student stud)
	{
		service.persitStudent(stud);
		return new ResponseEntity<List<Student>>(service.fetchAllStud(),HttpStatus.OK);
		
	}
	
	@PostMapping(value="/student",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Student>> updateStudent(@RequestBody Student stud)
	{
		service.persitStudent(stud);
		return new ResponseEntity<List<Student>>(service.fetchAllStud(),HttpStatus.CREATED);
		
	}
	@GetMapping(value="/studentadd",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Student>> getStudent(@RequestBody Student stud)
	{
		service.persitStudent(stud);
		return new ResponseEntity<List<Student>>(service.fetchAllStud(),HttpStatus.OK);
		
	}
	@GetMapping(value="/studentadd1",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Student>> getCustomer(@RequestBody Student cust)
    {
        return new ResponseEntity<List<Student>>(service.fetchAllStud(),HttpStatus.OK);
    }
	
	@GetMapping(value="/names", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<String>> getName()
	{
		return new ResponseEntity<List<String>>(service.getName(),HttpStatus.OK);
	}

	

	
	}
