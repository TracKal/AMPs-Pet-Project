package Korriban;

import java.util.Random;

/**
 * Sith, aka Sith purebloods, humanoids who were born highly strong in the dark
 * side of the force. They are eventually overtaken by The Dark Jedi exiles. The
 * skill pool includes attack, savage strike, and force scream.
 */

public class Sith {
  Random ran = new Random();
  int health = 80;
  int attack;
  int defense = 10;
  int savageStrike;
  int forceScream;
  int currentHealth;
  boolean isAlive;

  /**
   * Sith's basic attack lines 27 and 29 are are the chance for critical if attack
   * lands on 8.
   */
  public int attack(DarkJedi fallenKnight) {
    int attack = ran.nextInt(8) + 1;
    int r = ran.nextInt(10);
    if (r >= 8)
      attack *= 2;
    if (fallenKnight.health > attack) {
      fallenKnight.currentHealth = (fallenKnight.health - attack);
      fallenKnight.health -= attack;
      fallenKnight.isAlive = true;
    } else if (fallenKnight.currentHealth > attack) {
      fallenKnight.currentHealth = fallenKnight.currentHealth - attack;
      fallenKnight.currentHealth -= attack;
      fallenKnight.isAlive = true;
    }
    if (fallenKnight.currentHealth <= attack) {
      fallenKnight.currentHealth -= attack;
      fallenKnight.isAlive = false;
    }
    return attack;
  }

  /**
   * Savage Strike - a relentless onslaught of attacks lines 46 - 48 is a critical
   * change if it rolls a 20.
   */
  public int savageStrike(DarkJedi fallenKnight) {
    int savageStrike = ran.nextInt(20) + 10;
    int r = ran.nextInt(21);
    if (r >= 20)
      savageStrike *= 2;
    if (fallenKnight.health > savageStrike) {
      fallenKnight.currentHealth = (fallenKnight.health - savageStrike);
      fallenKnight.health -= savageStrike;
      fallenKnight.isAlive = true;
    } else if (fallenKnight.getCurrentHealth() > savageStrike) {
      fallenKnight.currentHealth = fallenKnight.currentHealth - savageStrike;
      fallenKnight.currentHealth -= savageStrike;
      fallenKnight.isAlive = true;
    }
    if (fallenKnight.getCurrentHealth() <= savageStrike) {
      fallenKnight.currentHealth -= savageStrike;
      fallenKnight.isAlive = false;
    }
    return savageStrike;
  }

  /**
   * Force Scream - a primal scream of frustration that when infused with the
   * force can cause dramatic damage to those in it's path lines 63 - 65 is a
   * critical chance if you roll a 30
   */
  public int forceScream(DarkJedi fallenKnight) {
    int forceScream = ran.nextInt(30) + 20;
    int r = ran.nextInt(31);
    if (r >= 30)
      forceScream *= 2;
    if (fallenKnight.getCurrentHealth() > forceScream) {
      fallenKnight.currentHealth = (fallenKnight.health - forceScream);
    } else if (fallenKnight.getCurrentHealth() > forceScream) {
      fallenKnight.currentHealth = fallenKnight.currentHealth - forceScream;
    }
    return forceScream;
  }

  public int getCurrentHealth() {
    return currentHealth;
  }

  public int currentHealth() {
    return currentHealth;
  }

  public int setHealth() {
    return health = 80;
  }

  public boolean isAlive() {
    if (currentHealth > 0) {
      return true;
    } else if (currentHealth <= 0) {
      return false;
    }
    return isAlive;

  }

  public int setCurrentHealth() {
    return currentHealth;
  }
}
