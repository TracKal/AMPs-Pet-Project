package Korriban;

import java.util.Random;

public class GameLogic {
	
	 Random ran = new Random();
	 DarkJedi human = new DarkJedi();
	 Sith sith = new Sith();
	 int currentHealth;
	 
	  
	 public void human(int health, int attack, int forcePush) {
	   health = 80;
	   attack = ran.nextInt(10) + 1;
	   forcePush = ran.nextInt(20) + 10;
	 }
	 
	 public void sith(int health, int attack, int savageStrike) {
		 health = 80;
		 attack = ran.nextInt(10) + 1;
		 savageStrike = ran.nextInt(30) + 10;
	 }
	 
	 public String turn1() {
		 System.out.println("Dark Jedi's Health is : " + human.health + "\n Dark Jedi attacks : "
												+ human.attack);
		 
		 System.out.println("Sith's Health is : " + sith.health + "\nSith attacks : " + sith.attack);
		 
		 if (human.health >= sith.attack) {
			 currentHealth = human.health - sith.attack;
			 System.out.println("Dark Jedi's current health is now : " + currentHealth);
		 }
		return turn1();
	 }
}