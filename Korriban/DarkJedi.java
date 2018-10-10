package Korriban;

import java.util.Random;

/**
 * Dark Jedi - Those that have fallen from balance and focus on allowing their
 * emotions to effect them. They will know basic jedi abilities. Their off
 * spring the sith Hybrid will add dark force powers. This will be done later
 * on.
 * 
 */

public class DarkJedi {
  Random ran = new Random();
  int health = 80;
  int currentHealth;
  boolean isAlive;

  /*
   * Sith's basic attack. lines 28 through 30 is a critical if one hits 9.
   */

  public int attack(Sith manassiWarrior) {
    int attack = ran.nextInt(9) + 1;
    if (manassiWarrior.health > attack) {
      manassiWarrior.currentHealth = (manassiWarrior.health - attack);
      manassiWarrior.health -= attack;
      manassiWarrior.isAlive = true;
    } else if (manassiWarrior.getCurrentHealth() > attack) {
      manassiWarrior.currentHealth = (manassiWarrior.currentHealth - attack);
      manassiWarrior.currentHealth -= attack;
      manassiWarrior.isAlive = true;
    }
    if (manassiWarrior.getCurrentHealth() <= attack) {
      manassiWarrior.currentHealth -= attack;
      manassiWarrior.isAlive = false;
    }
    return attack;
  }

  /**
   * Force Push is a offensive attack that Dark Jedi knows, from their past jedi
   * training.
   * 
   * @return
   */
  public int forcePush(Sith manassiWarrior) {
    int forcePush = ran.nextInt(25) + 10;
    if (manassiWarrior.health > forcePush) {
      manassiWarrior.currentHealth = (manassiWarrior.health - forcePush);
      manassiWarrior.health -= forcePush;
      manassiWarrior.isAlive = true;
    } else if (manassiWarrior.getCurrentHealth() > forcePush) {
      manassiWarrior.currentHealth = (manassiWarrior.currentHealth - forcePush);
      manassiWarrior.currentHealth -= forcePush;
      manassiWarrior.isAlive = true;
    }
    if (manassiWarrior.getCurrentHealth() <= forcePush) {
      manassiWarrior.currentHealth -= forcePush;
      manassiWarrior.isAlive = false;
    }
    return forcePush;
  }

  public int combustion(Sith manassiWarrior) {
    int combustion = ran.nextInt(30) + 10;
    if (manassiWarrior.health > combustion) {
      manassiWarrior.currentHealth = (manassiWarrior.health - combustion);
      manassiWarrior.health -= combustion;
      manassiWarrior.isAlive = true;
    } else if (manassiWarrior.getCurrentHealth() > combustion) {
      manassiWarrior.currentHealth = (manassiWarrior.currentHealth - combustion);
      manassiWarrior.currentHealth -= combustion;
      manassiWarrior.isAlive = true;
    }
    if (manassiWarrior.getCurrentHealth() <= combustion) {
      manassiWarrior.currentHealth -= combustion;
      manassiWarrior.isAlive = false;
    }
    return combustion;
  }

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
