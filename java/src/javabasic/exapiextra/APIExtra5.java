package javabasic.exapiextra;

public class APIExtra5 {
	public static void main(String[] args) {
		
		String[] strArr = Utill.getLineText(2);
	
		int idx = -1;
		int count=0;
		
		
		//첫번째 :  전체문자열 // 두번째 : 안에 들어가는 문자열
		while((idx = strArr[0].indexOf(strArr[1], idx+1))>=0) {
			count++;
		
		}
		System.out.println(strArr[0] + "문자열내에는" + strArr[1] 
				+" 문자열이" +count + "개 있습니다.");
		
		
	}
	

	
}
