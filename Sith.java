package Korriban;

import java.util.Random;

/**
 * Sith, aka Sith purebloods, humanoids who were born highly strong in the dark
 * side of the force. They are eventually overtaken by The Dark Jedi exiles. The
 * skill pool includes attack, savage strike, and force scream.
 * 
 * Added a Critical for each attack. which is int r = ran.nextInt(x) if ( r >=
 * x) x *= 2;
 */

public class Sith {
  Random ran = new Random();
  int health = 80;
  int defense = 10;
  int currentHealth;
  boolean isAlive;

  public boolean isAlive() {
    if (currentHealth > 0) {
      return true;
    } else if (currentHealth <= 0) {
      return false;
    }
    return isAlive;

  }

  public int getCurrentHealth() {
    return currentHealth;
  }
}