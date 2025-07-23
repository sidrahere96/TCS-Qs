import java.util.*;

public class nthlargest {
    public static int findNthLargest(int[] scores, int n) {
        TreeSet<Integer> uniqueScores = new TreeSet<>();
        for (int score : scores) {
            uniqueScores.add(score);
        }
        System.out.println("Unique scores in ascending order: " + uniqueScores);
        List<Integer> descending = new ArrayList<>(uniqueScores.descendingSet());

        if (n <= descending.size()) {
            return descending.get(n - 1);
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of scores: ");
        int size = scanner.nextInt();
        int[] scores = new int[size];
        System.out.println("Enter the scores:");
        for (int i = 0; i < size; i++) {
            scores[i] = scanner.nextInt();
        }
        System.out.println("Scores entered: " + Arrays.toString(scores));
        System.out.print("Enter n to find the nth largest unique score: ");
        int n = scanner.nextInt();
        int result = findNthLargest(scores, n);
        if (result != -1) {
            System.out.println("The " + n + "th largest unique score is: " + result);
        } else {
            System.out.println("There are fewer than " + n + " unique scores.");
        }
        scanner.close();
    }
}
