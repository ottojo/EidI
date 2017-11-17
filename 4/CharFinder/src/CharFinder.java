public class CharFinder {

    public static void main(String[] args) {
        TextIO.putln("Please enter a sentence:");
        String sentence = TextIO.getlnString();

        TextIO.putln("Please enter a character:");
        char character = TextIO.getChar();

        String positions = "";

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == character)
                positions += "+";
            else
                positions += " ";
        }

        TextIO.putln(sentence);
        TextIO.putln(positions);
    }
}
