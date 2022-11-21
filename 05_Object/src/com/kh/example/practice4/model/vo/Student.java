package com.kh.example.practice4.model.vo;

public class Student {

	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	{
		grade = 1;
		classroom = 2;
		name = "김수한";
		height = 188.0;
		gender = 'M';
	} //초기화 블럭도 2개 있음. 일반 초기화. static 초기화

	public Student() {
		
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public int getGrade() {
		return grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public String getName() {
		return name;
	}
	public double getHeight() {
		return height;
	}
	public char getGender() {
		return gender;
	}
	
	public void information() {
		System.out.println("학년 "+ grade+ " 반" +classroom+" 이름 "+name+" 키 "+
	height+ " 성별 "+gender);
	}
	
	
	
	
	
	
	
}
