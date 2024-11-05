package nonstatic.test;
	//역할 :  생성
public class BusFectory {
	
	
	private static int count; //출하중인 버스 수
	
	
	public Bus creatBus(String company, String type, String color) {
		System.out.println("출하중인 버스는 총 " + ++count + " 대 입니다");
		return new Bus(company, type, color);
		
	}
	
	public static int getCount() {
		return count;
	
	}
}
