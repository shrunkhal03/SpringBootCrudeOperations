package com.springboot.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Students {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int rollNo;
	String name;
	String sname;
	String city;
	public int getRollNo() {
		return rollNo;
	}
	
	 public Students(){
		
	}
	@Override
	public String toString() {
		return "Students [rollNo=" + rollNo + ", name=" + name + ", sname=" + sname + ", city=" + city + "]";
	}
	public Students(int rollNo, String name, String sname, String city) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.sname = sname;
		this.city = city;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
