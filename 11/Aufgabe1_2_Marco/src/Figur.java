public class Figur {
    // Attribute einer Figur
    private String name;
    private String rasse;
    private int lebensPunkte;
    private int staerkePunkte;
    private int ruestungsPunkte;

    // Figur kann eine Waffe tragen, null wenn keine Waffe getragen wird
    private Waffe waffe;


    //Konstruktor für eine vollstaendige Figur
    public Figur(String name, String rasse, int lebensPunkte, int staerkePunkte, int ruestungsPunkte) {
        this.name = name;
        this.rasse = rasse;
        this.lebensPunkte = lebensPunkte;
        this.staerkePunkte = staerkePunkte;
        this.ruestungsPunkte = ruestungsPunkte;
        this.waffe = null;
    }

    //Im Folgenden werden die getter/setter Methoden erstellt
    public String getName() {
        return this.name;
    }

    public String getRasse() {
        return this.rasse;
    }

    public int getLebensPunkte() {
        return this.lebensPunkte;
    }

    public int getStaerkePunkte() {
        return this.staerkePunkte;
    }

    public int getRuestungsPunkte() {
        return this.ruestungsPunkte;
    }

    public Waffe getWaffe() {
        return this.waffe;
    }

    /**
     * Ruestet eine Waffe aus, falls diese nicht kaputt ist
     *
     * @param waffe Bekommt eine Waffe mit definierten Werten übergeben
     */
    public void waffeAusruesten(Waffe waffe) {
        if (waffe.getPCT() > 0) {
            this.waffe = waffe;
        } else {
            System.out.println("The waffe is broken");
        }
    }

    /**
     * Greife eine andere Figur an.
     *
     * @param opponent bekommt den Gegner der angegriffen wird, übergeben
     */
    public void angreifen(Figur opponent) {
        if (opponent.isAlive() && this.waffe != null && !this.waffe.isBroken()) {

            opponent.verteidigen(this.waffe.useWeapon(this.staerkePunkte));
        } else {
            System.out.println("Unable to perform action");
        }
    }

    /**
     * Verteidigt einkommenden Schaden
     *
     * @param schaden Zugefügter Schaden
     */
    private void verteidigen(int schaden) {
        this.lebensPunkte -= Math.random() * (this.ruestungsPunkte + 1);
        if (this.lebensPunkte < 0) {
            this.lebensPunkte = 0;
        }
    }

    /**
     * Prüft ob die Figur noch am Leben ist und gibt boolean wert zurueck
     *
     * @return true, wenn Figur lebt
     */
    protected boolean isAlive() {
        return this.lebensPunkte > 0;
    }
}
