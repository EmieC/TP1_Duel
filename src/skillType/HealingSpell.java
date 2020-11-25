package skillType;

import SkillTag.Healing;
import duel.Abilities;
import duel.Skill;
import execption.illegalValueExecption;

public class HealingSpell implements Skill, Healing {

	private int Spellvalue;
	
	private final int MIN_SPELL_ENERGY = 20;
	private final int MAX_SPELL_ENERGY = 100;
	
	
	public HealingSpell(int spellEnergie) {
		this.verifySpellValue(spellEnergie);
		this.Spellvalue = spellEnergie;
	}
	
	private void verifySpellValue(int spellEnergie) {
		if(spellEnergie <= MIN_SPELL_ENERGY-1) {
			throw new illegalValueExecption();
		}
		else if(spellEnergie >= MAX_SPELL_ENERGY+1) {
			throw new illegalValueExecption();
		}
	}
	
	@Override
	public int getPower(Abilities stats) {
		int power = stats.getIntelligence() * this.Spellvalue/100;//MS: chiffre ou string magique -> constante à définir
		return power;
	}

}
