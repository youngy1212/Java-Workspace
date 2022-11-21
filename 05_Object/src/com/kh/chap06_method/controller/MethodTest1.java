package com.kh.chap06_method.controller;

public class MethodTest1 {
	/*
	 * 메소드
	 * [표현법]
	 * 접근제한자 예약어(생락가능) 반환할 값의 자료형 메소드명([매개변수]){
	 * 		수행할 코드;
	 * 		
	 * 		return 반환할 값; (반환형이 void일 경우 생략가능)
	 * }
	 * 메소드를 정의한 후 항상 원하는만큼 호출해서 사용할 수 있음.
	 * 
	 */
	//1. 매개변수가 없고 반환값도 없는 메소드
	public void method1() {
		System.out.println("매개변수와 반환값이 둘 다 없는 메소드입니다.");
		
		//return; JVM이 자동생성해줌. 정상적으로 종료.
	}
	//2. 매개변수가 없고, 반환값은 있는 메소드.
	public int method2() {
		System.out.println("매개변수가 없고, 반환값은 있는 메소드입니다.");
		
		//1부터 100까지 랜덤값을 발생시키고, 돌려주는 메소드
		//int random = (int)(Math.random()*100+1);
		
		return (int)(Math.random()*100+1); 
	}
	
	//3. 매개변수가 있고 반환값은 없는 메소드.
	public void method3(int num1, int num2) {
		System.out.println("매개변수는 있고 반환값은 없는 메소드입니다.");
		//num1과 num2 값을 비교하여, 결과를 출력하는 메서드
		// 최소값 : xx
		// 최대값 : xx
		
		int min = 0; // 두 수 중에 작은값을 보관
		int max = 0;// 두 수 중에 큰 값을 보관
		
		if(num1> num2) {
			min = num2;
			max = num1;
		}else {
			min = num1;
			max = num2;
		}
		System.out.println("최소값 : "+min);
		System.out.println("최대값 : "+max);
	
	}
	//4. 매개변수도 있고, 반환값도 있는 메소드
	public int method4(int a, int b) {
		System.out.println("매개변수 있습니다, 반환값도 있습니다.");
		
		return a*b;
	}
}
