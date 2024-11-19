package javabasic.exception;

import java.util.List;

public class Player {

	
		String name;
		List<Card> cards;

	
	public Player(String name, List<Card> cards) {
		super();
		this.name = name;
		this.cards = cards;
	}


	public Player(List<Card> totalCardList) {
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

              
	public List<Card> getCards() {
		return cards;
	}


	public void setCardList(List<Card> list) {
		this.cards = list;
	}


	@Override
	public String toString() {
		return name + cards;
	}


	
	
	
	
}