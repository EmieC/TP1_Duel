package skillTypeTest;

import static org.junit.Assert.*;

import org.junit.Test;

import duel.Abilities;
import execption.illegalValueExecption;
import skillType.DefensiveSpell;
import skillType.Shield;

public class DefensiveSpellTest {


	private final int ILLEGAL_SPELL_INTENSITY_MAX = 110;
	private final int ILLEGAL_SPELL_INTENSITY_MIN = 16;
	private final int ANY_STRENGHT = 30;
	private final int ANY_INTELLIGENCE = 20;
	private final int ANY_CONCENTRATION = 40;
	private final int ANY_DEXTERITY = 50;
	private final int ANY_IMPACT = 55;
	
	@Test (expected = illegalValueExecption.class)
	public void WHEN_defensiveSpellIscreated_THEN_SpellIntensityIsLegal () {
		//Arrange
		DefensiveSpell spell = new DefensiveSpell(ILLEGAL_SPELL_INTENSITY_MAX);
		
		//Act	
	}
	
	@Test (expected = illegalValueExecption.class)
	public void WHEN_defensiveSpellIscreated_THEN_SpellIntensityIsValid () {
		//Arrange
		DefensiveSpell spell = new DefensiveSpell(ILLEGAL_SPELL_INTENSITY_MIN);
		
		//AcT
	}
	
	@Test 
	public void WHEN_defensiveSpellIscreated_THEN_powerIsValid () {
		//Arrange
		Abilities stats = new Abilities(ANY_STRENGHT, ANY_INTELLIGENCE, ANY_DEXTERITY, ANY_CONCENTRATION);
		
		//Act
		DefensiveSpell spell = new DefensiveSpell(ANY_IMPACT);
		
		//Assert
		assertTrue(spell.getPower(stats) == (ANY_INTELLIGENCE * ANY_IMPACT /100)*3);
	}
}
