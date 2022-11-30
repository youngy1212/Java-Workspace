package com.kh.practice.numRange.view;

import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberController;

public class NumberMenu {
	
	public void menu() {
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		NumberController nc = new NumberController();
		
		try {
		System.out.println(nc.checkDouble(num1,num2));
		}catch(NumRangeException e){
			e.printStackTrace();
		}
		
	}

}
