package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice {

	public void test() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요 : ");
		
		double t1 = sc.nextDouble();
		
		System.out.println("영어 점수를 입력하세요 : ");
		
		double t2 = sc.nextDouble();
		
		System.out.println("수학점수 점수를 입력하세요 : ");
		
		double t3 = sc.nextDouble();
		
		System.out.printf("국어 : %.1f \n영어 : %.1f \n수학 : %.1f \n",t1,t2,t3);
		System.out.printf("총점 : %d \n평군 : %d \n",(int)(t1+t2+t3),(int)((t1+t2+t3)/3));
		
		
		
		
	}
	
}
