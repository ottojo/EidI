public class Crypto {
    public static String rotate(String s, int rot) {
        String result = "";
        for (char c : s.toCharArray()) {
            int resultCode = mod((c - 32) + rot, 93) + 32;
            result += Character.toString((char) resultCode);
        }
        return result;
    }

    //TODO Document properly
    /**
     * returns the positive mod
     */
    private static int mod(int n, int m) {

        return (((n % m) + m) % m);
    }
}
