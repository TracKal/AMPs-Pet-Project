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

		for (int i = 0; i < 2; i++) {

			p("\nFallen Knight attacks Manassi Warrior for " + FallenKnight.attack(ManassiWarrior) + " damage.");

			p("\nManassi Warrior current health is now : " + ManassiWarrior.currentHealth);

			p("------------------------------------------------------------");

			p("\nThe Manassi Warrior shrugs off the attack. He run's toward the Dark Jedi and deals a Savage Strike that does "
					+ ManassiWarrior.savageStrike(FallenKnight) + " damage.");

			p("\nThe Fallen Knight's vision starts to turn red. As the blood flows from a wound on the head. Fallen Knight's health is now  "
					+ FallenKnight.currentHealth);

			p("------------------------------------------------------------");

			p("\nAs the Fallen Knight tries to regain his focus. \nThe Manassi Warrior attacks dealing "
					+ ManassiWarrior.attack(FallenKnight) + " damage.");

			p("\nThe Fallen Knight's current health is now " + FallenKnight.currentHealth
					+ "\nThe Fallen Knight gathers his rage and uses his rage to boost his force push ability dealing "
					+ FallenKnight.forcePush(ManassiWarrior) + " damage.");

			p("-----------------------------------------------------------");

			p("\nThe Manassi Warrior howl's in pain as a tree branch impaling his shoulder blade. \nThe Manassi Warrior's current health is now "
					+ ManassiWarrior.currentHealth + ".");

			p("\nThe Manassi Warrior gathers the dark energy that flows through him and lets out a ferocius Scream using the force dealing "
					+ ManassiWarrior.forceScream(FallenKnight) + " damage.");

			p("------------------------------------------------------------");

			p("\nThe Dark Jedi embraces the shear might of the Force Scream leaving his health at "
					+ FallenKnight.currentHealth
					+ "\nIn a last chance effort the Fallen Knight sets the Manassi's arm on fire using Combustion which deales "
					+ FallenKnight.combustion(ManassiWarrior) + " damage");

			p("\nThe Manassi Warrior's health is now " + ManassiWarrior.currentHealth);

			p("------------------------------------------------------------");

		}
		return;
	}

	public void FinalResults() {

		if (FallenKnight.currentHealth <= 20) {
			p("Fallen Knight's health is now " + FallenKnight.currentHealth + "\nFallen Knight is near death");
		} else if (FallenKnight.currentHealth >= 20) {
			p("Fallen Knight's health is now " + FallenKnight.currentHealth
					+ "\nFallen Knight survived to fight another day.");
		}

		if (ManassiWarrior.currentHealth <= 20) {
			p("\nManassi Warrior's current Health is " + ManassiWarrior.currentHealth
					+ "\nManassi Warrior is near death");
		} else if (ManassiWarrior.currentHealth >= 20) {
			p("\nManassi Warrior's current Health is " + ManassiWarrior.currentHealth
					+ "\nManassi Warrior survived to fight another day.");
		}
		return;
	}

	static void p(String l) {
		System.out.println(l);
	}
}