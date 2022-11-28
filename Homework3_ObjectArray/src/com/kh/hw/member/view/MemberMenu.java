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
			System.out.println("최대 등록 가능한 회원 수는 " + mc.SIZE+"명 입니다.");
			System.out.println("현재 등록된 회원 수는 "+mc.existMemberNum()+"명 입니다.");
			
			if(mc.existMemberNum() != 10) {
				System.out.println("1. 새 회원 등록");
			}	
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");
				System.out.print("메뉴 번호 : ");
				
				int num = sc.nextInt();
				sc.nextLine();
				switch(num) {
				case 1: 
					if(mc.existMemberNum() != 10) {
						insertMember();
						}else{
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
						}
					break;
				case 2: searchMember(); break;
				case 3: updateMember(); break;
				case 4: deleteMember(); break;
				case 5: printAll(); break;
				case 9: System.out.println("프로그램을 종료합니다.");return;
				default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요."); break;
					
				}
				
			}
			
	}
	public void insertMember(){
		
		System.out.println("새 회원을 등록합니다.");
		String id; // id라는 변수가 while문 안에서만 사용가능한 지역변수가 되어 위쪽에 선언
		while(true){
			System.out.print("아이디 : ");
			id = sc.nextLine();
			if(mc.checkId(id)) { //true => 중복아이디 없음.
				break;
			}
		}
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
	
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		
		char gender;
		
		while(true){
			System.out.print("성별(M/F) : ");
			gender = sc.nextLine().charAt(0);
			if(gender == 'm'||gender == 'n'||gender == 'f'||gender == 'F') {
				break;
			}else {
				System.out.println("성별을 다시 입력하세요.");
			}
		} 
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		mc.insertMember(id, name, password, email, gender, age);
	
			
	}
	public void searchMember(){
		
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 :");
		
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1: searchId(); break;
			case 2: searchName(); break;
			case 3: searchEmail(); break;
			case 9: System.out.println("메인으로 돌아갑니다");return;
			default: System.out.println("잘못 입력하셨습니다."); return;
			}	
	}
	
	public void searchId() {
		
		System.out.print("검색할 아이디 :");
		String id = sc.nextLine();
		
		//System.out.println(mc.searchId(id));
		String reslut = mc.searchId(id);
		if(reslut.equals("")) {
			System.out.println("검색결과가 없습니다.");
		}else {
			System.out.println("찾으신 회원 조회결과입니다.");
			System.out.println(reslut);
		}
	}
	
	public void searchName() {
		sc.nextLine();
		System.out.print("검색할 이름:");
		String name = sc.nextLine();
		
		Member[] members = mc.searchName(name);
		if(members[0] == null) {
			System.out.println("검색결과가 없습니다.");
		}else {
			for(Member member : members) {
				System.out.println(member.inform());
			}
		}
	
		
	}
	public void searchEmail()  {
		sc.nextLine();
		System.out.print("검색할 이메일:");
		String email = sc.nextLine();
		
		Member[] members = mc.searchName(email);
		if(members[0] == null) {
			System.out.println("검색결과가 없습니다.");
		}else {
			for(Member member : members) {
				System.out.println(member.inform());
			}
		}
		
	}
	public void  updateMember()  {
		
		System.out.println("1. 비밀번호 수정하기");
		System.out.println("2. 이름 수정하기");
		System.out.println("3. 이메일 수정하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 :");
	
		int num = sc.nextInt();
		sc.nextLine();
		
		switch(num) {
		case 1: updatePassword(); break;
		case 2: updateName(); break;
		case 3: updateEmail(); break;
		case 9: System.out.println("메인으로 돌아갑니다");
		default: System.out.println("잘못 입력하셨습니다.");
		}	


	}
	public void  updatePassword() {
		sc.nextLine();
		System.out.print("수정할 회원의 아이디:");
		String id = sc.nextLine();
		
		System.out.print("수정할 회원의 비밀번호:");
		String password = sc.nextLine();
		
		if(mc.updatePassword(id,password)){
			System.out.println("수정이 성공적으로 되었습니다.");
		}else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
		
	}
	public void updateName() {
		sc.nextLine();
		System.out.print("수정할 회원의 아이디:");
		String id = sc.nextLine();
		
		System.out.print("수정할 회원의 이름:");
		String name = sc.nextLine();
		
		if(mc.updateName(id,name)){
			System.out.println("수정이 성공적으로 되었습니다.");
		}else {
			System.out.println("존재하지 않는 아이디입니다.");
		}

	}
	public void updateEmail() {
		
		sc.nextLine();
		System.out.print("수정할 회원의 아이디:");
		String id = sc.nextLine();
		
		System.out.print("수정할 회원의 이메일:");
		String email = sc.nextLine();
		
		if(mc.updateEmail(id,email)){
			System.out.println("수정이 성공적으로 되었습니다.\"");
		}else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
		
	}
	public void deleteMember() {
		
		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 :");
	
		int num = sc.nextInt();
		sc.nextLine();
		
		switch(num) {
		case 1: deleteOne(); break;
		case 2: deleteAll(); break;
		case 9: System.out.println("메인으로 돌아갑니다"); break;
		default: System.out.println("잘못 입력하셨습니다."); 
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
				System.out.println("성공적으로 삭제하였습니다.");
			}else {
				System.out.println("존재하지 않는 아이디입니다.");
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
		if(mc.existMemberNum() == 0) {
			System.out.println("저장된 회원이 없습니다.");
		}else {
			
			Member[] members = mc.printAll();
			for(Member member : members) {
				if(member != null) {
				System.out.println(member.inform());
			
				}
			}
		}
	}

}
