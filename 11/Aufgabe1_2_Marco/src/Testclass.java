//package blatt11;

public class Testclass {
    public static void main(String[] args) {
        //Erstellt zwei Figuren und zwei Waffen mit gegebenen Eigenschaften
        Figur Marco = new Figur("Marco", "Mensch", 85, 12, 10);
        Figur Ork = new Figur("Ork", "Ork", 50, 14, 6);

        Waffe schwert = new Waffe("Maechtiges Schwert", 15);
        Waffe axt = new Waffe("Große Axt", 7);

        //System.out.println(Ork.getArmor());
        Marco.waffeAusruesten(schwert);
        Ork.waffeAusruesten(axt);

        //Figuren kaempfen solange gegeneinander bis eine Tod ist oder die Waffe einer Figur kaputt ist
        while (Marco.isAlive() && Ork.isAlive() && !Marco.getWaffe().isBroken() && !Ork.getWaffe().isBroken()) {
            Marco.angreifen(Ork);
            System.out.println("Marcos HP: " + Marco.getLebensPunkte() + "			 Marcos Waffenabnutzung: " + Marco.getWaffe().getPCT());
            System.out.println("Orks HP: " + Ork.getLebensPunkte() + " 		Orks Waffenabnutzung: " + Ork.getWaffe().getPCT());
            System.out.println();
            if (Marco.isAlive() && Ork.isAlive() && !Marco.getWaffe().isBroken() && !Ork.getWaffe().isBroken()) {
                Ork.angreifen(Marco);
                System.out.println("Marcos HP: " + Marco.getLebensPunkte() + " 		Marcos Waffenabnutzung: " + Marco.getWaffe().getPCT());
                System.out.println("Orks HP: " + Ork.getLebensPunkte() + " 		Orks Waffenabnutzung: " + Ork.getWaffe().getPCT());
                System.out.println();
            }

        }
        //Ausgabe welche Figur gestorben ist
        if (!Marco.isAlive())
            System.out.println("Marco ist tod");
        if (!Ork.isAlive())
            System.out.println("Ork ist tod");
    }
}
