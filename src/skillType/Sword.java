package skillType;

import SkillTag.Attack;
import duel.Abilities;
import duel.Skill;
import execption.illegalValueExecption;

public class Sword implements Skill, Attack{
	
	private int impactValue;
	
	private final int IMPACT_MIN = 20;
	private final int IMPACT_MAX = 100;
	
	
	public Sword(int impact) {
		this.verifyImpactValue(impact);
		this.impactValue = impact;
	}
	
	private void verifyImpactValue(int impact) {
		if(impact <= IMPACT_MIN -1 ) {
			throw new illegalValueExecption();
		}
		else if(impact >= IMPACT_MAX +1) {
			throw new illegalValueExecption();
		}
	}
	
	@Override
	public int getPower(Abilities stats) {
		int power = stats.getStenght()* this.impactValue/100;
		return power;
	}

}
