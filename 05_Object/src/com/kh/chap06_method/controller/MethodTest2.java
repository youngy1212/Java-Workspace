package com.kh.chap06_method.controller;

public class MethodTest2 {
	static int count=80;
	int count2 = 0;
	
	/*
	 * static 메소드 
	 * [표현법] 
	 * 접근제한자 static 예약어 반환형 메소드명(매개변수) {
	 * 	수행내용
	 * 	return 반환값;
	 * }
	 * 
	 * - 호출시 객체 생성할 필요가 없음
	 * - 프로그램 시작시 정적 메모르 영역에 메소드가 저장되어 있을 것이기 때문에 
	 * - 클래스명.메소드명(전달값); 으로 호출가능
	 * - 예약어, 매개변수, return은 생략가능함.
	 * 
	 */
	
	public static void mehod1() {
		System.out.println("매개변수와 반환값이 없는 메소드입니다.");
	}
	
	public static String method2() {
		return "매개변수는 없고, 반환값은 있는 메소드입니다.";
	}
	public static void method3(String name, int age) {
		System.out.println(age+"살의 "+name+"님 환영합니다.");
	}

	public static int method4(int num1) {
	
		//return num1*count2; // Cannot make a static reference to the non-static field count2 
		/*
		 * static 메서드 안에서는 static이 아닌 field멤버가 접근이 불가능함.
		 * static 메서드는 프로그램 시작시 정적메모리영역에 들어가게 되는데
		 * 이떄 static 으로 선언된 필드(전역변수)도 함께 정적메모리 영역에 들어간다.
		 * 하지만 static 으로 선언되지 않은 전역변수는 static 메모리에 올리가는 시점에 사용이 불가능 하므로 에러가 발생함.
		 * 					
		 */
		//static 메서드 안에는 static 필드만 사용이 가능하다.
		return num1*count;
	}
	
}
