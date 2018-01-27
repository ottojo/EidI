import java.util.Locale;

public class Menu {
    private String name;

    private Rezept vorspeise;
    private Rezept hauptgericht;
    private Rezept[] beilagen;
    private Rezept dessert;

    public Menu(String name, Rezept vorspeise, Rezept hauptgericht, Rezept[] beilagen, Rezept dessert) {
        this.name = name;
        this.vorspeise = vorspeise;
        this.hauptgericht = hauptgericht;
        this.beilagen = beilagen;
        this.dessert = dessert;
    }

    public int getPrice() {
        int total = 0;
        total += this.vorspeise.getPrice()
                + this.hauptgericht.getPrice()
                + this.dessert.getPrice();
        for (Rezept beilage : this.beilagen) {
            total += beilage.getPrice();
        }

        return total;
    }

    @Override
    public String toString() {
        String result = "Menu A:\n";
        result += "––––––––––––––––––––-\n";
        result += "Starter: " + this.vorspeise.toString() + " (" + formatPriceCents(this.vorspeise.getPrice()) + ")\n";
        result += "Main Dish: " + this.hauptgericht.toString();
        if (this.beilagen != null && this.beilagen.length > 0) {
            result += " served with: ";
            for (Rezept beilage : this.beilagen) {
                result += beilage.toString() + ", ";
            }
            result = result.substring(0, result.length() - 2);
        }
        result += "(" + formatPriceCents(this.getHauptgerichtTotalPrice()) + ")\n";
        result += "Dessert: " + this.dessert.toString() + " (" + formatPriceCents(this.dessert.getPrice()) + ")\n";
        result += "––––––––––––––––––––-\n";
        result += "Total: " + formatPriceCents(this.getPrice()) + "\n";

        return result;
    }

    private int getHauptgerichtTotalPrice() {
        int total = this.hauptgericht.getPrice();
        for (Rezept beilage : this.beilagen) {
            total += beilage.getPrice();
        }
        return total;
    }

    private String formatPriceCents(int price) {
        return String.format(Locale.ROOT, "%.2f€", price / 100.0);
    }

    public String getName() {
        return name;
    }

    public Rezept getVorspeise() {
        return vorspeise;
    }

    public Rezept getHauptgericht() {
        return hauptgericht;
    }

    public Rezept[] getBeilagen() {
        return beilagen;
    }

    public Rezept getDessert() {
        return dessert;
    }
}
