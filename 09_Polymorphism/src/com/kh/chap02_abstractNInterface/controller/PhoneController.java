package com.kh.chap02_abstractNInterface.controller;

import com.kh.chap02_abstractNInterface.model.vo.*;

public class PhoneController {
	
	private String result[] = new String[2];
	
	public String[] method() {
		Phone[] p2 = new Phone[2];
		String[] pp = new String[2];
		
		p2[0]= new GalaxyNote9();
		p2[1]= new V40();
		
		for(int i =0; i<result.length; i++) {
			if(p2[i] instanceof V40 ) {
				pp[i] = ((V40)p2[i]).printInformation();
			}else {
				 pp[i] = ((GalaxyNote9)p2[i]).printInformation();
			}
		
		}
		return pp;
		
		
	}
}
