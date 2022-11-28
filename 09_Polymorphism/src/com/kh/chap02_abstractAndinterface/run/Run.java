package com.kh.chap02_abstractAndinterface.run;

import com.kh.chap02_abstractAndinterface.part01_basic.model.vo.*;

public class Run {

	public static void main(String[] args) {
		
		//Sports s = new Sports(); //Cannot instantiate the type Sport 
		// 추상클래스로 객체 절대 생성불가 => 미완성된 클래스이기 때문. heap영역엔 빈곳이 있을 수 없음 
		
		Sports s; // 단, 객체생성만 안될뿐 레퍼런스 변수로를 사용가능
		s = new Football();// 즉, 다형성을 적용해서 자식객체를 받아주는 용도로는 사용가능.
		
		
		Sports[] arr = new Sports[2];
		arr[0] = new Football();
		arr[1] = new Basketball();
		
		for(int i =0; i<arr.length; i++) {
			arr[i].rule(); //sports안에 있는 rule이 호출된다고 뜨나, 자식객체의 오버라이딩된게 호출됨.
		}
		/*
		 *  추상클래스
		 *  - 미완성된 클래스 abstract class
		 *  - 객체생성 불가.(단, 레퍼런스 변수로는 선언가능)
		 *  - 추상메소드가 존재하는 순간 반드시 추상클래스로 정의
		 *  (일반필드 + 일반메소드 + [추상메소드(생략가능)]
		 *  
		 *  	단, 추상메소드가 굳이 필요없어도 추상클래스로 둘 수 있음.
		 *  	언제? -> 클래스가 아직 구체적으로 덜 구현된 상태인것으로 보이는경우(개념적)
		 *  		 -> 현재 이 클래스의 객체 생성이 블가하게끔 하고자 할때(기술적)
		 *  - 객체 생성 불가
		 *  단, 레퍼런스 변수로는 사용가능(다형성 적용 가능)
		 *  
		 *  추상메소드
		 *  - 미완성된 메소드로 뭄통부 {} 가 구현되어있지 않은 메소드
		 *  - 자식클래스에서 오버라이딩을 통해 완성됨(강제로 오버라이딩 해야함)
		 *  	=> 오버라이딩 하지 않을 경우 에러 발생
		 *  	=> 메소드 사용의 통일성 확보 목적
		 *  	=> 표준화  틀을 제공할 목적 
		 */
		
		
	}

}
