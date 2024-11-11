package exoop4;


public class Student {

		String name;
		Score score;
		

		public Student(String name) {
			
			this.name = name;
			
	
		}
		
		class Score{
			
		int eng;
		int kor;
		int math;
		int sum;
		float avg;
		
		public Score(int eng, int kor, int math, int sum, float avg) {
			super();
			this.eng = eng;
			this.kor = kor;
			this.math = math;
			this.sum = sum;
			this.avg = avg;
		}
		
		public int getSum() {
			return eng + kor + math;
			
		}

		public float getavg() {
			return getSum()/3;
			
			}
		}

	}
		
		

	
	





