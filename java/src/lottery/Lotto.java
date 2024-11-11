package lottery;

import java.awt.Color;

public class Lotto extends Lottery {
	
		public Lotto(String ticketKind, String ticketPrice) {
		super(ticketKind, ticketPrice);
		// TODO Auto-generated constructor stub
	}




		String colorball;
	
	  
	}



	   
		public String LottoColorball(int number, Color color) {
	           if (number <= 10) return "Yellow";
	           else if (number <= 20) return "Blue";
	           else if (number <= 30) return "Red";
	           else if (number <= 40) return "Gray";
	           else return "Green";
	        
	  
		}
	}
