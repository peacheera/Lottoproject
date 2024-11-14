package javabaisc.oop;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
	// java.text.SimpleDateFomat
	// 날짜 / 시간 정보를 원하는 문자열 형태로 변결할 때 주로 사용
		public static void main(String[] args) {
			
			Date now = new Date(); // 현재 날짜/시간 정보를 가진 Date객체
			System.out.println(now);
			
			
			// 날짜 / 시간 표신 형식 SimpleDateFormat 객체 생성
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a HH시 :mm분 :ss초");
			System.out.println(sdf.format(now));
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
}

