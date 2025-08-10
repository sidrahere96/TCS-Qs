import java.util.Scanner;

public class minNoFreq {

    public static int digitFrequencyDominator(String s) {
        if (s == null || s.isEmpty()) {
            return -1;
        }

        int[] freq = new int[10];
        int maxFreq = 0;

        for (char ch : s.toCharArray()) {
            int digit = ch - '0';
            freq[digit]++;
            if (freq[digit] > maxFreq) {
                maxFreq = freq[digit];
            }
        }

        for (int i = 0; i < 10; i++) {
            if (freq[i] == maxFreq) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string of digits: ");
        String input = scanner.nextLine().trim();
        int result = digitFrequencyDominator(input);
        System.out.println("Output: " + result);
        scanner.close();
    }
}
