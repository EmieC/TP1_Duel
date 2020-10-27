package duel;

public abstract class  Fighter {
	
	private String name;
	private Abilities stats;
	
	private Skill skill1;
	private Skill skill2;
	
	public Fighter(String name, Abilities stats,Skill axe, Skill potion) {
		
		this.name = name;
		this.stats = stats;
		this.skill1 = axe;
		this.skill2 = potion;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getStrength() {
		return this.stats.getStenght();
	}
	
	public int getDextity() {
		return this.stats.getDexterity();
	}
	
	public int getIntelligence() {
		return this.stats.getIntelligence();
	}
	
	public int getFocus() {
		return 0;
	}
	
	public int getHealthPoints() {
		return 1;
	}
	
	public void decreaseHealthPoint(int health) {
		
	}
	
	public boolean isAlive() {
		return true;
	}
	
	public boolean hasTheSkill(Skill skill) {
		return true;
	}
	
}
