package javabaisc.oop;
//추상메소드
public abstract class AbstractPrinter implements IPrinter {

	String sort;
	String company;
	String name;
	int price;
	
	
	public AbstractPrinter(String company, String name, int price) {
		
		this.company = company;
		this.name = name;
		this.price = price;
	}

	@Override
	public void turnOn() {
		System.out.println(name + "프린터의 전원을 킨다");
	}

	@Override
	public abstract void print();
	
	
	@Override
	public void turnOff() {

		System.out.println(name + "프린터의 전원을 끈다");
		
		
		
		
		}

	@Override
	public String toString() {
		return sort + "(" + company + "," + name +","+ price + ")";
		}
	}
