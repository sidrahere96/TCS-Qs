import java.util.Scanner;

public class longestwork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A STRING: ");
        String str = sc.nextLine();
        sc.close();

        int[] lastIndex = new int[256];
        for (int i = 0; i < 256; i++) {
            lastIndex[i] = -1; 
        }

        int left = 0, maxLen = 0;

        for (int right = 0; right < str.length(); right++) {
            char ch = str.charAt(right);

            if (lastIndex[ch] >= left) {
                left = lastIndex[ch] + 1;
            }

            lastIndex[ch] = right;
            maxLen = Math.max(maxLen, right - left + 1);
        }

        System.out.println("Length of longest substring without repeating characters: " + maxLen);
    }
}
