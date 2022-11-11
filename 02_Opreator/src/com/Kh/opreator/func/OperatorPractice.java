package com.Kh.opreator.func;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int persons = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int candys = sc.nextInt();
		
		int result = (candys/persons);
		int result2 = (candys%persons);

		System.out.println("1인당 사탕 개수 : "+result);
		System.out.println("남은 사탕 개수 : "+result2);
		
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int gr = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int cla = sc.nextInt();

		System.out.print("번호(숫자만) : ");
		int number = sc.nextInt();
		
		sc.nextLine(); 
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("성적(소숫점둘째까지) : ");
		double test = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.",gr,cla,number,name
				, ((gender) =='M'? "남학생" : "여학생"),test); 
		
	
		
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String reslut1 = (age > 19) ? "성인" : (age<14)? "어린이" : "청소년";
		
		System.out.println(reslut1);
		
	}
	
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 입력하세요 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어점수 입력하세요 : ");
		int En = sc.nextInt();
		
		System.out.print("수학점수 입력하세요 : ");
		int Ma = sc.nextInt();
		

		double avg = (kor+En+Ma)/3;
		
		String reslut2 = (avg >= 60 && kor >=40 && En>=40 && Ma>=40) ? "합격" :  "불합격";
		
		
		System.out.println("합계 : "+ (kor+En+Ma));
		System.out.println("평균 : "+avg);
		System.out.println(reslut2);
	
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요 (-포함) : ");
		char a = sc.nextLine().charAt(7);
		
		String reslut3 = (a == '1' || a == '3') ? "남자" :  "여자";

		System.out.println(reslut3);
		
		/*
		 * Sting resNo = sc.nextLine() ; //
		 * char gender = resNo.charAt(7)
		 * 
		 * String result = (gender == '1' || gender == '3')? "남자" : "여자" ;
		 * '1' == 1 -> 49 == 1, '2' == 1 -> 50 == 1
		 */
		
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 1:");
		int num1 =sc.nextInt();
		
		System.out.print("정수 2:");
		int num2 =sc.nextInt();
		
		System.out.print("입력 :");
		int num3 =sc.nextInt();
		
		boolean result = (num3 <= num1 || num3>num2) ? true : false;
		
		System.out.println(result);
		
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 1 :");
		int num1 = sc.nextInt();
		
		System.out.print("입력 2 :");
		int num2 = sc.nextInt();
		
		System.out.print("입력 3 :");
		int num3 = sc.nextInt();
		
		
		System.out.println(num1 == num2 && num1 == num3 ? true : false );
		
		
		
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원 연봉 :");
		int a = sc.nextInt();
		
		System.out.print("B사원 연봉 :");
		int b = sc.nextInt();
		
		System.out.print("C사원 연봉 :");
		int c = sc.nextInt();
		
		double AA = a*1.4;
		double BB = b;
		double CC = c*1.15;
		
		
		System.out.println("A사원의 연봉/연봉+a :"+a+ "/"+AA);
		
		System.out.println(AA >=3000 ? "3000이상" : "3000미만");
		

		System.out.println("B사원의 연봉/연봉+a :"+b+ "/"+BB);
		
		System.out.println(BB >=3000 ? "3000이상" : "3000미만");
		

		System.out.println("C사원의 연봉/연봉+a :"+c+ "/"+CC);
		
		System.out.println(CC >=3000 ? "3000이상" : "3000미만");
			
		
		
	}
	
	
}
