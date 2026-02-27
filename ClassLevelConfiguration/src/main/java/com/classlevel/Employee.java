package com.classlevel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Employee {
	@Value("10")
	private int id;
	@Value("Palak")
	private String name;
	@Value("238933")
	private double salary;
	//internally java reflection api breaks the rules of java
	@Autowired
	private List<String> list;
	
	
	
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Autowired
	private Map<String,Integer> m;



	public Map<String, Integer> getM() {
		return m;
	}
	public void setM(Map<String, Integer> m) {
		this.m = m;
	}
	
	
	

}
