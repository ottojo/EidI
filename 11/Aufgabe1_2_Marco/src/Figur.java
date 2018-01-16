

import java.util.Random;

public class Figur {
	Random rand = new Random();
	
	private String name;
	private String rasse;
	private int hp; //healthpoints
	private int sp; //strengthpoints
	private int armor;
	
	private Waffe weapon;
	private boolean weaponEQ;
	
	
	//Konstruktor für eine vollständige Figur
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
	protected void setHP(int dmg) {
		this.hp -= dmg;
	}
	
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
	
	protected void attack(Figur opponent) {
		if(opponent.getHP()>0 && opponent.getWeaponEQ()) {
			int dmg = this.weapon.getDmg();
			dmg -= rand.nextInt(opponent.getArmor()+1);
			opponent.setHP(dmg);
		}
		else {
			System.out.println("The opponent is already dead");
		}
	}
	
	protected boolean checkPlayerAlive() {
		if(this.hp>0)
			return true;
		else
			return false;
		
	}
}
