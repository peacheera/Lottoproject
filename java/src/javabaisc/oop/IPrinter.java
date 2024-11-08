package javabaisc.oop;
//인터페이스
//public static , 상수 , 추상메소드
// 역할 : 프린터라면 구현해야하는 공통 기능들에 대한 명세를 작성
public interface IPrinter {
	
	// method prototype = method signature = 메소드 원형
	
	void turnOn(); // public abstract 생략
	void print();
	void turnOff();
	
}
