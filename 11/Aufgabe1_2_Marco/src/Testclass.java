

public class Testclass {
	public static void main(String[]args) {
		Figur Marco = new Figur("Marco","Mensch",85,12,10);
		Figur Ork = new Figur("Ork","Ork",50,14,6);
		
		Waffe schwert = new Waffe("Maechtiges Schwert",15);
		Waffe axt = new Waffe("groﬂe Axt",30);
		
		Marco.equipWeapon(schwert);
		Ork.equipWeapon(axt);
		
		//System.out.println(Marco.getWeapon().getDmg());
		
		while(Marco.checkPlayerAlive() && Ork.checkPlayerAlive()) {
			Marco.attack(Ork);
			System.out.println("Marcos HP: " + Marco.getHP());
			System.out.println("Orks HP: " + Ork.getHP());
			if(Marco.checkPlayerAlive() && Ork.checkPlayerAlive()) {
				Ork.attack(Marco);
				System.out.println("Marcos HP: " + Marco.getHP());
				System.out.println("Orks HP: " + Ork.getHP());
			}
			
		}
		if(!Marco.checkPlayerAlive())
			System.out.println("Marco ist tod");
		if(!Ork.checkPlayerAlive())
			System.out.println("Ork ist tod");
		
		
		
	}
}
