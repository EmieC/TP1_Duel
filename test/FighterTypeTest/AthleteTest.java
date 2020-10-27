package FighterTypeTest;
import static org.junit.Assert.*;

import org.junit.Test;

import duel.Abilities;
import execption.illegalAbilitiesExecption;
import execption.illegalInitialSalaryExecption;
import fighterType.Athlete;
import implementation.Employee;

public class AthleteTest {
	
	private static final String ANY_NAME = "Percival";
	

	@Test (expected = illegalAbilitiesExecption.class)
	public void WHEN_athleteIsCreated_THEN_abilitiesCannotBeUnderMin() {
		//Arrange
		Abilities stats = new Abilities(3, 5, 18, 9);

		//Act
		Athlete athlete = new Athlete(ANY_NAME, stats, null, null);
	}
	
	@Test (expected = illegalAbilitiesExecption.class)
	public void WHEN_athleteIsCreated_THEN_StrenghtIsHigherThanMin() {
		//Arrange
		Abilities stats = new Abilities(2, 45, 29, 28);
		
		//Act
		Athlete athlete = new Athlete(ANY_NAME, stats, null, null);
		
	}
	
	@Test (expected = illegalAbilitiesExecption.class)
	public void WHEN_athleteIsCreated_THEN_intelligenceIsHigherThanMin() {
		//Arrange
		Abilities stats = new Abilities(22, 4, 29, 28);
		
		//Act
		Athlete athlete = new Athlete(ANY_NAME, stats, null, null);
		
	}
	
	@Test (expected = illegalAbilitiesExecption.class)
	public void WHEN_athleteIsCreated_THEN_dexterityIsHigherThanMin() {
		//Arrange
		Abilities stats = new Abilities(22, 34, 2, 28);
		
		//Act
		Athlete athlete = new Athlete(ANY_NAME, stats, null, null);
		
	}
	
	@Test (expected = illegalAbilitiesExecption.class)
	public void WHEN_athleteIsCreated_THEN_concentrationIsHigherThanMin() {
		//Arrange
		Abilities stats = new Abilities(22, 34, 42, 5);
		//Act
		Athlete athlete = new Athlete(ANY_NAME, stats, null, null);
		
	}
	
}