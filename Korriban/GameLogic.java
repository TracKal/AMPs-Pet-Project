package Korriban;

import java.util.Scanner;

public class GameLogic {
	Scanner in = new Scanner(System.in);
	DarkJedi FallenKnight = new DarkJedi();
	Sith ManassiWarrior = new Sith();
	char choice;

	public void Round1() throws java.io.IOException {

		p("This game is based on the Star wars legends universe. This is an unofficial game, and is not recognized by Disney.\r\n"
				+ "\r\n"
				+ "   6,900 years Before the Battle of Yavin. The Dark Jedi have been at war with the Jedi and the Galactic republic, which\r\n"
				+ "has lasted for a 100 years. The war resulted in a huge lost at the Battle of Corbos.  Looking for a new home the Dark Jedi,\r\n"
				+ "have found a planet that they think is ripe for the picking. The dark jedi have found that the sith worshiped the Dark Jedi's \r\n"
				+ "and the Dark Jedi with their abilities as god-like beings.  ");

		System.out.println("\nFallen Knight health set to " + FallenKnight.health + " hp.");
		System.out.println("\nManassi Warrior health set to " + ManassiWarrior.health + " hp.");

		do {
			System.out.println("\nFallen Knight is now chosen ");
			System.out.print("Skills that can be chosen. ");
			System.out.println("\n   1. Slash ");
			System.out.println("   2. Force Push");
			System.out.println("   3. Combustion");
			System.out.print("Choose attack: ");

			char choice = in.next().charAt(0);

			switch (choice) {
			case '1':
				System.out.println("\nFallen Knight uses slash dealing " + FallenKnight.attack(ManassiWarrior) + " damage.");
				System.out.println("\nManassi Warriors health is now " + ManassiWarrior.currentHealth);
				break;
			case '2':
				System.out.println("Fallen Knight uses force push " + FallenKnight.forcePush(ManassiWarrior) + " damage.");
				System.out.println("\nManassi Warriors health is now " + ManassiWarrior.currentHealth);
				break;
			case '3':
				System.out.println("Fallen Knight uses Combustion " + FallenKnight.combustion(ManassiWarrior) + " damage.");
				System.out.println("\nManassi Warriors health is now " + ManassiWarrior.currentHealth);
				break;
			}
			System.out.println("\nManassi Warrior uses stab dealing " + ManassiWarrior.attack(FallenKnight) + " damage.");
			System.out.println("\nFallen Knights health is now " + FallenKnight.currentHealth);
		} while (ManassiWarrior.isDead = true);
	}

	public void FinalResults() {

		if (FallenKnight.currentHealth <= 20) {
			p("\nFallen Knight's health is now " + FallenKnight.currentHealth + "\nFallen Knight is near death");
		} else if (FallenKnight.currentHealth >= 20) {
			p("\nFallen Knight's health is now " + FallenKnight.currentHealth
					+ "\nFallen Knight survived to fight another day.");
		}

		if (ManassiWarrior.currentHealth <= 20) {
			p("\nManassi Warrior's current Health is " + ManassiWarrior.currentHealth + "\nManassi Warrior is near death");
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