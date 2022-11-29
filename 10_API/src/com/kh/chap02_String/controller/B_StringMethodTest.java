package com.kh.chap02_String.controller;

public class B_StringMethodTest {
	
	//문자열과 관련된 메소드
	public void method() {
		
		String str1 = "Hello World";
		
		//1. 문자열.charAt(int index) : char
		// 	 문자열에서 전달받은 indext의 위치에 있는 문자 하나만 뽑아서 리턴
		char ch = str1.charAt(3);
		System.out.println("ch : "+ch);
		
		//2. 문자열.concat(String str) : String
		// 문자열과 전달된 또다른 문자열을 하나로 합쳐서 리턴
		String str2 = str1.concat("!!!");
		System.out.println(str2);
		String str3 = str1+"!!!";
		String n = new StringBuilder("Hello").append("world").append("!!!").toString();
		
		//3. 문자열.length() : int
		// 	문자열 길이 반환
		str1.length();
		
		//4.문자열.substring(int beginIndex) : String
		// 	=> 문자열의 beginIndex 위치에서 부터 끝까지 문자열을 추출해서 리턴
		//	문자열.substring(int beginIndex, int endIndex) : String
		//	=> 문자열의 beginIndext 위치에서부터 exdIndex -1 까지의 문자열을 추출해서 리턴
		System.out.println(str1.substring(6)); //World
		System.out.println(str1.substring(0,7)); //Hello W 0~6까지(7글자 공백포함)
		
		// 5.문자열.replace(char old, char new0 : String
		//	=> 현재 문자열에서 old문자를 new 문자로 대체(replace) 하고 변환한 문자열을 리턴
		String Str3 = str1.replace('l', 'L'); // 변경된걸 담아줘야함.
		
		System.out.println(Str3);
		System.out.println(str1); // 이모든 함수는 원본은 변경되지 않음.
		
		//6. 문자열.trim() : String 
		//	-> 문자열의 앞 뒤 공백을 제거한 문자열 리턴
		String str4 = "                         j a v a   ";
		System.out.println(str4);
		System.out.println(str4.trim()); // 앞 뒤 공백은 제거. 문자 사이사이 공백은 제거X
		
		//7. 문자열.toUpperCase() : String
		// 	=> 문자열을 모두 다 대문자로 변경 후 문자열 리턴(영문자)
		//   문자열.toLowerCase() : String 
		//	=> 문자열을 모두 다 소문자로 변경 후 문자열 리턴
		System.out.println("upper : "+str1.toUpperCase());
		System.out.println("lower : "+str1.toLowerCase());
		
		//8. 문자열.toCharArray() : char[]
		//	=> 문자열의 각 문자들을 char[]배열에 옮겨 담은 후 해당 배열을 리턴
		char[] arr = str1.toCharArray();
		System.out.println(arr[0]);
		
		//9. string.valueOf(char[] data) : string
		System.out.println(String.valueOf(arr));
		System.out.println(String.valueOf(11111111.342));
		
	}

}
