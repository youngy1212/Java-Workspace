package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.*;

public class LibraryMenu {
	LibraryController lc = new LibraryController();
	Scanner sc = new Scanner(System.in);
	
	
	public void mainMenu() {
		
		System.out.print("이름 :");
		String name = sc.nextLine();
		System.out.print("나이 :");
		int age = sc.nextInt();
		
		sc.nextLine();
		System.out.print("성별 :");
		char gender = sc.nextLine().charAt(0);
		
		Member mem = new Member();
		mem.setAge(age);
		mem.setName(name);
		mem.setGender(gender);
		
		lc.insertMember(mem);
		
		//회원등록부
		
		while(true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1.마이페이지");
			System.out.println("2.도서 전체 조회");
			System.out.println("3.도서 검색");
			System.out.println("4.도서 대여하기");
			System.out.println("프로그램 종료하기");
			System.out.print("메뉴번호 :");
			int num = sc.nextInt();
			
			switch(num) {
			case 1: System.out.println(lc.myInfo()); break;
			case 2: selectAll(); break;
			case 3: searchBook();break;
			case 4: rentBook(); break;
			case 9: 
			default : return; 
			}
		}	
	
	}
	
	public void selectAll() {
		Book[] bList = lc.selectAll();
		
		for(int i =0; i< bList.length; i++) {
			System.out.println(i+"번 도서 : "+ bList[i]);
		}
		
		
	}
	
	public void searchBook() {
		System.out.print("검색할 키워드 : ");
		sc.nextLine();
		
		String keyword = sc.nextLine();
		Book[] searchList = lc.searchBook(keyword);

		for(int i =0; i< searchList.length; i++) { //null
			if(searchList[i] != null) {
			System.out.println(i+"번 도서 : "+ searchList[i]);
			}
		}	
			
	}
	
	public void rentBook() {
		lc.selectAll();
		
		System.out.print("대여할 도서 번호 선택 : ");
		int num = sc.nextInt();
		int result = lc.rentBook(num);
		
		switch(result) {
		case 0: System.out.println("성곡적으로 대어되었습니다.");break;
		case 1: System.out.println("나이제한으로 대여 불가능입니다."); break;
		case 2: System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요."); break;
		default : 
		}
	}

}
