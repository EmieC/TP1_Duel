package duel;

public abstract class  Fighter {
	
	private String name;
	private Abilities stats;
	private int health;
	
	private Skill skill1;
	private Skill skill2;
	
	public final int DEFAUTL_HEALTH = 100;
	
	public Fighter(String name, Abilities stats,Skill axe, Skill potion) {
		
		this.name = name;
		this.stats = stats;
		this.skill1 = axe;
		this.skill2 = potion;
		
		this.health = DEFAUTL_HEALTH;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getStrength() {
		return this.stats.getStenght();
	}
	
	public int getDexterity() {
		return this.stats.getDexterity();
	}
	
	public int getIntelligence() {
		return this.stats.getIntelligence();
	}
	
	public int getFocus() {
		return this.stats.getConcetration();
	}
	
	public int getHealthPoints() {
		return this.health;
	}
	
	public void decreaseHealthPoint(int health) {
		this.health -= health;
	}
	
	public boolean isAlive() {
		boolean aliveFighter = true;
		if(this.health <= 0){
			aliveFighter = false;
		}
		
		return aliveFighter;	
	}
	
	public boolean hasTheSkill(Skill skill) {
		boolean fighterHasSkill = true;
		if(skill != this.skill1) {
			fighterHasSkill = false;
		}
		else if(skill != this.skill2) {
			fighterHasSkill = false;
		}
		
		return fighterHasSkill;
	}
	
	public void addSkill(Skill skill) {
		
	}
	
	public void removeSkill(Skill skill) {
		
	}
	
	public int getPower(Skill skill) {
		return 0;
	}
	
}
