package com.kh.chap03_sync.run;

import com.kh.chap03_sync.sync.Account;
import com.kh.chap03_sync.sync.Atm1;

public class Run2 {
	
	public static void main(String[] args) {
		//계좌, ATM 
		
		Account acc = new Account();
		Thread atm1 = new Thread(new Atm1(acc));
		Thread atm2 = new Thread(new Atm1(acc));
		
		//동기화 미설정시 동시 접속해서 잔액 오류 발생. 
		/*
		 * 메서드에 동기화처리(synchronized) 처리해주지 않은 경우 값이 마구 뒤섞임.
		 * 즉, 앞의 스레드가 실행되는 동안은 다르 스레드가 같은 자원에 접근하면 안됨.
		 */
		
		atm1.start();
		atm2.start();
		
		System.out.println("메인스레드 종료");
		
		/*
		 * 동기화란?
		 * 멀티스레딩 프로그램에서 스레드간 공유자원에 대한 처리를 말함.
		 * 공유자원에 대한 사용순서를 정해주는 것
		 * Lock을 획득한 스레드만 사용가능하다.
		 * 
		 */
	}

}
