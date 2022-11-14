package com.kh.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in); //전역변수. 여기선언시 내부에선언 안해도 사용가능

	public void practice1() {
		//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		//단, 입력한 수는 1보다 크거나 같아야 합니다. 만일, 1 미만의 숫자가 입력됐다면
		//“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.

		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >=1) {
			for(int i =0; i<num; i++) {
				System.out.print(i+1 +" ");
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			practice1();
		}
		
	}
	
	public void practice2() {
		//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		//단, 입력한 수는 1보다 크거나 같아야 합니다. 만일 , 1 미만의 숫자가 입력됐다면
		//“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >=1) {
			for(int i = num; i>=1; i--) {
				System.out.print(i +" ");
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			practice2();
		}
		
	}
	
	public void practice3() {
		//1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.

		System.out.print("정수를 하나 입력하세요 :");
		int num = sc.nextInt();
		int sum=0;
				
		for(int i =1; i<num; i++) {
			System.out.print(i+" + ");
			sum +=i;
		}
			sum += num;
		System.out.print(num+" = "+sum);
	}
	
	public void practice4() {
		//사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요. 만일, 1 미만의 숫자가 입
		// 력됐다면 “1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요
		
		System.out.print("첫번쨰 숫자 :");
		int num1 = sc.nextInt();
		
		System.out.print("두번쨰 숫자 :");                            
		int num2 = sc.nextInt();
		
		if(num1 >= 1 && num2 >= 1) {
			if(num1 > num2){
				for(int i =num2; num2<=num1; num2++) {
					System.out.print(num2+" ");
				}
			}else{
				for(int j = num1; num1<=num2; num1++) {
					System.out.print(num1+" ");
			}
			}
		}else{
			System.out.println("1이상의 숫자를 입력해주세요.");
			practice4();
		}
		
	}
	
	public void practice5() {
		//사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.단 , 9를 초과하는 숫자가 입력됐다면
		//“9 이하의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요

		System.out.print("숫자 :");
		int dan = sc.nextInt();
		
		
		if(dan>1 && dan <10) {
			for(int i =2; i<=dan; i++) {
				System.out.println("===== "+i+"단 =====");
				for(int j=1; j<=9; j++) {
					System.out.printf("%d * %d = %d \n",i,j,i*j);
				
				}
			}
		}else {
	    	System.out.println("2~ 9 이하의 숫자를 입력해주세요.");
	    	practice5();
	    }
	
	}
	
	
	public void practice6() {
		//사용자로부터 시작 숫자와 공차를 입력 받아
		//일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.
		//단, 출력되는 숫자는 총 10개입니다.
		
		System.out.print("시작 숫자 :");
		int num1 = sc.nextInt();
		
		System.out.print("공차 :");
		int num2 = sc.nextInt();
		
		
		for(int i = 0; i<10; i++) {
			System.out.print(num1 + " ");
			num1 += num2;
		}
	}
	
	public void practice8() {
		//실행예제 구현 
		//정수 입력 : 4
		//*
		//**
		//***
		//****

		System.out.print("정수 입력 :");
		int a = sc.nextInt();
		
		for(int i=1; i<=a; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			} System.out.println( );
		}
	}
	
	public void practice9() {
		//실행예제 구현 
	    //정수 입력 : 4
		//****
		//***
		//**
		//*


		System.out.print("정수 입력 :");
		int a = sc.nextInt();
		
		for(int i=1; i<=a; i++) {
			for(int j = a; j>=i; j--) {
				System.out.print("*");
			} System.out.println( );
		}
	}
	
	public void practice10() {
		//정수 입력 : 4
		//   *
		//  **
		// ***
		//****

		System.out.print("정수 입력 :");
		int a = sc.nextInt();
		
		for(int i=1; i<=a; i++) {
			for(int j = a; j>=i; j--) {
				System.out.print(" ");
			} for(int k=1;k<=i;k++) {
				System.out.print("*");
			}System.out.println();
		
		}
	}
	
	public void practice11() {
		
		//정수 입력 : 4
		//****
		// ***
		//  **
		//   *
		System.out.print("정수 입력 :");
		int a = sc.nextInt();
		
		for(int i=1; i<=a; i++) { 
			for(int k=1; k<i; k++) {  
				System.out.print(" ");
			}for(int j=0; j<=(a-i);j++) {
				System.out.print("*");
			} 
			System.out.println();
		}
	}
	
	
	public void practice12() {
		//정수 입력 : 4
		//   *
		//  ***
		// *****
		//*******
		
		System.out.print("정수 입력 :");
		int a = sc.nextInt();
		
		for(int i=1; i<=a; i++) { // 1, 2, 3, 4
			for(int j = a; j>=i; j--) { //3,2,1,0
				System.out.print(" ");
			}for(int j=0; j<(i*2-1);j++) { //1,3,5,7
				System.out.print("*");
			}System.out.println( );
		}
	}
	
	public void practice13() {
		//사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
		// 단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
		
		System.out.print("숫자 :");
		int a = sc.nextInt();
		int count =0;
		
		
		if(a>=2) {
		for(int i=2; i<a; i++) {	
			if(a%i == 0) {
				count++;
			}
		}
		if(count == 0) {
			System.out.print("소수입니다.");
		}else{
			System.out.println("소수가 아닙니다.");
		}
		}else {
			System.out.println("잘못 입력하셨습니다."); 
		}
		
	}
	
	public void practice14() {
		//2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요.
		//단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요
		
		System.out.print("숫자 :");
		int num = sc.nextInt();
		
		
		if(num<2) {
			System.out.println("잘못 입력하셨습니다."); 
			return; //종료
		}
		
		int count = 0;
		
		for(int i = 2; i <= num; i++) {
			boolean isPrime = true;
			// i 값이 소수인지 아닌지 검사를함.
			for(int j = 2; j < i; j++) {
				if(i%j == 0) {
					isPrime = false;
					break; // 반복문을 진행하다가 break; 바로 나감. 불필요한 연산을 방지하게됨.
							// if 2,3,4,5 다해보는데 break;시 2에서 이미 0이되었기 떄문에 바로 탈출
				}
			}
			if(isPrime == true) {
				System.out.print(i + " ");
				count++;
			}
			// i값이 소수라면 출력을 하고, 값을 1증가시킴.
		}
		System.out.println();
		System.out.printf("2부터 %d까지의 소수의 개수는 %d개 입니다.",num,count);
		
			
			
	}
	
	
	public void practice15() {
		//1부터 사용자에게 입력 받은 수까지 중에서
		//1) 2와 3의 배수를 모두 출력하고
		//2) 2와 3의 공배수의 개수를 출력하세요.

		System.out.print("자연수 하나를 입력하세요 :");
		int a = sc.nextInt();
		int count = 0;
		
		for(int i =2; i<=a;i++) {
			if(i%2==0 || i%3==0) {
				System.out.print(i+" ");
				
				if(a%i == 0) {
					count++;
				}
			}
		}
		System.out.print("\ncount:"+ count);
		
		
	}
	
	
	public void practice16() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 :");
		int a= sc.nextInt();
		
		for(int j=1; j <=a; j++) {
			for(int i =0; i<j; i++) {
				System.out.print("*");
		} System.out.println();
		}
		
		for(int i=1; i<=a; i++) {
			for(int j = a; j>i; j--) {
				System.out.print("*");
			} System.out.println( );
		}
	}

	
	public void practice17() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 :");
		int a= sc.nextInt();
		
		for(int i =1; i<=5; i++) {
			if(i==1 || i==5) {
				System.out.println("*****");
			}else {
				System.out.println("*   *");
			}
			
			
		}
		
	}
	
	public void practice18() {
		//정수 입력 : 4
		//   *   // 3공백 1별
		//  ***  // 2공백 3별
		// ***** // 1공백 5별
		//*******// 0공백 7별
		// ***** // 1공백 5별
		//  ***  // 2공백 3별 
		//   *   // 3공백 1별

		// 3으로 작성해봄
		System.out.print("정수 입력 :");
		int num = sc.nextInt();
		
		for(int i =0; i<num-1; i++) {// 0 1 2...
		
		for(int j =0; j<num -( 1 + i); j++) {
			System.out.print(" ");
		} 
		for(int j =0; j< 1+2*i; j++) {
			System.out.print("*"); 
		} System.out.println();
		}
		
		
		for(int i =0; i<num-1; i++) {// 0 1 2...
		
		for(int j =0; j< 1+i; j++) {
			System.out.print(" ");
		}
		for(int j =0; j< (num-i)*2-3; j++) {
			System.out.print("*");
		}System.out.println();
		
		}
		
//		//  *
//		for(int j =0; j<2; j++) { // 0 1
//			System.out.print(" ");//  ;
//		}
//		for(int j=0; j<1; j++) { // 0 
//			System.out.print("*");  //*
//		}
//		System.out.println();
//		
//		
//		// ***
//		for(int j =0; j<1; j++) { // 0
//			System.out.print(" ");// ;
//		}
//		for(int j=0; j<3; j++) { //0 1 2
//			System.out.print("*");  //***
//		} 
//		System.out.println();
//		
//		
//		//*****
//		for(int j =0; j<0; j++) { 
//			System.out.print(" ");
//		}
//		for(int j=0; j<5; j++) { // 0 1 2 3 4 
//			System.out.print("*");  //***** 
//		} 
//		System.out.println();
				
//			--------------
//		 ***
//			for(int j =0; j<1; j++) { // 0
//			System.out.print(" ");// ;
//		}
//		for(int j=0; j<3; j++) { //0 1 2
		// 1+ 2*(num -2-i) -> 1->0
		// 1+ 2num -4 -2i -> 2(num-i)-3
//			System.out.print("*");  //***
//		} 
//		System.out.println();
		
		// 아래 위 나눠서 사용
		
		
	} 
	


	
	
	
}
