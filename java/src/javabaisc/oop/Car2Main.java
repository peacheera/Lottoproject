package javabaisc.oop;

public class Car2Main {

	public static void main(String[] args) {

		Car2 bmw = new Car2();
//		private 멤버변수 company는 Car2클래스 내에서만 접근가능
//		bmw.company = "BMW KOREA";
		bmw.setCompany("BMW KOREA");
		bmw.setModel("520D");
		bmw.setName("BMW");
		bmw.setPrice(1000);
		
		
		System.out.println(
				"제조사명: " + bmw.getCompany() + "\n"
					+	"모델명: " + bmw.getModel() + "\n"
					+	"이름명: " + bmw.getName() + "\n"
					+	"판매가격:  " + bmw.getPrice()
				);
		
		
		Car2 audi = new Car2();
		
		audi.setCompany("BMW KOREA");
		audi.setModel("520D");
		audi.setName("BMW");
		audi.setPrice(1000);
		
		
		System.out.println(
				"제조사명: " + audi.getCompany() + "\n"
					+	"모델명: " + audi.getModel() + "\n"
					+	"이름명: " + audi.getName() + "\n"
					+	"판매가격:  " + audi.getPrice()
				);
		
	}//

}//