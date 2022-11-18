package com.kh.chap04_field.run;

//import java.lang.*;//The import java.lang is never used => import하지않아도 사용가능

import com.kh.chap04_field.medel.vo.*;

public class Run {
	
	public static void main(String[] args) {
		
		FieldTest1 f1 = new FieldTest1(); //객체 생성시 global 전역변수가 할당
		
		f1.test(109); //test메소드 호출시 num, local 변수 할당
					// text메소드 종료시 num, local 변수 소멸
		f1 = null; //객체 소멸시 global 멤버변수 소멸
		
	
		//FieldTest2 f2 = new FieldTest2();
		
		//public -> 어디서든 직접 적근 가능
		//System.out.println(f2.pub);
		
		//protected => 같은패키지에서는 직접접근 가능.
		//다른 패키지에서는 직접접근 불가
		//System.out.println(f2.pro); // pro 접근불가능!
		
		//default => 같은 패키지에서만 직접접근가능
		//System.out.print(f2.df); // 접근불가능
		
		//System.out.println(f2.pri);// 접근불가능!
		
		System.out.println(FieldTest2.sta); // sta는 ststic 지역변수라 f2 new 선언하지 않아도
		// 사용가능 but 어디에있는 sta인지 fieldTest2위치를 표기해줘야함.
		
		System.out.println(Math.PI);
		
		FieldTest3.num = 500;
		System.out.println(FieldTest3.num);
		
		// 상수필드 출력
		System.out.println(FieldTest3.NUM);
		// FieldTest3.NUM = 99; //The final field FieldTest3.NUM cannot be assigned
		// => 값 변경 불가.
		
		FieldTest3.test();
		
	}

}
