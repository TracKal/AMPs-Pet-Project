package Korriban;

import java.util.Scanner;

public class GameLogic {
	Scanner in = new Scanner(System.in);
	DarkJedi FallenKnight = new DarkJedi();
	Sith ManassiWarrior = new Sith();

	public void Intro() throws java.io.IOException {

		p("This game is based on the Star wars legends universe. This is an unofficial game, and is not recognized by Disney.\r\n"
				+ "\r\n"
				+ "   6,900 years Before the Battle of Yavin. The Dark Jedi have been at war with the Jedi and the Galactic republic, which\r\n"
				+ "has lasted for a 100 years. The war resulted in a huge lost at the Battle of Corbos.  Looking for a new home the Dark Jedi,\r\n"
				+ "have found a planet that they think is ripe for the picking. The dark jedi have found that the sith worshiped the Dark Jedi's \r\n"
				+ "and the Dark Jedi with their abilities as god-like beings.  ");

		System.out.println("\nChoose warrior: ");
		System.out.println("   1:  Fallen Knight");
		System.out.println("   2:  Manassi Warrior");
		System.out.print("Choose : ");

		char choice = in.next().charAt(0);
		switch (choice) {
		case '1':
			System.out.println("\nFallen Knight.");
			System.out.println(
					"Fallen Knight -  are Dark Jedi that have fallen from balance of the force and focus on the dark side of the force\r\n"
							+ "emotions to effect them. They were exiled from the galaxy by the jedi that they turned on. ");
			System.out.println("\nFallen Knight's health is set to : " + FallenKnight.health);
			
		case '2':
			System.out.println("\nManassi Warrior. ");
			System.out.println("Sith, aka Sith purebloods, humanoids who were born highly strong in the dark\r\n"
					+ "side of the force. They were eventually overtaken by The Dark Jedi exiles. ");
			break;
		}
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