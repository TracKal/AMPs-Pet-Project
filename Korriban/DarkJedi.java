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
	int attack = ran.nextInt(10) + 1;
	int forcePush = ran.nextInt(20) + 10;
	int currenthHealth;
}
  
  
