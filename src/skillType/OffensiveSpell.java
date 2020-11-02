package skillType;

import SkillTag.Attack;
import duel.Abilities;
import duel.Skill;
import execption.illegalValueExecption;

public class OffensiveSpell implements Skill, Attack {

	private int spellEfficacityValue;
	
	private final int SPELL_EFFICACITY_MIN = 20;
	private final int SPELL_EFFICACITY_MAX = 100;
	
	
	public OffensiveSpell(int spellEfficacity) {
		this.verifyspellEfficacityValue(spellEfficacity);
		this.spellEfficacityValue = spellEfficacity;
	}
	
	private void verifyspellEfficacityValue(int spellEfficacity) {
		if(spellEfficacity <= SPELL_EFFICACITY_MIN-1 ) {
			throw new illegalValueExecption();
		}
		else if(spellEfficacity >= SPELL_EFFICACITY_MAX +1) {
			throw new illegalValueExecption();
		}
	}
	
	@Override
	public int getPower(Abilities stats) {
		int power = (stats.getIntelligence() * this.spellEfficacityValue /100) *3;
		return power;
	}

}
