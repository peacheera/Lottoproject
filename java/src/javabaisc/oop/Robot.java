package javabaisc.oop;

import java.sql.Timestamp;
// Robot 데이터 클래스
public class Robot {
		
	private String name; //이름
	private String comany;	 //제조사
	private Timestamp mfd ; //제조년월
	private int weight ; //중량
	
	
	//기본
	public Robot() {
		
	}
	//생성자
	public Robot(String name, String comany, Timestamp mfd, int weight) {
		super();
		this.name = name;
		this.comany = comany;
		this.mfd = mfd;
		this.weight = weight;
	}

	
	
	// getter , setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComany() {
		return comany;
	}

	public void setComany(String comany) {
		this.comany = comany;
	}

	public Timestamp getMfd() {
		return mfd;
	}

	public void setMfd(Timestamp mfd) {
		this.mfd = mfd;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Robot [name=" + name + ", comany=" + comany + ", mfd=" + mfd + ", weight=" + weight + "]";
	}

	
	
	
}
