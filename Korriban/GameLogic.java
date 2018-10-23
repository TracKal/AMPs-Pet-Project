package Korriban;

import java.util.Scanner;

public class GameLogic {
  Scanner in = new Scanner(System.in);
  FallenKnight FK = new FallenKnight();
  FallenHealer FH = new FallenHealer();
  ManassiWarrior MW = new ManassiWarrior();

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

    char choice = in.next().charAt(0);

    if (choice == '1') {
      System.out.println("\nYou have chosen the Fallen Knight.");
    } else if (choice == '2') {
      System.out.println("\nYou have chosen the Fallen Healer.");
    }

    do {

      System.out.println("\nSkills that can be chosen. ");
      System.out.println("\n   a. Attack ");
      System.out.println("   b. Skill 1");
      System.out.println("   c. Skill 2");
      System.out.println("   d. Special");
      System.out.println("Choose: ");

      char move = in.next().charAt(0);
      switch (move) {
        case 'a':
          if (choice == '1') {
            System.out.println("\nFallen Knight uses slash dealing " + FK.attack(MW) + " damage.");
            System.out.println("\nManassi Warriors health is now " + MW.currentHealth);
          } else if (choice == '2') {
            System.out.println("\nFallen Healer uses slash dealing " + FH.attack(MW) + " damage.");
            System.out.println("\nManassi Warriors health is now " + MW.currentHealth);
          }
          break;
        case 'b':
          if (choice == '1') {
            System.out.println("\nFallen Knight uses Force Push dealing " + FK.forcePush(MW) + " damage.");
            System.out.println("\nManassi Warriors health is now " + MW.currentHealth);
          } else if (choice == '2') {
            System.out.println("\nFallen Healer uses Force Shock dealing " + FH.forceShock(MW) + " damage.");
            System.out.println("\nManassi Warriors health is now " + MW.currentHealth);
          }
          break;
        case 'c':
          if (choice == '1') {
            System.out.println("\nFallen Knight uses Combustion dealing " + FK.combustion(MW) + " damage.");
            System.out.println("\nManassi Warriors health is now " + MW.currentHealth);
          } else if (choice == '2') {
            System.out.println("\nFallen Healer uses forceDrain dealing " + FH.forceDrain(MW) + " damage.");
            System.out.println("\nManassi Warriors health is now " + MW.currentHealth);
          }
          break;
        case 'd':
          if (choice == '1') {
            System.out.println("\nFallen Knight uses Life Drain dealing " + FK.lifeDrain(MW) + " damage.");
            System.out.println("\nManassiWarriors health is now " + MW.currentHealth);
          } else if (choice == '2') {
            System.out.println("\nFallen heal uses Dark Heal " + FH.heal() + " health");
            System.out.println("\nFallen Healer health is now " + FH.currentHealth);
          }
          break;
      }
    } while (MW.isAlive == true);
  }
}
