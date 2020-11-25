package duel;

import java.util.ArrayList;
import java.util.List;

public abstract class  Fighter {
	
	private String name;
	private Abilities stats;
	private int health;
	
	private Skill skill1;//MS Inutile, puisqu'on doit stocker les Skills dans un ArrayList.
	private Skill skill2;
	
	public final int DEFAUTL_HEALTH = 100;
	private List<Skill> skillList = new ArrayList<Skill>();
	
	public Fighter(String name, Abilities stats,Skill axe, Skill potion) {
		
		this.name = name;
		this.stats = stats;//MS: Prendre une copie de l'instance d'objet Abilities (encapsulation)
		this.skill1 = axe;
		this.skill2 = potion;
		
		this.health = DEFAUTL_HEALTH;//MS Health est déterminé en fonction des valeurs des attributs.
	}//MS Il n'y a pas de validation des abilities.
	
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
		boolean fighterHasSkill = false;
		
		if(this.skillList.contains(skill)) {
			fighterHasSkill = true;
		}
		return fighterHasSkill;
	}
	
	public void addSkill(Skill skill) {
		this.skillList.add(skill);
	}
	
	public void removeSkill(Skill skill) {
		this.skillList.remove(skill);
	}
	
	public int getPower(Skill skill) {
		return skill.getPower(stats);
	}
	
}
