package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	
	public void test3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가로 값을 입력하세요 : ");
		double width = sc.nextDouble();
		
		System.out.println("세로 값을 입력하세요 : ");
		double len = sc.nextDouble();
		
		System.out.println( " 면적 : "+ (width*len) );
		System.out.println( " 둘레 : "+ (width+len)*2 );
		
		
		
		
	}

}
