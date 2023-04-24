package com.springboot.demo.servise;

import java.util.List;

import com.springboot.demo.entity.Students;

public interface StudentService {
	
	
	public Students saveStudents(Students student) ;
	
	//public Students getStudentsByrollNo(Integer rollNo);
	public List<Students> getAllStudents();
	public void deleteById(Integer id);
	
	public List<Students>getStudentsByName(String name );
		
	

}
