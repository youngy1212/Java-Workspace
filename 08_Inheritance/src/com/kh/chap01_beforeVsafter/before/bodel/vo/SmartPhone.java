package com.kh.chap01_beforeVsafter.before.bodel.vo;

public class SmartPhone {
		private String brand;
		private String pCode;
		private String pName;
		private int price;
		private String mobleAgenct;
		

	public SmartPhone() {
		
	}
	
	public SmartPhone(String brand,String pCode,String pName,int price,String mobleAgenct) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.mobleAgenct = mobleAgenct;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}	
	public void setpName(String pName) {
		this.pName = pName;
	}	
	public void setPrice(int price) {
		this.price = price;
	}	
	
	public void setMobleAgenct(String mobleAgenct) {
		this.mobleAgenct = mobleAgenct;
	}
	
	public String getBrand() {
		return brand;
	}
	public String getpCode() {
		return pCode;
	}
	public String getpName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public String getMbleAgenct() {
		return mobleAgenct;
	}
	public String infromation() {
		return brand+", "+ pCode +", "+ pName +", "+ price +", "+ mobleAgenct;
	}
}	
