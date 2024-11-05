package javabaisc.oop;

// JavaBeans 규약
// JavaBeans (데이터 클래스)
// 1. public 클래스
// 2. private 멤버변수
// 3. public 생성자
// 4. public getter / setter
public class Person {
	
	//non static 멤버변수
	private String name;
	private String job;
	private int age;
	private float height;
	
	//1 기본생성자
	public Person() {
		
		
	// 파라미터 이름과 변수명이 같을때  this.
	}
	//2
	public Person(String name) {
		this.name = name;
	}
	//3
	public Person(String name, String job) {
//		this.name = name;
		this(name);
		this.job = job;
	}
	//4
	public Person(String name, String job, int age) {
//		this.name = name;
//		this.job = job;
		this(name, job);
		this.age = age;
	}
	//5
	public Person(String name, String job, int age, float height) {
//		this.name = name;
//		this.job = job;
//		this.age = age;
		this(name, job, age);
		this.height = height;
	}
	
	
	//getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + ", age=" + age + ", height=" + height + "]"; // this 생략
	}
	
}
