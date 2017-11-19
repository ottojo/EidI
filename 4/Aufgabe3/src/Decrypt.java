public class Decrypt {

    public static void main(String[] args) {
        // Eingabe des verschlüsselten Textes
        TextIO.put("Please enter the ciphertext:");
        String ciphertext = TextIO.getlnString();
        // Über alle Rotationen iterieren (93 Möglichkeiten)
        for (int i = 1; i <= 93; i++) {
            TextIO.put("Rot " + i + ": ");
            // Zum Entschlüsseln in negative Richtung rotieren
            // (Siehe Crypto.java)
            TextIO.putln(Crypto.rotate(ciphertext, -i));
        }
    }
}
