package javabasic.exapiextra;

public class APIExtra8 {
	public static void main(String[] args) {

		String line = Utill.getLineText(1)[0];
		
		char[] chArr = line.toCharArray();
		
		int[] countArray = new int [3];
		
		for (char ch : chArr) {
			byte b = (byte)ch;
			if (b>=65 && b <=90) {
				countArray[0]++;
			} else if (b>=97 && b <=122) {
				countArray[1]++;
			} else if (b>=48 && b <=57) {
				countArray[2]++;
			}else {
				countArray[3]++;
			}
		}
		System.out.printf( 
				"대문자는 %d개 소문자는 %d개 숫자는%d개 기호는%d개",
				countArray[0],countArray[1],countArray[2],countArray[3]
						);
	}

}//
