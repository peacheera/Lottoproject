package exexception;


public class ExceptionTest3 {
// 홍길동/산적, 강감찬/장군, 임꺽정/산적, 권율/장군, 의 름과 직업을 가진 5명의
//	Person을 생성하고 직업이 산적이면 좋은 직업을 선택하세요 라는 메세지 출력
	public static void main(String[] args) {
		
		Exception("홍길동", "산적");
		Exception("이순신", "장군");
		Exception("강감찬", "장군");
		Exception("임꺽정", "산적");
		Exception("권율", "장군");
		
	
	}


	public static void Exception(String name, String job) {
		// 생성된 Person객체의 직업이 산적이면
		if(new Person(name,job).getJob().equals("산적"));{
		try {	throw new JobException();// JobException을 발생시킴																	
			// jobExcepton을 처리함
		} catch (JobException je){
			System.out.println(name + "님" + je);
			}
		};
	}
}
