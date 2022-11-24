package com.kh.chap01_beforeVsafter.before.run;

import com.kh.chap01_beforeVsafter.before.bodel.vo.*;

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
		
		//System.out.println(d); //Desktop@7637f22 주소값
		System.out.println(d.infromation());
		System.out.println(s.infromation()); 
		System.out.println(t.infromation());	

		/*
		 * 매 클래스마다 중복된 코드들을 일일이 기술해두게 되면
		 * 수정과 같은 유지보수시 매번 일일이 찾아서 수정해야하는 번거로움이 생김
		 * ex) 필드명 수정, 새로운 필드 추가시
		 * 
		 * 상속이라는 개념을 적용시켜 매 클래스마다 " 중복된" 필드, 메소드들을
		 * 단한번 또하나의 클래스(부모클래스)에 정의해둔후
		 * 해당클래스를 상속받아서 부모클래스의 필드와 메소드를 가져다 쓰는 방식으로
		 * 코드의 중복을 피해야한다.
		 */
	}

}
