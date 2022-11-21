package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Book b = new Book();
		b.inform();
		
		Book b2 = new Book("자바의 정석","나무","김홍홍"); 
		b2.inform();
		
		Book b3 = new Book("자바의 정석","나무","김홍홍",15000,0.0);
		b3.inform();
	}
	
}
