public class Rohzutat {
    private int preisProKiloCents;
    private String name;

    public Rohzutat(String name, int preisProKiloCents) {
        this.preisProKiloCents = preisProKiloCents;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public int getPreisProKiloCents() {
        return preisProKiloCents;
    }

    public String getName() {
        return name;
    }
}
