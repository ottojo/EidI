public class StringPrefix {

    public static void main(String[] args) {
        String[] testData = {"Haus", "Haustür", "Haube", "Hand"};
        System.out.println(prefixOfArray(testData));
    }

    /**
     * Findet den größten gemeinsamen Präfix aller Strings in einem Array
     *
     * @param strings Eingabearray
     * @return Größter gemeinsamer Präfix
     */
    private static String prefixOfArray(String[] strings) {
        if (strings.length > 2) {
            // String Array in zwei kleinere Arrays zerlegen
            // "Divide"
            String[] leftHalf = new String[strings.length / 2];
            int i = 0;
            for (; i < strings.length / 2; i++) {
                leftHalf[i] = strings[i];
            }

            String[] rightHalf = new String[strings.length - i];
            for (; i < strings.length; i++) {
                rightHalf[i - leftHalf.length] = strings[i];
            }

            // Präfixe der beiden Hälften finden,
            // Gemeinsamen Präfix zurückgeben
            return prefix(prefixOfArray(leftHalf), prefixOfArray(rightHalf));
        }
        if (strings.length == 2) {
            // Weiteres Teilen unnötig
            // "Conquer"
            return prefix(strings[0], strings[1]);
        } else if (strings.length == 1) {
            // Wird bei ungerader Anzahl an Ausgangsstrings getroffen
            return strings[0];
        }
        return "";
    }

    /**
     * Findet den größten gemeinsamen Präfix zweier Strings
     *
     * @return Größter gemeinsamer Präfix
     */
    private static String prefix(String s1, String s2) {
        String pref = "";
        for (int i = 0; i < s1.length() && i < s2.length(); i++) {
            if (s1.toCharArray()[i] == s2.toCharArray()[i]) {
                pref += s1.toCharArray()[i];
            } else {
                return pref;
            }
        }
        return pref;
    }

}
