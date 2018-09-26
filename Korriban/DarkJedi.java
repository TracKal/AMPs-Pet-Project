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
	boolean isDead;
    
	/* *
	 *  Sith's basic attack.
	 *  lines 28 through 30 is a critical if one hits 9.
	 */
	
	public int attack(Sith manassiWarrior) {
		int attack = ran.nextInt(9) + 1;
		int r = ran.nextInt(10);
		if (r >= 9)
			attack *= 2;
		if (manassiWarrior.health > attack) {
			manassiWarrior.currentHealth = manassiWarrior.health - attack;
			isDead = true;
		} else {
			health -= attack;
		}
		return attack;
	}
	
	/**
	 *  Force Push is a offensive attack that Dark Jedi knows, from their past 
	 *  jedi training.
	 */
	public int forcePush(Sith manassiWarrior) {
		int forcePush = ran.nextInt(25) + 15;
		int r = ran.nextInt(26);
		if (r >= 25)
			forcePush *= 2;
		if (manassiWarrior.setCurrentHealth() > forcePush) {
			manassiWarrior.currentHealth = manassiWarrior.currentHealth - forcePush;
		} else if (manassiWarrior.health > forcePush) {
			manassiWarrior.currentHealth = manassiWarrior.health - forcePush;
		}
		return forcePush;
	}
	
	/**
	 * Combustion is a pyrokenises move that has affiliation with both light and dark side users.
	 */
	public int combustion(Sith manassiWarrior) {
		int combustion = ran.nextInt(30) + 10;
		int r = ran.nextInt(31);
		if (r >= 30)
			combustion *= 2;
		if (manassiWarrior.setCurrentHealth() > combustion) {
			manassiWarrior.currentHealth = manassiWarrior.currentHealth - combustion;
			isDead = true;
		}
		return combustion;
	}
	
	public int setHealth() {
		return health = 80;
	}

	public boolean isDead() {
		return isDead;
	}

	public boolean isAlive() {
		return health > 0;
	}

	public int setCurrentHealth() {
		return currentHealth;
	}
}