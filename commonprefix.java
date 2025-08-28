import java.util.*;

public class commonprefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int i = 0;
        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }
        return first.substring(0, i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num:");
        int n = sc.nextInt();
        sc.nextLine();
        String[] strs = new String[n];
        System.out.print("Enter strings:");
        for (int i = 0; i < n; i++) {
            strs[i] = sc.nextLine().trim();
        }
        String result = longestCommonPrefix(strs);
        System.out.print("OUTPUT:\t");
        if (result.isEmpty()) {
            System.out.println("(empty string)");
        } else {
            System.out.println(result);
        }
    }
}
