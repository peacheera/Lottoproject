package javabaisc.oop;

public class PCMain {
	public static void main(String[] args) {
		
		
		
		Monitor monitor = new Monitor();
		monitor.company = "알파스캔";
		monitor.model = "AS30";
		monitor.inch = 30;
		monitor.price = 50000;
		
		Desktop desktop = new Desktop();
		desktop.cpu = "I9";
		desktop.memory = "16G";
		desktop.price = 100000;
		
		Keyboard keyboard = new Keyboard();
		keyboard.KeyCount = 101;
		keyboard.Wireless = true;
		keyboard.price = 50000;
		
		
//		PC객체 생성
		PC pc = new PC("LG", monitor, desktop, keyboard);
//		PC총 가격 계산	
		pc.setPrice();
		
		
		System.out.println(pc.company + "회사 PC의 총 가격은" + pc.getPrice() + "원 입니다.");
		
		
		
		
		
		
		
	}
}
