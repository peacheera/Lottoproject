package lottery;

public abstract class Lottery{
		
		  protected String ticketKind; // 티켓 종류
		    protected int ticketPrice;   // 티켓 가격

		    public abstract String getTicketKind();
		    public abstract int getTicketPrice();
		    public abstract int[] generateNumbers();
}
	
		    
	
	
