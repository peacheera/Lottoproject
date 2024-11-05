package javaproject;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Help {
		public static void main(String[] args) {

		      // 랜덤정수 추출
		      // Math.random() : 0.0<=n<1.0 범위의 실수를 반환
		      int randomNumber = (int)(Math.random()*10) + 1; // 1 ~ 10
		      
		      // 스캐너 생성
		      Scanner scanner = new Scanner(System.in);
		      
		      // 한 라인의 문자열 입력
		      String line = scanner.nextLine();
		      
		      // 문자열을 공백문자 기준으로 토크나이징(토큰으로 분리)
		      StringTokenizer st = new StringTokenizer(line);
		      
		      // 토큰이 있는 동안 반복
		      while (st.hasMoreTokens()) {
		         // 토큰 하나씩 가져와서 출력
		         String token = st.nextToken();
		         System.out.println(token);
		      }
		      
		      scanner.close();
		      

		}
}
