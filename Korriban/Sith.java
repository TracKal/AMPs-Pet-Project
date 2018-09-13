package Korriban;

import java.util.Random;

public class Sith {
	
	Random ran = new Random();
	int health = 80;
	int attack = ran.nextInt(10) + 1;
	int savageStrike = ran.nextInt(30) + 10;
	int currentHealth; ;
}