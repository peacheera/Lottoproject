package exoop4;

public class CakeMain {
	public static void main(String[] args) {
		printCake ("모카");
		printCake ("바나나");
		printCake ("초콜릿");
	
	} // main
	
	public static void printCake(String name) {
		
	Cake cake = new Cake(name) {
		public String getName() {
			return super.getName();
			}
		};
		System.out.println(cake.getName()+ "케이크가 만들어 졌습니다.");
			
	}
	
}//class
