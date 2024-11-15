package exexception;

import java.util.Scanner;

// 입력한 것이 숫자가 아닌 경우에 대해 예외 처리하기

public class ExceptionTest1 {

		
//		int[] outOfMemory = new int [Integer.MAX_VALUE];
		
	public static void main(String[] args) {
		
		babo1();
		
	}
	public static void babo1() {
	System.out.println("babo1 호출됨");
	babo1();
	}

	
	public static void babo2() {
		System.out.println("babo2 호출됨");
	babo2();
	}	

}
