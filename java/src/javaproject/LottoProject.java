package javaproject;

import java.util.Scanner;

public class LottoProject {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("로또뽑기~! 시 작");
		System.out.println("로또번호(정수) 6개를 입력하세요");
		
		int[] lottomyball = new int[6]; // 로또번호를 입력받는 배열
		int[] lottoball = new int[7]; // 랜덤 로또번호 저장하는 배열
		
		
		for (int i = 0; i < lottomyball.length; i++) {
			lottomyball[i] = scanner.nextInt(); //길이만큼 입력받고 저장
			if (lottomyball[i] > 45 || lottomyball[i] < 0) { // 0~45범위 내에 숫자
				
				System.out.println("숫자를 다시 입력하세요!(0~45)");
				
			}
			for (int j = 0; j < i; j++) {
				if (lottomyball[i] == lottomyball[j]) {
					//중복숫자를 입력했을때
					System.out.println("중복숫자 입력이슈 발생.");
					
				}
			}
			
		randomNumber(lottoball, lottomyball);
		resultLotto(lottomyball);	

		
		}
	}//main
	
	// 번호 뽑기
	public static void randomNumber(int[] lottoball, int[]lottomyball) {
	
		int lottoballLeng = lottoball.length;
		for (int i = 0; i < lottoballLeng; i++) {
				lottoball[i] = (int)(Math.random()*45)+1;
		
//				return/false
				}
			}
	
//	
	
	// 출력
	public static void resultLotto(int[] lottoball) {

	
	}
	
}//class

