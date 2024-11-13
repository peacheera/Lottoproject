package javabasic.exapiextra;

public class APIExtra6 {
	public static void main(String[] args) {
		
		// 한 줄 입력
		String line = Utill.getLineText(1)[0];
		// 문자배열로 전환
		char[]  chArr = line.toCharArray();
		
		// StringBilder 생성
		StringBuilder sb = new StringBuilder();
		//문자배열 순회
		for (char ch : chArr) {
			// 공백문자가 아니면
			if(ch!=' ') {
				// StringBuilder에 문자를 추가
				sb.append(ch);
			}
		}
		System.out.println(sb);
		
		
	}
	

	
}
