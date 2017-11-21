package UI;

import Util.Card;
import Util.Card.Type;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card Mountain = new Card(Type.LAND, 0, 0, 0, null);
		Card TerainEle = new Card(Type.CREATURE, 3, 2, 2, null);
		System.out.println(TerainEle.toString());
	}

}
