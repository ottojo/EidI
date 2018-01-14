import java.util.Arrays;

public class Sudoku {

    //Zeile, Spalte
    private static int[][] sudoku = new int[9][9];

    public static void main(String[] args) {
        fillSudokuFrom(0, 0);
        printSudoku(sudoku);
        System.out.printf("Is valid: %b\n", isValid(sudoku));
    }

    private static void fillSudokuFrom(int row, int column) {
        // Test if startpoint is in sudoku (otherwise just return)
        if (row < sudoku.length && column < sudoku[row].length) {

            // If field was already filled, continue from there
            int i = sudoku[row][column] + 1;
            for (; i < 10; i++) {
                sudoku[row][column] = i;
                System.out.printf("Trying %d at Row %d Column %d\n", i, row, column);
                if (isValid(sudoku)) {
                    // Valid solution for field has been found
                    System.out.printf("Putting %d at Row %d Column %d\n", i, row, column);

                    // Continue to next field
                    int nextRow = column >= 8 ? row + 1 : row;
                    int nextColumn = (column + 1) % 9;
                    fillSudokuFrom(nextRow, nextColumn);
                    break;
                }
            }
            if (i >= 10) {
                // No number has been found for current field
                // Discard current field
                sudoku[row][column] = 0;

                // Go to previous field
                int previousRow = column == 0 ? row - 1 : row;
                int previousColumn = column == 0 ? 8 : column - 1;
                fillSudokuFrom(previousRow, previousColumn);
            }
        }
    }

    /**
     * Checks if the sudoku is valid
     * 0 equals not filled, will be ignored
     *
     * @param sudoku input sudoku
     * @return true if sudoku is valid
     */
    private static boolean isValid(int[][] sudoku) {
        //Zeilen
        for (int[] zeile : sudoku) {
            if (containsDuplicate(zeile))
                return false;
        }
        //Spalten
        int[][] spalten = new int[9][9];
        // Umsortieren zu Spalte,Zeile
        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 9; x++) {
                spalten[y][x] = sudoku[x][y];
            }
        }
        for (int[] spalte : spalten) {
            if (containsDuplicate(spalte))
                return false;
        }

        //3x3
        // Über 3x3 Blöcke iterieren
        for (int blockBeginRow = 0; blockBeginRow < 9; blockBeginRow += 3) {
            for (int blockBeginColumn = 0; blockBeginColumn < 9; blockBeginColumn += 3) {
                int[] block = new int[9];
                // Iterate over numbers in current Block
                for (int i = 0; i < 9; i++) {
                    block[i] = sudoku[blockBeginRow + (i / 3)][blockBeginColumn + i % 3];
                }
                if (containsDuplicate(block))
                    return false;
            }
        }

        return true;
    }

    /**
     * Checks if the array contains duplicates, while ignoring 0 or negative numbers
     *
     * @param input Array of integers
     * @return true of the array contains duplicate positive numbers
     */
    private static boolean containsDuplicate(int[] input) {
        int[] count = new int[9]; // How often index+1 appears
        for (int value : input) {
            if (value > 0) {
                count[value - 1]++;
            }
            for (int c : count) {
                if (c > 1) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Prints a sudoku to stdout
     */
    private static void printSudoku(int[][] sudoku) {
        if (sudoku.length != 9 || sudoku[0].length != 9) {
            System.out.printf("Invalid sudoku: %s", Arrays.toString(sudoku));
            return;
        }
        for (int[] row : sudoku) {
            for (int value : row) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
