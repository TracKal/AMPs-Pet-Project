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
  int attack = 70;
  int forcePush;
  int combustion;
  int defense = 80;
  int currentHealth;
  boolean isAlive;

  /*
   * Sith's basic attack. lines 28 through 30 is a critical if one hits 9.
   */

  public int attack(Sith manassiWarrior) {
    int attack = ran.nextInt(40) + 10;
    if (manassiWarrior.health > attack) {
      manassiWarrior.currentHealth = (manassiWarrior.health - attack);
      manassiWarrior.isAlive = true;
    } else if (manassiWarrior.getCurrentHealth() > attack) {
      manassiWarrior.currentHealth = (manassiWarrior.currentHealth - attack);
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
    int forcePush = ran.nextInt(25) + 1;
    if (manassiWarrior.health > forcePush) {
      manassiWarrior.currentHealth = (manassiWarrior.health - forcePush);
      manassiWarrior.isAlive = true;
    } else if (manassiWarrior.getCurrentHealth() > forcePush) {
      manassiWarrior.currentHealth = (manassiWarrior.currentHealth - forcePush);
      manassiWarrior.isAlive = true;
    }
    if (manassiWarrior.getCurrentHealth() <= forcePush) {
      manassiWarrior.currentHealth -= forcePush;
      manassiWarrior.isAlive = false;
    }
    return forcePush;
  }

  public int setHealth() {
    return health = 80;
  }

  public boolean isAlive() {
    if (currentHealth > 0) {
      return true;
    } else if (currentHealth < 0) {
      return false;
    }
    return isAlive;

  }

  public int setCurrentHealth() {
    return currentHealth;
  }
}