package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;


public class MemberController {
	
	private Member[] m = new Member[SIZE];
	public static final int SIZE = 10;
	
	
	public int existMemberNum() {
		int count = 0;
		
		for(int i = 0; i<m.length; i++) {
			if(m[i] != null) {
				count++;
			}
		}
		return count;
	}
	
	public Boolean checkId(String inputId) {
		//아이디 중복확인 하는 메소드
		
		
		return false;
	}
	
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		m[existMemberNum()] = new Member(id,name,password,email,gender,age);
	
	}
	
	public String searchId(String id) {
		String search = "검색 결과가 없습니다.";
		for(int i =0; i<existMemberNum(); i++) {
			if(m[i].getId().equals(id)) {
				search = "찾으신 결과 조회 결과 입니다."+ m[i].inform(); break;
			}
		}
		return search;
		
	}
	
	public String searchName(String name) { // why? Member[]???
		String search1 = "검색 결과가 없습니다.";
		for(int i =0; i<existMemberNum(); i++) {
			if(m[i].getId().equals(name)) {
				search1 = "찾으신 결과 조회 결과 입니다."+ m[i].inform(); break;
			}
		}
		return search1;
	}
		
		
	public String searchEmail(String email) { // why? Member[]???
		String search2 = "검색 결과가 없습니다.";
		for(int i =0; i<existMemberNum(); i++) {
			if(m[i].getId().equals(email)) {
				search2 = "찾으신 결과 조회 결과 입니다."+ m[i].inform(); break;
			}
		}
		return search2;
		//이메일로 회원을 조회하는 메소드
	}
	
	public Boolean updatePassword(String id, String password) {
		Boolean updat = true;
	
		for(int i =0; i<existMemberNum(); i++) {
			if(m[i].getId().equals(id)) {
				m[i].setPassword(password); 
				updat = false;
				break;
			}
		}
		return updat;
	}
	
	public Boolean updateName(String id, String name) {
		Boolean updat = true;
		
		for(int i =0; i<existMemberNum(); i++) {
			if(m[i].getId().equals(id)) {
				m[i].setName(name); 
				updat = false;
				break;
			}
		}
		return updat;
	}
	public Boolean updateEmail(String id, String email) {
		Boolean updat = true;
		
		for(int i =0; i<existMemberNum(); i++) {
			if(m[i].getId().equals(id)) {
				m[i].setEmail(email);
				updat = false;
				break;
			}
		}
		return updat;
		
	}
	public Boolean delete(String id) {
		Boolean dele = true;
		for(int i =0; i<existMemberNum(); i++) {
			if(m[i].getId().equals(id)) {
				m[i] = null;
				dele = false;
				break;
			}
		}	
		
		return dele;
	}
	public void delete() {
		//전체 회원을 삭제하는 메소드
		Member m = null;
		
	}
	
	public Member[] printAll()  {
		Member[] MemberList = new Member[SIZE];
		
		for(int i =0; i< existMemberNum(); i++) {
			MemberList[i] = m[i];
		}
		return MemberList;
	}
	
	

}
