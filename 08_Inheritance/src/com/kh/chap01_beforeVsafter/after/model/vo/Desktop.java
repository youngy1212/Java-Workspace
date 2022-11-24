package com.kh.chap01_beforeVsafter.after.model.vo;

			// 자식,후손 		//부모,조상
			// 하위			//상위
public class Desktop extends Product {
	private boolean allInOne;
	
	public Desktop(){
		
	}
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		// super => 부모클래스의 주소값을 보관하고 있음.(즉, super.으로 부모에 접근가능)
		// brand, pCode, pName, price 를 부모 클래스의 product에 있는 필드에 초기화(대입)
		
		// 해결방법 1. 부모클래스의 필드를 자식까지는 접근가능하도록 접근제한자를 변경
		// 			prviate -> protected로 변경 
//		super.brand = brand;
//		super.pCode = pCode;
//		super.price = price;
//		super.pName = pName;
		
		// 해결방법 2. 부모클래스에서 접근할수 있는(public)set 메서드 활용.
//		super.setBrand(brand);
//		super.setpCode(pCode);
//		super.setpName(pName);
//		super.setPrice(price);
		// 해결방법 3. 부모생성자 호출하기 단, 반드시 첫줄에 기술되어야한다. 
		super(brand, pCode, pName, price);
		this.allInOne = allInOne;
		
	}
	public void setAllInOne(boolean allInOne) {
		this.allInOne =  allInOne;
	}
	public boolean getAllInOne() {
		return allInOne;
	}
	
	//오버라이딩 : 부모클래스의 메소드를 내 입맛대로 정의하는 것
	public String intformation() {
		return super.infromation()+", allInOne :"+ allInOne;
	}

}
