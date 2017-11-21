package Game;

import java.util.ArrayList;

import Util.Card;

public class GameLogic {
	int phase = 0; //0 = draw, 1 = main1, 2 = declareattacker, 3 = declareblockers,
		// 4 calculation 5 mp2 
	int playerturn = 0; //1 = left, 2 = right
	
	ArrayList<Card> p1Field = new ArrayList<Card>();
	ArrayList<Card> p2Field = new ArrayList<Card>();
	
	
	Card [][] combatArray = new Card[10][5];
	
	public void playPermanent (Card perm, int playerturn ) {
		//tap lands = cost
		//remove perm from hand
		 if (playerturn == 1) {p1Field.add(perm);}
	else if (playerturn == 2) {p2Field.add(perm);}
	}
	
	public void playSpell () {
		//tap land = cost
		//remove
		
	}
	
	//playspell
	
	
	
	//punch
	
	//multipunch
	
	//fight
	
	//multifight
	
	//checkdmg
	
	//
	
}
