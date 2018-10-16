package Korriban;

import java.util.Scanner;

public class GameLogic {
  Scanner in = new Scanner(System.in);
  Choice choice = new Choice();

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

  public int fight() {
    choice.c1();
    choice.c2();

    if (choice.c1() == fight()) {
      choice.c1();
    }
    if (choice.c1() != fight()) {
      choice.c2();

    }
    return fight();
  }
}