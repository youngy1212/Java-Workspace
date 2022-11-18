package com.kh.chap05_constructor.model.vo;

public class User {
	
	//필드부
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	//생성자부
	/*
	 * 생성자
	 * [표현법]
	 * public 클래스명(매개변수(생략가능)){
	 * 		//해당 생성자를 통해서 객체 생성시 실행하고자 하는 코드;
	 * }
	 * 
	 * 생성자를 작성하는 목적
	 * 1. 객체를 생성해주기 위한 목적
	 * 2. 객체생성 뿐만 아니라 매개변수로 전달되니 값을 곧바로 필도로 대입(초기화)시킬 목적
	 * 
	 * 생성자 작성시 주의사항
	 * 1. 반드시 클래스명과 동일해야함(대/소문자 구분)
	 * 2. 반환형이 존재하지 않는다.(메소드와 유사하기 생겨서 헷갈릴수 있음)
	 * 3. 여러개 생성이 가능하지만 매개변수가 중복되면 안된다.
	 * 4. 매개변수 생성자를 명시적으로 작성하게 되면 기본생성자 JVM이 자동으로 만들어주지 않는다.
	 * 		즉, 어찌되었든 기본생성자는 항상 작성하는 습관을 들이자.
	 */
	
	public User() { //클래스와 동일! () 비워도 됨. 
		// student kim = new student() => student() 이게 생성자임. // jvm이 일단 자동으로 만들어줌
		/*
		 * 기본생성자(매개변수가 없는 생성자)
		 * 단지 객체를 생성(메모리영역에 공간확보)만을 목저을 할때 사용함.
		 * 기본생성자를 생략하는 경우 -> 오류나지않음.
		 * JVM이 클래스를 컴파일 할때 기본생성자 없는 경우 항상 자동으로 만들어주기 떄문.(매개변수 생성자가 없는 경우)
		 * 단, 매개변수가 있는 생성자가 이미 클래스 안에 작성되어 있는 경우 반드시 기본생성자도 함께 작성해줘야한다.
		 * 그러니 기본생성자를 작성하는 습관을 들이자.
		 */
		
		System.out.println("이거 출력 될까?"); //출력됨!
	} //아래 매개변수 함수가 있는 생성자가 있으려면 이거 기본생성자 있어야돼!
	
	public User(String userId, String userPwd, String userName) {
		this.userId = userId; //필드부안에 있는 userId에 대입하고 싶어~ 
		this.userPwd = userPwd;
		this.userName = userName;
		
	}
	
	public User(String userId, String userPwd, String userName, int age, char gender) {
		this(userId, userPwd, userName);
		/*
		 * 생성자 내부에서 생성자끼리 중복되는 코드가 있는 경우, this 생성자를 통해 같은 클래스 내에 있는 다른생성자
		 * 호출이 가능함. 단, 반드시 생성자 내부 첫 줄에 기술해야함.
		 */
		this.age = age;
		this.gender = gender;
	}
	
	//메서드부.
	public void setUserId(String userId){
		this.userId = userId;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGander(char gender) {
		this.gender = gender;
	}
	public String getUserId() {
		return userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}

	public String intfomation() {
		return userId + " "+ userPwd + " "+ userName+ " " +age +" "+ gender;
	}
}
