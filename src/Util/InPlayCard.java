package Util;

import java.util.ArrayList;

import Util.Card.Ability;
import Util.Card.Type;

public class InPlayCard extends Card {
	public ArrayList fights= new ArrayList();
	public boolean Attacking =false;
	public boolean Blocking = false;
	public int Damage =0;
	public boolean wins;
	public boolean myCard;
	
	public InPlayCard(String name, Type type, int power, int toughness, int cost, boolean isMine) { //Get rank and suit to set card
		this.Name= name;
		this.type = type;
		this.Power = power;
		this.Toughness = toughness;
		this.Cost =cost;
		this.myCard=isMine;
	}
	
	public ArrayList getFights() {
		return fights;
	}
	public void setFights(ArrayList fights) {
		this.fights = fights;
	}
	public boolean isAttacking() {
		return Attacking;
	}
	public void setAttacking(boolean attacking) {
		Attacking = attacking;
	}
	public void setBlocking(boolean blocking) {
		Blocking = blocking;
	}
	public int getDamage() {
		return Damage;
	}
	public void setDamage(int damage) {
		Damage = damage;
	}
	public boolean isWins() {
		return wins;
	}
	public void setWins(boolean wins) {
		this.wins = wins;
	}
	public boolean isMyCard() {
		return myCard;
	}
	public void setMyCard(boolean myCard) {
		this.myCard = myCard;
	}
	
	public boolean Fight(Card o, int i) {
		if (this.Power>=o.Toughness) {
				System.out.println(this.Name+" fought "+o.Name+" and Won");
				this.fights.add(true);
				return true;
				
			
		}
		else {
			//fights.add(wins)
			System.out.println(this.Name+" loses to "+o.Name);
			wins=false;
			return false;
		}
		//System.out.println("I BROKE FREE!");
		//return Attacking;
	}
}

