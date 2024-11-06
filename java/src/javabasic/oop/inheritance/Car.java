package javabasic.oop.inheritance;

public class Car extends Vehicle {
	
	private int tireCount;
	
	@Override // 도우미
	String getName() {
		return "자동차";
	}
	
	// vehicle클래스의 toString 메서드를 오버라이딩
	@Override
	public String toString() {
		return "Car의 toString";
	}
}
