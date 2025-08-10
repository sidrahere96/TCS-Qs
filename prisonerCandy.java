import java.util.Scanner;

public class prisonerCandy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of test cases: ");
        int t = scanner.nextInt();
        int[] lastPrisoner=new int[t];

        for (int i = 0; i < t; i++) {
            System.out.print("FOR CASE "+(i+1)+ " prisoners, candies, and starting chair: ");
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int s = scanner.nextInt();
            lastPrisoner[i]=(s+m-2)%n+1;
        }
        for (int i = 0; i < t; i++){
            System.out.println("FOR CASE "+(i+1)+": "+lastPrisoner[i]);
        }
        scanner.close();
    }
}
