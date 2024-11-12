package javabasic.exapi1;



import java.util.Scanner;
import java.util.StringTokenizer;

public class PhoneMain {
	  
    	static String[][] infoArr = new String[5][4]; // 입력값을 담을 배열 생성

	   public static void main(String[] args) { 
	      
	      System.out.println("5명의 이름과 휴대폰번호를 입력해 주세요!");
	      System.out.println("형식:홍길동 000-0000-0000");
	      
	      inputInfo();   // 메소드와 연결
	      printInfo();
	      
	   } // main
	   
	   
	   private static void inputInfo() { //입력값 메소드 생성
	      Scanner scanner = new Scanner(System.in);
	      
	      int infoArrLeng = infoArr.length;
	      String line = ""; // 
	      
	      for (int i=0; i<infoArrLeng; i++) { // 인포배열의 길이만큼 포문을 돌려
	         line = scanner.nextLine();	// line에 스캐너값 저장
	         infoArr[i][0] = line.substring(0, line.indexOf(' ')); //
	         StringTokenizer st  = new StringTokenizer(line.substring(line.indexOf(' ')+1), "-"); //라인의 공백구분
	         int j = 1;
	         while (st.hasMoreTokens()) { 
	            infoArr[i][j] = st.nextToken();
	            j++;
	         }
	      }
	      
	      scanner.close();
	   } // inputInfo
	   	
	   private static void printInfo() { // 프린트 메소드 생성
	      int infoArrLeng = infoArr.length;
	      int infoArr0Leng = infoArr[0].length;
	      for (int i=0; i<infoArr0Leng; i++) {
	         for (int j=0; j<infoArrLeng; j++) {
	            System.out.print(infoArr[j][i] + " ");
	         }
	         System.out.println();
	      }
	   }

	} // class
	
