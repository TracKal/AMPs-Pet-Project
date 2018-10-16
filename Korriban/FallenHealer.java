package Korriban;

public class FallenHealer extends DarkJedi {

  public int attack(Sith manassiWarrior) {
    int attack = ran.nextInt(5) + 1;
    int r = ran.nextInt(5);
    if (r >= 4)
      attack *= 2;
    if (manassiWarrior.health > attack) {
      manassiWarrior.currentHealth = (manassiWarrior.health - attack);
      manassiWarrior.health -= attack;
      manassiWarrior.isAlive = true;
    } else if (manassiWarrior.getCurrentHealth() <= attack) {
      manassiWarrior.currentHealth -= attack;
      manassiWarrior.isAlive = false;
    }
    return attack;
  }

  public int forceShock(Sith manassiWarrior) {
    int forceShock = ran.nextInt(30) + 20;
    int r = ran.nextInt(30);
    if (r >= 28)
      forceShock *= 2;
    if (manassiWarrior.health > forceShock) {
      manassiWarrior.currentHealth = (manassiWarrior.health - forceShock);
      manassiWarrior.health -= forceShock;
      manassiWarrior.isAlive = true;
    } else if (manassiWarrior.getCurrentHealth() <= forceShock) {
      manassiWarrior.currentHealth -= forceShock;
      manassiWarrior.isAlive = false;
    }
    return forceShock;
  }

  public int forceDrain(Sith manassiWarrior) {
    int forceDrain = ran.nextInt(20) + 10;
    int r = ran.nextInt(20);
    if (r >= 18)
      forceDrain *= 2;
    if (manassiWarrior.health > forceDrain) {
      manassiWarrior.currentHealth = (manassiWarrior.health - forceDrain);
      manassiWarrior.health -= forceDrain;
      manassiWarrior.isAlive = true;
      health += forceDrain;
    } else if (manassiWarrior.getCurrentHealth() <= forceDrain) {
      manassiWarrior.currentHealth -= forceDrain;
      manassiWarrior.isAlive = false;
    }
    return forceDrain;
  }

  public int heal() {
    int heal = ran.nextInt(20) + 10;
    int r = ran.nextInt(20);
    if (r >= 15)
      heal *= 2;
    return heal;
  }
}