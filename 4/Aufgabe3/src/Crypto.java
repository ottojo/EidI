public class Crypto {

    public static String rotate(String s, int rot) {
        String result = "";
        for (char c : s.toCharArray()) {
            int resultCode = mod((c - 32) + rot, 93) + 32;
            result += Character.toString((char) resultCode);
        }
        return result;
    }

    /**
     * Calculates modulo of two numbers
     *
     * @return n modulo m
     */
    private static int mod(int n, int m) {
        // i is the remainder of n/m
        int i = n % m;
        // if i>=0, the remainder equals the modulus
        // else, add m to i
        i = (i >= 0) ? i : i + m;
        return i;
    }
}
