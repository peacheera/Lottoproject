package javabasic.excollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;

public class Fruits2 {
	// 중복되지 않은 과일5개  순서대로 출력
		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			Set<String> sFruits = new HashSet<String>();
			System.out.println("과일 5개를 입력하세요");
			for (int i = 0; i < 5; i++) {
				sFruits.add(sc.next());
				
			}
			Iterator<String> it = sFruits.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			
		}	
	}
}
