package skillTypeTest;

import static org.junit.Assert.*;

import org.junit.Test;

import duel.Abilities;
import execption.illegalValueExecption;
import skillType.Remedy;
import skillType.Shield;

public class RemedyTest {
	
	private final int ILLEGAL_REMEDY_STRENGHT_VALUE_MAX = 110;
	private final int ILLEGAL_REMEDY_STRENGHT_VALUE_MIN = 16;
	private final int ANY_STRENGHT = 30;
	private final int ANY_INTELLIGENCE = 20;
	private final int ANY_CONCENTRATION = 40;
	private final int ANY_DEXTERITY = 50;
	private final int ANY_IMPACT = 76;

	@Test (expected = illegalValueExecption.class)
	public void WHEN_remedyIscreated_THEN_RemedyStrenghIsLegal () {
		//Arrange
		Remedy remedy = new Remedy(ILLEGAL_REMEDY_STRENGHT_VALUE_MAX);
		
		//Act	
	}
	
	@Test (expected = illegalValueExecption.class)
	public void WHEN_remedyIscreated_THEN_RemedyStrenghtIsValid () {
		//Arrange
		Remedy remedy = new Remedy(ILLEGAL_REMEDY_STRENGHT_VALUE_MIN);
		
		//Act	
	}
	
	@Test 
	public void WHEN_remedyIscreated_THEN_powerIsValid () {
		//Arrange
		Abilities stats = new Abilities(ANY_STRENGHT, ANY_INTELLIGENCE, ANY_DEXTERITY, ANY_CONCENTRATION);
		
		//Act
		Remedy remedy = new Remedy(ANY_IMPACT);
		
		//Assert
		assertTrue(remedy.getPower(stats) == ANY_DEXTERITY * ANY_IMPACT /100);
	}

}
