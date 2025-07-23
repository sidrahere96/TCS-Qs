import java.util.*;

public class numSumString {
    public static int sumOfNumbers(String str) {
        int sum = 0;
        String number = "";

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                number += c;
            } else {
                if (!number.isEmpty()) {
                    sum += Integer.parseInt(number);
                    number = "";
                }
            }
        }

        if (!number.isEmpty()) {
            sum += Integer.parseInt(number);
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println("Sum of numbers: " + sumOfNumbers(input));
    }
}