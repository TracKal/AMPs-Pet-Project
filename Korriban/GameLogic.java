package Korriban;

import java.util.Scanner;

public class GameLogic {
  Scanner in = new Scanner(System.in);
  DarkJedi FallenKnight = new DarkJedi();
  Sith ManassiWarrior = new Sith();

  public void Intro() {
    System.out.println(
        "This game is based on the Star wars legends universe. This is an unofficial game, and is not recognized by Disney.\r\n"
            + "\r\n"
            + "   6,900 years Before the Battle of Yavin. The Dark Jedi have been at war with the Jedi and the Galactic republic, which\r\n"
            + "has lasted for a 100 years. The war resulted in a huge lost at the Battle of Corbos.  Looking for a new home the Dark Jedi,\r\n"
            + "have found a planet that they think is ripe for the picking. The dark jedi have found that the sith worshiped the Dark Jedi's \r\n"
            + "and the Dark Jedi with their abilities as god-like beings.  ");

    System.out.println("\nFallen Knight health set to " + FallenKnight.health + " hp.");
    System.out.println("\nManassi Warrior health set to " + ManassiWarrior.health + " hp.");

  }

  public void fight() {

    do {
      System.out.println("\nSkills that can be chosen. ");
      System.out.println("\n   1. Slash ");
      System.out.println("   2. Force Push");
      System.out.println("   3. Combustion");
      System.out.println("   4. Life Drain");
      System.out.println("Choose attack: ");

      char choice = in.next().charAt(0);

      switch (choice) {
        case '1':
          System.out.println("\nFallen Knight uses slash dealing " + FallenKnight.attack(ManassiWarrior) + " damage.");
          System.out.println("\nManassi Warriors health is now " + ManassiWarrior.currentHealth);
          break;
        case '2':
          System.out.println(
              "\nFallen Knight uses Force Push dealing " + FallenKnight.forcePush(ManassiWarrior) + " damage.");
          System.out.println("\nManassi Warriors health is now " + ManassiWarrior.currentHealth);
          break;
        case '3':
          System.out.println(
              "\nFallen Knight uses Combustion dealing " + FallenKnight.combustion(ManassiWarrior) + " damage.");
          System.out.println("\nManassi Warriors health is now " + ManassiWarrior.currentHealth);
          break;
        case '4':
          System.out.println(
              "\nFallen Knight uses Life Drain dealing " + FallenKnight.lifeDrain(ManassiWarrior) + " damage.");
          System.out.println("\nManassiWarriors health is now " + ManassiWarrior.currentHealth);
          break;
      }

      while (ManassiWarrior.isAlive == true) {
        if (choice == '1') {
          System.out.println(
              "\nManassiWarrior uses Savage Strike dealing " + ManassiWarrior.savageStrike(FallenKnight) + " damage");
          System.out.println("\nFallen Knights health is " + FallenKnight.currentHealth);
          break;
        } else if (choice == '2') {
          System.out.println(
              "\nManassi Warrior uses Energy Web dealing " + ManassiWarrior.energyWeb(FallenKnight) + " damage.");
          System.out.println("\nFallen Knights health is " + FallenKnight.currentHealth);
          break;
        } else if (choice == '3') {
          System.out.println(
              "\nManassi Warrior uses Force Scream dealing" + ManassiWarrior.forceScream(FallenKnight) + " damage.");
          System.out.println("\nFallen Knights health is " + FallenKnight.currentHealth);
          break;
        } else if (choice == '4') {
          System.out
              .println("\nManassi Warrior uses attack dealing " + ManassiWarrior.attack(FallenKnight) + " damage.");
          System.out.println("\nFallen Knights health is now " + FallenKnight.currentHealth);
          break;
        }
      }

      while (ManassiWarrior.isAlive == false) {
        if (choice == '1') {
          System.out.println("\nManassi Warrior's head was slashed off. ");
          break;
        } else if (choice == '2') {
          System.out.println("\nManassi Warrior's body was thrown at a wall snaping his neck. ");
          break;
        } else if (choice == '3') {
          System.out.println("\nManassi Warrior' body catches on fire and is burnt to a crisp. ");
          break;
        } else if (choice == '4') {
          System.out
              .println("\nManassi Warrior's skin and organs wither to wrinkles were you see can see the skeleton. ");
          break;
        }
      }
      while (FallenKnight.isAlive == false) {
        System.out.println("\nFallen Knight has fought bravely but is now roasting on an open fire.");
        System.exit(0);
        break;
      }
    } while (ManassiWarrior.isAlive == true);
  }
}