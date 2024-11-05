package nonstatic.test;

public class BusMain {
	
	public static void main(String[] args) {
		
		BusFectory busFactory = new BusFectory();
		
	
		creatBus(busFactory, "상진운수", "전기", "파란색");
		creatBus(busFactory, "한성운수", "디젤", "빨간색");
		creatBus(busFactory, "신흥운수", "전기", "노란색");
		creatBus(busFactory, "청진운수", "디젤", "초록색");
			
	}

	private static void creatBus(BusFectory busFactory, String company,
			String type, String color) {
		busFactory.creatBus( company, type, color);
	}
}
