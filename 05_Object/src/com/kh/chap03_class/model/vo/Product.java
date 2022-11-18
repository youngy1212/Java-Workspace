package com.kh.chap03_class.model.vo;

public class Product { 
	// 클래스 선언 구분에 사용이 가능한 접근제한자 : public , default(없는것)
	// public 으로 해야 다른 패키지에서 접근가능
	// default로 설정한 경우 같은 패키지에서만 접근 가능/ 다른패키지 접근 불가
	
	// 상품명, 상품가격, 브랜드
	private String pName;
	private int price;
	private String brand ="애플"; // 기본값을 애플로 넣어줌
	
	//setter 메서드 3개
	
	public void setpName(String pName) { //카멜케이스긴한데, PN바로 대문자가 나오면 특이케이스로 p로 사용
		this.pName = pName; 
	}
	public void setPrice(int price) {
		this.price = price; //int price 는 매개변수이자, 지역변수임.
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	//getter 메서드 3개
	public String getpName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}
	
	//모든 필드값을 하나의 문자열로 합쳐서 반환해주는 information메소드 
	public String information() {
		return brand +"의 "+ pName + "의 가격은 " +price+"원";
	}
}
