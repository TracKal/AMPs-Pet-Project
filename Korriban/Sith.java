package Korriban;

import java.util.Random;

public class Sith {
	
	Random ran = new Random();
	int health = 80;
	int attack = ran.nextInt(10) + 1;
	int forcePush = ran.nextInt(20) + 10;
	int damgae = health;
	
	public int attack() {
		int HeavyStrike = attack;
		return HeavyStrike;
	}
}
  
  