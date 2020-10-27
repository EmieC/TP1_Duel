package fighterType;

import duel.Abilities;
import duel.Fighter;
import duel.Skill;
import execption.illegalAbilitiesExecption;


public class Athlete extends Fighter{
	
	private final int MIN_ABILITIES = 20;

	public Athlete(String name, Abilities stats, Skill skill1, Skill skill2) {
		super(name, stats, skill1, skill2);
		if(stats.getStenght() < MIN_ABILITIES
			||stats.getIntelligence() < MIN_ABILITIES
			||stats.getDexterity() < MIN_ABILITIES
			||stats.getConcetration() < MIN_ABILITIES) {
			throw new illegalAbilitiesExecption();
		}
	}
}
