import java.util.ArrayList;
import java.util.List;

import duel.Abilities;
import duel.Fighter;
import duel.Skill;
import fighterType.FighterTypeFactory;
import fighterType.FighterTypeFactory.FighterTypeFactoryType;
import skillType.SkillTypeFactory;
import skillType.SkillTypeFactory.SkillTypeFactoryType;

public class Simulator {
 private List<Fighter> fighterList = new ArrayList<Fighter>();
 
	public static void main() {
		new Simulator();
	}
	
	public Simulator() {
		this.seedData();
	}
	
	private void seedData() {
		
		
		SkillTypeFactory skillFactory = new SkillTypeFactory();
		FighterTypeFactory fighterTypeFactory = new FighterTypeFactory();
		
		Skill skill1 = skillFactory.chooseSkillType(SkillTypeFactoryType.SWORD, 40);
		Skill skill2 = skillFactory.chooseSkillType(SkillTypeFactoryType.HEALING_SPELL, 80);
		Abilities stats = new Abilities(25,25,25,25);
		Fighter athlete = fighterTypeFactory.createFighter(FighterTypeFactoryType.ATHLETE, stats ,"Lancelot",skill1,skill2);
		fighterList.add(athlete);
		
		Skill skill3 = skillFactory.chooseSkillType(SkillTypeFactoryType.OFFENSIVE_SPELL, 70);
		Skill skill4 = skillFactory.chooseSkillType(SkillTypeFactoryType.DEFENSIVE_SPELL, 50);
		Abilities abilities = new Abilities(15,10,30,30);
		Fighter wizard = fighterTypeFactory.createFighter(FighterTypeFactoryType.WIZARD, abilities ,"Merlin",skill3,skill4);
		fighterList.add(wizard);
		
		Skill skill5 = skillFactory.chooseSkillType(SkillTypeFactoryType.SWORD, 75);
		Skill skill6 = skillFactory.chooseSkillType(SkillTypeFactoryType.SHIELD, 30);
		Abilities abilitiesStats = new Abilities(15,10,30,40);
		Fighter warrior = fighterTypeFactory.createFighter(FighterTypeFactoryType.WARRIOR, abilitiesStats ,"Arthur",skill5,skill6);
		fighterList.add(warrior);
		
	}
	
	private void printData() {
		System.out.println();
		System.out.println("hey");
		for(Fighter aFighter : this.fighterList) {
			System.out.println(aFighter.getName() + ", " + aFighter.getDexterity() + ", " +aFighter.getFocus()  + ", " +aFighter.getIntelligence()  + ", " + aFighter.getStrength());
		}
	}
}
