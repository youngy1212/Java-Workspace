package com.kh.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMethod {

	public static void main(String[] args) {
		//stream에서 원하는 값을 얻어내기 위한 메소드들
		
		//1) filter : 조건에 맞는 값만 추려주는 메소드
		
		String [] food = {"감자","만두","김치","고구마","고구마","옥수수","감자","양배추" };
		
		//음식이름이 "감"으로 시작하는 음식만 추리기.
		
		
		Arrays.stream(food)
				.filter( foods -> foods.charAt(0) == '감')
				.forEach( System.out :: println); //forEachh (food -> sysout(food))
		
		System.out.println("=========================");
		
		//2 distinct() : 중복값을 제거해주는 메소드
		List <String> arr = Arrays.asList(food); // 배열 -> 컬렉션
		
		arr.stream()
			.distinct()
			.filter(foods -> foods.charAt(0) == '감')
			.forEach(System.out :: println);
		
		//3) map관련 메소드들
		//3_1) mapXXX : 현재요소를 XXX로 대체하여 스트림 반환
		
		System.out.println("-------------------------map--");
		
		arr.stream()
			.map(foods -> {
				if(foods.equals("감자")) {
					return foods + "맛없다.";
				}else {
					return foods+"맛있다.";
				}
			})
			.forEach(System.out :: println);
		
		
		
		//3_2) flatMapXXX : 특정요소가 여러개의 요소로 대체되는 스트림 반환
		List <String> arr2 = Arrays.asList(new String [] {"마라탕 훠궈 양꼬치 김밥","경민 호호"});
		
		// 스페이스바 기준으로 각각의 요리를 String 요소로 만들기 
		
		arr2.stream()
			.flatMap(foods -> Arrays.stream(foods.split(" ")) )
			.forEach(System.out :: println);
		
		//3_3) asXXXStream() , boxed() : 형변환 관련 메소드
		int [] iArr = {1,3,5,7,9};
		
		//double로 형 변환하여 출력
		
		Arrays.stream(iArr)
				.asDoubleStream()
				.forEach(System.out :: println);
		
		Arrays.stream(iArr)
				.boxed() //Integer 변환
				.forEach( i -> System.out.println(i.hashCode()));
		
		//4) sorted() : 정렬
		
		
		//5) 루프메서드
		//5_1) forEach : 최종처리 스트림. 마지막에 호출해야 정상적으로 작동함. 
		//5_2) peek : 중간처리 메서드, 중간에 호출해야 정상 작동함.
		
		System.out.println("---------peek-----------");
		arr.stream()
			.distinct()
			.filter(foods -> foods.length() == 3)
			.peek( System.out :: println ) // 출력안댕... 최종처리 스트림이 없어서. 
			.findAny() // 최종처리까지 있어야 중간처리도 호출
			.orElse(null);
		
		/*
		 * 6) 집계함수들
		 * 	스트림의 마지막에 사용한다.
		 *	count() : 갯수 반환  
		 * 	sum() : 합계 반환
		 * 	max() : 최대값 반환
		 * 	min() : 최소값 반환
		 * 
		 * 7) 그외~
		 * 	findFirst() : 스트림의 첫번째 요소 반환
		 * 	findAny() : 스트림에 값이 있다면 아무값이나 반환
		 * 	orElse(대체값) : 값이 저장되어있지 않다면 대체값 설정 가능
		 * 
		 */
		
		
	}
}
