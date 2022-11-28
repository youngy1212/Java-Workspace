package com.kh.chap02_abstractNInterface.run;

import com.kh.chap02_abstractNInterface.controller.PhoneController;

public class Run {

	public static void main(String[] args) {
		
		PhoneController pc = new PhoneController();
		String [] arr2 = new String[2];
		arr2[0] = pc.method()[0];
		arr2[1] = pc.method()[1];
		
		for(int i = 0; i<pc.method().length; i++) {
			System.out.println(arr2[i]);
			System.out.println();
		}
	}

}
