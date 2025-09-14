import java.util.*;

public class maxLitre {
    public static int ans(int[] height) {
        int left = 0, right = height.length - 1;
        int ans = 0;
        while (left < right) {
            int area = (right - left) * Math.min(height[left], height[right]);
            ans = Math.max(ans, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines:");
        int n = sc.nextInt();
        int[] height = new int[n];
        System.out.println("Enter height of each lines:");
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }
        System.out.println(ans(height));
        sc.close();
    }
}
