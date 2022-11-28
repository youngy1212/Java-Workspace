package com.kh.chap02_abstractAndinterface.part02_family.model.vo;

public class Mother extends Person implements Basic {

	private String babyBirth; // 아기 탄생여부: 출산,입양,없음.

	public Mother() {
		super();
	}

	public Mother(String name, double weight, int health,String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}

	public String getBabyBirth() {
		return babyBirth;
	}

	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}

	@Override
	public String toString() {
		return "Mother [babyBirth=" + babyBirth + ", toString()=" + super.toString() + "]";
	}

	
	@Override
	public void eat() {
		// 밥을 먹으면 몸무게 10++ // 건강 10--
		super.setWeight(super.getWeight()+10); // 수정할 몸무게 == 기존의몸무게 + 10;
		super.setHealth(super.getHealth()-10);
	}
	
	@Override
	public void sleep() {
		super.setHealth(super.getHealth()+10);
		super.setWeight(super.getHealth()+10); // 궁금쓰...되네?
		
	}
}
