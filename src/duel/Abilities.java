package duel;

public class Abilities {

	private int strenght;
	private int intelligence;
	private int dexterity;
	private int concentration;
	
	
	public Abilities (int strenght, int intelligence, int dexterity, int concentration) {
		this.strenght = strenght;
		this.intelligence = intelligence;
		this.dexterity = dexterity;
		this.concentration = concentration;				
	}
	
	public Abilities(Abilities stats) {
		this.strenght = Abilities.this.getStenght();
		this.intelligence = Abilities.this.getIntelligence();
		this.dexterity = Abilities.this.getDexterity();
		this.concentration = Abilities.this.getConcetration();	
	}
	
	public int getStenght() {
		return this.strenght;
	}
	
	public int getIntelligence() {
		return this.intelligence;
	}
	
	public int getDexterity() {
		return this.dexterity;
	}
	
	public int getConcetration() {
		return this.concentration;
	}
	
	
	
}
