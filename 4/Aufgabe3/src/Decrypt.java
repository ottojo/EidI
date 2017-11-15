public class Decrypt {

    public static void main(String[] args) {
        TextIO.put("Please enter the ciphertext:");
        String ciphertext = TextIO.getlnString();
        //Iterate over all possible rotations (93 is alphabet length)
        for (int i = 1; i <= 93; i++) {
            TextIO.put("Rot " + i + ": ");
            //Rotate in negative direction to decrypt
            TextIO.putln(Crypto.rotate(ciphertext, -i));
        }
    }
}
