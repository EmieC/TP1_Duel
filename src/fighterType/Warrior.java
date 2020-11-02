package fighterType;

import duel.Abilities;
import duel.Fighter;
import duel.Skill;
import execption.illegalAbilitiesExecption;

public class Warrior extends Fighter {
	
	private final int ABILITIES_ADDITION = 10;

	public Warrior(String name, Abilities stats, Skill skill1, Skill skill2) {
		super(name, stats, skill1, skill2);
		this.verifyStats(stats);
	}
	
	private void verifyStats(Abilities stats) {
		if(stats.getStenght()<= stats.getDexterity()+ABILITIES_ADDITION
			||stats.getStenght() <=stats.getIntelligence()+ABILITIES_ADDITION
			|| stats.getStenght() <= stats.getConcetration() +ABILITIES_ADDITION) {
			throw new illegalAbilitiesExecption();
		}
	}
}