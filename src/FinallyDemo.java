import java.util.Scanner;

public class FinallyDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Format: Two integers
        // We assume valid integer input based on the prompt description.
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            try {
                // Attempting division inside try block
                int result = a / b;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                // Handling division by zero
                // e.getMessage() usually returns "/ by zero" for integer division
                System.out.println("Error: " + e.getMessage());
            } finally {
                // This block executes regardless of exception occurrence
                System.out.println("Finally block executed");
            }
        }
        
        scanner.close();
    }
}
