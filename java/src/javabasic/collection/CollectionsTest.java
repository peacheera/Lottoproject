package javabasic.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;

import org.w3c.dom.NameList;

public class CollectionsTest {

		public static void main(String[] args) {
			
			
			// static 상수들
			System.out.println(Collections.EMPTY_LIST); // 요소가 없는 리스트
			System.out.println(Collections.EMPTY_SET); // 요소가 없는 셋
			System.out.println(Collections.EMPTY_MAP); // 엔트리가 없는 맵
			
			System.out.println(Collections.emptyList());
			System.out.println(Collections.emptySet());      
			System.out.println(Collections.emptyMap());
			System.out.println(Collections.emptyIterator());
			
			List<String> nameList = new ArrayList<String>();
			nameList.add("홍길동");
			nameList.add("강감찬");
			nameList.add("이순신");
			
			// 컬렉션에 요소추가
			//ararg(가변인자) : 1개 이상의 인자
			Collections.addAll(nameList, "장보고");
			Collections.addAll(nameList, "권율" , "최영");
			System.out.println(nameList);
			
			// 컬렉션 복사
			// 비어있는 컬렉션에 복사하면  IndexOutOfBoundsException 발생
			
//			List<String>copyList = new Array List<string>();
			List<String> copyList = new ArrayList<String>(Collections.nCopies(nameList.size(),null));
			Collections.copy(copyList, nameList);
			System.out.println(copyList);
			
			// 컬렉션 채우기
			List<String>copyList2
				= new ArrayList<String>(Collections.nCopies(nameList.size(),null));
			Collections.fill(copyList2, "김유신");
			System.out.println(copyList2);
			
			// 컬렉션 열거자 * 자바 1.0버전부터 있었으며 Iterator의 전 버전, 호환성 때문에 사용하고 있음
			Enumeration<String> en = Collections.enumeration(nameList);
			while (en.hasMoreElements()) {
				System.out.println(en.nextElement()); 
			}
			// 소스가 앞에 타겟이 뒤에
			// 컬렉션 요소 대체
			Collections.replaceAll(copyList2, "김유신","최영");
			System.out.println(copyList2);
			
			// 컬렉션 요소 순서를 180도 뒤집음
			Collections.reverse(nameList);
			System.out.println(nameList);

			// 컬렉션 요소 순서를 랜덤하게 섞음(ex) 포커게임 카드섞기))
			Collections.shuffle(nameList);
			System.out.println(nameList);
			
			List<Integer> intList = new ArrayList<Integer>();
			intList.add(5);
			intList.add(10);
			intList.add(1);
			intList.add(6);
			intList.add(9);
			
			//  intList정렬 < new Comparator를 이용
			// collection요소정렬
			// sort(정렬할 컬렉션, Comparator구현한 익명클래스)
			// 익명클래스에서는 Compatator의 compare()를 오버라이딩
			// compare메서드는 첫번째 파라미터 값이 크면 양수를 반환'
			// 두 파라미터의 값이 같으면 0, 두번째 파라미터의 값이 크면 음수를 반환'
			// intList = [5, 10, 1, 6, 9]
			// 1) i1=5, i2=10(반환이 음수)
			// 2) i1=5, i2=1(반환이 양수) .. 결과가 양수면 두개의 자리를 변경
			// 1),2) 반복
			Collections.sort(intList, new Comparator<Integer>() {
				@Override
				public int compare(Integer i1, Integer i2) {
//					return i1-i2;// sort 오름차순 정렬
					return i2- i1; // 내림차순 정렬
				}
			});
			System.out.println(intList); 
			
			// 컬렉션 요소의 순서를 180도 뒤집음
			Collections.reverse(intList);
			System.out.println(intList);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
}
