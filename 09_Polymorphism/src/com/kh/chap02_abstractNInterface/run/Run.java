package com.kh.chap02_abstractNInterface.run;

import com.kh.chap02_abstractNInterface.controller.PhoneController;

public class Run {

	public static void main(String[] args) {
		
		PhoneController pc = new PhoneController();
		pc.method();
		
		String[] pcc = new String[2];
		
		for(int i = 0; i<pcc.length; i++) {
			System.out.println(pcc);
		}
	}

}
