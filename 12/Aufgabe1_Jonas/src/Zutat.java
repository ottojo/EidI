public class Zutat {
    private Rohzutat rohzutat;
    private String modifier;
    private int mengeGramm;

    public Zutat(Rohzutat rohzutat, String modifier, int mengeGramm) {
        this.rohzutat = rohzutat;
        this.modifier = modifier;
        this.mengeGramm = mengeGramm;
    }

    /**
     * Berechnet den Preis der Zutat inklusive 30% Marge
     *
     * @return Preis * 1.3 in Cents
     */
    public int getPrice() {
        return (int) ((mengeGramm / 1000.0) * rohzutat.getPreisProKiloCents() * 1.3);
    }

    @Override
    public String toString() {
        return modifier == null || modifier.equals("") ? rohzutat.toString() : modifier + " " + rohzutat.toString();
    }

    public Rohzutat getRohzutat() {
        return rohzutat;
    }

    public String getModifier() {
        return modifier;
    }

    public int getMengeGramm() {
        return mengeGramm;
    }
}
