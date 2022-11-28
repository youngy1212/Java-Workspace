package com.kh.chap02_abstractAndinterface.part01_basic.model.vo;

public class Basketball extends Sports {//The type Basketball must implement the inherited abstract method Sports.rule()
										// 추상메서드 꼭 구현해~
	 //미완성인 클래시인 추성클래스를 상속받게 되면, 부모 클래스에 있는 추상메소드를 강제로 오버라이딩 해서 완성시켜야함.
	@Override
	public void rule() {
		System.out.println("손으로 공은 던져 링에 넣음.");
	}
	
	

}
