package com.kh.chap02_abstractNInterface.model.vo;

public interface Phone {
	
	char[] NUMBERPAD = {'1', '2','3','4','5','6','7','8', '9', '*','0', '#'};
	
	String makeCall();
	String takeCall();
}
