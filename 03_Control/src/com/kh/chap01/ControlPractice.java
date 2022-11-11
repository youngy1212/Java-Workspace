package com.kh.chap01;

import java.util.Scanner;

public class ControlPractice {
	
	public void practice1() {
		//아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
		//종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("메뉴 번호를 입력하세요 : ");
		int a = sc.nextInt();
		
		String ma = "";
		
		switch(a) {
		
		case 1 : ma = "입력"; break;
		case 2 : ma = "수정"; break;
		case 3 : ma = "조회"; break;
		case 4 : ma = "삭제"; break;
		
		case 7 : System.out.println("프로그램이 종료됩니다.");
		return;
		
		}
		System.out.println(ma+"메뉴입니다.");
	
	}
	
	public void practice2() {
		//키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
		//짝수가 아니면 “홀수다“를 출력하세요.
		//양수가 아니면 “양수만 입력해주세요.”를 출력하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int a = sc.nextInt();
		
		if(a>0) {
			if(a%2 ==0) {
				System.out.println("짝수다");
			}else {
				System.out.println("홀수다");
			}
		}else {
			System.out.println("양수만 입력해주세요.");
		}
		
	}
	
	public void practice3(){
		
		//국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
		//합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
		//(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
		//합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
		//불합격인 경우에는 “불합격입니다.”를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수: ");
		int a = sc.nextInt();
		
		System.out.print("수학점수: ");
		int b = sc.nextInt();
		
		System.out.print("영어점수: ");
		int c = sc.nextInt();
		
		int sum = (a+b+c);
		double avg = (sum/3);
	
		
		if(avg>=60 && a>=40 && b>=40 && c>=40) {
			System.out.println("국어 :" +a);
			System.out.println("수학 :" +b);
			System.out.println("영어 :" +c);
			System.out.println("합계 :" +sum);
			System.out.printf("평균 :%.1f\n",avg);
			System.out.println("축하합니다. 합격입니다!");
		}else {
			System.out.println("불합격입니다.");
		}
		
	}
	
	public void practice4(){
		// if문으로 되어있는 봄, 여름, 가을, 겨울 예제를 switch문으로 바꿔서 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("달을 입력해주세요 : ");
		int month= sc.nextInt();
		String season = "";
		
		switch(month) {
		case 1 : 
		case 2 :
		case 12 : season ="겨울"; break;
		case 3 :
		case 4 :
		case 5 : season ="봄"; break;
		case 6 : 
		case 7 :
		case 8 : season ="여름"; break;
		case 9 :
		case 10 : 
		case 11 :season ="가을"; break;
		
		default: System.out.println(month+"월은 잘못 입력된 달입니다.");
		return;
		
		}
		
		System.out.println(month+"월은 "+season+"입니다.");
		
	}
	
	public void practice5(){
		//아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
		//로그인 성공 시 “로그인 성공”, 
		//아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
		//비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디를 입력해주세요: ");
		String id = sc.nextLine();
		
		System.out.print("비번을 입력해주세요 : ");
		String pwd = sc.nextLine();
		
		if(id.equals("minmin")) { // 비밀번호를 잘 입력했는지 체크
			if(pwd.equals("Min1234")){
				System.out.println("로그인 성공"); 
			}else{
			System.out.println("로그인 성공");
			}
		}else {
			System.out.println("아이디가 틀렸습니다.");
		}
		
		// 1. 아이디값이 잘 입했는지 체크
		// 2. 아이디값이 잘 입력되었다면, 비밀번호를 잘 입력했는지 체크 할 것
		
	}
	
	
	public void practice6(){
		Scanner sc = new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String grade = sc.nextLine();
		
		switch(grade) {
		
		case "관리자" :
			System.out.print("회원관리, 게시글 관리, ");
		case "회원" :
			System.out.print("게시글 작성, 댓글 작성, ");
		case "비회원" :
			System.out.print("게시글 조회, ");
		}
		
		
	}
	
	public void practice7(){
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해주세요: ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg) 입력해주세요: ");
		double kg = sc.nextDouble();
		
		double BMI = kg/(height*height);
		
		String result = "";
		
		
		if(BMI <18.5) {
			result = "저체중";
		}else if(BMI < 23) {
			result = "정상체중";
		}else if(BMI < 25) {
			result = "과체중";
		}else if(BMI < 30) {
			result = "비만";
		}else {
			result = "고도 비만";
		}
		
		System.out.println("BMI 지수 : "+BMI);
		System.out.println(result);
		
	}
	
	public void practice8(){
		Scanner sc = new Scanner(System.in);
		System.out.print("피연산자 1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("피연산자 2 입력 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("연산자 입력(+,-,*,/,%) : ");
		char op = sc.nextLine().charAt(0);
		
		
		switch(op){ 
		case '+' : System.out.printf("%d %c %d = %d",num1,op,num2,num1+num2); break;
		case '-' : System.out.printf("%d %c %d = %d",num1,op,num2,num1-num2); break;
		case '*' : System.out.printf("%d %c %d = %d",num1,op,num2,num1*num2); break;
		case '/' : System.out.printf("%d %c %d = %.6f",num1,op,num2,(num1/(double)num2)); break;
		case '%' : System.out.printf("%d %c %d = %d",num1,op,num2,num1%num2); break;
				
		default : System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
	}
	
	public void practice9(){
		Scanner sc = new Scanner(System.in);
		
	}
	
	public void practice10(){
		Scanner sc = new Scanner(System.in);
		
	}
	
	public void practice11(){
		Scanner sc = new Scanner(System.in);
		
		//정수를 이용해서 4자리 비밀번호를 만들려고 하는데
		//이 때 4자리 정수를 입력 받아 각 자리 수에 중복되는 값이 없을 경우 ‘생성 성공’
		//중복 값이 있으면 ‘중복 값 있음‘
		//자리수가 안 맞으면 ‘자리 수 안 맞음‘ 출력
		//단, 제일 앞자리 수의 값은 1~9 사이 정수
		
		System.out.print("비밀번호 입력(1000~9999) : ");
		int pwd = sc.nextInt();
		
		if(pwd > 999 && pwd <= 9999) { // 자리수 체크
			int first = pwd % 10; // 일의자릿수 구하기
			int second = (pwd /10)%10; //십의자리수 구하기
			int third = (pwd/100)%10; //백의자리수 구하기
			int forth = (pwd/1000)%10; //천의자리수 구하기
			// 중복값이 있는지 처리하기
			if(first != second && first != third && first != forth && second != third &&
					second != forth && third != forth) {
				System.out.println("성공");
			}else {
				System.out.println("중복 값 있음");
			}
		} else {
			System.out.println("자리수 안 맞음");
		}
		
	}
	
	
}
