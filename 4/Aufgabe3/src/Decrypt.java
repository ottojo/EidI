public class Decrypt {

    public static void main(String[] args) {
        TextIO.put("Please enter the ciphertext:");
        String ciphertext = TextIO.getlnString();
        for (int i = 1; i <= 93; i++) {
            TextIO.put("Rot " + i + ": ");
            TextIO.putln(Crypto.rotate(ciphertext, -i));
        }
    }


}
