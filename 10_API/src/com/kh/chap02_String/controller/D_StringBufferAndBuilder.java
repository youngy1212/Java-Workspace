package com.kh.chap02_String.controller;

public class D_StringBufferAndBuilder {
	/*
	 * String은 불변 클래스,
	 * StringBuffer과 StringBuilder은 mutable클래스
	 * 
	 * 	문자열 연산이 빈번하게 일어나는 알고리즘에서 발생하는 메모리이슈를 해결하기 위해 나온 클래스
	 * 	
	 * 	기본적으로 두개의 클래스는 동일한 메소드를 지니며 차이점은 동기화(쓰레드safe)여부.
	 * 	
     *  StringBuffer는 멀티 스레드 환경에서 유용하며
     *  StringBuilde는 단일 스레드 환경에서 유용함. 
	 */
	
	public void method() {
		String str = "hello";
		str += "world";
		
		StringBuffer sb = new StringBuffer("hello");
		sb.append("world,");
		
		StringBuilder sb2 = new StringBuilder("hello");
		sb2.append("world");
		
		System.out.println(sb);
		System.out.println(sb2);
		
		
		//String fileName = "Test.txt" // . 위치로 이름과 확장자 구분 등등
		System.out.println(sb.length());
		System.out.println("o의 마지막위치는 : "+sb.lastIndexOf("o"));
		
		//마지막위치(원하는 위치)의 문자를 없애는 메서드
		//마지막위치 -> 문자열의 길이 -1
		sb.deleteCharAt(sb.length() -1);
		
		System.out.println(sb);
		
		// 내가 원하는 위치의 인덱스부터 마지막인덱스까지 삭제해주는 인덱스
		// 시작인덱스 < = 인덱스범위 <= 종료 인덱스
		System.out.println(sb.delete(0, sb.length()-1)); //d 한글자 남음
		
		
		System.out.println(sb); // 원본역시 사라짐.
		//StringBuffer에서 제공하는 delete들은 원본에도 영향을 줌.
		
		
	}

}
