package exoop4;

import exoop4.Student.Score;

public class StudentMain {
	
	public static void main(String[] args) {
		
		makeStudent("유자차", 100, 90, 88);
		makeStudent("둥글레차", 70, 90, 88);
		makeStudent("페퍼민트차", 88, 90, 88);
		
		}
	public static void makeStudent(String name, int kor, int eng, int math) {
		Student student = new Student(name);
		student.score = student.new Score(eng, kor, math, 0, 0.0f);
		printScore(student);
	}
	private static void printScore(Student student) {
		System.out.println(
					student.name
					+ "학생의 국어점수는" + student.score.eng 
					+ "국어점수는" + student.score.kor
					+ "수학점수는" + student.score.math
					+ "총 합은" + student.score.getSum()
					+ "평균은" + student.score.getavg() 
					+ "입니다."
				
				);
		
		}
	}
