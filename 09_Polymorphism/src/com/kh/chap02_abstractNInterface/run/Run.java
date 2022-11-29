package com.kh.chap02_abstractNInterface.run;

import com.kh.chap02_abstractNInterface.controller.PhoneController;

public class Run {

	public static void main(String[] args) {
		
		String[] arr2 = new PhoneController().method();
		
		
		
		for(int i = 0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
			System.out.println();
		}
		
		//for(String result : arr2){
		// system.out.println(result);
		//} // 향상된 for문처리 
	}

}
