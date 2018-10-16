package Korriban;

import java.util.Scanner;

public class Choice {
  Scanner in = new Scanner(System.in);
  FallenKnight FallenKnight = new FallenKnight();
  FallenHealer FallenHealer = new FallenHealer();
  Sith ManassiWarrior = new Sith();

  public int c1() {

    // Allows the program to run until condition of isAlive == false.
    do {

      char choice = in.next().charAt(0);

      if (choice == 1) {
        System.out.println("\nSkills that can be chosen. ");
        System.out.println("\n   1. Slash ");
        System.out.println("   2. Force Push");
        System.out.println("   3. Combustion");
        System.out.println("   4. Life Drain");
        System.out.println("Choose attack: ");

        // Allows the user to input 1 - 4 when choosing an attack.

        switch (choice) {
          case '1':
            System.out
                .println("\nFallen Knight uses slash dealing " + FallenKnight.attack(ManassiWarrior) + " damage.");
            System.out.println("\nManassi Warriors health is now " + ManassiWarrior.currentHealth);
            return choice;
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

        /**
         * Depending on the choice, of attack,while ManassiWarrior.isAlive == true. The
         * if statement will allow choice to print out Manassi Warrior's attack, and how
         * much Fallen Knight's health is after attack.
         */
        if (ManassiWarrior.currentHealth > 0) {
          if (choice == '1') {
            System.out.println(
                "\nManassiWarrior uses Savage Strike dealing " + ManassiWarrior.savageStrike(FallenKnight) + " damage");
            System.out.println("\nFallen Knights health is " + FallenKnight.currentHealth);
          } else if (choice == '2') {
            System.out.println(
                "\nManassi Warrior uses Energy Web dealing " + ManassiWarrior.energyWeb(FallenKnight) + " damage.");
            System.out.println("\nFallen Knights health is " + FallenKnight.currentHealth);
          } else if (choice == '3') {
            System.out.println(
                "\nManassi Warrior uses Force Scream dealing " + ManassiWarrior.forceScream(FallenKnight) + " damage.");
            System.out.println("\nFallen Knights health is " + FallenKnight.currentHealth);
          } else if (choice == '4') {
            System.out
                .println("\nManassi Warrior uses attack dealing " + ManassiWarrior.attack(FallenKnight) + " damage.");
            System.out.println("\nFallen Knights health is now " + FallenKnight.currentHealth);
          }
        }

        /**
         * Depending on the choice, of attack by player, if ManassiWarrior.currentHealth
         * is less than 0. Which leads to ManassiWarrior.isAlive == false. The Manassi
         * Warrior will die a certain way. The System.exit will stop the input of new
         * choices once the current health is under 0.
         */
        if (ManassiWarrior.currentHealth < 0) {
          if (choice == '1') {
            System.out.println("\nManassi Warrior's head was slashed off. ");
            System.exit(0);
          } else if (choice == '2') {
            System.out.println("\nManassi Warrior's body was thrown at a wall snaping his neck. ");
            System.exit(0);
          } else if (choice == '3') {
            System.out.println("\nManassi Warrior' body catches on fire and is burnt to a crisp. ");
            System.exit(0);
          } else if (choice == '4') {
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
        if (FallenKnight.currentHealth < 0) {
          if (choice == '1') {
            System.out.println("\nFallen Knight was violently slashed up and left for the scavangers.");
            System.exit(0);
          } else if (choice == '2') {
            System.out.println("\nFallen Knight was ensnared by the energy web and sliced up.");
            System.exit(0);
          } else if (choice == '3') {
            System.out.println("\nFallen Knight ear drums burst and the brain is fired.");
            System.exit(0);
          } else if (choice == '4') {
            System.out.println("\nFallen Knight's torso was hacked in half");
            System.exit(0);
          }
        }
        break;
      }
    } while (ManassiWarrior.isAlive == true);
    return c1();
  }

  public int c2() {

    char choice = in.next().charAt(0);

    do {

      if (choice == '2') {
        System.out.println("\nSkills that can be chosen. ");
        System.out.println("\n     1. Slash ");
        System.out.println("     2. Force Shock");
        System.out.println("     3. Force Drain");
        System.out.println("     4. Heal");
        System.out.println("Choose attack: ");

        // Allows the user to input 1 - 4 when choosing an attack.

        switch (choice) {
          case '1':
            System.out
                .println("\nFallen Healer uses slash dealing " + FallenHealer.attack(ManassiWarrior) + " damage.");
            System.out.println("\nManassi Warriors health is now " + ManassiWarrior.currentHealth);
            break;
          case '2':
            System.out.println(
                "\nFallen Healer uses Force Shock dealing " + FallenHealer.forceShock(ManassiWarrior) + " damage.");
            System.out.println("\nManassi Warriors health is now " + ManassiWarrior.currentHealth);
            break;
          case '3':
            System.out.println(
                "\nFallen Healer uses forceDrain dealing " + FallenHealer.forceDrain(ManassiWarrior) + " damage.");
            System.out.println("\nManassi Warriors health is now " + ManassiWarrior.currentHealth);
            break;
          case '4':
            System.out.println("\nFallen heal uses Dark Heal " + FallenHealer.heal() + " health");
            System.out.println("\nFallen Healer health is now " + FallenHealer.currentHealth);
            break;
        }

        /**
         * Depending on the choice, of attack,while ManassiWarrior.isAlive == true. The
         * if statement will allow choice to print out Manassi Warrior's attack, and how
         * much Fallen Knight's health is after attack.
         */
        if (ManassiWarrior.currentHealth > 0) {
          if (choice == '1') {
            System.out.println(
                "\nManassiWarrior uses Savage Strike dealing " + ManassiWarrior.savageStrike(FallenKnight) + " damage");
            System.out.println("\nFallen Healers health is " + FallenHealer.currentHealth);
          } else if (choice == '2') {
            System.out.println(
                "\nManassi Warrior uses Energy Web dealing " + ManassiWarrior.energyWeb(FallenKnight) + " damage.");
            System.out.println("\nFallen Healer health is " + FallenHealer.currentHealth);
          } else if (choice == '3') {
            System.out.println(
                "\nManassi Warrior uses Force Scream dealing " + ManassiWarrior.forceScream(FallenKnight) + " damage.");
            System.out.println("\nFallen Healer health is " + FallenHealer.currentHealth);
          } else if (choice == '4') {
            System.out
                .println("\nManassi Warrior uses attack dealing " + ManassiWarrior.attack(FallenKnight) + " damage.");
            System.out.println("\nFallen Healer health is now " + FallenHealer.currentHealth);
          }
        }

        /**
         * Depending on the choice, of attack by player, if ManassiWarrior.currentHealth
         * is less than 0. Which leads to ManassiWarrior.isAlive == false. The Manassi
         * Warrior will die a certain way. The System.exit will stop the input of new
         * choices once the current health is under 0.
         */
        if (ManassiWarrior.currentHealth < 0) {
          if (choice == '1') {
            System.out.println("\nManassi Warrior's head was slashed off. ");
            System.exit(0);
          } else if (choice == '2') {
            System.out.println("\nManassi Warrior's body was thrown at a wall snaping his neck. ");
            System.exit(0);
          } else if (choice == '3') {
            System.out.println("\nManassi Warrior' body catches on fire and is burnt to a crisp. ");
            System.exit(0);
          } else if (choice == '4') {
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
        if (FallenKnight.currentHealth < 0) {
          if (choice == '1') {
            System.out.println("\nFallen Knight was violently slashed up and left for the scavangers.");
            System.exit(0);
          } else if (choice == '2') {
            System.out.println("\nFallen Knight was ensnared by the energy web and sliced up.");
            System.exit(0);
          } else if (choice == '3') {
            System.out.println("\nFallen Knight ear drums burst and the brain is fired.");
            System.exit(0);
          } else if (choice == '4') {
            System.out.println("\nFallen Knight's torso was hacked in half");
            System.exit(0);
          }
        }
      }
      return c2();
    } while (ManassiWarrior.isAlive == true);
  }
}
