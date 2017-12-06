package Util;

import java.util.ArrayList;
import java.util.Iterator;

import jess.Filter;
import jess.JessException;
import jess.Rete;
import jess.WorkingMemoryMarker;

public class TurnEngine {
	private Rete engine;
	private WorkingMemoryMarker marker;
	private Database database;

	public TurnEngine(Database aDatabase) throws JessException{
		System.out.println("Turnengine1");
		engine = new Rete();
		engine.reset();
		System.out.println("Rules loadedqwer");
		engine.batch("Rules.clp");
		System.out.println("Rules loaded");
		database= aDatabase;
		engine.addAll(database.getCards());
		
		marker = engine.mark();
	}
	
	private void loadGameData(int boardState) throws JessException{
		
		BoardState board = database.getBoardState(boardState);
		
		if(board != null) {
			engine.add(board);
			System.out.println("Added board");
			engine.addAll(board.getCards1());
			engine.addAll(board.getCards2());
			
		}
	}
	
	public Iterator run(int boardState) throws JessException {
		
		engine.resetToMark(marker);
		
		loadGameData(boardState);
		
		engine.run();
		
		return engine.getObjects(new Filter.ByClass(Card.class));
	}
	
}
