import java.util.Scanner;

public class zigZag {

    public static void printZigzag(String s, int numRows) {
        if (numRows <= 0 || s == null || s.isEmpty()) {
            System.out.println(" ");
            return;
        }

        if (numRows == 1 || s.length() <= numRows) {
            System.out.println(s);
            return;
        }

        int len = s.length();
        int cycleLen = 2 * numRows - 2;
        int numCols = (len / cycleLen + 1) * (numRows - 1);
        char[][] zigzag = new char[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                zigzag[i][j] = ' ';
            }
        }

        int row = 0, col = 0;
        boolean goingDown = true;

        for (int i = 0; i < len; i++) {
            zigzag[row][col] = s.charAt(i);

            if (goingDown) {
                if (row < numRows - 1) {
                    row++;
                } else {
                    row--;
                    col++;
                    goingDown = false;
                }
            } else {
                if (row > 0) {
                    row--;
                    col++;
                } else {
                    row++;
                    goingDown = true;
                }
            }
        }

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(" "+zigzag[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        System.out.println("\nZigzag Pattern:");
        printZigzag(input, numRows);
    }
}
