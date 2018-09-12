package Korriban;


public class Arena {
  public static void main(String[] args) {
  	
  	DarkJedi DarkJedi = new DarkJedi();
    Sith Sith = new Sith();
    System.out.println("Dark Jedi's Health is : " + DarkJedi.health);
  	System.out.println("Dark Jedi uses Slash: " + DarkJedi.attack);
  	  
  	System.out.println("\nSith's Health is : " + Sith.health);
  	System.out.println("Sith uses Heavy Strike : " + Sith.attack);
  	System.out.println("--------------------------------------------------------------");
  	
  	if (DarkJedi.health >= Sith.attack) {
  	  DarkJedi.currenthHealth = DarkJedi.health - Sith.attack;
  	  System.out.println("\nDark Jedi's current health is now : " + DarkJedi.currenthHealth);
  	  System.out.println("Dark Jedi uses force push : " + DarkJedi.forcePush);
  	    
  	  if (Sith.health >= DarkJedi.attack) {
  	  	Sith.currentHealth = Sith.health - DarkJedi.attack;
  	    System.out.println("\nSith's current health is now : " + Sith.currentHealth);
  	    System.out.println("Sith uses savage strike : " + Sith.savageStrike);
  	    System.out.println("--------------------------------------------------------------");
  	   
  	    if (DarkJedi.currenthHealth >= Sith.savageStrike) {
  	  	  DarkJedi.currenthHealth = DarkJedi.currenthHealth - Sith.savageStrike;
  	  	  System.out.println("\nDark Jedi's current health is now : " + DarkJedi.currenthHealth);
  	  	 
  	  	 
  	  	  if (Sith.currentHealth >= DarkJedi.forcePush) {
  	  		  Sith.currentHealth = Sith.currentHealth - DarkJedi.forcePush;
  	  		  System.out.println("\nSith's current health is now : " + Sith.currentHealth);
  	  		  
  	  	  }
  	    }
  	  }
  	}
  	return;
  }
}