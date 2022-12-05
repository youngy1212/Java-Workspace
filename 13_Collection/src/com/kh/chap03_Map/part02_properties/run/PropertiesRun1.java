package com.kh.chap03_Map.part02_properties.run;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap03_Map.part01_hashMap.model.vo.Snack;

public class PropertiesRun1 {

	public static void main(String[] args) {
		
		//Properties : Map 계열 -> key, value 세트로 저장
		//				단, Properties의 특징 : key, value 값 모두 String 으로 제한되어있음.
		
		Properties prop = new Properties(); // 이미 String으로 제한되어있어 <> 따로 없음.
		
		// String이 아닌 값을 넣게 될 경우
		// Map 계열이기 때문에 put메서드 활용가능.
		
		//prop.put("다이제", new Snack("초코맛",1000)); // 컴파일 에러 없음
		
		//System.out.println(prop); // {다이제=Snack [flavor=초코맛, calory=1000]}
		//System.out.println(prop.get("다이제")); //Snack [flavor=초코맛, calory=1000] 
		
		//단, 주로 Properties를 사용하는 경우 Properties에 담겨있는 key+Value값 세트들을 파일로 기록하기 위해 사용됨.
//		
//		try {
//			prop.store(new FileOutputStream("test.properties"),"Properties test");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} // 오류 => String 아닌 파일이 있어서.
		
		// Properties에 값을 추가할때는 보통
		// 1. setProperty(String key,String value)
		prop.setProperty("List", "ArrayList");
		prop.setProperty("set", "HashSet");
		prop.setProperty("Map", "HaspMap");
		prop.setProperty("Map", "Properteis");
		
		System.out.println(prop); // 저장순서 유지 X , key값 중복 안됨.
		
		// 값 가져오기
		// 2. getProperty(String key) : String
		System.out.println(prop.getProperty("set")); //HashSet

		
		//3. store(OutputStream os, String Comments) : Properties에 담긴 key - Value 값들을 파일로 출력
		try {
			prop.store(new FileOutputStream("test.properties"), "Properties Test");
			
		//4. storeToXML(OutputStream os, String Comments) : Properties에 담긴 key - Value 값들을 XML문서로 출력	
			prop.storeToXML(new FileOutputStream("test.xml"), "Properties Test");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	
	}
}
