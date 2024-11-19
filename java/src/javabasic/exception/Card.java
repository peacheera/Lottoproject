package javabasic.exception;

public class Card {

	private int number; // 숫자 (A~10, j, Q, K)
	private String shape; // 무늬 (스페이드, 클로버, 다이아몬드, 하트)
	
	public  Card() {
	}

	public Card(int number, String shape) {
		super();
		this.number = number;
		this.shape = shape;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	@Override
	public String toString() {
		return shape+number;
	}

	
	
}
