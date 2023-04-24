package com.springboot.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.demo.entity.Students;
@Repository
public interface StudentRepo extends CrudRepository<Students,Integer> {

	
	
//public Students getStudentsrollNo(Integer rollNO);

	
@Query(value="select * from Students where name=?" ,nativeQuery =true)
public List<Students> getStudentsByName(String name);


}

 