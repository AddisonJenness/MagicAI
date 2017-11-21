package Util;


public class Card implements Comparable<Card>{

	private static final long serialVersionUID = 1L;

	public enum Type {CREATURE, LAND, SORCERY }; //Put variable each number in Rank
	public int Power;
	public int Toughness;
	public int Cost;
	public enum Ability {};

	private Type type;//set variable Rank as rank
	private Ability ability;//set variable Suit as suit

	public Card(Type type, int power, int toughness, int cost, Ability ability) { //Get rank and suit to set card
		this.type = type;
		this.Power = power;
		this.Toughness = toughness;
		this.Cost =cost;
		this.ability = ability;
	}

	public int getPower() {
		return Power;
	}

	public void setPower(int power) {
		Power = power;
	}

	public int getToughness() {
		return Toughness;
	}

	public void setToughness(int toughness) {
		Toughness = toughness;
	}

	public int getCost() {
		return Cost;
	}

	public void setCost(int cost) {
		Cost = cost;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Ability getAbility() {
		return ability;
	}

	public void setAbility(Ability ability) {
		this.ability = ability;
	}

	public String toString() {
		String a = (" Type : "+this.type+
				"\n Power : "+this.Power+
				"\n Toughness : "+this.Toughness+
				"\n Cost : "+this.Cost+
				"\n Ability : "+this.ability);
		return a;
	}

	@Override
	public int compareTo(Card o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
