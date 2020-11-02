package skillType;

import SkillTag.Defence;
import duel.Abilities;
import duel.Skill;
import execption.illegalValueExecption;

public class Shield implements Skill, Defence{

	private int protecionValue;
	
	private final int PROTECTION_VALUE_MIN = 20;
	private final int PROTECTION_VALUE_MAX = 100;
	
	
	public Shield(int protection) {
		this.verifyProtectionValue(protection);
		this.protecionValue = protection;
	}
	
	private void verifyProtectionValue(int protection) {
		if(protection <= PROTECTION_VALUE_MIN-1 ) {
			throw new illegalValueExecption();
		}
		else if(protection >= PROTECTION_VALUE_MAX +1) {
			throw new illegalValueExecption();
		}
	}
	
	@Override
	public int getPower(Abilities stats) {
		int power = stats.getStenght() * this.protecionValue/100;
		return power;
	}

}
