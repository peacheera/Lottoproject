package lottery;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LotteyMain {
	public static void main(String[] args) {
		
		
	Scanner sc = new Scanner(System.in);
	 System.out.println("티켓 종류를 선택하세요 "
		 		+ "\nPower = 1~65의 번호중 5개의 번호 입력!"
		 		+ "\nMega = 1~20의 번호중 1개의 번호 입력!"
		 		+ "\nLotto = 1~45의 번호중 7개의 번호 입력!");
	     String ticketType = sc.nextLine();

	     Lottery lottery;
	     if (ticketType.equalsIgnoreCase("Power")) {
	         System.out.println("수령 방법을 선택하세요 (직접수령 : true / 익명수령 false): ");
	         boolean pickupMethod = sc.nextBoolean();
	         lottery = new Power(pickupMethod);

	     } else if (ticketType.equalsIgnoreCase("Mega")) {
	         System.out.println("주거지를 선택하세요! (한국 = true/ 북한= false): "); 
	         boolean saleAllowed = sc.nextBoolean();
	         lottery = new Mega(saleAllowed);

	     } else if (ticketType.equalsIgnoreCase("Lotto")) {
	         lottery = new Lotto();

	     } else {
	         System.out.println("잘못된 선택입니다.");
	         return;
	     }

	     System.out.println("선택한 티켓 종류: " + lottery.getTicketKind());
	     System.out.println("티켓 가격: " + lottery.getTicketPrice() + "원");
	     System.out.println("START!");

	     List<Integer> generatedNumbers = lottery.generateNumbers();
	     
	     System.out.println("번호를 입력하세요");
	     
	     
	     List<Integer> userNumbers = new ArrayList<Integer>(generatedNumbers.size());
	     for (int i = 0; i < generatedNumbers.size(); i++) {
	        userNumbers.add(sc.nextInt()); 
	     }

	     int matchCount = 0;
	     for (int userNum : userNumbers) {
	         for (int genNum : generatedNumbers) {
	             if (userNum == genNum) {
	                 matchCount++;
	                 break;
	             }
	         }
	     }

	     
	     
	     switch (lottery.getTicketKind()) {
	         case "Power":
	             if (matchCount == 5) System.out.println("1등 당첨!");
	             else if (matchCount == 4) System.out.println("2등 당첨!");
	             else if (matchCount == 3) System.out.println("3등 당첨!");
	             else System.out.println("꽝! 다음 기회에.");
	             break;

	         case "Mega":
	             if (matchCount == 1) System.out.println("1등 당첨!");
	             else System.out.println("꽝! 다음 기회에.");
	             break;

	         case "Lotto":
	        	 boolean bonusMatch = userNumbers.get(5).equals(generatedNumbers.get(6));
	             if (matchCount == 6) System.out.println("1등 당첨!");
	             else if (matchCount == 5 && bonusMatch) System.out.println("2등 당첨!");
	             else if (matchCount == 5) System.out.println("3등 당첨!");
	             else System.out.println("꽝! 다음 기회에.");
	             break;
	     }

	     sc.close();
	 }
}