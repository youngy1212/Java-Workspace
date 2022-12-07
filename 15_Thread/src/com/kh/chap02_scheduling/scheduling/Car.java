package com.kh.chap02_scheduling.scheduling;


public class Car implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
		for(int i = 0; i<20; i++) {
			try {	
				System.out.println("Car driving..");
			
				// 스레드를 지정한 시간(ms)만큼 지연시키는(일시정지시키는) 메서드
				Thread.sleep(100); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
	}
	
	
	//InterruptedException e
	// sleep, wait 된 상태에서 영원이 block 된다면 스레드는 영원히 runnable 상태가 되기를 기다리게됨 
	// 하지만,  JVM은 영원히 기다리지 않고, block 된 스레드를 interrupt 후 InterruptedException을 발생시킴.
	
	
	
	
}
