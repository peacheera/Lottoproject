package javabaisc.oop;

import java.sql.Timestamp;

// 역할 : Robot 생성
public class RobotFectory {
	// static member variable
	// 클래스로딩 타임에 메모리에 생성되고 타입의 기본값으로 자동 최기화 
	private static int count; // 생산 수량

// 역할을 빌림
	public Robot creatRobot(String name, String comany, Timestamp mfd, int weight) {// 역할을 빌림
		System.out.println(name + "로봇이 생산되었습니다!");
		System.out.println("총 생산된 로봇의 수량은" + ++count + "대 입니다!");
		return new Robot(name, comany, mfd, weight);
		
		
	}
	
	public static int getCount() {
		return count;
	}

}
