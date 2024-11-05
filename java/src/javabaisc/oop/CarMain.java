package javabaisc.oop;

public class CarMain {
	
	public static void main(String[] args) {
//		Car 타입 객체를 생성
//		new 라는 키워드를 통해 참조값을 Car타입의 bmw라는 객체참조변수에 저장한다.
//		1. Car() 생성자를 호출
//		2. new라는 연산을 통ㅇ해서 Car타입의 객체가 메모리에 생성
//		3. 메모리에 생성된 객체의 주소를 해시알고리즘을 사용해서 참조로 변환한다.
//		4. 참조(참조값)을 Car타입 객체참조변수인 bmw에 저장
		
		Car bmw = new Car();
		System.out.println(bmw); // 주소 

//		객체의 멤버변수들에 값을 할당(타입에 맞춰서)
		bmw.company = "BMW KOREA"; // 문자열 string
		bmw.model = "520D";
		bmw.name = "BMW";
		bmw.price = 1000;
		
		System.out.println(
				"제조사명: " + bmw.company + "\n"
					+	"모델명: " + bmw.model + "\n"
					+	"이름명: " + bmw.name + "\n"
					+	"판매가격:  " + bmw.price
				);
		
		
		
		
		
		// 객체가 같다 = 참조값이 같다 = 참조가 같다 = 주소가 같다 = 메모리상 같은 위치에 있다                         
		Car audi = new Car();
		System.out.println(audi);

		audi.company = "AUDI KOREA";
		audi.model = "A8";
		audi.name = "AUDI";
		audi.price = 1500;
				
		System.out.println(
				"제조사명: " + audi.company + "\n"
					+	"모델명: " + audi.model + "\n"
					+	"이름명: " + audi.name + "\n"
					+	"판매가격:  " + audi.price
				);
		
		
		// 메모리 상에있는 audi객체의 참조값을 복사
		// audi2 객체는 audi객체와 같은 객체
		Car audi2 = audi;
		System.out.println(audi2);
		
		audi2.price = 2000;
		
		System.out.println(
				"제조사명: " + audi2.company + "\n"
					+	"모델명: " + audi2.model + "\n"
					+	"이름명: " + audi2.name + "\n"
					+	"판매가격:  " + audi2.price
				);
		
		
		System.out.println(
				"제조사명: " + audi.company + "\n"
					+	"모델명: " + audi.model + "\n"
					+	"이름명: " + audi.name + "\n"
					+	"판매가격:  " + audi.price
				);
		
		
		
	}//
}//
