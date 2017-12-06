package UI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import Util.BoardState;
import Util.Card;
import Util.Card.Ability;
import Util.Card.Type;
import Util.Database;
import Util.InPlayCard;
import Util.Player;

public class DatabaseDriver implements Database {

	private ArrayList cards;
	private Map board;
		public DatabaseDriver() {
			createCards();
			createBoardState();
		}
		
		
		@SuppressWarnings("unchecked")
		private void createBoardState() {
			board = new HashMap();
			
			Player p1 = new Player();
			Player p2 = new Player();
			ArrayList myCards = new ArrayList();
			p1.getField().add(new InPlayCard("AlpineGrizz",Type.CREATURE, 4, 2, 3, true));
			p1.getField().add(new InPlayCard("CentaurCour",Type.CREATURE, 3,3, 3, true));
			p1.getField().add(new InPlayCard("Colossodon",Type.CREATURE, 2, 4,3, true));
			p1.getField().add(new InPlayCard("Thornhide",Type.CREATURE, 4 ,5 ,5, true));
			p2.getField().add(new InPlayCard("Frenzied Raptor",Type.CREATURE, 4, 2, 3, false));
			p2.getField().add(new InPlayCard("Falkenrath Reaver",Type.CREATURE, 2, 2, 2, false));
			for(int i=0;i<p1.getField().size();i++) {
				for(int m=0;m<p2.getField().size();m++) {
					p1.getField().get(i).Fight(p2.getField().get(m), i);
					//System.out.println("next fight");
				}
				boolean temp=true;
				for(int a=0;a<p1.getField().get(i).fights.size();a++)
				{
					//System.out.println(p1.getField().get(i).fights.iterator().next());
					boolean temppp=(boolean) p1.getField().get(i).fights.iterator().next();
					if(temppp==false) {
						temp=false;
						//System.out.println("tem=false");
					}
					
					}
				if(temp==true) {
					p1.incTotalWins();
					}
				//p1.incTotalWins();
				System.out.println(p1.totalWins);
			}
			//System.out.println(p1.totalWins);
			board.put(new Integer(1), new BoardState(p1, p2));
		}


		@SuppressWarnings("unchecked")
		private void createCards() {
			cards = new ArrayList<Card>();
			//p1 Cards
			
					cards.add(new Card("Forest", Type.LAND, 0, 0, 0, null));
					cards.add(new Card("TerainEle",Type.CREATURE, 3, 2, 2, null));
					cards.add(new Card("AlpineGrizz",Type.CREATURE, 4, 2, 3, null));
					cards.add(new Card("CentaurCour",Type.CREATURE, 3,3, 3, null));
					cards.add(new Card("Colossodon",Type.CREATURE, 2, 4,3, null));
					cards.add(new Card("Broodhunter",Type.CREATURE, 4, 3, 4, null));
					cards.add(new Card("FeralKrus",Type.CREATURE, 5, 4, 5, null));
					cards.add(new Card("Thornhide",Type.CREATURE, 4 ,5 ,5, null));
					cards.add(new Card("TuskedColos",Type.CREATURE, 6, 5, 6, null));
					cards.add(new Card("LargerThan",Type.SORCERY, 0, 0, 2, Ability.PUMP));
					cards.add(new Card("Explore",Type.SORCERY, 0, 0, 2, Ability.EXPLORE));
					cards.add(new Card("PreyUpon",Type.SORCERY, 0, 0, 1, Ability.FIGHT));

			//p2 Cards
					cards.add(new Card("Mountain", Type.LAND, 0,0,0,null));
					cards.add(new Card("Falkenrath Reaver",Type.CREATURE, 2, 2, 2, null));
					cards.add(new Card("Frenzied Raptor",Type.CREATURE, 4, 2, 3, null));
					cards.add(new Card("Hulking Devil",Type.CREATURE, 5, 2, 4, null));
					cards.add(new Card("Hyena Pack",Type.CREATURE, 3, 4, 4, null));
					cards.add(new Card("Earth Elemental",Type.CREATURE, 4, 5, 5, null));
					cards.add(new Card("Spitting Earth", Type.SORCERY, 0, 0, 2, Ability.BURN_CREATURE));
					cards.add(new Card("Blazing Volly", Type.SORCERY, 0, 0, 1, Ability.BURN_CREATURE));
					cards.add(new Card("Arrow Storm", Type.SORCERY,0,0,5,Ability.BURN));
					cards.add(new Card("Pillar of Flame",Type.SORCERY, 0, 0, 1, Ability.BURN));
					cards.add(new Card("Incendiary Flow", Type.SORCERY, 0, 0, 2, Ability.BURN));


		}
		
	

	@Override
	public Collection getCards() {
		// TODO Auto-generated method stub
		return cards;
	}


	
	public BoardState getBoardState(int BoardState) {
		// TODO Auto-generated method stub
		return (BoardState) board.get(new Integer(BoardState));
	}



	}
