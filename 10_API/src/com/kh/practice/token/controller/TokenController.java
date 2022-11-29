package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {
		super();
	}
	
	public String afterToken(String str) {
		
		StringTokenizer stn = new StringTokenizer(str," ");
		String afterToken = "";
		
		while(stn.hasMoreTokens()) {
			afterToken += stn.nextToken();
		 }
		
		afterToken.toUpperCase();
		
		return afterToken;
		
	}
	public String firstCap(String input) {
		
		char arr[] =input.toCharArray();
		arr[0] = Character.toUpperCase(arr[0]);
		
		return String.valueOf(arr);
		
		
		
	}
	public int findChar(String input, char one) {
		
		int count=0;
		char[] arr = input.toCharArray();
		
		for(int i =0; i<arr.length; i++) {
			if(arr[i]== one) {
				count++;
			}
		}
		
		return count;
	}
	
	

}
