package Util;

import java.util.ArrayList;

import Util.Card;

public class Player{
	
	
	private ArrayList<Card> hand;
	//private ArrayList<Card> deck;
	//private ArrayList<Card> grave;
	private ArrayList<InPlayCard> field= new ArrayList<InPlayCard>();
	private int life = 20;
	private String name;
	public int totalWins = 0;
	
	public ArrayList<Card> getHand() {
		return hand;
	}
	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
	}
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<InPlayCard> getField() {
		return field;
	}
	
	public void setField(ArrayList<InPlayCard> field) {
		this.field = field;
	}
	public void incTotalWins() {
		this.totalWins++;
	}
	
	


}
