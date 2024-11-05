package javabaisc.oop;

public class Car2 {
//	정보은닉 (infromation hiding) = 캡슐화 (encapsulation)
//	클래스내의 멤버변수들을 private으로 선언하고
//	public인 getter/setter 를 만들어서 멤버변수의 값을  가져오거나 변경할 수 있도록 함
//	WHY? -> 클래스내의 멤버변수들에 대한 접근을 통제하기 위해서
//				 클래스내의 멤버변수들에 값을 숨길수도 있다.
//				 클래스내의 멤버변수들에 값을 가져가게도 가져가지 못하게도 할 수 있다.
//				 클래스내의 멤버변수들에 값을 변경하게도 변경하지 못하게도 할 수 있다.
//				 만약에 price를 노출하고 싶지 않으면 getPrice를 안 만들면 그만
	private String company; 
	private String model; 
	private String name; 
	private int price; 
		
	
	public Car2(){
		
	}

//	getter 메소드
//	형태 : get + 변수명을 대문자로 시작
	
//	private 멤버변수의 값을 가져가기 위한 public 메소드
//	멤버변수에 직접 접근하지 못하게 하고 정해진 방법으로만 가져가도록 하기 위해 만듬

	public String getCompany() {
		return company;
	}

//	setter 메소드
//	형태 : set + 변수명을 대문자로 시작
//	private 멤버변수의 값을 변경하기 위한 public 메소드
//	멤버변수에 직접 접근하지 못하고 정해진 방법으로만 변경 할 수 있도록 하기 위해 만듬
//	this : 클래스를 통해 생성될 객체 자신을 가리키는 키워드(동사무소 서식에 있는 홍길동)
	public void setCompany(String company) {
		this.company = company;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
