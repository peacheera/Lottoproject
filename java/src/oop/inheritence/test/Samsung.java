package oop.inheritence.test;

public class Samsung extends Company {
		
	String cellPhone;
	String semiconductor;

	
	String getName() {
		return "삼성";
		
	}
	
	@Override
	public String toString() {
		return "회사";
	
	}
	
}
