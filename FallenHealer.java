package Korriban;

public class FallenHealer extends DarkJedi {

  public int attack(Sith S) {
    int attack = ran.nextInt(5) + 1;
    int r = ran.nextInt(5);
    if (r >= 4)
      attack *= 2;
    if (S.health > attack) {
      S.currentHealth = (S.health - attack);
      S.health -= attack;
      S.isAlive = true;
    } else if (S.getCurrentHealth() <= attack) {
      S.currentHealth -= attack;
      S.isAlive = false;
    }
    return attack;
  }

  public int forceShock(Sith S) {
    int forceShock = ran.nextInt(30) + 20;
    int r = ran.nextInt(30);
    if (r >= 28)
      forceShock *= 2;
    if (S.health > forceShock) {
      S.currentHealth = (S.health - forceShock);
      S.health -= forceShock;
      S.isAlive = true;
    } else if (S.getCurrentHealth() <= forceShock) {
      S.currentHealth -= forceShock;
      S.isAlive = false;
    }
    return forceShock;
  }

  public int forceDrain(Sith S) {
    int forceDrain = ran.nextInt(20) + 10;
    int r = ran.nextInt(20);
    if (r >= 18)
      forceDrain *= 2;
    if (S.health > forceDrain) {
      S.currentHealth = (S.health - forceDrain);
      S.health -= forceDrain;
      S.isAlive = true;
      health += forceDrain;
    } else if (S.getCurrentHealth() <= forceDrain) {
      S.currentHealth -= forceDrain;
      S.isAlive = false;
    }
    return forceDrain;
  }

  public int heal() {
    int heal = ran.nextInt(20) + 10;
    health += heal;
    return heal;
  }
}