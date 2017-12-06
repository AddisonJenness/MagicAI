package Util;

import java.util.ArrayList;
import java.util.Iterator;

public class BoardState implements Iterator {

	private Player p1;
	private Player p2;
	private int p1pow;
	private int p2pow;
	private ArrayList<InPlayCard> board1 = new ArrayList<InPlayCard>();
	private ArrayList<InPlayCard> board2 = new ArrayList<InPlayCard>();
	public BoardState(Player p1, Player p2) {
		for (Iterator p1p = p1.getField().iterator(); p1p.hasNext();) {
			Card c = (Card) p1p.next();
			p1pow += c.getPower();
		}
		for (Iterator p2p = p2.getField().iterator(); p2p.hasNext();) {
			Card c = (Card) p2p.next();
			p2pow += c.getPower();
		}
		board1.addAll(p1.getField());
		board2.addAll(p2.getField());
		this.p1 = p1;
		this.p2 = p2;
	}
	public BoardState() {
		System.out.println("WOOOOOOOOOOOOOOOOOOOOOOOOOOO");
	}

	public Iterator getCards1() {
		return board1.iterator();
	}
	public Iterator getCards2() {
		return board2.iterator();
	}
	public int getP1pow() {
		return p1pow;
	}
	
	public int getP2pow() {
		return p2pow;
	}
	public Player getP1() {
		return p1;
	}
	public Player getP2() {
		return p2;
	}
	public int getPower(Player p, int c) {
		int pow=p.getField().get(c).Power;
		return pow;
	}
	public int getLowestPower(Player p) {
		int pow=99;
		int temp;
		for (int i=0;i>p.getField().size(); i++) {
			temp=p.getField().get(i).Power;
			if (pow<temp) {
				pow=temp;
			}
		}
		return pow;
	}
	public int getLifeTotal(Integer p) {
		int life=99;
		
		if (p==1) {
		life=p1.getLife();}
		else if (p==2) {
			life=p1.getLife();}
		return life;
	}
	public int getTotalPower(int p) {
		if (p==1) {
		return this.p1pow;}
		else if (p==2) {
		return this.p2pow;}
		else {
			return 99999;
		}
			
	}
	public void setNewPower(int p, int c) {
		if (p==1) {
		p1pow-=p1.getField().get(c).Power;}
		else if (p==2) {
			p2pow-=p2.getField().get(c).Power;}
	}
	public void setBlocker(int c) {
		p1.getField().get(c).setBlocking(true);

	}
	public void setAttacker(int c) {
		p1.getField().get(c).setAttacking(true);
	}
	public int getNumberofCreatures(int p) {
		if (p==1) {
		return p1.getField().size();}
		else if (p==2) {
		return p2.getField().size();}
		else {
			return 99999;
		}
	}


	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return null;
	}
}
