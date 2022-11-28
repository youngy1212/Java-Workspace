package com.kh.chap02_abstractAndinterface.part02_family.model.vo;

public class Baby extends Person implements Basic{

	public Baby() {
		super();
	}

	public Baby(String name, double weight, int health) {
		super(name, weight, health);
	}

	@Override
	public String toString() {
		return "Baby [toString()=" + super.toString() + "]";
	}
	
	@Override
	public void eat() {
		super.setWeight(super.getWeight()+3);
		super.setHealth(super.getHealth()+1);
	}
	
	@Override
	public void sleep() {
		super.setHealth(super.getHealth()+3);
	}
	
	

}
