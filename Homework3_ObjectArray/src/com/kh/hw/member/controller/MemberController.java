package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;


public class MemberController {
	
	private Member[] m = new Member[SIZE];
	public static final int SIZE = 10;
	
	
	public int existMemberNum() {
		int count = 0;
		
		for(Member member : m ) {
			if(member != null) {
				count++;
			}
		}
		return count;
	}
	
	public boolean checkId(String inputId) {

		for(Member member : m) {
			if(member != null && member.getId().equals(inputId)) {
				return false;
			} // member 값이 null인데 getId하면 null오류 
			// member != null 이 앞에서 false가 뜨면 뒤는 실행 X 오류 삭제
		}
		
		return true;
	}
	
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		m[existMemberNum()] = new Member(id,name,password,email,gender,age); 
	}
	
	public String searchId(String id) {
//		String search = "검색 결과가 없습니다.";
//		for(int i =0; i<existMemberNum(); i++) {
//			if(m[i].getId().equals(id)) {
//				search = "찾으신 결과 조회 결과 입니다."+ m[i].inform(); break;
//			}
//		}return search;
		
		for(Member member : m) {
			if(member != null && member.getId().equals(id)) {
				return member.toString();
			}
		}
		return "";
	}
	
	public Member[] searchName(String name) { // why? Member[]??? 일치하는 객체가 여러개일수 있어서

		Member[] members = new Member[SIZE];
		int index = 0;
		
		for(Member member : m) {
			if(members != null && member.getName().equals(name)) {
				members[index++] = member;
			}
		}
		return members;
	}
		
		
	public Member[] searchEmail(String email) { 

		Member[] members = new Member[SIZE];
		int index = 0;
		
		for(Member member : m) {
			if(members != null && member.getEmail().equals(email)) {
				members[index++] = member;
			}
		}
		return members;
	}
	
	public boolean updatePassword(String id, String password) {
		boolean updat = false;
//	
//		for(int i =0; i<existMemberNum(); i++) {
//			if(m[i].getId().equals(id)) {
//				m[i].setPassword(password); 
//				updat = false;
//				break;
//			}
		
		for(Member member : m) {
			if(member != null && member.getId().equals(id)) {
				member.setPassword(password);
				updat = true;
			}
			
		}
		return updat;
	}
	
	public boolean updateName(String id, String name) {
		boolean updat = false;
		
//		for(int i =0; i<existMemberNum(); i++) {
//			if(m[i].getId().equals(id)) {
//				m[i].setName(name); 
//				updat = false;
//				break;
//			}
//		}
		for(Member member : m) {
			if(member != null && member.getId().equals(id)) {
				member.setName(name);
				updat = true;
			}
			
		}
		
		return updat;
	}
	public boolean updateEmail(String id, String email) {
		boolean updat = false;
		
		for(Member member : m) {
			if(member != null && member.getId().equals(id)) {
				member.setEmail(email);
				updat = true;
			}
			
		}
		return updat;
	}
	public boolean delete(String id) {
		boolean dele = false;
		for(int i =0; i<SIZE; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				m[i] = null;
				dele = true;
				break;
		}
		
		}
		return dele;
	}
	public void delete() {
		
		m = new Member[SIZE]; // 새객체로 초기화
		
	}
	
	public Member[] printAll()  {
		return m;
	}	

}
