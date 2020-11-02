package skillTypeTest;

import static org.junit.Assert.*;

import org.junit.Test;

import duel.Abilities;
import execption.illegalAbilitiesExecption;
import execption.illegalValueExecption;
import skillType.Sword;

public class SwordTest {

	private final int ILLEGAL_IMPACT_VALUE_MAX = 110;
	private final int ILLEGAL_IMPACT_VALUE_MIN = 16;
	private final int ANY_STRENGHT = 30;
	private final int ANY_INTELLIGENCE = 20;
	private final int ANY_CONCENTRATION = 40;
	private final int ANY_DEXTERITY = 50;
	private final int ANY_IMPACT = 85;
	
	
	@Test (expected = illegalValueExecption.class)
	public void WHEN_swordIscreated_THEN_ImpactValueIsLegal () {
		//Arrange
		Sword sword = new Sword(ILLEGAL_IMPACT_VALUE_MAX);
		
		//Act	
	}
	
	@Test (expected = illegalValueExecption.class)
	public void WHEN_swordIscreated_THEN_ImpactValueIsValid () {
		//Arrange
		Sword sword = new Sword(ILLEGAL_IMPACT_VALUE_MIN);
		
		//Act	
	}
	
	@Test 
	public void WHEN_swordIscreated_THEN_powerIsValid () {
		//Arrange
		Abilities stats = new Abilities(ANY_STRENGHT, ANY_INTELLIGENCE, ANY_DEXTERITY, ANY_CONCENTRATION);
		
		//Act
		Sword sword = new Sword(ANY_IMPACT);
		
		//Assert
		assertTrue(sword.getPower(stats) == ANY_STRENGHT * ANY_IMPACT /100);
	}
	
	

}
