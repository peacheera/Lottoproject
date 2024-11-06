package oop.inheritence.test;

public class Company extends CompanyMain {
	
	int Countpeople;
	String companyType;
	
	String getName() {
		return "가고싶은 회사";
	}
		public Company() {
			
		}
	
		@Override
		public String toString() {
			
			return "출근";
		}
	
	
}
