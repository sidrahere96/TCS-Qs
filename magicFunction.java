import java.util.*;

public class magicFunction {
    public static int magicFunction(int n, int x) {
        int output = 0;
        if (n < 0 || x < 0) return output;
        int multiplier = 1;
        while (n != 0) {
            int digit = n % 10;
            int new_digit = (digit + x) % 10;
            output = new_digit * multiplier + output;
            multiplier *= 10;
            n /= 10;
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();
        System.out.print("x: ");
        int x = scanner.nextInt();
        System.out.println(magicFunction(n, x));
    }
}
