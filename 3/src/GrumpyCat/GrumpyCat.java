package GrumpyCat;

public class GrumpyCat {

    public static void main(String[] args) {
        // Iteriere über alle Zahlen von 1 bis 100
        for (int i = 1; i <= 100; i++) {
            String output = "";
            // Prüfen ob die Zahl durch 3 teilbar ist
            if (i % 3 == 0)
                output += "grumpy";
            // Prüfen ob die Zahl durch 5 teilbar ist
            if (i % 5 == 0)
                output += "cat";
            // Wenn die Zahl weder durch 3 oder 5 teilbar ist soll die Zahl ausgegeben werden
            if (output.equals(""))
                output += i;
            //Ausgabe des Ergebnisses
            System.out.println(output);
        }
    }
}
