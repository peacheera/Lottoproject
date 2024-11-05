package javabasic1;

public class MethodTest5 {
	
	public static void main(String[] args) {
		String [][] strArr = {
				{"우", "50", "40", "90"},
				{"김", "70", "80", "40"},
				{"박", "90", "75", "80"}
//				String [][] strArr = {
//						{"우", "50", "40", "90", "0", "0"},
//						{"김", "70", "80", "40", "0", "0"},
//						{"박", "90", "75", "80", "0", "0"}
		};		
	
		int[] strArr1 = {0, 0, 0};
		
		addsumScore(strArr,strArr1);
		totalScore(strArr, strArr1);
		avgScore(strArr, strArr1);
		
		
	}
	//총점
	static void addsumScore(String[][] strArr2, int[] strArr3 ) {
		int strArr2length = strArr2.length;
		int strArr20length = strArr2[0].length;
		
		for (int i = 0; i < strArr2length; i++){
			 for (int j = 0; j < strArr20length; j++) {
				 if (j>0) {
					 strArr3[i]+=Integer.parseInt(strArr2[i][j]);
				 }	
			 }
		}		
	}
	//평균
	static void avgScore(String[][] strArr2, int[] strArr3) {
		
		int strArr2length = strArr2.length;
		
		
		for (int i = 0; i < strArr2length; i++) {
			System.out.println("평균="+strArr3[i] / strArr2length);
	}

	}
	//출력
	static void totalScore(String[][] strArr2, int[] strArr3) {
		
		int strArr2length = strArr2.length;		
		int strArr20length = strArr2[0].length;
		
		for (int i = 0; i < strArr2length; i++) {
			for (int j = 0; j < strArr20length; j++) {
				
			}
			System.out.println( "총점=" + strArr3[i] );
		
			}
	
		}
	}

