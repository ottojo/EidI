
import java.util.Random;

public class Waffe {
	Random rand = new Random();
	
	private String name;
	private int dmg;
	private int pct;
	
	private int playerSP;
	
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
	protected int getDmg() {
		return this.dmg;
	}
	protected int getPCT() {
		return this.pct;
	}
	protected void setPCT(int n) {
		this.pct-=n;
	}
	protected void setPlayer(int x) {
		this.playerSP = x;
	}
	
	protected int compPCT(int sp) {
		 int dmg = rand.nextInt(sp)+1;
		 dmg += (this.playerSP)/2;
		
		this.pct-=5;
		return dmg;
	}
	
	protected boolean checkWeapon() {
		if(this.pct>0)
			return true;
		else
			return false;
	}
}
