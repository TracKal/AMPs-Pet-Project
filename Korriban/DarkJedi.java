package Korriban;

import java.util.Random;

/**
 * Dark Jedi - Those that have fallen from balance and focus on allowing their emotions to 
 * effect them. They will know basic jedi abilities. Their off spring the sith Hybrid will add dark force powers. 
 * This will be done later on.
 * 
 */

public class DarkJedi {
	Random ran = new Random();
	int health = 80;
	int attack = ran.nextInt(8) + 1;
	int forcePush = ran.nextInt(25) + 10;
	int currentHealth;
	boolean isDead;
	
	public int attack(Sith manassiWarrior) {
		return attack = takeDamage(attack);
	}
	
	public int takeDamage(int damage) {
		if ( health - damage <= 0) {
			health = 0;
			isDead = true;
		} else {
			health -= damage;
		}
		return damage;
	}
	
	public boolean isDead() {
		return isDead;
	}
	
	public int forcePush() {
		return forcePush;
	}
	
	public boolean isAlive() {
		return health > 0;
	}
}