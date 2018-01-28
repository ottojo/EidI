public class Rohzutat {
    private String name;

    private int preisProKiloCents;

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
