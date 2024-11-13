package lottery;

import java.util.Arrays;
import java.util.Random;

public class Lotto extends Lottery {

	 private String[] colorBalls = new String[6]; // 각 번호의 색상

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
	    public int[] generateNumbers() {
	        Random rand = new Random();
	        int[] numbers = new int[7];
	        for (int i = 0; i < 6; i++) {
	            int num;
	            boolean isDuplicate;
	            do {
	                num = rand.nextInt(45) + 1; // 1~45 사이의 번호
	                isDuplicate = false;
	                for (int j = 0; j < i; j++) {
	                    if (numbers[j] == num) {
	                        isDuplicate = true;
	                        break;
	                    }
	                }
	            } while (isDuplicate);
	            numbers[i] = num;
	            colorBalls[i] = determineColor(num);
	        }

	        // 보너스 번호 생성 (중복 없는 번호)
	        int bonusNumber;
	        boolean isBonusDuplicate;
	        do {
	            bonusNumber = rand.nextInt(45) + 1;
	            isBonusDuplicate = false;
	            for (int j = 0; j < 6; j++) {
	                if (numbers[j] == bonusNumber) {
	                    isBonusDuplicate = true;
	                    break;
	                }
	            }
	        } while (isBonusDuplicate);
	        numbers[6] = bonusNumber; // 보너스 번호 저장

	        Arrays.sort(numbers, 0, 6); // 6개 번호 정렬
	        return numbers;
	    }

	    private String determineColor(int number) {
	        if (number <= 10) return "Yellow";
	        else if (number <= 20) return "Blue";
	        else if (number <= 30) return "Red";
	        else if (number <= 40) return "Gray";
	        else return "Green";
	    }
	}