package javabaisc.oop;

public class IAnimalMain {
			public static void main(String[] args) {
				
				IAnmal dog2 = new Dog2();
				dog2.sound();
				
				IAnmal dog3 = new AnimalAdapter() {
					public void sound() {
						System.out.println("왈왈");
					
					}
				};
				dog3.sound();
				
				
				
	
				
				
				
				
				
				
			}
}
