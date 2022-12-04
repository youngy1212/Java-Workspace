package com.kh.exception.run;

import java.io.IOException;

import com.kh.exception.controller.*;

public class ExceptionRun {

	public static void main(String[] args) throws IOException {
		/*
		 * 에러(오류) 종류
		 * - 시스템 에러 : 컴퓨터 오작동으로 인해 발생하는 에러 => 소스코드로 해결이 안됨(심각한 에러)
		 * - 컴파일 에러 : 소스코드 상의 문법적인 문제로 에러 => 소스코드로 수정을 해결(빨간줄로 오류 알려줌)
		 * - 런타임 에러 : 소스코드상으로 문제는 없는데 프로그램 실행중 발생하는 에러
		 * 				=> 사용자의 잘못일 수 있고, 개발자가 예측해야하는데 하지 못한 경우.
		 * - 논리 에러 : 소스코드상으로 문제 없고, 실행 했을 때도 에러가 발생하지 않지만, 의도한대로 결과가 나오지 않는 경우
		 * 
		 * 시스템 에러를 제외한 컴파일 에러, 런타임 에러, 논리 에러와 같은 비교적 덜 심각한 것들을 가지고 작업을 함.
		 * 이런것들을 "예외"라고 부름 (Exception)
		 * 
		 * 이러한 예외들이 발생했을 경우 대비해서 처리하는 방법을 정의해두는 것을 "예외처리" 라고 한다.
		 * 
		 * 예외처리를 해야하는 이유 : 예외 발생시 프로그램이 비 정상적으로 종료되는 것을 막기 위함.
		 * 
		 * 예외처리방법
		 * 1. try ~ catch(직접처리)
		 * 2. throws 이용(떠넘기기)
		 * 
		 * 
		 */
		
		A_UncheckedException aue = new A_UncheckedException();
		
		aue.method1();
		//aue.method2();
		//aue.method3();
		
		B_CheckedException bce = new B_CheckedException();
		//bce.method1();
		
		//throw : throw 뒤에 있는 예외를 강제적으로 발생시킴.
		//throw new C_CustomException("예외가 발생했습니다."); // throw => 무조건 강제로 예외
		
		
	}

}
