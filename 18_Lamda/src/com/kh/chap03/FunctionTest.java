package com.kh.chap03;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToIntFunction;

import com.kh.model.vo.Product;

public class FunctionTest {

	/*
	 * Function 인터페이스 특징
	 * 1. 타입 변환
	 * ex) 컬렉션에서 특정값만 뽑거나, 연산할 때 사용됨
	 */
	
	public static void main(String[] args) {

		Product p = new Product("갤럭시 플립 4",1350000,100);
		
		//1) Function<T,R> : T형을 인자로 받아서 R형 값을 리턴
		// Product 객체에서 가격에 대한 정보만 쏙 뺴기
		
		Function<Product, Integer> function; // int는 기본자료형이라 클래스형을 넣어줘야 해 Integer
		function = (product) -> {
			return product.getPrice();
			
		};
		
		System.out.println(function.apply(p));
		
		//BiFuncrtion(T, U, R) : T,U 두개를 인자로 받고 R을 리턴
		BiFunction<Integer, Integer, Double> biFunction;
		biFunction = (num1, num2)-> {
			return num1*(double)num2;
		};
		
		System.out.println("z플립 100대의 가격은"+biFunction.apply(p.getPrice(), p.getStock()));
		
		//그외
		//3) XXXFunction<T> : XXX를 인자로 받아서 T형을 리턴.
		//4) XXXtoYYYFunction : XXX를 인자로 받아서 yyy를 리턴.
		//5) toXXXFunction<T> : T를 받아서 XXX를 리턴
		//6) toXXXBiFunction<T,U> : T,U를 인자로 받아서 XXX를 리턴
		
		// 객체를 배열을 통한 람다식 실습.
		// 1) 핸드폰 객체 배열 만들기
			ArrayList <Product> pList = new ArrayList();
			pList.add(new Product("갤럭시 Z플립 4",1350000,55));
			pList.add(new Product("갤럭시 Z플립 3",990000,20));
			pList.add(new Product("갤럭시 Z폴드 4",1950000,80));
			pList.add(new Product("갤럭시 Z플드 3",1750000,45));
			pList.add(new Product("아이폰 14",1450000,5));
			pList.add(new Product("아이폰 14 mini",1050000,88));
			pList.add(new Product("아이폰 13 프로",1850000,75));
			
		//2) 해당상품들을 모두 팔게되면 남는 이윤을 계산할 수 있는 람다식 생성.
		// 	이윤 계산 => (Product.가격 * Product.재고)
		//  매개변수로 Product를 인자로 받아야함. 그리고 결과값을 int으로 반환해야함.
		ToIntFunction<Product> toIntFunction;
		
		toIntFunction = (product) -> {
			return product.getPrice() * product.getStock();
		};
		
		//4) 일반세모드 호출
		printProduct(pList, toIntFunction);
		
	}
	
	// 3) 생성한 람다식 함수를 활용한 객체배열 관리용 일반메소드 생성
	public static void printProduct(ArrayList<Product> pList, ToIntFunction<Product> toIntFunction ) {
		
		for(Product p : pList) {
			System.out.printf("%s 상품의 현재가격은 %d원이며, 모두 판매했을 때 이윤은 %d입니다.\n",
					p.getpName(),p.getPrice(),toIntFunction.applyAsInt(p));
		}
		
	}

}
