package com.KH.third.run;

import com.KH.third.MethodTest; //외부메서드 불러옴

public class Run {
	
	public static void main(String[] args) {
		//1. 사용하고자 하는 클래스 임포트
		MethodTest mt = new MethodTest();
		
		//2. 내가 실행하고자하는 일반 메소드 실행
		mt.printMethodA();
		
		System.out.println("메인메서드 종료");
	}

}
