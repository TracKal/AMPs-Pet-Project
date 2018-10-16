package Korriban;

import java.util.Scanner;

public class GameLogic {
  Scanner in = new Scanner(System.in);
  FallenKnight FK = new FallenKnight();
  FallenHealer FH = new FallenHealer();
  Sith ManassiWarrior = new Sith();

  public void Intro() {

    System.out.println(
        "This game is based on the Star wars legends universe. This is an unofficial game, and is not recognized by Disney.\r\n"
            + "\r\n"
            + "   6,900 years Before the Battle of Yavin. The Dark Jedi have been at war with the Jedi and the Galactic republic, which\r\n"
            + "has lasted for a 100 years. The war resulted in a huge lost at the Battle of Corbos.  Looking for a new home the Dark Jedi,\r\n"
            + "have found a planet that they think is ripe for the picking. The dark jedi have found that the sith worshiped the Dark Jedi's \r\n"
            + "and the Dark Jedi with their abilities as god-like beings.  ");
    System.out.println("\nChoose which class you want to be.");
    System.out.println("\n     1. Fallen Knight.");
    System.out.println("\n     2. Fallen Healer");
    System.out.println("\nChoose now!!!!!");
  }

  public void fight() {

    char ch = in.next().charAt(0);
    switch (ch) {

      case '1':
        System.out.println("\nYou have chosen Fallen Knight.");
        break;
      case '2':
        System.out.println("\nYou have chosen Fallen Healer.");
        break;
    }

    do {

      if (ch == '1') {
        System.out.println("\nSkills that can be chosen. ");
        System.out.println("\n   1. Slash ");
        System.out.println("   2. Force Push");
        System.out.println("   3. Combustion");
        System.out.println("   4. Life Drain");
        System.out.println("Choose attack: ");
        char attackChoice = in.next().charAt(0);

        // Allows the user to input 1 - 4 when choosing an attack.

        switch (attackChoice) {
          case '1':
            System.out.println("\nFallen Knight uses slash dealing " + FK.attack(ManassiWarrior) + " damage.");
            System.out.println("\nManassi Warriors health is now " + ManassiWarrior.currentHealth);
          case '2':
            System.out.println("\nFallen Knight uses Force Push dealing " + FK.forcePush(ManassiWarrior) + " damage.");
            System.out.println("\nManassi Warriors health is now " + ManassiWarrior.currentHealth);
            break;
          case '3':
            System.out.println("\nFallen Knight uses Combustion dealing " + FK.combustion(ManassiWarrior) + " damage.");
            System.out.println("\nManassi Warriors health is now " + ManassiWarrior.currentHealth);
            break;
          case '4':
            System.out.println("\nFallen Knight uses Life Drain dealing " + FK.lifeDrain(ManassiWarrior) + " damage.");
            System.out.println("\nManassiWarriors health is now " + ManassiWarrior.currentHealth);
            break;
        }

        /**
         * Depending on the choice, of attack,while ManassiWarrior.isAlive == true. The
         * if statement will allow choice to print out Manassi Warrior's attack, and how
         * much Fallen Knight's health is after attack.
         */
        if (ManassiWarrior.currentHealth > 0) {
          if (attackChoice == '1') {
            System.out
                .println("\nManassiWarrior uses Savage Strike dealing " + ManassiWarrior.savageStrike(FK) + " damage");
            System.out.println("\nFallen Knights health is " + FK.currentHealth);
          } else if (attackChoice == '2') {
            System.out
                .println("\nManassi Warrior uses Energy Web dealing " + ManassiWarrior.energyWeb(FK) + " damage.");
            System.out.println("\nFallen Knights health is " + FK.currentHealth);
          } else if (attackChoice == '3') {
            System.out
                .println("\nManassi Warrior uses Force Scream dealing " + ManassiWarrior.forceScream(FK) + " damage.");
            System.out.println("\nFallen Knights health is " + FK.currentHealth);
          } else if (attackChoice == '4') {
            System.out.println("\nManassi Warrior uses attack dealing " + ManassiWarrior.attack(FK) + " damage.");
            System.out.println("\nFallen Knights health is now " + FK.currentHealth);
          }
        }

        /**
         * Depending on the choice, of attack by player, if ManassiWarrior.currentHealth
         * is less than 0. Which leads to ManassiWarrior.isAlive == false. The Manassi
         * Warrior will die a certain way. The System.exit will stop the input of new
         * choices once the current health is under 0.
         */
        if (ManassiWarrior.currentHealth < 0) {
          if (attackChoice == '1') {
            System.out.println("\nManassi Warrior's head was slashed off. ");
            System.exit(0);
          } else if (attackChoice == '2') {
            System.out.println("\nManassi Warrior's body was thrown at a wall snaping his neck. ");
            System.exit(0);
          } else if (attackChoice == '3') {
            System.out.println("\nManassi Warrior' body catches on fire and is burnt to a crisp. ");
            System.exit(0);
          } else if (attackChoice == '4') {
            System.out.println(
                "\nManassi Warrior's skin and organs wither to wrinkles were " + "you see can see the skeleton. ");
            System.exit(0);
          }
        }

        /**
         * Depending on the choice, of attack by player and the result of the attack of
         * the Manassi Warrior if FallenKnight.currentHealth is less than 0. Which leads
         * to FallenKnight.isAlive == false. The FallenKnight will die a certain way.
         * The System.exit will stop the input of new choices once the currenthealth is
         * under 0.
         */
        if (FK.currentHealth < 0) {
          if (attackChoice == '1') {
            System.out.println("\nFallen Knight was violently slashed up and left for the scavangers.");
            System.exit(0);
          } else if (attackChoice == '2') {
            System.out.println("\nFallen Knight was ensnared by the energy web and sliced up.");
            System.exit(0);
          } else if (attackChoice == '3') {
            System.out.println("\nFallen Knight ear drums burst and the brain is fired.");
            System.exit(0);
          } else if (attackChoice == '4') {
            System.out.println("\nFallen Knight's torso was hacked in half");
            System.exit(0);
          }
        }
      }
    } while (ManassiWarrior.isAlive == true);

    do {

      if (ch == '2') {
        System.out.println("\nSkills that can be chosen. ");
        System.out.println("\n     1. Slash ");
        System.out.println("     2. Force Shock");
        System.out.println("     3. Force Drain");
        System.out.println("     4. Heal");
        System.out.println("Choose attack: ");
        char attackChoice2 = in.next().charAt(0);

        // Allows the user to input 1 - 4 when choosing an attack.
        switch (attackChoice2) {
          case '1':
            System.out.println("\nFallen Healer uses slash dealing " + FH.attack(ManassiWarrior) + " damage.");
            System.out.println("\nManassi Warriors health is now " + ManassiWarrior.currentHealth);
            break;
          case '2':
            System.out
                .println("\nFallen Healer uses Force Shock dealing " + FH.forceShock(ManassiWarrior) + " damage.");
            System.out.println("\nManassi Warriors health is now " + ManassiWarrior.currentHealth);
            break;
          case '3':
            System.out.println("\nFallen Healer uses forceDrain dealing " + FH.forceDrain(ManassiWarrior) + " damage.");
            System.out.println("\nManassi Warriors health is now " + ManassiWarrior.currentHealth);
            break;
          case '4':
            System.out.println("\nFallen heal uses Dark Heal " + FH.heal() + " health");
            System.out.println("\nFallen Healer health is now " + FH.currentHealth);
            break;
        }

        /**
         * Depending on the choice, of attack,while ManassiWarrior.isAlive == true. The
         * if statement will allow choice to print out Manassi Warrior's attack, and how
         * much Fallen Knight's health is after attack.
         */
        if (ManassiWarrior.currentHealth > 0) {
          if (attackChoice2 == '1') {
            System.out
                .println("\nManassiWarrior uses Savage Strike dealing " + ManassiWarrior.savageStrike(FH) + " damage");
            System.out.println("\nFallen Healers health is " + FH.currentHealth);
          } else if (attackChoice2 == '2') {
            System.out
                .println("\nManassi Warrior uses Energy Web dealing " + ManassiWarrior.energyWeb(FH) + " damage.");
            System.out.println("\nFallen Healer health is " + FH.currentHealth);
          } else if (attackChoice2 == '3') {
            System.out
                .println("\nManassi Warrior uses Force Scream dealing " + ManassiWarrior.forceScream(FH) + " damage.");
            System.out.println("\nFallen Healer health is " + FH.currentHealth);
          } else if (attackChoice2 == '4') {
            System.out.println("\nManassi Warrior uses attack dealing " + ManassiWarrior.attack(FH) + " damage.");
            System.out.println("\nFallen Healer health is now " + FH.currentHealth);
          }
        }
        /**
         * Depending on the choice, of attack by player, if ManassiWarrior.currentHealth
         * is less than 0. Which leads to ManassiWarrior.isAlive == false. The Manassi
         * Warrior will die a certain way. The System.exit will stop the input of new
         * choices once the current health is under 0.
         */
        if (ManassiWarrior.currentHealth < 0) {
          if (attackChoice2 == '1') {
            System.out.println("\nManassi Warrior's head was slashed off. ");
            System.exit(0);
          } else if (attackChoice2 == '2') {
            System.out.println("\nManassi Warrior's body was thrown at a wall snaping his neck. ");
            System.exit(0);
          } else if (attackChoice2 == '3') {
            System.out.println("\nManassi Warrior' body catches on fire and is burnt to a crisp. ");
            System.exit(0);
          } else if (attackChoice2 == '4') {
            System.out.println(
                "\nManassi Warrior's skin and organs wither to wrinkles were " + "you see can see the skeleton. ");
            System.exit(0);
          }
        }
        /**
         * Depending on the choice, of attack by player and the result of the attack of
         * the Manassi Warrior if FallenKnight.currentHealth is less than 0. Which leads
         * to FallenKnight.isAlive == false. The FallenKnight will die a certain way.
         * The System.exit will stop the input of new choices once the currenthealth is
         * under 0.
         */
        if (FH.currentHealth < 0) {
          if (attackChoice2 == '1') {
            System.out.println("\nFallen Healer was violently slashed up and left for the scavangers.");
            System.exit(0);
          } else if (attackChoice2 == '2') {
            System.out.println("\nFallen Healer was ensnared by the energy web and sliced up.");
            System.exit(0);
          } else if (attackChoice2 == '3') {
            System.out.println("\nFallen Healer ear drums burst and the brain is fired.");
            System.exit(0);
          } else if (attackChoice2 == '4') {
            System.out.println("\nFallen Healer torso was hacked in half");
            System.exit(0);
          }
        }
      }
    } while (ManassiWarrior.isAlive == true);
  }
}