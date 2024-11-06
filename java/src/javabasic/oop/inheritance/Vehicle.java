package javabasic.oop.inheritance;

public class Vehicle {// extends object 생략 

	private String name; // 이름
	private boolean hasEngine; // 엔진보유여부
	
	String getName() {
		return "탈것";
	}
	
	
	// object의 toString메서드 오버라이딩
	@Override
	public String toString() {
		return "Vehicle의 toString";
	}





}

