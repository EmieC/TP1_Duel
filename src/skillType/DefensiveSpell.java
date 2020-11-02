package skillType;

import SkillTag.Defence;
import duel.Abilities;
import duel.Skill;
import execption.illegalValueExecption;

public class DefensiveSpell implements Skill, Defence {
	
	private int spellItensityValue;

	private final int SPELL_INTENSITY_MIN = 20;
	private final int SPELL_INTENSITY_MAX = 100;
	
	
	public DefensiveSpell(int spellIntensity) {
		this.verifySpellItensityValue(spellIntensity);
		this.spellItensityValue = spellIntensity;
	}
	
	private void verifySpellItensityValue(int spellIntensity) {
		if(spellIntensity <= SPELL_INTENSITY_MIN-1 ) {
			throw new illegalValueExecption();
		}
		else if(spellIntensity >= SPELL_INTENSITY_MAX +1) {
			throw new illegalValueExecption();
		}
	}
	
	@Override
	public int getPower(Abilities stats) {
		int power = (stats.getIntelligence() * this.spellItensityValue /100) *3;
		return power;
	}

}
