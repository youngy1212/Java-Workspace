package com.Kh.opreator;

public class B_InDecrease {
	
	/*
	 * 증감연산자( 단항연산자 ) ++ -- 
	 * ++ : 변수에 담긴 값을 1 증가시키는 연산자
	 * 		++변수 (전위연산자) 변수 ++ (후위연산자)
	 * -- : 값을 1 감소시키는 연산자
	 * 		--변수 (전위연산자) 변수 -- (후위연산자)
	 * 
	 * (증감연산자)변수 : 전위연산 -> 선증가 후처리.
	 * 변수(증감연산자) : 후위연산 -> 선처리 후증감.
	 */

	public void method() {
		//전위연산 테스트
		int num = 10;
		System.out.println("전위연산 적용 전 num : "+num); //10
		System.out.println("1회 수행 후 결과 "+ ++num); //10에서 증감연산을 먼저 시행 11로 num값을 증가시키고 		
		// 최종적으로는 11이 출력됨.
		
		System.out.println("2회 수행 후 결과 "+ ++num);//현재 num에는 =11 이 담겨있음. 따라서 12가 출력됨.
		System.out.println("3회 수행 후 결과 "+ ++num);//13
		
		System.out.println("최종 num : " +num);
		
		System.out.println("==================");
		
		
		//후위연산 테스트
		int num2 = 10;
		System.out.println("후위연산 적용 전 num2 : "+ num2);//10
		System.out.println("1회 수행 후 결과 "+ num2++);//10출력 후 1증가
		// 즉, 출력당시에는 10이 출력되고, 출력처리가 끝나고나서 11로 증감처리함.
		
		System.out.println("2회 수행 후 결과 "+ num2++); //11 출력후 12로 증가
		System.out.println("3회 수행 후 결과 "+ num2++); //12
		System.out.println("최종 num2 :"+ num2);
		
	}
	
	public void metod2() {
		//전위연산
		int a =10;
		int b = ++a;
		System.out.println("a :"+a+ " , b: "+b); //a : 10/ b : 11;
		//로 예상했지만 11, 11 이었음 이미 b에서 ++a가 되어 b로 들어갔음. a는 이떄 이미 11이 되었으니
		// 아래 출력해도 역시 11이 나오는것. 
		
		//후위연산
		int c = 10;
		int d = c++;
		System.out.printf("c : %d, d = %d \n",c,d); //c는 11 d는 10
		
		//-----------
		//예측
		int num = 20;
		System.out.println("현재 num :" +20); //20
		System.out.println("++num ? "+ ++num); //21
		System.out.println("num++ ? "+ num++); //출력 21 현재 22
		System.out.println("--num ? "+ --num ); //출력 21 현재 21
		System.out.println("num-- ? "+ num--); // 출력 21 현재 20
		
		System.out.println("최종 num ? "+num); // 최종 20
		
	
		
	}
	
	public void metod3() {
		
		int num1 = 20;
		int result1 = num1++ *3; // result1 = 20*3 연산 후 num1 = num1+1
		
		System.out.println("num1 : " +num1); //num 21
		System.out.println("result1 : "+ result1); //result1 60
		
		int num2 = 20;
		int result2 = ++num2 * 3; //num2 = num2+1 연산 후 result2 = 21*3 
		
		System.out.println("num2 : "+num2);
		System.out.println("result2 : "+result2);
		
	}
	
	
	public void metod4() {
		int a =10;
		int b =20;
		int c =30;
		
		// 주석으로 어떻게 값이 출력될지 예상해보기
		
		
		System.out.println(a++); //출력 10 , a = 11
		System.out.println((++a)+(b++));  // a: 12로 처리 : b : 20 // a12 b21
		System.out.println((a++)+(--b)+(--c)); // a:12 b: 20 c:29 : 출력:61 / a: 13 b: 20 c:29
		System.out.println("a: "+a+" ,b :"+b+", c : "+c); // a 13: b: 20 c:29 
		
	}
	
	public void quiz() {
		int a = 5;
		int b = 10;
		
		int c = (++a)+b; //c = 6+10 = 16 // a: 6 b: 10
		int d = c/a; // d = 16/6 = 2 // 
		int e = c%a; // e = 16/6.. = 4 // 
		
		int f = e++; // f = 4 // e = 5
		int g = (--b) +(d--); // g = 9 + 2 = 11 // b = 9 d = 1
		int h = 2; 
		
		int i = (a++)+ b / (--c / f) * (g-- - d) % (++e + h); // i = 6 + 9 / (15/4) * (11 - 1) % (6+2) 
		//i = 6 + 6 
		
		System.out.println("a : "+a); // 7
		System.out.println("b : "+b); // 9
		System.out.println("c : "+c); // 15
		System.out.println("d : "+d); // 1
		System.out.println("e : "+e); // 6
		System.out.println("f : "+f); // 4
		System.out.println("g : "+g); // 10
		System.out.println("h : "+h); // 2
		System.out.println("i : "+i); // 12
 		
	}
	
	
	
}
