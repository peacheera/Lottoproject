package javabasic.excollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Fruits1 {
	// 과일명 입력받아 순서대로 출력
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> fArrayList = new ArrayList<String>();
		System.out.println("5개의 과일을 입력하세요");
		for (int i = 0; i < 5; i++) {
			fArrayList.add(sc.next());
			
		}
		Iterator<String> it = fArrayList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
