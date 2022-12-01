package com.kh.chap04_assist.model.dao;

import java.io.*;

public class BufferedDao {
	//BufferedReader / BufferedWriter 
	
	//프로그램 --> 파일
	
	public void fileSave() {
		
		
		//BufferedWriter bw =null;
//		
//		try {
//			/*
//			 * 1. 기반스트림(FileWriter) 객체 먼저 생성
//			 * 보조 스트림도 Reader / Writer 계열이면 기반스트림도 Reader / Writer 
//			 * 보조 스트림도 Input / Output 계열이면 맞게 기반스트림도 Input/ output 계열
//			 * 
//			 */
//			bw = new BufferedWriter(new FileWriter("c_buffer.txt")); //기반스트림을 연결해야지 buffered 보조 사용가능.
//			bw.write("안녕하세요");
//			bw.newLine();
//			bw.write("안녕하세요.\n");
//			bw.write("안녕히 가세요.");
//			
//			
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				bw.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		
		//try ~ with ~ resource 구분 (JDk 7버전 이상부터만 사용가능)
		/*
		 * try(스트림 객체 생성;){
		 * 	//예외가 발생할 수 있는 구문
		 * } catch(예외클래스명 e){
		 * 	//예외발생시 실행할 구문
		 * }
		 * 
		 * 스트림 객체 try(여기)에 넣어버리면
		 * 스트림 객체 생성 후 해당 블록의 구문이 실행 완료되면 알아서 자원이 반납됨.
		 * 
		 */
		
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"))){
			bw.write("안녕하세요");
			bw.newLine();
			bw.write("안녕하세요.\n");
			bw.write("안녕히가세요.");
		} catch (IOException e) {
			e.printStackTrace();
		} //알아서 자원이 반납 finally 필요없음
	}
	
	//프로그램 < -- 파일
	public void fileRead() {
		// FileReader : 기반
		// BufferedReader : 보조
		
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))){
			
			
			String value =null;
			while(( value = br.readLine() )!= null){ // -1 로 비교불가 왼쪾 string 오른쪽 int 비교불가능 
				//readLine => 더이상읽을 문자가 없다면 null 값 반환
				System.out.println(value);
			}
			
			
		} catch (FileNotFoundException e) { // file예외처리만 하려고했는데...
			e.printStackTrace();
		} catch (IOException e) { // 자동으로 close메소드가 실행되어. 해당 메소드 예외처리까지 한번에 됨. 
			e.printStackTrace();
		}
		
		
	}
	
	

}
