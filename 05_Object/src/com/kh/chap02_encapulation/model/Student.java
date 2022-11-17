package com.kh.chap02_encapulation.model;

//스프링에서 객체는 모두 model에서 관리됨.

public class Student {
	// 필드부
	/*
	 *  필드 == 멤버변수 == 인스턴스 변수 
	 *  
	 *  접근제한자 [예약어] 자료형 필드명; 
	 */
	
	private String name; 
	private int age; 
	private double height; //<<접근 금지!>
	
	
	//생성자부
	
	
	//메소드부
	/*
	 * 각 기능을 구현하는 부분
	 * 
	 * 접근제한자 반환형 메소드명([매개변수]){
	 *  	//기능 구현
	 * }
	 */
	// setter -> setXXX, setXXX 
	// 해당 필드에 대입하고자 하는 값을 전달받아 해당필드에 대입시켜주는 기능의 메소드
	// 이 때, 이 메소드는 접근 가능하도록 해야하기 떄문에 public 접근 제한자를 사용
	
	// 이름값을 기록 및 수정할 수 있는 기능의 메소드(name필드에 값을 넣기 위한 용도)
	// set+필드명 => 두 단어를 이어줄때 카멀케이스 (낙타등 표기법)활용하여 메서드명 선언
	public void setName(String name) { //지역변수 메소드안에서만 사용
		//매개변수 : 해당 메소드 호출시 전달되는 값을 받아주기 위한 변수
		
		//name = name; 
		//매개변수name = 매개변수 name을 대입하는 형식임.
		//왜? 필드명과 매개변수명이 동일한 경우{} 영역 내에서는 해당영역에서 만들어진 변수가 좀더 우선순위가 높아서 그럼.
		//객체의 name에 접근하려면 this를 사용해야함.
		//this에는 생성된 객체의 " 주소값"이 담겨있음.
		
		this.name = name; // 주소값.name -> 얻어온 name값을 저장한다.
	}
	
	//나이값을 기록 및 수정할 수 있는 기능의 메소드 (age 필드에 값을 대입하기 위한 용도)
	public void setAge(int age) {
		this.age = age;
	}
	
	//키값을 기록 및 수정할 수 있는 기능의 메소드(height 필드에 값을 대입하기 위한 용도)
	public void setHeigh(double height) {
		this.height = height;
	}
	// getter
	// 데이터를 반환해주는 기능의 메소드 : getter 메소드
	// name 필드에 담긴 값을 돌려주는 용도의 메소드
	// get + 필드명 (카멀케이스적용)
	public String getName() { //void는 반환하는 값이 없는 경우에 작성
							// getter에는 무조건 return 반환 메서드가 있어야함. 
		return name; // return 반환값; -> 반환 값을 나를 호출한 메서드의 위치에 전달하겠다.
	}
	
	//age 필드에 담긴 값을 돌려주는 용도의 메소드
	public int getAge() {
		return age;
	}
	
	public double getHeight() {
		return height;
	}
	
	//모든 필드값을 하나의 문자열로 합쳐서 돌려주는 용도의 메소드
	public String information() {
		//XXX님의 나이는 XX살이고 키는 XX입니다.
		return name +"님의 나이는 "+age+"살이고 키는 "+height+"입니다.";
	}
	
	
}
