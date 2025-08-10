import java.util.Arrays;
import java.util.Scanner;

public class multipleof10InSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();
        if(n<1 || n>1000){
            System.out.println("INVALID ARRAY SIZE!");
            return;
        }
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Original Array: " + Arrays.toString(arr));
        rearrangeArray(arr);
        System.out.println("Modified Array: " + Arrays.toString(arr));
    }
    public static void rearrangeArray(int[] arr) {
        int n = arr.length;
        int position = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 10 != 0) {
                int temp = arr[i];
                int j = i;
                while (j > position) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[position] = temp;
                position++;
            }
        }
    }
}