package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {
		super();
	}
	
	public String afterToken(String str) {
		
		StringTokenizer stn = new StringTokenizer(str," ");
		
		return stn.nextToken(str);
		
	}
	public String firstCap(String input) {
		
		return input.replace(input.substring(0,1),input.substring(0,1).toUpperCase());
		
		
		
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
