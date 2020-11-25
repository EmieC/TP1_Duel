package fighterType;

import duel.Abilities;
import duel.Fighter;
import duel.Skill;
import execption.illegalAbilitiesExecption;


public class Athlete extends Fighter{
	
	public final int MIN_ABILITIES = 20;//MS On devrait avoir une constante par habiletés.

	public Athlete(String name, Abilities stats, Skill skill1, Skill skill2) {
		super(name, stats, skill1, skill2);
		this.verifyStats(stats);
	}
	
	
	private void verifyStats(Abilities stats) {
		if(stats.getStenght() < MIN_ABILITIES
			||stats.getIntelligence() < MIN_ABILITIES
			||stats.getDexterity() < MIN_ABILITIES
			||stats.getConcetration() < MIN_ABILITIES) {
			throw new illegalAbilitiesExecption();
		}
	}
}
