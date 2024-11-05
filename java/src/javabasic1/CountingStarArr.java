package javabasic1;

public class CountingStarArr {
	public static void main(String[] args) {
//		String[][] countArr = {
//		{"0","0","*","0","0"},
//		{"0","*","*","*","0"},
//		{"*","*","*","*","*"},
//		{"0","*","*","*","0"},
//		{"0","0","*","0","0"}
//	};
	
		int[][] countArr = {
			 {0,0,1,0,0},
			 {0,1,1,1,0},
			 {1,1,1,1,1},
			 {0,1,1,1,0},
			 {0,0,1,0,0}
	 };
		
	// 저장
		int countArrLength = countArr.length;
		int countArr0Length = countArr[0].length;
		
		for (int i = 0; i < countArrLength; i++) {
			for (int j = 0; j < countArr0Length; j++) {
				
				if(countArr[i][j]==0) {
					System.out.print("0");
				}else 
					System.out.print("*");
					
				}			
			System.out.println();
			}
		}
		
		
	//출력
	
	
	
	
	
	
}
