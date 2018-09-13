package Korriban;

public class GameLogic {
	
	DarkJedi FallenKnight = new DarkJedi(); 
	Sith ManassiWarrior = new Sith();
	
	public void Intro() {
		
		System.out.println("This game is based on the Star wars legends universe. This is an unofficial game, and is not recognized by Disney.\r\n" + 
											 "\r\n" + "   6,900 years Before the Battle of Yavin. The Dark Jedi have been at war with the Jedi and the Galactic republic, which\r\n" + 
											 "has lasted for a 100 years. The war resulted in a huge lost at the Battle of Corbos.  Looking for a new home the Dark Jedi,\r\n" + 
											 "have found a planet that they think is ripe for the picking. The dark jedi have found that the sith worshiped the Dark Jedi's \r\n" + 
											 "and the Dark Jedi with their abilities as god-like beings.  ");
		
		System.out.println("\n\nFallen Knight Health : " + FallenKnight.health +
											 "\nFallen Knight attacks dealing : " + FallenKnight.attack);
											
	  System.out.println("\nManassi Warrior Health : " + ManassiWarrior.health +
											 "\nManassi Warrior attacks dealing : " + ManassiWarrior.attack);
											
		System.out.println("------------------------------------------------------------");
		return;
	}
	
	public void Round1() {
		
		FallenKnight.currentHealth = FallenKnight.health - ManassiWarrior.attack;          
		System.out.println("\nFallen Knight's new health : " + FallenKnight.currentHealth);  
		                                                                                   
		ManassiWarrior.currentHealth = ManassiWarrior.health - FallenKnight.attack;        
		System.out.println("\nManassi Warrior's new health : " + ManassiWarrior.currentHealth);
		                                                                                    
		System.out.println("------------------------------------------------------------");
		return;
	}
	
	public void Round2() {
		
System.out.println("\nFallen Knight uses Force Push : " + FallenKnight.forcePush);
		
		System.out.println("\nManassi Warrior uses Savage Strike : " + ManassiWarrior.savageStrike);
		
		System.out.println("------------------------------------------------------------");
		
		FallenKnight.currentHealth = FallenKnight.currentHealth - ManassiWarrior.savageStrike;
		System.out.println("\nFallen Knight's new health : " + FallenKnight.currentHealth);
		
		ManassiWarrior.currentHealth = ManassiWarrior.currentHealth - FallenKnight.forcePush;
		System.out.println("\nManassi Warrior's new health : " + ManassiWarrior.currentHealth);
		return;
	}
}