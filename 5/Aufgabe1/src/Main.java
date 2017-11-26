public class Main {

    public static void main(String[] args) {
        int[] array1 = {1, 12, 41};
        print42Sums(array1);
        int[] array2 = {1, 2, 3, 42};
        print42Sums(array2);
        int[] array3 = {1, 2, 3, 4, 5, 30, 12};
        print42Sums(array3);

    }

    public static void print42Sums(int[] inputArray) {
        // Iteriere über Elemente des Arrays
        for (int i = 0; i < inputArray.length; i++) {
            // Iteriere über verbleibende Elemente
            for (int b = i; b < inputArray.length; b++) {
                // Teste ob die Summe der Elemente 42 ergibt
                if (i != b && inputArray[i] + inputArray[b] == 42)
                    System.out.println(inputArray[i] + "+" + inputArray[b] + "= 42");
            }
        }
    }
}
