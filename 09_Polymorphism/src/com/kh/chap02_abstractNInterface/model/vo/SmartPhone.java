package com.kh.chap02_abstractNInterface.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay {

	private String maker;

	public SmartPhone() {
		super();
	}
	
	public abstract String printInformation(); // 글꼴이 기울어져있음. 추상메소드

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	
	
	
	
	
	
	
}
