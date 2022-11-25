package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.*;

public class LibraryController {
	
	private Member mem = null; // why?
	private Book[] bList = new Book[5];
	
	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBooK("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBooK("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);

	}
	
	
	public void insertMember(Member mem) {
		this.mem = mem;
	}
	
	public Member myInfo() {
		return mem;
	}
	
	public Book[] selectAll() {
		return bList;
	}
	
	public Book[] searchBook(String keyword) {
		Book[] books = new Book[5];
		int index = 0;
		
		for(Book bk : bList) {
			if(bk.getTitle().contains(keyword)) { // 포함의 개념
			 books[index++] = bk;
			}
		}
		return books; 
	}
	
	public int rentBook(int index) {
		int result = 0;
		Book bk = bList[index];
		
		if(bk instanceof AniBooK){
			if(mem.getAge() < ((AniBooK) bk).getAccessAge()) {
				result = 1;
			}
		}else {
			if(((CookBook)bk).isCoupon()) {
				int couponCount = mem.getCouponCount();
				mem.setCouponCount(mem.getCouponCount()+1);
				result = 2;
			}
		}
		return result;
	}
	
}
