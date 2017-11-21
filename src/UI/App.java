package UI;

import java.util.ArrayList;
import java.util.Random;

import Util.Card;
import Util.Card.Ability;
import Util.Card.Type;
import Util.Player;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player p1 = new Player();
		Player p2 = new Player();
		ArrayList<Card> p1d = new ArrayList<Card>();
		ArrayList<Card> p2d = new ArrayList<Card>();
		Card Forest = new Card("Forest", Type.LAND, 0, 0, 0, null);
		Card TerainEle = new Card("TerainEle",Type.CREATURE, 3, 2, 2, null);
		Card AlpineGrizz = new Card("AlpineGrizz",Type.CREATURE, 4, 2, 3, null);
		Card CentaurCour = new Card("CentaurCour",Type.CREATURE, 3,3, 3, null);
		Card Colossodon = new Card("Colossodon",Type.CREATURE, 2, 4,3, null);
		Card Broodhunter = new Card("Broodhunter",Type.CREATURE, 4, 3, 4, null);
		Card FeralKrus = new Card("FeralKrus",Type.CREATURE, 5, 4, 5, null);
		Card Thornhide = new Card("Thornhide",Type.CREATURE, 4 ,5 ,5, null);
		Card TuskedColos = new Card("TuskedColos",Type.CREATURE, 6, 5, 6, null);
		Card LargerThan = new Card("LargerThan",Type.SORCERY, 0, 0, 2, Ability.PUMP);
		Card Explore = new Card("Explore",Type.SORCERY, 0, 0, 2, Ability.EXPLORE);
		Card PreyUpon = new Card("PreyUpon",Type.SORCERY, 0, 0, 1, Ability.FIGHT);
		//2
		for(int i=0; i<2; i++) {
		p1d.add(TuskedColos);
		p1d.add(PreyUpon);
		p1d.add(Thornhide);
		p1d.add(FeralKrus);
		p1d.add(Colossodon);
		p1d.add(AlpineGrizz);
		p1d.add(CentaurCour);
		}
		//4
		for(int i=0; i<4; i++) {
		p1d.add(LargerThan);
		p1d.add(Explore);
		p1d.add(TerainEle);
		p1d.add(Broodhunter);
		}
		for(int i=0; i<20; i++) {
		p1d.add(Forest);	
		}
		System.out.println(TerainEle.toString());
		
		p1.setDeck(p1d);
		Random rnd = new Random();
		ArrayList<Card> hand = new ArrayList<Card>();
		for(int i=0; i<7; i++) {
		int e=rnd.nextInt(p1.getDeck().size());
		Card c = p1.getDeck().get(e);
		p1.getDeck().remove(e);
		hand.add(c);
		System.out.println(i);
		p1.setHand(hand);
		}
		System.out.println("Player 1 Hand");
		for(int i=0; i<p1.getHand().size(); i++) {
		
		System.out.println(p1.getHand().get(i).toString()+"\n");
		}
		System.out.println("Player 2 Hand");
		//for(int i=0; i<p2.getHand().size(); i++) {
			
	//	}
		
		}

}
