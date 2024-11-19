package exexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest4 {
// 홍길동/산적, 강감찬/장군, 임꺽정/산적, 권율/장군, 의 름과 직업을 가진 5명의
//	Person을 생성하고 직업이 산적이면 좋은 직업을 선택하세요 라는 메세지 출력
public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
			

			System.out.println("두개의 정수를 입력하세요");
		
		try {			
			
			// 사용자 입력을 2개 저장
			double d1= sc.nextDouble();
			double d2= sc.nextDouble();
			
			// int로 변환해서 저장할 변수 2개
			int i1 =0;
			int i2 =0;
			
			// Double, Float  > is NaN() 숫자가 아니면 true
			// 숫자면 int로 형변환
			if (!Double.isNaN(d1)) {i1 = (int)d1;}
			if (!Double.isNaN(d2)) {i2 = (int)d2;}
			
			// int의 범위를 넘는지 확인
			if(i1 > Integer.MAX_VALUE || i1<Integer.MIN_VALUE) {
			
				try {
					// 예외를 발생시킴
					throw new Exception();	
				}catch (Exception ex) {
				System.out.println("int의 범위를 넘었습니다.");
				}		
			}
			System.out.println(i1/i2);
		} catch (NumberFormatException nfe) {
			System.out.println("숫자를 입력해 주세요!");
		} catch (ArithmeticException ae) {
		System.out.println("나누기 불가능 ( 0 ) ");	
		}catch (InputMismatchException ime) {
			System.out.println("숫자를 입력해 주세요");
		}
		finally {
		sc.close();
			}	
		}

	}
	


