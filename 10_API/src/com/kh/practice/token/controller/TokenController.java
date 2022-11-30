package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {
		super();
	}
	
	public String afterToken(String str) {
		
		StringTokenizer stn = new StringTokenizer(str," ");
		String afterToken = "";
		
//		//방법 1. String 클래스 => += 지속적인경우 상수풀에 그대로 쌓여 비효율적임
//		while(stn.hasMoreTokens()) {
//			afterToken += stn.nextToken();
//		 }
//
//		return afterToken;
		
		
		//방법2. StringBiffe or StringBuilder 이용
		StringBuilder sb = new StringBuilder();
		while(stn.hasMoreTokens()) {
			sb.append(stn.nextToken());
		}
		
		return sb.toString(); // sb안에있는 문자열을 반환
		
	}
	public String firstCap(String input) {
		
//		char arr[] =input.toCharArray();
//		arr[0] = Character.toUpperCase(arr[0]);
//		
//		return String.valueOf(arr);
		
		String upper = input.substring(0,1).toUpperCase();
		return upper + input.substring(1);
		
		
		
		
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
