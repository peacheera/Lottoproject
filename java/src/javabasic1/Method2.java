package javabasic1;

public class Method2 {
	
	public static void main(String[] args) {

		
//		 Cannot make a static reference to the non-static method print...
//		 => static 메소드인 main 에서 non-static메소드인 print를 객체없이 호출할 수 없다
//		print("Hello");
//		Method2.print("Hi");
	
		
//		Method2 타입의 객체생성 
		Method2 method2 = new Method2();
//		객체참조를 통해 print 호출
		method2.print("Hello~");
		System.out.println(method2.add(3, 5));
		
	}//main
	
	//non static method : 객체를 생성해서 객체로 접근(호출) 하는 method
	void print(String str) {
		System.out.println(str);
	}
	
	int add (int a, int b) {
		return a + b;
	}
}
