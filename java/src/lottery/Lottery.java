package lottery;

import java.util.List;

public abstract class Lottery{
		
		  protected String ticketKind; // 티켓 종류
		    protected int ticketPrice;   // 티켓 가격

		    public abstract String getTicketKind();
		    public abstract int getTicketPrice();
		    public abstract List<Integer> generateNumbers();
		    
		    public Lottery() {
		    	
		    }
}
	
		    
	
	
