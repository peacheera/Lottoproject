package lottery;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Lotto extends Lottery {

   private List<String> colorBalls; //각 번호의 색상

   public Lotto() {
      this.ticketKind = "Lotto";
      this.ticketPrice = 5000;
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
       public List<Integer> generateNumbers(){// 랜덤번호
          Set<Integer> randomNum = new HashSet<Integer>();
          int num;
      while(randomNum.size()<5) {
         num = (int)(Math.random()*45+1);
         randomNum.add(num);
         
         List<Integer> numberList = new ArrayList<>(randomNum);
           }
      int bonusNumber;
      
         
      return(List<Integer>)randomNum;    
   	}	
   }
      