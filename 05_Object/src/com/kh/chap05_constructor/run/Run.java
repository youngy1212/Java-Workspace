package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class Run {

	public static void main(String[] args) {
		User u1 = new User(); 
		u1.setUserId("user01");
		u1.setUserPwd("1234");
		u1.setUserName("경민");
		System.out.println(u1.intfomation()); 
	
		User u2 = new User("user01","pass01","김수한"); //id ,pwd, name
		// 이렇게 하면 set메서드 필요없는거 아냐?
		// 비밀번호 변경 : set 으로 찾아 입력하면 되는데, 없다면 다시 생성자 작성해야됨.
		
		System.out.println(u2.intfomation()); 
	}
	
	

}
