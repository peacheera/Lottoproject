package javabasic.oop.inheritance;

public class VehicleMain {
	public static void main(String[] args) {
		
		// toString 오버라이딩을 하지 않으면 object(최상위)를 호출
		Vehicle v1 = new Vehicle();	// 탈것
		System.out.println(v1); 		// vehicle 참조값, toString오버라이딩 하면 toString이 실행됨
		System.out.println(v1.getName());

		Vehicle v2 = new Car();	// 자동차
		System.out.println(v2);	// Car 참조값, toString오버라이딩 하면 toString이 실행됨
		System.out.println(v2.getName());
		
		Vehicle v3 = new Bicycle();	// 자전거
		System.out.println(v3);		// bicycle 참조값, toString오버라이딩 하면 toString이 실행됨
		System.out.println(v3.getName());
	
	// 어떤 참조값을 갖고있는지 > 타입
	}
}
