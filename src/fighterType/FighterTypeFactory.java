package fighterType;

import duel.Abilities;
import duel.Fighter;
import duel.Skill;
import execption.illegalFighterTypeExecption;

public class FighterTypeFactory {
	
	public static enum FighterTypeFactoryType{
		WARRIOR, ATHLETE, WIZARD
	}
	
	public Fighter createFighter(FighterTypeFactoryType type, Abilities stats, String name, Skill skill1, Skill skill2){
		
		Fighter fighter = null;
		switch(type) {
		case WARRIOR : fighter = new Warrior(name, stats, skill1, skill2);
		break;
		case ATHLETE : fighter = new Athlete(name, stats, skill1, skill2);
		break;
		case WIZARD: fighter = new Wizard(name, stats, skill1, skill2);
		break;
		default:
			throw new illegalFighterTypeExecption();
		}
		return fighter;
		
	} 
	
}
