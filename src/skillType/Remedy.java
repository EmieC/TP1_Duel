package skillType;

import SkillTag.Healing;
import duel.Abilities;
import duel.Skill;
import execption.illegalValueExecption;

public class Remedy implements Skill, Healing {

	private int remedyValue;
	
	private final int REMEDY_STRENGHT_MIN = 20;
	private final int REMEDY_STRENGHT_MAX = 100;
	
	public Remedy(int remedyStrenght) {
		this.verifyRemedyStrenghtValue(remedyStrenght);
		this.remedyValue = remedyStrenght;
	}
	
	private void verifyRemedyStrenghtValue(int remedyStrenght) {
		if(remedyStrenght <= REMEDY_STRENGHT_MIN-1) {
			throw new illegalValueExecption();
		}
		else if(remedyStrenght >= REMEDY_STRENGHT_MAX+1) {
			throw new illegalValueExecption();
		}
	}
	
	@Override
	public int getPower(Abilities stats) {
		int power = stats.getDexterity() * this.remedyValue/100;
		return power;
	}

}
