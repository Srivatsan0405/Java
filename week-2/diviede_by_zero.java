public class diviede_by_zero {
    public static void main(String[] args) {
        int a=24;
        int b=0;
        int div=0;
        try {
            div=a/b;
            
        } catch (Exception e) {
            System.out.println("Error: Division by zero is not allowed.");
            // e.printStackTrace(); // Optional: Print the stack trace for debugging
        } finally {
            System.out.println("The value of div is: " + div);
        }
    }
}
