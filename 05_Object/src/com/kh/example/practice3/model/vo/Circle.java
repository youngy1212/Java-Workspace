package com.kh.example.practice3.model.vo;

public class Circle {
	//필드부
	private static final double PI= 3.14;
	private int radius = 1;
	
	{
		// 필드 부아래에 그냥 {} 넣을 수 있음. 초기화 블럭 
		// radius = 5; 초기화 가능~.  //거의 사용안함 
	}
	
	//생성자부
	public Circle() { //기본생성자
		//getAreaOfCircle();
		//getSizeOfCircle(); 여기 넣으면 시작과 동시에 출력 ^^  
	}
	
	//메서드부
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	// 근데 문제 자체는 get set 사용 안함.
	
	public void incrementRadius() {
		radius++;
		getAreaOfCircle();
		getSizeOfCircle(); // 증가하면 한번에 출력까지 
		
		
	}
	//원의 둘레 
	public void getAreaOfCircle() {
		System.out.println(radius*2*PI);
	}
	//원의 넓이 
	public void getSizeOfCircle() {
		System.out.println(radius*radius*PI);
	}
	
	
}
