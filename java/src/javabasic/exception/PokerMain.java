package javabasic.exception;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PokerMain {
	
	public static void main(String[] args) {
	//player 5명
		List<Player> playerList = new ArrayList<Player>();
		playerList.add(new Player("단아", Collections.EMPTY_LIST));
		playerList.add(new Player("하나", Collections.EMPTY_LIST));
		playerList.add(new Player("귀선", Collections.EMPTY_LIST));
		playerList.add(new Player("희라", Collections.EMPTY_LIST));
		playerList.add(new Player("보라", Collections.EMPTY_LIST));

	// 카드번호 
		List<Card> totalCardList = new ArrayList<Card>();
		List<String> shapeList = new ArrayList<String>();
		shapeList.add("S");shapeList.add("D");shapeList.add("H");shapeList.add("C");
		for (int i = 0; i < shapeList.size(); i++) {
			for (int j = 2; j < 14; j++) {
				totalCardList.add(new Card(j,shapeList.get(i)));
			}
		}
		System.out.println(totalCardList);
		
		// 카드섞기
		Collections.shuffle(totalCardList);
		System.out.println(totalCardList);
		
		// 7장씩 나누기
		for (int i = 0; i < playerList.size(); i++) {
			playerList.get(i).setCardList(totalCardList.subList(i*7, (i*7)+7));
		}
		for(Player player : playerList) {
			System.out.println(player);
		}
	}
}
