package javabaisc.oop;

public class AnimalMain {
	public static void main(String[] args) {
		
		// 강아지 한마리 만들어서 소리를 내봅니다.
		Animal dog = new Dog();
		dog.sound();
		
		// 고양이 한마리 만들어서 소리를 내봅니다.
		Animal cat = new Cat();
		cat.sound();
		
		
		// 파리를 한마리 만들어서 소리를 내봅니다.
		// 익명이너클래스를 생성해서  한번만 사용 
		Animal fly = new Animal() {
			public void sound() {
				System.out.println("파리는 윙윙 소리를 냅니다.");
				}
			};
			fly.sound();
		// 상어를 한마리 만들어서 소리를 내봅니다.
			Animal shark = new Animal() {
				public void sound() {
					System.out.println("상어는 shark shark 소리를 냅니다.");
				}
			};
			shark.sound();	
			
			
		}
	}

