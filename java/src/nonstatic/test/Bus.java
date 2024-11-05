package nonstatic.test;
	//Bus 데이터 클래스
public class Bus {
	
	private String company;
	private String type;
	private String color;
	
	//기본생성자
	public Bus() {	
	}

	public Bus(String company, String type, String color) {
		super();
		this.company = company;
		this.type = type;
		this.color = color;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Bus [company=" + company + ", type=" + type + ", color=" + color + "]";
	}
	

	
}
