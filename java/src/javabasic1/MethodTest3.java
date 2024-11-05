package javabasic1;

import java.util.Scanner;

public class MethodTest3 {

		public static void main(String[] args) {
			
			addTwoInt();
			
			
			
		}
		
		static void addTwoInt() {
			
			Scanner sc = new Scanner(System.in);	
			
			System.out.println("두개의 정수와 연산자를 입력하세요");
//			한번 쓰는 변수는 되도록 만들지 않는게 좋음 
			int a = sc.nextInt();
			int b = sc.nextInt();				
			String op1 = sc.next();
//			print(calc(scanner.nextInt(), scanner.nextInt(), scanner.nex()));
			oper(a, b, op1);
		
	
		}
		
		static void oper (int a, int b, String op1) {
// 			switch 사용 print는 쓰지않는게 좋음
//			출력메소드와 연산메소드는 구분하기 
			if (op1.equals("+")) {
				System.out.println(a+b);
			}else if (op1.equals("-")) {
				System.out.println(a-b);
			}else if (op1.equals("*")) {
				System.out.println(a*b);
			}else if (op1.equals("/")) {
				System.out.println(a/b);
				}		
//			출력 method를 만들어서 출력값만 따로 지정
		}
}