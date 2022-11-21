package com.kh.chap06_method.run;

import com.kh.chap06_method.controller.*;

public class Run {

	public static void main(String[] args) {

		MethodTest1 mt = new MethodTest1();
		mt.method1();
		
		int random = mt.method2(); // 반환 값을 int형으로 대입도 가능 왼쪽 오른쪽 자료형이 동일하면 됨.
		System.out.println("랜덤값:"+mt.method2());

		mt.method3(60, 15);
		
		System.out.println(mt.method4(42, 5));
		
		System.out.println("=================================");
		//static메소드의 경우 new문으로 객체를 생성할 필요가 없다.
		//static이 붙은 클래스 변수와 마찬가지로, 메소드 또한 프로그램 실행식 정적 메모리영역(static)에 저장되기 때문
		MethodTest2.mehod1(); 
		
		System.out.println(MethodTest2.method2());
		
		MethodTest2.method3("김수한",33); // 김수한 33 160.3 하고싶다. 오류// 자료 수 + 순서를 맞춰야함
		
		System.out.println(MethodTest2.method4(100));
	}

}
