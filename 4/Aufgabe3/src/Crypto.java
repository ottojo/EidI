public class Crypto {

    /**
     * Verschlüsselt einen Eingabetext durch Verschieben der Zeichen im Alphabet
     *
     * @param s   Eingabetext
     * @param rot Verschiebung
     * @return Verschlüsselter Text
     */
    public static String rotate(String s, int rot) {
        String result = "";

        //Iterieren über jedes Zeichen
        for (char c : s.toCharArray()) {
            // ResultCode ist der resultierende ASCII code:
            // Da der Bereich nicht bei 0 beginnt, wird erst 32 subtrahiert und später addiert
            // Modulo, da der Bereich sonst überschritten werden könnte.
            int resultCode = mod((c - 32) + rot, 93) + 32;
            result += Character.toString((char) resultCode);
        }
        return result;
    }

    /**
     * Berechnet den Modulo zweier Zahlen
     *
     * @return n modulo m
     */
    private static int mod(int n, int m) {
        // i ist der Rest von n/m
        int i = n % m;
        // Wenn i >= 0 ist i der Modulo
        // Sonst: Addiere m, um negative Ergebnisse zu vermeiden
        return (i >= 0) ? i : i + m;
    }
}
