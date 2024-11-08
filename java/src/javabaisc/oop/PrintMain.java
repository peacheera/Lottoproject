package javabaisc.oop;

public class PrintMain {

	public static void main(String[] args) {

		// 인터페이스를 구현한 클래스의 객체를 생성하면 "항상" 인터페이스 타입참조변수를 사용한다.
		// why 프로그램 구현이 유연하고 확장성이 있어 진다
		IPrinter inkejet = new InkjetPrinter("상송", "잉크", 1000);
		operate(inkejet);

		// 인터페이스를 구현한 클래스의 객체를 생성하면 "항상" 인터페이스 타입참조변수를 사용한다.
		IPrinter razor = new RazorPrinter("엔쥐", "종이", 500);
		operate(razor);

		// 배열에서 다양성을 활용
		// 잉크젯프린터 500개 레이저프린터500개를 갖는 배열
		IPrinter[] iPrinters = new IPrinter[1000];

//		 배열에 잉크젯프린터 500개, 레이저프린터 500개 저장
		int iPrintersLeng = iPrinters.length;

		for (int i = 0; i < iPrintersLeng; i++) {

			if (i % 2 == 0) {
				iPrinters[i] = new InkjetPrinter("제조사명" + (i + 1), "inkjet" + (i + 1), 1000);
			} else {
				iPrinters[i] = new RazorPrinter("제조사명" + (i + 1), "Razor" + (i + 1), 2000);
			}
		}

		for (IPrinter iprinter : iPrinters) {
			System.out.println((AbstractPrinter) iprinter);

		}
		// 배열에 있는 것 모두 꺼내서 출력
		// 출력형태 : 잉크젯 프린터

//		for (int i = 0; i < iPrintersLeng; i++) {
//			if(iPrinters[i] instanceof InkjetPrinter) {
//				System.out.println("잉크프린터");
//			}else if (iPrinters[i] instanceof RazorPrinter) {
//				System.out.println("레이저프린터");
//				
//			}	
//		System.out.println(((AbstractPrinter)iPrinters[i]).toString());
//		}

	}// main
//		
//	static void print(IPrinter iPrinter) {
//		System.out.print(((AbstractPrinter)iPrinter).company);
//		System.out.print(", ");
//		System.out.print(((AbstractPrinter)iPrinter).name);
//		System.out.print(", ");
//		System.out.print(((AbstractPrinter)iPrinter).price);
//		System.out.print(") ");
//	}	

	// IPrinter 인터페이스의 역할 : InkjetPrinter, RazorPrinter의 타입을 일원화
	static void operate(IPrinter iPrinter) {

		// iPrinter가 갖고있는 참조값에 따라서 각 클래스의 메소드가 호출된다.
		iPrinter.turnOn();
		iPrinter.print();
		iPrinter.turnOff();
	}
}