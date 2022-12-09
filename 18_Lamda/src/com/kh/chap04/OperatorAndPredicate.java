package com.kh.chap04;

import java.util.ArrayList;
import java.util.function.Predicate;

import com.kh.model.vo.Product;

public class OperatorAndPredicate {
	/*
	 * Operator 인터페이스 특징
	 * 1. 단순연산시 사용
	 * 2. 받아온 타입, 혹은 인자를 통해 계산을 하고 해당 타입 그대로 반환
	 * 
	 * Predicate 특징 
	 * 1. 매개변수로 넘어온 값을 "검증" 할 때 사용
	 * 2. 받아온 타입을 확인하고 boolean 값을 반환
	 */

	public static void main(String[] args) {
		//Predicate<T> : T 형을 인자로 받아서 true or false 값을 리턴.
		// Product 클래스를 인자로 받아서, 재고가 있다면 true 없으면 false 값을 반환 
		
		Predicate<Product> checkStock = product -> product.getStock() > 0;
		
		ArrayList <Product> pList = new ArrayList();
		pList.add(new Product("갤럭시 Z플립 4",1350000,55));
		pList.add(new Product("갤럭시 Z플립 3",990000,0));
		pList.add(new Product("갤럭시 Z폴드 4",1950000,80));
		pList.add(new Product("갤럭시 Z플드 3",1750000,45));
		pList.add(new Product("아이폰 14",1450000,5));
		pList.add(new Product("아이폰 14 mini",1050000,0));
		pList.add(new Product("아이폰 13 프로",1850000,75));
		
		
		for(Product p : pList) {
			if(checkStock.test(p)) {
				System.out.println(p.getpName()+"은 재고가 있습니다.");
			}else {
				System.out.println(p.getpName()+"은 재고가 없습니다.");
			}
		}
		
		
		
		
	}

}
