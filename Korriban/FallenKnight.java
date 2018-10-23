package Korriban;

public class FallenKnight extends DarkJedi {

  /*
   * Sith's basic attack. lines 28 through 30 is a critical if one hits 9.
   */

  public int attack(Sith S) {
    int attack = ran.nextInt(9) + 1;
    int r = ran.nextInt(10);
    if (r >= 9)
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

  /**
   * Force Push is a offensive attack that Dark Jedi knows, from their past jedi
   * training.
   * 
   * @return
   */
  public int forcePush(Sith S) {
    int forcePush = ran.nextInt(25) + 10;
    int r = ran.nextInt(25);
    if (r >= 25)
      forcePush *= 2;
    if (S.health > forcePush) {
      S.currentHealth = (S.health - forcePush);
      S.health -= forcePush;
      S.isAlive = true;
    } else if (S.getCurrentHealth() <= forcePush) {
      S.currentHealth -= forcePush;
      S.isAlive = false;
    }
    return forcePush;
  }

  /**
   * Combustion a darkside force move that gathers heat from the surround area and
   * sets the object that is being heated on fire.
   */
  public int combustion(Sith S) {
    int combustion = ran.nextInt(30) + 10;
    int r = ran.nextInt(30);
    if (r >= 30)
      combustion *= 2;
    if (S.health > combustion) {
      S.currentHealth = (S.health - combustion);
      S.health -= combustion;
      S.isAlive = true;
    } else if (S.getCurrentHealth() <= combustion) {
      S.currentHealth -= combustion;
      S.isAlive = false;
    }
    return combustion;
  }

  public int lifeDrain(Sith S) {
    int lifeDrain = ran.nextInt(15) + 10;
    if (S.health > lifeDrain) {
      S.currentHealth = (S.health - lifeDrain);
      S.health -= lifeDrain;
      S.isAlive = true;
      health += lifeDrain;
    } else if (S.getCurrentHealth() <= lifeDrain) {
      S.currentHealth -= lifeDrain;
      S.isAlive = false;
    }
    return lifeDrain;
  }
}
