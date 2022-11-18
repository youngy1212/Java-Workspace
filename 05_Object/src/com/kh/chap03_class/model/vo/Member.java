package com.kh.chap03_class.model.vo;

public class Member {
	
	private String memberld;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	//+changeName(name : String) :void
	public void changeName(String name) {
		memberName = name;
	}
	//+ printName() : void
	public void printName() {
		System.out.println("이름은 : "+memberName);
	}
	
	//위까지 문제내역
	
	public void setMemberld(String memberld) {
		this.memberld = memberld;
	}
	
	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getMemberld() {
		return memberld;
	}
	public String getMemberPwd() {
		return memberPwd;
	}
	public String getMemberName() {
		return memberName;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	

}
