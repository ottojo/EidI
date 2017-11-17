public class Print10 {
    public static void main(String[] args) {

        int width = TextIO.getInt();
        int height = TextIO.getInt();

        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
                System.out.print(Character.toChars(0x2571 + (int) (Math.random() * 2)));
            }
            System.out.println();
        }
    }
}
