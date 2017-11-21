package Util;

import java.util.ArrayList;

import Util.Card;

public class Player{
	
	
	private ArrayList<Card> hand;
	private ArrayList<Card> deck;
	private ArrayList<Card> grave;
	private int life = 20;
	private String name;
	
	public ArrayList<Card> getHand() {
		return hand;
	}
	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
	}
	public ArrayList<Card> getDeck() {
		return deck;
	}
	public void setDeck(ArrayList<Card> deck) {
		this.deck = deck;
	}
	public ArrayList<Card> getGrave() {
		return grave;
	}
	public void setGrave(ArrayList<Card> grave) {
		this.grave = grave;
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
	
	
	
	


}
