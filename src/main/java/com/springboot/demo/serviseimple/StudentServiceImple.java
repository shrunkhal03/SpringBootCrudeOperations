package com.springboot.demo.serviseimple;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.demo.entity.Students;
import com.springboot.demo.repository.StudentRepo;
import com.springboot.demo.servise.StudentService;
@Service
public class StudentServiceImple implements StudentService {

	@Autowired
	private StudentRepo stdRepo;
	
	@Override
	public Students saveStudents(Students student) {
		
		return stdRepo.save(student);
	}

	/*@Override
	public Students getStudentsByrollNo(Integer rollNo) {
		Students std =stdRepo.getStudentsrollNo(rollNo);
		return std;
	}*/
 
	
	public List<Students> getAllStudents(){
		 List<Students> list =(List<Students>) stdRepo.findAll();
		return list;
	}

	@Override
	public void deleteById(Integer id) {
	stdRepo.deleteById(id);
		 
	}

	@Override
	public List<Students> getStudentsByName(String name) {
		List<Students> list =stdRepo.getStudentsByName(name);
		return list;
	}
}
