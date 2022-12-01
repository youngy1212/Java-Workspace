package com.kh.practice.numRange.view;

import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu {
	
	public void menu() {
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		NumberController nc = new NumberController();
		
		try {
			if(!(num1<=100 && num1>0 && num2<=100 && num2>0 )) {
				throw new NumRangeException("1과 100사이의 값이 아닙니다.");
			}
			System.out.printf("%d는(은) %d의 배수인가? %s",num1,num2,nc.checkDouble(num1, num2));
		}catch(NumRangeException e){
			e.printStackTrace();
		}
		
	}

}
