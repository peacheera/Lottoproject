package lottery;

import java.util.Random;

public class Mega extends Lottery  {
	
	    private boolean saleAllowedInCountry; // 
	   
	   
	    
	    
	    public Mega(boolean saleAllowedInCountry) {
	        this.ticketKind = "Mega";
	        this.ticketPrice = 10000;
	        this.saleAllowedInCountry = saleAllowedInCountry;
	    }

	    @Override
	    public String getTicketKind() {
	        return ticketKind;
	    }

	    @Override
	    public int getTicketPrice() {
	        return ticketPrice;
	    }

	    @Override
	    public int[] generateNumbers() {
	        Random rand = new Random();
	        return new int[]{rand.nextInt(20) + 1}; 
	    }
	}