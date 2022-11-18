package com.kh.chap04_field.medel.vo;

public class FieldTest2 {

	/*
	 * (+)public => 어디서든(같은 패키지, 다른 패키지 모두) 접근 가능
	 * (#)protected => 같은 패키지면 무조건 접근가능, 다른패키지면 "상속"구조인 클래스에서만 접근 가능
	 * (~)(default) => 오로지 같은 패키지 안에서만 접근가능, 생략시
	 * (-)private => 오직 해당클래스에서만 접근 가능.
	 * 
	 * 위에서 아래로 내려갈수록 접근할 수 있는 범위가 좁아진다.
	 * +, #, ~ , - : 클래스다이어그램 표기법
	 */
	
	public String pub = "public";
	protected String pro = "protected";
	String df = "default";
	private String pri = "private";
			
	public static String sta = "FieldTest2";
	
}
