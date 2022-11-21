package com.kh.hw.shape.veiw;

import java.util.Scanner;

import com.kh.hw.shape.controller.*;

public class ShapeMenu {
	Scanner sc = new Scanner(System.in);
	 SquareController scr = new SquareController();
	 TriangleController tc = new TriangleController();
	 
	
	public void inputMenu() {
		System.out.println("===== 도형 프로그램 =====");
		System.out.println("3. 삼각형");
		System.out.println("4. 사각형");
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴 변호: ");
		int num = sc.nextInt();
		
		if(num == 3) {
			triangleMenu();
		}else if(num == 4) {
			squareMenu();
		}else if(num == 9) {
			System.out.println("프로그램을 종료합니다");
			
		}else{
			System.out.println("잘못된 번호 입니다. 다시 입력하세요");
			inputMenu();
			return;
		}
	}
	public void triangleMenu() {
		System.out.println("===== 삼각형 =====");
		System.out.println("1. 삼각형 면적");
		System.out.println("2. 삼각형 색칠");
		System.out.println("3. 삼각형 정보");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 변호: ");
		int num = sc.nextInt();
		
		if(num == 1) {
			inputSize(3, 1);
			
		}else if(num == 2) {
			inputSize(3,2);
			
		}else if(num == 3) {
			printInformation(3);
		}else if(num == 9){
			System.out.println("메인으로 돌아갑니다.");
			inputMenu();
			return;
		}
		
	}
	public void squareMenu() {
		System.out.println("===== 사각형 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 면적");
		System.out.println("3. 사각형 색칠");
		System.out.println("4. 사각형 정보");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 변호: ");
		int num = sc.nextInt();
		
		if(num == 1) {
			inputSize(4,1);
			
		}else if(num == 2) {
			inputSize(4,2);
			
		}else if(num == 3) {
			inputSize(4,3);
			
		}else if(num == 4){
			printInformation(4);
			
		}else if(num == 9){
			System.out.println("메인으로 돌아갑니다.");
			inputMenu();
			return;
		}
		
	}
	
	public void inputSize(int type, int menuNun) {
		
		
		if(type == 3) {
			System.out.print("높이 : ");
			double height = sc.nextDouble(); 
			
			
			System.out.print("너비 : ");
			double width = sc.nextDouble();
			
		}
	
		if(type == 3) {
			System.out.println("사각형 둘레 : "+scr.calcArea(height, width));
			triangleMenu();
		}
		
		sc.nextLine();
		
		System.out.print("색깔을 입력하세요 : ");
		String color = sc.nextLine();
		
		scr.paintColor(color);
		
		System.out.println("색이 수정되었습니다.");
		
		squareMenu();
		
	}
	
	public void  printInformation(int type) {
		if(type == 3 ) {
			System.out.println(tc.Print());
			triangleMenu();
		}else {
			System.out.println(scr.print());
			squareMenu();
		}
		
	}

}


