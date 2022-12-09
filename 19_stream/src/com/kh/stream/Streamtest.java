package com.kh.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streamtest {

	/*
	 * Stream?? 
	 * 스트림은 배열 및 컬렉션에 저장딘 요소에 하나씩 접근하며 해당값을 "람다식 " 으로 처리하는 반복자
	 * 
	 * 컬렉션이 요소를 할당하고 관리하는데 목적이 있다면
	 * 스트림은 요소를 검색, 필터링하거나 값을 처리하는데 목적이 있음
	 * 
	 * 스트림의 특징
	 * 1) 메서드의 매개변수에 람다식 사용가능
	 * 2) 식이 간결해짐
	 * 3) 컬렉션 및 배열을 통한 연산결과를 얻어오기 용이함.
	 * 
	 */
	
	public static void main(String[] args) {
		
		//스트림 사용 방법.
		
		// 배열에 stream 사용방법.
		String[] foods = {"삼겹살","갈비살","쌈장","파"};

		//1) Stream() 메서드를 통한 스트림 객체 선언.
		Stream<String> strStram = Arrays.stream(foods);
		
		//2) forEach반복문을 통해 배열 요소에 하나씩 접근.
		strStram.forEach((str) -> {System.out.println(str);});
		
		//int형 배열을 선언하여 연산테스트
		int [] iArr = {1,3,5,7,9};
		
		IntStream iStram = Arrays.stream(iArr);
		
		//forEach반복문을 통해 배열 요소에 하나씩 접근 그 안에 담긴 값을 모두 더하고 싶음.
		//int sum=0;
		String test = "지역변수"; // 상수나 다름 없음.
		final String test2 = "지역변수2";
		iStram.forEach((num)-> { 
			//sum += num;
			System.out.println(test);
			System.out.println(test2); 
		});
		
		/*
		 * 람다식에서 지역변수를 사용하려면 그 값이 final(상수)이거나 사실상 값이 할당된 후 바뀌지 않아서 final처럼 사용되는 경우에만 사용 가능하다.
		 * 
		 * 람다 캡처링 즉, 지역변수의 값이 람다식 내부에서 바뀌면 안됨
		 */
		
		
//		int sum =0;
//		for(int i =0; i<iArr.length; i++) {
//			sum+=iArr[i];
//		}
		
		
		//컬렉션에서 Stream 사용방법.
		ArrayList<Product> pList = new ArrayList<Product>();
		pList.add(new Product("갤럭시 Z 플립4",1450000,10,"삼성"));
		pList.add(new Product("갤럭시 Z 플립3",1050000,1,"삼성"));
		pList.add(new Product("아이폰 14",1350000,2,"애플"));
		pList.add(new Product("아이폰 14 프로",1750000,15,"애플"));
		
		//1) Stream() 메서드를 통해 스트림 객체 선언.
		Stream <Product> proStream = pList.stream();
		
		//2) forEach 메서도로 각 요소에 접근
		proStream.forEach( product -> System.out.println(product));
		
		
		
	}
}
