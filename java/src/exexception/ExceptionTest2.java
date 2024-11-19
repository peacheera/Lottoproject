package exexception;

import java.util.Scanner;


// 입력한 것이 숫자가 아닌 경우에 대해 예외 처리하기

public class ExceptionTest2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두개의 정수를 입력하세요");
			
			
	try {
		System.out.println(sc.nextInt()/sc.nextInt());
	} catch (ArithmeticException ae) {
		System.out.println("나누기 불가능 ( 0 ) ");
	}finally {
		sc.close();
	}
		
	
	}
	
}
