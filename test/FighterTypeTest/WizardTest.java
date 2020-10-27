package FighterTypeTest;

import static org.junit.Assert.*;

import org.junit.Test;

import duel.Abilities;
import execption.illegalAbilitiesExecption;
import fighterType.Athlete;
import fighterType.Wizard;

public class WizardTest {
	
	private static final String ANY_NAME = "Merlin";
	
	
	@Test (expected = illegalAbilitiesExecption.class)
	public void WHEN_wizardIsCreated_THEN_intelligenceIsMoreThanMaxStrenghETDexterityPlusQuinze() {
		//Arrange
		Abilities stats = new Abilities(3, 13, 2, 15);

		//Act
		Wizard wizard = new Wizard(ANY_NAME, stats, null, null);
	}
	
	@Test (expected = illegalAbilitiesExecption.class)
	public void WHEN_wizardIsCreated_THEN_ConcentrationIsMoreThanMaxStrenghETDexterityPlusQuinze() {
		//Arrange
		Abilities stats = new Abilities(20, 2, 7, 6);

		//Act
		Wizard wizard = new Wizard(ANY_NAME, stats, null, null);
	}
	
}