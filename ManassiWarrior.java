package Korriban;

public class ManassiWarrior extends Sith {

  public int attack(DarkJedi DJ) {
    int attack = ran.nextInt(8) + 1;
    int r = ran.nextInt(9);
    if (r >= 8)
      attack *= 2;
    if (DJ.health > attack) {
      DJ.currentHealth = (DJ.health - attack);
      DJ.health -= attack;
      DJ.isAlive = true;
    } else if (DJ.currentHealth <= attack) {
      DJ.currentHealth -= attack;
      DJ.isAlive = false;
    }
    return attack;
  }

  // Savage Strike - a relentless onslaught of attacks lines.
  public int savageStrike(DarkJedi DJ) {
    int savageStrike = ran.nextInt(20) + 10;
    int r = ran.nextInt(20);
    if (r >= savageStrike)
      savageStrike *= 2;
    if (DJ.health > savageStrike) {
      DJ.currentHealth = (DJ.health - savageStrike);
      DJ.health -= savageStrike;
      DJ.isAlive = true;
    } else if (DJ.getCurrentHealth() <= savageStrike) {
      DJ.currentHealth -= savageStrike;
      DJ.isAlive = false;
    }
    return savageStrike;
  }

  /**
   * Force Scream - a primal scream of frustration that when infused with the
   * force can cause dramatic damage to those in it's path.
   */
  public int forceScream(DarkJedi DJ) {
    int forceScream = ran.nextInt(20) + 10;
    int r = ran.nextInt(30);
    if (r >= 30)
      forceScream *= 2;
    if (DJ.health > forceScream) {
      DJ.currentHealth = (DJ.health - forceScream);
      DJ.health -= forceScream;
      DJ.isAlive = true;
    } else if (DJ.getCurrentHealth() <= forceScream) {
      DJ.currentHealth -= forceScream;
      DJ.isAlive = false;
    }
    return forceScream;
  }

  public int energyWeb(DarkJedi DJ) {
    int energyWeb = ran.nextInt(15) + 15;
    if (DJ.health > energyWeb) {
      DJ.currentHealth = (DJ.health - energyWeb);
      DJ.health -= energyWeb;
      DJ.isAlive = true;
    } else if (DJ.getCurrentHealth() <= energyWeb) {
      DJ.currentHealth -= energyWeb;
      DJ.isAlive = false;
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
