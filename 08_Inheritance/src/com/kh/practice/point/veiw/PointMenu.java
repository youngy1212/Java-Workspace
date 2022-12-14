package com.kh.practice.point.veiw;

import java.util.Scanner;

import com.kh.practice.point.controller.*;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.print("메뉴번호 : ");
			
			int num = sc.nextInt();
			
			switch(num) {
			case 1 : circleMenu(); break;
			case 2 : rectangleMenu(); break;
			case 9 : System.out.println("종료합니다."); return;
			default : System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void circleMenu() {
		while(true) {
			System.out.println("==== 원 메뉴 ====");
			System.out.println("1. 원 둘레");
			System.out.println("2. 원 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴번호 : "); // 잘못 입력해도 메인으로 돌아감 9, default 둘다 메인 return
			
			//return 날 호출했던 곳으로 들아감
			
			int num = sc.nextInt();
			
			switch(num) {
			case 1 : calcCircum(); break;
			case 2 : calcCircleArea(); break;
			case 9 : 
			default : return; // return 아니고 main 으로 설정할 경우...
								//메인에서 끝내기를 눌러도 계속 돌아감..
								// 메인 return을 타고 돌아가서 종료되는데
								// main으로 작성시 return이 여기로 돌아와서 무한반복
			
			}
		}
	}
	
	public void rectangleMenu() {
		while(true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴번호 : ");
			
			int num = sc.nextInt();
			
			switch(num) {
			case 1 : calcPerimeter(); break;
			case 2 : calcRectArea(); break;
			case 9 : 
			default : return;
			}	
		}
		
	}
	
	public void calcCircum() {
					
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int radius= sc.nextInt();
						
		System.out.println(cc.calcCircum(x, y, radius));;
		
	}
		
	public void calcCircleArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int radius= sc.nextInt();
						
		System.out.println(cc.calcArea(x, y, radius));
		
	}
		
	public void calcPerimeter() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int height= sc.nextInt();
		System.out.print("넓이 : ");
		int width= sc.nextInt();
						
		System.out.println(rc.calcPerimter(x, y, height, width));
			
		}
	public void calcRectArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int height= sc.nextInt();
		System.out.print("넓이 : ");
		int width= sc.nextInt();
		
		System.out.println(rc.calcArea(x, y, height, width));
		
	}

}
