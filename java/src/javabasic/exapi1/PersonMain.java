package javabasic.exapi1;

public class PersonMain {
	public static void main(String[] args) {
	
		
		Person person1 = new Person("소서노", 22);
		Person person2 = new Person("고기동", 42);
		
		System.out.println(person1);
		System.out.println(person2);
		
		System.out.println(person1.equals(person2));
		
		
		
	}	
}
