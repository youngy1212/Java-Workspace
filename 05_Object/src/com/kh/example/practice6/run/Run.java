package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Book b = new Book();
		
		b.setTitle("해리포터");
		b.setAuthor("롤링");
		b.setPublisher("믿음사");
		b.setPrice(34000);
		b.setDiscountRate(0.02);
		b.inform();
	}
	
}
