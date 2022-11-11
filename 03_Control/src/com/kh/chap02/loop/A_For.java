package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	
	/*
	 * <반복문>
	 * 프로그램 흐름을 제어하는 제어문 중 하나
	 * 어떤 실행코드를 반복적으로 수행시켜줌.
	 * 
	 * 크게 두종류로 나눔(FOR문, WHILE문(DO-WHTLE))
	 * 
	 * [표현법]
	 * for(초기식; 조건식; 증감식){ // 세미클론을 통해서 구분. 무조건 있어야함 ; 
	 * 		반복적으로 실행시키고자 하는 코드;
	 * }
	 *
	 *- 초기식 : 반복문이 시작될때 "초기에 딱 한번만 실행" 되는 구문
	 *			(반복문에서 사용할 변수를 선언 및 초기화 할떄 사용)
	 *- 조건식 : 반복문이 수행될 조건을 작성하는 구문
	 *			조건식의 결과가 true 이면 반복문 실행
	 *			조건식의 결과가 false면 반복문 멈추고, 빠져나옴
	 *			(보통 초기식에 제시된 변수를 가지고 조건식을 작성)
	 *- 증감식 : 반복문을 제어하는 변수값을 증감시키는 구문
	 *			(보통 초기식에 제시된 변수를 가지고 증감식을 작성)
	 *			ex) i++, i+=1
	 *
	 * for문을 만나는 순간
	 * 초기식 -> 조건식(조건검사) -> true일 경우 실행할 코드 실행 -> 증감식 
	 *    	-> 조건식(조건검사) -> true일 경우 실행할 코드 실행 -> 증감식
	 *    	-> 조건식(조건검사) -> true? 실행할코드 실행 -> 증감식 
	 *    	...
	 *   	-> 조건식(조건검사) -> false경우 실행할 코드 실행XXX
	 *  매번 조건식의 조건검사 결과값을 가지고 조건이 True일 경우만 반복해서 실행한다.
	 *  
	 *  알아둘 것 : 
	 *  for문안에 초기식, 조건식, 증감식 각각 생략이 가능하긴함. 단, 반드시 ;은 작성해줘야한다.
	 *  
	 */ 
	
	public void method1() {
		//안녕하세요를 5번 반복해서 출력하고 싶은 경우.
		for(int i = 0; i<5; i++) {
			System.out.println("안녕하세요");
		}
		
		
		//for(;;) { //초기식, 조건식, 증감식이 없더라도 문법적 오류는 아님.
		// System.out.print("야호~");
		// }
		
		for(int i =11; i<16; i++) {
			System.out.println("야호~");
		}
		
		for(int i =1; i<10; i+=2) { //5번만 반복
			System.out.println("반갑습니다요.");
		}
		
	}
	



	public void method2() {
		//1~5까지 출력
		//i값이 1에서부터 6보다 작을때까지 1씩 증가할 동안 반복 수행
		// 1 2 3 4 5
		
		for(int i =1; i<6; i++) {
			System.out.print(i+" ");
		}

		System.out.println(); //빈값 줄바꿈 
		
		for(int i =5; i>0; i--) {
			System.out.print(i + " ");
		}
	}
	
	public void method3() {
		//i값이 1에서부터 10사이의 홀수만 출력
		// 1 3 5 7 9
		
		for(int i =1; i<10; i+=2) {
			System.out.print(i+ " ");
			
		}
		
	}
	
	public void method4() {
		//1~ 10까지 
		for(int i=0; i<=9; i++) {
			System.out.print((i+1) +" ");
		}
		
	}
	//산술연산 + 반복문
	public void method5() {
		// 1~10까지의 총 합계
		// 방법1. int sum = 1+2+3+4+5...+10;
		
		// 방법2. int sum = 0 선언후
		// sum +=1;
		// sum +=2;
		// sum +=3;..
		
		int sum=0; //for 안에서 선언하면 벗어나면 sum 사용불가능. 밖에서 선언.
		
		for(int i =1; i<11; i++ ) {
			sum += i;
		}
		System.out.println("1부터 10까지의 총 합계: "+sum);
	}
	
	public void method6() {
		// 1에서부터 사용자가 입력한 숫자까지 모두 더해서 출력해보기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양수 입력 : ");
		int num = sc.nextInt();
		
		if(num >0) {
			int sum = 0;
			
			for(int i=0; i<num; i++ ) {
				sum += i;
			}
			System.out.printf("1부터 %d까지 총 합계 : %d\n",num,sum);
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	public void method7() {
		//1부터 매번 달라지는 랜덤값(1~10사이의 랜덤한 정수) 까지의 총합계
	
		/*
		 * java.lang.Math 클래스에 이미 정의되어있는 random()메소드를 호출하여
		 * 매번 다른 랜덤값을 얻어올수 있음.
		 * 
		 * static -> 객체시간에 자세히 다뤄볼 예정
		 * 
		 * random() : 0.0 ~ 0.999999999.. 사이의 랜덤값
		 * 0.0 <= 랜덤값 < 1.0 
		 */
		
		
		//private 개인적인 : 외부에서 함수로 가져다 쓸수없음.
		//Math m = new Math();
		//m.random(); // 오류
		
		// int radom = (int)Math.random(); 그럼 그래봤자 0...
		
		//0.0 <= 랜덤값 < 1.0
		// 10 곱해보기 
		//0.0 <= 랜덤값 < 10.0
		// 1을 더해보자
		// 1,0 <= 랜덤 값 < 11.0
		// 소수점만 버려버리면, 원하는 범위의 정수 랜덤값을 가져올수가 있음
		// 1 <= 랜덤값 <= 10
		
		//[표현법]
		// Math.random() * 출력을 하고자 하는 갯수 + 시작하고 싶은 수
		// 시작수 ~(시작수 + 출력하고자 하는 갯수)
		
		int random =(int)(Math.random() * 10 + 1);
		System.out.println(random);
		
		int sum=0;
		for(int i =1;i<=random; i++ ) {
			sum+= i;
		}
		System.out.printf("1부터 %d까지의 총 합은 %d 입니다.",random,sum);
	}
	
	public void method8() {
		//반복문 + String
		String str = "hello";
		
		/*
		 * h => str.charAt(0);
		 * e => str.charAt(1);
		 * l => str.charAt(2);
		 * l => str.charAt(3);
		 * o => str.charAt(4);
		 * 
		 * 규칙을 찾기. 우선 반복적으로 Str.charAt을 호출함.
		 * 인덱스에 해당하는 숫자만 0부터 1씩 4까지 증가함.
		 */
		
		for(int i =0; i<=4; i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	public void method9() {
		//사용자에게 문자열을 입력받아서
		//각 인덱스별로 문자를 하나씩 뽑아서 출력
		
		// apple 길이 : 5
		// 01234 index 
		
		// kiwi 길이 : 4
		// 0123
	
		//마지막 인덱스는 문자열의 길이 -1 
		//추출하고자 하는 인덱스 값의 범위는
		// 0~ (문자열의 길이 -1)까지 매번 1씩 증가
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String str = sc.nextLine();
		
		//문자열의 길이를 알려주는 메소드
		System.out.println("문자열의 길이 : "+str.length());
		
		for(int i =0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
	}
	
	public void method10() {
		//구구단 출력(2단)
		/*
		 * 2 X 1 = 2 
		 * 2 X 2 = 4
		 * ......
		 * 2 X 9 = 18
		 * 
		 */
		
		for(int i=1; i<10; i++) {
			System.out.println("2 X "+i+" = "+i*2);
		}
		
	}
	
	public void method11() {
		//사용자가 입력한 단을 출력
		//단수가 2단~9단까지의 범위가 아니라면 
		//잘못입력했습니다(2~9사이의 정수 입력)
		// 제대로 입력했다면 해당 단수를 출력
		
		Scanner sc= new Scanner(System.in);
		System.out.print("출력하려는 단수를 입력하세요 : ");
		int a = sc.nextInt();
		
		if (a>1 && a<10) {
			for(int i =1; i<10;i++) {
				System.out.printf("%d X %d = %d\n",a,i,a*i);
			}
			
		}else {
			System.out.println("잘못입력했습니다. 2~9사이의 정수 입력");
		}
		
	}
	//중첩 반복문
	public void method12() {
		// 1~5까지 연이어서 출력
		// 1 2 3 4 5 가 출력되도록 반복문 사용
		
		for(int i =1; i<=3;i++) {
			for(int j = 1; j<=5; j++) {
				System.out.print(j+" ");
			}	
			System.out.println();
		}
		
	}
	
	public void method13() {
		//****
		//****
		//****
		//****
		//중첩반복문으로 출력해보기
		
		for(int i=1; i<5; i++) {
			for(int j =1; j<5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void method14() {
		//1***
		//*2**
		//**3*
		//***4
	 for(int i= 1; i < 5; i++) {
			for(int j =1; j < 5; j++) {
				if(j == i) {
					System.out.print(i);
				}else{
					System.out.print("*");
				} 
			}System.out.println();
			
		}
	}
	public void method15() {
		//2단부터 ~ 9단까지 모두~ 출력
		
		for(int dan =2; dan<10; dan++) {
		System.out.printf("-- %d 단 ---\n",dan);
			for(int j=1; j<=9; j++ ) {
				System.out.printf("%d X %d = %d \n",dan,j,dan*j);
		}
			System.out.println();
	}}
}
