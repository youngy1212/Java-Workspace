package com.kh.variable;

import java.util.Scanner; 

// 사용자가 키보드로 입력한 값을 변수에 기록하는 방법
public class B_keyboardInput {
	
	public void inputTest1() {
		/*
		 * 자바에서 이미 제공하고 있는 java.util.Scanner 클래스를 이용할 것.
		 * Scanner 클래스 안에 작성되어있는 메소드를 호출해서 이용.
		 */
		
		Scanner sc = new Scanner(System.in);
		//System.in 입력받은 값을 바이트 단위로 받아들인다는 의미. 
		// 출력시에는 Ststem.out 구문을 씀.
		
		// 사용자의 인적사항을 입력받기 ( 이름, 나이, 키)
		// 입력받고자 하는 내용을 먼저 출력문을 통해서 입력을 유도.
		System.out.println("당신의 이름은 무엇입니까 ? : ");
		
		// 입력한 값을 문자열로 받아오는 메소드 : nextLine() , next() 
		// 변수선언과 동시에 값을 입력 받아 바로 대답한다.
		// string name = sc.next();
		// next() : 사용자가 입력한 값을 공백이 있을 경우 공백 이전까지만 출력해줌.
		
		// String name = sc.next();
		
		String name = sc.nextLine(); //사용자가 엔터까지 입력할때 까지 대기 상태 
		//nextLine() : 사용자가 입력한 값 중 개행이 있을 경우 공백에 무관하게 개행
		//			   이전까지만 출력해준다. 특히 사용자가 입력한 값에 공백이 포함될 여지가 있는경우
		// 			   안전하게 nextLine() 함수를 쓰자.
		
		System.out.println("당신의 나이는 몇 살 입니까? : ");
		int age = sc.nextInt(); //사용자가 입력한 값 중 정수형 값을 받을 떄 사용.
		
		sc.nextLine(); // 버퍼에 남아있는 엔터(/n) 값을 비워주기 위해 실행
		
		System.out.println("사는 곳은 어디입니까? : ");
		String address = sc.nextLine();
		
		System.out.println("당신의 키는 몇 CM 입니까? : ");
		double heigth = sc.nextDouble();
		
		// 키는 000.0 cm 이며, 나이는 00세인 000님. 안녕하세요." 출력
		
		System.out.println(address+"에 사는 키는" + heigth + "cm 이며, 나이는 " + age + "세인 " + name +"님 안녕하세요.");
		
	}

	public void inputText2() {
		Scanner sc = new Scanner(System.in);
		
		// 문자열을 뽑을 때 => sc.nextLine() / sc.next() 
		// 정수값을 뽑을 때 => sc.nextInt() / sc.nextByte() / sc.nextShort() / sc.nextLong 
		// 실수값을 뽑을 떄 => sc.nextDouble() / sc.nextFloat() 
		
		//문자를 뽑을 때 => sc.nextChar() 없음 ==>> ??? 
		System.out.println("이름 : ");
		String name = sc.nextLine();
		
		System.out.println("성별(M/F) : "); // "M" 0123456
		char gender = sc.nextLine().charAt(0); //문자열에서 내가 원하는 문자를 잘라오는 법.
		// "apple" 문자열 
		// 01234
		// "apple" 문자열에서 4번 인덱스 문자는?
		// 'e'
		
		System.out.println("나이 :  ");
		int age = sc.nextInt();
		
		System.out.println(" 키 :  ");
		double height = sc.nextDouble();
		
	
		System.out.println(name +"님의 개인정보 : 성별 = " + gender + " 나이는 "+ age + " 키는 "+ height + "cm 입니다.");
		
		
		
		
		
	}
	
	/*
	 * 정리
	 * 1. 콘솔 창(모니터)에 출력하기 위해서 : System.out.print[ln]() 메소드를 이용
	 * 2. 콘살 창(키보드)에 입력받기 위해서 : Scanner를 이용해서 (next----() 메소드 이용)
	 * 	
	 * 	 > 주의사항
	 * 	1) sc.next----() 메소드 뒤에 sc.nextLine() 메소드가 와야 할 경우
	 * 	sc.nextLine() 메서도를 한번 더 실행시켜서 버퍼에 남이있는 엔터를 빼줘야 한다.
	 * 
	 * 	2) '문자' 값을 입력받아야 할 경우
	 * 	sc.nextLine() 메소드를 통해 우선 문자열을 입력받고, 그 뒤로 .char(인덱스) 메소드를 통해 문자를 하나만 추출한다.
	 * 
	 * 
	 */
	

}
