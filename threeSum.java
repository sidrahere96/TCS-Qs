import java.util.*;

class threeSum {
    public static int[] process(int arr[], int n) {
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == 0) {
                    return new int[]{arr[i], arr[left], arr[right]};
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = process(arr, n);
        System.out.println(Arrays.toString(ans));
        sc.close();
    }
}
