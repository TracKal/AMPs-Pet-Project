package Korriban;

import java.util.Random;

/**
 * Dark Jedi - Those that have fallen from balance and focus on allowing their
 * emotions to effect them. They will know basic jedi abilities. Their off
 * spring the sith Hybrid will add dark force powers. This will be done later
 * on.
 * 
 * Added a Critical for each attack. which is int r = ran.nextInt(x) if ( r >=
 * x) x *= 2;
 */

public class DarkJedi {
  Random ran = new Random();
  int health = 80;
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
