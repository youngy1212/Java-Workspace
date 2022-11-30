package com.kh.exception.controller;

import java.io.*;

public class B_CheckedException {
	/*
	 * CheckedException 은 반다시 예외처리를 해줘야 되는 예외들
	 * (즉, 예측 불가능한 곳에서 발생하기 떄문에 미리 예외처리 구문을 작성해야함.)
	 * => 주로 외부매체와 어떤 입출력 시 발생
	 */
	
	public void method1() throws IOException {
		method2();
	}
	public void method2() throws IOException {
		//Scanner와 같이 키보드로 값을 입력받을 수 있는 객체(단, 문자열만)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("아무 문자나 입력해주세요.");
		
//		// 1. try~ catch문 : 여기서 바로 예외처리
//		try {
//			String str = br.readLine(); //Unhandled exception type IOException 예외처리 안했어. 
//			System.out.println("문자열의 길이 : "+ str.length());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//2. throws : 지금 현재 메소드에서 예외를 처리하지 않고, 현재 이 메소드를 호출한 곳(method1)로 떠넘기겠다.
		String str = br.readLine();
		System.out.println("문자열의 길이 : "+str.length());
		
	}
	/*						예외 발생 시점
	 * RuntiemException		프로그램 실행 시 => 런타임 에러(컴파일 에러 X)
	 * IOException			그 외 		 => 컴파일 에러
	 * 
	 */

}
