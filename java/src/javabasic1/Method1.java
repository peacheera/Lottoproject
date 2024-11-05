package javabasic1;

public class Method1 {
	
	public static void main(String[] args) {

		
//			메소드 실행 순서
//			1) main
//			2) print
//			3) print 내의 println호출
//			4) add
//			5) main 내의 println호출
		
		
		
		
		
		
		
		
//		main에서 print를 호출
		print("Hello"); // method1. 이 생략
		Method1.print("Hi ");

//		main에서 add를 호출
		System.out.println(add(10, 20)); //add 앞에 method1. 이 생략
		System.out.println(Method1.add(10, 20));
		
//		main 메소드가 return;하면 프로그램 종료
		return;
	}

//		static : 객체생성 없이 클래스로 접근 / 호출 할 수 있는 메서드
//		void : 반환값이 없다
//		String  str : 파라미터(parameter) 변수 = 매개변수 
	static void print(String str) {
		System.out.println(str);
//		return : 값이 없을때는 구문 생략가능
//		하지만 생략하면 return구문을 넣어준다. 즉, 메소드는 리턴구문을 가지고 있다.
						
		
	}

	
//		int : 반환타입 (메소드 실행 후 반환할 값의 타입)
//		return 값; : 메소드 실행 후 값을 호출한 쪽으로 반환
	static int add(int a, int b) {
		return a+b;
		
	}
	
	
}
