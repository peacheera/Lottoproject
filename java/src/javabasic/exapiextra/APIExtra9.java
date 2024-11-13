package javabasic.exapiextra;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class APIExtra9 {
	public static void main(String[] args) {
	
		char[] chArr = getText().toCharArray();
		
		int[] countArray = new int [3];
		
		for (char ch : chArr) {
			String str = String.valueOf(ch);
			if (str.matches("[가-힣]")) {
				countArray[0]++;
			} else if (str.matches("[a-zA-Z]")) {
				countArray[1]++;
			} else if (str.matches("[\\W_]")) {
				countArray[2]++;
			}
		}
		System.out.printf( 
				"한글 :  %d개 영문 %d개 기호 : %d개",
				countArray[0],countArray[1],countArray[2]
						);
	}//
private static String getText() {
	BufferedReader br;
	try {
		br = new BufferedReader(new FileReader(new File("C:\\Users\\Administrator\\Downloads\\americadoi.txt")));
		String line = "";
		String americaTxt = "";
		while ((line=br.readLine())!=null) {
			americaTxt += line;
		}
		br.close();
		return americaTxt;
	} catch (FileNotFoundException fnfe) {
		fnfe.printStackTrace();
		return null;
	} catch (IOException ioe) {
		ioe.printStackTrace();
		return null;
		}
	}//
}	
