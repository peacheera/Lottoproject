package javabasic.exception;

import java.util.List;

public class PorkerRule {

	// 로얄 스트레이트 플러시 여부 : 연속된 5개의 숫자(10 ~ 14)이고 5개가 동일한 무늬
	public static boolean isRoyalStraightFlush(List<Card>cardList) {
		return false;
		
		
	}// 스트레이트 플러시 여부 : 연속된 5개의 숫자이고 5개가 동일한 무늬, 로얄 제외
	public static boolean isStraightFlush(List<Card>cardList) {
		return !isRoyalStraightFlush(cardList)
				&& isStraight(cardList) && isFlush(cardList);
							
		
	}
	// 포카드 여부 : 4개의 숫자가 동일
	public static boolean isFourCard(List<Card>cardList) {
		return false;
		
	}
	//풀하우스 : 트리플 + 원페어	 or 트리플 + 트리플
	public static boolean isFullHouse(List<Card>cardList) {
		return false;
		
	}
	// 플러시 여부 : 동일한 무늬가 5개 이상
	public static boolean isFlush(List<Card>cardList) {
		return false;
		
	}
	// 스트레이트 : 연속된 번호가 5개 이상
	public static boolean isStraight(List<Card>cardList) {
		return false;
		
	}
	// 트리플 여부 : 동일한 숫자가 3개 
	public static boolean isTriple(List<Card>cardList) {
		return false;
		
		
	}
	// 투페어 여부 :동일한 숫자 2개가 2개 이상
	public static boolean isTowpair(List<Card>cardList) {
			if(numOfPair(cardList) ==2 ||numOfPair(cardList)==3) 
			return true;				
			return false;
		
		
	}
	// 원페어 여부 : 동일한 숫자 3개가 1개
	public static boolean isOnepair(List<Card>cardList) {
		if(numOfTriple(cardList) ==2 ||
				(numOfTriple(cardList)==1 && numOfPair(cardList)==1) || 
				(numOfTriple(cardList)==1 && numOfPair(cardList)==2)) {
		return true;
	}
		return false;
				
	}
	// 페어의 수 반환
	public static int numOfPair(List<Card>cardList) {
		return 0;
				
	}
	// 트리플의 수 반환
	public static int numOfTriple(List<Card>cardList) {
		return 0;
		
		
	}
}