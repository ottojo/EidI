

public class Testclass {
	public static void main(String[]args) {
		//Erstellt zwei Figuren und zwei Waffen mit gegebenen Eigenschaften
		Figur Marco = new Figur("Marco","Mensch",85,12,10);
		Figur Ork = new Figur("Ork","Ork",50,14,6);
		
		Waffe schwert = new Waffe("Maechtiges Schwert",15);
		Waffe axt = new Waffe("groﬂe Axt",7);
		
		
		Marco.equipWeapon(schwert);
		Ork.equipWeapon(axt);
		
		//Figuren kaempfen solange gegeneinander bis eine Tod ist oder die Waffe einer Figur kaputt ist
		while(Marco.checkPlayerAlive() && Ork.checkPlayerAlive() && Marco.getWeapon().checkWeapon() && Ork.getWeapon().checkWeapon()) {
			Marco.attack(Ork);
			System.out.println("Marcos HP: " + Marco.getHP()+ "			 Marcos Waffenabnutzung: " + Marco.getWeapon().getPCT());
			System.out.println("Orks HP: " + Ork.getHP()+ " 		Orks Waffenabnutzung: " + Ork.getWeapon().getPCT());
			if(Marco.checkPlayerAlive() && Ork.checkPlayerAlive() && Marco.getWeapon().checkWeapon() && Ork.getWeapon().checkWeapon()) {
				Ork.attack(Marco);
				System.out.println("Marcos HP: " + Marco.getHP()+ " 		Marcos Waffenabnutzung: " + Marco.getWeapon().getPCT());
				System.out.println("Orks HP: " + Ork.getHP() +  " 		Orks Waffenabnutzung: " + Ork.getWeapon().getPCT());
			}
			
		}
		//Ausgabe welche Figur gestorben ist
		if(!Marco.checkPlayerAlive())
			System.out.println("Marco ist tod");
		if(!Ork.checkPlayerAlive())
			System.out.println("Ork ist tod");
		
		
		
	}
}
