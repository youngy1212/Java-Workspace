package com.Kh.opreator;

public class A_Arithmetic {
	
	// 산술연산자 (이항연산자 == 두개의 값을 가지고 연산)
	// * / % + - 
	
	public void method() {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 = "+ (num1+num2)); //최우선 연산자를 통해 () 합먼저 해줌
		//num1 + num2 로 출력시 String 처럼 각각의 숫자 10과 3을 103으로 찍기때문에
		// 괄호로 묶어줘서 덧셈연산이 먼저 실행되도록 한다.
		
		System.out.println("num1 - num2 = "+(num1-num2)); //-는 무조건 오류 // 문자는 빼는게 불가능
		// 뺄샘의 경우 괄호로 묶어주지 않으면 String 처럼 각각 숫자로 인식하기 때문에 오류발생
		
		System.out.println("num1 * num2 = "+ num1*num2); // 곱셈이 먼저 실행이 되기에 () 없어도 가능.
		System.out.println("num1 / num2 = "+ num1/num2); 
		System.out.println("num1 % num2 = "+ num1 %num2);
		// 곱셈,나눗셈, 모듈러의 경우 덧셈보다 우선순위가 높기 때문에 괄호로 묶어주지 않아도
		// 정확한 결과가 나옴. 단, 가독성을 위해 모든 연산시 괄호로 묶어주는 것을 권장.
		
		//System.out.println(10 % 0);
		//java.lang.ArithmeticException : // by zero 라는 오류가 발생
		// 수학과 마찬가지로 0으로 나누기는 안됨.
		
		double a = 35; //35.0
		double b = 10; //10.0
		
		System.out.println(a/b); // 실수끼리 실행결과는 ?? 3.5
		System.out.println(a%b); // 실수끼리 실행결과는 몫은 3 나머지 5 // 결과 5.0
		
		
		
		
		
		
	}

}
