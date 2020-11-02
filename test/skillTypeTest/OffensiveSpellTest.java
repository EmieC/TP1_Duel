package skillTypeTest;

import static org.junit.Assert.*;

import org.junit.Test;

import duel.Abilities;
import execption.illegalValueExecption;
import skillType.OffensiveSpell;
import skillType.Shield;

public class OffensiveSpellTest {


	private final int ILLEGAL_SPELL_EFFICACITY_MAX = 110;
	private final int ILLEGAL_SPELL_EFFICACITY_MIN = 16;
	private final int ANY_STRENGHT = 30;
	private final int ANY_INTELLIGENCE = 20;
	private final int ANY_CONCENTRATION = 40;
	private final int ANY_DEXTERITY = 50;
	private final int ANY_IMPACT = 55;
	
	@Test (expected = illegalValueExecption.class)
	public void WHEN_offisiveSpellIscreated_THEN_SpellEfficacityIsLegal () {
		//Arrange
		OffensiveSpell spell = new OffensiveSpell(ILLEGAL_SPELL_EFFICACITY_MAX);
		
		//Act	
	}
	
	@Test (expected = illegalValueExecption.class)
	public void WHEN_offisiveSpellIscreated_THEN_SpellEfficacityIsValid () {
		//Arrange
		OffensiveSpell spell = new OffensiveSpell(ILLEGAL_SPELL_EFFICACITY_MIN);
		
		//Act	
	}
	
	@Test 
	public void WHEN_offisiveSpellIscreated_THEN_powerIsValid () {
		//Arrange
		Abilities stats = new Abilities(ANY_STRENGHT, ANY_INTELLIGENCE, ANY_DEXTERITY, ANY_CONCENTRATION);
		
		//Act
		OffensiveSpell spell = new OffensiveSpell(ANY_IMPACT);
		
		//Assert
		assertTrue(spell.getPower(stats) == (ANY_INTELLIGENCE * ANY_IMPACT /100)*3);
	}

}
