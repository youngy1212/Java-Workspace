package com.kh.practice.numRange.controller;

import com.kh.practice.numRange.exception.NumRangeException;

public class NumberController {

	public NumberController() {
		super();
	}
	
	public boolean checkDouble(int num1, int num2)throws NumRangeException{
		
		
		if(num1<100 || num1>0 && num2<100 || num2>0 )
			if(num1/num2 == 0) {
				return true;
			}else {
				return false; 
			}
		else{
			throw new NumRangeException("1부터 100사이의 값이 아닙니다");
		}
	}

	// 기본 생성자
	// 매개변수로 들어온 두 값이 1~100 사이 일 때 num1이 num2의 배수면 true, 
	// 배수가 아니라면 false 반환
	// 1~100사이가 아니라면 NumRangeException발생, 에러 메시지는 출력 값 참고
	
	

}
