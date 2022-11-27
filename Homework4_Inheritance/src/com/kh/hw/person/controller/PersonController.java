package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.*;

public class PersonController {

	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	public int[] personCount() {
		
		int stcount = 0;
		int emcount = 0;
		int personCount[] = new int[2];
		
		for(int i = 0; i< s.length; i++)
			if (s[i] != null) {
				stcount++;
			}
		
		for(int i = 0; i< e.length; i++)
			if (e[i] != null) {
				emcount++;
			}
		
		personCount[0] = stcount;
		personCount[1] = emcount;
		
		return personCount;
		
	}
	
	public void insertStudent(String name, int age, double height, double weight,int grade, String major) {
		s[personCount()[0]] = new Student(name, age,height,weight,grade,major);
	}
	
	public Student[] printStudent() {
		Student[] pr = new Student[3];
		pr = s;
		
		return pr;
		
	}
	
	public void insertEmployee(String name, int age, double height, double weight,int salary, String dept) {
		e[personCount()[1]] = new Employee(name, age,height,weight,salary,dept);
	}
	
	public Employee[] printEmployee() {
		Employee[] er = new Employee[10];
		er = e;
		return er;
	}
	
	
 
	
}
