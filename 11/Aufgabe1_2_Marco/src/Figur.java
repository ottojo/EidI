

import java.util.Random;

public class Figur {
	Random rand = new Random();
	
	//Attribute einer Figur
	private String name;
	private String rasse;
	private int hp; //healthpoints
	private int sp; //strengthpoints
	private int armor;
	
	private Waffe weapon;// Figur kann eine Waffe tragen
	private boolean weaponEQ;//boolean Wert ob 
	
	
	//Konstruktor für eine vollstaendige Figur
	Figur(String name, String rasse, int hp, int sp, int armor){
		this.name = name;
		this.rasse = rasse;
		this.hp = hp;
		this.sp = sp;
		this.armor = armor;
		this.weaponEQ=false;
	}
	
	//Im Folgenden werden die getter/setter Methoden erstellt
	protected String getName() {
		return this.name;
	}
	protected String getRasse() {
		return this.rasse;
	}
	protected int getHP() {
		return this.hp;
	}
	protected int getSP() {
		return this.sp;
	}
	protected int getArmor() {
		return this.armor;
	}

	protected Waffe getWeapon() {
		return this.weapon;
	}
	protected boolean getWeaponEQ() {
		return this.weaponEQ;
	}
	/**
	 * Manipulieren der hp einer Figur
	 * falls hp negativ werden, werden hp auf 0 gesetzt
	 * @param dmg Integer Wert der den Schaden angibt, den die Figur nach dem Verteidigen bekommt
	 */
	protected void setHP(int dmg) {
		this.hp -= dmg;
		if(this.hp<0)
			this.hp=0;
	}
	/**
	 * Ruestet eine Waffe aus, falls diese nicht kaputt ist
	 * @param weapon Bekommt eine Waffe mit definierten Werten übergeben
	 */
	protected void equipWeapon(Waffe weapon) {
		if(weapon.getPCT()>0) {
			weapon.setPlayer(this.sp);
			this.weapon = weapon;
			this.weaponEQ = true;
		}
		else {
			System.out.println("The weapon is broken");
		}
	}
	/**
	 * Greife eine andere Figur an. Schadensberechnung, verteidigen und abziehen der HP findet hier statt
	 * Falls der Gegner Bereits tot ist oder man selbst/der Gegner keine funktionierende Waffe mehr ausgeruestete hat gibt Fehler aus
	 * @param opponent bekommt den Gegner der angegriffen wird, übergeben
	 */
	protected void attack(Figur opponent) {
		if(opponent.checkPlayerAlive() && opponent.getWeaponEQ() && this.weapon.getPCT()>0 && opponent.weapon.getPCT()>0) {
			int dmg = this.weapon.compDMG(this.sp);
			dmg -= opponent.defend(dmg, opponent.getArmor());
			opponent.setHP(dmg);
			this.weapon.setPCT(5);
		}
		else {
			System.out.println("Unable to perform action");
		}
	}
	/**
	 * fuehrt verteidigung aus. Rohen Schaden wird Ruestungswert abgezogen
	 * @param schaden roher schaden den der Gegner erhalten würde
	 * @param ruestung -Wert des Gegners.
	 * @return gibt Schaden zurück den der Gegner erhaelt
	 */
	protected int defend(int schaden,int ruestung) {
		schaden -= rand.nextInt(ruestung+1);
		return schaden;
	}
	/**
	 * Prüft ob die Figur noch am Leben ist und gibt boolean wert zurueck
	 * @return boolean Wert ob Figur am Leben
	 */
	protected boolean checkPlayerAlive() {
		if(this.hp>0)
			return true;
		else
			return false;
		
	}
}
