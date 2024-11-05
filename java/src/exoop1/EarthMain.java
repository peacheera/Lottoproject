package exoop1;

public class EarthMain {
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.feeling = "기쁨";
		animal.meat = "고기";
		
		Nature nature = new Nature();
		nature.chemical = "산소";
		nature.food = "곡물";
		nature.helth = "등산";
		
		Earth earth = new Earth("인간은", nature, animal);
		
		System.out.println(earth.human + " 지구에게 " + earth.nature.chemical + "를(을) 받는다." );
	}
}
