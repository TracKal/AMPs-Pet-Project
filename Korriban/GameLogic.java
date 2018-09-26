package Korriban;

public class GameLogic {

	DarkJedi FallenKnight = new DarkJedi();
	Sith ManassiWarrior = new Sith();

	public void Intro() {
		p("This game is based on the Star wars legends universe. This is an unofficial game, and is not recognized by Disney.\r\n"
				+ "\r\n"
				+ "   6,900 years Before the Battle of Yavin. The Dark Jedi have been at war with the Jedi and the Galactic republic, which\r\n"
				+ "has lasted for a 100 years. The war resulted in a huge lost at the Battle of Corbos.  Looking for a new home the Dark Jedi,\r\n"
				+ "have found a planet that they think is ripe for the picking. The dark jedi have found that the sith worshiped the Dark Jedi's \r\n"
				+ "and the Dark Jedi with their abilities as god-like beings.  ");

		p("\n\nFallen Knight Health : " + FallenKnight.setHealth() + "\nFallen Knight attacks dealing : ");

		p("\nManassi Warrior Health is : " + ManassiWarrior.setHealth() + "\nManassi Warrior attacks dealing : ");

		p("------------------------------------------------------------");
		return;
	}

	public void Round1() {

		p("-----------------------------------------------------------");

		p("\nFallen Knight's  health : " + FallenKnight.health + "\n" + "\nFallen Knight attacks dealing : " + 
		         FallenKnight.attack(ManassiWarrior));

		p("\nManassi Warrior's health : " + ManassiWarrior.health + "\n" + "\nManassi Warrior attacks : " +
		        ManassiWarrior.attack(FallenKnight));
		
		p("----------------------------------------------------------");
		p("\nFallen Knight current health : " + FallenKnight.currentHealth);
		
		p("\nManassi Warrior current health : " + ManassiWarrior.currentHealth);
		
		p("\nFallen Knight uses  Force Push : " + FallenKnight.forcePush(ManassiWarrior));
		
		p("\nManassi Warrior uses Savage Strike : " + ManassiWarrior.savageStrike(FallenKnight));
		
		p("-----------------------------------------------------------");
		
		p("\nFallen Knight current health : " + FallenKnight.currentHealth);
		
		p("\nManassi Warrior current health : " + ManassiWarrior.currentHealth);
		
		p("\nFallen Knight uses Combusiton : " + FallenKnight.combustion(ManassiWarrior));
		
		p("\nManassi Warrior uses Force Scream : " + ManassiWarrior.forceScream(FallenKnight));
		
		p("------------------------------------------------------------");
		
		p("\nFallen Knight current health : " + FallenKnight.currentHealth);
		
		p("\nManassi Warrior current health : " + ManassiWarrior.currentHealth);
		
		
		return;
	}

	static void p(String l) {
		System.out.println(l);
	}
}