package Korriban;

import java.util.Random;

public class Sith {
	
	Random ran = new Random();
	int health = 80;
	int attack = ran.nextInt(10) + 1;
	int savageStrike = ran.nextInt(30) + 10;
	int currentHealth; 
	boolean isDead;
	
	public int attack(DarkJedi fallenKnigh) {
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
	
	public int savageStrike() {
		return savageStrike();
	}
	
	public boolean isAlive() {
		return health > 0;
	}
}