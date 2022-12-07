package com.kh.chap03_sync.run;

import com.kh.chap03_sync.sync.*;

public class Run {

	public static void main(String[] args) {
		
		Buffer buffer =new Buffer();
		Thread producer = new Producer(buffer); //상속 : 바로선언 가능
		Thread consumer = new Thread(new Consumer(buffer)); // 인터페이스
		
		producer.start();
		consumer.start();
		 
		//동시에 접속하니, 생산하기도 전에 소비하는 오류가 생김.
	}

}
