
import java.util.Scanner;

class factorial {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        int result = fact(n);

        System.out.println("Factorial of " + n + " is: " + result);
        ip.close();

    }

    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
}