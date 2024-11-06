package oop.inheritence.test;

public class CompanyMain {
	public static void main(String[] args) {

		Company[] company = {
				new Kakao(),
				new Lg(),
				new Samsung(),
			};
		
		for (int i = 0; i < company.length; i++) {
		System.out.println(company[i]);
		}
		for (int j = 0; j < company.length; j++) {
			System.out.println(company[j].getName());
		}
	}
}