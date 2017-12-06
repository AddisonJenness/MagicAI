package UI;

import java.util.Iterator;

import Util.TurnEngine;
import jess.JessException;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DatabaseDriver db = new DatabaseDriver();
			System.out.println("I did a thing mom 1");
			TurnEngine engine = new TurnEngine(db);
			System.out.println("I did a thing mom 2");
			processWinner(db, engine, 1);
			System.out.println("I did a thing mom 3");
		} catch (JessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void processWinner(DatabaseDriver db, TurnEngine engine, int mapLocation ) throws JessException {
		Iterator attackers;
		Iterator creatures;
		System.out.println("Creatures on the field :");
		creatures = db.getBoardState(mapLocation).getCards1();
		while (creatures.hasNext()) {
			System.out.println("   "+creatures.next().toString());
		}
	}

}
