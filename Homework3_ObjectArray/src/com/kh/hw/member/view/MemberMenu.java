package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class MemberMenu {
	
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	
	public MemberMenu() {
		super();
	}
	
	public void mainMenu() {
		
		while(true) {
			if(mc.existMemberNum()== 10) {
				System.out.println("최대 등록 가능한 회원 수는 " + mc.SIZE+"명 입니다.");
				System.out.println("현재 등록된 회원 수는 "+mc.existMemberNum()+"명 입니다.");
				
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");
				System.out.print("메뉴 번호 : ");
				
				int num = sc.nextInt();
				switch(num) {
					case 2: searchMember(); break;
					case 3: updateMember(); break;
					case 4: deleteMember(); break;
					case 5: printAll();
					case 9: System.out.println("프로그램을 종료합니다.");return;
					default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); break;
				}	
				
				
			}else {
				System.out.println("최대 등록 가능한 회원 수는 " + mc.SIZE+"명 입니다.");
				System.out.println("현재 등록된 회원 수는 "+mc.existMemberNum()+"명 입니다.");
				
				System.out.println("1. 새 회원 등록");
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");
				System.out.print("메뉴 번호 : ");
				
				int num = sc.nextInt();
				
				switch(num) {
				case 1: insertMember(); break;
				case 2: searchMember(); break;
				case 3: updateMember(); break;
				case 4: deleteMember(); break;
				case 5: printAll();
				case 9: System.out.println("프로그램을 종료합니다.");return;
				default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); break;
					
				}
				
			}
		
		}
			
	}
	public void insertMember(){
		System.out.println("새 회원을 등록합니다.");
		sc.nextLine();
		String id1 = "";
		while(true){
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			boolean check = mc.checkId(id);
			if(check) {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			}else {
				id1 = id;
				break;
			}
		} 
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
	
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		
		char gender1;
		
		while(true){
			System.out.print("성별 : ");
			char gender = sc.nextLine().charAt(0);
			if(gender == 'm'||gender == 'n'||gender == 'f'||gender == 'F') {
				gender1 = gender;
				break;
			}else {
				System.out.println("성별을 다시 입력하세요.");
			}
		} 
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		mc.insertMember(id1, name, password, email, gender1, age);
	
			
	}
	public void searchMember(){
		
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 :");
	
		int num = sc.nextInt();
		
		switch(num) {
		case 1: searchId(); break;
		case 2: searchName(); break;
		case 3: searchEmail(); break;
		case 9: System.out.println("메인으로 돌아갑니다");return;
		default: System.out.println("잘못 입력하셨습니다."); return;
		}	

	}
	public void searchId() {
		sc.nextLine();
		System.out.print("검색할 아이디 :");
		String id = sc.nextLine();
		
		System.out.println(mc.searchId(id));
	
	}
	public void searchName() {
		sc.nextLine();
		System.out.print("검색할 이름:");
		String name = sc.nextLine();
		
		System.out.println(mc.searchName(name));
		
		//이름 검색을 위한 데이터를 사용자에게 입력 받는 메소드
		// 검색할 이름을 사용자에게 입력 받고 입력 받은 데이터를
		// mc의 searchName() 메소드의 매개변수로 넘김, 반환 값에 따라
		// 검색 결과 없으면 “검색 결과가 없습니다.” 출력 후 mainMenu()로 돌아감
		// 검색 결과가 있으면 “찾으신 회원 조회 결과입니다.” 출력 후
		// 회원 검색 결과 출력
		
		// 이거 물어보깅
		
	}
	public void searchEmail()  {
		sc.nextLine();
		System.out.print("검색할 이메일:");
		String email = sc.nextLine();
		
		System.out.println(mc.searchEmail(email));
		
		//이메일 검색을 위한 데이터를 사용자에게 입력 받는 메소드
		// 검색할 아이디를 사용자에게 입력 받고 입력 받은 데이터를
		// mc의 searchEmail() 메소드의 매개변수로 넘김, 반환 값에 따라
		// 검색 결과 없으면 “검색 결과가 없습니다.” 출력 후 mainMenu()로 돌아감
		// 검색 결과가 있으면 “찾으신 회원 조회 결과입니다.” 출력 후
		// 회원 검색 결과 출력
		
	}
	public void  updateMember()  {
		
		System.out.println("1. 비밀번호 수정하기");
		System.out.println("2. 이름 수정하기");
		System.out.println("3. 이메일 수정하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 :");
	
		int num = sc.nextInt();
		
		switch(num) {
		case 1: updatePassword(); break;
		case 2: updateName(); break;
		case 3: updateEmail(); break;
		case 9: System.out.println("메인으로 돌아갑니다");return;
		default: System.out.println("잘못 입력하셨습니다."); return;
		}	


	}
	public void  updatePassword() {
		sc.nextLine();
		System.out.print("수정할 회원의 아이디:");
		String id = sc.nextLine();
		
		System.out.print("수정할 회원의 비밀번호:");
		String password = sc.nextLine();
		
		if(mc.updatePassword(id,password)){
			System.out.println("존재하지 않는 아이디입니다.");
		}else {
			System.out.println("수정이 성공적으로 되었습니다.");
		}
		
	}
	public void updateName() {
		sc.nextLine();
		System.out.print("수정할 회원의 아이디:");
		String id = sc.nextLine();
		
		System.out.print("수정할 회원의 이름:");
		String name = sc.nextLine();
		
		if(mc.updateName(id,name)){
			System.out.println("존재하지 않는 아이디입니다.");
		}else {
			System.out.println("수정이 성공적으로 되었습니다.");
		}

	}
	public void updateEmail() {
		
		sc.nextLine();
		System.out.print("수정할 회원의 아이디:");
		String id = sc.nextLine();
		
		System.out.print("수정할 회원의 이메일:");
		String email = sc.nextLine();
		
		if(mc.updateEmail(id,email)){
			System.out.println("존재하지 않는 아이디입니다.");
		}else {
			System.out.println("수정이 성공적으로 되었습니다.");
		}
		
	}
	public void deleteMember() {
		
		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 :");
	
		int num = sc.nextInt();
		
		switch(num) {
		case 1: deleteOne(); break;
		case 2: deleteAll(); break;
		case 9: System.out.println("메인으로 돌아갑니다");return;
		default: System.out.println("잘못 입력하셨습니다."); return;
		}	

	}
	public void deleteOne()  {
		sc.nextLine();
		System.out.print("수정할 회원의 아이디:");
		String id = sc.nextLine();
		
		System.out.print("정말 삭제하시겠습니까?(y/n) : ");
		char del = sc.nextLine().charAt(0);
		
		if(del == 'y'|| del == 'Y'){
			if(mc.delete(id)){
				System.out.println("존재하지 않는 아이디입니다.");
			}else {
				System.out.println("성공적으로 삭제하였습니다.");
			}
		}
		
		
	}
	public void deleteAll()  {
		
		sc.nextLine();
		System.out.print("정말 삭제하시겠습니까?(y/n) : ");
		char del = sc.nextLine().charAt(0);
		
		if(del == 'y'|| del == 'Y'){
			mc.delete();
			
			System.out.println("성공적으로 삭제하였습니다.");
			}
		
		
	}
	public void printAll()   {
		//전체 회원을 출력하는 메소드
		// mc의 printAll() 메소드의 반환 값을 가지고 저장된 회원을 출력하는데
		// 저장된 회원의 수가 0명이면 “저장된 회원이 없습니다.” 출력,
		// 0명이 아니면 저장된 모든 회원의 정보 출력
		Member[] MemberList = mc.printAll();
		int count=0;
		for(int i =0; i<MemberList.length; i++) {
			if(i>0) {
			System.out.println(MemberList[i].toString());
			count++;
			}
		}
	
		if(count==0) {
			System.out.println("저장된 회원이 없습니다.");
		}
	}

}
