public class Print10 {

    public static void main(String[] args) {
        //Eingabe der Breite und Höhe
        TextIO.put("Breite: ");
        int width = TextIO.getInt();
        TextIO.put("Höhe: ");
        int height = TextIO.getInt();

        //Iteriere über Zeilen
        for (int h = 0; h < height; h++) {
            //Iteriere über Spalten
            for (int w = 0; w < width; w++) {
                // Ausgabe von U+2571 + Zufallszahl: 0 oder 1
                // (U+2571 oder U+2572)
                System.out.print(Character.toChars(0x2571 + (int) (Math.random() * 2)));
            }
            //Wenn über alle Spalten iteriert: neue Zeile
            System.out.println();
        }
    }
}
