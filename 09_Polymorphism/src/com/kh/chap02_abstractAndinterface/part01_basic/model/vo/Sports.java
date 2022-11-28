package com.kh.chap02_abstractAndinterface.part01_basic.model.vo;

public abstract class Sports { // abstract 추상메서드가 하나라도 포함되있다면, 추상클래스로 만들어줘여함.

		private int people; // 스포츠에 참여하는 선수 명 수  
		

		public Sports() {
			super();
		}

		public Sports(int people) {
			super();
			this.people = people;
		}

		public int getPeople() {
			return people;
		}

		public void setPeople(int people) {
			this.people = people;
		}

		@Override
		public String toString() {
			return "Sports [people=" + people + "]";
		}
		
		/*
		 * 몸통부가 존재하지 않는 미완성 메소드 == 추상메소드
		 * 몸통부가 없는 미완성 메소드(추상메소드)를 정의하고자 하면 abstract 예약어를 사용 
		 * 
		 * 미완성 메소드가 하나라도 포함되는 순간 해당 클래스 또한 미완성 클래스(추상클래스)가 되어버린다.
		 * 클래스명 앞에 예약어 abstract를 적어줘야함.
		 */
		
		public abstract void rule();
		
}	
