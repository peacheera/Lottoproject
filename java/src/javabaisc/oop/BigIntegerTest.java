package javabaisc.oop;

import java.math.BigInteger;

// BigInteger	: long의 범위를 넘는 큰 정수
// BigDecimal	: double의 범위를 넘는 크거나 작은 실수


public class BigIntegerTest {
	
	
	
	public static void main(String[] args) {
		
		// 롱의 범위 –9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		BigInteger bi1 = new BigInteger("92233720368547752312344568907678072123");
		System.out.println(bi1);
		BigInteger bi2 = new BigInteger("92233720361222233412344568907678072123");
		System.out.println(bi2);
		
		
		System.out.println("------------------------------------------------------------------------------------");	
		
		BigInteger bi3 = bi1.add(bi2); // 덧셈
		System.err.println(bi3); // 덧셈
		System.out.println(bi1.subtract(bi2));// 뺄셈
		System.out.println(bi1.multiply(bi2));	// 곱셈
		System.out.println(bi1.divide(bi2));	// 나눗셈
	
		System.out.println("------------------------------------------------------------------------------------");	
		
		BigInteger bi4 = bi1.max(bi2); //최대값
		System.out.println(bi4);
		BigInteger bi5 = bi1.min(bi2); // 최소값
		System.out.println(bi5);
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
