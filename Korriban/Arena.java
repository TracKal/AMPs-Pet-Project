package Korriban;


public class Arena {
  
	public static void main(String[] args) {
		
		DarkJedi FallenKnight = new DarkJedi(); 
		Sith ManassiWarrior = new Sith();
		
		System.out.println("Fallen Knight Health : " + FallenKnight.health +
											 "\nFallen Knight attacks dealing : " + FallenKnight.attack);
		
		System.out.println("\nManassi Warrior Health : " + ManassiWarrior.health +
											 "\nManassi Warrior attacks dealing : " + ManassiWarrior.attack);
		
		System.out.println("------------------------------------------------------------");
		                                                                                   
		FallenKnight.currentHealth = FallenKnight.health - ManassiWarrior.attack;          
		System.out.println("Fallen Knight's new health : " + FallenKnight.currentHealth);  
		                                                                                   
		ManassiWarrior.currentHealth = ManassiWarrior.health - FallenKnight.attack;        
		System.out.println("\nManassi Warrior's new health : " + ManassiWarrior.currentHealth);
		                                                                                    
		System.out.println("------------------------------------------------------------");
		
		System.out.println("Fallen Knight uses Force Push : " + FallenKnight.forcePush);
		
		System.out.println("\nManassi Warrior uses Savage Strike : " + ManassiWarrior.savageStrike);
		
		System.out.println("------------------------------------------------------------");
		
		FallenKnight.currentHealth = FallenKnight.currentHealth - ManassiWarrior.savageStrike;
		System.out.println("Fallen Knight's new health : " + FallenKnight.currentHealth);
		
		ManassiWarrior.currentHealth = ManassiWarrior.currentHealth - FallenKnight.forcePush;
		System.out.println("Manassi Warrior's new health : " + ManassiWarrior.currentHealth);
  	
  }
}