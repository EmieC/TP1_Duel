package fighterType;

import duel.Abilities;
import duel.Fighter;
import duel.Skill;
import execption.illegalAbilitiesExecption;

public class Wizard extends Fighter {
	
	private final int ABILITIES_ADDITION = 15;

	public Wizard(String name, Abilities stats, Skill skill1, Skill skill2) {
		super(name, stats, skill1, skill2);
		if(stats.getIntelligence()< Math.max(stats.getStenght(), stats.getDexterity())+ABILITIES_ADDITION
			||stats.getConcetration() < Math.max(stats.getStenght(), stats.getDexterity() + ABILITIES_ADDITION)){
			throw new illegalAbilitiesExecption();
		}
	}

}
