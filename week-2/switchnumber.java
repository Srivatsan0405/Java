import java.util.Scanner;

public class switchnumber {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner ip= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = ip.nextInt();   
        System.out.println(name(n));
        ip.close();

        }
    
        public static String name(int n) {
            String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine."};
            String[] arr2 = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
            String[] arr3 = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
            if (n < 10) {
                return arr[n];
            } else if (n < 20) {
                return arr2[n - 10];
            } else if (n < 100) {
                return arr3[n / 10 - 2] + " " + arr[n % 10];
            } else if (n < 1000) {
                return arr[n / 100] + " hundred " + name(n % 100);
            } else {
                return "Number out of range";
            }
        
         // Call the function and print the result


    }
    
}
