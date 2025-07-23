//PROBLEM STATEMENT:
    //Two positive numbers as input(m<n;0<m<999 ;1<n<=999)
    //Print numbers from m to n in increasing order such that the 
    //numbers has leading zeroes to match width of n
// Example: if m=5 and n=12, output should be 05, 06, 07, 08, 09, 10, 11, 12
import java.util.Scanner;

public class mTon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("m: ");
        int m = scanner.nextInt();
        System.out.print("n: ");
        int n = scanner.nextInt();

        // input can be taken from user as well
        int width = 3; //as per qs 

        for (int i = m; i <= n; i++) {
            System.out.println(String.format("%0" + width + "d", i));
        }

        scanner.close();
    }
}
