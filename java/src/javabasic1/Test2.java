
package javabasic1;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		
//		다섯개의 문자열을 배열에 저장 > 출력
		
		String[][]strArr = {
				{"가", "나 ", "다", "라", "마"},
				{"바", "사 ", "아", "자", "차"},
				{"카", "타 ", "파", "하", "공"}
		};
		
		for(String[] sArr : strArr) { //열에 있는 값을 가져오기 위한 변수 설정
			for(String str : sArr) { //행에 있는 값을 가져오기 위한 변수 설정
		System.out.println(str);
			}
		}	
		
		// 학생 3명의 이름과 학점  a-f를 배열에 저장 > 학생명, 학점 출력
		String[][]jArr = {
				{"가a", "나a ", "다b"},
				{"바c", "사c ", "아d"},
				{"카e", "타e", "파f"}
		};
		
		for(String[] iArr : jArr) { //열에 있는 값을 가져오기 위한 변수 설정
			for(String lArr : iArr) { //행에 있는 값을 가져오기 위한 변수 설정
		System.out.println(lArr);
			}
		}	
		
		
		// 데이터를 저장하고 총점이 200점 이상인 학생들의 학생명과 총점을 출력
	
		String[][] eArray = {
				{"길동", "90", "80", "70"},
				{"감찬", "80", "70", "60"},
				{"순신", "60", "50", "40"}
		};
	
		//총점 저장용 1차원 배열
			int[] totalArray = {0, 0, 0};
				
		//		각 배열의 크기
			int eArraylength = eArray.length;	
			int eArray0length = eArray[0].length;
			int totalArraylength = totalArray.length;

		//총점 구하기
			for (int i = 0; i < eArraylength; i++){
				 for (int j = 0; j < eArray0length; j++) {
					 if (j>0) {
						 totalArray[i]+=Integer.parseInt(eArray[i][j]);
					 }	
				 }
			}
//		출력
			for (int j2 = 0; j2 < totalArray.length; j2++) {
				if(totalArray[j2] >= 200);
				System.out.println(eArray[j2][0] + "총점" + totalArray[j2]);
				}

			
// 	학생3명의 이름, 국어, 영어, 수학, 점수를 키보드로 입력받아 총점과 평균 산출
//	학생명, 국어점수, 영어점수, 수학점수, 총점, 평균
			
				
			
				
			// 총점 구하기
			//
			
			//평균 구하기

			
			
		}//main
}//class



