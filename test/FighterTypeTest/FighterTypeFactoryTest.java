package FighterTypeTest;

import static org.junit.Assert.*;

import org.junit.Test;

import duel.Abilities;
import execption.illegalAbilitiesExecption;
import execption.illegalValueExecption;
import fighterType.Athlete;
import fighterType.Warrior;
import fighterType.Wizard;

public class FighterTypeFactoryTest {

	private final String ANY_NAME = "Malfoy";
	
	
	@Test
	public void anAthleteCanBeCreated() {
		//Arrange
		Abilities stats = new Abilities(30, 20, 50, 40);
		
		//Act
		Athlete athlete = new Athlete(ANY_NAME, stats, null, null);
		
		//Assert
		assertTrue(athlete instanceof Athlete);
	}
	

	@Test
	public void aWizardCanBeCreated() {
		//Arrange
		Abilities stats = new Abilities(30, 60, 30, 60);
		
		//Act
		Wizard wizard = new Wizard(ANY_NAME, stats, null, null);
		
		//Assert
		assertTrue(wizard instanceof Wizard);
	}
	
	@Test
	public void aWarriorCanBeCreated() {
		//Arrange
		Abilities stats = new Abilities(70, 30, 30, 40);
		
		//Act
		Warrior warrior = new Warrior(ANY_NAME, stats, null, null);
		
		//Assert
		assertTrue(warrior instanceof Warrior);
	}
	
	@Test (expected = illegalAbilitiesExecption.class)
	public void anAthleteCannotBeCreatedIfTheStatsAreIllegal() {
		//Arrange
		Abilities stats = new Abilities(30, 10, 50, 40);
		
		//Act
		Athlete athlete = new Athlete(ANY_NAME, stats, null, null);
		
	}
	@Test (expected = illegalAbilitiesExecption.class)
	public void aWizardCannotBeCreatedIfTheStatsAreIllegal() {
		//Arrange
		Abilities stats = new Abilities(30, 10, 30, 40);
		
		//Act
		Wizard wizard = new Wizard(ANY_NAME, stats, null, null);
		
	}
	@Test (expected = illegalAbilitiesExecption.class)
	public void aWarriorCannotBeCreatedIfTheStatsAreIllegal() {
		//Arrange
		Abilities stats = new Abilities(30, 10, 50, 20);
		
		//Act
		Warrior warrior = new Warrior(ANY_NAME, stats, null, null);
		
	}
	
}

//instanceof