package Korriban;

import java.util.Scanner;

public class GameLogic {
  Scanner in = new Scanner(System.in);
  DarkJedi FallenKnight = new DarkJedi();
  Sith ManassiWarrior = new Sith();
  Choice choice = new Choice();

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

  public int fight() {
    choice.c1();
    return fight();
  }
}