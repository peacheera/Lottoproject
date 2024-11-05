package javabasic1;

import java.util.Iterator;
import java.util.Scanner;

public class MethodTest4 {

		public static void main(String[] args) {
			System.out.println("별개수를 입력 하세요");
			countingStar();
		}
		
		static void countingStar() {
			
			Scanner sc = new Scanner(System.in);	
		
			
			// return scanner.nextInt();
			int a = sc.nextInt();					
			
			star(a);
	
		}
		
		static void star (int a) {
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < i+1; j++) {
					System.out.print("*");
				}
					System.out.println();
			}
						
		}
} //m