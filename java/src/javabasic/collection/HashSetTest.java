package javabasic.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
			
			// HashSet 생성
			Set<String>nameSet = new HashSet<String>();
			
			// 요소 추가
			nameSet.add("홍동");
			nameSet.add("이신");
			nameSet.add("강찬");
			
			// 컬렉션 추가
			Set<String> subSet = new HashSet<String>();
			subSet.add("장고");
			subSet.add("율");
			nameSet.addAll(subSet);
			System.out.println(nameSet);

			// 요소 포함 여부
			System.out.println(nameSet.contains("장고"));
		
			// 셋이 비어있는지
			System.out.println(nameSet.isEmpty());
			
			// 요소 제거
			nameSet.remove("율");
			System.out.println(nameSet);
			
			// 요소 개수
			System.out.println(nameSet.size());
			
			// object[]로 변경
			Object[] objArr = nameSet.toArray();
			for (Object obj : objArr)
				System.out.println(obj);
			
			// set은 중복 불허
			nameSet.add("홍동");
			System.out.println(nameSet);
			
			
			
			
			
			
			
			
			
			
			
		}
}
