package javabasic.exapiextra;

public class APIExtra7 {
	public static void main(String[] args) {

		String line = Utill.getLineText(1)[0];
		
		char[] chArr = line.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		
		
		for (char ch : chArr) {
			if ((byte)ch < 91) {
				sb.append((char)(ch+32));
			} else {  
				sb.append((char)(ch-32));
			}

		}
		System.out.println(sb);
	}

}//
