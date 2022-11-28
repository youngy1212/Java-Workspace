package com.kh.chap02_abstractNInterface.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay {

	private String maker;

	public SmartPhone() {
		super();
	}
	
	public String printInformation() {
		return "smartPhoe";
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	
	
	
	
	
	
	
}
