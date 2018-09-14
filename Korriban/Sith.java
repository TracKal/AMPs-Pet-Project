package Korriban;

import java.util.Random;

public class Sith {
  Random ran = new Random();
	 int health = 80;
	 int attack;
	 int savageStrike = ran.nextInt(30) + 10;
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
	
	 public int setHealth() {
	   return health = 80;
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