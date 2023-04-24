package com.springboot.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.entity.Students;
import com.springboot.demo.servise.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private StudentService stdService;

	@PostMapping("/save")
	public ResponseEntity<Students> saveStudents( @RequestBody Students student){
		Students std =stdService.saveStudents(student);
		return ResponseEntity.ok().body(std);
	
	}
	
	/*@GetMapping("/getStdRollNo{rollNO}")
	public Students getstdRollNo(int rollNo) {
		
		Students std =stdService.getStudentsByrollNo(rollNo);
		return std;*/
	
	@GetMapping("/getAllStudents")
	public List<Students> getAllStudents(){
		List<Students>list=stdService.getAllStudents();
		return list;
	}
	@DeleteMapping("/delete/{id}")
	public void deleteById( @PathVariable Integer id) {
		stdService.deleteById(id);
	}
	
	@GetMapping("/allStudents/{name}")
	public List<Students>getStudentsByName(@PathVariable String name){
		
		List<Students> list =stdService.getStudentsByName(name);
		return list;
	
	
	}
	}

