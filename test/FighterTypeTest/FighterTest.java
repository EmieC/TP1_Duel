package FighterTypeTest;

import static org.junit.Assert.*;

import org.junit.Test;

import duel.Abilities;
import duel.Fighter;

public class FighterTest {

	private static final String ANY_NAME = "Arthur";
	private static final int ANY_STRENGHT = 20;
	private static final int ANY_INTELLIGENCE = 30;
	private static final int ANY_DEXTERITY = 16;
	private static final int ANY_CONCENTRATION = 25;
	private Abilities stats = new Abilities(ANY_STRENGHT, ANY_INTELLIGENCE,ANY_DEXTERITY, ANY_CONCENTRATION);
	
	
	@Test
	public void WHEN_fighterIsCreated_THEN_ANameIsGiving() {
		//Arrange
		
		//Act
		Fighter fighter = new FighterMock(ANY_NAME, null, null, null);
		
		//Assert
		assertEquals(ANY_NAME, fighter.getName());
	}
	
	@Test
	public void WHEN_fighterIsCreated_THEN_StrenghtIsGiving() {
		//Arrange
		
		
		//Act
		Fighter fighter = new FighterMock(null, stats, null, null);
		
		//Assert
		assertEquals(stats.getStenght(), fighter.getStrength());
	}

	@Test
	public void WHEN_fighterIsCreated_THEN_dexterityIsGiving() {
		//Arrange
		
		//Act
		Fighter fighter =  new FighterMock(null, stats, null, null);
		
		//Assert
		assertEquals(stats.getDexterity(), fighter.getDexterity());
		
	}
	
	@Test
	public void WHEN_fighterIsCreated_THEN_intelligenceIsGiving() {
		//Arrange
		
		//Act
		Fighter fighter =  new FighterMock(null, stats, null, null);
		
		//Assert
		assertEquals(stats.getIntelligence(), fighter.getIntelligence());
		
	}
	
	@Test
	public void WHEN_fighterIsCreated_THEN_concentrationIsGiving() {
		//Arrange
		
		//Act
		Fighter fighter =  new FighterMock(null, stats, null, null);
		
		//Assert
		assertEquals(stats.getConcetration(), fighter.getFocus());
		
	}
	
}
