package fighterType;

import duel.Abilities;
import duel.Fighter;
import execption.illegalFighterTypeExecption;

public class FighterTypeFactory {
	
	public static enum FighterTypeFactoryType{
		WARRIOR, ATHLETE, WIZARD
	}
	
	public Fighter createFighter(FighterTypeFactoryType type, Abilities stats){
		
		String name = null;
		Fighter fighter = null;
		switch(type) {
		case WARRIOR : fighter = new Warrior(name, stats, null, null);
		break;
		case ATHLETE : fighter = new Athlete(name, stats, null, null);
		break;
		case WIZARD: fighter = new Wizard(name, stats, null, null);
		break;
		default:
			throw new illegalFighterTypeExecption();
		}
		return fighter;
		
	} 
	
}
