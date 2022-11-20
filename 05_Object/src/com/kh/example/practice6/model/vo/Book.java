package com.kh.example.practice6.model.vo;

public class Book {
	
	private String title = " ";
	private String publisher = " ";
	private String author = " ";
	private int price = 0;
	private double discountRate = 0.0;
	
	public Book() {
		
	}
	
	public Book(String title, String publishe,String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	
	public Book(String title, String publishe,String author,int pirce, 
			double discountRate) {
		this(title, publishe,author);
		this.price = pirce;
		this.discountRate = discountRate;
	}
	
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public void inform() {
		System.out.println(publisher + "에서 출간한 "+ author+"의 " + title+"는 정가" +price+"원 입니다."
		+ "할인율 "+discountRate);
	}
	
	
}
