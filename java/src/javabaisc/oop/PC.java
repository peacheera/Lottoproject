 package javabaisc.oop;

 //	 PC객체를 생성하려면 Monitor, Desktop, Keyboard가 있어야함
//  has a 관계 (위임관계, delegation)
//  상속받지 않아도 가지고 있으므로 사용할 수 있는 관계
//  PC has a monitor
//  PC has a Desktop
//  PC has a Keyboard 
 
 public class PC {
	
	// 변수 5개를 모듈화 시킴	
	String company;// 제조회사
	int price;// 가격
	
	Monitor monitor;
	Desktop desktop;
	Keyboard keyboard;
	
//	기본 생성자
//	파라미터가 있는 생성자를 만들려면 기본 생성자를 꼭 만들어야 함
	public PC() {
		
	}
//	생성자 만들기 source > using field
	public PC(String company, Monitor monitor, Desktop desktop, Keyboard keyboard) {
		super();
		this.company = company;
		this.monitor = monitor;
		this.desktop = desktop;
		this.keyboard = keyboard;
	}
	
	public int getPrice() {
		return this.price;
	}
	
//	setter
//	PC 가격= 모니터 가격 + 데스크탑 가격 + 키보드 가격
	public void setPrice() {
		this.price = monitor.price + desktop.price + keyboard.price;
	}
}
