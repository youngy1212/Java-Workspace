package com.kh.practice.dimension;

import java.util.Arrays;

public class DimensionPractice {
	
	public void  practice1(){
		//3행 3열짜리 문자열 배열을 선언 및 할당하고
		//인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 “(0, 0)”과 같은 형식으로 저장 후 출력하세요
		
		String[][] arr = new String[3][3];
		
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]= "( "+ i +" , "+j+ " )";
			} 
			System.out.println(Arrays.toString(arr[i]));
		}
		
	}
	
	public void practice2(){
		//4행 4열짜리 정수형 배열을 선언 및 할당하고
		//1) 1 ~ 16까지 값을 차례대로 저장하세요.
		//2) 저장된 값들을 차례대로 출력하세요.
		
		int[][] arr = new int[4][4];
		
		int count = 1;
			for(int i =0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					arr[i][j] = count++;
					System.out.printf("%4d",arr[i][j]);
				}
				System.out.println();
			}	
	}
	
	public void practice3(){
		//4행 4열짜리 정수형 배열을 선언 및 할당하고
		//1) 16 ~ 1과 같이 값을 거꾸로 저장하세요.
		//2) 저장된 값들을 차례대로 출력하세요.
		
		int[][] arr = new int[4][4];
		int count = 16;
			for(int i =0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					arr[i][j] = count--;
					System.out.printf("%4d",arr[i][j]);
			}
				System.out.println();
			}	
	}
	
	public void practice4(){
		//4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후
		//아래의 내용처럼 처리하세요
		int[][] arr = new int[4][4];
			for(int i =0; i<3; i++) {
				for(int j=0; j<3; j++) {
					arr[i][j] = (int)(Math.random()*10+1);
				}  arr[i][3] = arr[i][0]+arr[i][1]+arr[i][2];
			}
			
			for(int i =0; i<4; i++) {
					arr[3][i]= arr[0][i]+arr[1][i]+arr[2][i];
			} 
			arr[3][3] += arr[1][3]
			
			
			
			
			System.out.println(Arrays.toString(arr[0]));
			System.out.println(Arrays.toString(arr[1]));
			System.out.println(Arrays.toString(arr[2]));
			System.out.println(Arrays.toString(arr[3]));
			
			
		
	}
	
	

}
