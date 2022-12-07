package com.kh.chap03_sync.sync;

//1개의 계좌
//2개의 ATM기

public class Account {

	private int balance = 1200;
	
	
	public int getBalance() {
		return balance;
	}
	
	//출금 메서드
	
	public void withdraw(int money) {
		synchronized(this) { //계좌정보 객체(this) 
			String thName = Thread.currentThread().getName();
			System.out.println("현재 잔액은 ?"+balance);
			
			if(money <= balance) {
				balance -= money;
				System.out.printf("[%s] %d원 출금 >>> 잔액 : %d원 남았습니다.\n", thName ,money,balance);
			}else {
				System.out.printf("[%s] %d원 출금시도 >>> 잔액이 부족합니다.\n",thName,money);
			}
		}
	}
	
}


//synchronized() {안에 넣어서 synchronized 가능}