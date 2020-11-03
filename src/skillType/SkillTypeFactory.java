package skillType;

import duel.Skill;
import execption.illegalSkillTypeExecption;

public class SkillTypeFactory {

	public static enum SkillTypeFactoryType{
		SWORD, SHIELD, REMEDY, OFFENSIVE_SPELL, DEFENSIVE_SPELL, HEALING_SPELL
	}
	
	public Skill chooseSkillType(SkillTypeFactoryType type, int value) {
		
		Skill skill = null;
		switch(type) {
		case SWORD : skill = new Sword(value);
		break;
		case SHIELD : skill = new Shield(value);
		break;
		case REMEDY : skill = new Remedy(value);
		break;
		case OFFENSIVE_SPELL : skill = new OffensiveSpell(value);
		break;
		case DEFENSIVE_SPELL : skill = new DefensiveSpell(value);
		break;
		case HEALING_SPELL : skill = new HealingSpell(value);
		break;
		default:
			throw new illegalSkillTypeExecption();
		}
		return skill;
		
	}
}
