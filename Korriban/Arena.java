package Korriban;


public class Arena {
  public static void main(String[] args) {
  	
  	DarkJedi DarkJedi = new DarkJedi();
  	Sith Sith = new Sith();
  	
  	System.out.println("Dark Jedi's Health is : " + DarkJedi.health);
  	System.out.println("Dark Jedi uses Slash: " + DarkJedi.attack);
  	
  	System.out.println("\nSith's Health is : " + Sith.health);
  	System.out.println("Sith uses Heavy Strike : " + Sith.attack);
  	
  	DarkJedi.health = DarkJedi.health - Sith.attack;
  	System.out.println("\nDark Jedi's Health is now : " + DarkJedi.health);
  	
  	Sith.health = Sith.health - DarkJedi.attack;
  	System.out.println("\nSith's Health is now : " + Sith.health);
  	
  }
}
  	 