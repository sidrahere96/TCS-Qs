import java.util.Scanner;

public class stringC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string A: ");
        String a = sc.nextLine();

        System.out.print("Enter string B: ");
        String b = sc.nextLine();
        boolean[] bElements = new boolean[256];
        for (int i = 0; i < b.length(); i++) {
            bElements[b.charAt(i)] = true;
        }
        String c=" ";
        for (int i = 0; i < a.length(); i++) {
            if (!bElements[a.charAt(i)]) {
                c=c+ a.charAt(i);
            }
        }

        System.out.println("String C: " + c);
    }
}