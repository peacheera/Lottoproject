package javabasic.oop.inheritance;

public class Main {

	public static void main(String[] args) {

//		child 타입의 객체를 생성
//		child가 parent를 상속 받았으므로 parent타입의 객체가 생성된 후에
//		child 타입의 객체가 생성될 수 있다.
		Child child = new Child();
		                 
		System.out.println(child.si);
		System.out.println(child.nsi);
		child.sm();
		child.m();
		System.out.println();
		System.out.println();
	}
}
