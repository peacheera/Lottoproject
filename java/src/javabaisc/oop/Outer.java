package javabaisc.oop;

public class Outer {
	
	// static member variable
	static int si = 1;
	// non-static member variable
	int nsi = 2;
	
	// static member class = static inner class = static nested class
	static class SIClass{
		 void print () {
			 System.out.println("SIClass print si => " + si); // static 접근가능
			 // static 클래스인 SIClass에서 non-static 멤버변수 nsi에 접근불가
			 // ? => static 이 non-static보다 먼저 메모리에 생성되므로
//			 System.out.println("SIClass print nsi => " + nsi); // non-static 접근불가능
		 }
	}
	
	// non-static member class
	class NSIClass {
		 void print () {
			 System.out.println("NSIClass print si => " + si); // static 접근가능
			 // non-static 클래스에서 static 멤버변수에 접근 가능
			 // ? => static 이 항상 먼저 메모리에 만들어 지므로
			 System.out.println("NSIClass print nsi => " + nsi); // non-static 접근불가능
		
		 }
	}	
	// 1. OuterMain에서 OuterObject를 호출하면 
	void print() {
		int li = 3; // 2. 지역변수가 만들어짐 
		System.out.println("Outer클래스의 print 메소드 호출됨!");
		
		// local class
		// 감싸고 있는 4. print메소드가 호출되면 생성되는 클래스
		class LIClass{
			void print() {
		System.out.println("LIClass print si => " + si);		
		System.out.println("LIClass print nsi => " + nsi);		
		System.out.println("LIClass print li => " + li);		
			}
		}
		
		// 3. inner class 의 객체 생성
		LIClass liClass = new LIClass();
		liClass.print();
		
	}// print
	
}//



















