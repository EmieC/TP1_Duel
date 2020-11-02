package skillTypeTest;

import static org.junit.Assert.*;

import org.junit.Test;

import duel.Abilities;
import execption.illegalValueExecption;
import skillType.HealingSpell;
import skillType.Remedy;
import skillType.Shield;

public class HealingSpellTest {

	private final int ILLEGAL_SPELL_ENERGY_VALUE_MAX = 110;
	private final int ILLEGAL_SPELL_ENERGY_VALUE_MIN = 16;
	private final int ANY_STRENGHT = 30;
	private final int ANY_INTELLIGENCE = 20;
	private final int ANY_CONCENTRATION = 40;
	private final int ANY_DEXTERITY = 50;
	private final int ANY_IMPACT = 55;

	@Test (expected = illegalValueExecption.class)
	public void WHEN_healingSpellIscreated_THEN_SpellEnergyIsLegal () {
		//Arrange
		HealingSpell spell = new HealingSpell(ILLEGAL_SPELL_ENERGY_VALUE_MAX);
		
		//Act	
	}
	
	@Test (expected = illegalValueExecption.class)
	public void WHEN_healingSpellIscreated_THEN_SpellEnergyIsValid () {
		//Arrange
		HealingSpell spell = new HealingSpell(ILLEGAL_SPELL_ENERGY_VALUE_MIN);
		
		//Act
	}
	
	@Test 
	public void WHEN_healingSpellIscreated_THEN_powerIsValid () {
		//Arrange
		Abilities stats = new Abilities(ANY_STRENGHT, ANY_INTELLIGENCE, ANY_DEXTERITY, ANY_CONCENTRATION);
		
		//Act
		HealingSpell spell = new HealingSpell(ANY_IMPACT);
		
		//Assert
		assertTrue(spell.getPower(stats) == ANY_INTELLIGENCE * ANY_IMPACT /100);
	}

}
