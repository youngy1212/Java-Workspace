package com.kh.chap01_beforeVsafter.after.run;

import com.kh.chap01_beforeVsafter.after.model.vo.*;

public class Run {

	public static void main(String[] args) {
		//데스크탑 객체
		//brand, pCode, pName,price, allInone
		Desktop d = new Desktop("삼성","d-01","삼성데스크탑",1_500_000,true);
				
		//스마트폰 객체
		//brand, pCode, pName, price, moibleAgency
		SmartPhone s = new SmartPhone("애플","S-01","아이폰 미니13",1_400_000,"LG");
				
		//Tv객체
		//brand, pCode, pName, price, inch
		Tv t = new Tv("엘지","t-01","올레드",3_500_000,60);
		/*
		 * 실행하고자 하는 메소드가 자식클래스에 없다면, 자동을 부모클래스 메소드가 실행됨
		 * 단, 자식클래스에서 오버라이딩(메소드 재정의)가 되어있을 경우
		 * 자식클래스에 있는 오버라이딩된 메소드가 우선권을 가짐.
		 */
		System.out.println(d.infromation());
		System.out.println(s.infromation()); 
		System.out.println(t.infromation());	

		/*
		 * 상속의 장점
		 * - 보다 적은 양의 코드로 새로운 클래스들을 작성 가능
		 * - 중복된 코드를 공통적으로 관리하기 때문에 코드를 추가하거나 수정할때 용이함.
		 * => 프로그램 생산성과 유지보스에 크게 기여.
		 * 
		 * 상속의 특징 
		 * - 클래스간의 상속은 다중상속이 불가능함.(단일 상속만 가능)
		 * - 명시되어있지 않지만 모든 클래스(말그대로 모든 클래스)는 Object클래스의 후손
		 *  => Object 클래스에 있는 메소드를 쓸 수 있다.
		 *  => Object 클래스에 있는 메소드가 맘에 안들면 오버라이딩을 통해 재정의 가능하다.
		 * 
		 */
		
	}

}
