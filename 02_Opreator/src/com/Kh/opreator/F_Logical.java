package com.Kh.opreator;

import java.util.Scanner;

public class F_Logical {
	/*
	 * 논리 연산자
	 * 두개의 논리값을 연산하는 연산자
	 * 논리값 (논리연산자) 논리값 -> 결과 값도 논리값
	 * 
	 * AND 연산자 : 논리값 && 논리값
	 * 				왼쪽, 오른쪽 논리값 둘다 True 여야 최종결과가 True가 반환됨
	 * OR 연산자 : 논리값 || 논리값 
	 * 				왼쪽, 오른쪽 논리값중 어느하나라도 True면 최종결과가 True
	 */

	public void method() {
		
		//사용자가 입력한 정수값이 양수이면서(이고) 짝수인지 확인하기.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 한 개 입력 : ");
		int num = sc.nextInt();
		
		boolean result = ((num>0) && (num%2 ==0));
		//&& 의미 : 그리고. ~이면서, ~이고
		
		System.out.println("사용자가 입력한 값이 양수이면서 짝수가 맞습니까? "+result);
		
	}
	
	public void method2() {
		//사용자가 입력한 정수값이 1이상 100이하의 수인지 확인하기.
		//사용자가 입력한 값이 1이상 100이하 입니까?
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 한 개 입력 : ");
		int num1 = sc.nextInt();
		
		boolean result2 = (num1 >0) && (num1<101);
		System.out.println("사용자가 입력한 값이 1이상 100이하 입니까? "+result2);
		
		/*
		 * &&(And) : 그리고, ~이면서, ~이고, 뿐만아니라 
		 * 			두개의 조건 모두 True여야 결과값도 true 
		 * 			둘중 하나라도 false 경우 결과 값은 false 
		 */
		
	}
	
	public void method3() {
		//사용자가 입력한 값이 y "이거나" y인지 확인하기.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("계속 진행하시려면 y 또는 Y 입력하세요 : " );
		char ch = sc.nextLine().charAt(0);
		
		boolean result = (ch == 'y') || (ch == 'Y');
		System.out.println("계속 진행합니다." + result);
		/*
		 * || (OR) : 또는, ~이거나
		 * 두개의 조건중 하나라도 TRUE일 경우 최종결과 값은 TRUE
		 * 두개의 조건이 모두 False일 경우 최종결과 값은 False
		 */
		
	}
	
	public void method4() {
		
		int num1 = 10;
		
		boolean result1 = false && (++num1 >0); 
		//Dead code 사용되지 않는 코드 // false가 앞에있어 뒤인(++num1>0)실행 자체가 안됨. num1값도 증가하지않음.
		System.out.println(num1); 
		
		/*
		 * 뒤에 비교연산 구문이 Dead code 라고 뜬다.
		 * 실행할때 오류는 나지 않지만, result1 결과값이 어차피 false인데 왜 작성한 구문인지 물어보는 것
		 */
		
		boolean result2 = true || (++num1>0); //Dead code 
		System.out.println(num1);
		
		
	}
	
	
}
