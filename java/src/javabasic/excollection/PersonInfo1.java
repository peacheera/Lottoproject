package javabasic.excollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class PersonInfo1 {
	public static void main(String[] args) {
//		이름/ 나이 정보를 입력받아 입출력 HashMap
		Scanner sc = new Scanner(System.in);
	
		System.out.println("이름과 나이의 정보를 입력하세요 3번 (예시 : 홍길동,22)");
		
		Map<String, String> personMap = new HashMap<String, String>();
		for (int i = 0; i < 3; i++) {
		String getInfo = sc.next(); 
		String name = getInfo.substring(0,getInfo.indexOf(','));
		String age = getInfo.substring(getInfo.indexOf(',')+1);
		personMap.put(name, age);
		}		
		//%
		Set<Map.Entry<String, String>> setinfo = personMap.entrySet();
		Iterator<Map.Entry<String, String>> it = setinfo.iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> entry = it.next();
			System.out.printf(" %s은 %s살 \n", entry.getKey(),entry.getValue());
			
		}
		
		
		
	}
}
