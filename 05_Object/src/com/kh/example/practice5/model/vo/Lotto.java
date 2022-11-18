package com.kh.example.practice5.model.vo;

public class Lotto {
	
	private int [] lotto  = new int[6];
	
	{
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45*10);
		}
	}
	


}
