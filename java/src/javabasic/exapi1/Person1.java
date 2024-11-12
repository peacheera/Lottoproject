package javabasic.exapi1;

public class Person1 {
	
	String name;
	int age;
	
	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	
	}

	@Override
	public String toString() {
		return this.name + " " + equals(age);
	
	}
	
	@Override
	public boolean equals(Object obj) {
		return name.equals(((Person)obj).name) &&
				age ==((Person)obj).age;
		}	
	}
