package com.kh.chap04_field.medel.vo;

public class Test {

	public static void main(String[] args) {
		FieldTest2 f2 = new FieldTest2();
		
		//public -> 어디서든 직접 적근 가능
		System.out.println(f2.pub);
		
		//protected => 같은패키지에서는 직접접근 가능.
		//다른 패키지에서는 직접접근 불가
		System.out.println(f2.pro); 
		
		//default => 같은 패키지에서만 직접접근가능
		System.out.print(f2.df); 
		
		//System.out.println(f2.pri);// 접근불가능!
		
	}

}
