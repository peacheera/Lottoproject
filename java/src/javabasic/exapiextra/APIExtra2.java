package javabasic.exapiextra;

public class APIExtra2 {

	public static void main(String[] args) {
		
	
	char[] charArr = Utill.getLineText().toCharArray();
	
	int aski = 0;
	for(char ch : charArr) {
		aski +=(int)ch;

	}
	System.out.println(aski);
	
	
	}
}
