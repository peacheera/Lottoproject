package javabasic.excollection;

import java.util.ArrayList;


public class PersonInfo2 {
	public static void main(String[] args) {
//		Person 객체를 생성하며 3명의 이름과 나이 출력 A

		ArrayList<Person> setinfo = new ArrayList<Person>();

		 setinfo.add(new Person("귀선", "10"));	
		 setinfo.add(new Person("하나", "3"));	
		 setinfo.add(new Person("단아", "5"));	
			
		 for(Person person : setinfo)
		System.out.println(person);	
			
			
		
	}
}
