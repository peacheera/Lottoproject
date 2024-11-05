package javabaisc.oop;

import java.sql.Timestamp;
import java.util.Date;

public class RobotMain {
	
	public static void main(String[] args) {
	// 로봇을 생성할 수 있는 Robotfactory생성
		
		RobotFectory robotFectory = new RobotFectory();
	
		// Robotfactory를 통해서 Robot을 생성
		// sysetem.currentTimeMillis() : 
		// : UNIX타임 (전산학 원년시간, 1970년 1월 1일 0시 0분 0초 0밀리초부터 현재까지
		// 밀리초마다 1씩 센 값을 반환
		System.out.println(System.currentTimeMillis());
		Date date = new Date(System.currentTimeMillis());
		System.out.println(date);
		
//		creatRobot(robotFectory);

		creatRobot(robotFectory,"태권브이", "태권브이주식회사",
		new Timestamp(System.currentTimeMillis()), 100);	
		
		creatRobot(robotFectory, "건담", "건담주식회사",
		new Timestamp(System.currentTimeMillis()), 150);
		
		creatRobot(robotFectory,"또봇", "또봇주식회사",
		new Timestamp(System.currentTimeMillis()), 50);
		
	}

	private static void creatRobot(RobotFectory robotFectory,
			String name, String company, Timestamp mfd, int weight) {
		robotFectory.creatRobot(name,	company, mfd, weight); 
	}
}
