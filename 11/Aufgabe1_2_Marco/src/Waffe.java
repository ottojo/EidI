//package blatt11;
import java.util.Random;

public class Waffe {
	Random rand = new Random();
	//Attribute einer Waffe
	private String name;
	private int dmg;
	private int pct;
	
	
	//Konstruktor zum erstellen einer Waffe
	Waffe(String name, int dmg){
		this.name = name;
		this.dmg = dmg;
		this.pct = 100;
	}
	
	//Im Folgenden werden die getter/setter Methoden für eine Waffe erstellt
	protected String getName() {
		return this.name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected int getDmg() {
		return this.dmg;
	}
	protected void setDmg(int dmg) {
		this.dmg = dmg;
	}
	protected int getPCT() {
		return this.pct;
	}
	protected void setPCT(int n) {
		this.pct-=n;
	}
	
	/**
	 * Berechnet den Schaden den die Figur mit der entsprechende Waffe verursachen kann
	 * @param sp Staerkepunkte des Spielers 
	 * @return gibt Schadenswert zurueck
	 */
	protected int compDMG(int sp) {
		//System.out.println(sp);
		 int dmg = rand.nextInt(this.getDmg())+1;
		 dmg = dmg + (sp/2);
		return dmg;
	}
	/**
	 * Prüft ob Waffe noch nicht kaputt
	 * @return -Wert ob Waffe noch funktional
	 */
	protected boolean checkWeapon() {
		if(this.pct>0)
			return true;
		else
			return false;
	}
}
