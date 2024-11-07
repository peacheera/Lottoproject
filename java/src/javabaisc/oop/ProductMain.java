package javabaisc.oop;

public class ProductMain {
	
	public static void main(String[] args) {
		
		
		
	TV tv1 = new TV("알지전자","완전커1", 1000 );
	Radio radio1 = new Radio("십만전자", "잘들려1", 500);
	
		//상위형변환 (upcasting) = 자동현변환(auto) = 묵시적형변환(implicit)
		Product tv2 = new TV("알지전자","완전커1", 2000);
		Product radio2 = new Radio("십만전자","잘들려1", 500); // (product)생략
		
		// 하위형변환 (downcasting) = 강제형변환 (force) = 명시적형변환(explicit)
		TV tv3 = (TV)tv2; //tv2 는 product타입, 가지고 있는 참조는 TV
	

		
		
		
		//compile에러는 없음 . 실행시에 런타임에러 ClassCastException
		// 이유 : new product()는 Product 타입, 가지고 있는 참조도  Product
		// 참조범위가 TV 보다 좁음. new Prodcut()는 TV의 참조번위를 모두 커버할 수 없음
		// 그래서 하위형변환 불가
//		TV tv3 = (TV)new Product();
		
		Radio radio3 = (Radio)radio2;
		System.out.println(radio3.company + " " + radio3.name + " " + radio3.price);
		// Object는 모든 타입의 최상위 타입
		Object tv4 = new TV("알지전자","완전커1", 2000);
		Object radio4= new Radio("십만전자","잘들려1", 500); // (product)생략
		
		
		
		
		
		// Object에는 company 변수가 없음
//		System.out.println(tv4.company);
//		System.out.println(radio4.company);

		// Prouct로 하위형변환?
		System.out.println(((Product)tv4).company);
		System.out.println(((Product)radio4).company);
	
		
		
		// TV, Radio로 하위형변환해서 company에 접근할 수 있음
							  //( 하위형변환 )
		System.out.println(((TV)tv4).company);
		System.out.println(((Radio)radio4).company);
	
		
		// intanceof 연산자
		// 객체가 클래스의 타입인지 확인하는 연산자, true/false를 반환
		// is a(상속) 관계인지 확인하는 연산자
		System.out.println(tv4 instanceof Object); // true
		System.out.println(tv4 instanceof Product); // true
		System.out.println(tv4 instanceof TV); // true
		System.out.println(tv4 instanceof Radio); // false
		
		// 상속관계가 아니면 형변환이 불가능
		// 객체참조 변수에서 중요한 것
		//1 : 참조변수가 가지고 있는 참조값
		//2 : 참조 변수의 타입
		// 상위형변환 : 상속관계에서 참조범위를 좁히는 것
		// 하위형변환 : 상속관계에서 참조범위를 넓히는 것
	}//
		
}//
