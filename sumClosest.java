import java.util.Arrays;
import java.util.Scanner;

public class sumClosest {

    public static int threeSumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        int closestSum = arr[0] + arr[1] + arr[2];

        for (int index = 0; index < arr.length - 2; index++) {
            int i = index + 1;
            int j = arr.length - 1;

            while (i < j) {
                int currentSum = arr[index] + arr[i] + arr[j];

                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }

                if (currentSum < target) {
                    i++;
                } else if (currentSum > target) {
                    j--;
                } else {
                    return currentSum;
                }
            }
        }
        return closestSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }   
        System.out.print("Enter target sum:");     
        int target = sc.nextInt();
        System.out.println(threeSumClosest(arr, target));
        sc.close();
    }
}
