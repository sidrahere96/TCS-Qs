import java.util.*;

public class carRent {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("ENTER THE COST FOR 1st n HOURS: ");
            int R1 = sc.nextInt();
            System.out.print("Enter Number of hours charged at R1 rate: ");
            int N = sc.nextInt();
            System.out.print("ENTER THE COST FOR next n HOURS: ");
            int R2 = sc.nextInt();
            System.out.print("ENTER TOTAL TIME(in min): ");
            int totalTime = sc.nextInt();
            
            int totalHours = (int) Math.ceil(totalTime / 60.0);

            int cost;
            if (totalHours <= N) {
                cost = totalHours * R1;
            } else {
                cost = N * R1 + (totalHours - N) * R2;
            }
            
            System.out.println("Total cost: " + cost);
        }
    }
}
