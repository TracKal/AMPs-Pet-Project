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

  // Sith's basic attack lines 27 and 29 are are the chance for critical if attack
  // lands on 8.
  public int attack(DarkJedi fallenKnight) {
    int attack = ran.nextInt(8) + 1;
    int r = ran.nextInt(9);
    if (r >= 8)
      attack *= 2;
    if (fallenKnight.health > attack) {
      fallenKnight.currentHealth = (fallenKnight.health - attack);
      fallenKnight.health -= attack;
      fallenKnight.isAlive = true;
    } else if (fallenKnight.currentHealth <= attack) {
      fallenKnight.currentHealth -= attack;
      fallenKnight.isAlive = false;
    }
    return attack;
  }

  // Savage Strike - a relentless onslaught of attacks lines.
  public int savageStrike(DarkJedi fallenKnight) {
    int savageStrike = ran.nextInt(20) + 10;
    int r = ran.nextInt(20);
    if (r >= savageStrike)
      savageStrike *= 2;
    if (fallenKnight.health > savageStrike) {
      fallenKnight.currentHealth = (fallenKnight.health - savageStrike);
      fallenKnight.health -= savageStrike;
      fallenKnight.isAlive = true;
    } else if (fallenKnight.getCurrentHealth() <= savageStrike) {
      fallenKnight.currentHealth -= savageStrike;
      fallenKnight.isAlive = false;
    }
    return savageStrike;
  }

  /**
   * Force Scream - a primal scream of frustration that when infused with the
   * force can cause dramatic damage to those in it's path.
   */
  public int forceScream(DarkJedi fallenKnight) {
    int forceScream = ran.nextInt(20) + 10;
    int r = ran.nextInt(30);
    if (r >= 30)
      forceScream *= 2;
    if (fallenKnight.health > forceScream) {
      fallenKnight.currentHealth = (fallenKnight.health - forceScream);
      fallenKnight.health -= forceScream;
      fallenKnight.isAlive = true;
    } else if (fallenKnight.getCurrentHealth() <= forceScream) {
      fallenKnight.currentHealth -= forceScream;
      fallenKnight.isAlive = false;
    }
    return forceScream;
  }

  public int energyWeb(DarkJedi fallenKnight) {
    int energyWeb = ran.nextInt(15) + 15;
    if (fallenKnight.health > energyWeb) {
      fallenKnight.currentHealth = (fallenKnight.health - energyWeb);
      fallenKnight.health -= energyWeb;
      fallenKnight.isAlive = true;
    } else if (fallenKnight.getCurrentHealth() <= energyWeb) {
      fallenKnight.currentHealth -= energyWeb;
      fallenKnight.isAlive = false;
    }
    return energyWeb;
  }

  public int getCurrentHealth() {
    return currentHealth;
  }

  public boolean isAlive() {
    if (currentHealth > 0) {
      return true;
    } else if (currentHealth == 0) {
      return false;
    }
    return isAlive;
  }
}
