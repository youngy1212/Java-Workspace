package com.kh.chap01_thread.thread;

//스레드 생성 방법
/*
 * 1. Thread클래스를 상속 받는 방법.
 * 		- Thread 클래스 상속 후 run() 메소드 오버라이딩
 * 		- Thread1 객체를 생성 후 start메서드를 호출.
 */

public class Thread1 extends Thread{
	
	/*
	 * 스레드 실행시 Run메서드에서 호출됨.
	 * 따라서 작업을 하고자 하는 코드를 반드시 run메서드 안에 재정의 해줘야한다.
	 * 즉, Thread클래스 안에있는 run메서드를 재정의 해줘야 한다.
	 */
	
	@Override
	public void run() {
		// 내가 작업할 코드를 작성.
		
		for(int i =1; i<=100; i++) {
			System.out.println(getName()+"["+i+"]"); //this.getName() 스레드 안에 있어서 this 생략가능.
			// getName() : 스레드의 이름 반환, 순차적으로 Thread-0, Tread-1, 2... 이름이 붙는다.
		}
		
	}
	
	
	

}
