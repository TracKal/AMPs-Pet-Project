package Korriban;

import java.util.Scanner;

public class GameLogic {
  Scanner in = new Scanner(System.in);
  DarkJedi FallenKnight = new DarkJedi();
  Sith ManassiWarrior = new Sith();

  static void p(String l) {
    System.out.println(l);
  }

  public void Intro() {
    p("This game is based on the Star wars legends universe. This is an unofficial game, and is not recognized by Disney.\r\n"
        + "\r\n"
        + "   6,900 years Before the Battle of Yavin. The Dark Jedi have been at war with the Jedi and the Galactic republic, which\r\n"
        + "has lasted for a 100 years. The war resulted in a huge lost at the Battle of Corbos.  Looking for a new home the Dark Jedi,\r\n"
        + "have found a planet that they think is ripe for the picking. The dark jedi have found that the sith worshiped the Dark Jedi's \r\n"
        + "and the Dark Jedi with their abilities as god-like beings.  ");

    p("\nFallen Knight health set to " + FallenKnight.health + " hp.");
    p("\nManassi Warrior health set to " + ManassiWarrior.health + " hp.");

  }

  public void fight() {

    for (int i = 0; i <= 5; i++) {
      p("\nFallen Knight is now chosen ");
      p("Skills that can be chosen. ");
      p("\n   1. Slash ");
      p("   2. Force Push");
      p("   3. Combustion");
      p("Choose attack: ");

      char choice = in.next().charAt(0);

      switch (choice) {
        case '1':
          p("\nFallen Knight uses slash dealing " + FallenKnight.attack(ManassiWarrior) + " damage.");
          p("\nManassi Warriors health is now " + ManassiWarrior.currentHealth);
          break;
        case '2':
          p("Fallen Knight uses force push " + FallenKnight.forcePush(ManassiWarrior) + " damage.");
          p("\nManassi Warriors health is now " + ManassiWarrior.currentHealth);
          break;
        case '3':
          p("Fallen Knight uses Combustion " + FallenKnight.combustion(ManassiWarrior) + " damage.");
          p("\nManassi Warriors health is now " + ManassiWarrior.currentHealth);
          break;
      }
      p("\nManassi Warrior uses stab dealing " + ManassiWarrior.attack(FallenKnight) + " damage.");
      p("\nFallen Knights health is now " + FallenKnight.currentHealth);

      if (ManassiWarrior.currentHealth <= 0) {
        p("Manassi WArrior is dead.");
        break;
      }
    }
    return;
  }
}