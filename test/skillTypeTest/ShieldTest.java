package skillTypeTest;

import static org.junit.Assert.*;

import org.junit.Test;

import duel.Abilities;
import execption.illegalValueExecption;
import skillType.Shield;
import skillType.Sword;

public class ShieldTest {

	private final int ILLEGAL_PROTECTION_VALUE_MAX = 110;
	private final int ILLEGAL_PROTECTION_VALUE_MIN = 16;
	private final int ANY_STRENGHT = 30;
	private final int ANY_INTELLIGENCE = 20;
	private final int ANY_CONCENTRATION = 40;
	private final int ANY_DEXTERITY = 50;
	private final int ANY_IMPACT = 55;
	
	@Test (expected = illegalValueExecption.class)
	public void WHEN_shielIscreated_THEN_ProtectionValueIsLegal () {
		//Arrange
		Shield shield = new Shield(ILLEGAL_PROTECTION_VALUE_MAX);
		
		//Act	
	}
	
	@Test (expected = illegalValueExecption.class)
	public void WHEN_shieldIscreated_THEN_ProtectionValueIsValid () {
		//Arrange
		Shield shield = new Shield(ILLEGAL_PROTECTION_VALUE_MIN);
		
		//Act	
	}
	
	@Test 
	public void WHEN_shieldIscreated_THEN_powerIsValid () {
		//Arrange
		Abilities stats = new Abilities(ANY_STRENGHT, ANY_INTELLIGENCE, ANY_DEXTERITY, ANY_CONCENTRATION);
		
		//Act
		Shield shield = new Shield(ANY_IMPACT);
		
		//Assert
		assertTrue(shield.getPower(stats) == ANY_STRENGHT * ANY_IMPACT /100);
	}
}
