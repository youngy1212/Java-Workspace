package com.kh.chap02_inherit.model.vo;

public class AirPlane extends Vehicle {
	private int tire;
	private int wing;
	
	public AirPlane() {
		
	}
	public AirPlane(String name, double mileage, String kind, int tire, int wing) {
		super(name, mileage, kind);
		this.tire = tire;
		this.wing = wing;
	}
	public int getTire() {
		return tire;
	}
	public void setTire(int tire) {
		this.tire = tire;
	}
	public int getWing() {
		return wing;
	}
	public void setWing(int wing) {
		this.wing = wing;
	}
	@Override 
	public String information() {
		return super.information()+", tire : "+ tire+", wing : "+ wing;
	}
	@Override
	public void howToMove() {
		System.out.println("바퀴를 데굴데굴 굴리면서 달리다 날개를 피면서 움직인다");
	}
	

}
