public class BraceChecker {

    public static void main(String[] args) {
        System.out.println(checkBraces("((()())())"));
        System.out.println(checkBraces("(())())"));
        System.out.print(checkBraces(")))((("));
    }

    /**
     * Überprüft, ob Klammern korrekt gesetzt sind
     *
     * @param input Zu überprüfender String
     * @return true, wenn Klammern korrekt gesetzt sind
     */
    public static boolean checkBraces(String input) {
        // Zählvariable
        int braceCounter = 0;

        // Iteriere über Zeichen im String
        for (char c : input.toCharArray()) {

            // Fallunterscheidung: öffnende Klammer, schließende Klammer
            switch (c) {
                case '(':
                    // Bei öffnender Klammer: Zähler um 1 erhöhen
                    braceCounter++;
                    break;
                case ')':
                    // Bei schließender Klammer: Zähler um 1 verringern
                    braceCounter--;
                    break;
            }

            if (braceCounter < 0)
                // Nicht alle schließenden Klammern wurden schon geöffnet
                return false;
        }
        // Wenn Zähler = 0 ist, ist die Anzahl an öffnenden und schließenden Klammern gleich
        return braceCounter == 0;
    }
}
