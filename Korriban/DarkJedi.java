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
	int attack = 0;
	int forcePush;
	int combustion;
	int currentHealth;
	boolean isDead;

	public int attack(Sith manassiWarrior) {
		int attack = ran.nextInt(8) + 1;
		if (manassiWarrior.health > attack) {
			manassiWarrior.currentHealth = manassiWarrior.health - attack;
			isDead = true;
		} else {
			health -= attack;
		}
		return attack;
	}
	
	public int forcePush(Sith manassiWarrior) {
		int forcePush = ran.nextInt(25) + 15;
		if (manassiWarrior.setCurrentHealth() > forcePush) {
			manassiWarrior.currentHealth = manassiWarrior.currentHealth - forcePush;
		} else if (manassiWarrior.health > forcePush) {
			manassiWarrior.currentHealth = manassiWarrior.health - forcePush;
		}
		return forcePush;
	}
	
	public int combustion(Sith manassiWarrior) {
		int combustion = ran.nextInt(30) + 10;
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