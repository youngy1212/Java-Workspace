package com.kh.chap02_String.controller;

	//String은 불변클래스(변하지 않는 클래스)
	// 수정하는 순간 기존의 값이 담겨있는 공간에서 수정되지 않음.
public class A_StringPoolTest {
	
	//생성자를 통해 문자열 담기
	public void method1() {
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1 == str2); // false => 주소값 비교
		System.out.println(str1);
		System.out.println(str2.toString());
		//String 클래스의 toString()메소드의 경우 실제 담겨있는 문자열을 반환하도록 오버라이딩 되어있음.
		
		System.out.println(str1.equals(str2)); // true => 문자열 비교
		//String 클래스의 equals()메소드의 경우 주소값 비교가 아닌 문자열 비교를 하도록 오버라이딩 되어있음.
		
		System.out.println(str1.hashCode()); //99162322
		System.out.println(str2.hashCode()); //99162322
		//String 클래스의 hashCode() 메소드의 경우 주소값 기반이 아닌 실제담긴 문자열을 기반으로 해시코드값을 
		//반환하도록 오버라이딩 되어있음.
		
		// 정말 주소값을 알고 싶을 때 사용하는 메서드 System.identityHashCode(참조변수(래퍼런스변수));
		System.out.println(System.identityHashCode(str1));//1982791261
		System.out.println(System.identityHashCode(str2));//1562557367
		
		
	}
	//2. 문자열을 리터럴(값)로 생성
	public void method2() {
		
		String str = new String("hello"); // new 연산자로 heap영역에 hello 생성 -> stack에 있는 str에 주소값 전달
		
		String str1 = "hello"; // 
		String str2 = "hello";
		
		//리터럴 값이 상수풀에 올라감
		System.out.println(str1 == str2); // String Str1 = toString("hello"); -> String pool 영역으로 이동. 
		// str1 == str2은 String pool이라는 같은 주소값을 공유하게 된다.
		
		//String pool : 동일한 문자열 존재 불가 // true 주소값이 일치한다.
		
		System.out.println(str.hashCode());  //99162322
		System.out.println(str1.hashCode()); //99162322
		System.out.println(str2.hashCode()); //99162322
		
		System.out.println(System.identityHashCode(str1)); //1982791261
		System.out.println(System.identityHashCode(str2)); //1982791261
		System.out.println(System.identityHashCode(str)); //1562557367
		
	}
	
	public void method3() {
		
		String str = "hello";
		System.out.println(System.identityHashCode(str)); //1404928347
		
		str = "goodbye";
		System.out.println(System.identityHashCode(str)); //1562557367
		
		str += "abc";
		System.out.println(System.identityHashCode(str)); //1101288798
		
		// 값이 수정이 되는것이 아닌, 새로운 주소값이 할당 -> 그값이 str로 들어감.
		// 한번 담긴 후에 사라지지 않음. 일정이상 쌓이면 가비지컬렉터가 폐기.
		
		/*
		 * 기존의 상수풀의 연결이 끊긴 문자열들은 가비지 콜렉터가 알아서 정리해줌.
		 * 분변이라고해서 수정이 아예 안되는건 아니라
		 * 기존의 그 자리(원래있던 주소값)에서 수정되는 개념이 아니라는것.
		 * 매번 새로운 주소값을 참조하게됨.
		 */
		
		
		
		
		
		
		
	}
	
}
