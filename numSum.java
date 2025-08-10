import java.util.Scanner;

public class numSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER: ");
        String input = sc.nextLine();
        int len = input.length();

        System.out.print("OUTPUT: ");
        for (int i = 0; i < len; i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                int digit = Character.getNumericValue(c);
                int complement = 9 - digit;
                System.out.print(complement);
            } else {
                System.out.println("\nINVALID INPUT!");
                sc.close();
                return;
            }
        }

        sc.close();
    }
}
