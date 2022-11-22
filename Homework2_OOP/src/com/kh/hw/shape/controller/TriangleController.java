package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class TriangleController {
	
	private Shape s = new Shape();
	
	
	public double calcArea(double height, double width) {
		s = new Shape(3 ,height,width); //매개변수 있는 생성자로 값을 초기화
		return height*width/2;
	}
	public void paintColor(String color) {
		s.setColor(color);
		
	}
	
	public String Print() {
		return "삼각형 "+ s.information();
	}

}
