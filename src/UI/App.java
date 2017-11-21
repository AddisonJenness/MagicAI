package UI;

import java.util.ArrayList;

import Util.Card;
import Util.Card.Type;
import Util.Player;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player p1 = new Player();
		Player p2 = new Player();
		ArrayList<Card> p1d = new ArrayList<Card>();
		ArrayList<Card> p2d = new ArrayList<Card>();
		Card Mountain = new Card(Type.LAND, 0, 0, 0, null);
		Card TerainEle = new Card(Type.CREATURE, 3, 2, 2, null);
		System.out.println(TerainEle.toString());
		
		p1.setDeck(p1d);
	}

}
