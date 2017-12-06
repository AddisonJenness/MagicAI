package Util;

import java.util.ArrayList;
import java.util.Collection;


public interface Database {
	public Collection getCards();
	public BoardState getBoardState(int mapLocation);
	
}