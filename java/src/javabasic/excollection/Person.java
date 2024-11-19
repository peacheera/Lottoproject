package javabasic.excollection;


public class Person {
	
	String name;
	String age;
	

	public void person() {
		
	}
	
	
	
	public Person(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}



	public String getName() {
		return name;
	}

	public String getJob() {
		return age;
	}
	
	@Override
	public String toString() {
		return name +"(은)는"+ age +"살 " ;
	}
	
}