package javabasic.exapiextra;

public class APIExtra4 {
	public static void main(String[] args) {
		
		String[] strArr = Utill.getLineText(2);
		
		System.out.println(strArr[0].contains(strArr[1]) ? "포함한다" : "포함안한다");
	}
}
