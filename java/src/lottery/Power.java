package lottery;

import java.util.Arrays;
import java.util.Random;

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

	    @Override
	    public int[] generateNumbers() {
	        Random rand = new Random();
	        int[] numbers = new int[5];
	        for (int i = 0; i < 5; i++) {
	            int num;
	            boolean isDuplicate;
	            do {
	                num = rand.nextInt(65) + 1; // 1~65 사이의 번호
	                isDuplicate = false;
	                for (int j = 0; j < i; j++) {
	                    if (numbers[j] == num) {
	                        isDuplicate = true;
	                        break;
	                    }
	                }
	            } while (isDuplicate);
	            numbers[i] = num;
	        }
	        Arrays.sort(numbers);
	        return numbers;
	    }
	}
		
			

