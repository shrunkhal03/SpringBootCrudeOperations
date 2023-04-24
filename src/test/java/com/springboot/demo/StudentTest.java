package com.springboot.demo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.springboot.demo.entity.Students;
import com.springboot.demo.repository.StudentRepo;
import com.springboot.demo.serviseimple.StudentServiceImple;

@RunWith(MockitoJUnitRunner.class)

@SpringBootTest
class StudentTest {

	
	@InjectMocks
	StudentServiceImple studentService;
	@Mock
	StudentRepo studentRepo;
	
	
	
	@Test
	public void getAllStudents(){
	List<Students>list = new ArrayList();
	
	list.add(new Students(1,"shubham", "talkhande", "nagpur"));
	list.add(new Students(2,"Shrikang", "hirudkar", "nagpur"));
	list.add(new Students(3,"Shrunkhal", "Pimpalshende", "nagpur"));

	
	when(studentRepo.findAll()).thenReturn(list);
	List<Students>stulist=studentService.getAllStudents();
	assertEquals(list,stulist);
	}

}
