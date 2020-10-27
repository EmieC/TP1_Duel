package FighterTypeTest;

import static org.junit.Assert.*;

import org.junit.Test;

import duel.Abilities;
import execption.illegalAbilitiesExecption;
import fighterType.Athlete;
import fighterType.Warrior;

public class WarriorTest {
	
	private static final String ANY_NAME = "Lancelot";

	@Test (expected = illegalAbilitiesExecption.class)
	public void WHEN_warriorIsCreated_THEN_abilitiesAreRespected() {
		//Arrange
		Abilities stats = new Abilities(2, 5, 3, 9);

		//Act
		Warrior warrior = new Warrior(ANY_NAME, stats, null, null);
	}
	
	@Test (expected = illegalAbilitiesExecption.class)
	public void WHEN_warriorIsCreated_THEN_StrenghtIsHigherThanDexterityPLusTen() {
		//Arrange
		Abilities stats = new Abilities(2, 4, 29, 28);
		
		//Act
		Warrior warrior = new Warrior(ANY_NAME, stats, null, null);		
	}
	
	@Test (expected = illegalAbilitiesExecption.class)
	public void WHEN_warriorIsCreated_THEN_StrenghtIsHigherThanIntelligencePLusTen() {
		//Arrange
		Abilities stats = new Abilities(10, 30, 29, 28);
		
		//Act
		Warrior warrior = new Warrior(ANY_NAME, stats, null, null);
	}

	@Test (expected = illegalAbilitiesExecption.class)
	public void WHEN_warriorIsCreated_THEN_StrenghtIsHigherThanConcentrationPLusTen() {
		//Arrange
		Abilities stats = new Abilities(2, 4, 29, 3);
		
		//Act
		Warrior warrior = new Warrior(ANY_NAME, stats, null, null);
		
	}
}
