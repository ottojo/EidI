public class Encrypt {

    public static void main(String[] args) {
        TextIO.put("Please enter the cleartext: ");
        String ciphertext = TextIO.getlnString();
        TextIO.put("Please enter the rotation: ");
        int rot = TextIO.getInt();
        TextIO.put("Rot " + rot + ": ");
        //Rotate in positive direction to encrypt
        TextIO.putln(Crypto.rotate(ciphertext, rot));
    }
}