package lottery;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Mega extends Lottery  {
   
       private boolean saleAllowedInCountry; // 판매 가능 여부 (한국이면 true, 불가능이면 false)

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
       public boolean isSaleAllowedInCountry() {
           return saleAllowedInCountry;
      }
       
   }