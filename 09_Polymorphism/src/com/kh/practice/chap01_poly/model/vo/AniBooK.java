package com.kh.practice.chap01_poly.model.vo;

public class AniBooK extends Book {
	private int accessAge;

	public AniBooK() {
		super();
	}

	public AniBooK(String title, String author, String publisher,int accessAge) {
		super(title, author, publisher);
		this.accessAge = accessAge;
	}
	
	public int getAccessAge() {
		return accessAge;
	}

	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}

	@Override
	public String toString() {
		return "AniBooK [accessAge=" + accessAge + ", toString()=" + super.toString() + "]";
	}
	
}
