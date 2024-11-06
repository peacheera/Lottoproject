package oop.inheritence.test;

public class Kakao extends Company {
	
	String application;
	String messenger;
	
	String getName() {
		return "카카오";
		
	}
	
	@Override
	public String toString() {
		return "회사";
	
	}
	
	
}
