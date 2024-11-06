package oop.inheritence.test;

public class Lg extends Company{

		String laptop;
		String television;
		
		String getName() {
			return "엘쥐";
			
		}
		
		@Override
		public String toString() {
			return "회사";
		}
}
