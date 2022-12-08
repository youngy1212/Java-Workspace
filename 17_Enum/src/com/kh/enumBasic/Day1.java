package com.kh.enumBasic;

// 1) 기본 사용법 
public enum Day1 {

	MONDAT,
	TUESEDAY,
	WENDSDAY,
	THURSDAT,
	FRTDAT,
	SATURSDAT,
	SUNDAT,
	MONDAY,
}

//2) enum안에 각 상수요소마다 값을 더 추가시키고 싶은 경우
//	비슷한 상수필드끼리 매칭시킬때 사용함

enum Day2{
	//1) 각 요소마다 우측에 매칭시킬 갓을 추가함.
	MONDAY("MON"),
	TUESEDAY("TUE"),
	WENDSDAY("WENS"),
	THURSDAY("THUR"),
	FRTDAY("FRI"),
	SATURSDAY("SAT"),
	SUNDAY("SUM");
	
	//2) 매칭시킬 값으 자료형으로 필드값 추가
	
	private final String shortName;
	
	//3) 생성자 추가
	Day2(String shortName){
		this.shortName = shortName;
	}
	
	
	//4)geter메서드 작성
	public String shortName() {
		return shortName;
	}
	
}

//매핑 시킬 값이 여러개인 경우
enum Day3{
	
	MONDAY("MON", 1),
	TUESEDAY("TUE", 2),
	WENDSDAY("WENS", 3),
	THURSDAY("THUR",4),
	FRTDAY("FRI",5),
	SATURSDAY("SAT",6),
	SUNDAY("SUM",7);
	
	
	//2) 매칭시킬 값으 자료형으로 필드값 추가
	
	private final String shortName;
	private final int day;
	
	//3) 생성자 추가
	Day3(String shortName, int day){
		this.shortName = shortName;
		this.day = day;
		
	}
	
	//4)geter메서드 작성
	public String shortName() {
		return shortName;
	}
	
	public int day() {
		return day;
	}
	
	//필드 값을 통해 enum을 찾는 메서드 추가
	public static Day3 valueOfSortName(String shortName) {
		Day3 days[] = Day3.values();
		for(int i =0; i<days.length; i++) {
			if(days[i].shortName.equals(shortName)) {
				return days[i];
				
			}
		} 
		return null;
	}
	
	public static Day3 valueOfDay(int day) {
		Day3 days[] = Day3.values();
		for(Day3 d : days) {
			if(d.day == day) {
				return d;
		}
	}
		return null;
	
	}
}

//함수추가
enum Day4{
	//1) 각 요소마다 우측에 매칭시킬 값을 추가함.
	MONDAY("MON",1) {
		@Override
		//함수추가 2단계 ) 추상 메서드를 상수필드에 오버라이딩 (방법 1)
		public void printDay() {System.out.println("월요일입니다.");}
	},	
	TUESEDAY("TUE",2){
		@Override
		public void printDay() {System.out.println("화요일입니다.");}
	},	
	WENDSDAY("WENS",3){
		@Override
		public void printDay() {System.out.println("수요일입니다.");}
	},	
	THURSDAY("THUR",4){
		@Override
		public void printDay() {System.out.println("목요일입니다.");}
	},	
	FRIDAY("FRI",5) {
		@Override
		public void printDay() {System.out.println("금요일입니다.");}
	},	
	SATURSDAY("SAT",6){
		@Override
		public void printDay() {System.out.println("토요일입니다.");}
	},	
	SUNDAY("SUM",7){
		@Override
		public void printDay(){System.out.println("토요일입니다.");}
	};	
	
	//2) 매칭시킬 값으 자료형으로 필드값 추가
	
	private final String shortName;
	private final int day;
	
	//3) 생성자 추가
	Day4(String shortName, int day){
		this.shortName = shortName;
		this.day = day;
		
	}
	
	
	//4)geter메서드 작성
	public String shortName() {
		return shortName;
	}
	
	public int dat() {
		return day;
	}
	
	//필드 값을 통해 enum을 찾는 메서드 추가
	public static Day4 valueOfSortName(String shortName) {
		Day4 days[] = Day4.values();
		for(int i =0; i<days.length; i++) {
			if(days[i].shortName.equals(shortName)) {
				return days[i];
				
			}
		} 
		return null;
		
	}
	
	public static Day4 valueOfDay(int day) {
		Day4 days[] = Day4.values();
		for(Day4 d : days) {
			if(d.day == day) {
				return d;
		}
	}
		return null;
	}
	
	public void printDay1() {
		switch(this) { 
		case MONDAY :  System.out.println("월요일입니다."); break;
		case TUESEDAY : System.out.println("화요일입니다."); break;
		case WENDSDAY : System.out.println("수요일입니다."); break;
		case THURSDAY : System.out.println("목요일입니다."); break;
		case FRIDAY : System.out.println("금요일입니다."); break;
		case SATURSDAY : System.out.println("토요일입니다."); break;
		case SUNDAY :System.out.println("일요일입니다."); break;
		}
	} //방법 2. 
	
	//방법 1 . 추상메소드 오버라이딩. : 이쪽을 권장
	public abstract void printDay();

}


