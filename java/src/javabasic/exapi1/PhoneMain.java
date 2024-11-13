package javabasic.exapi1;



import java.util.Scanner;
import java.util.StringTokenizer;

public class PhoneMain {
	  
    	static String[][] infoArr = new String[5][4]; // 이름과 휴대폰번호 입력값을 담을 배열 생성(이름, 국번, 앞자리, 뒷자리)

	   public static void main(String[] args) { 
	      
	      System.out.println("5명의 이름과 휴대폰번호를 입력해 주세요!");
	      System.out.println("형식:홍길동 000-0000-0000");
	      
	      //데이터 저장 함수 호출
	      inputInfo();   // 메소드와 연결
	      //데이터 출력 함수 호출
	      printInfo();
	      
	   } // main
	   
	   
	   private static void inputInfo() { // 입력값 데이터를 저장할 메소드 생성
	      Scanner scanner = new Scanner(System.in);
	      
	      //행의 수
	      int infoArrLeng = infoArr.length;
	      // 사용자가 입력한 한 줄의 문자열을 저장할 변수
	      String line = ""; // 
	      // 행의 수만큼 반복
	 	     for (int i=0; i<infoArrLeng; i++) { // 인포배열의 길이만큼 포문 돌리기
	 	    	 //한줄의 문자열을 저장
	 	    	 line = scanner.nextLine();	// line에 스캐너값 저장하기
	        
	 	    // 이름을 각 행의 첫번째 열에 저장
	 	    // 홍길동 010-1234-5678
	 	    infoArr[i][0] = line.substring(0, line.indexOf(' ')); // 공백문자가 나오지 전까지 자름
	        //휴대폰 번호를 - 기준으로 자르는 토크나이저 생성
	 	    // 010-1234-5678 > 010 1234 5678 
	 	    StringTokenizer st  = new StringTokenizer(line.substring(line.indexOf(' ')+1), "-"); //라인의 공백 구분하기
	 	    // 열 인덱스
	 	    int j = 1; 
	        // 토큰이 있는동안 반복함
	 	    while (st.hasMoreTokens()) {  // 참인동안 문장 반복수행 남아있는 토큰이 있으면 true 더이상 토큰이 없으면 false
	 	    	// 국번, 앞자리번호, 뒷자리번호 배열에 저장     
	 	    	infoArr[i][j] = st.nextToken(); // 문자열을 구분하여 토큰이 있으면 인포배열에 저장
	            j++;
	         }
	      }
	      
	      scanner.close(); // 스캐너 닫기
	   } // inputInfo
	   // 데이터 출력 메소드
	   private static void printInfo() { // 프린트 메소드 생성
	      // 행의 수 
		  int infoArrLeng = infoArr.length; // 배열의 길이 객체생성
	      // 열의 수
		  int infoArr0Leng = infoArr[0].length;
	      // 열의 수 만큼 반복
		  for (int i=0; i<infoArr0Leng; i++) { 
	         //행의 수 만큼 반복
			  for (int j=0; j<infoArrLeng; j++) {
				  //출력
	            System.out.print(infoArr[j][i] + " ");
	         }
	         System.out.println();
	      }
	   }

	} // class
	
