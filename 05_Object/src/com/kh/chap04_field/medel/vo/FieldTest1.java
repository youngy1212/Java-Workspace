package com.kh.chap04_field.medel.vo;

/*
 * 변수 
 * - 전역변수 : 클래스 영역 바로 선언하는 변수 -> 클래스 내에서면 어디서든 사용가능
 * - 지역변수 : 클래스 영역 내의 특정영역({})에 선언한 변수(선언한 영역에서만 사용가능)
 * 			ex) 메소드영역안, if문,for문 드읃ㅇ
 * 
 * 1. 전역변수(2가지로 구분됨)
 * 	-멤버변수 == 인스턴스 변수 == 필드
 * 	 생성시점 : new 연산자를 통해서 해당 객체 생성하는 순간 메모리 영역에 할당
 * 	 소멸시점 : 객체 소멸시 같이 소멸
 * 
 * 	- 클래스변수 == static변수 : static이라는 예약어가 붙어이쌴 아니냐에 다라 멤버변수냐 클래스변수냐로 구분됨.
 * 		생성시점 : 프로그램 실행과 동시에 메모리영역(static영역)에 할당
 * 		소멸시점 : 프로그램이 종료될떄 소멸
 * 
 * 2. 지역변수
 * 		생성시점 : 특정구역({}) 실행(호출)시 메모리 영역에 할당(ex 메소드 실행시)
 * 		소멸시점 : 특정구역({}) 종료시 소물(ex)메소드 종료시)
 */
//변수 선언 위치에 따른 구분(전역변수, 지역변수, 매개변수)	

public class FieldTest1 { //FieldTest1 클래스 시작
	//멤버변수(인스턴스변수)(전역변수)
	private int globla;
	
	public void test(int num) { // test 메소드의 시작
		// int num(매개변수, 지역변수)
		
		// 지역변수 (메소드 영역 내에 생성.) => 지역변수에는 접근제한자 붙이지 않음.
		// 지역변수는 항상 값을 "초기화" 시켜줘야 함.
		
		int local = 0; //public 등 다 쓸 수없음.
		
		if(true){
			int a = 0; //지역변수
		}
		
		/*
		 * 멤버변수 출력시 에러가 안나는 이유 
		 * => 해당 클래스 객체 생성시 jvm이 값을 해당필드로 자동으로 대입(초기화)시켜줬기 떄문
		 * 물론, 명시적 초기화도 가능함.
		 */
		System.out.println(globla); // 0 이라는 값이 자동으로 들어감.
		
		//매개변수 출력시 에러 안나는 이유
		// 해당 메서드(test)호출시 반드시 값을 넘겨저야 호출이 가능하기떄문에 num에는 반드시 
		//어떤 값이든 초기화 될 것. 
		System.out.println(num); 
		
		System.out.println(local);
		//System.out.println(a);//a cannot be resolved to a variable 오류
		// => if문 안에서만 사용하는 지역변수이기 떄문에 사용불가능
		
	}
	
		
}
