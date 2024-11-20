package lottery;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Power extends Lottery  {
	
	   private boolean pickupMethod; // 수령 방법 (true: 직접수령, false: 익명수령)

	    public Power(boolean pickupMethod) {
	        this.ticketKind = "Power";
	        this.ticketPrice = 2000;
	        this.pickupMethod = pickupMethod;
	    }

	    @Override
	    public String getTicketKind() {
	        return ticketKind;
	    }

	    @Override
	    public int getTicketPrice() {
	        return ticketPrice;
	    }
	    public List<Integer> generateNumbers(){
	          Set<Integer> randomNum = new HashSet<Integer>();
	          int num;
	      while(randomNum.size()<5) {
	         num = (int)(Math.random()*20+1);
	         randomNum.add(num);
	         Iterator<Integer> it = randomNum.iterator();
	         while(it.hasNext()) {
	            
	         }
	      }
	         return (List<Integer>) randomNum;
	    }
	    public boolean isPickupMethod() {
	           return pickupMethod;
	      }
	}
		
			

