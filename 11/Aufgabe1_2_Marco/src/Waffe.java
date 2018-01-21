public class Waffe {

    //Attribute einer Waffe
    private String name;
    private int schadensPunkte;
    private int statusPercent;


    //Konstruktor zum erstellen einer Waffe
    public Waffe(String name, int schadensPunkte) {
        this.name = name;
        this.schadensPunkte = schadensPunkte;
        this.statusPercent = 100;
    }

    //Im Folgenden werden die getter/setter Methoden für eine Waffe erstellt
    public String getName() {
        return this.name;
    }

    public int getSchadensPunkte() {
        return this.schadensPunkte;
    }

    public int getPCT() {
        return this.statusPercent;
    }


    /**
     * Waffe benutzen und Schaden berechnen
     *
     * @param staerkePunkte Stärke Punkte des Trägers
     * @return Schaden, der durch die Waffe verursacht wird
     */
    public int useWeapon(int staerkePunkte) {
        int damage = (int) (staerkePunkte * 0.5) + (int) (Math.random() * this.schadensPunkte + 1);
        this.statusPercent -= 5;

        return damage;
    }

    /**
     * Prüft ob Waffe kaputt ist
     *
     * @return true, wenn die Waffe kaputt ist
     */
    protected boolean isBroken() {
        return this.statusPercent <= 0;
    }
}
