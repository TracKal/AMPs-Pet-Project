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
	boolean isDead;

	/**
	 * Sith's basic attack lines 27 and 29 are are the chance for critical if attack
	 * lands on 8.
	 */
	public int attack(DarkJedi fallenKnight) {
		int attack = ran.nextInt(8) + 1;
		int r = ran.nextInt(10);
		if (r >= 8)
			attack *= 2;
		if (fallenKnight.currentHealth > attack) {
			fallenKnight.currentHealth = fallenKnight.currentHealth - attack;
			isDead = true;
		} else if (fallenKnight.health > attack) {
			fallenKnight.currentHealth = fallenKnight.health - attack;
			isDead = true;
		} else {
			health -= attack;
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
		if (fallenKnight.setCurrentHealth() > savageStrike) {
			fallenKnight.currentHealth = fallenKnight.currentHealth - savageStrike;
		} else if (fallenKnight.health > savageStrike) {
			fallenKnight.currentHealth = fallenKnight.health - savageStrike;
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
		if (fallenKnight.setCurrentHealth() > forceScream) {
			fallenKnight.currentHealth = fallenKnight.currentHealth - forceScream;
			isDead = true;
		}
		return forceScream;
	}

	public int setHealth() {
		return health = 80;
	}

	public int setCurrentHealth() {
		return currentHealth;
	}

	public int isDead() {
		return health = 0;
	}

	public int savageStrike() {
		return savageStrike();
	}

	public boolean isAlive() {
		return health > 0;
	}
}