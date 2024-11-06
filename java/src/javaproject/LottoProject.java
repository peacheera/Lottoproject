package javaproject;


import java.util.Arrays;
import java.util.Scanner;

public class LottoProject {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		      System.out.println("로또추첨 시~작!");
		      System.out.println("로또번호(정수) 6개를 입력하세요");

		      int[] lottomyball = new int[6]; // 로또번호를 입력받는 배열
		      int[] lottoball = new int[7]; // 랜덤 로또번호 저장하는 배열

		      // 로또 번호 입력
		      for (int i = 0; i < lottomyball.length; i++) {

		         // while : 조건이 true면 반복문실행
		         while (true) {
		            System.out.print("번호 " + (i + 1) + " : ");
		            lottomyball[i] = scanner.nextInt();

		            if (lottomyball[i] < 1 || lottomyball[i] > 45) {
		               System.out.println("숫자를 다시 입력하세요!(1~45)");
		               continue;// continue : continue의 조건이 true면 빠져나간 뒤 다시 반복한다.
		            }

		            // 중복숫자를 입력했을때
		            // boolean 초기값 true -> 중복값이 false 가정
		            boolean checkNum = false;
		            // i -> 인덱스값
		            for (int j = 0; j < i; j++) {
		               if (lottomyball[i] == lottomyball[j]) {
		                  checkNum = true;// 중복이 있으면 true
		                  break;
		               }
		            }

		            if (checkNum) {
		               System.out.println("중복숫자이슈 다른번호를 입력해주세요!");
		            } else {
		               break;
		            }
		         }
		      }
		         randomNumber(lottoball);
		         resultLotto(lottoball, lottomyball);

		      scanner.close();
		   }// main

		// 번호 뽑기
		   public static void randomNumber(int[] lottoball) {


		      // 7개의 랜덤 번호 생성
		      for (int i = 0; i < lottoball.length; i++) {
		         int lottoBallNum;
		         boolean checkNum;

		         // 번호 생성 및 중복 체크
		         do {
		            lottoBallNum = (int) (Math.random() * 45) + 1; // 1부터 45까지의 랜덤 번호 생성
		            checkNum = false; // 중복 체크 초기화 (매번 중복 번호 체크)

		            // 중복 여부 확인
		            for (int j = 0; j < i; j++) {
		               if (lottoball[j] == lottoBallNum) {
		                  checkNum = true; // 중복이 있으면 checkNum을 true로 설정
		                  break; // 중복이 있으면 더 이상 확인할 필요 없음
		               }
		            }
		         } while (checkNum); // 중복되면 다시 랜덤번호 뽑기

		         // 중복되지 않으면 배열에 저장
		         lottoball[i] = lottoBallNum;

		      }
		      // 보너스 번호
		      int bonsBallNum;
		      boolean bonusCheck = false;
		      do {
		    	  System.out.println(bonusCheck);
		         bonsBallNum = (int) (Math.random() * 45) + 1; // 1부터 45까지의 랜덤 번호 생성
		    //     System.out.println("보너스 번호" + bonsBallNum);
		         bonusCheck = false;

		         // 중복확인 ->뽑힌 번호중 중복번호
		         for (int i = 0; i < 6; i++) {
		            if (lottoball[i] == bonsBallNum) {
		               bonusCheck = true; // 중복된 번호일 경우
		               break;
		            }
		         }
		      } while (bonusCheck);
		   
		      lottoball[6] = bonsBallNum; // 마지막 자리에 보너스 번호 저장
		   }

		   
		   
		   
		// 비교 출력
		   
		   public static void resultLotto(int[] lottoball, int[] lottomyball) {
		     
			   int matchcount = 0;// 비교변수지정 초기화

		      for (int i = 0; i < 6; i++) {
		         for (int j = 0; j < 6; j++) {
		            if (lottomyball[i] == lottoball[j]) {
		               matchcount++;//matchCount 증가
		               break;
		            }
		         }
		      }

		      // 2. 당첨 규칙
		      // 1) 사용자가 입력한 6개의 로또번호와 프로그램이 랜덤하게 뽑은 앞의 6개 번호가 모두 일치하면 1등
		      // 2) 사용자가 입력한 6개의 로또번호와 프로그램이 랜덤하게 뽑은 앞의 6개 번호 중 5개가 일치하고
//		           보너스번호가 일치하면 2등
		      // 3) 사용자가 입력한 6개의 로또번호와 프로그램이 랜덤하게 뽑은 앞의 6개 번호 중 5개가 일치 3등
		      // 4) 사용자가 입력한 6개의 로또번호와 프로그램이 랜덤하게 뽑은 앞의 6개 번호 중 4개가 일치 4등
		      // 5) 사용자가 입력한 6개의 로또번호와 프로그램이 랜덤하게 뽑은 앞의 6개 번호 중 3개가 일치 5등
		      // 6) 나머지는 꽝! 다음기회에!
		      
		      
		      // 비교문 switch
		      // 결과 출력
		      
		   System.out.println("로또번호는 :");
		      for (int i = 0; i < 6; i++) {
		    	  System.out.print(lottoball[i] + " ");
			}
//		     System.out.println(Arrays.toString(lottoball));
//		     Arrays.sort(lottoball);
//		     System.out.println(Arrays.toString(lottoball));
		     System.out.println("\n보너스 번호는 : " +  lottoball[6]);
		      
		      switch (matchcount) {
		      case 6:
		         System.out.println("1등 당첨!☆★ 축하합니다!~ ☆★");
		         break;

		      case 5:
		         boolean bonusmatch = false;//초기화
		         //보너스 번호 비교
		         for (int i = 0; i < 6; i++) {
		            if (lottomyball[i] == lottoball[6]) {
		               bonusmatch = true;
		            break;
		            }
		         }
		         if (bonusmatch) {
		            System.out.println("2등 당첨!★ 축하합니다!~ ☆★");
		         } else {
		            System.out.println("3등 당첨!☆ 축하합니다!~ ☆★");
		         }
		         break;
		         
		      case 4:
		         System.out.println("4등 당첨!☆ 축하합니다!~");
		         break;
		      case 3:
		         System.out.println("5등 당첨!＊＊ 축하합니다!~");
		         break;
		      default:
		         System.out.println("꽝입니다 다음에 도전하세요!");
		         }
		      }
		

	

	
}//class

