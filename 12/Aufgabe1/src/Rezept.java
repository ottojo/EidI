public class Rezept {
    private String name;

    private Zutat[] zutaten;

    public Rezept(String name, Zutat[] zutaten) {
        this.name = name;
        this.zutaten = zutaten;
    }

    @Override
    public String toString() {
        String zutatenString = "";
        if (zutaten != null && zutaten.length > 0) {
            zutatenString = " (";
            for (Zutat z : this.zutaten) {
                zutatenString += z.toString() + ", ";
            }

            zutatenString = zutatenString.substring(0, zutatenString.length() - 2) + ")";
        }

        return name + zutatenString;
    }

    /**
     * Berechnet den Preis des Rezeptes
     *
     * @return Preis des Rezeptes in Cent
     */
    public int getPrice() {
        int total = 0;
        for (Zutat z : this.zutaten) {
            total += z.getPrice();
        }
        return total;
    }

    public String getName() {
        return name;
    }

    public Zutat[] getZutaten() {
        return zutaten;
    }
}
