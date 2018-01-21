//package blatt11;

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
	private boolean weaponEQ;//boolean Wert ob Waffe getragen wird
	
	
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
		this.hp =hp -  dmg;
		if(this.hp<0)
			this.hp=0;
	}
	/**
	 * Ruestet eine Waffe aus, falls diese nicht kaputt ist
	 * @param weapon Bekommt eine Waffe mit definierten Werten übergeben
	 */
	protected void equipWeapon(Waffe weapon) {
		if(weapon.getPCT()>0) {
			this.weapon = new Waffe(weapon.getName(),weapon.getDmg());
			this.weaponEQ = true;
		}
		else {
			System.out.println("The weapon is broken");
		}
	}
	/**
	 * Greife eine andere Figur an. Schadensberechnung, verteidigen und abziehen der HP findet hier statt
	 * Falls der Gegner bereits tot ist oder man selbst/der Gegner keine funktionierende Waffe mehr ausgeruestete hat gibt Fehler aus
	 * @param opponent ,bekommt den Gegner der angegriffen wird, übergeben
	 */
	protected void attack(Figur opponent) {
		if(opponent.checkPlayerAlive() && opponent.getWeaponEQ() && this.weapon.getPCT()>0 && opponent.weapon.getPCT()>0 &&this.getWeaponEQ()) {
			int dmg = this.weapon.compDMG(this.sp);
			System.out.println("Damage: " + dmg);
			dmg = opponent.defend(dmg, opponent.getArmor());
			if(dmg<0)
				dmg=0;
			opponent.setHP(dmg);
			System.out.println(this.getName()+" dealt " + dmg + " damage");
			this.weapon.setPCT(5);
		}
		else {
			System.out.println("Unable to perform action");
		}
	}
	/**
	 * fuehrt verteidigung aus. Rohen Schaden wird Ruestungswert abgezogen
	 * @param schaden ,roher schaden den der Gegner erhalten würde
	 * @param ruestung -Wert des Gegners.
	 * @return gibt Schaden zurück den der Gegner erhaelt
	 */
	protected int defend(int schaden,int ruestung) {
		int a = rand.nextInt(ruestung+1);
		System.out.println("Rüstung: " + a);
		schaden = schaden - a;
		//System.out.println(schaden);
		if(schaden<0)
			return schaden;
		return schaden;
	}
	/**
	 * Prueft ob die Figur noch am Leben ist und gibt boolean wert zurueck
	 * @return boolean Wert ob Figur am Leben
	 */
	protected boolean checkPlayerAlive() {
		if(this.getHP()>0)
			return true;
		else
			return false;
		
	}
}
