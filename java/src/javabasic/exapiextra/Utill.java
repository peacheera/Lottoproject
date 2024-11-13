package javabasic.exapiextra;

import java.util.Iterator;
import java.util.Scanner;

public class Utill {

		public static String getLineText() {
			Scanner sc = new Scanner(System.in);
			System.out.println("문자열을 입력해 주세요");
			String lineText= sc.nextLine();
			sc.close();
			return lineText;
			
	
	}
		
		public static String[] getLineText(int lineCount) {
			System.out.println("문자열을" + lineCount+"입력해 주세요");
			Scanner sc = new Scanner(System.in);
			String[] lineTextArr = new String [lineCount];
			for (int i = 0; i < lineCount; i++) {
				lineTextArr[i] = sc.nextLine();
			}
			sc.close();
			return lineTextArr;
			
		}
}
