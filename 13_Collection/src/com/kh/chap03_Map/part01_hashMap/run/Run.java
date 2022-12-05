package com.kh.chap03_Map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_Map.part01_hashMap.model.vo.Snack;

public class Run {

	public static void main(String[] args) {
		
		HashMap<String, Snack> hm = new HashMap<>();
		
		/*
		 * 계층구조를 보면 List나 Set 계열은 Collection을 구현하는 클래스 -> 데이터를 추가할 때 add 메소드 사용
		 * 단, Map은 아님 -> 데이터를 추가할 때 put메소드 사용(key + value 세트로 추가)
		 */
		
		//List set -> collection 상속 map 상속X
		
		//1. put(k key, V value) => map 공간에 key+value 세트로 추가해주는 메소드
		hm.put("다이제", new Snack("초코맛", 1500));
		hm.put("칸초", new Snack("단맛",900));
		hm.put("포카칩", new Snack("짠맛", 1000));
		hm.put("포테이토칩", new Snack("짠맛", 1000));
		
		System.out.println(hm);
		//1. 저장순서 유지 X
		//2. value 값이 동일하다고 해도, key값이 중복되지 않기 떄문에 잘 저장됨.
		
		hm.put("포카칩", new Snack("매운맛", 1200));
		//중복된 key 값은 value 값으로 덮어씌우기 됨.
		System.out.println(hm);
		
		
		//2. get(Object key) : V => 컬렉션에서 해당 키 값의 value 값을 돌려주는 메소드
		System.out.println(hm.get("다이제")); // Snack [flavor=초코맛, calory=1500] value 값만 반환
		
		Snack s = hm.get("칸초"); // 제네릭 설정을 해놨기 떄문에 Snack타입 객체로 강제 형변환 하는 과정이 생략되었다.
		System.out.println(s); //Snack [flavor=단맛, calory=900]
		
		
		//3. size() => 컬렉션에 담겨있는 갯수
		System.out.println("Size : "+hm.size()); //4
		
		//4. replace( k key, V value) => 컬렉션에서 해당 key값을 찾아내서 새로 전달된 value로 변경해주는 메소드
		hm.replace("포테이토칩",new Snack("겁나짠맛",1500) );
		System.out.println(hm);
		
		// 키 값으로 찾는 대상이 없다면, 그대로 끝.  but, put의 경우 없을 경우 새로 추가함.
	
		//5. remove(Object key) => 컬렉션의 해당 key 값을 찾아서 key+value 값을 동시에 지워주는 메소드.
		hm.remove("포테이토칩");
		System.out.println(hm); 
		
		System.out.println("=====================================================");
		
		// 순차적으로 HashMap 안에 담겨있는 값에 접근하고자 할 떄??
		
		// for문 사용불가.
		
		// List와 map은 다른계열이기 때문에 ArrayList에 담은 후 출력 불가.
		// ArrayList list = new ArrayList(hm); 안됨~
		
		// iterator()는 List와 set 계열에만 쓰는 메소드기 떄문에 바로 사용불가.
		// Iterator it = hm.Iteratro();
		
		// Map을 set으로 변경해주는 메소드가 있음.
		// HashMap => set계열로 바꿔서 => Iterator 호출
		
		// 1. keyset() 이용하는 방법
		// 1) hm에 있는 key값들만 set에 담는 방법
		
		Set<String> keySet = hm.keySet();
		System.out.println(keySet);//[다이제, 포카칩, 칸초] 
		
		//2) 1번 과정에서 작업된 keySet을 Iterator에 담기
		Iterator<String> itkey =keySet.iterator();
		
		//3) 반복자에 담긴 값들을 순차적으로 뽑기
		while(itkey.hasNext()) {
			String key =itkey.next();
			Snack value = hm.get(key);
			System.out.println("key: "+key);
			System.out.println("value : "+value);
			
		}
		
		System.out.println("=====================================================");
		
		//2. entrySet() 이용방법
		//1) hm에 있는 key+value값 모두 (Entry) set에 담기 (Entry : 집합 형태)
		Set<Entry<String,Snack>> entrySet =hm.entrySet();
		
		//2) entrySet에 있는 것들을 Iterator에 담기
		Iterator<Entry<String, Snack>> inEntry = entrySet.iterator();
		
		//3) 반복자를 이용해서 순차적으로 값을 뽑기while(itkey.hasNext()) 
		while(inEntry.hasNext()){
			Entry<String, Snack> entry = inEntry.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		//1+2) 한번에
		Iterator<Entry<String, Snack>> inEntryset = hm.entrySet().iterator();
				
		// 1+2+3) 한번에
				
		for(Entry<String, Snack> entry : hm.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		
		
	}

}
