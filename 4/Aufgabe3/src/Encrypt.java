public class Encrypt {

    public static void main(String[] args) {
        // Eingabe des Textes und der Rotation
        TextIO.put("Please enter the cleartext: ");
        String ciphertext = TextIO.getlnString();
        TextIO.put("Please enter the rotation: ");
        int rot = TextIO.getInt();
        TextIO.put("Rot " + rot + ": ");
        // Ausgabe des verschlüsselten Textes
        // (Siehe Crypti.java)
        TextIO.putln(Crypto.rotate(ciphertext, rot));
    }
}
