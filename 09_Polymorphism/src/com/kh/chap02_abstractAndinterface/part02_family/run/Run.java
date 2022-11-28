package com.kh.chap02_abstractAndinterface.part02_family.run;

import com.kh.chap02_abstractAndinterface.part02_family.model.vo.*;

public class Run {

	public static void main(String[] args) {
		//인터페이스 적용 전.
//		//person p = new person(); -> 오류
//		Person p1 = new Mother("가나라",74,60,"출산");
//		Person p2 = new Baby("가애기",3.5,60);
//		
//		System.out.println(p1);
//		System.out.println(p2);
//		
//		p1.eat();
//		p2.eat();
//		p1.sleep();
//		p2.sleep();
//		
//		System.out.println(p1);
//		System.out.println(p2);
		
		//인터페이스 적용 후
		//Basic b1= new Basic();
		Basic b1 = new Mother("가나라",74,60,"출산");
		Basic b2 = new Baby("가아기",4.5,70);
		
		System.out.println(b1);
		System.out.println(b2);
		
		b1.eat();
		b2.eat();
		b1.sleep();
		b2.sleep();
		
		System.out.println(b1);
		System.out.println(b2);
		
		
		/*
		 * 클래스에서 클래스 상속 받을 때 : extends 클래스 (단일상속만 가능) : 화살표 실선
		 * 클래스에서 인터페이스 구현할때 : implements 인터페이스, 인터페이스(다중구현) : 화살표 점선
		 * 인터페이스에서 인터페이스 상속 : extends 인터페이스, 인터페이스(다중상속가능): 화살표 점선
		 * 
		 * 			| 추상클래스 				| 인터페이스
		 * =================================================================
		 * 	상속개수 	| 단일상속 				| 다중상속
		 * -----------------------------------------------------------------
		 *  키워드 	| extends 				| implements
		 * -----------------------------------------------------------------
		 * 	추상메소드	| 추상메소드 0개 이상		| 모든메소드가 추상메소드
		 * 	표현법/갯수| 명시적 abstract 기술해야함 | 묵시적으로 abstract기술(생략가능)
		 * -----------------------------------------------------------------
		 * 일반메소드여부| O					| x
		 * -----------------------------------------------------------------
		 * 	필드 		| 일반필드 가질수 있음		| 상수필드만 가질수 있음(묵시적 public abstract final)
		 * 
		 *  배운순서
		 *  extends 일반클래스 -> extends 추상클래스 --> implements 인터페이스
		 *  ----------------------------------------------------------->
		 *  				뒤로 갈수록 강제성이 더 짙어짐 
		 */
	}

}
