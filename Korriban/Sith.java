package Korriban;

import java.util.Random;

public class Sith {
	Random ran = new Random();
	int health = 80;
	int attack;
	int savageStrike;
	int currentHealth;
	boolean isDead;

	public int attack(DarkJedi fallenKnight) {
		int attack = ran.nextInt(8) + 1;
		if (fallenKnight.health > attack) {
			fallenKnight.currentHealth = fallenKnight.health - attack;
			isDead = true;
		} else {
			health -= attack;
		}
		return attack;
	}
	
	public int savageStrike(DarkJedi fallenKnight)	{
		int savageStrike = ran.nextInt(20) + 1;
		if (fallenKnight.setCurrentHealth() > savageStrike) {
			fallenKnight.currentHealth = fallenKnight.currentHealth - savageStrike;
		} else if (fallenKnight.health > savageStrike) {
			fallenKnight.currentHealth = fallenKnight.health - savageStrike;
		}
		return savageStrike;
	}
	
	public int forceScream(DarkJedi fallenKnight) {
		int forceScream = ran.nextInt(30) + 1;
		if (fallenKnight.setCurrentHealth() > forceScream) {
			fallenKnight.currentHealth = fallenKnight.currentHealth - forceScream;
			isDead = true;
		}
		return forceScream;
	}
	
	public int setHealth() {
		return health = 80;
	}
	
	public int setCurrentHealth()	{
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