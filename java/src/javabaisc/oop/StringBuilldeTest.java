package javabaisc.oop;
/*
 * String은 문자열 불편, 즉 문자열 만들어지면 병견될 수 없음
 * 그래서 복합한 연산을 하면 문자열들이 무수히 만들어짐
	StringBuffer , StringBuilder 클래스를 제공
	StringBuffer : Thred Sate, 속도는 StringBuilder보다 느림
	StringBilder : Thred Unsafe, 속도는 StringBuff보다 빠름
		

 */
public abstract class StringBuilldeTest {
		public static void main(String[] args) {
			
			StringBuilder sb = new StringBuilder();
			sb.append("H");
			sb.append("E");
			sb.append("l");
			sb.append("l");
			sb.append("o");
			sb.append("j");
			sb.append("a");
			sb.append("v");
			sb.append("o");
		
			System.out.println(sb.capacity());//용량이 34,20
			
			
			StringBuilder sb1 = new StringBuilder();
			sb1.append("H");
			sb1.append("E");
			sb1.append("l");
			sb1.append("l");
			sb1.append("o");
			sb1.append("j");
			sb1.append("a");
			sb1.append("v");
			sb1.append("o");
			
		
			System.out.println(sb1.capacity());//용량이 34,20
			System.out.println(sb1.toString()); // StringBuilder를 String으로 반환
		
		
		
			StringBuilder sb2 = new StringBuilder("안녕하세요 자바!");
			System.out.println(sb2.charAt(2));
		
			sb2.delete(2, 5); 
			System.out.println(sb2); //안녕자바!
		
			System.out.println(sb2.deleteCharAt(5)); // 안녕자바
		
			sb2.ensureCapacity(50); // 버퍼용량을 50 이상으로 늘림
			System.out.println(sb2.capacity());	//52
			
			
			sb2.trimToSize(); // 문자가 없는 버퍼를 제거
			System.out.println(sb2.capacity()); // 5
			System.out.println(sb2.indexOf("자바")); //3
			
			StringBuilder sb3 = new StringBuilder("Java Java Java");
			// 5번 인텍스부터 Java가 처음 나오는 인덱스
			System.out.println(sb3.indexOf("Java",5)); // 5
		
			System.out.println(sb3.insert(5, "Hi ")); // Java Hi Java Java
		
			System.out.println(sb3.lastIndexOf("Java")); // 13
		
			System.out.println(sb3.length()); // 문자의 길이
			
			
			System.out.println(sb3.replace(5, 7,"Hello"));
			
			System.out.println(sb3.reverse());
			
			sb3.setCharAt(0, 'J');
			System.out.println(sb3);
			
			System.out.println(sb3.substring(5));
			System.out.println(sb3.substring(5, 9));
		}
}





















